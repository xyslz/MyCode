package com.caijai.repair.entity.vo;

import com.caijai.repair.entity.SpotCheckRecordLine;
import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.sysenum.wx.CheckCycle;
import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.sysenum.Sort;
import com.caijai.base.sysenum.wx.SpotCheckCurrentState;
import com.caijai.base.sysenum.wx.SpotCheckOperatState;

/**
 * 点检记录行
 * 
 * @author ChenYu
 *
 */
@Table(name = "EQ_SpotCheckRecordLine")
public class SpotCheckRecordLineVO extends SpotCheckRecordLine {

	private static final long serialVersionUID = -2174874016493534013L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;
	
	private String maintainMethod;
	
	/**
	 * 当前状态--主表信息
	 */
	@Column(name = "currentState",readonly = true)
	@Relation(table = "EQ_spotCheckRecord", value = "id", ref = "spotCheckRecord", show = "currentState")
	private String currentState;
	
	/**
	 * 运行状态 -- 主表信息
	 */
	@Column(name = "operatState",readonly = true)
	@Relation(table = "EQ_spotCheckRecord", value = "id", ref = "spotCheckRecord", show = "operatState")
	private String operatState;
	
	/**
	 * 设备编码--前台传参设备编码
	 */
	@Column(name = "em",readonly = true)
	@Relation(table = "EQ_spotCheckRecord", value = "id", ref = "spotCheckRecord", show = "em")
	private String em;
	
	/**
	 * 设备是否维修 -- 前台传参
	 */
	@Column(name = "isRepair",readonly = true)
	@Relation(table = "EQ_spotCheckRecord", value = "id", ref = "spotCheckRecord", show = "isRepair")
	private String isRepair;

	/**
	 * 点检记录
	 */
	@Column(name = "spotCheckRecord")
	private String spotCheckRecord;

	/**
	 * 点检方法
	 */
	@Column(name = "spotCheckMethod")
	private String spotCheckMethod;
	
	/**
	 * 点检项目
	 */
	@Column(name = "spotCheckProject")
	private String spotCheckProject;
	
	/**
	 * 点检项目名称
	 */
	@Column(name = "spotCheckProjectName",readonly = true)
	@Relation(table = "EQ_SpotCheckProject", value = "id", ref = "spotCheckProject", show = "name")
	private String spotCheckProjectName;

	/**
	 * 判定基准
	 */
	@Column(name = "criterion")
	private String criterion;
	
	/**
	 * 检查方法
	 */
	@Column(name = "checkMethod")
	private String checkMethod;
	
	/**
	 * 检查方法名称
	 */
	@Column(name = "checkMethodName")
	private String checkMethodName;
	
	/**
	 * 检查周期
	 */
	@Column(name = "checkCycle")
	private String checkCycle;
	
	/**
	 * 实际值
	 */
	@Column(name = "actValue")
	private Double actValue;
	
	/**
	 * 参数上限
	 */
	@Column(name = "paramUpper")
	private Double paramUpper;
	
	/**
	 * 参数下限
	 */
	@Column(name = "paramLower")
	private Double paramLower;
	
	/**
	 * 点检结果
	 */
	@Column(name = "spotCheckResult")
	private String spotCheckResult;

	/**
	 * 情况说明
	 */
	@Column(name = "description")
	private String description;

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

	public String getSpotCheckRecord() {
		return spotCheckRecord;
	}

	public void setSpotCheckRecord(String spotCheckRecord) {
		this.spotCheckRecord = spotCheckRecord;
	}

	public String getSpotCheckMethod() {
		return spotCheckMethod;
	}

	public void setSpotCheckMethod(String spotCheckMethod) {
		this.spotCheckMethod = spotCheckMethod;
	}

	public String getSpotCheckProject() {
		return spotCheckProject;
	}

	public void setSpotCheckProject(String spotCheckProject) {
		this.spotCheckProject = spotCheckProject;
	}

	public String getSpotCheckProjectName() {
		return spotCheckProjectName;
	}

	public void setSpotCheckProjectName(String spotCheckProjectName) {
		this.spotCheckProjectName = spotCheckProjectName;
	}

	public String getCriterion() {
		return criterion;
	}

	public void setCriterion(String criterion) {
		this.criterion = criterion;
	}

	public String getCheckMethod() {
		return checkMethod;
	}

	public void setCheckMethod(String checkMethod) {
		this.checkMethod = checkMethod;
	}

	public String getCheckMethodName() {
		return checkMethodName;
	}

	public void setCheckMethodName(String checkMethodName) {
		this.checkMethodName = checkMethodName;
	}

	public Double getParamUpper() {
		return paramUpper;
	}

	public void setParamUpper(Double paramUpper) {
		this.paramUpper = paramUpper;
	}

	public Double getParamLower() {
		return paramLower;
	}

	public void setParamLower(Double paramLower) {
		this.paramLower = paramLower;
	}

	public String getSpotCheckResult() {
		return spotCheckResult;
	}

	public void setSpotCheckResult(String spotCheckResult) {
		this.spotCheckResult = spotCheckResult;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getEm() {
		return em;
	}

	public void setEm(String em) {
		this.em = em;
	}

	public SpotCheckCurrentState getCurrentState() {
		return SpotCheckCurrentState.get(currentState);
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
		super.setCurrentState(getCurrentState());
	}

	public SpotCheckOperatState getOperatState() {
		return SpotCheckOperatState.get(operatState);
	}

	public void setOperatState(String operatState) {
		this.operatState = operatState;
		super.setOperatState(getOperatState());
	}

	public SYSSET getIsRepair() {
		return SYSSET.get(isRepair);
	}

	public void setIsRepair(String isRepair) {
		this.isRepair = isRepair;
		super.setIsRepair(getIsRepair());
	}

	public CheckCycle getCheckCycle() {
		return CheckCycle.get(checkCycle);
	}

	public void setCheckCycle(String checkCycle) {
		this.checkCycle = checkCycle;
		super.setCheckCycle(getCheckCycle());
	}

	public Double getActValue() {
		return actValue;
	}

	public void setActValue(Double actValue) {
		this.actValue = actValue;
	}

	public String getMaintainMethod() {
		return maintainMethod;
	}

	public void setMaintainMethod(String maintainMethod) {
		this.maintainMethod = maintainMethod;
	}

	@Override
	public String toString() {
		return "SpotCheckRecordLine [id=" + id + ", spotCheckRecord=" + spotCheckRecord + ", spotCheckMethod="
				+ spotCheckMethod + ", spotCheckProject=" + spotCheckProject + ", spotCheckProjectName="
				+ spotCheckProjectName + ", criterion=" + criterion + ", checkMethod=" + checkMethod
				+ ", checkMethodName=" + checkMethodName + ", checkCycle=" + checkCycle + ", paramUpper=" + paramUpper
				+ ", paramLower=" + paramLower + ", spotCheckResult=" + spotCheckResult + ", description=" + description
				+ ", org=" + org + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy="
				+ modifiedBy + ", modifiedOn=" + modifiedOn + ", dr=" + dr + ", ts=" + ts + ", def1=" + def1 + ", def2="
				+ def2 + ", def3=" + def3 + ", def4=" + def4 + ", def5=" + def5 + ", def6=" + def6 + ", def7=" + def7
				+ ", def8=" + def8 + ", def9=" + def9 + ", def10=" + def10 + "]";
	}
	
}