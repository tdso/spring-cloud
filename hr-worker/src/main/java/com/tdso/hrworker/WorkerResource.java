package com.tdso.hrworker;


import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdso.hrworker.models.Worker;
import com.tdso.hrworker.repository.WorkerRepository;

@RestController
@RequestMapping(value="/workers")
public class WorkerResource {
	
	@Autowired
	private Environment env; 
	
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(WorkerResource.class);
			
	
	@Autowired
	private WorkerRepository workerRepository;
	
	@GetMapping
	public ResponseEntity getWorkers () {
		
		return ResponseEntity.ok(workerRepository.findAll());
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Worker> getWorkers (@PathVariable Long id) {
		
		logger.info("PORTA = " + env.getProperty("local.server.port"));
		
		return ResponseEntity.ok(workerRepository.findById(id).get());
	}
	

}
