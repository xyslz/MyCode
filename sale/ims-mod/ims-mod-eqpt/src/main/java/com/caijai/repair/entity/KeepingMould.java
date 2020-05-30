package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.U9STATE;

/**
 * 保养模板
 * 
 * @author duan2
 *
 */
@Table(name = "EQ_KeepingMould")
public class KeepingMould extends BaseTable{

	private static final long serialVersionUID = 2764688244953392455L;

	/**
	 * ID
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 模板编码
	 */
	@Column(name = "Code")
	private String code;

	/**
	 * 模板名称
	 */
	@Column(name = "Name")
	private String name;
	
	/**
	 * 模板版本
	 */
	@Column(name = "Version")
	private String version;
	
	/**
	 * 备注
	 */
	@Column(name = "Memo")
	private String memo;
	
	/**
	 * 生效
	 */
	@Column(name = "isstate")
	private U9STATE isstate;

	/**
	 * 组织
	 */
	@Column(name = "Org")
	private String org;

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
	 * 作废标识
	 */
	@Column(name = "dr")
	private Integer dr;

	/**
	 * 时间戳
	 */
	@Column(name = "ts")
	private String ts;

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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public U9STATE getIsstate() {
		return isstate;
	}

	public void setIsstate(U9STATE isstate) {
		this.isstate = isstate;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
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
		return "KeepingMould [id=" + id + ", code=" + code + ", name=" + name + ", version=" + version + ", memo="
				+ memo + ", isstate=" + isstate + ", org=" + org + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", dr=" + dr + ", ts=" + ts
				+ "]";
	}
	
}
