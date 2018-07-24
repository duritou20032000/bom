package com.mr.bom.dao.domain;

import java.util.Date;

public class Order {
    private String workorderId;

    private String memId;

    private String memCode;

    private String workorderCode;

    private Integer workorderType;

    private Double preQty;

    private Double completeQty;

    private Double omsPreQty;

    private String channelClientId;

    private String channelClientNbr;

    private Integer status;

    private Date creationDate;

    private Date lastModifyDate;

    private String creator;

    private String modifiedBy;

    private String parentWorkorderId;

    private String waveId;

    private String waveNbr;

    private String pktId;

    private String pktNbr;

    private String picker;

    private Date pickStartTime;

    private Date pickEndTime;

    private String closer;

    private Date closeTime;

    private String whseId;

    private String whseCode;

    private String omsWorkorderId;

    private String omsWorkorderCode;

    private Integer autoAudit;

    public String getWorkorderId() {
        return workorderId;
    }

    public void setWorkorderId(String workorderId) {
        this.workorderId = workorderId == null ? null : workorderId.trim();
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

    public String getWorkorderCode() {
        return workorderCode;
    }

    public void setWorkorderCode(String workorderCode) {
        this.workorderCode = workorderCode == null ? null : workorderCode.trim();
    }

    public Integer getWorkorderType() {
        return workorderType;
    }

    public void setWorkorderType(Integer workorderType) {
        this.workorderType = workorderType;
    }

    public Double getPreQty() {
        return preQty;
    }

    public void setPreQty(Double preQty) {
        this.preQty = preQty;
    }

    public Double getCompleteQty() {
        return completeQty;
    }

    public void setCompleteQty(Double completeQty) {
        this.completeQty = completeQty;
    }

    public Double getOmsPreQty() {
        return omsPreQty;
    }

    public void setOmsPreQty(Double omsPreQty) {
        this.omsPreQty = omsPreQty;
    }

    public String getChannelClientId() {
        return channelClientId;
    }

    public void setChannelClientId(String channelClientId) {
        this.channelClientId = channelClientId == null ? null : channelClientId.trim();
    }

    public String getChannelClientNbr() {
        return channelClientNbr;
    }

    public void setChannelClientNbr(String channelClientNbr) {
        this.channelClientNbr = channelClientNbr == null ? null : channelClientNbr.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getParentWorkorderId() {
        return parentWorkorderId;
    }

    public void setParentWorkorderId(String parentWorkorderId) {
        this.parentWorkorderId = parentWorkorderId == null ? null : parentWorkorderId.trim();
    }

    public String getWaveId() {
        return waveId;
    }

    public void setWaveId(String waveId) {
        this.waveId = waveId == null ? null : waveId.trim();
    }

    public String getWaveNbr() {
        return waveNbr;
    }

    public void setWaveNbr(String waveNbr) {
        this.waveNbr = waveNbr == null ? null : waveNbr.trim();
    }

    public String getPktId() {
        return pktId;
    }

    public void setPktId(String pktId) {
        this.pktId = pktId == null ? null : pktId.trim();
    }

    public String getPktNbr() {
        return pktNbr;
    }

    public void setPktNbr(String pktNbr) {
        this.pktNbr = pktNbr == null ? null : pktNbr.trim();
    }

    public String getPicker() {
        return picker;
    }

    public void setPicker(String picker) {
        this.picker = picker == null ? null : picker.trim();
    }

    public Date getPickStartTime() {
        return pickStartTime;
    }

    public void setPickStartTime(Date pickStartTime) {
        this.pickStartTime = pickStartTime;
    }

    public Date getPickEndTime() {
        return pickEndTime;
    }

    public void setPickEndTime(Date pickEndTime) {
        this.pickEndTime = pickEndTime;
    }

    public String getCloser() {
        return closer;
    }

    public void setCloser(String closer) {
        this.closer = closer == null ? null : closer.trim();
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
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

    public String getOmsWorkorderId() {
        return omsWorkorderId;
    }

    public void setOmsWorkorderId(String omsWorkorderId) {
        this.omsWorkorderId = omsWorkorderId == null ? null : omsWorkorderId.trim();
    }

    public String getOmsWorkorderCode() {
        return omsWorkorderCode;
    }

    public void setOmsWorkorderCode(String omsWorkorderCode) {
        this.omsWorkorderCode = omsWorkorderCode == null ? null : omsWorkorderCode.trim();
    }

    public Integer getAutoAudit() {
        return autoAudit;
    }

    public void setAutoAudit(Integer autoAudit) {
        this.autoAudit = autoAudit;
    }
}