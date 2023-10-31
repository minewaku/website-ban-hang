package com.minewaku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minewaku.entity.CatagoryEntity;

@Repository
public interface CatagoryRepository extends JpaRepository<CatagoryEntity, Integer>{
	CatagoryEntity findOneByCatagoryId(int id);
}
