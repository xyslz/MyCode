/**  
 * Title: Complete_RcvRptDocLine.java<p>
 * Description:入库单行<br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 杨雪景
 * @date 2018年12月12日
 * @version 1.0  
 */
package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
 * Title: Complete_RcvRptDocLine
 * <p>
 * Description:入库单行 <br>
 * 
 * @author 杨雪景
 * @date 2018年12月12日
 */
@Table(name = "Complete_RcvRptDocLine")
public class RcvRptDocLine extends BaseTable {

	private static final long serialVersionUID = 212101567025145570L;

	@Column(name = "ID")
	private String id;

	@Column(name = "org")
	private String org;

	@Column(name = "AAIFlag")
	private Integer aAIFlag;

	@Column(name = "AAIStatus")
	private Integer aAIStatus;

	@Column(name = "BenefitDept")
	private String benefitDept;

	@Column(name = "Bin")
	private String bin;

	@Column(name = "Cost")
	private Double cost;

	@Column(name = "CostBaseUOM")
	private String costBaseUOM;

	@Column(name = "CostField")
	private String costField;

	@Column(name = "CostPercent")
	private Double costPercent;

	@Column(name = "CoUOM")
	private String coUOM;
	
	@Column(name = "coUOMName", readonly = true)
	@Relation(table = "BD_UOM", value = "id", ref = "coUOM", show = "name")
	private String coUOMName;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedOn")
	private String createdOn;

	@Column(name = "Currency")
	private String currency;

	@Column(name = "CUToCBURate")
	private Double cUToCBURate;

	@Column(name = "DescFlexField_ContextValue")
	private String descFlexFieldContextValue;

	@Column(name = "DescFlexField_PrivateDescSeg1")
	private String descFlexFieldPrivateDescSeg1;

	@Column(name = "DescFlexField_PrivateDescSeg10")
	private String descFlexFieldPrivateDescSeg10;

	@Column(name = "DescFlexField_PrivateDescSeg11")
	private String descFlexFieldPrivateDescSeg11;

	@Column(name = "DescFlexField_PrivateDescSeg12")
	private String descFlexFieldPrivateDescSeg12;

	@Column(name = "DescFlexField_PrivateDescSeg13")
	private String descFlexFieldPrivateDescSeg13;

	@Column(name = "DescFlexField_PrivateDescSeg14")
	private String descFlexFieldPrivateDescSeg14;

	@Column(name = "DescFlexField_PrivateDescSeg15")
	private String descFlexFieldPrivateDescSeg15;

	@Column(name = "DescFlexField_PrivateDescSeg16")
	private String descFlexFieldPrivateDescSeg16;

	@Column(name = "DescFlexField_PrivateDescSeg17")
	private String descFlexFieldPrivateDescSeg17;

	@Column(name = "DescFlexField_PrivateDescSeg18")
	private String descFlexFieldPrivateDescSeg18;

	@Column(name = "DescFlexField_PrivateDescSeg19")
	private String descFlexFieldPrivateDescSeg19;

	@Column(name = "DescFlexField_PrivateDescSeg2")
	private String descFlexFieldPrivateDescSeg2;

	@Column(name = "DescFlexField_PrivateDescSeg20")
	private String descFlexFieldPrivateDescSeg20;

	@Column(name = "DescFlexField_PrivateDescSeg21")
	private String descFlexFieldPrivateDescSeg21;

	@Column(name = "DescFlexField_PrivateDescSeg22")
	private String descFlexFieldPrivateDescSeg22;

	@Column(name = "DescFlexField_PrivateDescSeg23")
	private String descFlexFieldPrivateDescSeg23;

	@Column(name = "DescFlexField_PrivateDescSeg24")
	private String descFlexFieldPrivateDescSeg24;

	@Column(name = "DescFlexField_PrivateDescSeg25")
	private String descFlexFieldPrivateDescSeg25;

	@Column(name = "DescFlexField_PrivateDescSeg26")
	private String descFlexFieldPrivateDescSeg26;

	@Column(name = "DescFlexField_PrivateDescSeg27")
	private String descFlexFieldPrivateDescSeg27;

	@Column(name = "DescFlexField_PrivateDescSeg28")
	private String descFlexFieldPrivateDescSeg28;

	@Column(name = "DescFlexField_PrivateDescSeg29")
	private String descFlexFieldPrivateDescSeg29;

	@Column(name = "DescFlexField_PrivateDescSeg3")
	private String descFlexFieldPrivateDescSeg3;

	@Column(name = "DescFlexField_PrivateDescSeg30")
	private String descFlexFieldPrivateDescSeg30;

	@Column(name = "DescFlexField_PrivateDescSeg4")
	private String descFlexFieldPrivateDescSeg4;

	@Column(name = "DescFlexField_PrivateDescSeg5")
	private String descFlexFieldPrivateDescSeg5;

	@Column(name = "DescFlexField_PrivateDescSeg6")
	private String descFlexFieldPrivateDescSeg6;

	@Column(name = "DescFlexField_PrivateDescSeg7")
	private String descFlexFieldPrivateDescSeg7;

	@Column(name = "DescFlexField_PrivateDescSeg8")
	private String descFlexFieldPrivateDescSeg8;

	@Column(name = "DescFlexField_PrivateDescSeg9")
	private String descFlexFieldPrivateDescSeg9;

	@Column(name = "DescFlexField_PubDescSeg1")
	private String descFlexFieldPubDescSeg1;

	@Column(name = "DescFlexField_PubDescSeg10")
	private String descFlexFieldPubDescSeg10;

	@Column(name = "DescFlexField_PubDescSeg11")
	private String descFlexFieldPubDescSeg11;

	@Column(name = "DescFlexField_PubDescSeg12")
	private String descFlexFieldPubDescSeg12;

	@Column(name = "DescFlexField_PubDescSeg13")
	private String descFlexFieldPubDescSeg13;

	@Column(name = "DescFlexField_PubDescSeg14")
	private String descFlexFieldPubDescSeg14;

	@Column(name = "DescFlexField_PubDescSeg15")
	private String descFlexFieldPubDescSeg15;

	@Column(name = "DescFlexField_PubDescSeg16")
	private String descFlexFieldPubDescSeg16;

	@Column(name = "DescFlexField_PubDescSeg17")
	private String descFlexFieldPubDescSeg17;

	@Column(name = "DescFlexField_PubDescSeg18")
	private String descFlexFieldPubDescSeg18;

	@Column(name = "DescFlexField_PubDescSeg19")
	private String descFlexFieldPubDescSeg19;

	@Column(name = "DescFlexField_PubDescSeg2")
	private String descFlexFieldPubDescSeg2;

	@Column(name = "DescFlexField_PubDescSeg20")
	private String descFlexFieldPubDescSeg20;

	@Column(name = "DescFlexField_PubDescSeg21")
	private String descFlexFieldPubDescSeg21;

	@Column(name = "DescFlexField_PubDescSeg22")
	private String descFlexFieldPubDescSeg22;

	@Column(name = "DescFlexField_PubDescSeg23")
	private String descFlexFieldPubDescSeg23;

	@Column(name = "DescFlexField_PubDescSeg24")
	private String descFlexFieldPubDescSeg24;

	@Column(name = "DescFlexField_PubDescSeg25")
	private String descFlexFieldPubDescSeg25;

	@Column(name = "DescFlexField_PubDescSeg26")
	private String descFlexFieldPubDescSeg26;

	@Column(name = "DescFlexField_PubDescSeg27")
	private String descFlexFieldPubDescSeg27;

	@Column(name = "DescFlexField_PubDescSeg28")
	private String descFlexFieldPubDescSeg28;

