package com.caijai.repair.entity.po;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
 * 维修记录子表
 * @author ChenYu
 *
 */
@Table(name = "eq_EMNoteLine")
public class EmnoteLine extends BaseTable {

	private static final long serialVersionUID = -5747151693964130153L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;
	
	/**
	 * 验收结果--主表信息
	 */
	@Column(name = "checkresult",readonly = true)
	@Relation(table = "eq_EMNote", value = "id", ref = "emnote", show = "checkresult")
	private String checkresult;
	
	/**
	 * 验收结果--主表说明
	 */
	@Column(name = "checkdeclare",readonly = true)
	@Relation(table = "eq_EMNote", value = "id", ref = "emnote", show = "checkdeclare")
	private String checkdeclare;

	/**
	 * 作废标识
	 */
	@Column(name = "dr")
	private Integer dr;

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
	 * 计划开始时间
	 */
	@Column(name = "FromDatePlan")
	private String fromdateplan;

	/**
	 * 计划完工时间
	 */
	@Column(name = "ToDatePlan")
	private String todateplan;

	/**
	 * 实际开始时间
	 */
	@Column(name = "RealityFromDate")
	private String realityfromdate;

	/**
	 * 实际完工时间
	 */
	@Column(name = "RealityToDate")
	private String realitytodate;

	/**
	 * 上次维修时间
	 */
	@Column(name = "LastMaintainDate")
	private String lastmaintaindate;

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
	 * 维修项目
	 */
	@Column(name = "EMProjects")
	private String emprojects;

	/**
	 * 维修部位
	 */
	@Column(name = "MaintainPart")
	private String maintainpart;

	/**
	 * 维修要求
	 */
	@Column(name = "MaintainClaim")
	private String maintainclaim;

	/**
	 * 维修方法
	 */
	@Column(name = "MaintainMethod")
	private String maintainmethod;

	/**
	 * 实际完成情况
	 */
	@Column(name = "Performance")
	private String performance;

	/**
	 * 实际维修方法
	 */
	@Column(name = "RealityMMthod")
	private String realitymmthod;

	/**
	 * 备注
	 */
	@Column(name = "Memo")
	private String memo;

	/**
	 * 维修分类
	 */
	@Column(name = "MaintainAssort")
	private String maintainassort;

	/**
	 * 维修人员ID
	 */
	@Column(name = "ServicemanID")
	private String servicemanid;

	/**
	 * 维修人员编码
	 */
	@Column(name = "ServicemanCode")
	private String servicemancode;

	/**
	 * 维修人员名称
	 */
	@Column(name = "ServicemanName")
	private String servicemanname;

	/**
	 * 维修项目行
	 */
	@Column(name = "EMProjectLine")
	private String emprojectline;

	/**
	 * 行号
	 */
	@Column(name = "RowNO")
	private Integer rowno;

	/**
	 * 维修小组
	 */
	@Column(name = "MaintenanceGroup")
	private String maintenancegroup;

	/**
	 * 系统版本
	 */
	@Column(name = "SysVersion")
	private String sysversion;

	/**
	 * 计划人数
	 */
	@Column(name = "PlanPeopleNum")
	private Double planpeoplenum;

	/**
	 * 计划费用
	 */
	@Column(name = "PlanOutlay")
	private Double planoutlay;

	/**
	 * 实际人数
	 */
	@Column(name = "RealityPeopleNum")
	private Double realitypeoplenum;

	/**
	 * 实际费用
	 */
	@Column(name = "RealityOutlay")
	private Double realityoutlay;

	/**
	 * 维修难度系数
	 */
	@Column(name = "MaintainCoefficient")
	private Double maintaincoefficient;

	/**
	 * 维修人员
	 */
	@Column(name = "Serviceman")
	private String serviceman;

	/**
	 * 维修记录
	 */
	@Column(name = "EMNote")
	private String emnote;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

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

	public String getFromdateplan() {
		return fromdateplan;
	}

	public void setFromdateplan(String fromdateplan) {
		this.fromdateplan = fromdateplan;
	}

	public String getTodateplan() {
		return todateplan;
	}

	public void setTodateplan(String todateplan) {
		this.todateplan = todateplan;
	}

	public String getRealityfromdate() {
		return realityfromdate;
	}

	public void setRealityfromdate(String realityfromdate) {
		this.realityfromdate = realityfromdate;
	}

	public String getRealitytodate() {
		return realitytodate;
	}

	public void setRealitytodate(String realitytodate) {
		this.realitytodate = realitytodate;
	}

	public String getLastmaintaindate() {
		return lastmaintaindate;
	}

