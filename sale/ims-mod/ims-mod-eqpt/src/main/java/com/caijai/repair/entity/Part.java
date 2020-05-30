package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.SYSSET;

@Table(name="EQ_Part")
public class Part extends BaseTable {

	private static final long serialVersionUID = -7569012019932477370L;

	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 备品备件编码
	 */
	@Column(name = "itemID")
	private String itemid;

	/**
	 * 编码
	 */
	@Column(name = "code")
	private String code;

	/**
	 * 名称
	 */
	@Column(name = "name")
	private String name;
	
	/**
	 * 数量
	 */
	@Column(name = "count")
	private Double count;
	
	/**
	 * 实际数量
	 */
	@Column(name = "ActualCount")
	private Double actualCount;
	
	/**
	 * 归还数量
	 */
	@Column(name = "ReturnCount")
	private Double returnCount;

	/**
	 * 单位
	 */
	@Column(name = "unit")
	private String unit;
	
	/**
	 * 单位名称
	 */
	@Column(name = "unitName",readonly=true)
	@Relation(show = "name", table = "BD_UOM", value = "id",ref="unit")
	private String unitName;
	
	/**
	 * 库存地址
	 */
	@Column(name="wh")
	private String wh;
	
	/**
	 * 单位名称
	 */
	private String whName;
	
	/**
	 * 设备id
	 */
	@Column(name = "EmID")
	private String emid;
	
	/**
	 * 设备编码
	 */
	@Column(name = "EmCode",readonly=true)
	@Relation(show = "code", table = "EQ_EM", value = "id",ref="emid")
	private String emCode;
	
	/**
	 * 设备名称
	 */
	@Column(name = "EmName",readonly=true)
	@Relation(show = "name", table = "EQ_EM", value = "id",ref="emid")
	private String emName;
	
	/**
	 * 派工单
	 */
	@Column(name = "DispatchID")
	private String dispatchid;
	
	/**
	 * 备注
	 */
	@Column(name = "Meno")
	private String meno;

	/**
	 * 同步
	 */
	@Column(name = "Sync")
	private SYSSET sync;
	
	/**
	 * 创建人
	 */
	@Column(name = "CreatedBy")
	private String createdBy;

	/**
	 * 创建时间
	 */
	@Column(name = "CreatedOn")
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
	 * 公司id
	 */
	@Column(name = "Org")
	private String org;

	@Column(name = "dr")
	private Integer dr;

	@Column(name = "ts")
	private String ts;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Double getCount() {
		return count;
	}

	public void setCount(Double count) {
		this.count = count;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getEmid() {
		return emid;
	}

	public void setEmid(String emid) {
		this.emid = emid;
	}

	public String getDispatchid() {
		return dispatchid;
	}

	public void setDispatchid(String dispatchid) {
		this.dispatchid = dispatchid;
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

	public SYSSET getSync() {
		return sync;
	}

	public void setSync(SYSSET sync) {
		this.sync = sync;
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

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public Double getActualCount() {
		return actualCount;
	}

	public void setActualCount(Double actualCount) {
		this.actualCount = actualCount;
	}

	public Double getReturnCount() {
		return returnCount;
	}

	public void setReturnCount(Double returnCount) {
		this.returnCount = returnCount;
	}

	public String getEmCode() {
		return emCode;
	}

	public void setEmCode(String emCode) {
		this.emCode = emCode;
	}

	public String getEmName() {
		return emName;
	}

	public void setEmName(String emName) {
		this.emName = emName;
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

	@Override
	public String toString() {
		return "Part [id=" + id + ", itemid=" + itemid + ", code=" + code + ", name=" + name + ", count=" + count
				+ ", actualCount=" + actualCount + ", returnCount=" + returnCount + ", unit=" + unit + ", unitName="
				+ unitName + ", wh=" + wh + ", whName=" + whName + ", emid=" + emid + ", emCode=" + emCode + ", emName="
				+ emName + ", dispatchid=" + dispatchid + ", meno=" + meno + ", sync=" + sync + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn
				+ ", org=" + org + ", dr=" + dr + ", ts=" + ts + "]";
	}
	
}
