package com.restpkg1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restpkg1.entity.UnivEntity;

public interface UnivRepo extends JpaRepository<UnivEntity, Integer>{

}
