/**  
 * Title: MoVO.java<p>
 * Description: <br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 端鹏程
 * @date 2019年1月23日  
 * @version 1.0  
 */
package com.caijai.data.entity.vo;

import com.caijai.base.sysenum.CadState;
import com.caijai.base.sysenum.CategoryType;
import com.caijai.base.sysenum.DocState;
import com.caijai.base.sysenum.QtyResult;

/**
 * Title: MoVO
 * <p>
 * Description: <br>
 * 
 * @author 端鹏程
 * @date 2019年1月23日
 */
public class MoVO {

	private String id;

	private CategoryType categoryType;
	
	private Integer businessType;

	private String qcDocNo;

	private String mrb;

	private String mrbDocNo;

	private Double checkingQty;

	private Double checkingQtyCoUOM;

	private String completeApplyDoc;

	private String docNo;

	private String department;

	private String departmentName;

	private String applyDate;

	/**
	 * 质检日期
	 */
	private String qcDocCreateDate;

	/**
	 * 入库日期
	 */
	private String businessDate;

	private String completeBin;

	private String completeBinCode;

	private String completeDate;

	private String completeOP;

	private String completeOPID;

	/**
	 * 完工数量（成本单位）
	 */
	private Double completeQtyCoUOM;

	private String completeWh;

	private String completeWhCode;

	private String completeWhName;

	private String createdBy;

	private String createdOn;

	private Integer dr;

	private Double eligibleQty;

	private Double eligibleQtyCoUOM;

	private Integer isCheckedWholeSet;

	private Integer isQC;

	private String item;

	private String itemCode;

	private String code1;

	private String itemName;

	private String itemVersion;

	private Integer lineNum;

	private String mo;

	/**
	 * 生产订单单号
	 */
	private String moDocNo;

	private DocState docState;

	/**
	 * 生产批号
	 */
	private String productLotMaster;
	
	private String seibanCode;

	/**
	 * 批号编码
	 */
	private String productLotNo;

	/** 生产数量 */
	private Double productQty;

	/**
	 * 期初数量
	 */
	private Double openingQty;

	/** 实际生产数量 */
	private Double actualProductQty;

	private String modifiedBy;

	private String modifiedOn;

	private Integer operationState;

	private Integer outputType;

	private String performingOrg;

	private String pls;

	/**
	 * 完工数量
	 */
	private Double completeQty;

	/**
	 * 生产单位
	 */
	private String productUOM;

	/** 单位名称 */
	private String productUOMName;

	/**
	 * 生产-成本
	 */
	private Double pbuToCBURate;

	/**
	 * 成本单位
	 */
	private String coUOM;

	/** 单位名称 */
	private String coUOMName;

	/**
	 * 生产主-副
	 */
	private Double puToPBURate;

	/**
	 * 生产副单位
	 */
	private String productBaseUOM;

	/** 副单位名称 */
	private String productBaseUOMName;

	/**
	 * 成本主-副
	 */
	private Double cuToCBURate;

	/**
	 * 成本副单位
	 */
	private String costBaseUOM;

	/** 副单位名称 */
	private String costBaseUOMName;

	private String remark;

	private Double reworkingQty;

	private Double reworkingQtyCoUOM;

	private Double scrapQty;

	private Double scrapQtyCoUOM;

	private String snCode;

	private String syncMemo;

	private String sysSource;

	private String sysSourceID;

	private String sysVersion;

	private String ts;

	private String org;

	/**
	 * 新增完工单编码
	 */
	private String docLineNo;

	/**
	 * 新增字段完工批次
	 */
	private String lotNo;

	/**
	 * 新增字段 状态
	 */
	private CadState cadState;

	/**
	 * 新增状态 质检结果
	 */
	private QtyResult qcState;

	/**
	 * 新增字段人工工时
	 * 
	 * @author duan
	 * @date 2018年12月13日11:08:50
	 */
	private Double runLaborHours;

	/**
	 * 新增字段机器工时
	 */
	private Double runMachineHours;

	/**
	 * 新增检验工时
	 */
	private String checkHours;

	/**
	 * 入库数量
	 */
	private Double rcvQty;

	/**
	 * 入库数量(辅单位)
	 */
	private Double rcvQtyCoUOM;
	
	/**
	 * 备注
	 */
	private String description;

	/**
	 * @return the checkHours
	 */
	public String getCheckHours() {
		return checkHours;
	}

