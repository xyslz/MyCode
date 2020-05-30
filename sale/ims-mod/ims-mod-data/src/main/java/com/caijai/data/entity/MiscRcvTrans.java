/**  
 * Title: MiscRcvTrans.java<p>
 * Description: 库存杂收单<br>  
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
 * Title: MiscRcvTrans
 * <p>
 * Description:库存杂收单 <br>
 * 
 * @author 杨雪景
 * @date 2018年12月19日
 */
@Table(name = "InvDoc_MiscRcvTrans")
public class MiscRcvTrans extends BaseTable {

	private static final long serialVersionUID = 9047716370134442683L;

	private String startBusiness;

	private String endBusiness;

	@Column(name = "ID", primary = true)
	private String id;

	@Column(name = "ApprovedBy")
	private String approvedBy;

	@Column(name = "ApprovedOn")
	private String approvedOn;

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

	@Column(name = "DummyRecede")
	private Integer dummyRecede;

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

	@Column(name = "IsFromSrcCost")
	private Integer isFromSrcCost;

	@Column(name = "IsTransfer")
	private Integer isTransfer;

	@Column(name = "IsUnCreateAAI")
	private Integer isUnCreateAAI;

	@Column(name = "LatestPrintedDate")
	private String latestPrintedDate;

	@Column(name = "MiscRcvDocType")
	private String miscRcvDocType;

	@Column(name = "miscRcvDocTypeName", readonly = true)
	@Relation(table = "SYS_Dictionary_Detail", value = "id", ref = "miscRcvDocType", show = "name")
	private String miscRcvDocTypeName;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

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

	@Column(name = "ReverseMiscRcv")
	private Integer reverseMiscRcv;

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

	public Integer getDummyRecede() {
		return dummyRecede;
	}

	public void setDummyRecede(Integer dummyRecede) {
		this.dummyRecede = dummyRecede;
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

	public Integer getIsFromSrcCost() {
		return isFromSrcCost;
	}

	public void setIsFromSrcCost(Integer isFromSrcCost) {
		this.isFromSrcCost = isFromSrcCost;
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

	public String getMiscRcvDocType() {
		return miscRcvDocType;
	}

	public void setMiscRcvDocType(String miscRcvDocType) {
		this.miscRcvDocType = miscRcvDocType;
	}

	public String getMiscRcvDocTypeName() {
		return miscRcvDocTypeName;
	}

	public void setMiscRcvDocTypeName(String miscRcvDocTypeName) {
		this.miscRcvDocTypeName = miscRcvDocTypeName;
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

	public Integer getReverseMiscRcv() {
		return reverseMiscRcv;
	}

	public void setReverseMiscRcv(Integer reverseMiscRcv) {
		this.reverseMiscRcv = reverseMiscRcv;
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

	public Status getStatus() {
		return status;
	}

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

	public String getStartBusiness() {
		return startBusiness;
	}

	public void setStartBusiness(String startBusiness) {
		this.startBusiness = startBusiness;
	}

	public String getEndBusiness() {
		return endBusiness;
	}

	public void setEndBusiness(String endBusiness) {
		this.endBusiness = endBusiness;
	}

}
