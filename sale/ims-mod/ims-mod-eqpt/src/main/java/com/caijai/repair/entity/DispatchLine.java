package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.wx.DispatchState;
import com.caijai.base.sysenum.SYSSET;

/**
 * 维修派工单子表
 * @author ChenYu
 *
 */
@Table(name = "EQ_EMDispatchLine")
public class DispatchLine extends BaseTable {

	private static final long serialVersionUID = -7291380355927059769L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;
	
	/**
	 * 派工单子表状态
	 */
	@Column(name = "dispatchLineState")
	private DispatchState dispatchLineState;
	
	/**
	 * 上次维修时间
	 */
	@Column(name = "LastMaintainDate")
	private String lastmaintaindate;

	/**
	 * 计划开始时间
	 */
	@Column(name = "FromdatePlan")
	private String fromdateplan;

	/**
	 * 计划完工时间
	 */
	@Column(name = "ToDatePlan")
	private String todateplan;

	/**
	 * 开始时间
	 */
	@Column(name="startTime")
	private String startTime;
	
	/**
	 * 完工时间
	 */
	@Column(name="endTime")
	private String endTime;
	
	/**
	 * 维修项目
	 */
	@Column(name = "EMProjects")
	private String emprojects;
	
	/**
	 * 移动
	 */
	@Column(name = "ismove")
	private SYSSET ismove;
	
	/**
	 * 原产线
	 */
	@Column(name = "OriginLine")
	private String originLine;
	
	/**
	 * 原产线名称
	 */
	@Column(name = "originLineName",readonly = true)
	@Relation(show = "name", table = "EQ_ProductionLine", value = "ID",ref="originLine")
	private String originLineName;
	
	/**
	 * 原产线编码
	 */
	@Column(name = "originLineCode",readonly = true)
	@Relation(show = "code", table = "EQ_ProductionLine", value = "ID",ref="originLine")
	private String originLineCode;
	
	/**
	 * 现产线
	 */
	@Column(name = "CurrentLine")
	private String currentLine;

	/**
	 * 现产线名称
	 */
	@Column(name = "currentLineName",readonly = true)
	@Relation(show = "name", table = "EQ_ProductionLine", value = "ID",ref="currentLine")
	private String currentLineName;
	
	/**
	 * 现产线编码
	 */
	@Column(name = "currentLineCode",readonly = true)
	@Relation(show = "code", table = "EQ_ProductionLine", value = "ID",ref="currentLine")
	private String currentLineCode;
	
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
	 * 图片地址
	 */
	@Column(name = "Image")
	private String image;

	/**
	 * 文件地址
	 */
	@Column(name = "File")
	private String file;
	
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
	 * 设备
	 */
	@Column(name = "em")
	private String em;
	
	/**
	 * 设备名称
	 */
	@Column(name = "emName",readonly = true)
	@Relation(show = "name", table = "EQ_EM", value = "ID",ref="em")
	private String emName;
	
	/**
	 * 设备编码
	 */
	@Column(name="emCode",readonly = true)
	@Relation(show = "code", table = "EQ_EM", value = "ID",ref="em")
	private String emCode;
	
	/**
	 * 设备组
	 */
	@Column(name="emGroup",readonly = true)
	@Relation(show = "emGroup", table = "EQ_EM", value = "ID",ref="em")
	private String emGroup;
	
	/**
	 * 故障id
	 */
	@Column(name="FaultID")
	private String faultid;
	
	/**
	 * 故障码
	 */
	@Column(name="FaultCode",readonly = true)
	@Relation(show = "code", table = "EQ_FaultCode", value = "ID",ref="faultid")
	private String faultcode;

	/**
	 * 行号
	 */
	@Column(name = "RowNO")
	private Integer rowno;

	/**
	 * 维修派工
	 */
	@Column(name = "EMDispatchOrder")
	private String emdispatchorder;

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
	 * 维修计划行ID
	 */
	@Column(name = "EMPlanLineID")
	private String emplanlineid;

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
	 * 修改人
	 */
	@Column(name = "ts")
	private String ts;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DispatchState getDispatchLineState() {
		return dispatchLineState;
	}

	public void setDispatchLineState(DispatchState dispatchLineState) {
		this.dispatchLineState = dispatchLineState;
	}

	public String getLastmaintaindate() {
		return lastmaintaindate;
	}

