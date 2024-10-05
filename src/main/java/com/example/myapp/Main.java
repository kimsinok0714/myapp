package com.example.myapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        
        Student student = new Student();
        student.setName("일길동");

        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(StudentConfig.class);

        Student student2 = context.getBean(Student.class);
        student2.setName("일길동");
        System.out.println(student2.getName());
    }

}
