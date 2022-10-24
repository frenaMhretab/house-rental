package com.example.bankAccount.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;
import java.sql.Date;

@Document
@Data
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id

    private String ID;
    private String userEmail;
    private  String propertyId;
    private String ReservationId;

    private String paymentMethod;
    private double Amount;
    private Date date;


}




