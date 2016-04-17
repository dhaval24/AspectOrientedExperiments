package org.dhaval.springexperiment.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ShapeService;

/**
 * Created by Dhaval on 4/5/2016.
 */
public class AopMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
        System.out.println(shapeService.getCircle().getName());
        shapeService.getCircle().setName("adsdsa");
        System.out.println(shapeService.getTriangle().getName());
    }
}
