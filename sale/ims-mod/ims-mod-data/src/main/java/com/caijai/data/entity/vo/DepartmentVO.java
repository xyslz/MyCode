package com.caijai.data.entity.vo;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;

/**
 * 部门
 * 
 * @author ChenYu
 *
 */
@Table(name = "SYS_Department")
public class DepartmentVO extends BaseTable {

	private static final long serialVersionUID = -2221968789861527958L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;
	
	/**
	 * 创建时间 datetime
	 */
	@Column(name = "createdOn", sort = Sort.DESC)
	private String createdOn;

	/**
	 * 创建人 nvarchar
	 */
	@Column(name = "createdBy")
	private String createdBy;

	/**
	 * 编码
	 */
	@Column(name = "code")
	private String code;

	/**
	 * 组织
	 */
	@Column(name = "org")
	private String org;

	/**
	 * 名称
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 上级部门
	 */
	@Column(name = "parentNode")
	private String pid;

	/**
	 * 是否作废
	 */
	@Column(name = "dr")
	private Integer dr;
	
	/**
	 * 	是否有效
	 */
	@Column(name = "Effective_IsEffective")
	private Integer isEffective;

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

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public Integer getIsEffective() {
		return isEffective;
	}

	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
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

}
