package com.ygc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 22:42 2020/5/24
 * @Modified By:
 */
@Service
public class IndexService {
    public IndexService(IndexDao dao) {
        this.dao = dao;
    }

    @Autowired
    private IndexDao dao;

    public void service() {
        dao.test();
    }

//    public void setDao(IndexDao dao) {
//        this.dao = dao;
//    }
}
