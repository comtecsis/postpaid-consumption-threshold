package com.telelfonica.pct.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
@ConfigurationProperties(prefix = "stream")
public class StreamProperties {
    
    private String redisHashNotifyExternal;
    private String redisHashGeneralPlant;
    private String redisHashPostpaidThresholdBonuses;

}
