package com.service.impl;

import com.dao.TeacherMapper;
import com.pojo.Teacher;
import com.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public Teacher findTeacherByup(String username ,String password){
      Teacher teacher=teacherMapper.findTeacherByup(username,password);
      return teacher;
}
    @Override
    public List<Teacher> findAllTeacher(){
        List<Teacher> teachers=teacherMapper.selectAll();
        return teachers;


    }

    @Override
    public Teacher findOneTeacher(Long id) {
      Teacher teacher=teacherMapper.selectByPrimaryKey(id);
        return teacher;
    }

    @Override
    public void updateTeacher(Long id, String name, String username, String password1, String tel) {
        System.out.println("service层的姓名：" + name);
        teacherMapper.updateTeacher(id,name,username,password1,tel);
    }

   @Override
    public void addATeacher(String name, String username, String password1, String sex, String tel) {
        teacherMapper.addAteacher(name,username,password1,sex,tel);
    }

    @Override
    public int  DeleteTeacher(Long id) {
        int teacher=teacherMapper.deleteByPrimaryKey(id);
      return teacher;
    }



}
