package com.sangamone.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sangamone.entity.GetDataEntity;

public interface JustInter extends JpaRepository<GetDataEntity, String>{
	@Query(value="select * from names where names:=names",nativeQuery = true)
	List<GetDataEntity> method1(String names);
}
