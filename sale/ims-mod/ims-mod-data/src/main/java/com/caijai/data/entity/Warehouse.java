package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseEntity;
import com.caijai.base.sysenum.Sort;

@Table(name = "BD_Wh")
public class Warehouse extends BaseEntity {

	private static final long serialVersionUID = -8131957363076824575L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 编码
	 */
	@Column(name = "Code")
	private String code;

	/**
	 * 地区
	 */
	@Column(name = "Territory")
	private String territory;

	/**
	 * 所属部门
	 */
	@Column(name = "Department")
	private String department;

	/**
	 * 负责人
	 */
	@Column(name = "Manager")
	private String manager;

	/**
	 * 地址
	 */
	@Column(name = "Location")
	private String location;

	/**
	 * 组织
	 */
	@Column(name = "Org")
	private String org;

	/**
	 * 联系电话
	 */
	@Column(name = "TelephoneNumber")
	private String telephoneNumber;

	/**
	 * 创建人
	 */
	@Column(name = "CreatedBy")
	private String createdBy;

	/**
	 * 创建时间
	 */
	@Column(name = "CreatedOn", sort = Sort.DESC)
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
	 * 是否电商仓
	 */
	@Column(name = "IsEWH")
	private Integer isEWH;

	/**
	 * 是否作废
	 */
	@Column(name = "dr")
	private Integer dr;

	/**
	 * 挂起日期
	 */
	@Column(name = "HoldDate")
	private String holdDate;

	/**
	 * 默认供应商
	 */
	@Column(name = "Supplier")
	private String supplier;

	/**
	 * 默认客户
	 */
	@Column(name = "Customer")
	private String customer;

	/**
	 * 来源组织
	 */
	@Column(name = "MasterOrg")
	private String masterOrg;

	/**
	 * 默认入库库位
	 */
	@Column(name = "DefaultInStoreBin")
	private String defaultInStoreBin;

	/**
	 * 承运商
	 */
	@Column(name = "Carrier")
	private String carrier;

	/**
	 * 承运商
	 */
	@Column(name = "sysVersion")
	private String sysVersion;

	/**
	 * 库位管理 bit
	 */
	@Column(name = "isBin")
	private Integer isBin;

	/**
	 * 批号管理 bit
	 */
	@Column(name = "IsLot")
	private Integer isLot;

	/**
	 * 序列号管理 bit
	 */
	@Column(name = "IsSerial")
	private Integer isSerial;

	/**
	 * bit
	 */
	@Column(name = "Effective_IsEffective")
	private Integer isEffective;

	/**
	 * datetime
	 */
	@Column(name = "Effective_EffectiveDate")
	private String effectiveDate;

	/**
	 * datetime
	 */
	@Column(name = "Effective_DisableDate")
	private String disableDate;

	/**
	 * 挂起原因 bigint
	 */
	@Column(name = "HoldReason")
	private String holdReason;

	/**
	 * 解除原因 bigint
	 */
	@Column(name = "ReleaseReason")
	private String releaseReason;

	/**
	 * 挂起人 nvarchar
	 */
	@Column(name = "holdUser")
	private String holdUser;

	/**
	 * 解除人 nvarchar
	 */
	@Column(name = "releaseUser")
	private String releaseUser;

	/**
	 * 解除日期 datetime
	 */
	@Column(name = "ReleaseDate")
	private String releaseDate;

	/**
	 * 允许负库存 bit
	 */
	@Column(name = "IsAllowNegative")
	private Integer isAllowNegative;

	/**
	 * 位置属性 int
	 */
	@Column(name = "LocationType")
	private Integer locationType;

	/**
	 * 普通/露天仓 int
	 */
	@Column(name = "NormalWhType")
	private Integer normalWhType;

	/**
	 * 外寄仓 int
	 */
	@Column(name = "DepositType")
	private Integer depositType;

	/**
	 * 寄外仓 int
	 */
	@Column(name = "OutboundType")
	private Integer outboundType;

	/**
	 * 待出货区 bit
	 */
	@Column(name = "isStage")
	private Integer isStage;

	/**
	 * 保税仓 bit
	 */
	@Column(name = "isKeepTax")
	private Integer isKeepTax;

	/**
	 * 盘点再补货 bit
	 */
	@Column(name = "isCountReplenish")
	private Integer isCountReplenish;

	/**
	 * 盘点冻结 bit
	 */
	@Column(name = "isCountFrozen")
	private Integer isCountFrozen;

