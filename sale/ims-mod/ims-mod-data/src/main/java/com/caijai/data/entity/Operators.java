package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.OperatorType;
import com.caijai.base.sysenum.Sort;

/**
 * Title: Operators Description: 业务员表
 * 
 * @author 杨雪景
 * @date 2019年4月12日
 */
@Table(name = "BD_Operators")
public class Operators extends BaseTable {

	private static final long serialVersionUID = -5254830889606933802L;

	@Column(name = "ID", primary = true)
	private String id;

	@Column(name = "Code")
	private String code;

	@Column(name = "Contact")
	private String contact;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedOn", sort = Sort.DESC)
	private String createdOn;

	@Column(name = "Dept")
	private String dept;
	
	@Column(name = "parentNode", readonly = true)
	@Relation(table = "SYS_Department", value = "id", ref = "dept", show = "parentNode")
	private String parentNode;

	@Column(name = "deptName", readonly = true)
	@Relation(table = "SYS_Department", value = "id", ref = "dept", show = "name")
	private String deptName;

	@Column(name = "deptCode", readonly = true)
	@Relation(table = "SYS_Department", value = "id", ref = "dept", show = "code")
	private String deptCode;

	@Column(name = "userID", readonly = true)
	@Relation(table = "SYS_RelationObject", value = "operatorID", ref = "id", show = "userID")
	private String userID;

	@Column(name = "userName", readonly = true)
	@Relation(table = "SYS_RelationObject", value = "operatorID", ref = "id", show = "userID")
	private String userName;

	@Column(name = "userCode", readonly = true)
	@Relation(table = "SYS_RelationObject", value = "operatorID", ref = "id", show = "userID")
	private String userCode;

	@Column(name = "Description")
	private String description;

	@Column(name = "Dr")
	private Integer dr;

	@Column(name = "Effective_DisableDate")
	private String effective_DisableDate;

	@Column(name = "Effective_EffectiveDate")
	private String effective_EffectiveDate;

	@Column(name = "Effective_IsEffective")
	private Integer effective_IsEffective;

	@Column(name = "MasterOrg")
	private String masterOrg;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

	@Column(name = "Name")
	private String name;

	@Column(name = "OperatorType")
	private OperatorType operatorType;

	@Column(name = "Org")
	private String org;

	@Column(name = "ShortName")
	private String shortName;

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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getMasterOrg() {
		return masterOrg;
	}

	public void setMasterOrg(String masterOrg) {
		this.masterOrg = masterOrg;
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

	public OperatorType getOperatorType() {
		return operatorType;
	}

	public void setOperatorType(OperatorType operatorType) {
		this.operatorType = operatorType;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
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

	public String getParentNode() {
		return parentNode;
	}

	public void setParentNode(String parentNode) {
		this.parentNode = parentNode;
	}

}
