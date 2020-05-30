package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.SYSSET;

/**
 * 维修人员
 * 
 * @author duan2
 *
 */
@Table(name = "EQ_RepairMen")
public class RepairMen extends BaseTable {

	private static final long serialVersionUID = 2695148468968593837L;

	/**
	 * 唯一标识
	 */
	@Column(name = "ID",primary=true)
	private String id;

	/**
	 * 来源单号
	 */
	@Column(name = "SrcDocID")
	private String srcdocid;

	/**
	 * 录入来源
	 */
	@Column(name = "srcload")
	private String srcload;

	/**
	 * 派工单id
	 */
	@Column(name = "DispatchID")
	private String dispatchID;

	/**
	 * 维修人id
	 */
	@Column(name = "MaintainID")
	private String maintainID;

	/**
	 * 维修人名称
	 */
	@Column(name = "MaintainName", readonly = true)
	@Relation(show = "name", table = "SYS_Person", value = "id", ref = "maintainID")
	private String maintainName;

	// /**
	// * 维修组ID
	// */
	// @Column(name="ShiftGroupID")
	// private String shiftGroupID;
	//
	// /**
	// * 维修组
	// */
	// @Column(name="ShiftGroupName",readonly = true)
	// @Relation(show = "name", table = "bd_ShiftGroup", value =
	// "id",ref="ShiftGroupID")
	// private String shiftGroupName;

	/**
	 * 设备id
	 */
	@Column(name = "emID")
	private String emID;

	/**
	 * 维修开始时间
	 */
	@Column(name = "StartTime")
	private String startTime;

	/**
	 * 维修结束时间
	 */
	@Column(name = "EndTime")
	private String endTime;

	/**
	 * 暂停
	 */
	@Column(name = "pause")
	private String pause;

	/**
	 * 暂停时间长
	 */
	@Column(name = "pauseTime")
	private String pauseTime;

	/**
	 * 项目负责人
	 */
	@Column(name = "isleader")
	private SYSSET isLeader;

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

	@Column(name = "Org")
	private String org;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "createdOn")
	private String createdOn;

	@Column(name = "modifiedOn")
	private String modifiedOn;
	
	/**
	 * 挂起原因
	 */
	@Column(name = "hangUpReason")
	private String hangUpReason;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSrcdocid() {
		return srcdocid;
	}

	public void setSrcdocid(String srcdocid) {
		this.srcdocid = srcdocid;
	}

	public String getSrcload() {
		return srcload;
	}

	public void setSrcload(String srcload) {
		this.srcload = srcload;
	}

	public String getDispatchID() {
		return dispatchID;
	}

	public void setDispatchID(String dispatchID) {
		this.dispatchID = dispatchID;
	}

	public String getMaintainID() {
		return maintainID;
	}

	public void setMaintainID(String maintainID) {
		this.maintainID = maintainID;
	}

	public String getMaintainName() {
		return maintainName;
	}

	public void setMaintainName(String maintainName) {
		this.maintainName = maintainName;
	}

	public String getEmID() {
		return emID;
	}

	public void setEmID(String emID) {
		this.emID = emID;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPause() {
		return pause;
	}

	public void setPause(String pause) {
		this.pause = pause;
	}

	public String getPauseTime() {
		return pauseTime;
	}

	public void setPauseTime(String pauseTime) {
		this.pauseTime = pauseTime;
	}

	public SYSSET getIsLeader() {
		return isLeader;
	}

	public void setIsLeader(SYSSET isLeader) {
		this.isLeader = isLeader;
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

	public String getHangUpReason() {
		return hangUpReason;
	}

	public void setHangUpReason(String hangUpReason) {
		this.hangUpReason = hangUpReason;
	}

	@Override
	public String toString() {
		return "RepairMen [id=" + id + ", srcdocid=" + srcdocid + ", srcload=" + srcload + ", dispatchID=" + dispatchID
				+ ", maintainID=" + maintainID + ", maintainName=" + maintainName + ", emID=" + emID + ", startTime="
				+ startTime + ", endTime=" + endTime + ", pause=" + pause + ", pauseTime=" + pauseTime + ", isLeader="
				+ isLeader + ", dr=" + dr + ", ts=" + ts + ", org=" + org + ", createdBy=" + createdBy + ", modifiedBy="
				+ modifiedBy + ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", hangUpReason="
				+ hangUpReason + "]";
	}

}
