package com.example.sbmybatis;

import java.util.List;

/**
 * @author jie
 * @date 2019/3/14 0014 -9:06
 */
public interface SchoolService {
    List<School> selectAll();
    List<TClass> selectClassAll();
}
