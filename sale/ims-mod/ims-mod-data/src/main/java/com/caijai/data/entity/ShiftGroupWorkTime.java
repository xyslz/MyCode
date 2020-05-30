package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
 * Title: ShiftGroupWorkTime
 * <p>
 * Description:班组工作时间
 * 
 * @author 杨雪景
 * @date 2019年5月5日
 */
@Table(name = "BD_ShiftGroupWorkTime")
public class ShiftGroupWorkTime extends BaseTable {

	private static final long serialVersionUID = 2001762554847402097L;

	@Column(name = "Id")
	private String id;

	@Column(name = "Code")
	private String code;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedOn")
	private String createdOn;

	@Column(name = "Def1")
	private String def1;

	@Column(name = "Def2")
	private String def2;

	@Column(name = "Def3")
	private String def3;

	@Column(name = "Def4")
	private String def4;

	@Column(name = "Def5")
	private String def5;

	@Column(name = "Department")
	private String department;

	@Column(name = "Dr")
	private Integer dr;

	@Column(name = "Effective_DisableDate")
	private String effective_DisableDate;

	@Column(name = "Effective_EffectiveDate")
	private String effective_EffectiveDate;

	@Column(name = "Effective_IsEffective")
	private Integer effective_IsEffective;

	/**
	 * 部门名称
	 */
	@Column(name = "departmentName", readonly = true)
	@Relation(table = "SYS_Department", value = "id", ref = "Department", show = "name")
	private String departmentName;

	/**
	 * 班组分类名称
	 */
	@Column(name = "ShiftGroupClassName", readonly = true)
	@Relation(table = "BD_ShiftGroupClass", value = "id", ref = "ShiftGroupClass", show = "className")
	private String shiftGroupClassName;

	/**
	 * 班组名称
	 */
	@Column(name = "ShiftGroupName", readonly = true)
	@Relation(table = "BD_ShiftGroup", value = "id", ref = "ShiftGroup", show = "name")
	private String shiftGroupName;

	/**
	 * 班组编码
	 */
	@Column(name = "ShiftGroupCode", readonly = true)
	@Relation(table = "BD_ShiftGroup", value = "id", ref = "ShiftGroup", show = "code")
	private String shiftGroupCode;

	/**
	 * 班组人员名称
	 */
	private String employeeName;

	/**
	 * 班组人员编码
	 */
	private String employeeCode;

	@Column(name = "Employee")
	private String employee;

	@Column(name = "EndTime")
	private String endTime;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

	@Column(name = "Name")
	private String name;

	@Column(name = "Org")
	private String org;

	@Column(name = "ShiftGroup")
	private String shiftGroup;

	@Column(name = "ShiftGroupClass")
	private String shiftGroupClass;

	@Column(name = "StartTime")
	private String startTime;

	@Column(name = "SyncMemo")
	private String syncMemo;

	@Column(name = "SyncSource")
	private String syncSource;

	@Column(name = "SyncSourceID")
	private String syncSourceID;

	@Column(name = "SyncTs")
	private String syncTs;

	@Column(name = "SysVersion")
	private String sysVersion;

	@Column(name = "Ts")
	private String ts;

	@Column(name = "WorkCalendar")
	private String workCalendar;

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

	public String getDef1() {
		return def1;
	}

	public void setDef1(String def1) {
		this.def1 = def1;
	}

	public String getDef2() {
		return def2;
	}

	public void setDef2(String def2) {
		this.def2 = def2;
	}

	public String getDef3() {
		return def3;
	}

	public void setDef3(String def3) {
		this.def3 = def3;
	}

	public String getDef4() {
		return def4;
	}

	public void setDef4(String def4) {
		this.def4 = def4;
	}

	public String getDef5() {
		return def5;
	}

	public void setDef5(String def5) {
		this.def5 = def5;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getEffective_DisableDate() {
		return effective_DisableDate;
	}

	public void setEffective_DisableDate(String effective_DisableDate) {
		this.effective_DisableDate = effective_DisableDate;
	}

	public String getEffective_EffectiveDate() {
		return effective_EffectiveDate;
	}

	public void setEffective_EffectiveDate(String effective_EffectiveDate) {
		this.effective_EffectiveDate = effective_EffectiveDate;
	}

	public Integer getEffective_IsEffective() {
		return effective_IsEffective;
	}

	public void setEffective_IsEffective(Integer effective_IsEffective) {
		this.effective_IsEffective = effective_IsEffective;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getShiftGroup() {
		return shiftGroup;
	}

	public void setShiftGroup(String shiftGroup) {
		this.shiftGroup = shiftGroup;
	}

	public String getShiftGroupClass() {
		return shiftGroupClass;
	}

	public void setShiftGroupClass(String shiftGroupClass) {
		this.shiftGroupClass = shiftGroupClass;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getSyncMemo() {
		return syncMemo;
	}

	public void setSyncMemo(String syncMemo) {
		this.syncMemo = syncMemo;
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

	public String getSyncTs() {
		return syncTs;
	}

	public void setSyncTs(String syncTs) {
		this.syncTs = syncTs;
	}

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getWorkCalendar() {
		return workCalendar;
	}

	public void setWorkCalendar(String workCalendar) {
		this.workCalendar = workCalendar;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getShiftGroupClassName() {
		return shiftGroupClassName;
	}

	public void setShiftGroupClassName(String shiftGroupClassName) {
		this.shiftGroupClassName = shiftGroupClassName;
	}

	public String getShiftGroupName() {
		return shiftGroupName;
	}

	public void setShiftGroupName(String shiftGroupName) {
		this.shiftGroupName = shiftGroupName;
	}

	public String getShiftGroupCode() {
		return shiftGroupCode;
	}

	public void setShiftGroupCode(String shiftGroupCode) {
		this.shiftGroupCode = shiftGroupCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	
}
