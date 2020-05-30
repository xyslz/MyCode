package com.caijai.repair.entity.po;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.wx.RepairState;
import com.caijai.base.sysenum.Sort;

/**
 * 保养项目
 * @author ChenYu
 *
 */
@Table(name = "eq_KeepingProject")
public class KeepingProject extends BaseTable {

	private static final long serialVersionUID = 1489392147767757897L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 保养模板
	 */
	@Column(name = "KeepingMould")
	private String keepingMould;
	
	/**
	 * 保养模板
	 */
	@Column(name = "keepingMouldName",readonly = true)
	@Relation( table = "EQ_KeepingMould", value = "id",show = "name",ref="keepingMould")
	private String keepingMouldName;
	
	/**
	 * 保养计划
	 */
	@Column(name = "KeepingPlan")
	private String keepingPlan;
	
	/**
	 * 保养计划单号
	 */
	@Column(name = "keppingPlanNo",readonly = true)
	@Relation( table = "EQ_KeepingPlan", value = "id",show = "DocNo",ref="keepingPlan")
	private String keppingPlanNo;
	
	/**
	 * 产线
	 */
	@Column(name = "ProductionLine")
	private String productionLine;
	
	/**
	 * 产线
	 */
	@Column(name = "productionLineCode",readonly=true)
	@Relation(table = "EQ_ProductionLine", value = "id",ref = "ProductionLine", show = "code")
	private String productionLineCode;
	
	/**
	 * 检修部门
	 */
	@Column(name = "RepairDept")
	private String repairDept;
	
	/**
	 * 检修部门
	 */
	@Column(name = "repairDeptName",readonly=true)
	@Relation(table = "SYS_Department_Trl", value = "id",ref = "repairDept", show = "name")
	private String repairDeptName;
	
	/**
	 * 配合部门
	 */
	@Column(name = "CooperateDept")
	private String cooperateDept;
	
	/**
	 * 配合部门
	 */
	@Column(name = "cooperateDeptName",readonly = true)
	@Relation(table = "SYS_Department_Trl", value = "id",ref = "cooperateDept", show = "name")
	private String cooperateDeptName;
	
	/**
	 * 单据类型
	 */
	@Column(name = "DocumentType")
	private String documenttype;
	
	/**
	 * 保养内容
	 */
	@Column(name = "Descri")
	private String descri;
	
	/**
	 * 结论
	 */
	@Column(name = "Conclusion")
	private String conclusion;
	
	/**
	 * 检修负责人
	 */
	@Column(name = "RepairMen")
	private String repairMen;
	
	/**
	 * 检修负责人
	 */
	@Column(name = "RepairMenName", readonly = true)
	@Relation(table = "SYS_Person", value = "id", show = "name", ref = "repairMen")
	private String repairMenName;
	
	/**
	 * 车间负责人
	 */
	@Column(name = "WorkshopLeader")
	private String workshopLeader;
	
	/**
	 * 车间负责人
	 */
	@Column(name = "WorkshopLeaderName", readonly = true)
	@Relation(table = "SYS_Person", value = "id", show = "name", ref = "workshopLeader")
	private String workshopLeaderName;
	
	/**
	 * 计划开始时间
	 */
	@Column(name = "PlanStartTime",sort = Sort.ASC)
	private String planStartTime;
	
	/**
	 * 计划结束时间
	 */
	@Column(name = "PlanEndTime")
	private String planEndTime;
	
	/**
	 * 开始时间
	 */
	@Column(name = "startTime")
	private String startTime;
	
	/**
	 * 结束时间
	 */
	@Column(name = "EndTime")
	private String endTime;

	/**
	 * 备注
	 */
	@Column(name = "Memo")
	private String memo;

	/**
	 * 设备台账
	 */
	@Column(name = "EM")
	private String em;
	
	/**
	 * 设备名称
	 */
	@Column(name = "enName",readonly=true)
	@Relation( table = "eq_em", value = "id",show = "name",ref="em")
	private String emName;
	
	/**
	 * 设备编码
	 */
	@Column(name = "emCode",readonly=true)
	@Relation( table = "eq_em", value = "id",show = "code",ref="em")
	private String emCode;

	/**
	 * 状态
	 */
	@Column(name = "DocState")
	private RepairState docstate;

	/**
	 * 设备组
	 */
	@Column(name = "EMGroup")
	private String emgroup;

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

	/**
	 * 作废标识
	 */
	@Column(name = "dr")
	private Integer dr;
	
	@Column(name = "ts")
	private String ts;

	@Column(name = "sys_source")
	private String sysSource;
	
	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getSysSource() {
		return sysSource;
	}

