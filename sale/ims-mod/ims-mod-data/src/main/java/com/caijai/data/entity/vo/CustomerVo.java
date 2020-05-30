package com.caijai.data.entity.vo;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;

@Table(name = "BD_Customer")
public class CustomerVo extends BaseTable {

	private static final long serialVersionUID = -2539440505469261170L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 创建时间
	 */
	@Column(name = "createdOn" , sort = Sort.DESC)
	private String createdOn;

	/**
	 * 创建人
	 */
	@Column(name = "createdBy")
	private String createdBy;

	/**
	 * 修改时间
	 */
	@Column(name = "modifiedOn")
	private String modifiedOn;

	/**
	 * 修改人
	 */
	@Column(name = "modifiedBy")
	private String modifiedBy;

	/**
	 * 系统版本
	 */
	@Column(name = "sysVersion")
	private String sysversion;

	/**
	 * 分类
	 */
	@Column(name = "customerCategory")
	private String customercategory;

	/**
	 * 搜索码
	 */
	@Column(name = "searchCode")
	private String searchcode;

	/**
	 * 部门
	 */
	@Column(name = "department")
	private String department;

	/**
	 * 业务员
	 */
	@Column(name = "saleser")
	private String saleser;

	/**
	 * 行业
	 */
	@Column(name = "tradeCategory")
	private Integer tradecategory;

	/**
	 * 组织
	 */
	@Column(name = "org")
	private String org;

	/**
	 * 关键性弹性域结构
	 */
	@Column(name = "KeyFlexFieldStru")
	private String keyflexfieldstru;
	
	/**
	 * 简称
	 */
	@Column(name = "shortName")
	private String shortname;

	/**
	 * 编码
	 */
	@Column(name = "Code")
	private String code;
	
	/**
	 * 名称
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 是否有效
	 */
	@Column(name = "Effective_IsEffective")
	private Integer effectiveIseffective;

	/**
	 * 有效时间
	 */
	@Column(name = "Effective_EffectiveDate")
	private String effectiveEffectivedate;

	/**
	 * 失效时间
	 */
	@Column(name = "Effective_DisableDate")
	private String effectiveDisabledate;

	/**
	 * 地区
	 */
	@Column(name = "territoryCode")
	@Relation(table = "BD_Territory", value = "id",ref = "Territory", show = "code")
	private String territoryCode;
	
	/**
	 * 地区
	 */
	@Column(name = "territoryName")
	@Relation(table = "BD_Territory", value = "id",ref = "Territory", show = "name")
	private String territoryName;

	/**
	 * 状态人
	 */
	@Column(name = "StateUser")
	private String stateuser;

	/**
	 * 状态时间
	 */
	@Column(name = "StateTime")
	private String statetime;

	/**
	 * 控制组织
	 */
	@Column(name = "MasterOrg")
	private String masterorg;

	/**
	 * 挂起
	 */
	@Column(name = "IsHoldRelease")
	private Integer isholdrelease;

	/**
	 * 供应来源
	 */
	@Column(name = "SupplySource")
	private Integer supplysource;

	/**
	 * 供应类型
	 */
	@Column(name = "DemandTransType")
	private Integer demandtranstype;

	/**
	 * 供应组织
	 */
	@Column(name = "SupplyOrg")
	private String supplyorg;

	/**
	 * 存储地点
	 */
	@Column(name = "WH")
	private String wh;

	/**
	 * 供应商
	 */
	@Column(name = "Supplier")
	private String supplier;

	/**
	 * 收款力度政策
	 */
	@Column(name = "GatheringPolicy")
	private String gatheringpolicy;

	/**
	 * 逾期收款力度政策
	 */
	@Column(name = "DelayGatheringPolicy")
	private String delaygatheringpolicy;

	/**
	 * 是否作废
	 */
	@Column(name = "dr")
	private Integer dr;
	
	@Column(name = "ts")
	private String ts;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getSysversion() {
		return sysversion;
	}

	public void setSysversion(String sysversion) {
		this.sysversion = sysversion;
	}

	public String getCustomercategory() {
		return customercategory;
	}

	public void setCustomercategory(String customercategory) {
		this.customercategory = customercategory;
	}

	public String getSearchcode() {
		return searchcode;
	}

	public void setSearchcode(String searchcode) {
		this.searchcode = searchcode;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSaleser() {
		return saleser;
	}

	public void setSaleser(String saleser) {
		this.saleser = saleser;
	}

	public Integer getTradecategory() {
		return tradecategory;
	}

	public void setTradecategory(Integer tradecategory) {
		this.tradecategory = tradecategory;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getKeyflexfieldstru() {
		return keyflexfieldstru;
	}

	public void setKeyflexfieldstru(String keyflexfieldstru) {
		this.keyflexfieldstru = keyflexfieldstru;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
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

	public Integer getEffectiveIseffective() {
		return effectiveIseffective;
	}

	public void setEffectiveIseffective(Integer effectiveIseffective) {
		this.effectiveIseffective = effectiveIseffective;
	}

	public String getEffectiveEffectivedate() {
		return effectiveEffectivedate;
	}

	public void setEffectiveEffectivedate(String effectiveEffectivedate) {
		this.effectiveEffectivedate = effectiveEffectivedate;
	}

	public String getEffectiveDisabledate() {
		return effectiveDisabledate;
	}

	public void setEffectiveDisabledate(String effectiveDisabledate) {
		this.effectiveDisabledate = effectiveDisabledate;
	}

	public String getTerritoryCode() {
		return territoryCode;
	}

	public void setTerritoryCode(String territoryCode) {
		this.territoryCode = territoryCode;
	}

	public String getTerritoryName() {
		return territoryName;
	}

	public void setTerritoryName(String territoryName) {
		this.territoryName = territoryName;
	}

	public String getStateuser() {
		return stateuser;
	}

	public void setStateuser(String stateuser) {
		this.stateuser = stateuser;
	}

	public String getStatetime() {
		return statetime;
	}

	public void setStatetime(String statetime) {
		this.statetime = statetime;
	}

	public String getMasterorg() {
		return masterorg;
	}

	public void setMasterorg(String masterorg) {
		this.masterorg = masterorg;
	}

	public Integer getIsholdrelease() {
		return isholdrelease;
	}

	public void setIsholdrelease(Integer isholdrelease) {
		this.isholdrelease = isholdrelease;
	}

	public Integer getSupplysource() {
		return supplysource;
	}

	public void setSupplysource(Integer supplysource) {
		this.supplysource = supplysource;
	}

	public Integer getDemandtranstype() {
		return demandtranstype;
	}

	public void setDemandtranstype(Integer demandtranstype) {
		this.demandtranstype = demandtranstype;
	}

	public String getSupplyorg() {
		return supplyorg;
	}

	public void setSupplyorg(String supplyorg) {
		this.supplyorg = supplyorg;
	}

	public String getWh() {
		return wh;
	}

	public void setWh(String wh) {
		this.wh = wh;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getGatheringpolicy() {
		return gatheringpolicy;
	}

	public void setGatheringpolicy(String gatheringpolicy) {
		this.gatheringpolicy = gatheringpolicy;
	}

	public String getDelaygatheringpolicy() {
		return delaygatheringpolicy;
	}

	public void setDelaygatheringpolicy(String delaygatheringpolicy) {
		this.delaygatheringpolicy = delaygatheringpolicy;
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

}