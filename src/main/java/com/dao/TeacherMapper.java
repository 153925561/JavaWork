package com.dao;

import com.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long teacherid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    int insert(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    Teacher selectByPrimaryKey(Long teacherid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    List<Teacher> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Teacher record);

    Teacher findTeacherByup(@Param("username") String username, @Param("password") String password);

    void updateTeacher(@Param("id") Long id, @Param("name") String name, @Param("username") String username, @Param("password") String password1, @Param("tel") String tel);

    void addAteacher( @Param("name") String name, @Param("username") String username, @Param("password") String password1, @Param("sex") String sex, @Param("tel") String tel);

}