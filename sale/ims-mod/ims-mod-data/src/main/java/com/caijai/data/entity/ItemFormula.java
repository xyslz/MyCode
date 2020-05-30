package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.FmType;

/**
 * 配方关系表
 * @author wdh
 *
 */

@Table(name = "PL_ItemFormula")
public class ItemFormula extends BaseTable{
	
	private static final long serialVersionUID = 3576720505170521185L;

	@Column(name = "id",primary = true)
	private String id;
	
	@Column(name = "CreatedOn")
	private String createdOn;
	
	@Column(name = "CreatedBy")
	private String createdBy;
	
	@Column(name = "ModifiedOn")
	private String modifiedOn;
	
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	
	@Column(name = "Org")
	private String org;
	
	@Column(name = "Dr")
	private Integer dr;
	
	@Column(name = "Ts")
	private String ts;
	
	/** 配方编号 */
	@Column(name = "Code")
	private String code;
	
	/** 配方物料类型，0-熔炼钕铁硼，1-熔炼钐钴，2-粗粉，3-细粉 */
	@Column(name = "flag")
	private FmType flag;
	
	/** 料品ID */
	@Column(name = "itemMaster")
	private String itemMaster;
	
	/** 料号 */
	@Column(name = "itemMasterCode")
	private String itemMasterCode;
	
	/** 品名 */
	@Column(name = "itemMasterName")
	private String itemMasterName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public FmType getFlag() {
		return flag;
	}

	public void setFlag(FmType flag) {
		this.flag = flag;
	}

	public String getItemMaster() {
		return itemMaster;
	}

	public void setItemMaster(String itemMaster) {
		this.itemMaster = itemMaster;
	}

	public String getItemMasterCode() {
		return itemMasterCode;
	}

	public void setItemMasterCode(String itemMasterCode) {
		this.itemMasterCode = itemMasterCode;
	}

	public String getItemMasterName() {
		return itemMasterName;
	}

	public void setItemMasterName(String itemMasterName) {
		this.itemMasterName = itemMasterName;
	}
					
}
