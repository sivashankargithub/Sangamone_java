package com.sangamone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.entity.LeaveApplyEntity;
import com.sangamone.entity.LeaveUserEntity;
import com.sangamone.service.EmailService;
import com.sangamone.service.LeaveApplyService;
import com.sangamone.service.LeaveApplyService2;
import com.sendgrid.Response;
//import com.sangamone.service.LeaveApproveService;

@RestController
@RequestMapping("/api/leaves")
public class LeaveApplyController {
	@Autowired
	EmailService emailService;
	
	@Autowired
	private LeaveApplyService leaveApplyService;
	
	@Autowired
	private LeaveApplyService2 leaveService2;
	//@Autowired
	//private LeaveApproveService LeaveApprovedService;
	
	@PostMapping("apply")
	public ResponseEntity<String> applyLeave(@RequestBody LeaveApplyEntity leaveApplyEntity){
		
		leaveApplyEntity = leaveApplyService.leaveApply(leaveApplyEntity);
		
		Response response = emailService.sendMail(leaveApplyEntity);
		if(response.getStatusCode()==200||response.getStatusCode()==202) {
			return new ResponseEntity<>("Mail send successfull",HttpStatus.OK);
		}
		
		return new ResponseEntity<>("failed to send",HttpStatus.NOT_FOUND);
		
	}
	
	
	
	
	@PutMapping("/approve/{leave_id}")
	public ResponseEntity<LeaveApplyEntity> approveLeave(@PathVariable(name = "leave_id") int  leave_id){
		LeaveApplyEntity approvedLeave = leaveService2.leaveApply2(leave_id);
		Response response=emailService.sendMail(approvedLeave);
		if(approvedLeave!=null && response.getStatusCode()==200 || response.getStatusCode()==202) {
			return ResponseEntity.ok(approvedLeave);
		}
		else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	
}
