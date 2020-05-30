package com.caijai.repair.entity.vo;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Localization;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.wx.FaultState;
import com.caijai.base.sysenum.Sort;

/**
 * 故障码
 * 
 * @author duan2
 *
 */
@Table(name = "EQ_FaultCode")
@Localization("故障码")
public class FaultcodeVO extends BaseTable {

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
	@Localization("报警编号")
	private String code;

	/**
	 * 报警名称
	 */
	@Column(name = "Name")
	@Localization("报警名称")
	private String name;

	@Column(name = "text")
	@Localization("报警文本")
	private String text;

	@Column(name = "level")
	@Localization("类别")
	private String level;

	@Column(name = "variable")
	@Localization("触发变量")
	private String variable;

	@Column(name = "set")
	@Localization("触发位")
	private String set;

	@Column(name = "address")
	@Localization("触发地址")
	private String address;

	/**
	 * 启用（是否忽略）
	 */
	@Column(name = "ignore")
	@Localization("启用")
	private FaultState ignore;

	/**
	 * 备注
	 */
	@Column(name = "meno")
	@Localization("备注")
	private String meno;

	/**
	 * 创建时间
	 */
	@Column(name = "CreatedOn")
	@Localization("创建时间")
	private String createdOn;

	/**
	 * 创建人
	 */
	@Column(name = "CreatedBy")
	@Localization("创建人")
	private String createdBy;

	/**
	 * 修改时间
	 */
	@Column(name = "ModifiedOn")
	@Localization("修改时间")
	private String modifiedOn;

	/**
	 * 修改人
	 */
	@Column(name = "ModifiedBy")
	@Localization("修改人")
	private String modifiedBy;

	/**
	 * 公司
	 */
	@Column(name = "Org")
	@Localization("公司")
	private String org;

	/**
	 * 设备组ID
	 */
	@Column(name = "EMGroup_ID")
	@Localization("设备组ID")
	private String emgroupId;

	/**
	 * 设备组
	 */
	@Column(name = "EMGroup_Name")
	@Localization("设备组")
	@Relation(show = "name", table = "EQ_EMGroup", value = "id", ref = "EMGroup_ID")
	private String emgroupName;

	/**
	 * 供应商
	 */
	@Column(name = "supplier")
	private String supplier;

	/**
	 * 供应商名称
	 */
	@Column(name = "supplierName")
	@Relation(show = "name", table = "BD_Supplier", value = "id", ref = "supplier")
	private String supplierName;

	/**
	 * 分类ID
	 */
	@Column(name = "Classify_ID")
	@Localization("故障分类ID")
	private String classifyId;

	/**
	 * 故障分类
	 */
	@Column(name = "Classify_Name")
	@Localization("故障分类")
	private String classifyName;

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

	@Override
	public String toString() {
		return "FaultcodeVO [id=" + id + ", ts=" + ts + ", dr=" + dr + ", sysSource=" + sysSource + ", code=" + code
				+ ", name=" + name + ", text=" + text + ", level=" + level + ", variable=" + variable + ", set=" + set
				+ ", address=" + address + ", ignore=" + ignore + ", meno=" + meno + ", createdOn=" + createdOn
				+ ", createdBy=" + createdBy + ", modifiedOn=" + modifiedOn + ", modifiedBy=" + modifiedBy + ", org="
				+ org + ", emgroupId=" + emgroupId + ", emgroupName=" + emgroupName + ", supplier=" + supplier
				+ ", supplierName=" + supplierName + ", classifyId=" + classifyId + ", classifyName=" + classifyName
				+ "]";
	}

}