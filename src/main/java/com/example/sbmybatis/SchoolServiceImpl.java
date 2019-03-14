package com.example.sbmybatis;

import com.example.sbmybatis.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jie
 * @date 2019/3/14 0014 -9:06
 */
@Service
public class SchoolServiceImpl implements SchoolService{

    @Autowired
    private SchoolMapper schoolMapper;

    @Override
    public List<School> selectAll() {
        return schoolMapper.selectAll();
    }

    @Override
    public List<TClass> selectClassAll() {
        return schoolMapper.selectClassAll();
    }
}
