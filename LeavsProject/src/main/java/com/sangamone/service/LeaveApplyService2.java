package com.sangamone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.entity.LeaveApplyEntity;
import com.sangamone.repository.LeaveRepository;

@Service
public class LeaveApplyService2 {
	@Autowired
	LeaveRepository leaveRepository;
	
	public LeaveApplyEntity leaveApply2(int leave_id) {
		LeaveApplyEntity leave=leaveRepository.findById(leave_id).orElse(null);
		if(leave!=null) {
			leave.setStatus("Approved");
		}
		else {
			return null;
		}
		return leave;
		
		
	}

	public LeaveApplyEntity approveLeave(int leave_id) {
	
		return null;
	}
}
