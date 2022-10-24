package com.example.bankAccount.controllers;

import com.example.bankAccount.model.Payment;
import com.example.bankAccount.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/payment/")

@CrossOrigin
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController (PaymentService paymentService){
        this.paymentService=paymentService;

    }

    @GetMapping
  public ResponseEntity<List<Payment>> getPayment(){

        return new ResponseEntity<>(paymentService.getALlPayment(), HttpStatus.OK);
  }

  @PostMapping
 public ResponseEntity<?> createPayment(@RequestBody Payment payment){
     paymentService.createPayment(payment);
        return new ResponseEntity<>(HttpStatus.OK);

 }

 @DeleteMapping("{id}")
  public ResponseEntity<?> deletePayment(@PathVariable String  id ){

        paymentService.deletePayment(id);
        return new ResponseEntity<>(HttpStatus.OK);
  }

  @PutMapping("{id}")
    public ResponseEntity<?> editPayment( @RequestBody Payment payment , @PathVariable String id){

        paymentService.editPayment(payment,id);
        return new ResponseEntity<>(HttpStatus.OK);
  }

}
