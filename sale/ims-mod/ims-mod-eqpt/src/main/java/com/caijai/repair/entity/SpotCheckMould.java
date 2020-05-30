package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;
import com.caijai.base.sysenum.U9STATE;

/**
 * 点检计划
 * 
 * @author ChenYu
 *
 */
@Table(name = "EQ_SpotCheckMould")
public class SpotCheckMould extends BaseTable {

	private static final long serialVersionUID = -2534852210101617814L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;

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
	 * 点检车间
	 */
	@Column(name = "dept")
	private String dept;
	
	/**
	 * 点检车间名称
	 */
	@Column(name = "deptName",readonly = true)
	@Relation(table = "SYS_Department", value = "id", ref = "dept", show = "name")
	private String deptName;
	
	/**
	 * 产线
	 */
	@Column(name = "proLine")
	private String proLine;

	/**
	 * 产线名称
	 */
	@Column(name = "proLineCode", readonly = true)
	@Relation(table = "EQ_ProductionLine", value = "id", show = "Code", ref = "proLine")
	private String proLineCode;

	/**
	 * 生效
	 */
	@Column(name = "isState")
	private U9STATE isState;

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
	@Column(name = "CreatedOn", sort = Sort.DESC)
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

	public String getProLine() {
		return proLine;
	}

	public void setProLine(String proLine) {
		this.proLine = proLine;
	}

	public String getProLineCode() {
		return proLineCode;
	}

	public void setProLineCode(String proLineCode) {
		this.proLineCode = proLineCode;
	}

	public U9STATE getIsState() {
		return isState;
	}

	public void setIsState(U9STATE isState) {
		this.isState = isState;
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
		return "SpotCheckPlan [id=" + id + ", emGroup=" + emGroup + ", emGroupName=" + emGroupName + ", emGroupCode="
				+ emGroupCode + ", dept=" + dept + ", deptName=" + deptName + ", proLine=" + proLine + ", proLineCode="
				+ proLineCode + ", isState=" + isState + ", org=" + org + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", dr=" + dr + ", ts=" + ts
				+ ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + ", def4=" + def4 + ", def5=" + def5 + "]";
	}
	
}