package com.example.sbmybatis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbmybatisApplicationTests {

    @Autowired
    private SchoolService schoolService;

    @Test
    public void selectAll(){
        List<School> schools = schoolService.selectAll();
        System.out.println(schools);
    }
}
