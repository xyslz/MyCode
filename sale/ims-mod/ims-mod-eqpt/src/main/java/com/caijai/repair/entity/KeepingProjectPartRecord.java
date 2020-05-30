package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
 * 配件更换记录
 * @author duan2
 *
 */
@Table(name="EQ_KeepingProjectPartRecord")
public class KeepingProjectPartRecord extends BaseTable{

	private static final long serialVersionUID = 8917675997755621510L;

	/**
	 * 主键
	 */
	@Column(name = "ID",primary = true)
	private String id;
	
	/**
	 * 保养工程单
	 */
	@Column(name = "KeepingProject")
	private String keepingProject;
	
	/**
	 * 编码
	 */
	@Column(name = "Code")
	private String code;
	
	/**
	 * 配件名称
	 */
	@Column(name = "Name")
	private String name;
	
	/**
	 * 规格型号
	 */
	@Column(name = "Specs")
	private String specs;
	
	/**
	 * 单位
	 */
	@Column(name = "Unit")
	private String unit;
	
	/**
	 * 单位名称
	 */
	@Column(name="unitName",readonly = true)
	@Relation(show = "name", table = "BD_UOM", value = "id",ref="Unit")
	private String unitName;
	
	/**
	 * 数量
	 */
	@Column(name = "Count")
	private Double count;
	
	/**
	 * 更换原因
	 */
	@Column(name = "Reason")
	private String reason;
	
	/**
	 * 检修人
	 */
	@Column(name = "RepairMen")
	private String repairmen;
	
	/**
	 * 检修人名称
	 */
	@Column(name="repairMenName",readonly = true)
	@Relation(show = "name", table = "SYS_Person", value = "id",ref="RepairMen")
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

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public Double getCount() {
		return count;
	}

	public void setCount(Double count) {
		this.count = count;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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
		return "KeepingProjectPartRecord [id=" + id + ", keepingProject=" + keepingProject + ", code=" + code
				+ ", name=" + name + ", specs=" + specs + ", unit=" + unit + ", unitName=" + unitName + ", count="
				+ count + ", reason=" + reason + ", repairmen=" + repairmen + ", repairmenName=" + repairmenName
				+ ", org=" + org + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + ", createdOn="
				+ createdOn + ", modifiedOn=" + modifiedOn + ", dr=" + dr + ", ts=" + ts + "]";
	}

}