	@Column(name = "DescFlexField_PubDescSeg29")
	private String descFlexFieldPubDescSeg29;

	@Column(name = "DescFlexField_PubDescSeg3")
	private String descFlexFieldPubDescSeg3;

	@Column(name = "DescFlexField_PubDescSeg30")
	private String descFlexFieldPubDescSeg30;

	@Column(name = "DescFlexField_PubDescSeg31")
	private String descFlexFieldPubDescSeg31;

	@Column(name = "DescFlexField_PubDescSeg32")
	private String descFlexFieldPubDescSeg32;

	@Column(name = "DescFlexField_PubDescSeg33")
	private String descFlexFieldPubDescSeg33;

	@Column(name = "DescFlexField_PubDescSeg34")
	private String descFlexFieldPubDescSeg34;

	@Column(name = "DescFlexField_PubDescSeg35")
	private String descFlexFieldPubDescSeg35;

	@Column(name = "DescFlexField_PubDescSeg36")
	private String descFlexFieldPubDescSeg36;

	@Column(name = "DescFlexField_PubDescSeg37")
	private String descFlexFieldPubDescSeg37;

	@Column(name = "DescFlexField_PubDescSeg38")
	private String descFlexFieldPubDescSeg38;

	@Column(name = "DescFlexField_PubDescSeg39")
	private String descFlexFieldPubDescSeg39;

	@Column(name = "DescFlexField_PubDescSeg4")
	private String descFlexFieldPubDescSeg4;

	@Column(name = "DescFlexField_PubDescSeg40")
	private String descFlexFieldPubDescSeg40;

	@Column(name = "DescFlexField_PubDescSeg41")
	private String descFlexFieldPubDescSeg41;

	@Column(name = "DescFlexField_PubDescSeg42")
	private String descFlexFieldPubDescSeg42;

	@Column(name = "DescFlexField_PubDescSeg43")
	private String descFlexFieldPubDescSeg43;

	@Column(name = "DescFlexField_PubDescSeg44")
	private String descFlexFieldPubDescSeg44;

	@Column(name = "DescFlexField_PubDescSeg45")
	private String descFlexFieldPubDescSeg45;

	@Column(name = "DescFlexField_PubDescSeg46")
	private String descFlexFieldPubDescSeg46;

	@Column(name = "DescFlexField_PubDescSeg47")
	private String descFlexFieldPubDescSeg47;

	@Column(name = "DescFlexField_PubDescSeg48")
	private String descFlexFieldPubDescSeg48;

	@Column(name = "DescFlexField_PubDescSeg49")
	private String descFlexFieldPubDescSeg49;

	@Column(name = "DescFlexField_PubDescSeg5")
	private String descFlexFieldPubDescSeg5;

	@Column(name = "DescFlexField_PubDescSeg50")
	private String descFlexFieldPubDescSeg50;

	@Column(name = "DescFlexField_PubDescSeg6")
	private String descFlexFieldPubDescSeg6;

	@Column(name = "DescFlexField_PubDescSeg7")
	private String descFlexFieldPubDescSeg7;

	@Column(name = "DescFlexField_PubDescSeg8")
	private String descFlexFieldPubDescSeg8;

	@Column(name = "DescFlexField_PubDescSeg9")
	private String descFlexFieldPubDescSeg9;

	@Column(name = "Dr")
	private Integer dr;

	@Column(name = "Element")
	private Integer element;

	@Column(name = "Grade")
	private Integer grade;

	@Column(name = "isInternalTrade")
	private Integer isInternalTrade;

	@Column(name = "IsNeedGenAAI")
	private Integer isNeedGenAAI;

	@Column(name = "IsOverCostField")
	private Integer isOverCostField;

	@Column(name = "IsQC")
	private Integer isQC;

	@Column(name = "IsSettled")
	private Integer isSettled;

	@Column(name = "IsTransferedToGL")
	private Integer isTransferedToGL;

	@Column(name = "Item")
	private String item;

	@Column(name = "ItemVersion")
	private String itemVersion;

	@Column(name = "LineNum")
	private Integer lineNum;

	@Column(name = "LineState")
	private Integer lineState;

	@Column(name = "MO")
	private String mo;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

	@Column(name = "MOOutput")
	private String mOOutput;

	@Column(name = "OperationState")
	private Integer operationState;

	@Column(name = "OutputType")
	private Integer outputType;

	@Column(name = "OwnerOrg")
	private String ownerOrg;

	@Column(name = "PBUToCBURate")
	private Double pBUToCBURate;

	@Column(name = "PBUToSBURate")
	private Double pBUToSBURate;

	@Column(name = "PerformingOrg")
	private String performingOrg;

	@Column(name = "PLS")
	private String pls;

	@Column(name = "PLSOutput")
	private String pLSOutput;

	@Column(name = "Price")
	private Double price;

	@Column(name = "ProductBaseUOM")
	private String productBaseUOM;

	@Column(name = "ProductUOM")
	private String productUOM;

	@Column(name = "Project")
	private String project;

	@Column(name = "PUToPBURate")
	private Double pUToPBURate;

	@Column(name = "RcvLotDisableDate")
	private String rcvLotDisableDate;

	@Column(name = "RcvLotEffectivedate")
	private String rcvLotEffectivedate;

	@Column(name = "RcvLotMaster")
	private String rcvLotMaster;

	@Column(name = "RcvLotNo")
	private String rcvLotNo;

	@Column(name = "RcvOP")
	private String rcvOP;

	@Column(name = "RcvOPNo")
	private String rcvOPNo;

	@Column(name = "RcvOrg")
	private String rcvOrg;

	@Column(name = "RcvQtyByCostUom")
	private Double rcvQtyByCostUom;

	@Column(name = "RcvQtyByProductUOM")
	private Double rcvQtyByProductUOM;

	@Column(name = "RcvQtyByWhUOM")
	private Double rcvQtyByWhUOM;

	@Column(name = "RcvRptDoc")
	private String rcvRptDoc;

	@Column(name = "RcvRptLineBalanceRoute")
	private String rcvRptLineBalanceRoute;

	@Column(name = "RcvRptLineBalanceRouteDes")
	private String rcvRptLineBalanceRouteDes;

	@Column(name = "RcvSeiban")
	private String rcvSeiban;

	@Column(name = "RcvSeibanCode")
	private String rcvSeibanCode;

	@Column(name = "RcvValiddate")
	private Integer rcvValiddate;

	@Column(name = "Remark")
	private String remark;

	@Column(name = "SnCode")
	private String snCode;

	@Column(name = "SourceDoc_MOSrcDocType")
	private Integer sourceDocMOSrcDocType;

	@Column(name = "SourceDoc_SrcDoc_EntityID")
	private String sourceDocSrcDocEntityID;

	@Column(name = "SourceDoc_SrcDoc_EntityType")
	private String sourceDocSrcDocEntityType;

	@Column(name = "SourceDoc_SrcDocID")
	private String sourceDocSrcDocID;

	@Column(name = "SourceDoc_SrcDocLine_EntityID")
	private String sourceDocSrcDocLineEntityID;

	@Column(name = "SourceDoc_SrcDocLine_EntityType")
	private String sourceDocSrcDocLineEntityType;

	@Column(name = "SourceDoc_SrcDocLineID")
	private String sourceDocSrcDocLineID;

	@Column(name = "SourceDoc_SrcDocLineNo")
	private String sourceDocSrcDocLineNo;

	@Column(name = "SourceDoc_SrcDocNo")
	private String sourceDocSrcDocNo;

