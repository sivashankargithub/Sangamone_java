package com.sangamone.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sangamone.entity.GetDataEntity;

public interface GetDataRepo extends JpaRepository<GetDataEntity, String>{
	@Query(value="select * from names",nativeQuery = true)
	public List<GetDataEntity> getAllNames();
	

}
