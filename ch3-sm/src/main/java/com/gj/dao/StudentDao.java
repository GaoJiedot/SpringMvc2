package com.gj.dao;

import com.gj.entity.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student>selectAllStudent ();
}
