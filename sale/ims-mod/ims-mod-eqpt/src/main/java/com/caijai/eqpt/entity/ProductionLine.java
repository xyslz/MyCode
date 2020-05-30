package com.caijai.eqpt.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;
import com.caijai.base.sysenum.U9STATE;

/**
 * 产线
 * @author TK
 *
 */
@Table(name = "EQ_ProductionLine")
public class ProductionLine extends BaseTable {

	private static final long serialVersionUID = 4842435814947298987L;

	/**
	 * 创建时间
	 */
	@Column(name = "CreatedOn")
	private String createdOn;

	/**
	 * 修改时间
	 */
	@Column(name = "ModifiedOn")
	private String modifiedOn;

	/**
	 * 创建人
	 */
	@Column(name = "CreatedBy")
	private String createdBy;

	/**
	 * 修改人
	 */
	@Column(name = "ModifiedBy")
	private String modifiedBy;

	/**
	 * 编码
	 */
	@Column(name = "Code",sort = Sort.ASC)
	private String code;

	/**
	 * 名称
	 */
	@Column(name = "Name")
	private String name;

	/**
	 * 归属部门
	 */
	@Column(name = "Dept")
	private String dept;
	/**
	 * 归属部门名称
	 */
	@Column(name = "DeptName",readonly=true)
	@Relation(table = "SYS_Department", value = "code",ref = "dept", show = "name")
	private String deptName;
	
	/**
	 * U9中的是否生效
	 */
	//@Column(name = "Effective_IsEffective")
	private U9STATE isEffective;

	/**
	 * 组织
	 */
	@Column(name = "Org")
	private String org;
	/**
	 * 组织名称
	 */
	@Column(name = "OrgName",readonly=true)
	@Relation(table = "SYS_Organization", value = "id",ref = "org", show = "name")
	private String orgName;
	/**
	 * 数量
	 */
	@Column(name = "Qty")
	private Double qty;
	/**
	 * 数量单位
	 */
	@Column(name = "QtyUOM")
	private String qtyUOM;
	/**
	 * 数量单位
	 */
	@Column(name = "QtyUOMName",readonly=true)
	@Relation(table = "BD_UOM", value = "id",ref = "qtyUOM", show = "name")
	private String qtyUOMName;
	/**
	 * 用量单位
	 */
	@Column(name = "UsageUOM")
	private String usageUOM;
	/**
	 * 用量单位
	 */
	@Column(name = "UsageUOMName",readonly=true)
	@Relation(table = "BD_UOM", value = "id",ref = "usageUOM", show = "name")
	private String usageUOMName;
	/**
	 * 平均速率
	 */
	@Column(name = "ProductRate")
	private Double productRate;
	/**
	 * 是否归属资源
	 */
	//@Column(name = "IsSuperiorRes")
	private U9STATE isSuperiorRes;
	/**
	 * 资源分类
	 */
	@Column(name = "ResourceGroup")
	private Integer ResourceGroup;
	/**
	 * 备注
	 */
	@Column(name = "Description")
	private String description;

	/**
	 * ID
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 是否生效
	 */
	@Column(name = "IsState")
	private U9STATE isState;

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
	
	/**
	 * 数据来源
	 */
	@Column(name = "SysSource")
	private String syssource;

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
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

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public U9STATE getIsState() {
		return isState;
	}

	public void setIsState(U9STATE isState) {
		this.isState = isState;
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

	public String getSyssource() {
		return syssource;
	}

	public void setSyssource(String syssource) {
		this.syssource = syssource;
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

	public U9STATE getIsEffective() {
		return isEffective;
	}

	public void setIsEffective(U9STATE isEffective) {
		this.isEffective = isEffective;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public String getQtyUOM() {
		return qtyUOM;
	}

	public void setQtyUOM(String qtyUOM) {
		this.qtyUOM = qtyUOM;
	}

	public String getQtyUOMName() {
		return qtyUOMName;
	}

	public void setQtyUOMName(String qtyUOMName) {
		this.qtyUOMName = qtyUOMName;
	}

	public String getUsageUOM() {
		return usageUOM;
	}

	public void setUsageUOM(String usageUOM) {
		this.usageUOM = usageUOM;
	}

	public String getUsageUOMName() {
		return usageUOMName;
	}

	public void setUsageUOMName(String usageUOMName) {
		this.usageUOMName = usageUOMName;
	}

	public Double getProductRate() {
		return productRate;
	}

	public void setProductRate(Double productRate) {
		this.productRate = productRate;
	}

	public U9STATE getIsSuperiorRes() {
		return isSuperiorRes;
	}

	public void setIsSuperiorRes(U9STATE isSuperiorRes) {
		this.isSuperiorRes = isSuperiorRes;
	}

	public Integer getResourceGroup() {
		return ResourceGroup;
	}

	public void setResourceGroup(Integer resourceGroup) {
		ResourceGroup = resourceGroup;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProductionLine [createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy
				+ ", modifiedBy=" + modifiedBy + ", code=" + code + ", name=" + name + ", dept=" + dept + ", deptName="
				+ deptName + ", isEffective=" + isEffective + ", org=" + org + ", orgName=" + orgName + ", qty=" + qty
				+ ", qtyUOM=" + qtyUOM + ", qtyUOMName=" + qtyUOMName + ", usageUOM=" + usageUOM + ", usageUOMName="
				+ usageUOMName + ", productRate=" + productRate + ", isSuperiorRes=" + isSuperiorRes
				+ ", ResourceGroup=" + ResourceGroup + ", description=" + description + ", id=" + id + ", isState="
				+ isState + ", dr=" + dr + ", ts=" + ts + ", syssource=" + syssource + "]";
	}

}