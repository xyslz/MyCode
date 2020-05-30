package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.ItemSubType;
import com.caijai.base.sysenum.Sort;

/**
 * Title: ItemMasterSub生产副产品
 * <p>
 * Description: <br>
 * 
 * @author 杨雪景
 * @date 2019年4月23日
 */
@Table(name = "BD_ItemMasterSub")
public class ItemMasterSub extends BaseTable {

	private static final long serialVersionUID = 6454144356782217811L;

	@Column(name = "ID")
	private String id;

	@Column(name = "subProducts")
	private String subProducts;

	/**
	 * 副品名
	 */
	@Column(name = "subProductsName")
	private String subProductsName;

	@Column(name = "subProductsCode")
	private String subProductsCode;

	/**
	 * 主产品
	 */
	@Column(name = "MainProducts")
	private String mainProducts;

	/**
	 * 主产品名称
	 */
	@Column(name = "mainProductsName")
	private String mainProductsName;

	/**
	 * 主产品编码
	 */
	@Column(name = "mainProductsCode", sort = Sort.ASC)
	private String mainProductsCode;

	/**
	 * 主单位--生产单位
	 */
	@Column(name = "MainUOM")
	private String mainUOM;

	@Column(name = "mainUOMName")
	private String mainUOMName;
	
	/**
	 * 主产品--成本单位
	 */
	@Column(name = "MainCoUOM")
	private String mainCoUOM;

	@Column(name = "mainCoUOMName")
	private String mainCoUOMName;

	/**
	 * 副单位--生产单位
	 */
	@Column(name = "SubUOM")
	private String subUOM;

	@Column(name = "SubUOMName")
	private String subUOMName;
	
	/**
	 * 副产品--成本单位
	 */
	@Column(name = "subCoUOM")
	private String subCoUOM;

	@Column(name = "subCoUOMName")
	private String subCoUOMName;

	/**
	 * 转换率
	 */
	@Column(name = "ConverRate")
	private Double converRate;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedOn")
	private String createdOn;

	@Column(name = "Dr")
	private Integer dr;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

	@Column(name = "Org")
	private String org;

	/**
	 * 大分类（新增）
	 */
	@Column(name = "Segment1")
	private String segment1;

	/**
	 * 小分类（新增）
	 */
	@Column(name = "Segment2")
	private String segment2;
	
	/**
	 * 编码（新增）
	 */
	@Column(name = "Segment3")
	private String segment3;
	
	@Column(name = "MainSegment1")
	private String mainSegment1;
	
	@Column(name = "MainSegment2")
	private String mainSegment2;
	
	@Column(name = "MainSegment3")
	private String mainSegment3;
	
	@Column(name = "SubSegment1")
	private String subSegment1;
	
	@Column(name = "SubSegment2")
	private String subSegment2;
	
	@Column(name = "SubSegment3")
	private String subSegment3;
	

	@Column(name = "SyncMemo")
	private String syncMemo;

	@Column(name = "SyncSource")
	private String syncSource;

	@Column(name = "SyncSourceID")
	private String syncSourceID;

	@Column(name = "SyncTs")
	private String syncTs;

	@Column(name = "SysVersion")
	private String sysVersion;

	@Column(name = "Ts")
	private String ts;

	@Column(name = "Type")
	private ItemSubType type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
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

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getSegment1() {
		return segment1;
	}

	public void setSegment1(String segment1) {
		this.segment1 = segment1;
	}

	public String getSegment2() {
		return segment2;
	}

	public void setSegment2(String segment2) {
		this.segment2 = segment2;
	}

	public String getSyncMemo() {
		return syncMemo;
	}

	public void setSyncMemo(String syncMemo) {
		this.syncMemo = syncMemo;
	}

	public String getSyncSource() {
		return syncSource;
	}

	public void setSyncSource(String syncSource) {
		this.syncSource = syncSource;
	}

	public String getSyncSourceID() {
		return syncSourceID;
	}

	public void setSyncSourceID(String syncSourceID) {
		this.syncSourceID = syncSourceID;
	}

