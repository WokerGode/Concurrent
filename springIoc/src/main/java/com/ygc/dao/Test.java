package com.ygc.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 22:48 2020/5/24
 * @Modified By:
 */
public class Test {
    public static void main(String[] args) {
//        XML读取配置
//        ClassPathXmlApplicationContext classPathXmlApplicationContext
//                =new ClassPathXmlApplicationContext("classpath:spring.xml");
//        IndexService service = (IndexService)classPathXmlApplicationContext.getBean("indexService");

        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(Spring.class);
        IndexService service = (IndexService) annotationConfigApplicationContext.getBean("indexService");
        service.service();

    }
}
