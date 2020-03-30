package com.spring.SpringCore_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Phone {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(Phone_Config.class);
        I_Phone X = factory.getBean(I_Phone.class);
        X.config();
    }
}
