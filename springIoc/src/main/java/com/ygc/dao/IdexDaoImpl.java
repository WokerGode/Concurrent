package com.ygc.dao;

import org.springframework.stereotype.Component;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 22:41 2020/5/24
 * @Modified By:
 */
@Component("dao")
public class IdexDaoImpl implements IndexDao {

    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void test() {
        System.out.println("impl");
        System.out.println(str);
    }
}
