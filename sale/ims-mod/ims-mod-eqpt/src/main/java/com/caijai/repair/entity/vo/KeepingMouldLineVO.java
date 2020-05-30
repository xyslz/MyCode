package com.caijai.repair.entity.vo;

/**
 * 保养模板（以设备组为主体）
 * @author duan2
 *
 */
public class KeepingMouldLineVO {

	/**
	 * 保养模板ID
	 */
	private String keepMouldID;

	/**
	 * 设备组
	 */
	private String emGroupID;

	/**
	 * 设备组
	 */
	private String emGroupName;
	
	/**
	 * 检查项目数量
	 */
	private int itemcount;

	/**
	 * 备注
	 */
	private String memo;
	
	/**
	 * 组织
	 */
	private String org;

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

	public int getItemcount() {
		return itemcount;
	}

	public void setItemcount(int itemcount) {
		this.itemcount = itemcount;
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

	@Override
	public String toString() {
		return "KeepingMouldLineVO [keepMouldID=" + keepMouldID + ", emGroupID=" + emGroupID + ", emGroupName="
				+ emGroupName + ", itemcount=" + itemcount + ", memo=" + memo + ", org=" + org + "]";
	}
	
}
