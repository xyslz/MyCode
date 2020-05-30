package com.caijai.repair.entity.po;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.wx.EMNoteSrcdoctype;
import com.caijai.base.sysenum.wx.RepairState;

/**
 * 维修记录
 * 
 * @author ChenYu
 *
 */
@Table(name = "eq_EMNote")
public class Emnote extends BaseTable {

	private static final long serialVersionUID = 3239268100855893949L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 作废标识
	 */
	@Column(name = "dr")
	private Integer dr;

	/**
	 * 时间戳
	 */
	@Column(name = "ts")
	private String ts;

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
	 * 验收时间
	 */
	@Column(name = "CheckDate")
	private String checkdate;

	/**
	 * 单据类型
	 */
	@Column(name = "DocumentType")
	private String documenttype;

	/**
	 * 来源单据类型
	 */
	@Column(name = "SrcDocType")
	private EMNoteSrcdoctype srcdoctype;

	/**
	 * 维修类型
	 */
	@Column(name = "MaintenanceType")
	private String maintenancetype;

	/**
	 * 备注
	 */
	@Column(name = "Memo")
	private String memo;

	/**
	 * 验收结果
	 */
	@Column(name = "CheckResult")
	private String checkresult;

	/**
	 * 验收说明
	 */
	@Column(name = "CheckDeclare")
	private String checkdeclare;

	/**
	 * 来源单号
	 */
	@Column(name = "SrcDocNo")
	private String srcdocno;

	/**
	 * 设备台账
	 */
	@Column(name = "EM")
	private String em;
	
	/**
	 * 设备台账
	 */
	@Column(name = "emName",readonly=true)
	@Relation( table = "EQ_EM", value = "id",show = "name",ref="em")
	private String emName;
	
	/**
	 * 设备编码
	 */
	@Column(name = "emCode",readonly=true)
	@Relation( table = "EQ_EM", value = "id",show = "code",ref="em")
	private String emCode;

	/**
	 * 状态
	 */
	@Column(name = "DocState")
	private RepairState docstate;

	/**
	 * 来源单据
	 */
	@Column(name = "SrcDoc")
	private String srcdoc;

	/**
	 * 审核时间
	 */
	@Column(name = "ApproveInfo_ApprovedOn")
	private String approveinfoApprovedon;

	/**
	 * 弃审时间
	 */
	@Column(name = "ApproveInfo_UnApprovedOn")
	private String approveinfoUnapprovedon;

	/**
	 * 审核人
	 */
	@Column(name = "ApproveInfo_ApprovedBy")
	private String approveinfoApprovedby;

	/**
	 * 弃审人
	 */
	@Column(name = "ApproveInfo_UnApprovedBy")
	private String approveinfoUnapprovedby;

	/**
	 * 配合部门
	 */
	@Column(name = "CoordinateDpt")
	private String coordinatedpt;

	/**
	 * 配合部门
	 */
	@Column(name = "coordinatedptName")
	@Relation(table="SYS_Department_Trl",value="id", show = "name",ref="CoordinateDpt")
	private String coordinatedptName;
	
	/**
	 * 实际用时(小时)
	 */
	@Column(name = "RealityUsrHour")
	private Double realityusrhour;

	/**
	 * 维修负责人
	 */
	@Column(name = "MaintainPerson")
	private String maintainperson;
	
	/**
	 * 维修人名称
	 */
	@Column(name = "MaintainpersonName", readonly = true)
	@Relation(table = "SYS_Person", value = "id", show = "name", ref = "MaintainPerson")
	private String maintainpersonName;

	/**
	 * 验收人
	 */
	@Column(name = "CheckPerson")
	private String checkperson;

	/**
	 * 维修调度
	 */
	@Column(name = "ProductionScheduling")
	private String productionscheduling;

	/**
	 * 实例流
	 */
	@Column(name = "FlowInstance")
	private String flowinstance;

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
	 * 最后一次打印时间
	 */
	@Column(name = "LatestPrintedDate")
	private String latestprinteddate;

	/**
	 * 挂起日期
	 */
	@Column(name = "HoldDate")
	private String holddate;

	/**
	 * 下达日期
	 */
	@Column(name = "ReleaseDate")
	private String releasedate;

	/**
	 * 下达原因
	 */
	@Column(name = "ReleaseReason")
	private String releasereason;

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
	 * 单据编码
	 */
	@Column(name = "DocNo")
	private String docno;

	/**
	 * 挂起人
	 */
	@Column(name = "HoldUser")
	private String holduser;

	/**
	 * 下达人
	 */
	@Column(name = "ReleaseUser")
	private String releaseuser;

	/**
	 * 工作流编码
	 */
	@Column(name = "WorkFlowID")
	private String workflowid;

	/**
	 * 状态编码
	 */
	@Column(name = "StateMachineID")
	private String statemachineid;

	/**
	 * 版本
	 */
	@Column(name = "Version")
	private Integer version;