	@Column(name = "SourceDoc_SrcDocOrg")
	private String sourceDocSrcDocOrg;

	@Column(name = "SourceDoc_SrcDocSubline_EntityID")
	private String sourceDocSrcDocSublineEntityID;

	@Column(name = "SourceDoc_SrcDocSubline_EntityType")
	private String sourceDocSrcDocSublineEntityType;

	@Column(name = "SourceDoc_SrcDocSublineNo")
	private String sourceDocSrcDocSublineNo;

	@Column(name = "SourceDoc_SrcDocType")
	private String sourceDocSrcDocType;

	@Column(name = "SourceDoc_SrcDocVer")
	private String sourceDocSrcDocVer;

	@Column(name = "SourceRcvRptLine")
	private String sourceRcvRptLine;

	@Column(name = "StorageType")
	private Integer storageType;

	@Column(name = "StoreBaseUOM")
	private String storeBaseUOM;

	@Column(name = "StoreUOM")
	private String storeUOM;
	
	@Column(name = "storeUOMName", readonly = true)
	@Relation(table = "BD_UOM", value = "id", ref = "storeUOM", show = "name")
	private String storeUOMName;

	@Column(name = "SUToSBURate")
	private Double sUToSBURate;

	@Column(name = "SysVersion")
	private String sysVersion;

	@Column(name = "Task")
	private String task;

	@Column(name = "TotalAntiRcvQtyByCostUOM")
	private Double totalAntiRcvQtyByCostUOM;

	@Column(name = "TotalAntiRcvQtyByProductUOM")
	private Double totalAntiRcvQtyByProductUOM;

	@Column(name = "TotalAntiRcvQtyByWhUOM")
	private Double totalAntiRcvQtyByWhUOM;

	@Column(name = "TransferToGL")
	private Integer transferToGL;

	@Column(name = "Ts")
	private String ts;

	@Column(name = "VoucherDispNum")
	private String voucherDispNum;

	@Column(name = "VoucherID")
	private String voucherID;

	@Column(name = "VoucherTypeID")
	private String voucherTypeID;

	@Column(name = "Wh")
	private String wh;

	/**
	 * 新增字段库位编码
	 */
	@Column(name = "binCode", readonly = true)
	@Relation(table = "PM_Bin", value = "id", ref = "bin", show = "code")
	private String binCode;
	
	@Column(name = "binName", readonly = true)
	@Relation(table = "PM_Bin", value = "id", ref = "bin", show = "name")
	private String binName;

	/**
	 * 新增字段存储地点编码
	 */
	@Column(name = "whCode", readonly = true)
	@Relation(table = "BD_Wh", value = "id", ref = "wh", show = "code")
	private String whCode;
	
	@Column(name = "whName", readonly = true)
	@Relation(table = "BD_Wh", value = "id", ref = "wh", show = "name")
	private String whName;

	/**
	 * @return the binCode
	 */
	public String getBinCode() {
		return binCode;
	}

	/**
	 * @param binCode
	 *            the binCode to set
	 */
	public void setBinCode(String binCode) {
		this.binCode = binCode;
	}

	/**
	 * @return the whCode
	 */
	public String getWhCode() {
		return whCode;
	}

