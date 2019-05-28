package com.controller;


import com.pojo.Admins;
import com.pojo.Student;
import com.pojo.Teacher;
import com.service.IAdminservice;
import com.service.impl.StudentServiceImpl;
import com.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private IAdminservice adminservice;
    @Autowired
    private TeacherServiceImpl teacherService;

    @Autowired
    private StudentServiceImpl studentService;
  /**
   * 程序启动
   * @return 登录页
   */
    @RequestMapping("/")
    public String toIndex(){

        return "Login";
    }


    /**
     * 登录方法
     * */



    @RequestMapping("/login")
    public String login(@RequestParam String people, @RequestParam String username , @RequestParam String password, HttpSession session){

  if("系统管理员".equals(people)) {

      Admins admins=adminservice.findAdminByup(username,password);

      if(admins==null){

          return "Login";
      }
    else
      {  session.setAttribute("admin",admins);
          return "WelcomeAdmin";
      }
  }

  else if("楼宇管理员".equals(people)){

      Teacher teacher=teacherService.findTeacherByup(username,password);

      if (teacher==null){

          return "Login";
      }
      else
      {
          session.setAttribute("teacher",teacher);
          return "WelcomeTeacher";
      }
  }
  else if("学生".equals(people)){

      Student student=studentService.findStudentByup(username,password);
      if (student==null){

          return "Login";
      }
      else
      {   session.setAttribute("student",student);
          return "WelcomeStudent";
      }


  }

return "";

    }





}