	/**
	 * 打印次数
	 */
	@Column(name = "PrintAmount")
	private Integer printamount;

	/**
	 * 组织
	 */
	@Column(name = "Org")
	private String org;

	/**
	 * 关闭日期
	 */
	@Column(name = "Cancel_CancelDate")
	private String cancelCanceldate;

	/**
	 * 是否关闭
	 */
	@Column(name = "Cancel_Canceled")
	private Integer cancelCanceled;

	/**
	 * 关闭人
	 */
	@Column(name = "Cancel_CancelUser")
	private String cancelCanceluser;

	/**
	 * 关闭原因
	 */
	@Column(name = "Cancel_CancelReason")
	private String cancelCancelreason;

	/**
	 * 挂起原因
	 */
	@Column(name = "HoldReason")
	private String holdreason;

	/**
	 * 系统版本
	 */
	@Column(name = "SysVersion")
	private String sysversion;

	/**
	 * 业务日期
	 */
	@Column(name = "BusinessDate")
	private String businessdate;

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

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
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

	public String getCheckdate() {
		return checkdate;
	}

	public void setCheckdate(String checkdate) {
		this.checkdate = checkdate;
	}

	public String getDocumenttype() {
		return documenttype;
	}

	public void setDocumenttype(String documenttype) {
		this.documenttype = documenttype;
	}

	public EMNoteSrcdoctype getSrcdoctype() {
		return srcdoctype;
	}

	public void setSrcdoctype(EMNoteSrcdoctype srcdoctype) {
		this.srcdoctype = srcdoctype;
	}

	public String getMaintenancetype() {
		return maintenancetype;
	}

