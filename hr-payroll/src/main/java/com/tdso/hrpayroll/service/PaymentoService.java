package com.tdso.hrpayroll.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tdso.hrpayroll.feignClients.WorkerFeignClient;
import com.tdso.hrpayroll.model.Worker;
import com.tdso.hrpayroll.models.Payment;

@Service
public class PaymentoService {
	
	// busca o valor da variavel hr-worker.host definida dentro do application-properties
//	@Value("${hr-worker.host}")
//	private String workerHost;
//	
//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment (Long id, Integer days) {

		// os parametros da URI tem que ser colocados em um Map 
//		Map<String, String> uriVariables = new HashMap<>();
//		uriVariables.put("id", ""+id);
//		
//		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		
		Worker worker = workerFeignClient.getWorkers(id).getBody() ;
		
		return new Payment (worker.getName(), worker.getDailyIncome(), days);
	}

}
