package com.telelfonica.pct.pojo;

import lombok.Data;

@Data
public class PostpaidCthDTO {
    
    private String trackingEsp;
    private String phone;
    private String planFee;
    private String opCode;
    private String date;
    private String rejectionCode;
    private String bonoCode;
    private int amount;
    private String startDate;
    private String endDate;
    private String boltonState;
    
    private NotifyExternalSource notifyExternalSource;
    private PlantaGeneralSource plantaGeneralSource;
    

}
