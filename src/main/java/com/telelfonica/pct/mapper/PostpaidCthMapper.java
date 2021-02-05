package com.telelfonica.pct.mapper;

import org.mapstruct.Mapper;

import com.telelfonica.pct.pojo.NotifyExternalSource;
import com.telelfonica.pct.pojo.PostpaidCthDTO;

@Mapper(componentModel = "spring")
public interface PostpaidCthMapper {
    
    
    PostpaidCthDTO fromNotifyexternalToDto (NotifyExternalSource notifyexternal);

}
