package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.sysenum.Sort;
import com.caijai.base.sysenum.wx.SpotCheckCurrentState;
import com.caijai.base.sysenum.wx.SpotCheckOperatState;

/**
 * 点检记录
 * 
 * @author ChenYu
 *
 */
@Table(name = "EQ_SpotCheckRecord")
public class SpotCheckRecord extends BaseTable {

	private static final long serialVersionUID = -7146943482798627707L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 点检编码
	 */
	@Column(name = "spotCheckNo",sort = Sort.ASC)
	private String spotCheckNo;

	/**
	 * 点检人
	 */
	@Column(name = "spotCheckMan")
	private String spotCheckMan;
	
	/**
	 * 点检人名称
	 */
	@Column(name = "spotCheckManName" , readonly = true)
	@Relation(table = "SYS_Person", value = "id", ref = "spotCheckMan", show = "name")
	private String spotCheckManName;
	
	/**
	 * 设备
	 */
	@Column(name = "em")
	private String em;
	
	/**
	 * 设备名称
	 */
	@Column(name = "emName" , readonly = true)
	@Relation(table = "EQ_EM", value = "id", ref = "em", show = "name")
	private String emName;
	
	/**
	 * 设备编码
	 */
	@Column(name = "emCode" , readonly = true)
	@Relation(table = "EQ_EM", value = "id", ref = "em", show = "code")
	private String emCode;

	/**
	 * 点检日期
	 */
	@Column(name = "spotCheckDate")
	private String spotCheckDate;
	
	/**
	 * 设备组
	 */
	@Column(name = "emgroup")
	private String emGroup;
	
	/**
	 * 设备组名称
	 */
	@Column(name = "emGroupName" , readonly = true)
	@Relation(table = "EQ_EMGroup", value = "id", ref = "emgroup", show = "name")
	private String emGroupName;
	
	/**
	 * 设备组编码
	 */
	@Column(name = "emGroupCode" , readonly = true)
	@Relation(table = "EQ_EMGroup", value = "id", ref = "emgroup", show = "code")
	private String emGroupCode;
	
	/**
	 * 当前状态
	 */
	@Column(name = "currentState")
	private SpotCheckCurrentState currentState;
	
	/**
	 * 部门（车间）
	 */
	@Column(name = "dept")
	private String dept;
	
	/**
	 * 部门名称
	 */
	@Column(name = "deptName" , readonly = true)
	@Relation(table = "SYS_Department", value = "id", ref = "dept", show = "name")
	private String deptName;
	
	/**
	 * 运行状态
	 */
	@Column(name = "operatState")
	private SpotCheckOperatState operatState;
	
	/**
	 * 是否维修
	 */
	@Column(name = "isRepair")
	private SYSSET isRepair;

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
	 * 创建时间
	 */
	@Column(name = "CreatedOn",sort=Sort.DESC)
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
	
	@Column(name = "def6")
	private String def6;
	
	@Column(name = "def7")
	private String def7;
	
	@Column(name = "def8")
	private String def8;
	
	@Column(name = "def9")
	private String def9;
	
	@Column(name = "def10")
	private String def10;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSpotCheckNo() {
		return spotCheckNo;
	}

	public void setSpotCheckNo(String spotCheckNo) {
		this.spotCheckNo = spotCheckNo;
	}

	public String getSpotCheckMan() {
		return spotCheckMan;
	}

	public void setSpotCheckMan(String spotCheckMan) {
		this.spotCheckMan = spotCheckMan;
	}

	public String getSpotCheckManName() {
		return spotCheckManName;
	}

	public void setSpotCheckManName(String spotCheckManName) {
		this.spotCheckManName = spotCheckManName;
	}

	public String getEm() {
		return em;
	}

	public void setEm(String em) {
		this.em = em;
	}

	public String getEmName() {
		return emName;
	}

	public void setEmName(String emName) {
		this.emName = emName;
	}

	public String getEmCode() {
		return emCode;
	}

	public void setEmCode(String emCode) {
		this.emCode = emCode;
	}

	public String getSpotCheckDate() {
		return spotCheckDate;
	}

	public void setSpotCheckDate(String spotCheckDate) {
		this.spotCheckDate = spotCheckDate;
	}

	public String getEmGroup() {
		return emGroup;
	}

	public void setEmGroup(String emGroup) {
		this.emGroup = emGroup;
	}

	public String getEmGroupName() {
		return emGroupName;
	}

	public void setEmGroupName(String emGroupName) {
		this.emGroupName = emGroupName;
	}

	public String getEmGroupCode() {
		return emGroupCode;
	}

	public void setEmGroupCode(String emGroupCode) {
		this.emGroupCode = emGroupCode;
	}

	public SpotCheckCurrentState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(SpotCheckCurrentState currentState) {
		this.currentState = currentState;
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

	public SpotCheckOperatState getOperatState() {
		return operatState;
	}

	public void setOperatState(SpotCheckOperatState operatState) {
		this.operatState = operatState;
	}

	public SYSSET getIsRepair() {
		return isRepair;
	}

	public void setIsRepair(SYSSET isRepair) {
		this.isRepair = isRepair;
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

	public String getDef10() {
		return def10;
	}

	public void setDef10(String def10) {
		this.def10 = def10;
	}

	@Override
	public String toString() {
		return "SpotCheckRecord [id=" + id + ", spotCheckNo=" + spotCheckNo + ", spotCheckMan=" + spotCheckMan
				+ ", spotCheckManName=" + spotCheckManName + ", em=" + em + ", emName=" + emName + ", emCode=" + emCode
				+ ", spotCheckDate=" + spotCheckDate + ", emGroup=" + emGroup + ", emGroupName=" + emGroupName
				+ ", emGroupCode=" + emGroupCode + ", currentState=" + currentState + ", dept=" + dept + ", deptName="
				+ deptName + ", operatState=" + operatState + ", isRepair=" + isRepair 
				+ ", org=" + org + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy="
				+ modifiedBy + ", modifiedOn=" + modifiedOn + ", dr=" + dr + ", ts=" + ts + ", def1=" + def1 + ", def2="
				+ def2 + ", def3=" + def3 + ", def4=" + def4 + ", def5=" + def5 + ", def6=" + def6 + ", def7=" + def7
				+ ", def8=" + def8 + ", def9=" + def9 + ", def10=" + def10 + "]";
	}
	
}