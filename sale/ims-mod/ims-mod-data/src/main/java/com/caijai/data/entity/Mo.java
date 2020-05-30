/**  
 * Title: Mo.java<p>
 * Description: <br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 端鹏程
 * @date 2018年12月10日  
 * @version 1.0  
 */
package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.CategoryType;
import com.caijai.base.sysenum.DocState;
import com.caijai.base.sysenum.MoIssueStatus;
import com.caijai.base.sysenum.OverFinishType;

/**
 * Title: Mo
 * <p>
 * Description: <br>
 * 
 * @author 端鹏程
 * @date 2018年12月10日
 */
@Table(name = "MO_MO")
public class Mo extends BaseTable {

	private static final long serialVersionUID = -241477151891541657L;

	@Column(name = "ID", primary = true)
	private String id;

	private CategoryType categoryType;
	
	@Column(name = "BusinessType")
	private Integer businessType;
	
	@Column(name = "businessDate")
	private String businessDate;
	
	/**
	 * 模具号（新增显示，用于生成批次号）
	 */
	@Column(name = "DescFlexField_PrivateDescSeg7")
	private String modNo;

	/**
	 * 机器号（新增显示，用于生成批次号）
	 */
	@Column(name = "DescFlexField_PrivateDescSeg8")
	private String machineNo;

	/**
	 * 研发项目号
	 */
	@Column(name = "DescFlexField_PrivateDescSeg1")
	private String descFlexFieldPrivateDescSeg1;

	@Column(name = "OverFinishType", readonly = true)
	@Relation(table = "BD_ItemMaster", value = "id", ref = "ItemMaster", show = "OverFinishType")
	private OverFinishType overFinishType;

	@Column(name = "OverQty", readonly = true)
	@Relation(table = "BD_ItemMaster", value = "id", ref = "ItemMaster", show = "OverQty")
	private Double overQty;

	@Column(name = "OverRate", readonly = true)
	@Relation(table = "BD_ItemMaster", value = "id", ref = "ItemMaster", show = "OverRate")
	private Double overRate;

	@Column(name = "DocNo")
	private String docNo;

	@Column(name = "DocState")
	private DocState docState;

	@Column(name = "MODocType")
	private String moDocType;

	@Column(name = "MODocTypeName")
	private String moDocTypeName;

	@Column(name = "Department")
	private String department;

	@Column(name = "DepartmentCode", readonly = true)
	@Relation(table = "SYS_Department", value = "id", ref = "Department", show = "Code")
	private String departmentCode;

	@Column(name = "departmentName", readonly = true)
	@Relation(table = "SYS_Department", value = "id", ref = "Department", show = "name")
	private String departmentName;

	@Column(name = "ProductLotNo")
	private String productLotNo;

	@Column(name = "seiban")
	private String seiban;

	@Column(name = "seibanCode")
	private String seibanCode;

	@Column(name = "ItemMaster")
	private String itemMaster;

	@Column(name = "ItemMasterCode", readonly = true)
	@Relation(table = "BD_ItemMaster", value = "id", ref = "ItemMaster", show = "code")
	private String itemMasterCode;

	/**
	 * u8料号
	 */
	@Column(name = "code1", readonly = true)
	@Relation(table = "BD_ItemMaster", value = "id", ref = "ItemMaster", show = "code1")
	private String code1;

	@Column(name = "ItemMasterName", readonly = true)
	@Relation(table = "BD_ItemMaster", value = "id", ref = "ItemMaster", show = "name")
	private String itemMasterName;

	@Column(name = "productVersion", readonly = true)
	@Relation(table = "BD_ItemMaster", value = "id", ref = "ItemMaster", show = "productVersion")
	private String productVersion;

	/**
	 * 余量 (余量=生产数量productQty-完工数量TotalEligibleRcvQty+不合格数量)
	 */
	@Column(name = "marginQty")
	private Double marginQty;

	/**
	 * 合格入库数量
	 */
	@Column(name = "TotalEligibleRcvQty")
	private Double totalEligibleRcvQty;

	/**
	 * 累计在检数量
	 */
	@Column(name = "TotalCheckQty")
	private Double totalCheckQty;

	/** 生产数量 */
	@Column(name = "ProductQty")
	private Double productQty;

	/**
	 * 期初数量
	 */
	@Column(name = "OpeningQty")
	private Double openingQty;

	/** 实际生产数量 */
	@Column(name = "ActualProductQty")
	private Double actualProductQty;

	/** 生产数量(成本单位) */
	@Column(name = "ProductQtybyCostUOM")
	private String productQtybyCostUOM;

	/** 生产数量(库存单位) */
	@Column(name = "ProductQtybyStoreUOM")
	private String productQtybyStoreUOM;

	/** 生产单位 */
	@Column(name = "ProductUOM")
	private String productUOM;

