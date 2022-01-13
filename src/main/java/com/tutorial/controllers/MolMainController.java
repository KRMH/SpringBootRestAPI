package com.tutorial.controllers;

import java.util.List;

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

	public MolMainController(MolMainRepository molMainRepo) {
		super();
		this.molMainRepo = molMainRepo;
	}
	

	@GetMapping ("/allOrderLines")
	@ResponseBody
	public ResponseEntity<List<MolMain>> all(){
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
