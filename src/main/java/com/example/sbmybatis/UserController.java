package com.example.sbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jie
 * @date 2019/3/14 0014 -9:27
 */
@RestController
public class UserController {

    @Autowired
    private  SchoolService schoolService;

    @GetMapping("/getUser")
    public List<TClass> getUser(){
        return  schoolService.selectClassAll();
    }
}
