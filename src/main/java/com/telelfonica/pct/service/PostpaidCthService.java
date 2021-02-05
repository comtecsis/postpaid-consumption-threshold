package com.telelfonica.pct.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telelfonica.pct.pojo.PostpaidCthDTO;
import com.telelfonica.pct.redis.RedisEntities;

@Service
public class PostpaidCthService {
    
    @Autowired
    RedisEntities entities;
    
    public PostpaidCthDTO setDtoGeneralPlant(PostpaidCthDTO dto) {
	
	dto.setPlantaGeneralSource(entities.findInPlantaGeneralSource(dto.getPhone()));
	
	return dto;
	
    }
    
    public PostpaidCthDTO setDtoNotifyExternal(PostpaidCthDTO dto) {
	
	dto.setNotifyExternalSource(entities.findInNotifyExternalSource(dto.getTrackingEsp()));
	return dto;	
    }
    
    private LocalDateTime formatDate(String date) {
	// falta validar
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
	return LocalDateTime.parse(date, formatter);
    }

}
