package com.zhiyou.hiber002.model;
// Generated 2017-9-6 14:40:31 by Hibernate Tools 5.2.3.Final


import java.util.Date;

/**
 * Role generated by hbm2java
 */
public class Role  implements java.io.Serializable {


     private Integer roleId;
     private String roleName;
     private String roleDesc;
     private Integer rolePermission;
     private Byte status;
     private String remark;
     private Date createTime;
     private Integer creater;
     private Date updateTime;
     private Integer updater;

    public Role() {
    }

    public Role(String roleName, String roleDesc, Integer rolePermission, Byte status, String remark, Date createTime, Integer creater, Date updateTime, Integer updater) {
       this.roleName = roleName;
       this.roleDesc = roleDesc;
       this.rolePermission = rolePermission;
       this.status = status;
       this.remark = remark;
       this.createTime = createTime;
       this.creater = creater;
       this.updateTime = updateTime;
       this.updater = updater;
    }
   
    public Integer getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getRoleDesc() {
        return this.roleDesc;
    }
    
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
    public Integer getRolePermission() {
        return this.rolePermission;
    }
    
    public void setRolePermission(Integer rolePermission) {
        this.rolePermission = rolePermission;
    }
    public Byte getStatus() {
        return this.status;
    }
    
    public void setStatus(Byte status) {
        this.status = status;
    }
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Integer getCreater() {
        return this.creater;
    }
    
    public void setCreater(Integer creater) {
        this.creater = creater;
    }
    public Date getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Integer getUpdater() {
        return this.updater;
    }
    
    public void setUpdater(Integer updater) {
        this.updater = updater;
    }




}

