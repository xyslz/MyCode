/**  
 * Title: MiscShip.java<p>
 * Description: 库存杂发单<br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 杨雪景
 * @date 2018年12月19日
 * @version 1.0  
 */
package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.SrcDocType;
import com.caijai.base.sysenum.Status;

/**
 * Title: MiscShip
 * <p>
 * Description:库存杂发单 <br>
 * 
 * @author 杨雪景
 * @date 2018年12月19日
 */
@Table(name = "InvDoc_MiscShip")
public class MiscShip extends BaseTable {

	private static final long serialVersionUID = -2475007563870337287L;

	@Column(name = "ID", primary = true)
	private String id;

	@Column(name = "ApprovedBy")
	private String approvedBy;

	@Column(name = "ApprovedOn")
	private String approvedOn;

	@Column(name = "AvailableQtyMessage")
	private String availableQtyMessage;

	@Column(name = "BenefitOrg")
	private String benefitOrg;

	@Column(name = "BenefitPsn")
	private String benefitPsn;

	@Column(name = "BusinessDate")
	private String businessDate;

	@Column(name = "Cancel_CancelDate")
	private String cancel_CancelDate;

	@Column(name = "Cancel_Canceled")
	private Integer cancel_Canceled;

	@Column(name = "Cancel_CancelReason")
	private String cancel_CancelReason;

	@Column(name = "Cancel_CancelUser")
	private String cancel_CancelUser;

	@Column(name = "CancelApprovedBy")
	private String cancelApprovedBy;

	@Column(name = "CancelApprovedOn")
	private String cancelApprovedOn;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedOn")
	private String createdOn;

	@Column(name = "CurrAction")
	private Integer currAction;

	@Column(name = "DocNo")
	private String docNo;

	@Column(name = "Dr")
	private Integer dr;

	@Column(name = "FlowInstance")
	private String flowInstance;

	@Column(name = "GLClose")
	private Integer glClose;

	@Column(name = "GLClosedOn")
	private String glClosedOn;

	@Column(name = "HandlePsn")
	private String handlePsn;

	@Column(name = "HoldDate")
	private String holdDate;

	@Column(name = "HoldReason")
	private String holdReason;

	@Column(name = "HoldUser")
	private String holdUser;

	@Column(name = "IsTransfer")
	private Integer isTransfer;

	@Column(name = "IsUnCreateAAI")
	private Integer isUnCreateAAI;

	@Column(name = "IsUnrealReturned")
	private Integer isUnrealReturned;

	@Column(name = "LatestPrintedDate")
	private String latestPrintedDate;

	@Column(name = "MiscShipDocType")
	private String miscShipDocType;

	@Column(name = "miscShipDocTypeName", readonly = true)
	@Relation(table = "SYS_Dictionary_Detail", value = "id", ref = "miscShipDocType", show = "name")
	private String miscShipDocTypeName;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

	@Column(name = "Node")
	private String node;

	@Column(name = "Org")
	private String org;

	@Column(name = "PrintAmount")
	private Integer printAmount;

	@Column(name = "ProjectBudgetWarnMessage")
	private String projectBudgetWarnMessage;

	@Column(name = "ReleaseDate")
	private String releaseDate;

	@Column(name = "ReleaseReason")
	private String releaseReason;

	@Column(name = "ReleaseUser")
	private String releaseUser;

	@Column(name = "ReverseMiscShip")
	private Integer reverseMiscShip;

	@Column(name = "SOBAccountPeriod")
	private String soBAccountPeriod;

	@Column(name = "SrcDocType")
	private SrcDocType srcDocType;

	@Column(name = "StateMachineID")
	private String stateMachineID;

	@Column(name = "Status")
	private Status status;

	@Column(name = "SysVersion")
	private String sysVersion;

	@Column(name = "Ts")
	private String ts;

	@Column(name = "Version")
	private Integer version;

	@Column(name = "WarnMessage")
	private String warnMessage;

	@Column(name = "WFCurrentState")
	private Integer wfCurrentState;

	@Column(name = "WFOriginalState")
	private Integer wfOriginalState;

	@Column(name = "WhMan")
	private String whMan;

	@Column(name = "WorkFlowID")
	private String workFlowID;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getApprovedOn() {
		return approvedOn;
	}

	public void setApprovedOn(String approvedOn) {
		this.approvedOn = approvedOn;
	}

	public String getAvailableQtyMessage() {
		return availableQtyMessage;
	}

	public void setAvailableQtyMessage(String availableQtyMessage) {
		this.availableQtyMessage = availableQtyMessage;
	}

	public String getBenefitOrg() {
		return benefitOrg;
	}

	public void setBenefitOrg(String benefitOrg) {
		this.benefitOrg = benefitOrg;
	}

	public String getBenefitPsn() {
		return benefitPsn;
	}

	public void setBenefitPsn(String benefitPsn) {
		this.benefitPsn = benefitPsn;
	}

	public String getBusinessDate() {
		return businessDate;
	}

	public void setBusinessDate(String businessDate) {
		this.businessDate = businessDate;
	}

	public String getCancel_CancelDate() {
		return cancel_CancelDate;
	}

	public void setCancel_CancelDate(String cancel_CancelDate) {
		this.cancel_CancelDate = cancel_CancelDate;
	}

	public Integer getCancel_Canceled() {
		return cancel_Canceled;
	}

	public void setCancel_Canceled(Integer cancel_Canceled) {
		this.cancel_Canceled = cancel_Canceled;
	}

	public String getCancel_CancelReason() {
		return cancel_CancelReason;
	}

	public void setCancel_CancelReason(String cancel_CancelReason) {
		this.cancel_CancelReason = cancel_CancelReason;
	}

