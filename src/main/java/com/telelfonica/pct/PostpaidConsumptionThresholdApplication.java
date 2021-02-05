package com.telelfonica.pct;

import java.util.function.Function;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.telelfonica.pct.mapper.PostpaidCthMapper;
import com.telelfonica.pct.pojo.NotifyExternalSource;
import com.telelfonica.pct.pojo.PostpaidCthDTO;
import com.telelfonica.pct.service.PostpaidCthService;

@SpringBootApplication
public class PostpaidConsumptionThresholdApplication {
    	
    @Autowired
    PostpaidCthService service;
    
    @Autowired
    PostpaidCthMapper mapper;
    
    
    
    @Bean
    public Function<KStream<String, NotifyExternalSource>, KStream<String, PostpaidCthDTO>> process() {
	
	return null;
		
    }

    public static void main(String[] args) {
		SpringApplication.run(PostpaidConsumptionThresholdApplication.class, args);
    }

}
