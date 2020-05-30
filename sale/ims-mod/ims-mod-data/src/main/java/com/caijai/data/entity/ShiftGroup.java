package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.U9STATE;

/**
 * 班组
 * 
 * @author Administrator
 *
 */
@Table(name = "BD_ShiftGroup")
public class ShiftGroup extends BaseTable {

	private static final long serialVersionUID = 1912868939214886093L;

	@Column(name = "ID", primary = true)
	private String id;
	
	@Column(name = "CreatedOn")
	private String createdOn;
	
	@Column(name = "CreatedBy")
	private String createdBy;
	
	/**
	* 班组分类
	*/
	@Column(name = "shiftGroupClass")
	private String shiftGroupClass;
	
	@Column(name = "ModifiedOn")
	private String modifiedOn;
	
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	
	@Column(name = "SysVersion")
	private String sysVersion;
	
	@Column(name = "Org")
	private String org;
	
	@Column(name = "Code")
	private String code;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Department")
	private String department;
	
	/** 部门编码 */
	@Column(name = "deptCode", readonly = true)
	@Relation(table = "SYS_Department", value = "id", ref = "department", show = "code")
	private String deptCode;

	/** 部门名称 */
	@Column(name = "deptName", readonly = true)
	@Relation(table = "SYS_Department", value = "id", ref = "department", show = "name")
	private String deptName;
	
	@Column(name = "WorkCalendar")
	private String workCalendar;
	
	@Column(name = "Effective_IsEffective")
	private U9STATE isEffective;
	
	@Column(name = "Effective_EffectiveDate")
	private String effectiveDate;

	@Column(name = "Effective_DisableDate")
	private String disableDate;
	
	@Column(name = "Ts")
	private String ts;
	
	@Column(name = "SyncTs")
	private String syncTs;
	
	@Column(name = "Dr")
	private Integer dr;
	
	@Column(name = "SyncSource")
	private String syncSource;
	
	@Column(name = "SyncSourceID")
	private String syncSourceID;
	
	@Column(name = "SyncMemo")
	private String syncMemo;

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

	public String getWorkCalendar() {
		return workCalendar;
	}

	public void setWorkCalendar(String workCalendar) {
		this.workCalendar = workCalendar;
	}

	public U9STATE getIsEffective() {
		return isEffective;
	}

	public void setIsEffective(U9STATE isEffective) {
		this.isEffective = isEffective;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getDisableDate() {
		return disableDate;
	}

	public void setDisableDate(String disableDate) {
		this.disableDate = disableDate;
	}
	
	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getSyncTs() {
		return syncTs;
	}

	public void setSyncTs(String syncTs) {
		this.syncTs = syncTs;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getSyncSource() {
		return syncSource;
	}

	public void setSyncSource(String syncSource) {
		this.syncSource = syncSource;
	}

	public String getSyncSourceID() {
		return syncSourceID;
	}

	public void setSyncSourceID(String syncSourceID) {
		this.syncSourceID = syncSourceID;
	}

	public String getSyncMemo() {
		return syncMemo;
	}

	public void setSyncMemo(String syncMemo) {
		this.syncMemo = syncMemo;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getShiftGroupClass() {
		return shiftGroupClass;
	}

	public void setShiftGroupClass(String shiftGroupClass) {
		this.shiftGroupClass = shiftGroupClass;
	}

}
