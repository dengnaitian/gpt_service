package com.example.swagger.service;

import com.example.swagger.api.pojo.Response;
import com.example.swagger.api.pojo.User;
import com.example.swagger.rest.UserApiDelegate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserDelegateImpl implements UserApiDelegate {

    @Override
    public ResponseEntity<Response> saveUser(User user) {
        //只做示范，代码就不写了
        Response response = new Response();
        response.setCode("success");
        response.setMessage("successMessage");
        ResponseEntity<Response> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
        log.info("begin saveUser");
        return responseEntity;
    }
}
