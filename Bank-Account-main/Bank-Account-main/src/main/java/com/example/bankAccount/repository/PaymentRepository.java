package com.example.bankAccount.repository;



import com.example.bankAccount.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends MongoRepository<Payment,String>{
}
