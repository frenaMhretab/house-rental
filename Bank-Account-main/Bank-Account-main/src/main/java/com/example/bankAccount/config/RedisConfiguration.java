package com.example.bankAccount.config;

import lombok.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class RedisConfiguration {
    private String host;



    private int port;


}
