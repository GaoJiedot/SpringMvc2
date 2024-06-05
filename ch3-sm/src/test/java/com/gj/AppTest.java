package com.gj;

import static org.junit.Assert.assertTrue;

import com.gj.entity.Student;
import com.gj.service.StudentService;
import com.gj.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void t1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext();
        StudentService service = ac.getBean(StudentService.class);
        List<Student> students = service.selectAllStudent();
        for (Student s: students){
            System.out.println(s);
        }
    }
}
