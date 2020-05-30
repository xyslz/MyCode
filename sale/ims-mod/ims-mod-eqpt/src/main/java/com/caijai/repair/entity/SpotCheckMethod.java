package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.wx.CheckCycle;
import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.sysenum.Sort;
import com.caijai.base.sysenum.U9STATE;

/**
 * 点检方法
 * 
 * @author ChenYu
 *
 */
@Table(name = "EQ_SpotCheckMethod")
public class SpotCheckMethod extends BaseTable {

	private static final long serialVersionUID = -93855677802661771L;

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
	 * 点检项目编码
	 */
	@Column(name = "spotCheckProjectCode",readonly = true)
	@Relation(table = "EQ_SpotCheckProject", value = "id", ref = "spotCheckProject", show = "code")
	private String spotCheckProjectCode;

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
	 * 是否为范围值
	 */
	@Column(name = "isRangeValue",readonly = true)
	@Relation(table = "EQ_CheckMethod", value = "id", ref = "checkMethod", show = "isRangeValue")
	private SYSSET isRangeValue;
	
	/**
	 * 检查方法名称
	 */
	@Column(name = "checkMethodName")
	private String checkMethodName;
	
	/**
	 * 检查周期
	 */
	@Column(name = "checkCycle")
	private CheckCycle checkCycle;
	
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

	public String getSpotCheckProject() {
		return spotCheckProject;
	}

	public void setSpotCheckProject(String spotCheckProject) {
		this.spotCheckProject = spotCheckProject;
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

	public CheckCycle getCheckCycle() {
		return checkCycle;
	}

	public void setCheckCycle(CheckCycle checkCycle) {
		this.checkCycle = checkCycle;
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

	public String getSpotCheckProjectName() {
		return spotCheckProjectName;
	}

	public void setSpotCheckProjectName(String spotCheckProjectName) {
		this.spotCheckProjectName = spotCheckProjectName;
	}

	public String getSpotCheckProjectCode() {
		return spotCheckProjectCode;
	}

	public void setSpotCheckProjectCode(String spotCheckProjectCode) {
		this.spotCheckProjectCode = spotCheckProjectCode;
	}

	public String getCheckMethodName() {
		return checkMethodName;
	}

	public void setCheckMethodName(String checkMethodName) {
		this.checkMethodName = checkMethodName;
	}

	public SYSSET getIsRangeValue() {
		return isRangeValue;
	}

	public void setIsRangeValue(SYSSET isRangeValue) {
		this.isRangeValue = isRangeValue;
	}

	@Override
	public String toString() {
		return "SpotCheckMethod [id=" + id + ", emGroup=" + emGroup + ", emGroupName=" + emGroupName + ", emGroupCode="
				+ emGroupCode + ", spotCheckProject=" + spotCheckProject + ", spotCheckProjectName="
				+ spotCheckProjectName + ", spotCheckProjectCode=" + spotCheckProjectCode + ", criterion=" + criterion
				+ ", checkMethod=" + checkMethod + ", isRangeValue=" + isRangeValue + ", checkMethodName="
				+ checkMethodName + ", checkCycle=" + checkCycle + ", paramUpper=" + paramUpper + ", paramLower="
				+ paramLower + ", isState=" + isState + ", org=" + org + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", dr=" + dr + ", ts=" + ts
				+ ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + ", def4=" + def4 + ", def5=" + def5 + "]";
	}
	
}