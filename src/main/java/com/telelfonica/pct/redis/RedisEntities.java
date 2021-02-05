package com.telelfonica.pct.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telelfonica.pct.common.StreamProperties;
import com.telelfonica.pct.pojo.NotifyExternalSource;
import com.telelfonica.pct.pojo.PlantaGeneralSource;



@Service
public class RedisEntities {
    
    @Autowired
    private RedisHashService service;
    
    @Autowired
    StreamProperties properties;
    
    public NotifyExternalSource findInNotifyExternalSource(String tracking_esp) {
	
	return service.getAndParse(properties.getRedisHashNotifyExternal(), tracking_esp, NotifyExternalSource.class);
    }
    
    public PlantaGeneralSource findInPlantaGeneralSource(String phone) {
	
	return service.getAndParse(properties.getRedisHashGeneralPlant(), phone, PlantaGeneralSource.class);
    }	
    
    
    
    
}
