package com.ksi.microservice.user.VO;


import com.ksi.microservice.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO  {

    private User user;
    private Department department;
}
