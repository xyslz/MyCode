package com.caijai.data.entity;



import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseEntity;

/**
 * Title: ItemConvertRatioInClass
 * Description:料品转换率
 * @author 杨雪景
 * @date 2019年03月06日
 */
@Table(name = "BD_ItemConvertRatioInClass")
public class ItemConvertRatioInClass extends BaseEntity{


	private static final long serialVersionUID = 5597531956280456139L;
	
	@Column(name="ID")
	private String id;

	@Column(name="CreatedBy")
	private String createdBy;

	@Column(name="CreatedOn")
	private String createdOn;

	@Column(name="Def1")
	private String def1;

	@Column(name="Def2")
	private String def2;

	@Column(name="Def3")
	private String def3;

	@Column(name="Def4")
	private String def4;

	@Column(name="Def5")
	private String def5;

	@Column(name="Dr")
	private Integer dr;

	@Column(name="InventorySecondUOM")
	private String inventorySecondUOM;

	@Column(name="InventoryUOM")
	private String inventoryUOM;

	@Column(name="InventoryUOMName")
	private String inventoryUOMName;

	@Column(name="ItemMaster")
	private String itemMaster;

	@Column(name="ItemMasterCode")
	private String itemMasterCode;

	@Column(name="ItemMasterCode1")
	private String itemMasterCode1;

	@Column(name="ItemMasterName")
	private String itemMasterName;

	@Column(name="ManufactureUOM")
	private String manufactureUOM;

	@Column(name="ModifiedBy")
	private String modifiedBy;

	@Column(name="ModifiedOn")
	private String modifiedOn;

	@Column(name="PriceUOM")
	private String priceUOM;

	@Column(name="PurchaseUOM")
	private String purchaseUOM;

	@Column(name="Ratio")
	private Double ratio;

	@Column(name="SalesUOM")
	private String salesUOM;

	@Column(name="SyncMemo")
	private String syncMemo;

	@Column(name="SyncSource")
	private String syncSource;

	@Column(name="SyncSourceID")
	private String syncSourceID;

	@Column(name="SyncTs")
	private String syncTs;

	@Column(name="Ts")
	private String ts;

	@Column(name="UOM")
	private String uom;

	@Column(name="UOMName")
	private String uomName;

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

	public String getInventorySecondUOM() {
		return inventorySecondUOM;
	}

	public void setInventorySecondUOM(String inventorySecondUOM) {
		this.inventorySecondUOM = inventorySecondUOM;
	}

	public String getInventoryUOM() {
		return inventoryUOM;
	}

	public void setInventoryUOM(String inventoryUOM) {
		this.inventoryUOM = inventoryUOM;
	}

	public String getInventoryUOMName() {
		return inventoryUOMName;
	}

	public void setInventoryUOMName(String inventoryUOMName) {
		this.inventoryUOMName = inventoryUOMName;
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

	public String getItemMasterCode1() {
		return itemMasterCode1;
	}

	public void setItemMasterCode1(String itemMasterCode1) {
		this.itemMasterCode1 = itemMasterCode1;
	}

	public String getItemMasterName() {
		return itemMasterName;
	}

	public void setItemMasterName(String itemMasterName) {
		this.itemMasterName = itemMasterName;
	}

	public String getManufactureUOM() {
		return manufactureUOM;
	}

	public void setManufactureUOM(String manufactureUOM) {
		this.manufactureUOM = manufactureUOM;
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

	public String getPriceUOM() {
		return priceUOM;
	}

	public void setPriceUOM(String priceUOM) {
		this.priceUOM = priceUOM;
	}

	public String getPurchaseUOM() {
		return purchaseUOM;
	}

	public void setPurchaseUOM(String purchaseUOM) {
		this.purchaseUOM = purchaseUOM;
	}

	public Double getRatio() {
		return ratio;
	}

	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}

	public String getSalesUOM() {
		return salesUOM;
	}

	public void setSalesUOM(String salesUOM) {
		this.salesUOM = salesUOM;
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

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getUomName() {
		return uomName;
	}

	public void setUomName(String uomName) {
		this.uomName = uomName;
	}

	@Override
	public String toString() {
		return "ItemConvertRatioInClass [id=" + id + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", def1="
				+ def1 + ", def2=" + def2 + ", def3=" + def3 + ", def4=" + def4 + ", def5=" + def5 + ", dr=" + dr
				+ ", inventorySecondUOM=" + inventorySecondUOM + ", inventoryUOM=" + inventoryUOM
				+ ", inventoryUOMName=" + inventoryUOMName + ", itemMaster=" + itemMaster + ", itemMasterCode="
				+ itemMasterCode + ", itemMasterCode1=" + itemMasterCode1 + ", itemMasterName=" + itemMasterName
				+ ", manufactureUOM=" + manufactureUOM + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn
				+ ", priceUOM=" + priceUOM + ", purchaseUOM=" + purchaseUOM + ", ratio=" + ratio + ", salesUOM="
				+ salesUOM + ", syncMemo=" + syncMemo + ", syncSource=" + syncSource + ", syncSourceID=" + syncSourceID
				+ ", syncTs=" + syncTs + ", ts=" + ts + ", uom=" + uom + ", uomName=" + uomName + "]";
	}

    
}
