package com.lb.test;

import com.lb.mapper.SpecilMapper;
import com.lb.po.Specil;
import com.lb.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestSpecil {
    @Test
    public  void TestJb(){
        SqlSession sqlSession = MybatisUtils.getSqlSession(false);
        System.out.println( sqlSession.getConnection());

        System.out.println();
    }

    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession(false);
        int pageNum = 1;
        int pageSize = 5;
        int start = (pageNum - 1) * pageSize;
        SpecilMapper specilMapper = sqlSession.getMapper(SpecilMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("start",start);
        map.put("pageSize",pageSize);

        List<Specil> specilList = specilMapper.findSpecilSplit(map);

        for (Specil specil: specilList){
            System.out.println(specil);
        }
        MybatisUtils.closeSqlSession(sqlSession);
    }
}
