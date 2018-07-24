package com.mr.bom.dao.domain;

import java.util.Date;

public class User {
    private String userId;

    private String memId;

    private String memCode;

    private String userName;

    private Integer userType;

    private String pwd;

    private String realname;

    private String whseId;

    private Date creationDate;

    private Date lastModifyDate;

    private String creator;

    private String modifiedBy;

    private Integer status;

    private String vdrId;

    private String vdrName;

    private String vdrCode;

    private String channelClientId;

    private String channelClinetNbr;

    private String channelId;

    private String channelName;

    private String distributorId;

    private String distributorCode;

    private String distributorName;

    private String currLogginWhseid;

    private String currLogginWhsecode;

    private String currLogginWhsename;

    private String mobile;

    private String email;

    private String locale;

    private Date lastChangePwdTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId == null ? null : memId.trim();
    }

    public String getMemCode() {
        return memCode;
    }

    public void setMemCode(String memCode) {
        this.memCode = memCode == null ? null : memCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getWhseId() {
        return whseId;
    }

    public void setWhseId(String whseId) {
        this.whseId = whseId == null ? null : whseId.trim();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getVdrId() {
        return vdrId;
    }

    public void setVdrId(String vdrId) {
        this.vdrId = vdrId == null ? null : vdrId.trim();
    }

    public String getVdrName() {
        return vdrName;
    }

    public void setVdrName(String vdrName) {
        this.vdrName = vdrName == null ? null : vdrName.trim();
    }

    public String getVdrCode() {
        return vdrCode;
    }

    public void setVdrCode(String vdrCode) {
        this.vdrCode = vdrCode == null ? null : vdrCode.trim();
    }

    public String getChannelClientId() {
        return channelClientId;
    }

    public void setChannelClientId(String channelClientId) {
        this.channelClientId = channelClientId == null ? null : channelClientId.trim();
    }

    public String getChannelClinetNbr() {
        return channelClinetNbr;
    }

    public void setChannelClinetNbr(String channelClinetNbr) {
        this.channelClinetNbr = channelClinetNbr == null ? null : channelClinetNbr.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId == null ? null : distributorId.trim();
    }

    public String getDistributorCode() {
        return distributorCode;
    }

    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode == null ? null : distributorCode.trim();
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName == null ? null : distributorName.trim();
    }

    public String getCurrLogginWhseid() {
        return currLogginWhseid;
    }

    public void setCurrLogginWhseid(String currLogginWhseid) {
        this.currLogginWhseid = currLogginWhseid == null ? null : currLogginWhseid.trim();
    }

    public String getCurrLogginWhsecode() {
        return currLogginWhsecode;
    }

    public void setCurrLogginWhsecode(String currLogginWhsecode) {
        this.currLogginWhsecode = currLogginWhsecode == null ? null : currLogginWhsecode.trim();
    }

    public String getCurrLogginWhsename() {
        return currLogginWhsename;
    }

    public void setCurrLogginWhsename(String currLogginWhsename) {
        this.currLogginWhsename = currLogginWhsename == null ? null : currLogginWhsename.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale == null ? null : locale.trim();
    }

    public Date getLastChangePwdTime() {
        return lastChangePwdTime;
    }

    public void setLastChangePwdTime(Date lastChangePwdTime) {
        this.lastChangePwdTime = lastChangePwdTime;
    }
}