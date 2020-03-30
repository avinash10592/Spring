package com.spring.SpringCore_Annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Samsung implements Mobile_Processor {

    public void processor() {
        System.out.println("Samsung is not better than I_Phone.... ");

    }
}
