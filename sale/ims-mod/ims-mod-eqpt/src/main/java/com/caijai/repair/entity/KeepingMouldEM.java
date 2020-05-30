package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;

/**
 * 模板设备关联表
 * @author duan2
 *
 */
@Table(name="EQ_KeepingMouldEM")
public class KeepingMouldEM extends BaseTable{

	private static final long serialVersionUID = 870627664495614047L;

	/**
	 * ID
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 保养模板ID
	 */
	@Column(name = "KeepMouldID")
	private String keepMouldID;

	/**
	 * 设备组
	 */
	@Column(name = "EMGroupID")
	private String emGroupID;

	/**
	 * 设备组
	 */
	@Column(name = "emGroupName", readonly = true)
	@Relation(table = "EQ_EMGroup", value = "ID", show = "Name", ref = "EMGroupID")
	private String emGroupName;

	/**
	 * 序号
	 */
	@Column(name = "No",sort=Sort.ASC)
	private Integer no;
	
	/**
	 * 备注
	 */
	@Column(name = "Memo")
	private String memo;
	
	/**
	 * 组织
	 */
	@Column(name = "Org")
	private String org;

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
	 * 作废标识
	 */
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

	public String getKeepMouldID() {
		return keepMouldID;
	}

	public void setKeepMouldID(String keepMouldID) {
		this.keepMouldID = keepMouldID;
	}

	public String getEmGroupID() {
		return emGroupID;
	}

	public void setEmGroupID(String emGroupID) {
		this.emGroupID = emGroupID;
	}

	public String getEmGroupName() {
		return emGroupName;
	}

	public void setEmGroupName(String emGroupName) {
		this.emGroupName = emGroupName;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
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
		return "KeepingMouldEM [id=" + id + ", keepMouldID=" + keepMouldID + ", emGroupID=" + emGroupID
				+ ", emGroupName=" + emGroupName + ", no=" + no + ", memo=" + memo + ", org=" + org + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn
				+ ", dr=" + dr + ", ts=" + ts + "]";
	}
	
}
