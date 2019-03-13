package com.example.sbmybatis;

import com.example.mapper.GirlMapper;
import com.example.model.Girl;
import com.example.service.GirlService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbmybatisApplicationTests {

    @Autowired
    private GirlMapper girlService;

    @Test
    public void contextLoads() {
        Girl girl = girlService.selectByPrimaryKey(1);
        System.out.println(girl);
    }

    @Test
    public void update() {

        Girl girl = new Girl();
        girl.setCupSize("G");
        girl.setAge(62);
        girl.setId(1);
        int i = girlService.updateByPrimaryKey(girl);
        System.out.println(i);

    }
}
