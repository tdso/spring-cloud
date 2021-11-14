package com.tdso.hrworker;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdso.hrworker.repository.WorkerRepository;

@RestController
@RequestMapping(value="/workers")
public class WorkerResource {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	@GetMapping
	public ResponseEntity getWorkers () {
		
		return ResponseEntity.ok(workerRepository.findAll());
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity getWorkers (@PathVariable Long id) {
		
		return ResponseEntity.ok(workerRepository.findById(id).get());
	}
	

}
