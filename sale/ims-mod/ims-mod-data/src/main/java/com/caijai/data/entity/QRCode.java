package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
 * 物料标签
 * @author CY
 * @date 2019年7月22日
 */
@Table(name = "BD_QRCode")
public class QRCode extends BaseTable{
	
	private static final long serialVersionUID = 5618535526723726638L;

	/**
	 * 主键
	 */
	@Column(name = "id", primary = true)
	private String id;
	
	/**
	 * 创建时间
	 */
	@Column(name = "createdOn")
	private String createdOn;
	
	/**
	 * 创建人
	 */
	@Column(name = "createdBy")
	private String createdBy;
	
	/**
	 * 修改时间
	 */
	@Column(name = "modifiedOn")
	private String modifiedOn;
	
	/**
	 * 修改人
	 */
	@Column(name = "modifiedBy")
	private String modifiedBy;
	
	/**
	 * 组织
	 */
	@Column(name = "org")
	private String org;
	
	/**
	 * 编码
	 */
	@Column(name = "itemCode")
	private String itemCode;
	
	/**
	 * 名称
	 */
	@Column(name = "itemName")
	private String itemName;
	
	@Column(name = "item")
	private String item;
	
	/**
	 * 供应商批次
	 */
	@Column(name = "batchNo")
	private String batchNo;
	
	/**
	 * 来源单号
	 */
	@Column(name = "sourceDocNo")
	private String sourceDocNo;
	
	/**
	 * 来源行ID
	 */
	@Column(name = "sourceLineID")
	private String sourceLineID;
	
	/**
	 * 供应商
	 */
	@Column(name = "supplier")
	private String supplier;
	
	@Column(name = "supplierCode", readonly = true)
	@Relation(table = "BD_Supplier", value = "id", ref = "supplier", show = "code")
	private String supplierCode;
	
	@Column(name = "supplierName", readonly = true)
	@Relation(table = "BD_Supplier", value = "id", ref = "supplier", show = "name")
	private String supplierName;
	
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

	@Column(name = "dr")
	private Integer dr;
	
	@Column(name = "ts")
	private String ts;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		Long.parseLong(id);
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

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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

	public String getSourceDocNo() {
		return sourceDocNo;
	}

	public void setSourceDocNo(String sourceDocNo) {
		this.sourceDocNo = sourceDocNo;
	}

	public String getSourceLineID() {
		return sourceLineID;
	}

	public void setSourceLineID(String sourceLineID) {
		this.sourceLineID = sourceLineID;
	}
	
}
