package com.caijai.repair.entity.vo;

/**
 * 点检清单
 * 
 * @author ChenYu
 *
 */
public class SpotCheckListVO{

	/**
	 * 设备id
	 */
	private String emId;

	/**
	 * 设备编码
	 */
	private String emCode;

	/**
	 * 设备名称
	 */
	private String emName;
	
	/**
	 * 设备规格
	 */
	private String emSpecs;

	/**
	 * 设备资产编码
	 */
	private String emAssetsCode;

	/**
	 * 设备组
	 */
	private String emGroup;

	/**
	 * 设备组名称
	 */
	private String emGroupName;

	/**
	 * 产线名称
	 */
	private String prolineCode;

	/**
	 * 部门/车间
	 */
	private String deptName;

	/**
	 * 部门编码
	 */
	private String deptCode;

	/**
	 * 点检日期
	 */
	private String spotCheckDate;
	
	/**
	 * 点检结果
	 */
	private Integer spotCheckResult;

	/**
	 * 最后一次点检时间
	 */
	private String lastCheckDate;

	/**
	 * 最后一次点检结果
	 */
	private Integer lastCheckResult;
	
	private String beforeSpotCheckDate;
	
	private String afterSpotCheckDate;

	public String getEmId() {
		return emId;
	}

	public void setEmId(String emId) {
		this.emId = emId;
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

	public String getEmSpecs() {
		return emSpecs;
	}

	public void setEmSpecs(String emSpecs) {
		this.emSpecs = emSpecs;
	}

	public String getEmAssetsCode() {
		return emAssetsCode;
	}

	public void setEmAssetsCode(String emAssetsCode) {
		this.emAssetsCode = emAssetsCode;
	}

	public String getEmGroup() {
		return emGroup;
	}

	public void setEmGroup(String emGroup) {
		this.emGroup = emGroup;
	}

	public String getEmGroupName() {
		return emGroupName;
	}

	public void setEmGroupName(String emGroupName) {
		this.emGroupName = emGroupName;
	}

	public String getProlineCode() {
		return prolineCode;
	}

	public void setProlineCode(String prolineCode) {
		this.prolineCode = prolineCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getSpotCheckDate() {
		return spotCheckDate;
	}

	public void setSpotCheckDate(String spotCheckDate) {
		this.spotCheckDate = spotCheckDate;
	}

	public String getLastCheckDate() {
		return lastCheckDate;
	}

	public void setLastCheckDate(String lastCheckDate) {
		this.lastCheckDate = lastCheckDate;
	}

	public Integer getLastCheckResult() {
		return lastCheckResult;
	}

	public void setLastCheckResult(Integer lastCheckResult) {
		this.lastCheckResult = lastCheckResult;
	}

	public Integer getSpotCheckResult() {
		return spotCheckResult;
	}

	public void setSpotCheckResult(Integer spotCheckResult) {
		this.spotCheckResult = spotCheckResult;
	}

	public String getBeforeSpotCheckDate() {
		return beforeSpotCheckDate;
	}

	public void setBeforeSpotCheckDate(String beforeSpotCheckDate) {
		this.beforeSpotCheckDate = beforeSpotCheckDate;
	}

	public String getAfterSpotCheckDate() {
		return afterSpotCheckDate;
	}

	public void setAfterSpotCheckDate(String afterSpotCheckDate) {
		this.afterSpotCheckDate = afterSpotCheckDate;
	}

	@Override
	public String toString() {
		return "SpotCheckListVO [emId=" + emId + ", emCode=" + emCode + ", emName=" + emName + ", emSpecs=" + emSpecs
				+ ", emAssetsCode=" + emAssetsCode + ", emGroup=" + emGroup + ", emGroupName=" + emGroupName
				+ ", prolineCode=" + prolineCode + ", deptName=" + deptName + ", deptCode=" + deptCode
				+ ", spotCheckDate=" + spotCheckDate + ", spotCheckResult=" + spotCheckResult + ", lastCheckDate="
				+ lastCheckDate + ", lastCheckResult=" + lastCheckResult + ", beforeSpotCheckDate="
				+ beforeSpotCheckDate + ", afterSpotCheckDate=" + afterSpotCheckDate + "]";
	}
	
}