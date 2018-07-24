package com.mr.bom.dao.domain;

import java.util.Date;

public class UserWhse {
    private String userWhseId;

    private String memId;

    private String memCode;

    private String whseId;

    private String whseCode;

    private String whseName;

    private String userId;

    private String userName;

    private String channelClientId;

    private String channelClinetNbr;

    private Date creationDate;

    private Date lastModifyDate;

    private String creator;

    private String modifiedBy;

    private Integer status;

    public String getUserWhseId() {
        return userWhseId;
    }

    public void setUserWhseId(String userWhseId) {
        this.userWhseId = userWhseId == null ? null : userWhseId.trim();
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

    public String getWhseId() {
        return whseId;
    }

    public void setWhseId(String whseId) {
        this.whseId = whseId == null ? null : whseId.trim();
    }

    public String getWhseCode() {
        return whseCode;
    }

    public void setWhseCode(String whseCode) {
        this.whseCode = whseCode == null ? null : whseCode.trim();
    }

    public String getWhseName() {
        return whseName;
    }

    public void setWhseName(String whseName) {
        this.whseName = whseName == null ? null : whseName.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
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
}