package com.example.sbmybatis.mapper;

import com.example.sbmybatis.School;
import com.example.sbmybatis.TClass;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jie
 * @date 2019/3/14 0014 -8:56
 */
@Repository
public interface SchoolMapper {
    List<School> selectAll();
    List<TClass> selectClassAll();
}
