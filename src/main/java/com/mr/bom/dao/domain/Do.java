package com.mr.bom.dao.domain;

import java.util.Date;

public class Do {
    private String doDtlId;

    private String memId;

    private String memCode;

    private String doId;

    private String doNbr;

    private Integer doSeqNbr;

    private String ownClientId;

    private String ownClientNbr;

    private String distributorClientId;

    private String distributorClientNbr;

    private String distributorId;

    private Integer orgFlag;

    private Double ordQty;

    private Double prePickQty;

    private Double pickQty;

    private Double pickBalance;

    private Double checkedQty;

    private Double packQty;

    private Double pickedOrdQty;

    private Double pickedPickQty;

    private String whseId;

    private String whseCode;

    private String pickLocnDtlId;

    private String skuId;

    private String skuCode;

    private String vdrCode;

    private String skuName;

    private Double cost;

    private Double costNoTax;

    private Date creationDate;

    private Date lastModifyDate;

    private String creator;

    private String modifiedBy;

    private Integer status;

    private String batchNbr;

    private String serialNbr;

    private Date xpireDate;

    private Integer inventoryType;

    private String crossborderImportTaxNo;

    private Double crossborderImportTaxRate;

    private String productCustomsRecord;

    private String postalTaxNo;

    private Double postalTaxRate;

    private Double customsDeclaredPrice;

    private Double unitPack;

    private String refOrder;

    public String getDoDtlId() {
        return doDtlId;
    }

    public void setDoDtlId(String doDtlId) {
        this.doDtlId = doDtlId == null ? null : doDtlId.trim();
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

    public String getDoId() {
        return doId;
    }

    public void setDoId(String doId) {
        this.doId = doId == null ? null : doId.trim();
    }

    public String getDoNbr() {
        return doNbr;
    }

    public void setDoNbr(String doNbr) {
        this.doNbr = doNbr == null ? null : doNbr.trim();
    }

    public Integer getDoSeqNbr() {
        return doSeqNbr;
    }

    public void setDoSeqNbr(Integer doSeqNbr) {
        this.doSeqNbr = doSeqNbr;
    }

    public String getOwnClientId() {
        return ownClientId;
    }

    public void setOwnClientId(String ownClientId) {
        this.ownClientId = ownClientId == null ? null : ownClientId.trim();
    }

    public String getOwnClientNbr() {
        return ownClientNbr;
    }

    public void setOwnClientNbr(String ownClientNbr) {
        this.ownClientNbr = ownClientNbr == null ? null : ownClientNbr.trim();
    }

    public String getDistributorClientId() {
        return distributorClientId;
    }

    public void setDistributorClientId(String distributorClientId) {
        this.distributorClientId = distributorClientId == null ? null : distributorClientId.trim();
    }

    public String getDistributorClientNbr() {
        return distributorClientNbr;
    }

    public void setDistributorClientNbr(String distributorClientNbr) {
        this.distributorClientNbr = distributorClientNbr == null ? null : distributorClientNbr.trim();
    }

    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId == null ? null : distributorId.trim();
    }

    public Integer getOrgFlag() {
        return orgFlag;
    }

    public void setOrgFlag(Integer orgFlag) {
        this.orgFlag = orgFlag;
    }

    public Double getOrdQty() {
        return ordQty;
    }

    public void setOrdQty(Double ordQty) {
        this.ordQty = ordQty;
    }

    public Double getPrePickQty() {
        return prePickQty;
    }

    public void setPrePickQty(Double prePickQty) {
        this.prePickQty = prePickQty;
    }

    public Double getPickQty() {
        return pickQty;
    }

    public void setPickQty(Double pickQty) {
        this.pickQty = pickQty;
    }

    public Double getPickBalance() {
        return pickBalance;
    }

    public void setPickBalance(Double pickBalance) {
        this.pickBalance = pickBalance;
    }

    public Double getCheckedQty() {
        return checkedQty;
    }

    public void setCheckedQty(Double checkedQty) {
        this.checkedQty = checkedQty;
    }

    public Double getPackQty() {
        return packQty;
    }

    public void setPackQty(Double packQty) {
        this.packQty = packQty;
    }

    public Double getPickedOrdQty() {
        return pickedOrdQty;
    }

    public void setPickedOrdQty(Double pickedOrdQty) {
        this.pickedOrdQty = pickedOrdQty;
    }

    public Double getPickedPickQty() {
        return pickedPickQty;
    }

    public void setPickedPickQty(Double pickedPickQty) {
        this.pickedPickQty = pickedPickQty;
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

    public String getPickLocnDtlId() {
        return pickLocnDtlId;
    }

    public void setPickLocnDtlId(String pickLocnDtlId) {
        this.pickLocnDtlId = pickLocnDtlId == null ? null : pickLocnDtlId.trim();
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

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getCostNoTax() {
        return costNoTax;
    }

    public void setCostNoTax(Double costNoTax) {
        this.costNoTax = costNoTax;
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

    public String getBatchNbr() {
        return batchNbr;
    }

    public void setBatchNbr(String batchNbr) {
        this.batchNbr = batchNbr == null ? null : batchNbr.trim();
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

    public String getCrossborderImportTaxNo() {
        return crossborderImportTaxNo;
    }

    public void setCrossborderImportTaxNo(String crossborderImportTaxNo) {
        this.crossborderImportTaxNo = crossborderImportTaxNo == null ? null : crossborderImportTaxNo.trim();
    }

    public Double getCrossborderImportTaxRate() {
        return crossborderImportTaxRate;
    }

    public void setCrossborderImportTaxRate(Double crossborderImportTaxRate) {
        this.crossborderImportTaxRate = crossborderImportTaxRate;
    }

    public String getProductCustomsRecord() {
        return productCustomsRecord;
    }

    public void setProductCustomsRecord(String productCustomsRecord) {
        this.productCustomsRecord = productCustomsRecord == null ? null : productCustomsRecord.trim();
    }

    public String getPostalTaxNo() {
        return postalTaxNo;
    }

    public void setPostalTaxNo(String postalTaxNo) {
        this.postalTaxNo = postalTaxNo == null ? null : postalTaxNo.trim();
    }

    public Double getPostalTaxRate() {
        return postalTaxRate;
    }

    public void setPostalTaxRate(Double postalTaxRate) {
        this.postalTaxRate = postalTaxRate;
    }

    public Double getCustomsDeclaredPrice() {
        return customsDeclaredPrice;
    }

    public void setCustomsDeclaredPrice(Double customsDeclaredPrice) {
        this.customsDeclaredPrice = customsDeclaredPrice;
    }

    public Double getUnitPack() {
        return unitPack;
    }

    public void setUnitPack(Double unitPack) {
        this.unitPack = unitPack;
    }

    public String getRefOrder() {
        return refOrder;
    }

    public void setRefOrder(String refOrder) {
        this.refOrder = refOrder == null ? null : refOrder.trim();
    }
}