package com.caijai.eqpt.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.U9STATE;

/**
 * 设备组
 * @author duan2
 *
 */
@Table(name = "EQ_EMGroup")
public class EmGroup extends BaseTable {

	private static final long serialVersionUID = 5514357679965896378L;

	/**
	 * 创建时间
	 */
	@Column(name = "CreatedOn")
	private String createdOn;

	/**
	 * 修改时间
	 */
	@Column(name = "ModifiedOn")
	private String modifiedOn;

	/**
	 * 创建人
	 */
	@Column(name = "CreatedBy")
	private String createdBy;

	/**
	 * 修改人
	 */
	@Column(name = "ModifiedBy")
	private String modifiedBy;

	/**
	 * 编码
	 */
	@Column(name = "Code")
	private String code;

	/**
	 * 名称
	 */
	@Column(name = "Name")
	private String name;

	/**
	 * 备注
	 */
	@Column(name = "Meno")
	private String meno;

	/**
	 * 组织
	 */
	@Column(name = "Org")
	private String org;

	/**
	 * ID
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 0.0
	 */
	@Column(name = "SysVersion")
	private Integer sysversion;

	/**
	 * 有效性
	 */
	@Column(name = "Effective_IsEffective")
	private U9STATE effectiveIseffective;

	/**
	 * 生效日期
	 */
	@Column(name = "Effective_EffectiveDate")
	private String effectiveEffectivedate;

	/**
	 * 失效日期
	 */
	@Column(name = "Effective_DisableDate")
	private String effectiveDisabledate;

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
	 * 数据来源
	 */
	@Column(name = "syssource")
	private String syssource;

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

	public String getSyssource() {
		return syssource;
	}

	public void setSyssource(String syssource) {
		this.syssource = syssource;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
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

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getSysversion() {
		return sysversion;
	}

	public void setSysversion(Integer sysversion) {
		this.sysversion = sysversion;
	}

	public U9STATE getEffectiveIseffective() {
		return effectiveIseffective;
	}

	public void setEffectiveIseffective(U9STATE effectiveIseffective) {
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

	@Override
	public String toString() {
		return "EmGroup [createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy
				+ ", modifiedBy=" + modifiedBy + ", code=" + code + ", name=" + name + ", meno=" + meno + ", org=" + org
				+ ", id=" + id + ", sysversion=" + sysversion + ", effectiveIseffective=" + effectiveIseffective
				+ ", effectiveEffectivedate=" + effectiveEffectivedate + ", effectiveDisabledate="
				+ effectiveDisabledate + ", dr=" + dr + ", ts=" + ts + ", syssource=" + syssource + "]";
	}

	
}