package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
 * 维修记录表
 * @author duan2
 *
 */
@Table(name="EQ_KeepingProjectRecord")
public class KeepingProjectRecord extends BaseTable{

	private static final long serialVersionUID = -2388250831843526107L;

	/**
	 * 主键
	 */
	@Column(name="ID",primary = true)
	private String id;
	
	/**
	 * 保养工程单
	 */
	@Column(name="KeepingProject")
	private String keepingProject;
	
	/**
	 * 维修记录
	 */
	@Column(name = "repairDesc")
	private String repairDesc;
	
	/**
	 * 故障原因
	 */
	@Column(name = "reason")
	private String reason;
	
	/**
	 * 维修结果
	 */
	@Column(name="result")
	private String result;
	
	/**
	 * 维修人
	 */
	@Column(name="repairMen")
	private String repairmen;
	
	/**
	 * 维修人名称
	 */
	@Column(name="repairMenName",readonly = true)
	@Relation(show = "name", table = "SYS_Person", value = "id",ref="repairMen")
	private String repairmenName;
	
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

	public String getKeepingProject() {
		return keepingProject;
	}

	public void setKeepingProject(String keepingProject) {
		this.keepingProject = keepingProject;
	}

	public String getRepairDesc() {
		return repairDesc;
	}

	public void setRepairDesc(String repairDesc) {
		this.repairDesc = repairDesc;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getRepairmen() {
		return repairmen;
	}

	public void setRepairmen(String repairmen) {
		this.repairmen = repairmen;
	}

	public String getRepairmenName() {
		return repairmenName;
	}

	public void setRepairmenName(String repairmenName) {
		this.repairmenName = repairmenName;
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
		return "KeepingProjectRecord [id=" + id + ", keepingProject=" + keepingProject + ", repairDesc=" + repairDesc
				+ ", reason=" + reason + ", result=" + result + ", repairmen=" + repairmen + ", repairmenName="
				+ repairmenName + ", org=" + org + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy
				+ ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", dr=" + dr + ", ts=" + ts + "]";
	}
}
