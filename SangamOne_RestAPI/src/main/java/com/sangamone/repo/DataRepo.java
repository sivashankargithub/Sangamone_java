package com.sangamone.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sangamone.entity.Entity1;

public interface DataRepo extends JpaRepository<Entity1, String>{
	@Query(value="select * from holidays",nativeQuery = true)
	List<Entity1>viewHolidays();
}
