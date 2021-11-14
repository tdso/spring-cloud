package com.tdso.hrworker.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdso.hrworker.models.Payment;
import com.tdso.hrworker.service.PaymentoService;

@RestController
@RequestMapping(value="pay")
public class PaymentResource {
	
	@Autowired
	PaymentoService paymentService;
	
	@GetMapping(value="/{id}/days/{days}")
	public Payment getPay(@PathVariable Long id, @PathVariable Integer days ) {
	
		return paymentService.getPayment(id, days);
	}
	

}
