package com.service.impl;

import com.pojo.Student;

import java.util.List;

public interface IStudentService {
    Student findStudentByup(String username, String password);

    List<Student> findAllStudent();

    Student findOneStudent(Long id);

    void updateStudent(Long id, String name, String username, String password1, String cls);


    void addAStudent(String name, String username, String password1, String sex, String cls);

    int DeleteStudent(long id);
}
