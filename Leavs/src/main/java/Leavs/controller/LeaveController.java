package Leavs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Leavs.email.EmailService;
import Leavs.email.EmailService3;
import Leavs.entity.ApplyLeave;
import Leavs.entity.User;
import Leavs.service.LeaveApplyService;
import Leavs.service.LeaveService;

@RestController
@RequestMapping("/api/leaves")
public class LeaveController {
	@Autowired
	private EmailService emailservice;

	
	@Autowired
	private LeaveService leaveService;
	
	@Autowired 
	private LeaveApplyService leaveapplyservice;
	
	@PostMapping("/apply")
	public ResponseEntity<ApplyLeave> applyLeave(@RequestBody ApplyLeave applyleave)
	{
		boolean flag = false;
		User user=new User();
		String to = user.getUser_email();
		String subject = "Leave Application Submitted.";
		String body = "Your leave application has been submitted successfully.";
		emailservice.sendEmail(to, subject, body);
		ApplyLeave appliedLeave = leaveService.leave(applyleave);
		EmailService3.leaverequest(applyleave.getFrom_date(), applyleave.getTo_date(), applyleave.getDetails(), applyleave.getStatus(), applyleave.getRequested_by(), applyleave.getApproved_by());
		return ResponseEntity.ok(appliedLeave);
		
	}
	
	
	@PutMapping("/approve/{leave_id}")
	public ResponseEntity<ApplyLeave> approveLeave(@PathVariable(name = "leave_id") int  leave_id)
	{
		ApplyLeave approvedLeave = leaveapplyservice.approveLeave(leave_id);
		
		if(approvedLeave != null)
		{
			return ResponseEntity.ok(approvedLeave);
		}
		else
		{
			 return ResponseEntity.notFound().build();
		}
		//return null;
		
	}
	
	
	@PutMapping("/reject/{leave_id}")
	public ResponseEntity<ApplyLeave> rejectLeave(@PathVariable("leave_id") int leave_id)
	{
		ApplyLeave  rejectLeave = leaveapplyservice.rejectLeave(leave_id);
		if(rejectLeave != null)
		{
			return ResponseEntity.ok(rejectLeave);
		}
		else
		{
			return ResponseEntity.notFound().build();
		}	
	}
	
	
}
