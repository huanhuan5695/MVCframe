package com.lenovo.ai.admin.generator.model;

import java.util.Date;

public class USER {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ID
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.EMAIL
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.PASSWORD
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.NAME
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.DESCRIPTION
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.CREATTIME
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    private Date creattime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.APPROVETIME
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    private Date approvetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.APPROVERID
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    private Long approverid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ROLEID
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    private Integer roleid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ID
     *
     * @return the value of user.ID
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ID
     *
     * @param id the value for user.ID
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.EMAIL
     *
     * @return the value of user.EMAIL
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.EMAIL
     *
     * @param email the value for user.EMAIL
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.PASSWORD
     *
     * @return the value of user.PASSWORD
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.PASSWORD
     *
     * @param password the value for user.PASSWORD
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.NAME
     *
     * @return the value of user.NAME
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.NAME
     *
     * @param name the value for user.NAME
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.DESCRIPTION
     *
     * @return the value of user.DESCRIPTION
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.DESCRIPTION
     *
     * @param description the value for user.DESCRIPTION
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.CREATTIME
     *
     * @return the value of user.CREATTIME
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public Date getCreattime() {
        return creattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.CREATTIME
     *
     * @param creattime the value for user.CREATTIME
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.APPROVETIME
     *
     * @return the value of user.APPROVETIME
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public Date getApprovetime() {
        return approvetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.APPROVETIME
     *
     * @param approvetime the value for user.APPROVETIME
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public void setApprovetime(Date approvetime) {
        this.approvetime = approvetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.APPROVERID
     *
     * @return the value of user.APPROVERID
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public Long getApproverid() {
        return approverid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.APPROVERID
     *
     * @param approverid the value for user.APPROVERID
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public void setApproverid(Long approverid) {
        this.approverid = approverid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ROLEID
     *
     * @return the value of user.ROLEID
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ROLEID
     *
     * @param roleid the value for user.ROLEID
     *
     * @mbg.generated Fri Aug 18 16:01:09 CST 2017
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}