	/**
	 * 存储类型 int
	 */
	@Column(name = "StorageType")
	private Integer storageType;

	/**
	 * 默认出库库位 bigint
	 */
	@Column(name = "defaultOutStoreBin")
	private String defaultOutStoreBin;

	/**
	 * 是否看板相关 bit
	 */
	@Column(name = "isSeePlankRelation")
	private Integer isSeePlankRelation;

	@Column(name = "ts")
	private String ts;

	@Column(name = "name")
	private String name;

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
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

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
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

	public Integer getIsEWH() {
		return isEWH;
	}

	public void setIsEWH(Integer isEWH) {
		this.isEWH = isEWH;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getHoldDate() {
		return holdDate;
	}

	public void setHoldDate(String holdDate) {
		this.holdDate = holdDate;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getMasterOrg() {
		return masterOrg;
	}

	public void setMasterOrg(String masterOrg) {
		this.masterOrg = masterOrg;
	}

	public String getDefaultInStoreBin() {
		return defaultInStoreBin;
	}

	public void setDefaultInStoreBin(String defaultInStoreBin) {
		this.defaultInStoreBin = defaultInStoreBin;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public Integer getIsBin() {
		return isBin;
	}

	public void setIsBin(Integer isBin) {
		this.isBin = isBin;
	}

	public Integer getIsLot() {
		return isLot;
	}

	public void setIsLot(Integer isLot) {
		this.isLot = isLot;
	}

	public Integer getIsSerial() {
		return isSerial;
	}

	public void setIsSerial(Integer isSerial) {
		this.isSerial = isSerial;
	}

	public Integer getIsEffective() {
		return isEffective;
	}

	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getDisableDate() {
		return disableDate;
	}

	public void setDisableDate(String disableDate) {
		this.disableDate = disableDate;
	}

	public String getHoldReason() {
		return holdReason;
	}

	public void setHoldReason(String holdReason) {
		this.holdReason = holdReason;
	}

	public String getReleaseReason() {
		return releaseReason;
	}

	public void setReleaseReason(String releaseReason) {
		this.releaseReason = releaseReason;
	}

	public String getHoldUser() {
		return holdUser;
	}

	public void setHoldUser(String holdUser) {
		this.holdUser = holdUser;
	}

	public String getReleaseUser() {
		return releaseUser;
	}

	public void setReleaseUser(String releaseUser) {
		this.releaseUser = releaseUser;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Integer getIsAllowNegative() {
		return isAllowNegative;
	}

	public void setIsAllowNegative(Integer isAllowNegative) {
		this.isAllowNegative = isAllowNegative;
	}

	public Integer getLocationType() {
		return locationType;
	}

	public void setLocationType(Integer locationType) {
		this.locationType = locationType;
	}

	public Integer getNormalWhType() {
		return normalWhType;
	}

	public void setNormalWhType(Integer normalWhType) {
		this.normalWhType = normalWhType;
	}

	public Integer getDepositType() {
		return depositType;
	}

	public void setDepositType(Integer depositType) {
		this.depositType = depositType;
	}

	public Integer getOutboundType() {
		return outboundType;
	}

	public void setOutboundType(Integer outboundType) {
		this.outboundType = outboundType;
	}

	public Integer getIsStage() {
		return isStage;
	}

	public void setIsStage(Integer isStage) {
		this.isStage = isStage;
	}

	public Integer getIsKeepTax() {
		return isKeepTax;
	}

	public void setIsKeepTax(Integer isKeepTax) {
		this.isKeepTax = isKeepTax;
	}

	public Integer getIsCountReplenish() {
		return isCountReplenish;
	}

	public void setIsCountReplenish(Integer isCountReplenish) {
		this.isCountReplenish = isCountReplenish;
	}

	public Integer getIsCountFrozen() {
		return isCountFrozen;
	}

	public void setIsCountFrozen(Integer isCountFrozen) {
		this.isCountFrozen = isCountFrozen;
	}

	public Integer getStorageType() {
		return storageType;
	}

	public void setStorageType(Integer storageType) {
		this.storageType = storageType;
	}

	public String getDefaultOutStoreBin() {
		return defaultOutStoreBin;
	}

	public void setDefaultOutStoreBin(String defaultOutStoreBin) {
		this.defaultOutStoreBin = defaultOutStoreBin;
	}

	public Integer getIsSeePlankRelation() {
		return isSeePlankRelation;
	}

	public void setIsSeePlankRelation(Integer isSeePlankRelation) {
		this.isSeePlankRelation = isSeePlankRelation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}