	/**
	 * @param checkHours
	 *            the checkHours to set
	 */
	public void setCheckHours(String checkHours) {
		this.checkHours = checkHours;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the qcDocNo
	 */
	public String getQcDocNo() {
		return qcDocNo;
	}

	/**
	 * @param qcDocNo
	 *            the qcDocNo to set
	 */
	public void setQcDocNo(String qcDocNo) {
		this.qcDocNo = qcDocNo;
	}

	/**
	 * @return the mrb
	 */
	public String getMrb() {
		return mrb;
	}

	/**
	 * @param mrb
	 *            the mrb to set
	 */
	public void setMrb(String mrb) {
		this.mrb = mrb;
	}

	/**
	 * @return the mrbDocNo
	 */
	public String getMrbDocNo() {
		return mrbDocNo;
	}

	/**
	 * @param mrbDocNo
	 *            the mrbDocNo to set
	 */
	public void setMrbDocNo(String mrbDocNo) {
		this.mrbDocNo = mrbDocNo;
	}

	/**
	 * @return the checkingQty
	 */
	public Double getCheckingQty() {
		return checkingQty;
	}

	/**
	 * @param checkingQty
	 *            the checkingQty to set
	 */
	public void setCheckingQty(Double checkingQty) {
		this.checkingQty = checkingQty;
	}

	/**
	 * @return the checkingQtyCoUOM
	 */
	public Double getCheckingQtyCoUOM() {
		return checkingQtyCoUOM;
	}

	/**
	 * @param checkingQtyCoUOM
	 *            the checkingQtyCoUOM to set
	 */
	public void setCheckingQtyCoUOM(Double checkingQtyCoUOM) {
		this.checkingQtyCoUOM = checkingQtyCoUOM;
	}

	/**
	 * @return the completeApplyDoc
	 */
	public String getCompleteApplyDoc() {
		return completeApplyDoc;
	}

	/**
	 * @param completeApplyDoc
	 *            the completeApplyDoc to set
	 */
	public void setCompleteApplyDoc(String completeApplyDoc) {
		this.completeApplyDoc = completeApplyDoc;
	}

	/**
	 * @return the docNo
	 */
	public String getDocNo() {
		return docNo;
	}

	/**
	 * @param docNo
	 *            the docNo to set
	 */
	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName
	 *            the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the applyDate
	 */
	public String getApplyDate() {
		return applyDate;
	}

	/**
	 * @param applyDate
	 *            the applyDate to set
	 */
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	/**
	 * @return the qcDocCreateDate
	 */
	public String getQcDocCreateDate() {
		return qcDocCreateDate;
	}

	/**
	 * @param qcDocCreateDate
	 *            the qcDocCreateDate to set
	 */
	public void setQcDocCreateDate(String qcDocCreateDate) {
		this.qcDocCreateDate = qcDocCreateDate;
	}

	/**
	 * @return the businessDate
	 */
	public String getBusinessDate() {
		return businessDate;
	}

	/**
	 * @param businessDate
	 *            the businessDate to set
	 */
	public void setBusinessDate(String businessDate) {
		this.businessDate = businessDate;
	}

	/**
	 * @return the completeBin
	 */
	public String getCompleteBin() {
		return completeBin;
	}

	/**
	 * @param completeBin
	 *            the completeBin to set
	 */
	public void setCompleteBin(String completeBin) {
		this.completeBin = completeBin;
	}

	/**
	 * @return the completeBinCode
	 */
	public String getCompleteBinCode() {
		return completeBinCode;
	}

	/**
	 * @param completeBinCode
	 *            the completeBinCode to set
	 */
	public void setCompleteBinCode(String completeBinCode) {
		this.completeBinCode = completeBinCode;
	}

	/**
	 * @return the completeDate
	 */
	public String getCompleteDate() {
		return completeDate;
	}

	/**
	 * @param completeDate
	 *            the completeDate to set
	 */
	public void setCompleteDate(String completeDate) {
		this.completeDate = completeDate;
	}

	/**
	 * @return the completeOP
	 */
	public String getCompleteOP() {
		return completeOP;
	}

	/**
	 * @param completeOP
	 *            the completeOP to set
	 */
	public void setCompleteOP(String completeOP) {
		this.completeOP = completeOP;
	}

	/**
	 * @return the completeOPID
	 */
	public String getCompleteOPID() {
		return completeOPID;
	}

	/**
	 * @param completeOPID
	 *            the completeOPID to set
	 */
	public void setCompleteOPID(String completeOPID) {
		this.completeOPID = completeOPID;
	}

	/**
	 * @return the completeQtyCoUOM
	 */
	public Double getCompleteQtyCoUOM() {
		return completeQtyCoUOM;
	}

	/**
	 * @param completeQtyCoUOM
	 *            the completeQtyCoUOM to set
	 */
	public void setCompleteQtyCoUOM(Double completeQtyCoUOM) {
		this.completeQtyCoUOM = completeQtyCoUOM;
	}

	/**
	 * @return the completeWh
	 */
	public String getCompleteWh() {
		return completeWh;
	}

	/**
	 * @param completeWh
	 *            the completeWh to set
	 */
	public void setCompleteWh(String completeWh) {
		this.completeWh = completeWh;
	}

	/**
	 * @return the completeWhCode
	 */
	public String getCompleteWhCode() {
		return completeWhCode;
	}

	/**
	 * @param completeWhCode
	 *            the completeWhCode to set
	 */
	public void setCompleteWhCode(String completeWhCode) {
		this.completeWhCode = completeWhCode;
	}

	/**
	 * @return the completeWhName
	 */
	public String getCompleteWhName() {
		return completeWhName;
	}

	/**
	 * @param completeWhName
	 *            the completeWhName to set
	 */
	public void setCompleteWhName(String completeWhName) {
		this.completeWhName = completeWhName;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdOn
	 */
	public String getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn
	 *            the createdOn to set
	 */
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the dr
	 */
	public Integer getDr() {
		return dr;
	}

	/**
	 * @param dr
	 *            the dr to set
	 */
	public void setDr(Integer dr) {
		this.dr = dr;
	}

	/**
	 * @return the eligibleQty
	 */
	public Double getEligibleQty() {
		return eligibleQty;
	}

	/**
	 * @param eligibleQty
	 *            the eligibleQty to set
	 */
	public void setEligibleQty(Double eligibleQty) {
		this.eligibleQty = eligibleQty;
	}

	/**
	 * @return the eligibleQtyCoUOM
	 */
	public Double getEligibleQtyCoUOM() {
		return eligibleQtyCoUOM;
	}

	/**
	 * @param eligibleQtyCoUOM
	 *            the eligibleQtyCoUOM to set
	 */
	public void setEligibleQtyCoUOM(Double eligibleQtyCoUOM) {
		this.eligibleQtyCoUOM = eligibleQtyCoUOM;
	}

	/**
	 * @return the isCheckedWholeSet
	 */
	public Integer getIsCheckedWholeSet() {
		return isCheckedWholeSet;
	}

	/**
	 * @param isCheckedWholeSet
	 *            the isCheckedWholeSet to set
	 */
	public void setIsCheckedWholeSet(Integer isCheckedWholeSet) {
		this.isCheckedWholeSet = isCheckedWholeSet;
	}

	/**
	 * @return the isQC
	 */
	public Integer getIsQC() {
		return isQC;
	}

	/**
	 * @param isQC
	 *            the isQC to set
	 */
	public void setIsQC(Integer isQC) {
		this.isQC = isQC;
	}

	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item
	 *            the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}

	/**
	 * @return the itemCode
	 */
	public String getItemCode() {
		return itemCode;
	}

	/**
	 * @param itemCode
	 *            the itemCode to set
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	/**
	 * @return the code1
	 */
	public String getCode1() {
		return code1;
	}

	/**
	 * @param code1
	 *            the code1 to set
	 */
	public void setCode1(String code1) {
		this.code1 = code1;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName
	 *            the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the itemVersion
	 */
	public String getItemVersion() {
		return itemVersion;
	}

	/**
	 * @param itemVersion
	 *            the itemVersion to set
	 */
	public void setItemVersion(String itemVersion) {
		this.itemVersion = itemVersion;
	}

	/**
	 * @return the lineNum
	 */
	public Integer getLineNum() {
		return lineNum;
	}

	/**
	 * @param lineNum
	 *            the lineNum to set
	 */
	public void setLineNum(Integer lineNum) {
		this.lineNum = lineNum;
	}

	/**
	 * @return the mo
	 */
	public String getMo() {
		return mo;
	}

	/**
	 * @param mo
	 *            the mo to set
	 */
	public void setMo(String mo) {
		this.mo = mo;
	}

	/**
	 * @return the moDocNo
	 */
	public String getMoDocNo() {
		return moDocNo;
	}

	/**
	 * @param moDocNo
	 *            the moDocNo to set
	 */
	public void setMoDocNo(String moDocNo) {
		this.moDocNo = moDocNo;
	}

	/**
	 * @return the productLotMaster
	 */
	public String getProductLotMaster() {
		return productLotMaster;
	}

	/**
	 * @param productLotMaster
	 *            the productLotMaster to set
	 */
	public void setProductLotMaster(String productLotMaster) {
		this.productLotMaster = productLotMaster;
	}

	/**
	 * @return the productLotNo
	 */
	public String getProductLotNo() {
		return productLotNo;
	}

	/**
	 * @param productLotNo
	 *            the productLotNo to set
	 */
	public void setProductLotNo(String productLotNo) {
		this.productLotNo = productLotNo;
	}

	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy
	 *            the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return the modifiedOn
	 */
	public String getModifiedOn() {
		return modifiedOn;
	}

	/**
	 * @param modifiedOn
	 *            the modifiedOn to set
	 */
	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	/**
	 * @return the operationState
	 */
	public Integer getOperationState() {
		return operationState;
	}

	/**
	 * @param operationState
	 *            the operationState to set
	 */
	public void setOperationState(Integer operationState) {
		this.operationState = operationState;
	}

	/**
	 * @return the outputType
	 */
	public Integer getOutputType() {
		return outputType;
	}

	/**
	 * @param outputType
	 *            the outputType to set
	 */
	public void setOutputType(Integer outputType) {
		this.outputType = outputType;
	}

	/**
	 * @return the performingOrg
	 */
	public String getPerformingOrg() {
		return performingOrg;
	}

	/**
	 * @param performingOrg
	 *            the performingOrg to set
	 */
	public void setPerformingOrg(String performingOrg) {
		this.performingOrg = performingOrg;
	}

	/**
	 * @return the pls
	 */
	public String getPls() {
		return pls;
	}

	/**
	 * @param pls
	 *            the pls to set
	 */
	public void setPls(String pls) {
		this.pls = pls;
	}

	/**
	 * @return the completeQty
	 */
	public Double getCompleteQty() {
		return completeQty;
	}

	/**
	 * @param completeQty
	 *            the completeQty to set
	 */
	public void setCompleteQty(Double completeQty) {
		this.completeQty = completeQty;
	}

	/**
	 * @return the productUOM
	 */
	public String getProductUOM() {
		return productUOM;
	}

	/**
	 * @param productUOM
	 *            the productUOM to set
	 */
	public void setProductUOM(String productUOM) {
		this.productUOM = productUOM;
	}

	/**
	 * @return the productUOMName
	 */
	public String getProductUOMName() {
		return productUOMName;
	}

	/**
	 * @param productUOMName
	 *            the productUOMName to set
	 */
	public void setProductUOMName(String productUOMName) {
		this.productUOMName = productUOMName;
	}

	/**
	 * @return the pbuToCBURate
	 */
	public Double getPbuToCBURate() {
		return pbuToCBURate;
	}

	/**
	 * @param pbuToCBURate
	 *            the pbuToCBURate to set
	 */
	public void setPbuToCBURate(Double pbuToCBURate) {
		this.pbuToCBURate = pbuToCBURate;
	}

	/**
	 * @return the coUOM
	 */
	public String getCoUOM() {
		return coUOM;
	}

	/**
	 * @param coUOM
	 *            the coUOM to set
	 */
	public void setCoUOM(String coUOM) {
		this.coUOM = coUOM;
	}

	/**
	 * @return the coUOMName
	 */
	public String getCoUOMName() {
		return coUOMName;
	}

	/**
	 * @param coUOMName
	 *            the coUOMName to set
	 */
	public void setCoUOMName(String coUOMName) {
		this.coUOMName = coUOMName;
	}

	/**
	 * @return the puToPBURate
	 */
	public Double getPuToPBURate() {
		return puToPBURate;
	}

	/**
	 * @param puToPBURate
	 *            the puToPBURate to set
	 */
	public void setPuToPBURate(Double puToPBURate) {
		this.puToPBURate = puToPBURate;
	}

	/**
	 * @return the productBaseUOM
	 */
	public String getProductBaseUOM() {
		return productBaseUOM;
	}

	/**
	 * @param productBaseUOM
	 *            the productBaseUOM to set
	 */
	public void setProductBaseUOM(String productBaseUOM) {
		this.productBaseUOM = productBaseUOM;
	}

	/**
	 * @return the productBaseUOMName
	 */
	public String getProductBaseUOMName() {
		return productBaseUOMName;
	}

	/**
	 * @param productBaseUOMName
	 *            the productBaseUOMName to set
	 */
	public void setProductBaseUOMName(String productBaseUOMName) {
		this.productBaseUOMName = productBaseUOMName;
	}

	/**
	 * @return the cuToCBURate
	 */
	public Double getCuToCBURate() {
		return cuToCBURate;
	}

	/**
	 * @param cuToCBURate
	 *            the cuToCBURate to set
	 */
	public void setCuToCBURate(Double cuToCBURate) {
		this.cuToCBURate = cuToCBURate;
	}

	/**
	 * @return the costBaseUOM
	 */
	public String getCostBaseUOM() {
		return costBaseUOM;
	}

	/**
	 * @param costBaseUOM
	 *            the costBaseUOM to set
	 */
	public void setCostBaseUOM(String costBaseUOM) {
		this.costBaseUOM = costBaseUOM;
	}

	/**
	 * @return the costBaseUOMName
	 */
	public String getCostBaseUOMName() {
		return costBaseUOMName;
	}

	/**
	 * @param costBaseUOMName
	 *            the costBaseUOMName to set
	 */
	public void setCostBaseUOMName(String costBaseUOMName) {
		this.costBaseUOMName = costBaseUOMName;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the reworkingQty
	 */
	public Double getReworkingQty() {
		return reworkingQty;
	}

	/**
	 * @param reworkingQty
	 *            the reworkingQty to set
	 */
	public void setReworkingQty(Double reworkingQty) {
		this.reworkingQty = reworkingQty;
	}

	/**
	 * @return the reworkingQtyCoUOM
	 */
	public Double getReworkingQtyCoUOM() {
		return reworkingQtyCoUOM;
	}

	/**
	 * @param reworkingQtyCoUOM
	 *            the reworkingQtyCoUOM to set
	 */
	public void setReworkingQtyCoUOM(Double reworkingQtyCoUOM) {
		this.reworkingQtyCoUOM = reworkingQtyCoUOM;
	}

	/**
	 * @return the scrapQty
	 */
	public Double getScrapQty() {
		return scrapQty;
	}

	/**
	 * @param scrapQty
	 *            the scrapQty to set
	 */
	public void setScrapQty(Double scrapQty) {
		this.scrapQty = scrapQty;
	}

	/**
	 * @return the scrapQtyCoUOM
	 */
	public Double getScrapQtyCoUOM() {
		return scrapQtyCoUOM;
	}

	/**
	 * @param scrapQtyCoUOM
	 *            the scrapQtyCoUOM to set
	 */
	public void setScrapQtyCoUOM(Double scrapQtyCoUOM) {
		this.scrapQtyCoUOM = scrapQtyCoUOM;
	}

	/**
	 * @return the snCode
	 */
	public String getSnCode() {
		return snCode;
	}

	/**
	 * @param snCode
	 *            the snCode to set
	 */
	public void setSnCode(String snCode) {
		this.snCode = snCode;
	}

	/**
	 * @return the syncMemo
	 */
	public String getSyncMemo() {
		return syncMemo;
	}

	/**
	 * @param syncMemo
	 *            the syncMemo to set
	 */
	public void setSyncMemo(String syncMemo) {
		this.syncMemo = syncMemo;
	}

	/**
	 * @return the sysSource
	 */
	public String getSysSource() {
		return sysSource;
	}

	/**
	 * @param sysSource
	 *            the sysSource to set
	 */
	public void setSysSource(String sysSource) {
		this.sysSource = sysSource;
	}

	/**
	 * @return the sysSourceID
	 */
	public String getSysSourceID() {
		return sysSourceID;
	}

	/**
	 * @param sysSourceID
	 *            the sysSourceID to set
	 */
	public void setSysSourceID(String sysSourceID) {
		this.sysSourceID = sysSourceID;
	}

	/**
	 * @return the sysVersion
	 */
	public String getSysVersion() {
		return sysVersion;
	}

	/**
	 * @param sysVersion
	 *            the sysVersion to set
	 */
	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	/**
	 * @return the ts
	 */
	public String getTs() {
		return ts;
	}

	/**
	 * @param ts
	 *            the ts to set
	 */
	public void setTs(String ts) {
		this.ts = ts;
	}

	/**
	 * @return the org
	 */
	public String getOrg() {
		return org;
	}

	/**
	 * @param org
	 *            the org to set
	 */
	public void setOrg(String org) {
		this.org = org;
	}

	/**
	 * @return the docLineNo
	 */
	public String getDocLineNo() {
		return docLineNo;
	}

	/**
	 * @param docLineNo
	 *            the docLineNo to set
	 */
	public void setDocLineNo(String docLineNo) {
		this.docLineNo = docLineNo;
	}

	/**
	 * @return the lotNo
	 */
	public String getLotNo() {
		return lotNo;
	}

	/**
	 * @param lotNo
	 *            the lotNo to set
	 */
	public void setLotNo(String lotNo) {
		this.lotNo = lotNo;
	}

	/**
	 * @return the cadState
	 */
	public CadState getCadState() {
		return cadState;
	}

	/**
	 * @param cadState
	 *            the cadState to set
	 */
	public void setCadState(CadState cadState) {
		this.cadState = cadState;
	}

	/**
	 * @return the qcState
	 */
	public QtyResult getQcState() {
		return qcState;
	}

	/**
	 * @param qcState
	 *            the qcState to set
	 */
	public void setQcState(QtyResult qcState) {
		this.qcState = qcState;
	}

	/**
	 * @return the runLaborHours
	 */
	public Double getRunLaborHours() {
		return runLaborHours;
	}

	/**
	 * @param runLaborHours
	 *            the runLaborHours to set
	 */
	public void setRunLaborHours(Double runLaborHours) {
		this.runLaborHours = runLaborHours;
	}

	/**
	 * @return the runMachineHours
	 */
	public Double getRunMachineHours() {
		return runMachineHours;
	}

	/**
	 * @param runMachineHours
	 *            the runMachineHours to set
	 */
	public void setRunMachineHours(Double runMachineHours) {
		this.runMachineHours = runMachineHours;
	}

	/**
	 * @return the rcvQty
	 */
	public Double getRcvQty() {
		return rcvQty;
	}

	/**
	 * @param rcvQty
	 *            the rcvQty to set
	 */
	public void setRcvQty(Double rcvQty) {
		this.rcvQty = rcvQty;
	}

	/**
	 * @return the rcvQtyCoUOM
	 */
	public Double getRcvQtyCoUOM() {
		return rcvQtyCoUOM;
	}

	/**
	 * @param rcvQtyCoUOM
	 *            the rcvQtyCoUOM to set
	 */
	public void setRcvQtyCoUOM(Double rcvQtyCoUOM) {
		this.rcvQtyCoUOM = rcvQtyCoUOM;
	}

	/**
	 * @return the docState
	 */
	public DocState getDocState() {
		return docState;
	}

	/**
	 * @param docState
	 *            the docState to set
	 */
	public void setDocState(DocState docState) {
		this.docState = docState;
	}

	/**
	 * @return the productQty
	 */
	public Double getProductQty() {
		return productQty;
	}

	/**
	 * @param productQty
	 *            the productQty to set
	 */
	public void setProductQty(Double productQty) {
		this.productQty = productQty;
	}

	/**
	 * @return the openingQty
	 */
	public Double getOpeningQty() {
		return openingQty;
	}

	/**
	 * @param openingQty
	 *            the openingQty to set
	 */
	public void setOpeningQty(Double openingQty) {
		this.openingQty = openingQty;
	}

	/**
	 * @return the actualProductQty
	 */
	public Double getActualProductQty() {
		return actualProductQty;
	}

	/**
	 * @param actualProductQty
	 *            the actualProductQty to set
	 */
	public void setActualProductQty(Double actualProductQty) {
		this.actualProductQty = actualProductQty;
	}

	/**
	 * @return the categoryType
	 */
	public CategoryType getCategoryType() {
		return categoryType;
	}

	/**
	 * @param categoryType
	 *            the categoryType to set
	 */
	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSeibanCode() {
		return seibanCode;
	}

	public void setSeibanCode(String seibanCode) {
		this.seibanCode = seibanCode;
	}

	public Integer getBusinessType() {
		return businessType;
	}

	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}

}
