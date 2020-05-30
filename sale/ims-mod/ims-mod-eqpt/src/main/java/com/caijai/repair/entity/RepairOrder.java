package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.wx.RepairState;
import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.sysenum.Sort;

/**
 * 报修单
 * 
 * @author duan2
 *
 */
@Table(name = "EQ_RepairOrder")
public class RepairOrder extends BaseTable {

	private static final long serialVersionUID = 2604609107273181729L;

	/**
	 * ID
	 */
	@Column(name = "ID",primary=true)
	private String id;

	/**
	 * 编码
	 */
	@Column(name = "Code")
	private String code;
	
	/**
	 * 挂起原因--维修人表
	 */
	@Column(name = "hangUpReason", readonly = true)
	@Relation(table = "EQ_RepairMen", value = "srcdocID", ref = "id", show = "hangUpReason")
	private String hangUpReason;
	
	/**
	 * 是否停机维修
	 */
	@Column(name = "isStopMaintenance")
	private SYSSET isStopMaintenance;

	
	private String beforeDate;
	
	
	private String afterDate;
	
	
	/**
	 * 日期
	 */
	@Column(name = "date",sort = Sort.DESC)
	private String date;

	/**
	 * 报修来源(0.人工报修模块1.保养计划2.自动)
	 */
	@Column(name = "resource")
	private String resource;

	/**
	 * 设备id
	 */
	@Column(name = "emid")
	private String emid;

	/**
	 * 设备编码
	 */
	@Column(name = "emcode", readonly = true)
	@Relation(table = "BD_EM", value = "id", ref = "emid", show = "Code")
	private String emcode;

	/**
	 * 设备名称
	 */
	@Column(name = "emname", readonly = true)
	@Relation(table = "BD_EM", value = "id", ref = "emid", show = "name")
	private String emname;

	/**
	 * 设备规格
	 */
	@Column(name = "emspecs", readonly = true)
	@Relation(table = "BD_EM", value = "id", ref = "emid", show = "specs")
	private String emspecs;

	/**
	 * 报修人
	 */
	@Column(name = "applicant")
	private String applicant;
	
	/**
	 * 报修人
	 */
	@Column(name = "applicantPhone")
	private String applicantPhone;
	
	/**
	 * 报修人
	 */
	@Column(name = "applicantName", readonly = true)
	@Relation(table = "SYS_Person", value = "id", show = "name", ref = "applicant")
	private String applicantName;

	/**
	 * 维修组
	 */
	@Column(name = "RepairTeam")
	private String repairteam;
	
	/**
	 * 维修组
	 */
	@Column(name = "repairteamName",readonly = true)
	@Relation(show = "name", table = "bd_ShiftGroup", value = "id",ref="RepairTeam")
	private String repairteamName;

	/**
	 * 项目负责人
	 */
	@Column(name = "Leader")
	private String leader;

	/**
	 * 项目负责人
	 */
	@Column(name = "leaderName", readonly = true)
	@Relation(show = "name", table = "SYS_Person", value = "id",ref="leader")
	private String leaderName;

	/**
	 * 计划开始时间
	 */
	@Column(name = "PlanStartTime")
	private String planStartTime;
	
	/**
	 * 计划完工时间
	 */
	@Column(name = "PlanEndTime")
	private String planEndTime;
	
	/**
	 * 开始时间
	 */
	@Column(name = "StartTime")
	private String startTime;

	/**
	 * 完工时间
	 */
	@Column(name = "EndTime")
	private String endTime;

	/**
	 * 最迟结束时间
	 */
	@Column(name = "LatestFinishTime")
	private String latestFinishTime;
	
	
	private String beforeLatestFinishTime;
	
	
	private String afterLatestFinishTime;
	
	/**
	 * 参与人员
	 */
	@Column(name = "RepairMen")
	private String repairmen;

	/**
	 * 参与人员
	 */
	@Column(name = "repairmenNames")
	private String repairmenNames;
	
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
	 * 故障部位
	 */
	@Column(name = "FaultPart")
	private String faultpart;
	
