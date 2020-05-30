package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.U9STATE;

/**
 * 维修方案主表
 * @author duan2
 *
 */
@Table(name="EQ_EmFault")
public class EmFault extends BaseTable{

	private static final long serialVersionUID = -5433152818030419952L;

	@Column(name = "ID",primary = true)
	private String id;
	
	/**
	 * 设备组
	 */
	@Column(name = "GroupID")
	private String groupID;
	
	/**
	 * 设备组
	 */
	@Column(name = "emGroupName",readonly=true)
	@Relation(table = "EQ_EMGroup", value = "id",ref = "GroupID" ,show = "name")
	private String emGroupName;
	
	/**
	 * 故障码
	 */
	@Column(name = "FaultCode")
	private String faultCode;
	
	/**
	 * 故障部位
	 */
	@Column(name = "FaultPart")
	private String faultPart;
	
	/**
	 * 故障描述
	 */
	@Column(name = "FaultDesc")
	private String faultDesc;
	
	/**
	 * 生效
	 */
	@Column(name = "IsState")
	private U9STATE isState;
	
	/**
	 * 备注
	 */
	@Column(name = "Memo")
	private String memo;
	
	@Column(name = "Org")
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
	
	@Column(name = "def1")
	private String def1;
	
	@Column(name = "def2")
	private String def2;
	
	@Column(name = "def3")
	private String def3;
	
	@Column(name = "def4")
	private String def4;
	
	@Column(name = "def5")
	private String def5;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroupID() {
		return groupID;
	}

	public String getEmGroupName() {
		return emGroupName;
	}

	public void setEmGroupName(String emGroupName) {
		this.emGroupName = emGroupName;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getFaultCode() {
		return faultCode;
	}

	public void setFaultCode(String faultCode) {
		this.faultCode = faultCode;
	}

	public String getFaultPart() {
		return faultPart;
	}

	public void setFaultPart(String faultPart) {
		this.faultPart = faultPart;
	}

	public String getFaultDesc() {
		return faultDesc;
	}

	public void setFaultDesc(String faultDesc) {
		this.faultDesc = faultDesc;
	}

	public U9STATE getIsState() {
		return isState;
	}

	public void setIsState(U9STATE isState) {
		this.isState = isState;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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

	@Override
	public String toString() {
		return "EmFault [id=" + id + ", groupID=" + groupID + ", emGroupName=" + emGroupName + ", faultCode="
				+ faultCode + ", faultPart=" + faultPart + ", faultDesc=" + faultDesc + ", isState=" + isState
				+ ", memo=" + memo + ", org=" + org + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", dr=" + dr + ", ts=" + ts + ", def1="
				+ def1 + ", def2=" + def2 + ", def3=" + def3 + ", def4=" + def4 + ", def5=" + def5 + "]";
	}
	
}
