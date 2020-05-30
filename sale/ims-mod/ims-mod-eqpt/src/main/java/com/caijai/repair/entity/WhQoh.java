package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseEntity;

/**
 * 对应U9的实时库存表
 * @author duan2
 *
 */
@Table(name="view_InvTrans_WhQoh")
public class WhQoh extends BaseEntity{
	
	private static final long serialVersionUID = -2212289710012931655L;

	@Column(name="ID",primary=true)
	private String id;
	
	@Column(name="itemID")
	private String itemID;
	
	@Column(name="itemName")
	private String itemName;
	
	@Column(name="itemCode")
	private String itemCode;
	
	@Column(name="qty")
	private Double qty;
	
	@Column(name="StoreUOM")
	private String storeUOM;
	
	@Column(name="uomName")
	private String uomName;
	
	@Column(name="Wh")
	private String wh;
	
	@Column(name="whName")
	private String whName;
	
	@Column(name="org")
	private String org;

	@Column(name="dr")
	private Integer dr;

	@Column(name="ts")
	private String ts;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public String getStoreUOM() {
		return storeUOM;
	}

	public void setStoreUOM(String storeUOM) {
		this.storeUOM = storeUOM;
	}

	public String getUomName() {
		return uomName;
	}

	public void setUomName(String uomName) {
		this.uomName = uomName;
	}

	public String getWh() {
		return wh;
	}

	public void setWh(String wh) {
		this.wh = wh;
	}

	public String getWhName() {
		return whName;
	}

	public void setWhName(String whName) {
		this.whName = whName;
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

	@Override
	public String toString() {
		return "WhQoh [id=" + id + ", itemID=" + itemID + ", itemName=" + itemName + ", itemCode=" + itemCode + ", qty="
				+ qty + ", storeUOM=" + storeUOM + ", uomName=" + uomName + ", wh=" + wh + ", whName=" + whName
				+ ", org=" + org + ", dr=" + dr + ", ts=" + ts + "]";
	}


}
