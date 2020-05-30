package com.caijai.data.entity.vo;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.sysenum.Sort;
import com.caijai.base.sysenum.SupplierState;

@Table(name = "BD_Supplier")
public class SupplierVo extends BaseTable {

	private static final long serialVersionUID = 5787065070122378860L;

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
	 * 是否需要确认交期
	 */
	@Column(name = "isConfrimDelivery")
	private SYSSET isConfrimDelivery;
	
	/**
	 * 绑定用户
	 */
	@Column(name = "buyer")
	private String buyer;
	
	@Column(name = "buyerName", readonly = true)
	@Relation(table = "sys_euser", value = "user_pk", ref = "buyer", show = "username")
	private String buyerName;

	/**
	 * 邮箱
	 */
	@Column(name = "email")
	private String email;

	/** 行业 */
	@Column(name = "trade")
	private String trade;

	@Column(name = "tradeName", readonly = true)
	@Relation(table = "BD_Trade", value = "id", ref = "trade", show = "name")
	private String tradeName;

	@Column(name = "tradeCode", readonly = true)
	@Relation(table = "BD_Trade", value = "id", ref = "trade", show = "code")
	private String tradeCode;

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
	@Column(name = "category")
	private String category;

	/**
	 * 部门
	 */
	@Column(name = "department")
	private String department;

	/**
	 * 业务员
	 */
	@Column(name = "Purchaser")
	private String purchaser;

	/**
	 * 行业
	 */
	@Column(name = "tradeCategory")
	private Integer tradecategory;

	/**
	 * 供应商状态
	 */
	@Column(name = "state")
	private SupplierState state;

	/**
	 * 地区
	 */
	@Column(name = "Territory")
	private String territory;
	
	/**
	 * 地区
	 */
	@Column(name = "territoryCode", readonly = true)
	@Relation(table = "BD_Territory", value = "id", ref = "Territory", show = "code")
	private String territoryCode;

	/**
	 * 地区
	 */
	@Column(name = "territoryName", readonly = true)
	@Relation(table = "BD_Territory", value = "id", ref = "Territory", show = "name")
	private String territoryName;

	/**
	 * 邮箱
	 */
	@Column(name = "DescFlexField_PrivateDescSeg7")
	private String descflexfieldPrivatedescseg7;

	/**
	 * 简称
	 */
	@Column(name = "shortName")
	private String shortname;

	/**
	 * 组织
	 */
	@Column(name = "Org")
	private String org;

	/**
	 * 解除人
	 */
	@Column(name = "ReleaseUser")
	private String releaseuser;

	/**
	 * 挂起人
	 */
	@Column(name = "HoldUser")
	private String holduser;

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
	 * 编码
	 */
	@Column(name = "Code")
	private String code;

	@Column(name = "name")
	private String name;

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
	 * 是否作废
	 */
	@Column(name = "dr")
	private Integer dr;

	@Column(name = "ts")
	private String ts;

	@Column(name = "syncSource")
	private String syncSource;
	
	/** 拉黑人  */
	@Column(name = "blackBy")
	private String blackBy;
	
	/** 拉黑时间  */
	@Column(name = "blackOn")
	private String blackOn;
	
	/** 邀约人  */
	@Column(name = "invitationBy")
	private String invitationBy;
	
	/** 邀约时间  */
	@Column(name = "invitationOn")
	private String invitationOn;
	
	/** 审核人  */
	@Column(name = "reviewBy")
	private String reviewBy;
	
	/** 审核时间  */
	@Column(name = "reviewOn")
	private String reviewOn;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPurchaser() {
		return purchaser;
	}

	public void setPurchaser(String purchaser) {
		this.purchaser = purchaser;
	}

	public Integer getTradecategory() {
		return tradecategory;
	}

	public void setTradecategory(Integer tradecategory) {
		this.tradecategory = tradecategory;
	}

	public SupplierState getState() {
		return state;
	}

	public void setState(SupplierState state) {
		this.state = state;
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

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getReleaseuser() {
		return releaseuser;
	}

	public void setReleaseuser(String releaseuser) {
		this.releaseuser = releaseuser;
	}

	public String getHolduser() {
		return holduser;
	}

	public void setHolduser(String holduser) {
		this.holduser = holduser;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescflexfieldPrivatedescseg7() {
		return descflexfieldPrivatedescseg7;
	}

	public void setDescflexfieldPrivatedescseg7(String descflexfieldPrivatedescseg7) {
		this.descflexfieldPrivatedescseg7 = descflexfieldPrivatedescseg7;
	}

	public SYSSET getIsConfrimDelivery() {
		return isConfrimDelivery;
	}

	public void setIsConfrimDelivery(SYSSET isConfrimDelivery) {
		this.isConfrimDelivery = isConfrimDelivery;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getTradeCode() {
		return tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public String getSyncSource() {
		return syncSource;
	}

	public void setSyncSource(String syncSource) {
		this.syncSource = syncSource;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String getBlackBy() {
		return blackBy;
	}

	public void setBlackBy(String blackBy) {
		this.blackBy = blackBy;
	}

	public String getBlackOn() {
		return blackOn;
	}

	public void setBlackOn(String blackOn) {
		this.blackOn = blackOn;
	}

	public String getInvitationBy() {
		return invitationBy;
	}

	public void setInvitationBy(String invitationBy) {
		this.invitationBy = invitationBy;
	}

	public String getInvitationOn() {
		return invitationOn;
	}

	public void setInvitationOn(String invitationOn) {
		this.invitationOn = invitationOn;
	}

	public String getReviewBy() {
		return reviewBy;
	}

	public void setReviewBy(String reviewBy) {
		this.reviewBy = reviewBy;
	}

	public String getReviewOn() {
		return reviewOn;
	}

	public void setReviewOn(String reviewOn) {
		this.reviewOn = reviewOn;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

}