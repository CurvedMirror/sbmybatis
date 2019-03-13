package com.example.service;

import com.example.mapper.GirlMapper;
import com.example.model.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jie
 * @date 2019/3/13 -22:45
 */
@Service("GirlService")
public class GirlServiceImpl implements GirlService {

    @Autowired
    private GirlMapper girlMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Girl record) {
        return 0;
    }

    @Override
    public int insertSelective(Girl record) {
        return 0;
    }

    @Override
    public Girl selectByPrimaryKey(Integer id) {
        return girlMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Girl record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Girl record) {
        return girlMapper.updateByPrimaryKey(record);
    }
}