	/** 单位名称 */
	@Column(name = "ProductUOMName", readonly = true)
	@Relation(table = "BD_UOM", value = "id", ref = "ProductUOM", show = "name")
	private String productUOMName;

	/** 生产副单位 */
	@Column(name = "ProductBaseUOM")
	private String productBaseUOM;

	/** 单位名称 */
	@Column(name = "ProductBaseUOMName", readonly = true)
	@Relation(table = "BD_UOM", value = "id", ref = "ProductBaseUOM", show = "name")
	private String productBaseUOMName;

	/** 转换率 生产主-生产副 */
	@Column(name = "PUToPBURate")
	private Double puToPBURate;

	/** 成本单位 */
	@Column(name = "CostUOM")
	private String costUOM;

	/** 单位名称 */
	@Column(name = "CostUOMName", readonly = true)
	@Relation(table = "BD_UOM", value = "id", ref = "CostUOM", show = "name")
	private String costUOMName;

	/** 转换率 生产-成本 */
	@Column(name = "PBUToCBURate")
	private Double pbuToCBURate;

	/** 库存单位 */
	@Column(name = "RcvUOM")
	private String rcvUOM;

	/** 单位名称 */
	@Column(name = "RcvUOMName", readonly = true)
	@Relation(table = "BD_UOM", value = "id", ref = "RcvUOM", show = "name")
	private String rcvUOMName;

	/** 转换率 生产-库存 */
	@Column(name = "PBUToSBURate")
	private Double pbuToSBURate;

	/**
	 * 业务开始日期
	 */
	@Column(name = "ActualStartDate")
	private String actualStartDate;

	/**
	 * 业务结束日期
	 */
	@Column(name = "actualCompleteDate")
	private String actualCompleteDate;

	@Column(name = "StartDate")
	private String startDate;

	@Column(name = "CompleteDate")
	private String completeDate;