	/**
	 * 故障类型
	 */
	@Column(name = "faultType")
	private String faultType;

	/**
	 * 故障描述
	 */
	@Column(name = "FaultDesc")
	private String faultdesc;

	/**
	 * 故障原因
	 */
	@Column(name = "Reason")
	private String reason;

	/**
	 * 维修处理描述
	 */
	@Column(name = "RepairDesc")
	private String repairdesc;

	/**
	 * 处理方式
	 */
	@Column(name = "RepairType")
	private String repairtype;

	/**
	 * 维修状态
	 */
	@Column(name = "RepairState")
	private RepairState repairstate;

	/**
	 * 报修人员确认
	 */
	@Column(name = "confirm")
	private String confirm;

	/**
	 * 确认日期
	 */
	@Column(name = "confirmDate")
	private String confirmDate;

	/**
	 * 是否转移
	 */
	@Column(name = "IsMove")
	private SYSSET ismove;

	/**
	 * 原产线
	 */
	@Column(name = "OriginLine")
	private String originLine;

	/**
	 * 原产线名称
	 */
	@Column(name = "OriginLineCode", readonly = true)
	@Relation(table = "EQ_ProductionLine", value = "id", show = "code", ref = "originLine")
	private String originLineCode;

	/**
	 * 现产线
	 */
	@Column(name = "CurrentLine")
	private String currentLine;

	/**
	 * 现产线名称
	 */
	@Column(name = "CurrentLineCode", readonly = true)
	@Relation(table = "EQ_ProductionLine", value = "id", show = "Code", ref = "currentLine")
	private String currentLineCode;
	
	/**
	 * 验收说明
	 */
	@Column(name="CheckDeclare")
	private String checkDeclare;

	/**
	 * 备注
	 */
	@Column(name = "Meno")
	private String meno;

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
	 * 公司
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

	public String getBeforeDate() {
		return beforeDate;
	}

	public void setBeforeDate(String beforeDate) {
		this.beforeDate = beforeDate;
	}

	public String getAfterDate() {
		return afterDate;
	}

