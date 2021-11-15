package com.tdso.hrpayroll.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tdso.hrpayroll.model.Worker;
import com.tdso.hrpayroll.models.Payment;

@Service
public class PaymentoService {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment (Long id, Integer days) {
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+id);
		
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		return new Payment (worker.getName(), worker.getDailyIncome(), days);
	}

}
