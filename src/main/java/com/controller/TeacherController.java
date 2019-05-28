package com.controller;

import com.pojo.Missing;
import com.pojo.Student;
import com.service.impl.MissingServiceImpl;
import com.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TeacherController {


    @Autowired
    private StudentServiceImpl studentService;
    @Autowired
    private MissingServiceImpl missingService;
    @RequestMapping("/TeacherMain")
    public  String ToTeacherMain(){

        return "WelcomeTeacher";

    }

    /**
     * 跳转到修改密码页面
     *
     * */
    @RequestMapping("/ToTeaPassword")
    public String ToTeacherPassword(){

        return "TEPassword";
    }


    /**
     *
     * 查找所有学生
     *
     * 返回学生管理页面
     *
     * */
    @RequestMapping("/ManageStudent")
public String ToManageStudent(Model model){
        List<Student> students=studentService.findAllStudent();
        model.addAttribute("students",students);
        return "TEStudent";

    }


    /**
     * 查找所有缺勤记录
     *
     * 返回缺勤登记页面
     *
     * */

    @RequestMapping("StuMissing")
    public String ToStuMissing(Model model){
        List<Missing> missings=missingService.findAllMissing();
        model.addAttribute("missings",missings);
        return "TERecord";

    }





}