	public String getSyncTs() {
		return syncTs;
	}

	public void setSyncTs(String syncTs) {
		this.syncTs = syncTs;
	}

	public String getSysVersion() {
		return sysVersion;
	}

	public String getMainProducts() {
		return mainProducts;
	}

	public void setMainProducts(String mainProducts) {
		this.mainProducts = mainProducts;
	}

	public String getMainUOM() {
		return mainUOM;
	}

	public void setMainUOM(String mainUOM) {
		this.mainUOM = mainUOM;
	}

	public String getSubUOM() {
		return subUOM;
	}

	public void setSubUOM(String subUOM) {
		this.subUOM = subUOM;
	}

	public Double getConverRate() {
		return converRate;
	}

	public void setConverRate(Double converRate) {
		this.converRate = converRate;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public ItemSubType getType() {
		return type;
	}

	public void setType(ItemSubType type) {
		this.type = type;
	}

	public String getMainProductsName() {
		return mainProductsName;
	}

	public void setMainProductsName(String mainProductsName) {
		this.mainProductsName = mainProductsName;
	}

	public String getMainProductsCode() {
		return mainProductsCode;
	}

	public void setMainProductsCode(String mainProductsCode) {
		this.mainProductsCode = mainProductsCode;
	}

	public String getMainUOMName() {
		return mainUOMName;
	}

	public void setMainUOMName(String mainUOMName) {
		this.mainUOMName = mainUOMName;
	}

	public String getSubUOMName() {
		return subUOMName;
	}

	public void setSubUOMName(String subUOMName) {
		this.subUOMName = subUOMName;
	}

	public String getSubProducts() {
		return subProducts;
	}

	public void setSubProducts(String subProducts) {
		this.subProducts = subProducts;
	}

	public String getSubProductsName() {
		return subProductsName;
	}

	public void setSubProductsName(String subProductsName) {
		this.subProductsName = subProductsName;
	}

	public String getSubProductsCode() {
		return subProductsCode;
	}

	public void setSubProductsCode(String subProductsCode) {
		this.subProductsCode = subProductsCode;
	}

	public String getSegment3() {
		return segment3;
	}

	public void setSegment3(String segment3) {
		this.segment3 = segment3;
	}

	public String getMainSegment1() {
		return mainSegment1;
	}

	public void setMainSegment1(String mainSegment1) {
		this.mainSegment1 = mainSegment1;
	}

	public String getMainSegment2() {
		return mainSegment2;
	}

	public void setMainSegment2(String mainSegment2) {
		this.mainSegment2 = mainSegment2;
	}

	public String getMainSegment3() {
		return mainSegment3;
	}

	public void setMainSegment3(String mainSegment3) {
		this.mainSegment3 = mainSegment3;
	}

	public String getSubSegment1() {
		return subSegment1;
	}

	public void setSubSegment1(String subSegment1) {
		this.subSegment1 = subSegment1;
	}

	public String getSubSegment2() {
		return subSegment2;
	}

	public void setSubSegment2(String subSegment2) {
		this.subSegment2 = subSegment2;
	}

	public String getSubSegment3() {
		return subSegment3;
	}

	public void setSubSegment3(String subSegment3) {
		this.subSegment3 = subSegment3;
	}

	public String getMainCoUOM() {
		return mainCoUOM;
	}

	public void setMainCoUOM(String mainCoUOM) {
		this.mainCoUOM = mainCoUOM;
	}

	public String getMainCoUOMName() {
		return mainCoUOMName;
	}

	public void setMainCoUOMName(String mainCoUOMName) {
		this.mainCoUOMName = mainCoUOMName;
	}

	public String getSubCoUOM() {
		return subCoUOM;
	}

	public void setSubCoUOM(String subCoUOM) {
		this.subCoUOM = subCoUOM;
	}

	public String getSubCoUOMName() {
		return subCoUOMName;
	}

	public void setSubCoUOMName(String subCoUOMName) {
		this.subCoUOMName = subCoUOMName;
	}

}
