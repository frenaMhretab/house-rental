package com.example.bankAccount.service;

import com.example.bankAccount.model.Payment;
import com.example.bankAccount.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository){
        this.paymentRepository=paymentRepository;
    }

    @Override
    public void createPayment(Payment payment) {

     paymentRepository.save(payment);

    }


    @Override
    public void deletePayment(String id) {
     paymentRepository.deleteById(id);
    }

    @Override
    public Payment getPayment(String id) {
        return paymentRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Payment> getALlPayment() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment editPayment(Payment payment, String id) {
        var old = paymentRepository.findById(id).orElseThrow();
        old = payment;
        return  paymentRepository.save(old);
    }
}