	public void setMaintenancetype(String maintenancetype) {
		this.maintenancetype = maintenancetype;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getCheckresult() {
		return checkresult;
	}

	public void setCheckresult(String checkresult) {
		this.checkresult = checkresult;
	}

	public String getCheckdeclare() {
		return checkdeclare;
	}

	public void setCheckdeclare(String checkdeclare) {
		this.checkdeclare = checkdeclare;
	}

	public String getSrcdocno() {
		return srcdocno;
	}

	public void setSrcdocno(String srcdocno) {
		this.srcdocno = srcdocno;
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

	public RepairState getDocstate() {
		return docstate;
	}

	public void setDocstate(RepairState docstate) {
		this.docstate = docstate;
	}

	public String getSrcdoc() {
		return srcdoc;
	}

	public void setSrcdoc(String srcdoc) {
		this.srcdoc = srcdoc;
	}

	public String getApproveinfoApprovedon() {
		return approveinfoApprovedon;
	}

	public void setApproveinfoApprovedon(String approveinfoApprovedon) {
		this.approveinfoApprovedon = approveinfoApprovedon;
	}

	public String getApproveinfoUnapprovedon() {
		return approveinfoUnapprovedon;
	}

	public void setApproveinfoUnapprovedon(String approveinfoUnapprovedon) {
		this.approveinfoUnapprovedon = approveinfoUnapprovedon;
	}

	public String getApproveinfoApprovedby() {
		return approveinfoApprovedby;
	}

	public void setApproveinfoApprovedby(String approveinfoApprovedby) {
		this.approveinfoApprovedby = approveinfoApprovedby;
	}

	public String getApproveinfoUnapprovedby() {
		return approveinfoUnapprovedby;
	}

	public void setApproveinfoUnapprovedby(String approveinfoUnapprovedby) {
		this.approveinfoUnapprovedby = approveinfoUnapprovedby;
	}

	public String getCoordinatedpt() {
		return coordinatedpt;
	}

	public void setCoordinatedpt(String coordinatedpt) {
		this.coordinatedpt = coordinatedpt;
	}

	public String getCoordinatedptName() {
		return coordinatedptName;
	}

	public void setCoordinatedptName(String coordinatedptName) {
		this.coordinatedptName = coordinatedptName;
	}

	public Double getRealityusrhour() {
		return realityusrhour;
	}

	public void setRealityusrhour(Double realityusrhour) {
		this.realityusrhour = realityusrhour;
	}

	public String getMaintainperson() {
		return maintainperson;
	}

	public void setMaintainperson(String maintainperson) {
		this.maintainperson = maintainperson;
	}

	public String getMaintainpersonName() {
		return maintainpersonName;
	}

	public void setMaintainpersonName(String maintainpersonName) {
		this.maintainpersonName = maintainpersonName;
	}

	public String getCheckperson() {
		return checkperson;
	}

	public void setCheckperson(String checkperson) {
		this.checkperson = checkperson;
	}

	public String getProductionscheduling() {
		return productionscheduling;
	}

	public void setProductionscheduling(String productionscheduling) {
		this.productionscheduling = productionscheduling;
	}

	public String getFlowinstance() {
		return flowinstance;
	}

	public void setFlowinstance(String flowinstance) {
		this.flowinstance = flowinstance;
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

	public String getLatestprinteddate() {
		return latestprinteddate;
	}

	public void setLatestprinteddate(String latestprinteddate) {
		this.latestprinteddate = latestprinteddate;
	}

	public String getHolddate() {
		return holddate;
	}

	public void setHolddate(String holddate) {
		this.holddate = holddate;
	}

	public String getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}

	public String getReleasereason() {
		return releasereason;
	}

	public void setReleasereason(String releasereason) {
		this.releasereason = releasereason;
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

	public String getDocno() {
		return docno;
	}

	public void setDocno(String docno) {
		this.docno = docno;
	}

	public String getHolduser() {
		return holduser;
	}

	public void setHolduser(String holduser) {
		this.holduser = holduser;
	}

	public String getReleaseuser() {
		return releaseuser;
	}

	public void setReleaseuser(String releaseuser) {
		this.releaseuser = releaseuser;
	}

	public String getWorkflowid() {
		return workflowid;
	}

	public void setWorkflowid(String workflowid) {
		this.workflowid = workflowid;
	}

	public String getStatemachineid() {
		return statemachineid;
	}

	public void setStatemachineid(String statemachineid) {
		this.statemachineid = statemachineid;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getPrintamount() {
		return printamount;
	}

	public void setPrintamount(Integer printamount) {
		this.printamount = printamount;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getCancelCanceldate() {
		return cancelCanceldate;
	}

	public void setCancelCanceldate(String cancelCanceldate) {
		this.cancelCanceldate = cancelCanceldate;
	}

	public Integer getCancelCanceled() {
		return cancelCanceled;
	}

	public void setCancelCanceled(Integer cancelCanceled) {
		this.cancelCanceled = cancelCanceled;
	}

	public String getCancelCanceluser() {
		return cancelCanceluser;
	}

	public void setCancelCanceluser(String cancelCanceluser) {
		this.cancelCanceluser = cancelCanceluser;
	}

	public String getCancelCancelreason() {
		return cancelCancelreason;
	}

	public void setCancelCancelreason(String cancelCancelreason) {
		this.cancelCancelreason = cancelCancelreason;
	}

	public String getHoldreason() {
		return holdreason;
	}

	public void setHoldreason(String holdreason) {
		this.holdreason = holdreason;
	}

	public String getSysversion() {
		return sysversion;
	}

	public void setSysversion(String sysversion) {
		this.sysversion = sysversion;
	}

	public String getBusinessdate() {
		return businessdate;
	}

	public void setBusinessdate(String businessdate) {
		this.businessdate = businessdate;
	}

	@Override
	public String toString() {
		return "Emnote [id=" + id + ", dr=" + dr + ", ts=" + ts + ", fromdateplan=" + fromdateplan + ", todateplan="
				+ todateplan + ", realityfromdate=" + realityfromdate + ", realitytodate=" + realitytodate
				+ ", checkdate=" + checkdate + ", documenttype=" + documenttype + ", srcdoctype=" + srcdoctype
				+ ", maintenancetype=" + maintenancetype + ", memo=" + memo + ", checkresult=" + checkresult
				+ ", checkdeclare=" + checkdeclare + ", srcdocno=" + srcdocno + ", em=" + em + ", emName=" + emName
				+ ", emCode=" + emCode + ", docstate=" + docstate + ", srcdoc=" + srcdoc + ", approveinfoApprovedon="
				+ approveinfoApprovedon + ", approveinfoUnapprovedon=" + approveinfoUnapprovedon
				+ ", approveinfoApprovedby=" + approveinfoApprovedby + ", approveinfoUnapprovedby="
				+ approveinfoUnapprovedby + ", coordinatedpt=" + coordinatedpt + ", coordinatedptName="
				+ coordinatedptName + ", realityusrhour=" + realityusrhour + ", maintainperson=" + maintainperson
				+ ", maintainpersonName=" + maintainpersonName + ", checkperson=" + checkperson
				+ ", productionscheduling=" + productionscheduling + ", flowinstance=" + flowinstance + ", createdOn="
				+ createdOn + ", modifiedOn=" + modifiedOn + ", latestprinteddate=" + latestprinteddate + ", holddate="
				+ holddate + ", releasedate=" + releasedate + ", releasereason=" + releasereason + ", createdBy="
				+ createdBy + ", modifiedBy=" + modifiedBy + ", docno=" + docno + ", holduser=" + holduser
				+ ", releaseuser=" + releaseuser + ", workflowid=" + workflowid + ", statemachineid=" + statemachineid
				+ ", version=" + version + ", printamount=" + printamount + ", org=" + org + ", cancelCanceldate="
				+ cancelCanceldate + ", cancelCanceled=" + cancelCanceled + ", cancelCanceluser=" + cancelCanceluser
				+ ", cancelCancelreason=" + cancelCancelreason + ", holdreason=" + holdreason + ", sysversion="
				+ sysversion + ", businessdate=" + businessdate + "]";
	}
	
}