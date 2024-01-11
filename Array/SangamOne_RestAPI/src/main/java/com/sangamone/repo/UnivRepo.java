package com.sangamone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.entity.UnivEntity;

public interface UnivRepo extends JpaRepository<UnivEntity, Integer>{
}