	public void setAfterDate(String afterDate) {
		this.afterDate = afterDate;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getEmid() {
		return emid;
	}

	public void setEmid(String emid) {
		this.emid = emid;
	}

	public String getEmcode() {
		return emcode;
	}

	public void setEmcode(String emcode) {
		this.emcode = emcode;
	}

	public String getEmname() {
		return emname;
	}

	public void setEmname(String emname) {
		this.emname = emname;
	}

	public String getEmspecs() {
		return emspecs;
	}

	public void setEmspecs(String emspecs) {
		this.emspecs = emspecs;
	}

	public String getApplicant() {
		return applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getRepairteam() {
		return repairteam;
	}

	public void setRepairteam(String repairteam) {
		this.repairteam = repairteam;
	}

	public String getRepairteamName() {
		return repairteamName;
	}

	public void setRepairteamName(String repairteamName) {
		this.repairteamName = repairteamName;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public String getPlanStartTime() {
		return planStartTime;
	}

	public void setPlanStartTime(String planStartTime) {
		this.planStartTime = planStartTime;
	}

	public String getPlanEndTime() {
		return planEndTime;
	}

	public void setPlanEndTime(String planEndTime) {
		this.planEndTime = planEndTime;
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

	public String getLatestFinishTime() {
		return latestFinishTime;
	}

	public void setLatestFinishTime(String latestFinishTime) {
		this.latestFinishTime = latestFinishTime;
	}

	public String getBeforeLatestFinishTime() {
		return beforeLatestFinishTime;
	}

	public void setBeforeLatestFinishTime(String beforeLatestFinishTime) {
		this.beforeLatestFinishTime = beforeLatestFinishTime;
	}

	public String getAfterLatestFinishTime() {
		return afterLatestFinishTime;
	}

	public void setAfterLatestFinishTime(String afterLatestFinishTime) {
		this.afterLatestFinishTime = afterLatestFinishTime;
	}

	public String getRepairmen() {
		return repairmen;
	}

	public void setRepairmen(String repairmen) {
		this.repairmen = repairmen;
	}

	public String getRepairmenNames() {
		return repairmenNames;
	}

	public void setRepairmenNames(String repairmenNames) {
		this.repairmenNames = repairmenNames;
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

	public String getFaultpart() {
		return faultpart;
	}

	public void setFaultpart(String faultpart) {
		this.faultpart = faultpart;
	}

	public String getFaultType() {
		return faultType;
	}

	public void setFaultType(String faultType) {
		this.faultType = faultType;
	}

	public String getFaultdesc() {
		return faultdesc;
	}

	public void setFaultdesc(String faultdesc) {
		this.faultdesc = faultdesc;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRepairdesc() {
		return repairdesc;
	}

	public void setRepairdesc(String repairdesc) {
		this.repairdesc = repairdesc;
	}

	public String getRepairtype() {
		return repairtype;
	}

	public void setRepairtype(String repairtype) {
		this.repairtype = repairtype;
	}

	public RepairState getRepairstate() {
		return repairstate;
	}

	public void setRepairstate(RepairState repairstate) {
		this.repairstate = repairstate;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	public String getConfirmDate() {
		return confirmDate;
	}

	public void setConfirmDate(String confirmDate) {
		this.confirmDate = confirmDate;
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

	public String getCurrentLineCode() {
		return currentLineCode;
	}

	public void setCurrentLineCode(String currentLineCode) {
		this.currentLineCode = currentLineCode;
	}

	public String getCheckDeclare() {
		return checkDeclare;
	}

	public void setCheckDeclare(String checkDeclare) {
		this.checkDeclare = checkDeclare;
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
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

	public SYSSET getIsStopMaintenance() {
		return isStopMaintenance;
	}

	public void setIsStopMaintenance(SYSSET isStopMaintenance) {
		this.isStopMaintenance = isStopMaintenance;
	}

	public String getApplicantPhone() {
		return applicantPhone;
	}

	public void setApplicantPhone(String applicantPhone) {
		this.applicantPhone = applicantPhone;
	}

	public String getHangUpReason() {
		return hangUpReason;
	}

	public void setHangUpReason(String hangUpReason) {
		this.hangUpReason = hangUpReason;
	}

	@Override
	public String toString() {
		return "RepairOrder [id=" + id + ", code=" + code + ", beforeDate=" + beforeDate + ", afterDate=" + afterDate
				+ ", date=" + date + ", resource=" + resource + ", emid=" + emid + ", emcode=" + emcode + ", emname="
				+ emname + ", emspecs=" + emspecs + ", applicant=" + applicant + ", applicantName=" + applicantName
				+ ", repairteam=" + repairteam + ", repairteamName=" + repairteamName + ", leader=" + leader
				+ ", leaderName=" + leaderName + ", planStartTime=" + planStartTime + ", planEndTime=" + planEndTime
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", latestFinishTime=" + latestFinishTime
				+ ", beforeLatestFinishTime=" + beforeLatestFinishTime + ", afterLatestFinishTime="
				+ afterLatestFinishTime + ", repairmen=" + repairmen + ", repairmenNames=" + repairmenNames
				+ ", faultid=" + faultid + ", faultcode=" + faultcode + ", faultpart=" + faultpart + ", faultType="
				+ faultType + ", faultdesc=" + faultdesc + ", reason=" + reason + ", repairdesc=" + repairdesc
				+ ", repairtype=" + repairtype + ", repairstate=" + repairstate + ", confirm=" + confirm
				+ ", confirmDate=" + confirmDate + ", ismove=" + ismove + ", originLine=" + originLine
				+ ", originLineCode=" + originLineCode + ", currentLine=" + currentLine + ", currentLineCode="
				+ currentLineCode + ", checkDeclare=" + checkDeclare + ", meno=" + meno + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", org="
				+ org + ", dr=" + dr + ", ts=" + ts + "]";
	}

}