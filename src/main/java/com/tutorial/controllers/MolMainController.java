package com.tutorial.controllers;

import java.util.List;

import javax.persistence.EntityGraph;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.models.MolMain;
import com.tutorial.repositories.MolMainRepository;

@RestController
public class MolMainController {
	private final MolMainRepository molMainRepo;
	private Logger logger = LoggerFactory.getLogger(MolMainController.class);
	
	public MolMainController(MolMainRepository molMainRepo) {
		super();
		this.molMainRepo = molMainRepo;
	}
	

	@GetMapping ("/allOrderLines")
	@ResponseBody
	public ResponseEntity<List<MolMain>> all(){
		logger.debug("start of getAll");
		//logger.error("error in getAll");
		
		List <MolMain> molMain = molMainRepo.findAll();
		if (molMain == null) {
	        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {

	        return new ResponseEntity<>(molMain, HttpStatus.OK);
		}
	}
	
	
	@GetMapping ("/orderLines/{siteId}")
	@ResponseBody
	public ResponseEntity<List<MolMain>> getMolMain (@PathVariable("siteId") Long siteId) {
		List <MolMain> molMain = molMainRepo.findBySiteId(siteId);
		return new ResponseEntity <> (molMain, HttpStatus.OK);
		
	}
	
}
