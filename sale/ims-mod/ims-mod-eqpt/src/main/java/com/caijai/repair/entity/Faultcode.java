package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.wx.FaultState;
import com.caijai.base.sysenum.Sort;

@Table(name = "EQ_FaultCode")
public class Faultcode extends BaseTable {

	private static final long serialVersionUID = -9208426178279641201L;

	/**
	 * ID
	 */
	@Column(name = "ID",primary=true)
	private String id;

	/**
	 * 时间戳
	 */
	@Column(name = "ts")
	private String ts;

	/**
	 * 作废标识
	 */
	@Column(name = "dr")
	private Integer dr;

	/**
	 * 数据来源
	 */
	@Column(name = "sys_source")
	private String sysSource;

	/**
	 * 报警编号
	 */
	@Column(name = "Code", sort = Sort.ASC, byInt = true)
	private String code;

	/**
	 * 报警名称
	 */
	@Column(name = "Name")
	private String name;

	@Column(name = "text")
	private String text;

	@Column(name = "level")
	private String level;

	@Column(name = "variable")
	private String variable;

	@Column(name = "set")
	private String set;

	@Column(name = "address")
	private String address;

	/**
	 * 是否忽略
	 */
	@Column(name = "ignore")
	private FaultState ignore;

	/**
	 * 备注
	 */
	@Column(name = "meno")
	private String meno;

	/**
	 * 创建时间
	 */
	@Column(name = "CreatedOn")
	private String createdOn;

	/**
	 * 创建人
	 */
	@Column(name = "CreatedBy")
	private String createdBy;

	/**
	 * 修改时间
	 */
	@Column(name = "ModifiedOn")
	private String modifiedOn;

	/**
	 * 修改人
	 */
	@Column(name = "ModifiedBy")
	private String modifiedBy;

	/**
	 * 组织
	 */
	@Column(name = "Org")
	private String org;

	/**
	 * 设备组ID
	 */
	@Column(name = "EMGroup_ID")
	private String emgroupId;

	/**
	 * 设备组
	 */
	@Column(name = "EMGroup_Name",readonly = true)
	private String emgroupName;

	/**
	 * 供应商
	 */
	@Column(name = "supplier")
	private String supplier;

	/**
	 * 供应商名称
	 */
	@Column(name = "supplierName",readonly = true)
	@Relation(show = "name", table = "BD_Supplier", value = "id", ref = "supplier")
	private String supplierName;

	/**
	 * 分类ID
	 */
	@Column(name = "Classify_ID")
	private String classifyId;

	/**
	 * 故障分类
	 */
	@Column(name = "Classify_Name")
	private String classifyName;

	/**
	 * 扩展字段1
	 */
	@Column(name = "DescFlexField_PrivateDescSeg1")
	private String descflexfieldPrivatedescseg1;

	/**
	 * 扩展字段2
	 */
	@Column(name = "DescFlexField_PrivateDescSeg2")
	private String descflexfieldPrivatedescseg2;

	/**
	 * 扩展字段3
	 */
	@Column(name = "DescFlexField_PrivateDescSeg3")
	private String descflexfieldPrivatedescseg3;

	/**
	 * 扩展字段4
	 */
	@Column(name = "DescFlexField_PrivateDescSeg4")
	private String descflexfieldPrivatedescseg4;

	/**
	 * 扩展字段5
	 */
	@Column(name = "DescFlexField_PrivateDescSeg5")
	private String descflexfieldPrivatedescseg5;

	/**
	 * 扩展字段6
	 */
	@Column(name = "DescFlexField_PrivateDescSeg6")
	private String descflexfieldPrivatedescseg6;

	/**
	 * 扩展字段7
	 */
	@Column(name = "DescFlexField_PrivateDescSeg7")
	private String descflexfieldPrivatedescseg7;

	/**
	 * 扩展字段8
	 */
	@Column(name = "DescFlexField_PrivateDescSeg8")
	private String descflexfieldPrivatedescseg8;

	/**
	 * 扩展字段9
	 */
	@Column(name = "DescFlexField_PrivateDescSeg9")
	private String descflexfieldPrivatedescseg9;

	/**
	 * 扩展字段10
	 */
	@Column(name = "DescFlexField_PrivateDescSeg10")
	private String descflexfieldPrivatedescseg10;

