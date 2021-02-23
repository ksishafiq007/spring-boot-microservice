package com.ksi.microservice.user.service;

import com.ksi.microservice.user.VO.Department;
import com.ksi.microservice.user.VO.ResponseTemplateVO;
import com.ksi.microservice.user.entity.User;
import com.ksi.microservice.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        //log.ingo("Inside save user of UserService")
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        //log.ingo("Inside getUserWithDepartment of UserService")
        ResponseTemplateVO vo=new ResponseTemplateVO();
        User user=userRepository.findByUserId(userId);
        Department department=restTemplate.getForObject("http://localhost:9001/departments/"+user.getDepartmentId(),Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
