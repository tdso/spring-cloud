package com.tdso.hrworker.service;

import org.springframework.stereotype.Service;

import com.tdso.hrworker.models.Payment;

@Service
public class PaymentoService {
	
	public Payment getPayment (Long id, Integer days) {
		
		return new Payment ("Euller", 300.0, days);
	}

}
