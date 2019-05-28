package com.controller;

import com.pojo.Missing;
import com.service.IMissingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller

public class StuController {

 @Autowired
    private IMissingService missingService;

    @RequestMapping("/StuMain")
    public String toStuMain(){
        return "WelcomeStudent";

    }

@RequestMapping("/ToStuPassword")
public String ToStuPassword(){
        return "StuPassword";
}



/**
 *
 * 退出系统
 *
 * 返回登录页
 *
 * */
@RequestMapping("/toLogin")
public String ToLogin(){

        return "Login";

}


/**
 * 查找缺勤记录
 *
 * 返回我的缺勤记录
 *
 *
 * */
   @RequestMapping ("/MyMissing")
    public String toMyMissing( Model model)
    {
    List<Missing> missings=missingService.findAllMissing();
        model.addAttribute("missings",missings);
        return "StuInfo";

    }



}
