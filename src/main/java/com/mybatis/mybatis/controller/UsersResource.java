package com.mybatis.mybatis.controller;

import com.mybatis.mybatis.mapper.UsersMapper;
import com.mybatis.mybatis.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersResource {

    @Autowired
    private UsersMapper usersMapper;

    public UsersResource(UsersMapper usersMapper){
        this.usersMapper = usersMapper;
    }

    @GetMapping("/all")
    public List<Users> getAll(){
        return usersMapper.findAll();
    }

}
