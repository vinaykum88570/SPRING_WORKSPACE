package com.swiggy.services;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.swiggy.model.PaymentData;

@Service
public class PaymentService {

	public String makePayment() {
		// Success or Failed

		String paymentStatus = "Success"; // Data from Db

		return paymentStatus;
	}

	public PaymentData getPaymentData(String paymentId) {

		// Getting Data from Repo layer // Paymment is avilable in DB or not
		boolean isPaymentIdExists = true;

		if (isPaymentIdExists) {
			PaymentData data = new PaymentData();
			data.setPayamentStaus("Suucess");
			data.setPaymentDate(LocalDate.now().toString());
			data.setPaymentID(paymentId);
			return data;
		} else {
			return null;
		}

	}

	public String deletPaymentData(String paymentId) {

		boolean isPaymentIdExists = true;

		String result = null;
		if (isPaymentIdExists) {
			return result = "Deleted Succesffuly.";
		} else {
			return result = null;
		}

	}

}
