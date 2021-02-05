package com.telelfonica.pct.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Service
public class RedisHashService {
    
    private HashOperations<String, String, String> redisOperator;

    @Autowired
    public RedisHashService(RedisTemplate<String, String> redisTemplate) {
        this.redisOperator = redisTemplate.opsForHash();
    }

    public <T> T getAndParse(String redisKey, String redisHashKey, Class<T> dataType) {
        String data = redisOperator.get(redisKey, redisHashKey);

        if (data == null)
            return null;

        try {
            ObjectMapper mapper = new ObjectMapper().registerModule(new JavaTimeModule());
            return mapper.readValue(data, dataType);
        } catch (Exception e) {
            return null;
        }
    }
    
   
}
