package com.gj.service;

import com.gj.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    int insertStudent(Student student);
    List<Student> selectAllStudent ();
}
