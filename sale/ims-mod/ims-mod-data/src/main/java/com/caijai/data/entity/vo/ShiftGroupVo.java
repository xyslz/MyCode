package com.caijai.data.entity.vo;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
 * 班组
 * @author ChenYu
 *
 */
@Table(name = "bd_ShiftGroup")
public class ShiftGroupVo extends BaseTable{

	private static final long serialVersionUID = -2224865338217063285L;
	
	/**
	 * 主键
	 */
	@Column(name = "id", primary = true)
	private String id;
	
	/**
	 * 班组分类
	 */
	@Column(name = "shiftGroupClass")
	private String shiftGroupClass;
	
	/**
	 * 创建时间
	 */
	@Column(name = "createdOn")
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
	private String sysVersion;
	
	/**
	 * 组织
	 */
	@Column(name = "org")
	private String org;
	
	/**
	 * 编码
	 */
	@Column(name = "code")
	private String code;
	
	/**
	 * 名称
	 */
	@Column(name = "name")
	private String name;
	
	/**
	 * 编码
	 */
	@Column(name = "department")
	private String department;
	
	/**
	 * 是否有效
	 */
	@Column(name = "effective_IsEffective")
	private Integer effective_IsEffective;

	@Column(name = "dr")
	private Integer dr;
	
	@Column(name = "ts")
	private String ts;

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}
	
	public String getShiftGroupClass() {
		return shiftGroupClass;
	}

	public void setShiftGroupClass(String shiftGroupClass) {
		this.shiftGroupClass = shiftGroupClass;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
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

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setIsEffective(Integer effective_IsEffective) {
		this.effective_IsEffective = effective_IsEffective;
	}

	public Integer getIsEffective() {
		return effective_IsEffective;
	}

}
