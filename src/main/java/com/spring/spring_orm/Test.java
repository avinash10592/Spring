package com.spring.spring_orm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
public class Test {
    public static void main(String[] args) {

        Resource r=new ClassPathResource("employee.applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        EmployeeDao dao=(EmployeeDao)factory.getBean("d");

        Employee e=new Employee();
        e.setId(114);
        e.setName("varun");
        e.setSalary(50000);

        dao.saveEmployee(e);

    }
}