	public void setLastmaintaindate(String lastmaintaindate) {
		this.lastmaintaindate = lastmaintaindate;
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

	public String getEmprojects() {
		return emprojects;
	}

	public void setEmprojects(String emprojects) {
		this.emprojects = emprojects;
	}

	public String getMaintainpart() {
		return maintainpart;
	}

	public void setMaintainpart(String maintainpart) {
		this.maintainpart = maintainpart;
	}

	public String getMaintainclaim() {
		return maintainclaim;
	}

	public void setMaintainclaim(String maintainclaim) {
		this.maintainclaim = maintainclaim;
	}

	public String getMaintainmethod() {
		return maintainmethod;
	}

	public void setMaintainmethod(String maintainmethod) {
		this.maintainmethod = maintainmethod;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public String getRealitymmthod() {
		return realitymmthod;
	}

	public void setRealitymmthod(String realitymmthod) {
		this.realitymmthod = realitymmthod;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMaintainassort() {
		return maintainassort;
	}

	public void setMaintainassort(String maintainassort) {
		this.maintainassort = maintainassort;
	}

	public String getServicemanid() {
		return servicemanid;
	}

	public void setServicemanid(String servicemanid) {
		this.servicemanid = servicemanid;
	}

	public String getServicemancode() {
		return servicemancode;
	}

	public void setServicemancode(String servicemancode) {
		this.servicemancode = servicemancode;
	}

	public String getServicemanname() {
		return servicemanname;
	}

	public void setServicemanname(String servicemanname) {
		this.servicemanname = servicemanname;
	}

	public String getEmprojectline() {
		return emprojectline;
	}

	public void setEmprojectline(String emprojectline) {
		this.emprojectline = emprojectline;
	}

	public Integer getRowno() {
		return rowno;
	}

	public void setRowno(Integer rowno) {
		this.rowno = rowno;
	}

	public String getMaintenancegroup() {
		return maintenancegroup;
	}

	public void setMaintenancegroup(String maintenancegroup) {
		this.maintenancegroup = maintenancegroup;
	}

	public String getSysversion() {
		return sysversion;
	}

	public void setSysversion(String sysversion) {
		this.sysversion = sysversion;
	}

	public Double getPlanpeoplenum() {
		return planpeoplenum;
	}

	public void setPlanpeoplenum(Double planpeoplenum) {
		this.planpeoplenum = planpeoplenum;
	}

	public Double getPlanoutlay() {
		return planoutlay;
	}

	public void setPlanoutlay(Double planoutlay) {
		this.planoutlay = planoutlay;
	}

	public Double getRealitypeoplenum() {
		return realitypeoplenum;
	}

	public void setRealitypeoplenum(Double realitypeoplenum) {
		this.realitypeoplenum = realitypeoplenum;
	}

	public Double getRealityoutlay() {
		return realityoutlay;
	}

	public void setRealityoutlay(Double realityoutlay) {
		this.realityoutlay = realityoutlay;
	}

	public Double getMaintaincoefficient() {
		return maintaincoefficient;
	}

	public void setMaintaincoefficient(Double maintaincoefficient) {
		this.maintaincoefficient = maintaincoefficient;
	}

	public String getServiceman() {
		return serviceman;
	}

	public void setServiceman(String serviceman) {
		this.serviceman = serviceman;
	}

	public String getEmnote() {
		return emnote;
	}

	public void setEmnote(String emnote) {
		this.emnote = emnote;
	}

	@Override
	public String toString() {
		return "EmnoteLinePO [id=" + id + ", dr=" + dr + ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn
				+ ", fromdateplan=" + fromdateplan + ", todateplan=" + todateplan + ", realityfromdate="
				+ realityfromdate + ", realitytodate=" + realitytodate + ", lastmaintaindate=" + lastmaintaindate
				+ ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + ", emprojects=" + emprojects
				+ ", maintainpart=" + maintainpart + ", maintainclaim=" + maintainclaim + ", maintainmethod="
				+ maintainmethod + ", performance=" + performance + ", realitymmthod=" + realitymmthod + ", memo="
				+ memo + ", maintainassort=" + maintainassort + ", servicemanid=" + servicemanid + ", servicemancode="
				+ servicemancode + ", servicemanname=" + servicemanname + ", emprojectline=" + emprojectline
				+ ", rowno=" + rowno + ", maintenancegroup=" + maintenancegroup + ", sysversion=" + sysversion
				+ ", planpeoplenum=" + planpeoplenum + ", planoutlay=" + planoutlay + ", realitypeoplenum="
				+ realitypeoplenum + ", realityoutlay=" + realityoutlay + ", maintaincoefficient=" + maintaincoefficient
				+ ", serviceman=" + serviceman + ", emnote=" + emnote + "]";
	}

	

}