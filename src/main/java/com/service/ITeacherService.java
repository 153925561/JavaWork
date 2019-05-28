package com.service;
import com.pojo.Teacher;

import java.util.List;
public interface ITeacherService {
   Teacher findTeacherByup(String username, String password);

    List<Teacher> findAllTeacher() ;

    Teacher findOneTeacher(Long id);

    void updateTeacher(Long id, String name, String username, String password1, String tel);


    void addATeacher(String name, String username, String password1, String sex, String tel);



    int DeleteTeacher(Long id);
}
