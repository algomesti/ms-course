package com.algomesti.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.algomesti.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 20.0, days);
	}
	
}
