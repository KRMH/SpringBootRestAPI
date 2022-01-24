package com.tutorial.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.models.MolMain;
import com.tutorial.repositories.MolMainRepository;
import com.tutorial.repositories.packageRepository;

@RestController
@Transactional
public class MolMainController {
	@Autowired
	private final MolMainRepository molMainRepo;
	@Autowired
	private final packageRepository pckRepo;
	private Logger logger = LoggerFactory.getLogger(MolMainController.class);
	
	

	public MolMainController(MolMainRepository molMainRepo, packageRepository pckRepo) {
		super();
		this.molMainRepo = molMainRepo;
		this.pckRepo = pckRepo;
	}


	@GetMapping ("/allOrderLines")
	@ResponseBody
	public ResponseEntity<List<MolMain>> all(){
		logger.debug("start of getAll");
		
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
	
	@GetMapping ("/orderIdFromPackage/{id}")
	@ResponseBody
	public ResponseEntity<Long> getOrderId(@PathVariable("id") Long id){
		logger.debug("start of getOrderId");
		
		Long orderId = pckRepo.getOrderId(id);
		
		return new ResponseEntity <> (orderId, HttpStatus.OK);
		
		
	}
	
}
