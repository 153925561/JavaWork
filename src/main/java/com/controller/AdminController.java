package com.controller;

import com.pojo.*;
import com.service.IAdminservice;
import com.service.IRoomService;
import com.service.ITeacherService;
import com.service.impl.IBuildingService;
import com.service.impl.IStudentService;
import com.service.impl.MissingServiceImpl;
import com.service.impl.OutersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
public class AdminController {

    @Autowired
    private IAdminservice adminservice;

    @Autowired
    private ITeacherService TeacherService;

    @Autowired
    private IStudentService studentService;
    @Autowired
    private IBuildingService buildingService;
    @Autowired
    private MissingServiceImpl missingService;
    @Autowired
    private IRoomService iRoomService;
    @Autowired
    private OutersServiceImpl outersService;
/**
 * 跳转到后台首页
 * @return
 *
 **/

    @RequestMapping("/adminMain")
    public String toAdminMain(){
        return "WelcomeAdmin";

    }

/**
 * 查找所有楼宇管理员
 * @return 楼宇管理员
 */

    @RequestMapping("/adminTeacher")
    public String toAdminTeacher(Model model){
        List<Teacher> teachers= TeacherService.findAllTeacher();
            model.addAttribute("teachers", teachers);
            return "AdminTeacher";


        }
/**
 *
 * 跳转到更改楼宇管理员
 * */

       @RequestMapping("/ToUpdateTeacher")
     public String  toUpdateTeacher(Long id,Model model){


        Teacher teacher= TeacherService.findOneTeacher(id);
        model.addAttribute("teacher",teacher);
        return "UpdateTeacher";


       }

       /**
        * 修改楼宇管理员信息
        * */
       @RequestMapping("/updateTeacher")
        public ModelAndView updateTeacher(@RequestParam Long id,
                                          @RequestParam String name,
                                          @RequestParam String username,
                                          @RequestParam String password1,
                                          @RequestParam String tel){
           System.out.println("姓名是：" + name);

             TeacherService.updateTeacher(id,name,username,password1,tel);

              return new ModelAndView("redirect:/adminTeacher");
        }

/*
*
* 跳转到添加楼宇管理员
*
* */
        @RequestMapping("/ToAddTeacher")
        public String ToAddTeacher(){

        return "AddTeacher";

        }


        /**
         *
         * 添加楼宇管理员
         *
         * */
     @RequestMapping("/AddaTeacher")
    public ModelAndView AddaTeacher(
                                    @RequestParam String name,
                                    @RequestParam String username,
                                    @RequestParam String password1,
                                    @RequestParam String sex,
                                    @RequestParam String tel){


        TeacherService.addATeacher(name,username,password1,sex,tel);

        return new ModelAndView("redirect:/adminTeacher");
    }


    /**
     *
     * 删除楼宇管理员
     *
     * */

@RequestMapping("/ToDeleteTeacher")
public ModelAndView DeleteTeacher( Long id){

      TeacherService.DeleteTeacher(id);
      return new ModelAndView("redirect:/adminTeacher");

    }

/**
 *
 * 查找所有学生
 *
 * 跳转到学生管理
 *
 *
 *
 * */
@RequestMapping("/adminSudent")
        public String toAdminStudent(Model model){
        List<Student> students=studentService.findAllStudent();
        model.addAttribute("students",students);
       return "AdminStudent";
        }


/**
 *
 * 跳转到修改学生信息
 *
 * */
   @RequestMapping("/ToUpdateStudent")
   public String toUpdateStudent(Long id,Model model){

        Student student=studentService.findOneStudent(id);
        model.addAttribute("student",student);
        return "UpdateStudent";


   }

   /**
    * 修改学生信息
    *
    * */


   @RequestMapping("/updateStudent")
   public ModelAndView updateStudent(@RequestParam Long id,
                                     @RequestParam String name,
                                     @RequestParam String username,
                                     @RequestParam String password1,
                                     @RequestParam String cls){

        studentService.updateStudent(id,name,username,password1,cls);

        return  new ModelAndView("redirect:/adminSudent");

   }


