package com.ygc.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 22:41 2020/5/24
 * @Modified By:
 */
@Repository("dao")  //dao即自己对bean的重命名,自动生成为indexDaoImpl
public class IdexDaoImpl1 implements IndexDao {

    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void test() {
        System.out.println("impl1");
        System.out.println(str);
    }
}
