package com.spring.SpringCore_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class I_Phone {
    @Autowired

    Mobile_Processor phone;

    public Mobile_Processor getPhone() {
        return phone;
    }

    public void setPhone(Mobile_Processor phone) {
        this.phone = phone;
    }

    public void config() {
        System.out.println("I_PhoneX configuration: Octa Core,4 GB Ram,12MP Camera");
        phone.processor();
    }
}