	public void setSysSource(String sysSource) {
		this.sysSource = sysSource;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKeepingMould() {
		return keepingMould;
	}

	public void setKeepingMould(String keepingMould) {
		this.keepingMould = keepingMould;
	}

	public String getKeepingPlan() {
		return keepingPlan;
	}

	public void setKeepingPlan(String keepingPlan) {
		this.keepingPlan = keepingPlan;
	}

	public String getProductionLine() {
		return productionLine;
	}

	public void setProductionLine(String productionLine) {
		this.productionLine = productionLine;
	}

	public String getRepairDept() {
		return repairDept;
	}

	public void setRepairDept(String repairDept) {
		this.repairDept = repairDept;
	}

	public String getCooperateDept() {
		return cooperateDept;
	}

	public void setCooperateDept(String cooperateDept) {
		this.cooperateDept = cooperateDept;
	}

	public String getDocumenttype() {
		return documenttype;
	}

	public void setDocumenttype(String documenttype) {
		this.documenttype = documenttype;
	}

	public String getDescri() {
		return descri;
	}

	public void setDescri(String descri) {
		this.descri = descri;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getRepairMen() {
		return repairMen;
	}

	public void setRepairMen(String repairMen) {
		this.repairMen = repairMen;
	}

	public String getWorkshopLeader() {
		return workshopLeader;
	}

	public void setWorkshopLeader(String workshopLeader) {
		this.workshopLeader = workshopLeader;
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

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getEm() {
		return em;
	}

	public void setEm(String em) {
		this.em = em;
	}
	
	public RepairState getDocstate() {
		return docstate;
	}

	public void setDocstate(RepairState docstate) {
		this.docstate = docstate;
	}

	public String getEmgroup() {
		return emgroup;
	}

	public void setEmgroup(String emgroup) {
		this.emgroup = emgroup;
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

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getKeepingMouldName() {
		return keepingMouldName;
	}

	public void setKeepingMouldName(String keepingMouldName) {
		this.keepingMouldName = keepingMouldName;
	}

	public String getProductionLineCode() {
		return productionLineCode;
	}

	public void setProductionLineCode(String productionLineCode) {
		this.productionLineCode = productionLineCode;
	}

	public String getRepairDeptName() {
		return repairDeptName;
	}

	public void setRepairDeptName(String repairDeptName) {
		this.repairDeptName = repairDeptName;
	}

	public String getCooperateDeptName() {
		return cooperateDeptName;
	}

	public void setCooperateDeptName(String cooperateDeptName) {
		this.cooperateDeptName = cooperateDeptName;
	}

	public String getRepairMenName() {
		return repairMenName;
	}

	public void setRepairMenName(String repairMenName) {
		this.repairMenName = repairMenName;
	}

	public String getWorkshopLeaderName() {
		return workshopLeaderName;
	}

	public void setWorkshopLeaderName(String workshopLeaderName) {
		this.workshopLeaderName = workshopLeaderName;
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

	public String getKeppingPlanNo() {
		return keppingPlanNo;
	}

	public void setKeppingPlanNo(String keppingPlanNo) {
		this.keppingPlanNo = keppingPlanNo;
	}

	@Override
	public String toString() {
		return "KeepingProject [id=" + id + ", keepingMould=" + keepingMould + ", keepingMouldName=" + keepingMouldName
				+ ", keepingPlan=" + keepingPlan + ", keppingPlanNo=" + keppingPlanNo + ", productionLine="
				+ productionLine + ", productionLineCode=" + productionLineCode + ", repairDept=" + repairDept
				+ ", repairDeptName=" + repairDeptName + ", cooperateDept=" + cooperateDept + ", cooperateDeptName="
				+ cooperateDeptName + ", documenttype=" + documenttype + ", descri=" + descri + ", conclusion="
				+ conclusion + ", repairMen=" + repairMen + ", repairMenName=" + repairMenName + ", workshopLeader="
				+ workshopLeader + ", workshopLeaderName=" + workshopLeaderName + ", planStartTime=" + planStartTime
				+ ", planEndTime=" + planEndTime + ", startTime=" + startTime + ", endTime=" + endTime + ", memo="
				+ memo + ", em=" + em + ", emName=" + emName + ", emCode=" + emCode + ", docstate=" + docstate
				+ ", emgroup=" + emgroup + ", approveinfoApprovedon=" + approveinfoApprovedon
				+ ", approveinfoUnapprovedon=" + approveinfoUnapprovedon + ", approveinfoApprovedby="
				+ approveinfoApprovedby + ", approveinfoUnapprovedby=" + approveinfoUnapprovedby + ", flowinstance="
				+ flowinstance + ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", latestprinteddate="
				+ latestprinteddate + ", holddate=" + holddate + ", releasedate=" + releasedate + ", releasereason="
				+ releasereason + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + ", docno=" + docno
				+ ", holduser=" + holduser + ", releaseuser=" + releaseuser + ", workflowid=" + workflowid
				+ ", statemachineid=" + statemachineid + ", version=" + version + ", printamount=" + printamount
				+ ", org=" + org + ", cancelCanceldate=" + cancelCanceldate + ", cancelCanceled=" + cancelCanceled
				+ ", cancelCanceluser=" + cancelCanceluser + ", cancelCancelreason=" + cancelCancelreason
				+ ", holdreason=" + holdreason + ", sysversion=" + sysversion + ", businessdate=" + businessdate
				+ ", dr=" + dr + ", ts=" + ts + ", sysSource=" + sysSource + "]";
	}

}