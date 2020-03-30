package com.spring.SpringCore_Annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OnePlus implements Mobile_Processor {
    public void processor(){
        System.out.println("OnePlus is not better than I_phone but better than Samsung...");
    }
}
