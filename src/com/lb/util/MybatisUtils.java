package com.lb.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * 工具类-----目的：提高组件 “重用”
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;// 单例

    static {// static块-------只做一次
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // 获取SqlSession
    public static SqlSession getSqlSession(boolean flag){
        return sqlSessionFactory.openSession(flag);//  true:自动提交事务
    }

    // 关闭SqlSession
    public static void closeSqlSession(SqlSession sqlSession){
        if (null!=sqlSession){
            sqlSession.close();
        }
    }

}
