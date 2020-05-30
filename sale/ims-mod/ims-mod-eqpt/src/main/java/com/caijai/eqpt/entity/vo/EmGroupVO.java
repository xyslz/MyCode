package com.caijai.eqpt.entity.vo;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;
import com.caijai.base.sysenum.U9STATE;

/**
 * 设备组
 * @author duan2
 *
 */
@Table(name = "EQ_EMGroup")
public class EmGroupVO extends BaseTable {

	private static final long serialVersionUID = 5514357679965896378L;

	/**
	 * ID
	 */
	@Column(name = "ID",primary = true)
	private String id;

	
	/**
	 * 编码
	 */
	@Column(name = "Code",sort = Sort.ASC)
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
	 * 作废标识
	 */
	@Column(name = "dr")
	private Integer dr;
	
	/**
	 * 时间戳
	 */
	@Column(name = "ts")
	private String ts;
	
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

	@Override
	public String toString() {
		return "EmGroupVO [id=" + id + ", code=" + code + ", name=" + name + ", meno=" + meno + ", org=" + org
				+ ", sysversion=" + sysversion + ", effectiveIseffective=" + effectiveIseffective
				+ ", effectiveEffectivedate=" + effectiveEffectivedate + ", effectiveDisabledate="
				+ effectiveDisabledate + ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", createdBy="
				+ createdBy + ", modifiedBy=" + modifiedBy + ", dr=" + dr + ", ts=" + ts + "]";
	}

	
}