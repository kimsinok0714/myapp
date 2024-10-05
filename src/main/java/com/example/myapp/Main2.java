package com.example.myapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(StudentConfig2.class);

        Student2 student2 = context.getBean(Student2.class);
        student2.setName("일길동");
        System.out.println(student2.getName());
        
    }

}
