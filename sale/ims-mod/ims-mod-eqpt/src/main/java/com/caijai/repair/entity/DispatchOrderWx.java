package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.wx.DispatchState;
import com.caijai.base.sysenum.Sort;
import com.caijai.base.sysenum.wx.SrcDoc;
import com.caijai.base.sysenum.U9STATE;

/**
 * 维修派工单
 * 
 * @author ChenYu
 *
 */
@Table(name = "EQ_EMDispatchOrder")
public class DispatchOrderWx extends BaseTable {

	private static final long serialVersionUID = -5174830122127110314L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 派工单号
	 */
	@Column(name = "DocNo")
	private String code;

	/**
	 * 单据类型
	 */
	@Column(name = "DocumentType")
	private String documentType;

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
	 * 派工状态
	 */
	@Column(name = "DispatchState")
	private DispatchState dispatchState;

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
	 * 来源单号
	 */
	@Column(name = "SrcDocNo")
	private String srcdocno;

	/**
	 * 来源单号id
	 */
	@Column(name = "SrcDocID")
	private String srcdocid;

	/**
	 * 来源标识
	 */
	@Column(name = "srcdoc")
	private SrcDoc srcdoc;

	/**
	 * 设备台账
	 */
	@Column(name = "EM")
	private String em;

	/**
	 * 设备台账编码
	 */
	@Column(name = "emCode", readonly = true)
	@Relation(table = "EQ_EM", value = "id", ref = "em", show = "Code")
	private String emCode;

	/**
	 * 设备台账名称
	 */
	@Column(name = "emName", readonly = true)
	@Relation(table = "EQ_EM", value = "id", ref = "em", show = "name")
	private String emName;

	/**
	 * 故障id
	 */
	@Column(name = "FaultID", readonly = true)
	@Relation(show = "faultid", table = "EQ_RepairOrder", value = "ID", ref = "srcdocid")
	private String faultid;

	/**
	 * 故障码
	 */
	// @Column(name="FaultCode",readonly = true)
	// @Relation(show = "code", table = "EQ_FaultCode", value = "ID",ref="faultid")
	private String faultcode;

	/**
	 * 故障部位
	 */
	@Column(name = "faultpart", readonly = true)
	@Relation(show = "faultpart", table = "EQ_RepairOrder", value = "ID", ref = "srcdocid")
	private String faultpart;

	/**
	 * 故障描述
	 */
	@Column(name = "faultdesc", readonly = true)
	@Relation(show = "faultdesc", table = "EQ_RepairOrder", value = "ID", ref = "srcdocid")
	private String faultdesc;

	/**
	 * 产线
	 */
	@Column(name = "ProductionLine")
	private String productionLine;

	/**
	 * 产线编码
	 */
	@Column(name = "plCode", readonly = true)
	@Relation(show = "code", table = "EQ_ProductionLine", value = "ID", ref = "productionLine")
	private String plCode;

	/**
	 * 产线名称
	 */
	@Column(name = "plName", readonly = true)
	@Relation(show = "name", table = "EQ_ProductionLine", value = "ID", ref = "productionLine")
	private String plName;

	/**
	 * 配合部门
	 */
	@Column(name = "CoordinateDpt")
	private String coordinatedpt;

	/**
	 * 维修负责人
	 */
	@Column(name = "MaintainPerson")
	private String maintainperson;

	/**
	 * 维修负责人姓名
	 */
	@Column(name = "maintainpersonName", readonly = true)
	@Relation(table = "SYS_Person", value = "id", show = "name", ref = "maintainperson")
	private String maintainpersonName;

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
	 * 生效
	 */
	@Column(name = "isstate")
	private U9STATE isstate;

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
	@Column(name = "CreatedOn", sort = Sort.DESC)
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

	/**
	 * 时间戳
	 */
	@Column(name = "ts")
	private String ts;

	/**
	 * 报修人
	 */
	@Column(name = "applicant", readonly = true)
	@Relation(show = "applicant", table = "EQ_RepairOrder", value = "ID", ref = "srcdocid")
	private String applicant;

	/**
	 * 报修人姓名
	 */
	// @Column(name = "applicantName",readonly = true)
	// @Relation(table = "SYS_Person", value = "id", show = "name", ref =
	// "applicant")
	private String applicantName;

	/**
	 * 报修时间
	 */
	@Column(name = "repairOrderDate", readonly = true)
	@Relation(table = "EQ_RepairOrder", value = "id", show = "date", ref = "srcdocid")
	private String repairOrderDate;

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

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
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

	public DispatchState getDispatchState() {
		return dispatchState;
	}

	public void setDispatchState(DispatchState dispatchState) {
		this.dispatchState = dispatchState;
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

	public String getSrcdocno() {
		return srcdocno;
	}

	public void setSrcdocno(String srcdocno) {
		this.srcdocno = srcdocno;
	}

	public String getSrcdocid() {
		return srcdocid;
	}

	public void setSrcdocid(String srcdocid) {
		this.srcdocid = srcdocid;
	}

	public SrcDoc getSrcdoc() {
		return srcdoc;
	}

	public void setSrcdoc(SrcDoc srcdoc) {
		this.srcdoc = srcdoc;
	}

	public String getEm() {
		return em;
	}

	public void setEm(String em) {
		this.em = em;
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

	public String getFaultdesc() {
		return faultdesc;
	}

	public void setFaultdesc(String faultdesc) {
		this.faultdesc = faultdesc;
	}

	public String getProductionLine() {
		return productionLine;
	}

	public void setProductionLine(String productionLine) {
		this.productionLine = productionLine;
	}

	public String getPlCode() {
		return plCode;
	}

	public void setPlCode(String plCode) {
		this.plCode = plCode;
	}

	public String getPlName() {
		return plName;
	}

	public void setPlName(String plName) {
		this.plName = plName;
	}

	public String getCoordinatedpt() {
		return coordinatedpt;
	}

	public void setCoordinatedpt(String coordinatedpt) {
		this.coordinatedpt = coordinatedpt;
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

	public U9STATE getIsstate() {
		return isstate;
	}

	public void setIsstate(U9STATE isstate) {
		this.isstate = isstate;
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

	public String getRepairOrderDate() {
		return repairOrderDate;
	}

	public void setRepairOrderDate(String repairOrderDate) {
		this.repairOrderDate = repairOrderDate;
	}

	@Override
	public String toString() {
		return "DispatchOrder [id=" + id + ", code=" + code + ", documentType=" + documentType + ", planStartTime="
				+ planStartTime + ", planEndTime=" + planEndTime + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", dispatchState=" + dispatchState + ", maintenancetype=" + maintenancetype + ", memo=" + memo
				+ ", srcdocno=" + srcdocno + ", srcdocid=" + srcdocid + ", srcdoc=" + srcdoc + ", em=" + em
				+ ", emCode=" + emCode + ", emName=" + emName + ", faultid=" + faultid + ", faultcode=" + faultcode
				+ ", faultpart=" + faultpart + ", faultdesc=" + faultdesc + ", productionLine=" + productionLine
				+ ", plCode=" + plCode + ", plName=" + plName + ", coordinatedpt=" + coordinatedpt + ", maintainperson="
				+ maintainperson + ", maintainpersonName=" + maintainpersonName + ", holduser=" + holduser
				+ ", releaseuser=" + releaseuser + ", isstate=" + isstate + ", org=" + org + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", dr="
				+ dr + ", ts=" + ts + ", applicant=" + applicant + ", applicantName=" + applicantName
				+ ", repairOrderDate=" + repairOrderDate + "]";
	}

}