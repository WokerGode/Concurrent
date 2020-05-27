package com.ygc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 22:42 2020/5/24
 * @Modified By:
 */
@Service
public class IndexService {
//    xml byName注入是根据set方法后跟的名称.resource无name属性注入的byname是根据成员变量名称
//    @Autowired  默认采用的是"byType"方式注入
//    @Resource  默认采用的是"byType"方式注入,不指定name属性时,会通过成员变量name和set方法实现注入
    @Resource(name = "dao")   //去掉name属性,成员变量名生效
    private IndexDao idexDaoImpl;

    public void service() {
        idexDaoImpl.test();
    }

    public void setIdexDaoImpl(IndexDao dao) {
        this.idexDaoImpl = dao;
    }
}
