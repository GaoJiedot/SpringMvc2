package com.gj;

import com.gj.dao.StudentDao;
import com.gj.entity.Student;
import com.gj.service.StudentService;
import com.gj.service.impl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class TestApp {
    @Resource
    private StudentService studentService;
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("sc.xml");
        String []beans= ac.getBeanDefinitionNames();
        for (String b:beans
    ){
            System.out.println("容器中对象的名字："+b);
        }
        System.out.println();
        StudentService service=ac.getBean(StudentServiceImpl.class);

        Student student = new Student();
        student.setName("WANG");
        student.setAge(20);
        int i = service.insertStudent(student);
        if (i>0){
            System.out.println("success");
        }
        System.out.println("error");
    }
}