	public void setLastmaintaindate(String lastmaintaindate) {
		this.lastmaintaindate = lastmaintaindate;
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

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEmprojects() {
		return emprojects;
	}

	public void setEmprojects(String emprojects) {
		this.emprojects = emprojects;
	}

	public SYSSET getIsmove() {
		return ismove;
	}

	public void setIsmove(SYSSET ismove) {
		this.ismove = ismove;
	}

	public String getOriginLine() {
		return originLine;
	}

	public void setOriginLine(String originLine) {
		this.originLine = originLine;
	}

	public String getOriginLineName() {
		return originLineName;
	}

	public void setOriginLineName(String originLineName) {
		this.originLineName = originLineName;
	}

	public String getOriginLineCode() {
		return originLineCode;
	}

	public void setOriginLineCode(String originLineCode) {
		this.originLineCode = originLineCode;
	}

	public String getCurrentLine() {
		return currentLine;
	}

	public void setCurrentLine(String currentLine) {
		this.currentLine = currentLine;
	}

	public String getCurrentLineName() {
		return currentLineName;
	}

	public void setCurrentLineName(String currentLineName) {
		this.currentLineName = currentLineName;
	}

	public String getCurrentLineCode() {
		return currentLineCode;
	}

	public void setCurrentLineCode(String currentLineCode) {
		this.currentLineCode = currentLineCode;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
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

	public String getEm() {
		return em;
	}

	public void setEm(String em) {
		this.em = em;
	}

	public String getEmName() {
		return emName;
	}

	public void setEmName(String emName) {
		this.emName = emName;
	}

	public String getEmCode() {
		return emCode;
	}

	public void setEmCode(String emCode) {
		this.emCode = emCode;
	}

	public String getEmGroup() {
		return emGroup;
	}

	public void setEmGroup(String emGroup) {
		this.emGroup = emGroup;
	}

	public String getFaultid() {
		return faultid;
	}

	public void setFaultid(String faultid) {
		this.faultid = faultid;
	}

	public String getFaultcode() {
		return faultcode;
	}

	public void setFaultcode(String faultcode) {
		this.faultcode = faultcode;
	}

	public Integer getRowno() {
		return rowno;
	}

	public void setRowno(Integer rowno) {
		this.rowno = rowno;
	}

	public String getEmdispatchorder() {
		return emdispatchorder;
	}

	public void setEmdispatchorder(String emdispatchorder) {
		this.emdispatchorder = emdispatchorder;
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

	public String getEmplanlineid() {
		return emplanlineid;
	}

	public void setEmplanlineid(String emplanlineid) {
		this.emplanlineid = emplanlineid;
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

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	@Override
	public String toString() {
		return "DispatchLine [id=" + id + ", dispatchLineState=" + dispatchLineState + ", lastmaintaindate="
				+ lastmaintaindate + ", fromdateplan=" + fromdateplan + ", todateplan=" + todateplan + ", startTime="
				+ startTime + ", endTime=" + endTime + ", emprojects=" + emprojects + ", ismove=" + ismove
				+ ", originLine=" + originLine + ", originLineName=" + originLineName + ", originLineCode="
				+ originLineCode + ", currentLine=" + currentLine + ", currentLineName=" + currentLineName
				+ ", currentLineCode=" + currentLineCode + ", maintainpart=" + maintainpart + ", maintainclaim="
				+ maintainclaim + ", maintainmethod=" + maintainmethod + ", image=" + image + ", file=" + file
				+ ", memo=" + memo + ", maintainassort=" + maintainassort + ", servicemanid=" + servicemanid
				+ ", servicemancode=" + servicemancode + ", servicemanname=" + servicemanname + ", emprojectline="
				+ emprojectline + ", em=" + em + ", emName=" + emName + ", emCode=" + emCode + ", emGroup=" + emGroup
				+ ", faultid=" + faultid + ", faultcode=" + faultcode + ", rowno=" + rowno + ", emdispatchorder="
				+ emdispatchorder + ", maintenancegroup=" + maintenancegroup + ", sysversion=" + sysversion
				+ ", emplanlineid=" + emplanlineid + ", planpeoplenum=" + planpeoplenum + ", planoutlay=" + planoutlay
				+ ", maintaincoefficient=" + maintaincoefficient + ", serviceman=" + serviceman + ", dr=" + dr
				+ ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy
				+ ", modifiedBy=" + modifiedBy + ", ts=" + ts + "]";
	}
}
