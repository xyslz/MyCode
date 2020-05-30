package com.caijai.eqpt.entity.vo;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;

/**
 * 设备台账
 * 
 * @author ChenYu
 *
 */
@Table(name = "BD_EM")
public class EmVO extends BaseTable {

	private static final long serialVersionUID = -2294327633218013867L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)                
	private String id;                                  
                                                        
                                                        
	/**                                                 
	 * 设备编码                                         
	 */                                                 
	@Column(name = "Code", sort = Sort.ASC)             
	private String code;         
	
	/** 下发对应现场的设备编码*/
	@Column(name="deviceCode")
	private String deviceCode;
                                                        
	/**                                                 
	 * 设备名称                                         
	 */                                                 
	@Column(name = "Name")                              
	private String name;                                
                                                        
	/**                                                 
	 * 设备规格                                         
	 */                                                 
	@Column(name = "SPECS")                             
	private String specs;                               
                                                        
	/**                                                 
	 * 出厂编号 
	 */
	@Column(name = "CNG")
	private String cng;

	/**
	 * 组织机构
	 */
	@Column(name = "Org")
	private String org;

	/**
	 * 设备组id
	 */
	@Column(name = "EMGroup")
	private String emGroup;
	
	/**
	 * 设备组
	 */
	@Column(name = "emGroupName",readonly=true)
	@Relation(table = "EQ_EMGroup", value = "id",ref = "EMGroup" ,show = "name")
	private String emGroupName;

	/**
	 * 产线
	 */
	@Column(name = "ProductionLine")
	private String productionLine;
	
	/**
	 * 产线名称
	 */
	@Column(name = "productionLineName",readonly=true)
	@Relation(table = "EQ_ProductionLine", value = "id",ref = "ProductionLine", show = "code")
	private String productionLineName;
	
	
	/**
	 * 使用部门id
	 */
	@Column(name = "UseDepartment")
	private String useDept;
	
	/**
	 * 使用部门名称
	 */
	@Column(name = "useDeptName",readonly=true)
	@Relation(table = "SYS_Department_Trl", value = "id",ref = "UseDepartment", show = "name")
	private String useDeptName;

	/**
	 * 维修部门id
	 */
	@Column(name = "MaintenanceDepartment")
	private String maintainDept;
	
	/**
	 * 维修部门名称
	 */
	@Column(name = "maintainDeptName",readonly=true)
	@Relation(table = "SYS_Department_Trl", value = "id",ref = "MaintenanceDepartment", show = "name")
	private String maintainDeptName;
	
	/**
	 * 供应商名称 bigint
	 */
	@Column(name = "Supplier")
	private String supplier;
	
	/**
	 * 供应商名称 bigint
	 */
	@Column(name = "supplierName",readonly=true)
	@Relation(table = "BD_Supplier", value = "id",ref = "supplier", show = "name")
	private String supplierName;
	
	/**
	 * 资产编码 nvarchar
	 */
	@Column(name = "AssetsCode")
	private String assetsCode;

	/**
	 * 固定资产卡片
	 */
	@Column(name = "FAName")
	private String faName;

	/**
	 * 购买日期
	 */
	@Column(name = "PurchaseDate")
	private String purchaseDate;

	
	/**
	 * 备注 
	 */
	@Column(name = "Memo")
	private String memo;
	
	/**
	 * 作废标识
	 */
	@Column(name = "dr")
	private Integer dr;

	/**
	 * 时间戳
	 */
	@Column(name = "ts")
	private String ts;

	/**
	 * 创建人
	 */
	@Column(name = "CreatedBy")
	private String createdBy;

	/**
	 * 创建时间
	 */
	@Column(name = "CreatedOn")
	private String createdOn;

	/**
	 * 修改人
	 */
	@Column(name = "ModifiedBy")
	private String modifiedBy;

	/**
	 * 修改时间
	 */
	@Column(name = "ModifiedOn")
	private String modifiedOn;
	
	/**
	 * 状态
	 */
	@Column(name = "emState")
	private String emState;
	
	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	public String getDeviceCode() {
		return deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	public String getCng() {
		return cng;
	}

	public void setCng(String cng) {
		this.cng = cng;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getEmGroup() {
		return emGroup;
	}

	public void setEmGroup(String emGroup) {
		this.emGroup = emGroup;
	}

	public String getEmGroupName() {
		return emGroupName;
	}

	public void setEmGroupName(String emGroupName) {
		this.emGroupName = emGroupName;
	}

	public String getUseDept() {
		return useDept;
	}

	public void setUseDept(String useDept) {
		this.useDept = useDept;
	}

	public String getUseDeptName() {
		return useDeptName;
	}

	public void setUseDeptName(String useDeptName) {
		this.useDeptName = useDeptName;
	}

	public String getMaintainDept() {
		return maintainDept;
	}

	public void setMaintainDept(String maintainDept) {
		this.maintainDept = maintainDept;
	}

	public String getMaintainDeptName() {
		return maintainDeptName;
	}

	public void setMaintainDeptName(String maintainDeptName) {
		this.maintainDeptName = maintainDeptName;
	}

	public String getFaName() {
		return faName;
	}

	public void setFaName(String faName) {
		this.faName = faName;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
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

	public String getProductionLine() {
		return productionLine;
	}

	public void setProductionLine(String productionLine) {
		this.productionLine = productionLine;
	}

	public String getProductionLineName() {
		return productionLineName;
	}

	public void setProductionLineName(String productionLineName) {
		this.productionLineName = productionLineName;
	}

	public String getEmState() {
		return emState;
	}

	public void setEmState(String emState) {
		this.emState = emState;
	}

	public String getAssetsCode() {
		return assetsCode;
	}

	public void setAssetsCode(String assetsCode) {
		this.assetsCode = assetsCode;
	}

	@Override
	public String toString() {
		return "EmVO [id=" + id + ", code=" + code + ", name=" + name + ", specs=" + specs + ", cng=" + cng + ", org="
				+ org + ", emGroup=" + emGroup + ", emGroupName=" + emGroupName + ", productionLine=" + productionLine
				+ ", productionLineName=" + productionLineName + ", useDept=" + useDept + ", useDeptName=" + useDeptName
				+ ", maintainDept=" + maintainDept + ", maintainDeptName=" + maintainDeptName + ", faName=" + faName
				+ ", purchaseDate=" + purchaseDate + ", memo=" + memo + ", dr=" + dr + ", ts=" + ts + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn
				+ ", emState=" + emState + "]";
	}

}
