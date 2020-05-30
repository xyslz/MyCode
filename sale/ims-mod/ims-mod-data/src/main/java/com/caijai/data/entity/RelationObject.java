package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
 * 用户与业务员关系表
 * 
 * @author Administrator
 *
 */
@Table(name = "SYS_RelationObject")
public class RelationObject extends BaseTable {

	private static final long serialVersionUID = 7251024480049205983L;

	@Column(name = "ID", primary = true)
	private String id;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedOn")
	private String createdOn;

	@Column(name = "Def1")
	private String def1;

	@Column(name = "Def10")
	private String def10;

	@Column(name = "Def2")
	private String def2;

	@Column(name = "Def3")
	private String def3;

	@Column(name = "Def4")
	private String def4;

	@Column(name = "Def5")
	private String def5;

	@Column(name = "Def6")
	private String def6;

	@Column(name = "Def7")
	private String def7;

	@Column(name = "Def8")
	private String def8;

	@Column(name = "Def9")
	private String def9;

	@Column(name = "Dr")
	private Integer dr;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

	@Column(name = "OperatorID")
	private String operatorID;
	
	@Column(name = "operatorName", readonly = true)
	@Relation(table = "SYS_Euser", value = "user_pk", ref = "operatorID", show = "username")
	private String operatorName;

	@Column(name = "operatorCode", readonly = true)
	@Relation(table = "SYS_Euser", value = "user_pk", ref = "operatorID", show = "usercode")
	private String operatorCode;

	@Column(name = "Org")
	private String org;

	@Column(name = "SysVersion")
	private String sysVersion;

	@Column(name = "Ts")
	private String ts;

	@Column(name = "UserID")
	private String userID;
	
	@Column(name = "username", readonly = true)
	@Relation(table = "SYS_Euser", value = "user_pk", ref = "userID", show = "username")
	private String username;

	@Column(name = "usercode", readonly = true)
	@Relation(table = "SYS_Euser", value = "user_pk", ref = "userID", show = "usercode")
	private String usercode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getDef10() {
		return def10;
	}

	public void setDef10(String def10) {
		this.def10 = def10;
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

	public String getDef6() {
		return def6;
	}

	public void setDef6(String def6) {
		this.def6 = def6;
	}

	public String getDef7() {
		return def7;
	}

	public void setDef7(String def7) {
		this.def7 = def7;
	}

	public String getDef8() {
		return def8;
	}

	public void setDef8(String def8) {
		this.def8 = def8;
	}

	public String getDef9() {
		return def9;
	}

	public void setDef9(String def9) {
		this.def9 = def9;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
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

	public String getOperatorID() {
		return operatorID;
	}

	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
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

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorCode() {
		return operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

}