	@Column(name = "CreatedOn")
	private String createdOn;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "Org")
	private String org;

	@Column(name = "ts")
	private String ts;

	@Column(name = "dr")
	private Integer dr;

	/** 支持领料状态 可领 不可领 */
	@Column(name = "isIssueStatus")
	private MoIssueStatus isIssueStatus;

	public MoIssueStatus getIsIssueStatus() {
		return isIssueStatus;
	}

	public void setIsIssueStatus(MoIssueStatus isIssueStatus) {
		this.isIssueStatus = isIssueStatus;
	}

	/**
	 * 备注
	 */
	@Column(name = "description")
	private String description;

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
	 * @return the actualStartDate
	 */
	public String getActualStartDate() {
		return actualStartDate;
	}

	/**
	 * @param actualStartDate
	 *            the actualStartDate to set
	 */
	public void setActualStartDate(String actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	/**
	 * @return the actualCompleteDate
	 */
	public String getActualCompleteDate() {
		return actualCompleteDate;
	}

	/**
	 * @param actualCompleteDate
	 *            the actualCompleteDate to set
	 */
	public void setActualCompleteDate(String actualCompleteDate) {
		this.actualCompleteDate = actualCompleteDate;
	}

	/**
	 * @return the totalEligibleRcvQty
	 */
	public Double getTotalEligibleRcvQty() {
		return totalEligibleRcvQty;
	}

	/**
	 * @param totalEligibleRcvQty
	 *            the totalEligibleRcvQty to set
	 */
	public void setTotalEligibleRcvQty(Double totalEligibleRcvQty) {
		this.totalEligibleRcvQty = totalEligibleRcvQty;
	}

	/**
	 * @return the totalCheckQty
	 */
	public Double getTotalCheckQty() {
		return totalCheckQty;
	}

	/**
	 * @param totalCheckQty
	 *            the totalCheckQty to set
	 */
	public void setTotalCheckQty(Double totalCheckQty) {
		this.totalCheckQty = totalCheckQty;
	}

	/**
	 * @return the marginQty
	 */
	public Double getMarginQty() {
		return marginQty;
	}

	/**
	 * @param marginQty
	 *            the marginQty to set
	 */
	public void setMarginQty(Double marginQty) {
		this.marginQty = marginQty;
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
	 * @return the productQtybyCostUOM
	 */
	public String getProductQtybyCostUOM() {
		return productQtybyCostUOM;
	}

	/**
	 * @param productQtybyCostUOM
	 *            the productQtybyCostUOM to set
	 */
	public void setProductQtybyCostUOM(String productQtybyCostUOM) {
		this.productQtybyCostUOM = productQtybyCostUOM;
	}

	/**
	 * @return the productQtybyStoreUOM
	 */
	public String getProductQtybyStoreUOM() {
		return productQtybyStoreUOM;
	}

	/**
	 * @param productQtybyStoreUOM
	 *            the productQtybyStoreUOM to set
	 */
	public void setProductQtybyStoreUOM(String productQtybyStoreUOM) {
		this.productQtybyStoreUOM = productQtybyStoreUOM;
	}

	/**
	 * @return the costUOM
	 */
	public String getCostUOM() {
		return costUOM;
	}

	/**
	 * @param costUOM
	 *            the costUOM to set
	 */
	public void setCostUOM(String costUOM) {
		this.costUOM = costUOM;
	}

	/**
	 * @return the costUOMName
	 */
	public String getCostUOMName() {
		return costUOMName;
	}

	/**
	 * @param costUOMName
	 *            the costUOMName to set
	 */
	public void setCostUOMName(String costUOMName) {
		this.costUOMName = costUOMName;
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
	 * @return the rcvUOM
	 */
	public String getRcvUOM() {
		return rcvUOM;
	}

	/**
	 * @param rcvUOM
	 *            the rcvUOM to set
	 */
	public void setRcvUOM(String rcvUOM) {
		this.rcvUOM = rcvUOM;
	}

	/**
	 * @return the rcvUOMName
	 */
	public String getRcvUOMName() {
		return rcvUOMName;
	}

	/**
	 * @param rcvUOMName
	 *            the rcvUOMName to set
	 */
	public void setRcvUOMName(String rcvUOMName) {
		this.rcvUOMName = rcvUOMName;
	}

	/**
	 * @return the pbuToSBURate
	 */
	public Double getPbuToSBURate() {
		return pbuToSBURate;
	}

	/**
	 * @param pbuToSBURate
	 *            the pbuToSBURate to set
	 */
	public void setPbuToSBURate(Double pbuToSBURate) {
		this.pbuToSBURate = pbuToSBURate;
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
	 * @return the itemMaster
	 */
	public String getItemMaster() {
		return itemMaster;
	}

	/**
	 * @param itemMaster
	 *            the itemMaster to set
	 */
	public void setItemMaster(String itemMaster) {
		this.itemMaster = itemMaster;
	}

	/**
	 * @return the itemMasterCode
	 */
	public String getItemMasterCode() {
		return itemMasterCode;
	}

	/**
	 * @param itemMasterCode
	 *            the itemMasterCode to set
	 */
	public void setItemMasterCode(String itemMasterCode) {
		this.itemMasterCode = itemMasterCode;
	}

	/**
	 * @return the itemMasterName
	 */
	public String getItemMasterName() {
		return itemMasterName;
	}

	/**
	 * @param itemMasterName
	 *            the itemMasterName to set
	 */
	public void setItemMasterName(String itemMasterName) {
		this.itemMasterName = itemMasterName;
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
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
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
	 * @return the productVersion
	 */
	public String getProductVersion() {
		return productVersion;
	}

	/**
	 * @param productVersion
	 *            the productVersion to set
	 */
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
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

	/**
	 * @return the overFinishType
	 */
	public OverFinishType getOverFinishType() {
		return overFinishType;
	}

	/**
	 * @param overFinishType
	 *            the overFinishType to set
	 */
	public void setOverFinishType(OverFinishType overFinishType) {
		this.overFinishType = overFinishType;
	}

	/**
	 * @return the overQty
	 */
	public Double getOverQty() {
		return overQty;
	}

	/**
	 * @param overQty
	 *            the overQty to set
	 */
	public void setOverQty(Double overQty) {
		this.overQty = overQty;
	}

	/**
	 * @return the overRate
	 */
	public Double getOverRate() {
		return overRate;
	}

	/**
	 * @param overRate
	 *            the overRate to set
	 */
	public void setOverRate(Double overRate) {
		this.overRate = overRate;
	}

	public String getSeiban() {
		return seiban;
	}

	public void setSeiban(String seiban) {
		this.seiban = seiban;
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

	public String getMoDocType() {
		return moDocType;
	}

	public void setMoDocType(String moDocType) {
		this.moDocType = moDocType;
	}

	public String getMoDocTypeName() {
		return moDocTypeName;
	}

	public void setMoDocTypeName(String moDocTypeName) {
		this.moDocTypeName = moDocTypeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDescFlexFieldPrivateDescSeg1() {
		return descFlexFieldPrivateDescSeg1;
	}

	public void setDescFlexFieldPrivateDescSeg1(String descFlexFieldPrivateDescSeg1) {
		this.descFlexFieldPrivateDescSeg1 = descFlexFieldPrivateDescSeg1;
	}

	public String getModNo() {
		return modNo;
	}

	public void setModNo(String modNo) {
		this.modNo = modNo;
	}

	public String getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	public String getBusinessDate() {
		return businessDate;
	}

	public void setBusinessDate(String businessDate) {
		this.businessDate = businessDate;
	}

}
