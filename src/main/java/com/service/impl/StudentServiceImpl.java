package com.service.impl;

import com.dao.StudentMapper;
import com.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{

   @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student findStudentByup(String username, String password) {

        Student student = studentMapper.findStudentByup(username, password);
        return student;

    }

    @Override
    public List<Student> findAllStudent() {
        List<Student> students=studentMapper.selectAll();
        return students;
    }

    @Override
    public Student findOneStudent(Long id) {
        Student student=studentMapper.selectByPrimaryKey(id);
        return  student;
    }

    @Override
    public void updateStudent(Long id, String name, String username, String password1, String cls) {
        studentMapper.updateStudent(id,name,username,password1,cls);
    }

    @Override
    public void addAStudent(String name, String username, String password1, String sex, String cls) {
        studentMapper.addAStudent(name, username, password1, sex, cls);
    }

    @Override
    public int  DeleteStudent(long id) {
       int student= studentMapper.deleteByPrimaryKey(id);
       return student;
    }


}