	/**
	 * 扩展字段11
	 */
	@Column(name = "DescFlexField_PrivateDescSeg11")
	private String descflexfieldPrivatedescseg11;

	/**
	 * 扩展字段12
	 */
	@Column(name = "DescFlexField_PrivateDescSeg12")
	private String descflexfieldPrivatedescseg12;

	/**
	 * 扩展字段13
	 */
	@Column(name = "DescFlexField_PrivateDescSeg13")
	private String descflexfieldPrivatedescseg13;

	/**
	 * 扩展字段14
	 */
	@Column(name = "DescFlexField_PrivateDescSeg14")
	private String descflexfieldPrivatedescseg14;

	/**
	 * 扩展字段15
	 */
	@Column(name = "DescFlexField_PrivateDescSeg15")
	private String descflexfieldPrivatedescseg15;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getSysSource() {
		return sysSource;
	}

	public void setSysSource(String sysSource) {
		this.sysSource = sysSource;
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getSet() {
		return set;
	}

	public void setSet(String set) {
		this.set = set;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public FaultState getIgnore() {
		return ignore;
	}

	public void setIgnore(FaultState ignore) {
		this.ignore = ignore;
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
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

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getEmgroupId() {
		return emgroupId;
	}

	public void setEmgroupId(String emgroupId) {
		this.emgroupId = emgroupId;
	}

	public String getEmgroupName() {
		return emgroupName;
	}

	public void setEmgroupName(String emgroupName) {
		this.emgroupName = emgroupName;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getClassifyId() {
		return classifyId;
	}

	public void setClassifyId(String classifyId) {
		this.classifyId = classifyId;
	}

	public String getClassifyName() {
		return classifyName;
	}

	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}

	public String getDescflexfieldPrivatedescseg1() {
		return descflexfieldPrivatedescseg1;
	}

	public void setDescflexfieldPrivatedescseg1(String descflexfieldPrivatedescseg1) {
		this.descflexfieldPrivatedescseg1 = descflexfieldPrivatedescseg1;
	}

	public String getDescflexfieldPrivatedescseg2() {
		return descflexfieldPrivatedescseg2;
	}

	public void setDescflexfieldPrivatedescseg2(String descflexfieldPrivatedescseg2) {
		this.descflexfieldPrivatedescseg2 = descflexfieldPrivatedescseg2;
	}

	public String getDescflexfieldPrivatedescseg3() {
		return descflexfieldPrivatedescseg3;
	}

	public void setDescflexfieldPrivatedescseg3(String descflexfieldPrivatedescseg3) {
		this.descflexfieldPrivatedescseg3 = descflexfieldPrivatedescseg3;
	}

	public String getDescflexfieldPrivatedescseg4() {
		return descflexfieldPrivatedescseg4;
	}

	public void setDescflexfieldPrivatedescseg4(String descflexfieldPrivatedescseg4) {
		this.descflexfieldPrivatedescseg4 = descflexfieldPrivatedescseg4;
	}

	public String getDescflexfieldPrivatedescseg5() {
		return descflexfieldPrivatedescseg5;
	}

	public void setDescflexfieldPrivatedescseg5(String descflexfieldPrivatedescseg5) {
		this.descflexfieldPrivatedescseg5 = descflexfieldPrivatedescseg5;
	}

	public String getDescflexfieldPrivatedescseg6() {
		return descflexfieldPrivatedescseg6;
	}

	public void setDescflexfieldPrivatedescseg6(String descflexfieldPrivatedescseg6) {
		this.descflexfieldPrivatedescseg6 = descflexfieldPrivatedescseg6;
	}

	public String getDescflexfieldPrivatedescseg7() {
		return descflexfieldPrivatedescseg7;
	}

	public void setDescflexfieldPrivatedescseg7(String descflexfieldPrivatedescseg7) {
		this.descflexfieldPrivatedescseg7 = descflexfieldPrivatedescseg7;
	}

	public String getDescflexfieldPrivatedescseg8() {
		return descflexfieldPrivatedescseg8;
	}

	public void setDescflexfieldPrivatedescseg8(String descflexfieldPrivatedescseg8) {
		this.descflexfieldPrivatedescseg8 = descflexfieldPrivatedescseg8;
	}

	public String getDescflexfieldPrivatedescseg9() {
		return descflexfieldPrivatedescseg9;
	}

	public void setDescflexfieldPrivatedescseg9(String descflexfieldPrivatedescseg9) {
		this.descflexfieldPrivatedescseg9 = descflexfieldPrivatedescseg9;
	}

	public String getDescflexfieldPrivatedescseg10() {
		return descflexfieldPrivatedescseg10;
	}

	public void setDescflexfieldPrivatedescseg10(String descflexfieldPrivatedescseg10) {
		this.descflexfieldPrivatedescseg10 = descflexfieldPrivatedescseg10;
	}

	public String getDescflexfieldPrivatedescseg11() {
		return descflexfieldPrivatedescseg11;
	}

	public void setDescflexfieldPrivatedescseg11(String descflexfieldPrivatedescseg11) {
		this.descflexfieldPrivatedescseg11 = descflexfieldPrivatedescseg11;
	}

	public String getDescflexfieldPrivatedescseg12() {
		return descflexfieldPrivatedescseg12;
	}

	public void setDescflexfieldPrivatedescseg12(String descflexfieldPrivatedescseg12) {
		this.descflexfieldPrivatedescseg12 = descflexfieldPrivatedescseg12;
	}

	public String getDescflexfieldPrivatedescseg13() {
		return descflexfieldPrivatedescseg13;
	}

	public void setDescflexfieldPrivatedescseg13(String descflexfieldPrivatedescseg13) {
		this.descflexfieldPrivatedescseg13 = descflexfieldPrivatedescseg13;
	}

	public String getDescflexfieldPrivatedescseg14() {
		return descflexfieldPrivatedescseg14;
	}

	public void setDescflexfieldPrivatedescseg14(String descflexfieldPrivatedescseg14) {
		this.descflexfieldPrivatedescseg14 = descflexfieldPrivatedescseg14;
	}

	public String getDescflexfieldPrivatedescseg15() {
		return descflexfieldPrivatedescseg15;
	}

	public void setDescflexfieldPrivatedescseg15(String descflexfieldPrivatedescseg15) {
		this.descflexfieldPrivatedescseg15 = descflexfieldPrivatedescseg15;
	}

	@Override
	public String toString() {
		return "Faultcode [id=" + id + ", ts=" + ts + ", dr=" + dr + ", sysSource=" + sysSource + ", code=" + code
				+ ", name=" + name + ", text=" + text + ", level=" + level + ", variable=" + variable + ", set=" + set
				+ ", address=" + address + ", ignore=" + ignore + ", meno=" + meno + ", createdOn=" + createdOn
				+ ", createdBy=" + createdBy + ", modifiedOn=" + modifiedOn + ", modifiedBy=" + modifiedBy + ", org="
				+ org + ", emgroupId=" + emgroupId + ", emgroupName=" + emgroupName + ", supplier=" + supplier
				+ ", supplierName=" + supplierName + ", classifyId=" + classifyId + ", classifyName=" + classifyName
				+ ", descflexfieldPrivatedescseg1=" + descflexfieldPrivatedescseg1 + ", descflexfieldPrivatedescseg2="
				+ descflexfieldPrivatedescseg2 + ", descflexfieldPrivatedescseg3=" + descflexfieldPrivatedescseg3
				+ ", descflexfieldPrivatedescseg4=" + descflexfieldPrivatedescseg4 + ", descflexfieldPrivatedescseg5="
				+ descflexfieldPrivatedescseg5 + ", descflexfieldPrivatedescseg6=" + descflexfieldPrivatedescseg6
				+ ", descflexfieldPrivatedescseg7=" + descflexfieldPrivatedescseg7 + ", descflexfieldPrivatedescseg8="
				+ descflexfieldPrivatedescseg8 + ", descflexfieldPrivatedescseg9=" + descflexfieldPrivatedescseg9
				+ ", descflexfieldPrivatedescseg10=" + descflexfieldPrivatedescseg10
				+ ", descflexfieldPrivatedescseg11=" + descflexfieldPrivatedescseg11
				+ ", descflexfieldPrivatedescseg12=" + descflexfieldPrivatedescseg12
				+ ", descflexfieldPrivatedescseg13=" + descflexfieldPrivatedescseg13
				+ ", descflexfieldPrivatedescseg14=" + descflexfieldPrivatedescseg14
				+ ", descflexfieldPrivatedescseg15=" + descflexfieldPrivatedescseg15 + "]";
	}

}