package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.wx.RepairState;

/**
 * 报修进度表
 * @author duan2
 *
 */
@Table(name="EQ_RepairProcess")
public class RepairProcess extends BaseTable{

	private static final long serialVersionUID = 2286213211751497905L;

	/**
	 * 主键
	 */
	@Column(name = "ID",primary=true)
	private String id;

	/**
	 * 报修单id
	 */
	@Column(name = "RepairID")
	private String repairID;
	
	/**
	 * 维修状态
	 */
	@Column(name="RepairState")
	private RepairState repairState;
	
	/**
	 * 公司
	 */
	@Column(name="Org")
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
	
	@Column(name="dr")
	private Integer dr;
	
	@Column(name="ts")
	private String ts;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRepairID() {
		return repairID;
	}

	public void setRepairID(String repairID) {
		this.repairID = repairID;
	}

	public RepairState getRepairState() {
		return repairState;
	}

	public void setRepairState(RepairState repairState) {
		this.repairState = repairState;
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
		return "RepairProgress [id=" + id + ", repairID=" + repairID + ", org=" + org
				+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy
				+ ", modifiedOn=" + modifiedOn + ", dr=" + dr + ", ts=" + ts + "]";
	}
}