 /**
  * 跳转到添加学生
  *
  * */

@RequestMapping("/ToAddAStudent")
public String ToAddAStudent(){

        return "AddStudent";

}


/**
 *
 * 添加学生
 *
 *
 * */
@RequestMapping("/AddaStudent")
public ModelAndView AddAStudent(  @RequestParam String name,
                                  @RequestParam String username,
                                  @RequestParam String password1,
                                  @RequestParam String sex,
                                  @RequestParam String cls){

        studentService.addAStudent(name,username,password1,sex,cls);

        return new ModelAndView("redirect:/adminSudent");



    }



    /**
     *
     * 删除学生
     * */
@RequestMapping("/ToDeleteStudent")
public ModelAndView DeleteStudent(long id){
        studentService.DeleteStudent(id);
        return new  ModelAndView("redirect:/adminSudent");
}


/**
 * 查找所有楼宇
 *
 * 跳转到楼宇管理
 *
 * */

  @RequestMapping("/adminBuilding")
  public String toAdminBuilding(Model model){
      List<Building> buildings=buildingService.findAllBuilding();
      model.addAttribute("bulidings",buildings);
      return "AdminBuilding";



  }


/**
 * 查找所有寝室
 *
 * 跳转到寝室管理页面
 *
 *
 * */
  @RequestMapping("/admainRoom")
    public String toAdmainRoom(Model model){
        List<Room> rooms=iRoomService.findAllRoom();
        model.addAttribute("rooms",rooms);
        return "AdminRoom";

  }


  /**
   *
   * 跳转到修改寝室
   *
   * */

@RequestMapping("/ToUpdateRoom")
public String ToUpdateRoom(Long id,Model model){
    Room room=iRoomService.findOneRoom(id);
    model.addAttribute("room",room);
        return "UpdateRoom";

}




/**
 *
 * 修改寝室信息
 * */
@RequestMapping("/updateRoom")
public ModelAndView updateRoom(@RequestParam("id") long id,
                               @RequestParam("build") String build,
                               @RequestParam("name") String name,
                               @RequestParam("people") String people,
                               @RequestParam("tel") String tel){

    iRoomService.updateRoom(id, build, name, people, tel);
    return new ModelAndView("redirect:/admainRoom");

}



/**
 *
 * 跳转到添加寝室
 *
 * */
@RequestMapping("/ToAddRoom")
public String ToAddRoom(){
        return "AddRoom";

}

/**
 *
 * 添加寝室
 * */
@RequestMapping("/AddARoom")

   public  ModelAndView AddARoom(
                                 @RequestParam String build,
                                 @RequestParam String room,
                                 @RequestParam String people,
                                 @RequestParam String tel){

    iRoomService.AddARoom(build,room,people,tel);

    return new ModelAndView("redirect:/admainRoom");

}


/**
 * 删除寝室
 *
 * */

@RequestMapping("/ToDeleteRoom")
public ModelAndView DeleteRoom(Long id){
        iRoomService.DeleteRoom(id);
    return new  ModelAndView("redirect:/admainRoom");

}

/**
 *
 * 跳转到学生入住登记
 *
 * */

  @RequestMapping("/toStudentCheckin")
    public String ToAddStudent(){

        return "StudentCheckin";


  }


  /**
   * 跳转到学生迁出登记
   *
   * */
  @RequestMapping("/toStudentOut")

  public String ToStudentOut(){

        return "MoveOut1";

  }




  /**
   * 跳转到学生迁出记录
   *
   * */
  @RequestMapping("/toOuter")
  public String ToOuter(Model model){

       List<Outers> outers=outersService.findAllOuters();
       model.addAttribute("outers",outers);
       return "AdminOuter";

  }

/**
 *
 * 跳转到修改管理员密码
 * */

  @RequestMapping("/toChangAdminPassword")
    public String ToChangAdminPassword(){

        return "ModifyPassword";


  }






  public String UpdatePWD(HttpSession session,Long id){

        Admins admins= (Admins) session.getAttribute("admin");
        long ID =admins.getAdminid();
        return null;
  }



  /**
   * 清除登录信息
   * 返回登录界面
   * */
public  String logout(HttpSession session){
        session.removeAttribute("admin");
        return "Login";


}













    }







