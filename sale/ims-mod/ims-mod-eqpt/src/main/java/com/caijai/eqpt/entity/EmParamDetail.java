package com.caijai.eqpt.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseEntity;
import com.caijai.base.sysenum.U9STATE;

/**
 * 设备参数模板子表
 * 
 * @author ChenYu
 *
 */
@Table(name = "eq_parameterDetail")
public class EmParamDetail extends BaseEntity {

	private static final long serialVersionUID = 3191533301889122428L;

	@Column(name = "ID", primary = true)
	private String id; // 主键

	@Column(name = "TempID")
	private String tempID; // 模板主键

	@Column(name = "paraName")
	private String paraName;// 参数名称

	@Column(name = "paraClass")
	private String paraClass; // 参数类型

	@Column(name = "readOrWrite")
	private String readOrWrite; // 读写类型

	@Column(name = "timeSharing")
	private String timeSharing; // 分时参数

	@Column(name = "unit")
	private String unit; // 单位

	@Column(name = "standards")
	private Double standards; // 标准值

	@Column(name = "upperLimit")
	private Double upperLimit; // 上限

	@Column(name = "lowerLimit")
	private Double lowerLimit; // 下限

	@Column(name = "enumeration")
	private String enumeration; // 可扩展枚举

	@Column(name = "remark")
	private String remark; // 备注
	
	@Column(name = "isState")
	private U9STATE isState; // 生效

	@Column(name = "org")
	private String org;// 集团

	@Column(name = "creator")
	private String creator; // 创建人

	@Column(name = "createTime")
	private String createTime; // 创建时间

	@Column(name = "modifier")
	private String modifier; // 修改人

	@Column(name = "modifyTime")
	private String modifyTime; // 修改时间
	
	@Column(name = "dr")
	private Integer dr; // 作废标识

	@Column(name = "ts")
	private String ts; // 时间戳

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

	public String getTempID() {
		return tempID;
	}

	public void setTempID(String tempID) {
		this.tempID = tempID;
	}

	public String getParaName() {
		return paraName;
	}

	public void setParaName(String paraName) {
		this.paraName = paraName;
	}

	public String getParaClass() {
		return paraClass;
	}

	public void setParaClass(String paraClass) {
		this.paraClass = paraClass;
	}

	public String getReadOrWrite() {
		return readOrWrite;
	}

	public void setReadOrWrite(String readOrWrite) {
		this.readOrWrite = readOrWrite;
	}

	public String getTimeSharing() {
		return timeSharing;
	}

	public void setTimeSharing(String timeSharing) {
		this.timeSharing = timeSharing;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getStandards() {
		return standards;
	}

	public void setStandards(Double standards) {
		this.standards = standards;
	}

	public Double getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(Double upperLimit) {
		this.upperLimit = upperLimit;
	}

	public Double getLowerLimit() {
		return lowerLimit;
	}

	public void setLowerLimit(Double lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public String getEnumeration() {
		return enumeration;
	}

	public void setEnumeration(String enumeration) {
		this.enumeration = enumeration;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
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
		return "EmParamDetail [id=" + id + ", tempID=" + tempID + ", paraName=" + paraName + ", paraClass=" + paraClass
				+ ", readOrWrite=" + readOrWrite + ", timeSharing=" + timeSharing + ", unit=" + unit + ", standards="
				+ standards + ", upperLimit=" + upperLimit + ", lowerLimit=" + lowerLimit + ", enumeration="
				+ enumeration + ", remark=" + remark + ", isState=" + isState + ", org=" + org + ", creator=" + creator
				+ ", createTime=" + createTime + ", modifier=" + modifier + ", modifyTime=" + modifyTime + ", dr=" + dr
				+ ", ts=" + ts + ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + ", def4=" + def4 + ", def5="
				+ def5 + "]";
	}


}
