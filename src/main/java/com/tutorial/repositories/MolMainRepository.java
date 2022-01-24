package com.tutorial.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.models.MolMain;

@Repository
public interface MolMainRepository extends JpaRepository<MolMain, Long>{
	
	List<MolMain> findBySiteId(Long siteId);
	
}
