package com.sangamone.repository;

import org.springframework.data.repository.CrudRepository;

import com.sangamone.entity.LeaveApplyEntity;

public interface LeaveRepository extends CrudRepository<LeaveApplyEntity, Integer> {
	

}
