package com.algomesti.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algomesti.hrpayroll.entities.Payment;
import com.algomesti.hrpayroll.entities.Worker;
import com.algomesti.hrpayroll.feignclients.WorkFeignClient;

@Service
public class PaymentService {

	
	@Autowired
	private WorkFeignClient workerFeignClient; 
	
	public Payment getPayment(long workerId, int days) {
			
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