	public String getCancel_CancelUser() {
		return cancel_CancelUser;
	}

	public void setCancel_CancelUser(String cancel_CancelUser) {
		this.cancel_CancelUser = cancel_CancelUser;
	}

	public String getCancelApprovedBy() {
		return cancelApprovedBy;
	}

	public void setCancelApprovedBy(String cancelApprovedBy) {
		this.cancelApprovedBy = cancelApprovedBy;
	}

	public String getCancelApprovedOn() {
		return cancelApprovedOn;
	}

	public void setCancelApprovedOn(String cancelApprovedOn) {
		this.cancelApprovedOn = cancelApprovedOn;
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

	public Integer getCurrAction() {
		return currAction;
	}

	public void setCurrAction(Integer currAction) {
		this.currAction = currAction;
	}

	public String getDocNo() {
		return docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getFlowInstance() {
		return flowInstance;
	}

	public void setFlowInstance(String flowInstance) {
		this.flowInstance = flowInstance;
	}

	public Integer getGlClose() {
		return glClose;
	}

	public void setGlClose(Integer glClose) {
		this.glClose = glClose;
	}

	public String getGlClosedOn() {
		return glClosedOn;
	}

	public void setGlClosedOn(String glClosedOn) {
		this.glClosedOn = glClosedOn;
	}

	public String getHandlePsn() {
		return handlePsn;
	}

	public void setHandlePsn(String handlePsn) {
		this.handlePsn = handlePsn;
	}

	public String getHoldDate() {
		return holdDate;
	}

	public void setHoldDate(String holdDate) {
		this.holdDate = holdDate;
	}

	public String getHoldReason() {
		return holdReason;
	}

	public void setHoldReason(String holdReason) {
		this.holdReason = holdReason;
	}

	public String getHoldUser() {
		return holdUser;
	}

	public void setHoldUser(String holdUser) {
		this.holdUser = holdUser;
	}

	public Integer getIsTransfer() {
		return isTransfer;
	}

	public void setIsTransfer(Integer isTransfer) {
		this.isTransfer = isTransfer;
	}

	public Integer getIsUnCreateAAI() {
		return isUnCreateAAI;
	}

	public void setIsUnCreateAAI(Integer isUnCreateAAI) {
		this.isUnCreateAAI = isUnCreateAAI;
	}

	public Integer getIsUnrealReturned() {
		return isUnrealReturned;
	}

	public void setIsUnrealReturned(Integer isUnrealReturned) {
		this.isUnrealReturned = isUnrealReturned;
	}

	public String getMiscShipDocType() {
		return miscShipDocType;
	}

	public void setMiscShipDocType(String miscShipDocType) {
		this.miscShipDocType = miscShipDocType;
	}

	public String getMiscShipDocTypeName() {
		return miscShipDocTypeName;
	}

	public void setMiscShipDocTypeName(String miscShipDocTypeName) {
		this.miscShipDocTypeName = miscShipDocTypeName;
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

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getProjectBudgetWarnMessage() {
		return projectBudgetWarnMessage;
	}

	public void setProjectBudgetWarnMessage(String projectBudgetWarnMessage) {
		this.projectBudgetWarnMessage = projectBudgetWarnMessage;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getReleaseReason() {
		return releaseReason;
	}

	public void setReleaseReason(String releaseReason) {
		this.releaseReason = releaseReason;
	}

	public String getReleaseUser() {
		return releaseUser;
	}

	public void setReleaseUser(String releaseUser) {
		this.releaseUser = releaseUser;
	}

	public Integer getReverseMiscShip() {
		return reverseMiscShip;
	}

	public void setReverseMiscShip(Integer reverseMiscShip) {
		this.reverseMiscShip = reverseMiscShip;
	}

	public String getSoBAccountPeriod() {
		return soBAccountPeriod;
	}

	public void setSoBAccountPeriod(String soBAccountPeriod) {
		this.soBAccountPeriod = soBAccountPeriod;
	}

	/**
	 * @return the srcDocType
	 */
	public SrcDocType getSrcDocType() {
		return srcDocType;
	}

	/**
	 * @param srcDocType
	 *            the srcDocType to set
	 */
	public void setSrcDocType(SrcDocType srcDocType) {
		this.srcDocType = srcDocType;
	}

	public String getStateMachineID() {
		return stateMachineID;
	}

	public void setStateMachineID(String stateMachineID) {
		this.stateMachineID = stateMachineID;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getWarnMessage() {
		return warnMessage;
	}

	public void setWarnMessage(String warnMessage) {
		this.warnMessage = warnMessage;
	}

	public Integer getWfCurrentState() {
		return wfCurrentState;
	}

	public void setWfCurrentState(Integer wfCurrentState) {
		this.wfCurrentState = wfCurrentState;
	}

	public Integer getWfOriginalState() {
		return wfOriginalState;
	}

	public void setWfOriginalState(Integer wfOriginalState) {
		this.wfOriginalState = wfOriginalState;
	}

	public String getWhMan() {
		return whMan;
	}

	public void setWhMan(String whMan) {
		this.whMan = whMan;
	}

	public String getWorkFlowID() {
		return workFlowID;
	}

	public void setWorkFlowID(String workFlowID) {
		this.workFlowID = workFlowID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getLatestPrintedDate() {
		return latestPrintedDate;
	}

	public void setLatestPrintedDate(String latestPrintedDate) {
		this.latestPrintedDate = latestPrintedDate;
	}

	public Integer getPrintAmount() {
		return printAmount;
	}

	public void setPrintAmount(Integer printAmount) {
		this.printAmount = printAmount;
	}

}
