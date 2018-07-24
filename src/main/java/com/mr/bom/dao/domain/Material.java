package com.mr.bom.dao.domain;

import java.util.Date;

public class Material {
    private String workorderDtlId;

    private String memId;

    private String memCode;

    private String workorderId;

    private String workorderCode;

    private String skuId;

    private String skuCode;

    private String vdrCode;

    private String skuName;

    private String batchNbr;

    private Double skuCost;

    private Integer workorderSkuType;

    private Integer skuType;

    private String mfgSkuCode;

    private Integer materialQty;

    private Integer needMaterialQty;

    private Integer status;

    private Date creationDate;

    private Date lastModifyDate;

    private String creator;

    private String modifiedBy;

    private String serialNbr;

    private Date xpireDate;

    private Integer inventoryType;

    private Date omsXpireDate;

    public String getWorkorderDtlId() {
        return workorderDtlId;
    }

    public void setWorkorderDtlId(String workorderDtlId) {
        this.workorderDtlId = workorderDtlId == null ? null : workorderDtlId.trim();
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

    public String getWorkorderId() {
        return workorderId;
    }

    public void setWorkorderId(String workorderId) {
        this.workorderId = workorderId == null ? null : workorderId.trim();
    }

    public String getWorkorderCode() {
        return workorderCode;
    }

    public void setWorkorderCode(String workorderCode) {
        this.workorderCode = workorderCode == null ? null : workorderCode.trim();
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId == null ? null : skuId.trim();
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public String getVdrCode() {
        return vdrCode;
    }

    public void setVdrCode(String vdrCode) {
        this.vdrCode = vdrCode == null ? null : vdrCode.trim();
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    public String getBatchNbr() {
        return batchNbr;
    }

    public void setBatchNbr(String batchNbr) {
        this.batchNbr = batchNbr == null ? null : batchNbr.trim();
    }

    public Double getSkuCost() {
        return skuCost;
    }

    public void setSkuCost(Double skuCost) {
        this.skuCost = skuCost;
    }

    public Integer getWorkorderSkuType() {
        return workorderSkuType;
    }

    public void setWorkorderSkuType(Integer workorderSkuType) {
        this.workorderSkuType = workorderSkuType;
    }

    public Integer getSkuType() {
        return skuType;
    }

    public void setSkuType(Integer skuType) {
        this.skuType = skuType;
    }

    public String getMfgSkuCode() {
        return mfgSkuCode;
    }

    public void setMfgSkuCode(String mfgSkuCode) {
        this.mfgSkuCode = mfgSkuCode == null ? null : mfgSkuCode.trim();
    }

    public Integer getMaterialQty() {
        return materialQty;
    }

    public void setMaterialQty(Integer materialQty) {
        this.materialQty = materialQty;
    }

    public Integer getNeedMaterialQty() {
        return needMaterialQty;
    }

    public void setNeedMaterialQty(Integer needMaterialQty) {
        this.needMaterialQty = needMaterialQty;
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

    public String getSerialNbr() {
        return serialNbr;
    }

    public void setSerialNbr(String serialNbr) {
        this.serialNbr = serialNbr == null ? null : serialNbr.trim();
    }

    public Date getXpireDate() {
        return xpireDate;
    }

    public void setXpireDate(Date xpireDate) {
        this.xpireDate = xpireDate;
    }

    public Integer getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(Integer inventoryType) {
        this.inventoryType = inventoryType;
    }

    public Date getOmsXpireDate() {
        return omsXpireDate;
    }

    public void setOmsXpireDate(Date omsXpireDate) {
        this.omsXpireDate = omsXpireDate;
    }
}