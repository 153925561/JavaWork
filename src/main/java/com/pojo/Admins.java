package com.pojo;

public class Admins {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.adminId
     *
     * @mbg.generated
     */
    private Long adminid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.adminUsername
     *
     * @mbg.generated
     */
    private String adminusername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.adminPassword
     *
     * @mbg.generated
     */
    private String adminpassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.adminId
     *
     * @return the value of admins.adminId
     *
     * @mbg.generated
     */
    public Long getAdminid() {
        return adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.adminId
     *
     * @param adminid the value for admins.adminId
     *
     * @mbg.generated
     */
    public void setAdminid(Long adminid) {
        this.adminid = adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.adminUsername
     *
     * @return the value of admins.adminUsername
     *
     * @mbg.generated
     */
    public String getAdminusername() {
        return adminusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.adminUsername
     *
     * @param adminusername the value for admins.adminUsername
     *
     * @mbg.generated
     */
    public void setAdminusername(String adminusername) {
        this.adminusername = adminusername == null ? null : adminusername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.adminPassword
     *
     * @return the value of admins.adminPassword
     *
     * @mbg.generated
     */
    public String getAdminpassword() {
        return adminpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.adminPassword
     *
     * @param adminpassword the value for admins.adminPassword
     *
     * @mbg.generated
     */
    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }
}