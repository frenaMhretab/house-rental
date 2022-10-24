package com.example.bankAccount.service;

import com.example.bankAccount.model.Payment;

import java.util.List;

public interface PaymentService {

    void createPayment(Payment payment);
    void deletePayment(String id);
    Payment getPayment(String id);
    List<Payment> getALlPayment();
    Payment editPayment(Payment payment , String id);


}
