package com.pojo;

public class Teacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacherId
     *
     * @mbg.generated
     */
    private Long teacherid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacherUsername
     *
     * @mbg.generated
     */
    private String teacherusername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacherPassword
     *
     * @mbg.generated
     */
    private String teacherpassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacherName
     *
     * @mbg.generated
     */
    private String teachername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacherSex
     *
     * @mbg.generated
     */
    private String teachersex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacherPhone
     *
     * @mbg.generated
     */
    private String teacherphone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacherId
     *
     * @return the value of teacher.teacherId
     *
     * @mbg.generated
     */
    public Long getTeacherid() {
        return teacherid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacherId
     *
     * @param teacherid the value for teacher.teacherId
     *
     * @mbg.generated
     */
    public void setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacherUsername
     *
     * @return the value of teacher.teacherUsername
     *
     * @mbg.generated
     */
    public String getTeacherusername() {
        return teacherusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacherUsername
     *
     * @param teacherusername the value for teacher.teacherUsername
     *
     * @mbg.generated
     */
    public void setTeacherusername(String teacherusername) {
        this.teacherusername = teacherusername == null ? null : teacherusername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacherPassword
     *
     * @return the value of teacher.teacherPassword
     *
     * @mbg.generated
     */
    public String getTeacherpassword() {
        return teacherpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacherPassword
     *
     * @param teacherpassword the value for teacher.teacherPassword
     *
     * @mbg.generated
     */
    public void setTeacherpassword(String teacherpassword) {
        this.teacherpassword = teacherpassword == null ? null : teacherpassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacherName
     *
     * @return the value of teacher.teacherName
     *
     * @mbg.generated
     */
    public String getTeachername() {
        return teachername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacherName
     *
     * @param teachername the value for teacher.teacherName
     *
     * @mbg.generated
     */
    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacherSex
     *
     * @return the value of teacher.teacherSex
     *
     * @mbg.generated
     */
    public String getTeachersex() {
        return teachersex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacherSex
     *
     * @param teachersex the value for teacher.teacherSex
     *
     * @mbg.generated
     */
    public void setTeachersex(String teachersex) {
        this.teachersex = teachersex == null ? null : teachersex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacherPhone
     *
     * @return the value of teacher.teacherPhone
     *
     * @mbg.generated
     */
    public String getTeacherphone() {
        return teacherphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacherPhone
     *
     * @param teacherphone the value for teacher.teacherPhone
     *
     * @mbg.generated
     */
    public void setTeacherphone(String teacherphone) {
        this.teacherphone = teacherphone == null ? null : teacherphone.trim();
    }
}