	/**
	 * @param whCode
	 *            the whCode to set
	 */
	public void setWhCode(String whCode) {
		this.whCode = whCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getaAIFlag() {
		return aAIFlag;
	}

	public void setaAIFlag(Integer aAIFlag) {
		this.aAIFlag = aAIFlag;
	}

	public Integer getaAIStatus() {
		return aAIStatus;
	}

	public void setaAIStatus(Integer aAIStatus) {
		this.aAIStatus = aAIStatus;
	}

	public String getBenefitDept() {
		return benefitDept;
	}

	public void setBenefitDept(String benefitDept) {
		this.benefitDept = benefitDept;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getCostBaseUOM() {
		return costBaseUOM;
	}

	public void setCostBaseUOM(String costBaseUOM) {
		this.costBaseUOM = costBaseUOM;
	}

	public String getCostField() {
		return costField;
	}

	public void setCostField(String costField) {
		this.costField = costField;
	}

	public Double getCostPercent() {
		return costPercent;
	}

	public void setCostPercent(Double costPercent) {
		this.costPercent = costPercent;
	}

	public String getCoUOM() {
		return coUOM;
	}

	public void setCoUOM(String coUOM) {
		this.coUOM = coUOM;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getcUToCBURate() {
		return cUToCBURate;
	}

	public void setcUToCBURate(Double cUToCBURate) {
		this.cUToCBURate = cUToCBURate;
	}

	public String getDescFlexFieldContextValue() {
		return descFlexFieldContextValue;
	}

	public void setDescFlexFieldContextValue(String descFlexFieldContextValue) {
		this.descFlexFieldContextValue = descFlexFieldContextValue;
	}

	public String getDescFlexFieldPrivateDescSeg1() {
		return descFlexFieldPrivateDescSeg1;
	}

	public void setDescFlexFieldPrivateDescSeg1(String descFlexFieldPrivateDescSeg1) {
		this.descFlexFieldPrivateDescSeg1 = descFlexFieldPrivateDescSeg1;
	}

	public String getDescFlexFieldPrivateDescSeg10() {
		return descFlexFieldPrivateDescSeg10;
	}

	public void setDescFlexFieldPrivateDescSeg10(String descFlexFieldPrivateDescSeg10) {
		this.descFlexFieldPrivateDescSeg10 = descFlexFieldPrivateDescSeg10;
	}

	public String getDescFlexFieldPrivateDescSeg11() {
		return descFlexFieldPrivateDescSeg11;
	}

	public void setDescFlexFieldPrivateDescSeg11(String descFlexFieldPrivateDescSeg11) {
		this.descFlexFieldPrivateDescSeg11 = descFlexFieldPrivateDescSeg11;
	}

	public String getDescFlexFieldPrivateDescSeg12() {
		return descFlexFieldPrivateDescSeg12;
	}

	public void setDescFlexFieldPrivateDescSeg12(String descFlexFieldPrivateDescSeg12) {
		this.descFlexFieldPrivateDescSeg12 = descFlexFieldPrivateDescSeg12;
	}

	public String getDescFlexFieldPrivateDescSeg13() {
		return descFlexFieldPrivateDescSeg13;
	}

	public void setDescFlexFieldPrivateDescSeg13(String descFlexFieldPrivateDescSeg13) {
		this.descFlexFieldPrivateDescSeg13 = descFlexFieldPrivateDescSeg13;
	}

	public String getDescFlexFieldPrivateDescSeg14() {
		return descFlexFieldPrivateDescSeg14;
	}

	public void setDescFlexFieldPrivateDescSeg14(String descFlexFieldPrivateDescSeg14) {
		this.descFlexFieldPrivateDescSeg14 = descFlexFieldPrivateDescSeg14;
	}

	public String getDescFlexFieldPrivateDescSeg15() {
		return descFlexFieldPrivateDescSeg15;
	}

	public void setDescFlexFieldPrivateDescSeg15(String descFlexFieldPrivateDescSeg15) {
		this.descFlexFieldPrivateDescSeg15 = descFlexFieldPrivateDescSeg15;
	}

	public String getDescFlexFieldPrivateDescSeg16() {
		return descFlexFieldPrivateDescSeg16;
	}

	public void setDescFlexFieldPrivateDescSeg16(String descFlexFieldPrivateDescSeg16) {
		this.descFlexFieldPrivateDescSeg16 = descFlexFieldPrivateDescSeg16;
	}

	public String getDescFlexFieldPrivateDescSeg17() {
		return descFlexFieldPrivateDescSeg17;
	}

	public void setDescFlexFieldPrivateDescSeg17(String descFlexFieldPrivateDescSeg17) {
		this.descFlexFieldPrivateDescSeg17 = descFlexFieldPrivateDescSeg17;
	}

	public String getDescFlexFieldPrivateDescSeg18() {
		return descFlexFieldPrivateDescSeg18;
	}

	public void setDescFlexFieldPrivateDescSeg18(String descFlexFieldPrivateDescSeg18) {
		this.descFlexFieldPrivateDescSeg18 = descFlexFieldPrivateDescSeg18;
	}

	public String getDescFlexFieldPrivateDescSeg19() {
		return descFlexFieldPrivateDescSeg19;
	}

	public void setDescFlexFieldPrivateDescSeg19(String descFlexFieldPrivateDescSeg19) {
		this.descFlexFieldPrivateDescSeg19 = descFlexFieldPrivateDescSeg19;
	}

	public String getDescFlexFieldPrivateDescSeg2() {
		return descFlexFieldPrivateDescSeg2;
	}

	public void setDescFlexFieldPrivateDescSeg2(String descFlexFieldPrivateDescSeg2) {
		this.descFlexFieldPrivateDescSeg2 = descFlexFieldPrivateDescSeg2;
	}

	public String getDescFlexFieldPrivateDescSeg20() {
		return descFlexFieldPrivateDescSeg20;
	}

	public void setDescFlexFieldPrivateDescSeg20(String descFlexFieldPrivateDescSeg20) {
		this.descFlexFieldPrivateDescSeg20 = descFlexFieldPrivateDescSeg20;
	}

	public String getDescFlexFieldPrivateDescSeg21() {
		return descFlexFieldPrivateDescSeg21;
	}

	public void setDescFlexFieldPrivateDescSeg21(String descFlexFieldPrivateDescSeg21) {
		this.descFlexFieldPrivateDescSeg21 = descFlexFieldPrivateDescSeg21;
	}

	public String getDescFlexFieldPrivateDescSeg22() {
		return descFlexFieldPrivateDescSeg22;
	}

	public void setDescFlexFieldPrivateDescSeg22(String descFlexFieldPrivateDescSeg22) {
		this.descFlexFieldPrivateDescSeg22 = descFlexFieldPrivateDescSeg22;
	}

	public String getDescFlexFieldPrivateDescSeg23() {
		return descFlexFieldPrivateDescSeg23;
	}

	public void setDescFlexFieldPrivateDescSeg23(String descFlexFieldPrivateDescSeg23) {
		this.descFlexFieldPrivateDescSeg23 = descFlexFieldPrivateDescSeg23;
	}

	public String getDescFlexFieldPrivateDescSeg24() {
		return descFlexFieldPrivateDescSeg24;
	}

	public void setDescFlexFieldPrivateDescSeg24(String descFlexFieldPrivateDescSeg24) {
		this.descFlexFieldPrivateDescSeg24 = descFlexFieldPrivateDescSeg24;
	}

	public String getDescFlexFieldPrivateDescSeg25() {
		return descFlexFieldPrivateDescSeg25;
	}

	public void setDescFlexFieldPrivateDescSeg25(String descFlexFieldPrivateDescSeg25) {
		this.descFlexFieldPrivateDescSeg25 = descFlexFieldPrivateDescSeg25;
	}

	public String getDescFlexFieldPrivateDescSeg26() {
		return descFlexFieldPrivateDescSeg26;
	}

	public void setDescFlexFieldPrivateDescSeg26(String descFlexFieldPrivateDescSeg26) {
		this.descFlexFieldPrivateDescSeg26 = descFlexFieldPrivateDescSeg26;
	}

	public String getDescFlexFieldPrivateDescSeg27() {
		return descFlexFieldPrivateDescSeg27;
	}

	public void setDescFlexFieldPrivateDescSeg27(String descFlexFieldPrivateDescSeg27) {
		this.descFlexFieldPrivateDescSeg27 = descFlexFieldPrivateDescSeg27;
	}

	public String getDescFlexFieldPrivateDescSeg28() {
		return descFlexFieldPrivateDescSeg28;
	}

	public void setDescFlexFieldPrivateDescSeg28(String descFlexFieldPrivateDescSeg28) {
		this.descFlexFieldPrivateDescSeg28 = descFlexFieldPrivateDescSeg28;
	}

	public String getDescFlexFieldPrivateDescSeg29() {
		return descFlexFieldPrivateDescSeg29;
	}

	public void setDescFlexFieldPrivateDescSeg29(String descFlexFieldPrivateDescSeg29) {
		this.descFlexFieldPrivateDescSeg29 = descFlexFieldPrivateDescSeg29;
	}

	public String getDescFlexFieldPrivateDescSeg3() {
		return descFlexFieldPrivateDescSeg3;
	}

	public void setDescFlexFieldPrivateDescSeg3(String descFlexFieldPrivateDescSeg3) {
		this.descFlexFieldPrivateDescSeg3 = descFlexFieldPrivateDescSeg3;
	}

	public String getDescFlexFieldPrivateDescSeg30() {
		return descFlexFieldPrivateDescSeg30;
	}

	public void setDescFlexFieldPrivateDescSeg30(String descFlexFieldPrivateDescSeg30) {
		this.descFlexFieldPrivateDescSeg30 = descFlexFieldPrivateDescSeg30;
	}

	public String getDescFlexFieldPrivateDescSeg4() {
		return descFlexFieldPrivateDescSeg4;
	}

	public void setDescFlexFieldPrivateDescSeg4(String descFlexFieldPrivateDescSeg4) {
		this.descFlexFieldPrivateDescSeg4 = descFlexFieldPrivateDescSeg4;
	}

	public String getDescFlexFieldPrivateDescSeg5() {
		return descFlexFieldPrivateDescSeg5;
	}

	public void setDescFlexFieldPrivateDescSeg5(String descFlexFieldPrivateDescSeg5) {
		this.descFlexFieldPrivateDescSeg5 = descFlexFieldPrivateDescSeg5;
	}

	public String getDescFlexFieldPrivateDescSeg6() {
		return descFlexFieldPrivateDescSeg6;
	}

	public void setDescFlexFieldPrivateDescSeg6(String descFlexFieldPrivateDescSeg6) {
		this.descFlexFieldPrivateDescSeg6 = descFlexFieldPrivateDescSeg6;
	}

	public String getDescFlexFieldPrivateDescSeg7() {
		return descFlexFieldPrivateDescSeg7;
	}

	public void setDescFlexFieldPrivateDescSeg7(String descFlexFieldPrivateDescSeg7) {
		this.descFlexFieldPrivateDescSeg7 = descFlexFieldPrivateDescSeg7;
	}

	public String getDescFlexFieldPrivateDescSeg8() {
		return descFlexFieldPrivateDescSeg8;
	}

	public void setDescFlexFieldPrivateDescSeg8(String descFlexFieldPrivateDescSeg8) {
		this.descFlexFieldPrivateDescSeg8 = descFlexFieldPrivateDescSeg8;
	}

	public String getDescFlexFieldPrivateDescSeg9() {
		return descFlexFieldPrivateDescSeg9;
	}

	public void setDescFlexFieldPrivateDescSeg9(String descFlexFieldPrivateDescSeg9) {
		this.descFlexFieldPrivateDescSeg9 = descFlexFieldPrivateDescSeg9;
	}

	public String getDescFlexFieldPubDescSeg1() {
		return descFlexFieldPubDescSeg1;
	}

	public void setDescFlexFieldPubDescSeg1(String descFlexFieldPubDescSeg1) {
		this.descFlexFieldPubDescSeg1 = descFlexFieldPubDescSeg1;
	}

	public String getDescFlexFieldPubDescSeg10() {
		return descFlexFieldPubDescSeg10;
	}

	public void setDescFlexFieldPubDescSeg10(String descFlexFieldPubDescSeg10) {
		this.descFlexFieldPubDescSeg10 = descFlexFieldPubDescSeg10;
	}

	public String getDescFlexFieldPubDescSeg11() {
		return descFlexFieldPubDescSeg11;
	}

	public void setDescFlexFieldPubDescSeg11(String descFlexFieldPubDescSeg11) {
		this.descFlexFieldPubDescSeg11 = descFlexFieldPubDescSeg11;
	}

	public String getDescFlexFieldPubDescSeg12() {
		return descFlexFieldPubDescSeg12;
	}

	public void setDescFlexFieldPubDescSeg12(String descFlexFieldPubDescSeg12) {
		this.descFlexFieldPubDescSeg12 = descFlexFieldPubDescSeg12;
	}

	public String getDescFlexFieldPubDescSeg13() {
		return descFlexFieldPubDescSeg13;
	}

	public void setDescFlexFieldPubDescSeg13(String descFlexFieldPubDescSeg13) {
		this.descFlexFieldPubDescSeg13 = descFlexFieldPubDescSeg13;
	}

	public String getDescFlexFieldPubDescSeg14() {
		return descFlexFieldPubDescSeg14;
	}

	public void setDescFlexFieldPubDescSeg14(String descFlexFieldPubDescSeg14) {
		this.descFlexFieldPubDescSeg14 = descFlexFieldPubDescSeg14;
	}

	public String getDescFlexFieldPubDescSeg15() {
		return descFlexFieldPubDescSeg15;
	}

	public void setDescFlexFieldPubDescSeg15(String descFlexFieldPubDescSeg15) {
		this.descFlexFieldPubDescSeg15 = descFlexFieldPubDescSeg15;
	}

	public String getDescFlexFieldPubDescSeg16() {
		return descFlexFieldPubDescSeg16;
	}

	public void setDescFlexFieldPubDescSeg16(String descFlexFieldPubDescSeg16) {
		this.descFlexFieldPubDescSeg16 = descFlexFieldPubDescSeg16;
	}

	public String getDescFlexFieldPubDescSeg17() {
		return descFlexFieldPubDescSeg17;
	}

	public void setDescFlexFieldPubDescSeg17(String descFlexFieldPubDescSeg17) {
		this.descFlexFieldPubDescSeg17 = descFlexFieldPubDescSeg17;
	}

	public String getDescFlexFieldPubDescSeg18() {
		return descFlexFieldPubDescSeg18;
	}

	public void setDescFlexFieldPubDescSeg18(String descFlexFieldPubDescSeg18) {
		this.descFlexFieldPubDescSeg18 = descFlexFieldPubDescSeg18;
	}

	public String getDescFlexFieldPubDescSeg19() {
		return descFlexFieldPubDescSeg19;
	}

	public void setDescFlexFieldPubDescSeg19(String descFlexFieldPubDescSeg19) {
		this.descFlexFieldPubDescSeg19 = descFlexFieldPubDescSeg19;
	}

	public String getDescFlexFieldPubDescSeg2() {
		return descFlexFieldPubDescSeg2;
	}

	public void setDescFlexFieldPubDescSeg2(String descFlexFieldPubDescSeg2) {
		this.descFlexFieldPubDescSeg2 = descFlexFieldPubDescSeg2;
	}

	public String getDescFlexFieldPubDescSeg20() {
		return descFlexFieldPubDescSeg20;
	}

	public void setDescFlexFieldPubDescSeg20(String descFlexFieldPubDescSeg20) {
		this.descFlexFieldPubDescSeg20 = descFlexFieldPubDescSeg20;
	}

	public String getDescFlexFieldPubDescSeg21() {
		return descFlexFieldPubDescSeg21;
	}

	public void setDescFlexFieldPubDescSeg21(String descFlexFieldPubDescSeg21) {
		this.descFlexFieldPubDescSeg21 = descFlexFieldPubDescSeg21;
	}

	public String getDescFlexFieldPubDescSeg22() {
		return descFlexFieldPubDescSeg22;
	}

	public void setDescFlexFieldPubDescSeg22(String descFlexFieldPubDescSeg22) {
		this.descFlexFieldPubDescSeg22 = descFlexFieldPubDescSeg22;
	}

	public String getDescFlexFieldPubDescSeg23() {
		return descFlexFieldPubDescSeg23;
	}

	public void setDescFlexFieldPubDescSeg23(String descFlexFieldPubDescSeg23) {
		this.descFlexFieldPubDescSeg23 = descFlexFieldPubDescSeg23;
	}

	public String getDescFlexFieldPubDescSeg24() {
		return descFlexFieldPubDescSeg24;
	}

	public void setDescFlexFieldPubDescSeg24(String descFlexFieldPubDescSeg24) {
		this.descFlexFieldPubDescSeg24 = descFlexFieldPubDescSeg24;
	}

	public String getDescFlexFieldPubDescSeg25() {
		return descFlexFieldPubDescSeg25;
	}

	public void setDescFlexFieldPubDescSeg25(String descFlexFieldPubDescSeg25) {
		this.descFlexFieldPubDescSeg25 = descFlexFieldPubDescSeg25;
	}

	public String getDescFlexFieldPubDescSeg26() {
		return descFlexFieldPubDescSeg26;
	}

	public void setDescFlexFieldPubDescSeg26(String descFlexFieldPubDescSeg26) {
		this.descFlexFieldPubDescSeg26 = descFlexFieldPubDescSeg26;
	}

	public String getDescFlexFieldPubDescSeg27() {
		return descFlexFieldPubDescSeg27;
	}

	public void setDescFlexFieldPubDescSeg27(String descFlexFieldPubDescSeg27) {
		this.descFlexFieldPubDescSeg27 = descFlexFieldPubDescSeg27;
	}

	public String getDescFlexFieldPubDescSeg28() {
		return descFlexFieldPubDescSeg28;
	}

	public void setDescFlexFieldPubDescSeg28(String descFlexFieldPubDescSeg28) {
		this.descFlexFieldPubDescSeg28 = descFlexFieldPubDescSeg28;
	}

	public String getDescFlexFieldPubDescSeg29() {
		return descFlexFieldPubDescSeg29;
	}

	public void setDescFlexFieldPubDescSeg29(String descFlexFieldPubDescSeg29) {
		this.descFlexFieldPubDescSeg29 = descFlexFieldPubDescSeg29;
	}

	public String getDescFlexFieldPubDescSeg3() {
		return descFlexFieldPubDescSeg3;
	}

	public void setDescFlexFieldPubDescSeg3(String descFlexFieldPubDescSeg3) {
		this.descFlexFieldPubDescSeg3 = descFlexFieldPubDescSeg3;
	}

	public String getDescFlexFieldPubDescSeg30() {
		return descFlexFieldPubDescSeg30;
	}

	public void setDescFlexFieldPubDescSeg30(String descFlexFieldPubDescSeg30) {
		this.descFlexFieldPubDescSeg30 = descFlexFieldPubDescSeg30;
	}

	public String getDescFlexFieldPubDescSeg31() {
		return descFlexFieldPubDescSeg31;
	}

	public void setDescFlexFieldPubDescSeg31(String descFlexFieldPubDescSeg31) {
		this.descFlexFieldPubDescSeg31 = descFlexFieldPubDescSeg31;
	}

	public String getDescFlexFieldPubDescSeg32() {
		return descFlexFieldPubDescSeg32;
	}

	public void setDescFlexFieldPubDescSeg32(String descFlexFieldPubDescSeg32) {
		this.descFlexFieldPubDescSeg32 = descFlexFieldPubDescSeg32;
	}

	public String getDescFlexFieldPubDescSeg33() {
		return descFlexFieldPubDescSeg33;
	}

	public void setDescFlexFieldPubDescSeg33(String descFlexFieldPubDescSeg33) {
		this.descFlexFieldPubDescSeg33 = descFlexFieldPubDescSeg33;
	}

	public String getDescFlexFieldPubDescSeg34() {
		return descFlexFieldPubDescSeg34;
	}

	public void setDescFlexFieldPubDescSeg34(String descFlexFieldPubDescSeg34) {
		this.descFlexFieldPubDescSeg34 = descFlexFieldPubDescSeg34;
	}

	public String getDescFlexFieldPubDescSeg35() {
		return descFlexFieldPubDescSeg35;
	}

	public void setDescFlexFieldPubDescSeg35(String descFlexFieldPubDescSeg35) {
		this.descFlexFieldPubDescSeg35 = descFlexFieldPubDescSeg35;
	}

	public String getDescFlexFieldPubDescSeg36() {
		return descFlexFieldPubDescSeg36;
	}

	public void setDescFlexFieldPubDescSeg36(String descFlexFieldPubDescSeg36) {
		this.descFlexFieldPubDescSeg36 = descFlexFieldPubDescSeg36;
	}

	public String getDescFlexFieldPubDescSeg37() {
		return descFlexFieldPubDescSeg37;
	}

	public void setDescFlexFieldPubDescSeg37(String descFlexFieldPubDescSeg37) {
		this.descFlexFieldPubDescSeg37 = descFlexFieldPubDescSeg37;
	}

	public String getDescFlexFieldPubDescSeg38() {
		return descFlexFieldPubDescSeg38;
	}

	public void setDescFlexFieldPubDescSeg38(String descFlexFieldPubDescSeg38) {
		this.descFlexFieldPubDescSeg38 = descFlexFieldPubDescSeg38;
	}

	public String getDescFlexFieldPubDescSeg39() {
		return descFlexFieldPubDescSeg39;
	}

	public void setDescFlexFieldPubDescSeg39(String descFlexFieldPubDescSeg39) {
		this.descFlexFieldPubDescSeg39 = descFlexFieldPubDescSeg39;
	}

	public String getDescFlexFieldPubDescSeg4() {
		return descFlexFieldPubDescSeg4;
	}

	public void setDescFlexFieldPubDescSeg4(String descFlexFieldPubDescSeg4) {
		this.descFlexFieldPubDescSeg4 = descFlexFieldPubDescSeg4;
	}

	public String getDescFlexFieldPubDescSeg40() {
		return descFlexFieldPubDescSeg40;
	}

	public void setDescFlexFieldPubDescSeg40(String descFlexFieldPubDescSeg40) {
		this.descFlexFieldPubDescSeg40 = descFlexFieldPubDescSeg40;
	}

	public String getDescFlexFieldPubDescSeg41() {
		return descFlexFieldPubDescSeg41;
	}

	public void setDescFlexFieldPubDescSeg41(String descFlexFieldPubDescSeg41) {
		this.descFlexFieldPubDescSeg41 = descFlexFieldPubDescSeg41;
	}

	public String getDescFlexFieldPubDescSeg42() {
		return descFlexFieldPubDescSeg42;
	}

	public void setDescFlexFieldPubDescSeg42(String descFlexFieldPubDescSeg42) {
		this.descFlexFieldPubDescSeg42 = descFlexFieldPubDescSeg42;
	}

	public String getDescFlexFieldPubDescSeg43() {
		return descFlexFieldPubDescSeg43;
	}

	public void setDescFlexFieldPubDescSeg43(String descFlexFieldPubDescSeg43) {
		this.descFlexFieldPubDescSeg43 = descFlexFieldPubDescSeg43;
	}

	public String getDescFlexFieldPubDescSeg44() {
		return descFlexFieldPubDescSeg44;
	}

	public void setDescFlexFieldPubDescSeg44(String descFlexFieldPubDescSeg44) {
		this.descFlexFieldPubDescSeg44 = descFlexFieldPubDescSeg44;
	}

	public String getDescFlexFieldPubDescSeg45() {
		return descFlexFieldPubDescSeg45;
	}

	public void setDescFlexFieldPubDescSeg45(String descFlexFieldPubDescSeg45) {
		this.descFlexFieldPubDescSeg45 = descFlexFieldPubDescSeg45;
	}

	public String getDescFlexFieldPubDescSeg46() {
		return descFlexFieldPubDescSeg46;
	}

	public void setDescFlexFieldPubDescSeg46(String descFlexFieldPubDescSeg46) {
		this.descFlexFieldPubDescSeg46 = descFlexFieldPubDescSeg46;
	}

	public String getDescFlexFieldPubDescSeg47() {
		return descFlexFieldPubDescSeg47;
	}

	public void setDescFlexFieldPubDescSeg47(String descFlexFieldPubDescSeg47) {
		this.descFlexFieldPubDescSeg47 = descFlexFieldPubDescSeg47;
	}

	public String getDescFlexFieldPubDescSeg48() {
		return descFlexFieldPubDescSeg48;
	}

	public void setDescFlexFieldPubDescSeg48(String descFlexFieldPubDescSeg48) {
		this.descFlexFieldPubDescSeg48 = descFlexFieldPubDescSeg48;
	}

	public String getDescFlexFieldPubDescSeg49() {
		return descFlexFieldPubDescSeg49;
	}

	public void setDescFlexFieldPubDescSeg49(String descFlexFieldPubDescSeg49) {
		this.descFlexFieldPubDescSeg49 = descFlexFieldPubDescSeg49;
	}

	public String getDescFlexFieldPubDescSeg5() {
		return descFlexFieldPubDescSeg5;
	}

	public void setDescFlexFieldPubDescSeg5(String descFlexFieldPubDescSeg5) {
		this.descFlexFieldPubDescSeg5 = descFlexFieldPubDescSeg5;
	}

	public String getDescFlexFieldPubDescSeg50() {
		return descFlexFieldPubDescSeg50;
	}

	public void setDescFlexFieldPubDescSeg50(String descFlexFieldPubDescSeg50) {
		this.descFlexFieldPubDescSeg50 = descFlexFieldPubDescSeg50;
	}

	public String getDescFlexFieldPubDescSeg6() {
		return descFlexFieldPubDescSeg6;
	}

	public void setDescFlexFieldPubDescSeg6(String descFlexFieldPubDescSeg6) {
		this.descFlexFieldPubDescSeg6 = descFlexFieldPubDescSeg6;
	}

	public String getDescFlexFieldPubDescSeg7() {
		return descFlexFieldPubDescSeg7;
	}

	public void setDescFlexFieldPubDescSeg7(String descFlexFieldPubDescSeg7) {
		this.descFlexFieldPubDescSeg7 = descFlexFieldPubDescSeg7;
	}

	public String getDescFlexFieldPubDescSeg8() {
		return descFlexFieldPubDescSeg8;
	}

	public void setDescFlexFieldPubDescSeg8(String descFlexFieldPubDescSeg8) {
		this.descFlexFieldPubDescSeg8 = descFlexFieldPubDescSeg8;
	}

	public String getDescFlexFieldPubDescSeg9() {
		return descFlexFieldPubDescSeg9;
	}

	public void setDescFlexFieldPubDescSeg9(String descFlexFieldPubDescSeg9) {
		this.descFlexFieldPubDescSeg9 = descFlexFieldPubDescSeg9;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public Integer getElement() {
		return element;
	}

	public void setElement(Integer element) {
		this.element = element;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	/**
	 * @return the isInternalTrade
	 */
	public Integer getIsInternalTrade() {
		return isInternalTrade;
	}

	/**
	 * @param isInternalTrade
	 *            the isInternalTrade to set
	 */
	public void setIsInternalTrade(Integer isInternalTrade) {
		this.isInternalTrade = isInternalTrade;
	}

	public Integer getIsNeedGenAAI() {
		return isNeedGenAAI;
	}

	public void setIsNeedGenAAI(Integer isNeedGenAAI) {
		this.isNeedGenAAI = isNeedGenAAI;
	}

	public Integer getIsOverCostField() {
		return isOverCostField;
	}

	public void setIsOverCostField(Integer isOverCostField) {
		this.isOverCostField = isOverCostField;
	}

	public Integer getIsQC() {
		return isQC;
	}

	public void setIsQC(Integer isQC) {
		this.isQC = isQC;
	}

	public Integer getIsSettled() {
		return isSettled;
	}

	public void setIsSettled(Integer isSettled) {
		this.isSettled = isSettled;
	}

	public Integer getIsTransferedToGL() {
		return isTransferedToGL;
	}

	public void setIsTransferedToGL(Integer isTransferedToGL) {
		this.isTransferedToGL = isTransferedToGL;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getItemVersion() {
		return itemVersion;
	}

	public void setItemVersion(String itemVersion) {
		this.itemVersion = itemVersion;
	}

	public Integer getLineNum() {
		return lineNum;
	}

	public void setLineNum(Integer lineNum) {
		this.lineNum = lineNum;
	}

	public Integer getLineState() {
		return lineState;
	}

	public void setLineState(Integer lineState) {
		this.lineState = lineState;
	}

	public String getMo() {
		return mo;
	}

	public void setMo(String mo) {
		this.mo = mo;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getmOOutput() {
		return mOOutput;
	}

	public void setmOOutput(String mOOutput) {
		this.mOOutput = mOOutput;
	}

	public Integer getOperationState() {
		return operationState;
	}

	public void setOperationState(Integer operationState) {
		this.operationState = operationState;
	}

	public Integer getOutputType() {
		return outputType;
	}

	public void setOutputType(Integer outputType) {
		this.outputType = outputType;
	}

	public String getOwnerOrg() {
		return ownerOrg;
	}

	public void setOwnerOrg(String ownerOrg) {
		this.ownerOrg = ownerOrg;
	}

	public Double getpBUToCBURate() {
		return pBUToCBURate;
	}

	public void setpBUToCBURate(Double pBUToCBURate) {
		this.pBUToCBURate = pBUToCBURate;
	}

	public Double getpBUToSBURate() {
		return pBUToSBURate;
	}

	public void setpBUToSBURate(Double pBUToSBURate) {
		this.pBUToSBURate = pBUToSBURate;
	}

	public String getPerformingOrg() {
		return performingOrg;
	}

	public void setPerformingOrg(String performingOrg) {
		this.performingOrg = performingOrg;
	}

	public String getPls() {
		return pls;
	}

	public void setPls(String pls) {
		this.pls = pls;
	}

	public String getpLSOutput() {
		return pLSOutput;
	}

	public void setpLSOutput(String pLSOutput) {
		this.pLSOutput = pLSOutput;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProductBaseUOM() {
		return productBaseUOM;
	}

	public void setProductBaseUOM(String productBaseUOM) {
		this.productBaseUOM = productBaseUOM;
	}

	public String getProductUOM() {
		return productUOM;
	}

	public void setProductUOM(String productUOM) {
		this.productUOM = productUOM;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Double getpUToPBURate() {
		return pUToPBURate;
	}

	public void setpUToPBURate(Double pUToPBURate) {
		this.pUToPBURate = pUToPBURate;
	}

	public String getRcvLotDisableDate() {
		return rcvLotDisableDate;
	}

	public void setRcvLotDisableDate(String rcvLotDisableDate) {
		this.rcvLotDisableDate = rcvLotDisableDate;
	}

	public String getRcvLotEffectivedate() {
		return rcvLotEffectivedate;
	}

	public void setRcvLotEffectivedate(String rcvLotEffectivedate) {
		this.rcvLotEffectivedate = rcvLotEffectivedate;
	}

	public String getRcvLotMaster() {
		return rcvLotMaster;
	}

	public void setRcvLotMaster(String rcvLotMaster) {
		this.rcvLotMaster = rcvLotMaster;
	}

	public String getRcvLotNo() {
		return rcvLotNo;
	}

	public void setRcvLotNo(String rcvLotNo) {
		this.rcvLotNo = rcvLotNo;
	}

	public String getRcvOP() {
		return rcvOP;
	}

	public void setRcvOP(String rcvOP) {
		this.rcvOP = rcvOP;
	}

	public String getRcvOPNo() {
		return rcvOPNo;
	}

	public void setRcvOPNo(String rcvOPNo) {
		this.rcvOPNo = rcvOPNo;
	}

	public String getRcvOrg() {
		return rcvOrg;
	}

	public void setRcvOrg(String rcvOrg) {
		this.rcvOrg = rcvOrg;
	}

	public Double getRcvQtyByCostUom() {
		return rcvQtyByCostUom;
	}

	public void setRcvQtyByCostUom(Double rcvQtyByCostUom) {
		this.rcvQtyByCostUom = rcvQtyByCostUom;
	}

	public Double getRcvQtyByProductUOM() {
		return rcvQtyByProductUOM;
	}

	public void setRcvQtyByProductUOM(Double rcvQtyByProductUOM) {
		this.rcvQtyByProductUOM = rcvQtyByProductUOM;
	}

	public Double getRcvQtyByWhUOM() {
		return rcvQtyByWhUOM;
	}

	public void setRcvQtyByWhUOM(Double rcvQtyByWhUOM) {
		this.rcvQtyByWhUOM = rcvQtyByWhUOM;
	}

	public String getRcvRptDoc() {
		return rcvRptDoc;
	}

	public void setRcvRptDoc(String rcvRptDoc) {
		this.rcvRptDoc = rcvRptDoc;
	}

	public String getRcvRptLineBalanceRoute() {
		return rcvRptLineBalanceRoute;
	}

	public void setRcvRptLineBalanceRoute(String rcvRptLineBalanceRoute) {
		this.rcvRptLineBalanceRoute = rcvRptLineBalanceRoute;
	}

	public String getRcvRptLineBalanceRouteDes() {
		return rcvRptLineBalanceRouteDes;
	}

	public void setRcvRptLineBalanceRouteDes(String rcvRptLineBalanceRouteDes) {
		this.rcvRptLineBalanceRouteDes = rcvRptLineBalanceRouteDes;
	}

	public String getRcvSeiban() {
		return rcvSeiban;
	}

	public void setRcvSeiban(String rcvSeiban) {
		this.rcvSeiban = rcvSeiban;
	}

	public String getRcvSeibanCode() {
		return rcvSeibanCode;
	}

	public void setRcvSeibanCode(String rcvSeibanCode) {
		this.rcvSeibanCode = rcvSeibanCode;
	}

	public Integer getRcvValiddate() {
		return rcvValiddate;
	}

	public void setRcvValiddate(Integer rcvValiddate) {
		this.rcvValiddate = rcvValiddate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSnCode() {
		return snCode;
	}

	public void setSnCode(String snCode) {
		this.snCode = snCode;
	}

	public Integer getSourceDocMOSrcDocType() {
		return sourceDocMOSrcDocType;
	}

	public void setSourceDocMOSrcDocType(Integer sourceDocMOSrcDocType) {
		this.sourceDocMOSrcDocType = sourceDocMOSrcDocType;
	}

	public String getSourceDocSrcDocEntityID() {
		return sourceDocSrcDocEntityID;
	}

	public void setSourceDocSrcDocEntityID(String sourceDocSrcDocEntityID) {
		this.sourceDocSrcDocEntityID = sourceDocSrcDocEntityID;
	}

	public String getSourceDocSrcDocEntityType() {
		return sourceDocSrcDocEntityType;
	}

	public void setSourceDocSrcDocEntityType(String sourceDocSrcDocEntityType) {
		this.sourceDocSrcDocEntityType = sourceDocSrcDocEntityType;
	}

	public String getSourceDocSrcDocID() {
		return sourceDocSrcDocID;
	}

	public void setSourceDocSrcDocID(String sourceDocSrcDocID) {
		this.sourceDocSrcDocID = sourceDocSrcDocID;
	}

	public String getSourceDocSrcDocLineEntityID() {
		return sourceDocSrcDocLineEntityID;
	}

	public void setSourceDocSrcDocLineEntityID(String sourceDocSrcDocLineEntityID) {
		this.sourceDocSrcDocLineEntityID = sourceDocSrcDocLineEntityID;
	}

	public String getSourceDocSrcDocLineEntityType() {
		return sourceDocSrcDocLineEntityType;
	}

	public void setSourceDocSrcDocLineEntityType(String sourceDocSrcDocLineEntityType) {
		this.sourceDocSrcDocLineEntityType = sourceDocSrcDocLineEntityType;
	}

	public String getSourceDocSrcDocLineID() {
		return sourceDocSrcDocLineID;
	}

	public void setSourceDocSrcDocLineID(String sourceDocSrcDocLineID) {
		this.sourceDocSrcDocLineID = sourceDocSrcDocLineID;
	}

	public String getSourceDocSrcDocNo() {
		return sourceDocSrcDocNo;
	}

	public void setSourceDocSrcDocNo(String sourceDocSrcDocNo) {
		this.sourceDocSrcDocNo = sourceDocSrcDocNo;
	}

	public String getSourceDocSrcDocOrg() {
		return sourceDocSrcDocOrg;
	}

	public void setSourceDocSrcDocOrg(String sourceDocSrcDocOrg) {
		this.sourceDocSrcDocOrg = sourceDocSrcDocOrg;
	}

	public String getSourceDocSrcDocSublineEntityID() {
		return sourceDocSrcDocSublineEntityID;
	}

	public void setSourceDocSrcDocSublineEntityID(String sourceDocSrcDocSublineEntityID) {
		this.sourceDocSrcDocSublineEntityID = sourceDocSrcDocSublineEntityID;
	}

	public String getSourceDocSrcDocSublineEntityType() {
		return sourceDocSrcDocSublineEntityType;
	}

	public void setSourceDocSrcDocSublineEntityType(String sourceDocSrcDocSublineEntityType) {
		this.sourceDocSrcDocSublineEntityType = sourceDocSrcDocSublineEntityType;
	}

	public String getSourceDocSrcDocSublineNo() {
		return sourceDocSrcDocSublineNo;
	}

	public void setSourceDocSrcDocSublineNo(String sourceDocSrcDocSublineNo) {
		this.sourceDocSrcDocSublineNo = sourceDocSrcDocSublineNo;
	}

	public String getSourceDocSrcDocType() {
		return sourceDocSrcDocType;
	}

	public void setSourceDocSrcDocType(String sourceDocSrcDocType) {
		this.sourceDocSrcDocType = sourceDocSrcDocType;
	}

	public String getSourceDocSrcDocVer() {
		return sourceDocSrcDocVer;
	}

	public void setSourceDocSrcDocVer(String sourceDocSrcDocVer) {
		this.sourceDocSrcDocVer = sourceDocSrcDocVer;
	}

	public String getSourceRcvRptLine() {
		return sourceRcvRptLine;
	}

	public void setSourceRcvRptLine(String sourceRcvRptLine) {
		this.sourceRcvRptLine = sourceRcvRptLine;
	}

	public Integer getStorageType() {
		return storageType;
	}

	public void setStorageType(Integer storageType) {
		this.storageType = storageType;
	}

	public String getStoreBaseUOM() {
		return storeBaseUOM;
	}

	public void setStoreBaseUOM(String storeBaseUOM) {
		this.storeBaseUOM = storeBaseUOM;
	}

	public String getStoreUOM() {
		return storeUOM;
	}

	public void setStoreUOM(String storeUOM) {
		this.storeUOM = storeUOM;
	}

	public Double getsUToSBURate() {
		return sUToSBURate;
	}

	public void setsUToSBURate(Double sUToSBURate) {
		this.sUToSBURate = sUToSBURate;
	}

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Double getTotalAntiRcvQtyByCostUOM() {
		return totalAntiRcvQtyByCostUOM;
	}

	public void setTotalAntiRcvQtyByCostUOM(Double totalAntiRcvQtyByCostUOM) {
		this.totalAntiRcvQtyByCostUOM = totalAntiRcvQtyByCostUOM;
	}

	public Double getTotalAntiRcvQtyByProductUOM() {
		return totalAntiRcvQtyByProductUOM;
	}

	public void setTotalAntiRcvQtyByProductUOM(Double totalAntiRcvQtyByProductUOM) {
		this.totalAntiRcvQtyByProductUOM = totalAntiRcvQtyByProductUOM;
	}

	public Double getTotalAntiRcvQtyByWhUOM() {
		return totalAntiRcvQtyByWhUOM;
	}

	public void setTotalAntiRcvQtyByWhUOM(Double totalAntiRcvQtyByWhUOM) {
		this.totalAntiRcvQtyByWhUOM = totalAntiRcvQtyByWhUOM;
	}

	public Integer getTransferToGL() {
		return transferToGL;
	}

	public void setTransferToGL(Integer transferToGL) {
		this.transferToGL = transferToGL;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getVoucherDispNum() {
		return voucherDispNum;
	}

	public void setVoucherDispNum(String voucherDispNum) {
		this.voucherDispNum = voucherDispNum;
	}

	public String getVoucherID() {
		return voucherID;
	}

	public void setVoucherID(String voucherID) {
		this.voucherID = voucherID;
	}

	public String getVoucherTypeID() {
		return voucherTypeID;
	}

	public void setVoucherTypeID(String voucherTypeID) {
		this.voucherTypeID = voucherTypeID;
	}

	public String getWh() {
		return wh;
	}

	public void setWh(String wh) {
		this.wh = wh;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getCoUOMName() {
		return coUOMName;
	}

	public void setCoUOMName(String coUOMName) {
		this.coUOMName = coUOMName;
	}

	public String getStoreUOMName() {
		return storeUOMName;
	}

	public void setStoreUOMName(String storeUOMName) {
		this.storeUOMName = storeUOMName;
	}

	public String getBinName() {
		return binName;
	}

	public void setBinName(String binName) {
		this.binName = binName;
	}

	public String getWhName() {
		return whName;
	}

	public void setWhName(String whName) {
		this.whName = whName;
	}

	public String getSourceDocSrcDocLineNo() {
		return sourceDocSrcDocLineNo;
	}

	public void setSourceDocSrcDocLineNo(String sourceDocSrcDocLineNo) {
		this.sourceDocSrcDocLineNo = sourceDocSrcDocLineNo;
	}

}