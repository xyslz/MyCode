package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
 * 遗留问题表
 * @author duan2
 *
 */
@Table(name="EQ_KeepingProjectProblem")
public class KeepingProjectProblem extends BaseTable{

	private static final long serialVersionUID = 741334973368991477L;

	/**
	 * 主键
	 */
	@Column(name = "ID",primary = true)
	private String id;
	
	/**
	 * 遗留问题
	 */
	@Column(name = "Problem")
	private String problem;
	
	/**
	 * 保养工程单
	 */
	@Column(name = "KeepingProject")
	private String keepingProject;
	
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
	 * 修改人
	 */
	@Column(name = "ModifiedBy")
	private String modifiedBy;

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

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getKeepingProject() {
		return keepingProject;
	}

	public void setKeepingProject(String keepingProject) {
		this.keepingProject = keepingProject;
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

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
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
		return "KeepingProjectProblem [id=" + id + ", problem=" + problem + ", keepingProject=" + keepingProject
				+ ", org=" + org + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + ", createdOn="
				+ createdOn + ", modifiedOn=" + modifiedOn + ", dr=" + dr + ", ts=" + ts + "]";
	}
}
