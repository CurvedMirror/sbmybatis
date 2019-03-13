package com.example.service;

import com.example.model.Girl;

/**
 * @author jie
 * @date 2019/3/13 -22:44
 */
public interface GirlService {
    int deleteByPrimaryKey(Integer id);

    int insert(Girl record);

    int insertSelective(Girl record);

    Girl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Girl record);

    int updateByPrimaryKey(Girl record);
}
