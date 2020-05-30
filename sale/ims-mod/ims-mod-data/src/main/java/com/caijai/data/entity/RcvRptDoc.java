/**  
 * Title: RcvRptDoc.java<p>
 * Description: 入库单<br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 杨雪景
 * @date 2018年12月12日
 * @version 1.0  
 */  
package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**  
 * Title: RcvRptDoc<p>  
 * Description:入库单 <br>  
 * @author 杨雪景
 * @date 2018年12月12日  
 */
@Table(name="Complete_RcvRptDoc")
public class RcvRptDoc extends BaseTable{

	private static final long serialVersionUID = -7863119579629922345L;
	
	@Column(name = "ID")
	private String id;	
	
	@Column(name = "DocDate")
	private String docDate;	
	
	@Column(name = "ActualRcvTime")
	private String actualRcvTime;	
	
	@Column(name = "ApproveOn")
	private String approveOn;	
	
	@Column(name = "CancelApproveOn")
	private String cancelApproveOn;	
	
	@Column(name = "BusinessCreatedOn")
	private String businessCreatedOn;
	
	@Column(name = "IsReWriteCompleteQty")
	private Integer isReWriteCompleteQty;
	
	@Column(name = "IsHoldRelease")
	private Integer isHoldRelease;
	
	@Column(name = "ApproveBy")
	private String approveBy;
	
	@Column(name = "CancelApproveBy")
	private String cancelApproveBy;
	
	@Column(name = "WarningMessage")
	private String warningMessage;
	
	@Column(name = "Remark")
	private String remark;
	
	@Column(name = "WFCurrentState")
	private Integer wFCurrentState;
	
	@Column(name = "WFOriginalState")
	private Integer wFOriginalState;
	
	@Column(name = "RcvOrg")
	private String rcvOrg;
	
	@Column(name = "Direction")
	private Integer direction;
	
	@Column(name = "DocState")
	private Integer docState;
	
	@Column(name = "SourceType_MOSrcDocType")
	private Integer sourceTypeMOSrcDocType;
	
	@Column(name = "SourceType_SrcDocVer")
	private String sourceTypeSrcDocVer;
	
	@Column(name = "SourceType_SrcDocNo")
	private String sourceTypeSrcDocNo;
	
	@Column(name = "SourceType_SrcDocLineNo")
	private String sourceTypeSrcDocLineNo;
	
	@Column(name = "SourceType_SrcDocSublineNo")
	private String sourceTypeSrcDocSublineNo;
	
	@Column(name = "SourceType_SrcDoc_EntityType")
	private String sourceType_SrcDocEntityType;
	
	@Column(name = "SourceType_SrcDoc_EntityID")
	private String sourceTypeSrcDocEntityID;
	
	@Column(name = "SourceType_SrcDocLine_EntityType")
	private String sourceTypeSrcDocLineEntityType;
	
	@Column(name = "SourceType_SrcDocLine_EntityID")
	private String sourceTypeSrcDocLineEntityID;
	
	@Column(name = "SourceType_SrcDocSubline_EntityType")
	private String sourceTypeSrcDocSublineEntityType;
	
	@Column(name = "SourceType_SrcDocSubline_EntityID")
	private String sourceTypeSrcDocSublineEntityID;
	
	@Column(name = "SourceType_SrcDocOrg")
	private String sourceTypeSrcDocOrg;
	
	@Column(name = "RcvRptDocType")
	private String rcvRptDocType;
	
	@Column(name = "RcvDep")
	private String rcvDep;
	
	@Column(name = "RcvPerson")
	private String rcvPerson;
	
	@Column(name = "ReverseComplete")
	private Integer reverseComplete;
	
	@Column(name = "BusinessCreatedBy")
	private String businessCreatedBy;
	
	@Column(name = "FlowInstance")
	private String flowInstance;
	
	@Column(name = "CreatedOn")
	private String createdOn;
	
	@Column(name = "ModifiedOn")
	private String modifiedOn;
	
	@Column(name = "LatestPrintedDate")
	private String latestPrintedDate;
	
	@Column(name = "HoldDate")
	private String holdDate;
	
	@Column(name = "ReleaseDate")
	private String releaseDate;
	
	@Column(name = "ReleaseReason")
	private String releaseReason;
	
	@Column(name = "CreatedBy")
	private String createdBy;
	
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	
	@Column(name = "DocNo")
	private String docNo;
	
	@Column(name = "HoldUser")
	private String holdUser;
	
	@Column(name = "ReleaseUser")
	private String releaseUser;
	
	@Column(name = "WorkFlowID")
	private String workFlowID;
	
	@Column(name = "StateMachineID")
	private String stateMachineID;
	
	@Column(name = "Version")
	private Integer version;
	
	@Column(name = "PrintAmount")
	private Integer printAmount;
	
	@Column(name = "Org")
	private String org;
	
	@Column(name = "DescFlexField_PubDescSeg1")
	private String descFlexFieldPubDescSeg1;
	
	@Column(name = "DescFlexField_PubDescSeg2")
	private String descFlexFieldPubDescSeg2;
	
	@Column(name = "DescFlexField_PubDescSeg3")
	private String descFlexFieldPubDescSeg3;
	
	@Column(name = "DescFlexField_PubDescSeg4")
	private String descFlexFieldPubDescSeg4;
	
	@Column(name = "DescFlexField_PubDescSeg5")
	private String descFlexFieldPubDescSeg5;
	
	@Column(name = "DescFlexField_PubDescSeg6")
	private String descFlexFieldPubDescSeg6;
	
	@Column(name = "DescFlexField_PubDescSeg7")
	private String descFlexFieldPubDescSeg7;
	
	@Column(name = "DescFlexField_PubDescSeg8")
	private String descFlexFieldPubDescSeg8;
	
	@Column(name = "DescFlexField_PubDescSeg9")
	private String descFlexFieldPubDescSeg9;
	
	@Column(name = "DescFlexField_PubDescSeg10")
	private String descFlexFieldPubDescSeg10;
	
	@Column(name = "DescFlexField_PubDescSeg11")
	private String descFlexFieldPubDescSeg11;
	
	@Column(name = "DescFlexField_PubDescSeg12")
	private String descFlexFieldPubDescSeg12;
	
	@Column(name = "DescFlexField_PubDescSeg13")
	private String descFlexFieldPubDescSeg13;
	
	@Column(name = "DescFlexField_PubDescSeg14")
	private String descFlexFieldPubDescSeg14;
	
	@Column(name = "DescFlexField_PubDescSeg15")
	private String descFlexFieldPubDescSeg15;
	
	@Column(name = "DescFlexField_PubDescSeg16")
	private String descFlexFieldPubDescSeg16;
	
	@Column(name = "DescFlexField_PubDescSeg17")
	private String descFlexFieldPubDescSeg17;
	
	@Column(name = "DescFlexField_PubDescSeg18")
	private String descFlexFieldPubDescSeg18;
	
	@Column(name = "DescFlexField_PubDescSeg19")
	private String descFlexFieldPubDescSeg19;
	
	@Column(name = "DescFlexField_PubDescSeg20")
	private String descFlexFieldPubDescSeg20;
	
	@Column(name = "DescFlexField_PubDescSeg21")
	private String descFlexFieldPubDescSeg21;
	
	@Column(name = "DescFlexField_PubDescSeg22")
	private String descFlexFieldPubDescSeg22;
	
	@Column(name = "DescFlexField_PubDescSeg23")
	private String descFlexFieldPubDescSeg23;
	
	@Column(name = "DescFlexField_PubDescSeg24")
	private String descFlexFieldPubDescSeg24;
	
	@Column(name = "DescFlexField_PubDescSeg25")
	private String descFlexFieldPubDescSeg25;
	
	@Column(name = "DescFlexField_PubDescSeg26")
	private String descFlexFieldPubDescSeg26;
	
	@Column(name = "DescFlexField_PubDescSeg27")
	private String descFlexFieldPubDescSeg27;
	
	@Column(name = "DescFlexField_PubDescSeg28")
	private String descFlexFieldPubDescSeg28;
	
	@Column(name = "DescFlexField_PubDescSeg29")
	private String descFlexFieldPubDescSeg29;
	
	@Column(name = "DescFlexField_PubDescSeg30")
	private String descFlexFieldPubDescSeg30;
	
	@Column(name = "DescFlexField_PubDescSeg31")
	private String descFlexFieldPubDescSeg31;
	
	@Column(name = "DescFlexField_PubDescSeg32")
	private String descFlexFieldPubDescSeg32;
	
	@Column(name = "DescFlexField_PubDescSeg33")
	private String descFlexFieldPubDescSeg33;
	
	@Column(name = "DescFlexField_PubDescSeg34")
	private String descFlexFieldPubDescSeg34;
	
	@Column(name = "DescFlexField_PubDescSeg35")
	private String descFlexFieldPubDescSeg35;
	
	@Column(name = "DescFlexField_PubDescSeg36")
	private String descFlexFieldPubDescSeg36;
	
	@Column(name = "DescFlexField_PubDescSeg37")
	private String descFlexFieldPubDescSeg37;
	
	@Column(name = "DescFlexField_PubDescSeg38")
	private String descFlexFieldPubDescSeg38;
	
	@Column(name = "DescFlexField_PubDescSeg39")
	private String descFlexFieldPubDescSeg39;
	
	@Column(name = "DescFlexField_PubDescSeg40")
	private String descFlexFieldPubDescSeg40;
	
	@Column(name = "DescFlexField_PubDescSeg41")
	private String descFlexFieldPubDescSeg41;
	
	@Column(name = "DescFlexField_PubDescSeg42")
	private String descFlexFieldPubDescSeg42;
	
	@Column(name = "DescFlexField_PubDescSeg43")
	private String descFlexFieldPubDescSeg43;
	
	@Column(name = "DescFlexField_PubDescSeg44")
	private String descFlexFieldPubDescSeg44;
	
	@Column(name = "DescFlexField_PubDescSeg45")
	private String descFlexFieldPubDescSeg45;
	
	@Column(name = "DescFlexField_PubDescSeg46")
	private String descFlexFieldPubDescSeg46;
	
	@Column(name = "DescFlexField_PubDescSeg47")
	private String descFlexFieldPubDescSeg47;
	
	@Column(name = "DescFlexField_PubDescSeg48")
	private String descFlexFieldPubDescSeg48;
	
	@Column(name = "DescFlexField_PubDescSeg49")
	private String descFlexFieldPubDescSeg49;
	
	@Column(name = "DescFlexField_PubDescSeg50")
	private String descFlexFieldPubDescSeg50;
	
	@Column(name = "DescFlexField_ContextValue")
	private String DescFlexField_ContextValue;
	
	@Column(name = "DescFlexField_PrivateDescSeg1")
	private String descFlexFieldPrivateDescSeg1;
	
	@Column(name = "DescFlexField_PrivateDescSeg2")
	private String descFlexFieldPrivateDescSeg2;
	
	@Column(name = "DescFlexField_PrivateDescSeg3")
	private String descFlexFieldPrivateDescSeg3;
	
	@Column(name = "DescFlexField_PrivateDescSeg4")
	private String descFlexFieldPrivateDescSeg4;
	
	@Column(name = "DescFlexField_PrivateDescSeg5")
	private String descFlexFieldPrivateDescSeg5;
	
	@Column(name = "DescFlexField_PrivateDescSeg6")
	private String descFlexFieldPrivateDescSeg6;
	
	@Column(name = "DescFlexField_PrivateDescSeg7")
	private String descFlexFieldPrivateDescSeg7;
	
	@Column(name = "DescFlexField_PrivateDescSeg8")
	private String descFlexFieldPrivateDescSeg8;
	
	@Column(name = "DescFlexField_PrivateDescSeg9")
	private String descFlexFieldPrivateDescSeg9;
	
	@Column(name = "DescFlexField_PrivateDescSeg10")
	private String descFlexFieldPrivateDescSeg10;
	
	@Column(name = "DescFlexField_PrivateDescSeg11")
	private String descFlexFieldPrivateDescSeg11;
	
	@Column(name = "DescFlexField_PrivateDescSeg12")
	private String descFlexFieldPrivateDescSeg12;
	
	@Column(name = "DescFlexField_PrivateDescSeg13")
	private String descFlexFieldPrivateDescSeg13;
	
	@Column(name = "DescFlexField_PrivateDescSeg14")
	private String descFlexFieldPrivateDescSeg14;
	
	@Column(name = "DescFlexField_PrivateDescSeg15")
	private String descFlexFieldPrivateDescSeg15;
	
	@Column(name = "DescFlexField_PrivateDescSeg16")
	private String descFlexFieldPrivateDescSeg16;
	
	@Column(name = "DescFlexField_PrivateDescSeg17")
	private String descFlexFieldPrivateDescSeg17;
	
	@Column(name = "DescFlexField_PrivateDescSeg18")
	private String descFlexFieldPrivateDescSeg18;
	
	@Column(name = "DescFlexField_PrivateDescSeg19")
	private String descFlexFieldPrivateDescSeg19;
	
	@Column(name = "DescFlexField_PrivateDescSeg20")
	private String descFlexFieldPrivateDescSeg20;
	
	@Column(name = "DescFlexField_PrivateDescSeg21")
	private String descFlexFieldPrivateDescSeg21;
	
	@Column(name = "DescFlexField_PrivateDescSeg22")
	private String descFlexFieldPrivateDescSeg22;
	
	@Column(name = "DescFlexField_PrivateDescSeg23")
	private String descFlexFieldPrivateDescSeg23;
	
	@Column(name = "DescFlexField_PrivateDescSeg24")
	private String descFlexFieldPrivateDescSeg24;
	
	@Column(name = "DescFlexField_PrivateDescSeg25")
	private String descFlexFieldPrivateDescSeg25;
	
	@Column(name = "DescFlexField_PrivateDescSeg26")
	private String descFlexFieldPrivateDescSeg26;
	
	@Column(name = "DescFlexField_PrivateDescSeg27")
	private String descFlexFieldPrivateDescSeg27;
	
	@Column(name = "DescFlexField_PrivateDescSeg28")
	private String descFlexFieldPrivateDescSeg28;
	
	@Column(name = "DescFlexField_PrivateDescSeg29")
	private String descFlexFieldPrivateDescSeg29;
	
	@Column(name = "DescFlexField_PrivateDescSeg30")
	private String descFlexFieldPrivateDescSeg30;
	
	@Column(name = "Cancel_CancelDate")
	private String cancelCancelDate;
	
	@Column(name = "Cancel_Canceled")
	private Integer cancelCanceled;
	
	@Column(name = "Cancel_CancelUser")
	private String cancelCancelUser;
	
	@Column(name = "Cancel_CancelReason")
	private String cancelCancelReason;
	
	@Column(name = "HoldReason")
	private String holdReason;
	
	@Column(name = "SysVersion")
	private String sysVersion;
	
	@Column(name = "BusinessDate")
	private String businessDate;
	
	@Column(name = "SourceType_SrcDocType")
	private String sourceTypeSrcDocType;
	
	@Column(name = "SourceType_SrcDocID")
	private String sourceTypeSrcDocID;
	
	@Column(name = "SourceType_SrcDocLineID")
	private String sourceTypeSrcDocLineID;
	
	@Column(name = "Dr")
	private Integer dr;
	
	@Column(name = "Ts")
	private String ts;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDocDate() {
		return docDate;
	}

	public void setDocDate(String docDate) {
		this.docDate = docDate;
	}

	public String getActualRcvTime() {
		return actualRcvTime;
	}

	public void setActualRcvTime(String actualRcvTime) {
		this.actualRcvTime = actualRcvTime;
	}

	public String getApproveOn() {
		return approveOn;
	}

	public void setApproveOn(String approveOn) {
		this.approveOn = approveOn;
	}

	public String getCancelApproveOn() {
		return cancelApproveOn;
	}

	public void setCancelApproveOn(String cancelApproveOn) {
		this.cancelApproveOn = cancelApproveOn;
	}

	public String getBusinessCreatedOn() {
		return businessCreatedOn;
	}

	public void setBusinessCreatedOn(String businessCreatedOn) {
		this.businessCreatedOn = businessCreatedOn;
	}

	public Integer getIsReWriteCompleteQty() {
		return isReWriteCompleteQty;
	}

	public void setIsReWriteCompleteQty(Integer isReWriteCompleteQty) {
		this.isReWriteCompleteQty = isReWriteCompleteQty;
	}

	public Integer getIsHoldRelease() {
		return isHoldRelease;
	}

	public void setIsHoldRelease(Integer isHoldRelease) {
		this.isHoldRelease = isHoldRelease;
	}

	public String getApproveBy() {
		return approveBy;
	}

	public void setApproveBy(String approveBy) {
		this.approveBy = approveBy;
	}

	public String getCancelApproveBy() {
		return cancelApproveBy;
	}

	public void setCancelApproveBy(String cancelApproveBy) {
		this.cancelApproveBy = cancelApproveBy;
	}

	public String getWarningMessage() {
		return warningMessage;
	}

	public void setWarningMessage(String warningMessage) {
		this.warningMessage = warningMessage;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getwFCurrentState() {
		return wFCurrentState;
	}

	public void setwFCurrentState(Integer wFCurrentState) {
		this.wFCurrentState = wFCurrentState;
	}

	public Integer getwFOriginalState() {
		return wFOriginalState;
	}

	public void setwFOriginalState(Integer wFOriginalState) {
		this.wFOriginalState = wFOriginalState;
	}

	public String getRcvOrg() {
		return rcvOrg;
	}

	public void setRcvOrg(String rcvOrg) {
		this.rcvOrg = rcvOrg;
	}

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
	}

	public Integer getDocState() {
		return docState;
	}

	public void setDocState(Integer docState) {
		this.docState = docState;
	}

	public Integer getSourceTypeMOSrcDocType() {
		return sourceTypeMOSrcDocType;
	}

	public void setSourceTypeMOSrcDocType(Integer sourceTypeMOSrcDocType) {
		this.sourceTypeMOSrcDocType = sourceTypeMOSrcDocType;
	}

	public String getSourceTypeSrcDocVer() {
		return sourceTypeSrcDocVer;
	}

	public void setSourceTypeSrcDocVer(String sourceTypeSrcDocVer) {
		this.sourceTypeSrcDocVer = sourceTypeSrcDocVer;
	}

	public String getSourceTypeSrcDocNo() {
		return sourceTypeSrcDocNo;
	}

	public void setSourceTypeSrcDocNo(String sourceTypeSrcDocNo) {
		this.sourceTypeSrcDocNo = sourceTypeSrcDocNo;
	}

	public String getSourceTypeSrcDocLineNo() {
		return sourceTypeSrcDocLineNo;
	}

	public void setSourceTypeSrcDocLineNo(String sourceTypeSrcDocLineNo) {
		this.sourceTypeSrcDocLineNo = sourceTypeSrcDocLineNo;
	}

	public String getSourceTypeSrcDocSublineNo() {
		return sourceTypeSrcDocSublineNo;
	}

	public void setSourceTypeSrcDocSublineNo(String sourceTypeSrcDocSublineNo) {
		this.sourceTypeSrcDocSublineNo = sourceTypeSrcDocSublineNo;
	}

	public String getSourceType_SrcDocEntityType() {
		return sourceType_SrcDocEntityType;
	}

	public void setSourceType_SrcDocEntityType(String sourceType_SrcDocEntityType) {
		this.sourceType_SrcDocEntityType = sourceType_SrcDocEntityType;
	}

	public String getSourceTypeSrcDocEntityID() {
		return sourceTypeSrcDocEntityID;
	}

	public void setSourceTypeSrcDocEntityID(String sourceTypeSrcDocEntityID) {
		this.sourceTypeSrcDocEntityID = sourceTypeSrcDocEntityID;
	}

	public String getSourceTypeSrcDocLineEntityType() {
		return sourceTypeSrcDocLineEntityType;
	}

	public void setSourceTypeSrcDocLineEntityType(String sourceTypeSrcDocLineEntityType) {
		this.sourceTypeSrcDocLineEntityType = sourceTypeSrcDocLineEntityType;
	}

	public String getSourceTypeSrcDocLineEntityID() {
		return sourceTypeSrcDocLineEntityID;
	}

	public void setSourceTypeSrcDocLineEntityID(String sourceTypeSrcDocLineEntityID) {
		this.sourceTypeSrcDocLineEntityID = sourceTypeSrcDocLineEntityID;
	}

	public String getSourceTypeSrcDocSublineEntityType() {
		return sourceTypeSrcDocSublineEntityType;
	}

	public void setSourceTypeSrcDocSublineEntityType(String sourceTypeSrcDocSublineEntityType) {
		this.sourceTypeSrcDocSublineEntityType = sourceTypeSrcDocSublineEntityType;
	}

	public String getSourceTypeSrcDocSublineEntityID() {
		return sourceTypeSrcDocSublineEntityID;
	}

	public void setSourceTypeSrcDocSublineEntityID(String sourceTypeSrcDocSublineEntityID) {
		this.sourceTypeSrcDocSublineEntityID = sourceTypeSrcDocSublineEntityID;
	}

	public String getSourceTypeSrcDocOrg() {
		return sourceTypeSrcDocOrg;
	}

	public void setSourceTypeSrcDocOrg(String sourceTypeSrcDocOrg) {
		this.sourceTypeSrcDocOrg = sourceTypeSrcDocOrg;
	}

	public String getRcvRptDocType() {
		return rcvRptDocType;
	}

	public void setRcvRptDocType(String rcvRptDocType) {
		this.rcvRptDocType = rcvRptDocType;
	}

	public String getRcvDep() {
		return rcvDep;
	}

	public void setRcvDep(String rcvDep) {
		this.rcvDep = rcvDep;
	}

	public String getRcvPerson() {
		return rcvPerson;
	}

	public void setRcvPerson(String rcvPerson) {
		this.rcvPerson = rcvPerson;
	}

	public Integer getReverseComplete() {
		return reverseComplete;
	}

	public void setReverseComplete(Integer reverseComplete) {
		this.reverseComplete = reverseComplete;
	}

	public String getBusinessCreatedBy() {
		return businessCreatedBy;
	}

	public void setBusinessCreatedBy(String businessCreatedBy) {
		this.businessCreatedBy = businessCreatedBy;
	}

	public String getFlowInstance() {
		return flowInstance;
	}

	public void setFlowInstance(String flowInstance) {
		this.flowInstance = flowInstance;
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

	public String getLatestPrintedDate() {
		return latestPrintedDate;
	}

	public void setLatestPrintedDate(String latestPrintedDate) {
		this.latestPrintedDate = latestPrintedDate;
	}

	public String getHoldDate() {
		return holdDate;
	}

	public void setHoldDate(String holdDate) {
		this.holdDate = holdDate;
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

	public String getDocNo() {
		return docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

	public String getHoldUser() {
		return holdUser;
	}

	public void setHoldUser(String holdUser) {
		this.holdUser = holdUser;
	}

	public String getReleaseUser() {
		return releaseUser;
	}

	public void setReleaseUser(String releaseUser) {
		this.releaseUser = releaseUser;
	}

	public String getWorkFlowID() {
		return workFlowID;
	}

	public void setWorkFlowID(String workFlowID) {
		this.workFlowID = workFlowID;
	}

	public String getStateMachineID() {
		return stateMachineID;
	}

	public void setStateMachineID(String stateMachineID) {
		this.stateMachineID = stateMachineID;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getPrintAmount() {
		return printAmount;
	}

	public void setPrintAmount(Integer printAmount) {
		this.printAmount = printAmount;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getDescFlexFieldPubDescSeg1() {
		return descFlexFieldPubDescSeg1;
	}

	public void setDescFlexFieldPubDescSeg1(String descFlexFieldPubDescSeg1) {
		this.descFlexFieldPubDescSeg1 = descFlexFieldPubDescSeg1;
	}

	public String getDescFlexFieldPubDescSeg2() {
		return descFlexFieldPubDescSeg2;
	}

	public void setDescFlexFieldPubDescSeg2(String descFlexFieldPubDescSeg2) {
		this.descFlexFieldPubDescSeg2 = descFlexFieldPubDescSeg2;
	}

	public String getDescFlexFieldPubDescSeg3() {
		return descFlexFieldPubDescSeg3;
	}

	public void setDescFlexFieldPubDescSeg3(String descFlexFieldPubDescSeg3) {
		this.descFlexFieldPubDescSeg3 = descFlexFieldPubDescSeg3;
	}

	public String getDescFlexFieldPubDescSeg4() {
		return descFlexFieldPubDescSeg4;
	}

	public void setDescFlexFieldPubDescSeg4(String descFlexFieldPubDescSeg4) {
		this.descFlexFieldPubDescSeg4 = descFlexFieldPubDescSeg4;
	}

	public String getDescFlexFieldPubDescSeg5() {
		return descFlexFieldPubDescSeg5;
	}

	public void setDescFlexFieldPubDescSeg5(String descFlexFieldPubDescSeg5) {
		this.descFlexFieldPubDescSeg5 = descFlexFieldPubDescSeg5;
	}

	public String getDescFlexFieldPubDescSeg6() {
		return descFlexFieldPubDescSeg6;
	}

	public void setDescFlexFieldPubDescSeg6(String descFlexFieldPubDescSeg6) {
		this.descFlexFieldPubDescSeg6 = descFlexFieldPubDescSeg6;
	}

	public String getDescFlexFieldPubDescSeg7() {
		return descFlexFieldPubDescSeg7;
	}

	public void setDescFlexFieldPubDescSeg7(String descFlexFieldPubDescSeg7) {
		this.descFlexFieldPubDescSeg7 = descFlexFieldPubDescSeg7;
	}

	public String getDescFlexFieldPubDescSeg8() {
		return descFlexFieldPubDescSeg8;
	}

	public void setDescFlexFieldPubDescSeg8(String descFlexFieldPubDescSeg8) {
		this.descFlexFieldPubDescSeg8 = descFlexFieldPubDescSeg8;
	}

	public String getDescFlexFieldPubDescSeg9() {
		return descFlexFieldPubDescSeg9;
	}

	public void setDescFlexFieldPubDescSeg9(String descFlexFieldPubDescSeg9) {
		this.descFlexFieldPubDescSeg9 = descFlexFieldPubDescSeg9;
	}

	public String getDescFlexFieldPubDescSeg10() {
		return descFlexFieldPubDescSeg10;
	}

	public void setDescFlexFieldPubDescSeg10(String descFlexFieldPubDescSeg10) {
		this.descFlexFieldPubDescSeg10 = descFlexFieldPubDescSeg10;
	}

	public String getDescFlexFieldPubDescSeg11() {
		return descFlexFieldPubDescSeg11;
	}

	public void setDescFlexFieldPubDescSeg11(String descFlexFieldPubDescSeg11) {
		this.descFlexFieldPubDescSeg11 = descFlexFieldPubDescSeg11;
	}

	public String getDescFlexFieldPubDescSeg12() {
		return descFlexFieldPubDescSeg12;
	}

	public void setDescFlexFieldPubDescSeg12(String descFlexFieldPubDescSeg12) {
		this.descFlexFieldPubDescSeg12 = descFlexFieldPubDescSeg12;
	}

	public String getDescFlexFieldPubDescSeg13() {
		return descFlexFieldPubDescSeg13;
	}

	public void setDescFlexFieldPubDescSeg13(String descFlexFieldPubDescSeg13) {
		this.descFlexFieldPubDescSeg13 = descFlexFieldPubDescSeg13;
	}

	public String getDescFlexFieldPubDescSeg14() {
		return descFlexFieldPubDescSeg14;
	}

	public void setDescFlexFieldPubDescSeg14(String descFlexFieldPubDescSeg14) {
		this.descFlexFieldPubDescSeg14 = descFlexFieldPubDescSeg14;
	}

	public String getDescFlexFieldPubDescSeg15() {
		return descFlexFieldPubDescSeg15;
	}

	public void setDescFlexFieldPubDescSeg15(String descFlexFieldPubDescSeg15) {
		this.descFlexFieldPubDescSeg15 = descFlexFieldPubDescSeg15;
	}

	public String getDescFlexFieldPubDescSeg16() {
		return descFlexFieldPubDescSeg16;
	}

	public void setDescFlexFieldPubDescSeg16(String descFlexFieldPubDescSeg16) {
		this.descFlexFieldPubDescSeg16 = descFlexFieldPubDescSeg16;
	}

	public String getDescFlexFieldPubDescSeg17() {
		return descFlexFieldPubDescSeg17;
	}

	public void setDescFlexFieldPubDescSeg17(String descFlexFieldPubDescSeg17) {
		this.descFlexFieldPubDescSeg17 = descFlexFieldPubDescSeg17;
	}

	public String getDescFlexFieldPubDescSeg18() {
		return descFlexFieldPubDescSeg18;
	}

	public void setDescFlexFieldPubDescSeg18(String descFlexFieldPubDescSeg18) {
		this.descFlexFieldPubDescSeg18 = descFlexFieldPubDescSeg18;
	}

	public String getDescFlexFieldPubDescSeg19() {
		return descFlexFieldPubDescSeg19;
	}

	public void setDescFlexFieldPubDescSeg19(String descFlexFieldPubDescSeg19) {
		this.descFlexFieldPubDescSeg19 = descFlexFieldPubDescSeg19;
	}

	public String getDescFlexFieldPubDescSeg20() {
		return descFlexFieldPubDescSeg20;
	}

	public void setDescFlexFieldPubDescSeg20(String descFlexFieldPubDescSeg20) {
		this.descFlexFieldPubDescSeg20 = descFlexFieldPubDescSeg20;
	}

	public String getDescFlexFieldPubDescSeg21() {
		return descFlexFieldPubDescSeg21;
	}

	public void setDescFlexFieldPubDescSeg21(String descFlexFieldPubDescSeg21) {
		this.descFlexFieldPubDescSeg21 = descFlexFieldPubDescSeg21;
	}

	public String getDescFlexFieldPubDescSeg22() {
		return descFlexFieldPubDescSeg22;
	}

	public void setDescFlexFieldPubDescSeg22(String descFlexFieldPubDescSeg22) {
		this.descFlexFieldPubDescSeg22 = descFlexFieldPubDescSeg22;
	}

	public String getDescFlexFieldPubDescSeg23() {
		return descFlexFieldPubDescSeg23;
	}

	public void setDescFlexFieldPubDescSeg23(String descFlexFieldPubDescSeg23) {
		this.descFlexFieldPubDescSeg23 = descFlexFieldPubDescSeg23;
	}

	public String getDescFlexFieldPubDescSeg24() {
		return descFlexFieldPubDescSeg24;
	}

	public void setDescFlexFieldPubDescSeg24(String descFlexFieldPubDescSeg24) {
		this.descFlexFieldPubDescSeg24 = descFlexFieldPubDescSeg24;
	}

	public String getDescFlexFieldPubDescSeg25() {
		return descFlexFieldPubDescSeg25;
	}

	public void setDescFlexFieldPubDescSeg25(String descFlexFieldPubDescSeg25) {
		this.descFlexFieldPubDescSeg25 = descFlexFieldPubDescSeg25;
	}

	public String getDescFlexFieldPubDescSeg26() {
		return descFlexFieldPubDescSeg26;
	}

	public void setDescFlexFieldPubDescSeg26(String descFlexFieldPubDescSeg26) {
		this.descFlexFieldPubDescSeg26 = descFlexFieldPubDescSeg26;
	}

	public String getDescFlexFieldPubDescSeg27() {
		return descFlexFieldPubDescSeg27;
	}

	public void setDescFlexFieldPubDescSeg27(String descFlexFieldPubDescSeg27) {
		this.descFlexFieldPubDescSeg27 = descFlexFieldPubDescSeg27;
	}

	public String getDescFlexFieldPubDescSeg28() {
		return descFlexFieldPubDescSeg28;
	}

	public void setDescFlexFieldPubDescSeg28(String descFlexFieldPubDescSeg28) {
		this.descFlexFieldPubDescSeg28 = descFlexFieldPubDescSeg28;
	}

	public String getDescFlexFieldPubDescSeg29() {
		return descFlexFieldPubDescSeg29;
	}

	public void setDescFlexFieldPubDescSeg29(String descFlexFieldPubDescSeg29) {
		this.descFlexFieldPubDescSeg29 = descFlexFieldPubDescSeg29;
	}

	public String getDescFlexFieldPubDescSeg30() {
		return descFlexFieldPubDescSeg30;
	}

	public void setDescFlexFieldPubDescSeg30(String descFlexFieldPubDescSeg30) {
		this.descFlexFieldPubDescSeg30 = descFlexFieldPubDescSeg30;
	}

	public String getDescFlexFieldPubDescSeg31() {
		return descFlexFieldPubDescSeg31;
	}

	public void setDescFlexFieldPubDescSeg31(String descFlexFieldPubDescSeg31) {
		this.descFlexFieldPubDescSeg31 = descFlexFieldPubDescSeg31;
	}

	public String getDescFlexFieldPubDescSeg32() {
		return descFlexFieldPubDescSeg32;
	}

	public void setDescFlexFieldPubDescSeg32(String descFlexFieldPubDescSeg32) {
		this.descFlexFieldPubDescSeg32 = descFlexFieldPubDescSeg32;
	}

	public String getDescFlexFieldPubDescSeg33() {
		return descFlexFieldPubDescSeg33;
	}

	public void setDescFlexFieldPubDescSeg33(String descFlexFieldPubDescSeg33) {
		this.descFlexFieldPubDescSeg33 = descFlexFieldPubDescSeg33;
	}

	public String getDescFlexFieldPubDescSeg34() {
		return descFlexFieldPubDescSeg34;
	}

	public void setDescFlexFieldPubDescSeg34(String descFlexFieldPubDescSeg34) {
		this.descFlexFieldPubDescSeg34 = descFlexFieldPubDescSeg34;
	}

	public String getDescFlexFieldPubDescSeg35() {
		return descFlexFieldPubDescSeg35;
	}

	public void setDescFlexFieldPubDescSeg35(String descFlexFieldPubDescSeg35) {
		this.descFlexFieldPubDescSeg35 = descFlexFieldPubDescSeg35;
	}

	public String getDescFlexFieldPubDescSeg36() {
		return descFlexFieldPubDescSeg36;
	}

	public void setDescFlexFieldPubDescSeg36(String descFlexFieldPubDescSeg36) {
		this.descFlexFieldPubDescSeg36 = descFlexFieldPubDescSeg36;
	}

	public String getDescFlexFieldPubDescSeg37() {
		return descFlexFieldPubDescSeg37;
	}

	public void setDescFlexFieldPubDescSeg37(String descFlexFieldPubDescSeg37) {
		this.descFlexFieldPubDescSeg37 = descFlexFieldPubDescSeg37;
	}

	public String getDescFlexFieldPubDescSeg38() {
		return descFlexFieldPubDescSeg38;
	}

	public void setDescFlexFieldPubDescSeg38(String descFlexFieldPubDescSeg38) {
		this.descFlexFieldPubDescSeg38 = descFlexFieldPubDescSeg38;
	}

	public String getDescFlexFieldPubDescSeg39() {
		return descFlexFieldPubDescSeg39;
	}

	public void setDescFlexFieldPubDescSeg39(String descFlexFieldPubDescSeg39) {
		this.descFlexFieldPubDescSeg39 = descFlexFieldPubDescSeg39;
	}

	public String getDescFlexFieldPubDescSeg40() {
		return descFlexFieldPubDescSeg40;
	}

	public void setDescFlexFieldPubDescSeg40(String descFlexFieldPubDescSeg40) {
		this.descFlexFieldPubDescSeg40 = descFlexFieldPubDescSeg40;
	}

	public String getDescFlexFieldPubDescSeg41() {
		return descFlexFieldPubDescSeg41;
	}

	public void setDescFlexFieldPubDescSeg41(String descFlexFieldPubDescSeg41) {
		this.descFlexFieldPubDescSeg41 = descFlexFieldPubDescSeg41;
	}

	public String getDescFlexFieldPubDescSeg42() {
		return descFlexFieldPubDescSeg42;
	}

	public void setDescFlexFieldPubDescSeg42(String descFlexFieldPubDescSeg42) {
		this.descFlexFieldPubDescSeg42 = descFlexFieldPubDescSeg42;
	}

	public String getDescFlexFieldPubDescSeg43() {
		return descFlexFieldPubDescSeg43;
	}

	public void setDescFlexFieldPubDescSeg43(String descFlexFieldPubDescSeg43) {
		this.descFlexFieldPubDescSeg43 = descFlexFieldPubDescSeg43;
	}

	public String getDescFlexFieldPubDescSeg44() {
		return descFlexFieldPubDescSeg44;
	}

	public void setDescFlexFieldPubDescSeg44(String descFlexFieldPubDescSeg44) {
		this.descFlexFieldPubDescSeg44 = descFlexFieldPubDescSeg44;
	}

	public String getDescFlexFieldPubDescSeg45() {
		return descFlexFieldPubDescSeg45;
	}

	public void setDescFlexFieldPubDescSeg45(String descFlexFieldPubDescSeg45) {
		this.descFlexFieldPubDescSeg45 = descFlexFieldPubDescSeg45;
	}

	public String getDescFlexFieldPubDescSeg46() {
		return descFlexFieldPubDescSeg46;
	}

	public void setDescFlexFieldPubDescSeg46(String descFlexFieldPubDescSeg46) {
		this.descFlexFieldPubDescSeg46 = descFlexFieldPubDescSeg46;
	}

	public String getDescFlexFieldPubDescSeg47() {
		return descFlexFieldPubDescSeg47;
	}

	public void setDescFlexFieldPubDescSeg47(String descFlexFieldPubDescSeg47) {
		this.descFlexFieldPubDescSeg47 = descFlexFieldPubDescSeg47;
	}

	public String getDescFlexFieldPubDescSeg48() {
		return descFlexFieldPubDescSeg48;
	}

	public void setDescFlexFieldPubDescSeg48(String descFlexFieldPubDescSeg48) {
		this.descFlexFieldPubDescSeg48 = descFlexFieldPubDescSeg48;
	}

	public String getDescFlexFieldPubDescSeg49() {
		return descFlexFieldPubDescSeg49;
	}

	public void setDescFlexFieldPubDescSeg49(String descFlexFieldPubDescSeg49) {
		this.descFlexFieldPubDescSeg49 = descFlexFieldPubDescSeg49;
	}

	public String getDescFlexFieldPubDescSeg50() {
		return descFlexFieldPubDescSeg50;
	}

	public void setDescFlexFieldPubDescSeg50(String descFlexFieldPubDescSeg50) {
		this.descFlexFieldPubDescSeg50 = descFlexFieldPubDescSeg50;
	}

	public String getDescFlexField_ContextValue() {
		return DescFlexField_ContextValue;
	}

	public void setDescFlexField_ContextValue(String descFlexField_ContextValue) {
		DescFlexField_ContextValue = descFlexField_ContextValue;
	}

	public String getDescFlexFieldPrivateDescSeg1() {
		return descFlexFieldPrivateDescSeg1;
	}

	public void setDescFlexFieldPrivateDescSeg1(String descFlexFieldPrivateDescSeg1) {
		this.descFlexFieldPrivateDescSeg1 = descFlexFieldPrivateDescSeg1;
	}

	public String getDescFlexFieldPrivateDescSeg2() {
		return descFlexFieldPrivateDescSeg2;
	}

	public void setDescFlexFieldPrivateDescSeg2(String descFlexFieldPrivateDescSeg2) {
		this.descFlexFieldPrivateDescSeg2 = descFlexFieldPrivateDescSeg2;
	}

	public String getDescFlexFieldPrivateDescSeg3() {
		return descFlexFieldPrivateDescSeg3;
	}

	public void setDescFlexFieldPrivateDescSeg3(String descFlexFieldPrivateDescSeg3) {
		this.descFlexFieldPrivateDescSeg3 = descFlexFieldPrivateDescSeg3;
	}

	public String getDescFlexFieldPrivateDescSeg4() {
		return descFlexFieldPrivateDescSeg4;
	}

	public void setDescFlexFieldPrivateDescSeg4(String descFlexFieldPrivateDescSeg4) {
		this.descFlexFieldPrivateDescSeg4 = descFlexFieldPrivateDescSeg4;
	}

	public String getDescFlexFieldPrivateDescSeg5() {
		return descFlexFieldPrivateDescSeg5;
	}

	public void setDescFlexFieldPrivateDescSeg5(String descFlexFieldPrivateDescSeg5) {
		this.descFlexFieldPrivateDescSeg5 = descFlexFieldPrivateDescSeg5;
	}

	public String getDescFlexFieldPrivateDescSeg6() {
		return descFlexFieldPrivateDescSeg6;
	}

	public void setDescFlexFieldPrivateDescSeg6(String descFlexFieldPrivateDescSeg6) {
		this.descFlexFieldPrivateDescSeg6 = descFlexFieldPrivateDescSeg6;
	}

	public String getDescFlexFieldPrivateDescSeg7() {
		return descFlexFieldPrivateDescSeg7;
	}

	public void setDescFlexFieldPrivateDescSeg7(String descFlexFieldPrivateDescSeg7) {
		this.descFlexFieldPrivateDescSeg7 = descFlexFieldPrivateDescSeg7;
	}

	public String getDescFlexFieldPrivateDescSeg8() {
		return descFlexFieldPrivateDescSeg8;
	}

	public void setDescFlexFieldPrivateDescSeg8(String descFlexFieldPrivateDescSeg8) {
		this.descFlexFieldPrivateDescSeg8 = descFlexFieldPrivateDescSeg8;
	}

	public String getDescFlexFieldPrivateDescSeg9() {
		return descFlexFieldPrivateDescSeg9;
	}

	public void setDescFlexFieldPrivateDescSeg9(String descFlexFieldPrivateDescSeg9) {
		this.descFlexFieldPrivateDescSeg9 = descFlexFieldPrivateDescSeg9;
	}

	public String getDescFlexFieldPrivateDescSeg10() {
		return descFlexFieldPrivateDescSeg10;
	}

	public void setDescFlexFieldPrivateDescSeg10(String descFlexFieldPrivateDescSeg10) {
		this.descFlexFieldPrivateDescSeg10 = descFlexFieldPrivateDescSeg10;
	}

	public String getDescFlexFieldPrivateDescSeg11() {
		return descFlexFieldPrivateDescSeg11;
	}

	public void setDescFlexFieldPrivateDescSeg11(String descFlexFieldPrivateDescSeg11) {
		this.descFlexFieldPrivateDescSeg11 = descFlexFieldPrivateDescSeg11;
	}

	public String getDescFlexFieldPrivateDescSeg12() {
		return descFlexFieldPrivateDescSeg12;
	}

	public void setDescFlexFieldPrivateDescSeg12(String descFlexFieldPrivateDescSeg12) {
		this.descFlexFieldPrivateDescSeg12 = descFlexFieldPrivateDescSeg12;
	}

	public String getDescFlexFieldPrivateDescSeg13() {
		return descFlexFieldPrivateDescSeg13;
	}

	public void setDescFlexFieldPrivateDescSeg13(String descFlexFieldPrivateDescSeg13) {
		this.descFlexFieldPrivateDescSeg13 = descFlexFieldPrivateDescSeg13;
	}

	public String getDescFlexFieldPrivateDescSeg14() {
		return descFlexFieldPrivateDescSeg14;
	}

	public void setDescFlexFieldPrivateDescSeg14(String descFlexFieldPrivateDescSeg14) {
		this.descFlexFieldPrivateDescSeg14 = descFlexFieldPrivateDescSeg14;
	}

	public String getDescFlexFieldPrivateDescSeg15() {
		return descFlexFieldPrivateDescSeg15;
	}

	public void setDescFlexFieldPrivateDescSeg15(String descFlexFieldPrivateDescSeg15) {
		this.descFlexFieldPrivateDescSeg15 = descFlexFieldPrivateDescSeg15;
	}

	public String getDescFlexFieldPrivateDescSeg16() {
		return descFlexFieldPrivateDescSeg16;
	}

	public void setDescFlexFieldPrivateDescSeg16(String descFlexFieldPrivateDescSeg16) {
		this.descFlexFieldPrivateDescSeg16 = descFlexFieldPrivateDescSeg16;
	}

	public String getDescFlexFieldPrivateDescSeg17() {
		return descFlexFieldPrivateDescSeg17;
	}

	public void setDescFlexFieldPrivateDescSeg17(String descFlexFieldPrivateDescSeg17) {
		this.descFlexFieldPrivateDescSeg17 = descFlexFieldPrivateDescSeg17;
	}

	public String getDescFlexFieldPrivateDescSeg18() {
		return descFlexFieldPrivateDescSeg18;
	}

	public void setDescFlexFieldPrivateDescSeg18(String descFlexFieldPrivateDescSeg18) {
		this.descFlexFieldPrivateDescSeg18 = descFlexFieldPrivateDescSeg18;
	}

	public String getDescFlexFieldPrivateDescSeg19() {
		return descFlexFieldPrivateDescSeg19;
	}

	public void setDescFlexFieldPrivateDescSeg19(String descFlexFieldPrivateDescSeg19) {
		this.descFlexFieldPrivateDescSeg19 = descFlexFieldPrivateDescSeg19;
	}

	public String getDescFlexFieldPrivateDescSeg20() {
		return descFlexFieldPrivateDescSeg20;
	}

	public void setDescFlexFieldPrivateDescSeg20(String descFlexFieldPrivateDescSeg20) {
		this.descFlexFieldPrivateDescSeg20 = descFlexFieldPrivateDescSeg20;
	}

	public String getDescFlexFieldPrivateDescSeg21() {
		return descFlexFieldPrivateDescSeg21;
	}

	public void setDescFlexFieldPrivateDescSeg21(String descFlexFieldPrivateDescSeg21) {
		this.descFlexFieldPrivateDescSeg21 = descFlexFieldPrivateDescSeg21;
	}

	public String getDescFlexFieldPrivateDescSeg22() {
		return descFlexFieldPrivateDescSeg22;
	}

	public void setDescFlexFieldPrivateDescSeg22(String descFlexFieldPrivateDescSeg22) {
		this.descFlexFieldPrivateDescSeg22 = descFlexFieldPrivateDescSeg22;
	}

	public String getDescFlexFieldPrivateDescSeg23() {
		return descFlexFieldPrivateDescSeg23;
	}

	public void setDescFlexFieldPrivateDescSeg23(String descFlexFieldPrivateDescSeg23) {
		this.descFlexFieldPrivateDescSeg23 = descFlexFieldPrivateDescSeg23;
	}

	public String getDescFlexFieldPrivateDescSeg24() {
		return descFlexFieldPrivateDescSeg24;
	}

	public void setDescFlexFieldPrivateDescSeg24(String descFlexFieldPrivateDescSeg24) {
		this.descFlexFieldPrivateDescSeg24 = descFlexFieldPrivateDescSeg24;
	}

	public String getDescFlexFieldPrivateDescSeg25() {
		return descFlexFieldPrivateDescSeg25;
	}

	public void setDescFlexFieldPrivateDescSeg25(String descFlexFieldPrivateDescSeg25) {
		this.descFlexFieldPrivateDescSeg25 = descFlexFieldPrivateDescSeg25;
	}

	public String getDescFlexFieldPrivateDescSeg26() {
		return descFlexFieldPrivateDescSeg26;
	}

	public void setDescFlexFieldPrivateDescSeg26(String descFlexFieldPrivateDescSeg26) {
		this.descFlexFieldPrivateDescSeg26 = descFlexFieldPrivateDescSeg26;
	}

	public String getDescFlexFieldPrivateDescSeg27() {
		return descFlexFieldPrivateDescSeg27;
	}

	public void setDescFlexFieldPrivateDescSeg27(String descFlexFieldPrivateDescSeg27) {
		this.descFlexFieldPrivateDescSeg27 = descFlexFieldPrivateDescSeg27;
	}

	public String getDescFlexFieldPrivateDescSeg28() {
		return descFlexFieldPrivateDescSeg28;
	}

	public void setDescFlexFieldPrivateDescSeg28(String descFlexFieldPrivateDescSeg28) {
		this.descFlexFieldPrivateDescSeg28 = descFlexFieldPrivateDescSeg28;
	}

	public String getDescFlexFieldPrivateDescSeg29() {
		return descFlexFieldPrivateDescSeg29;
	}

	public void setDescFlexFieldPrivateDescSeg29(String descFlexFieldPrivateDescSeg29) {
		this.descFlexFieldPrivateDescSeg29 = descFlexFieldPrivateDescSeg29;
	}

	public String getDescFlexFieldPrivateDescSeg30() {
		return descFlexFieldPrivateDescSeg30;
	}

	public void setDescFlexFieldPrivateDescSeg30(String descFlexFieldPrivateDescSeg30) {
		this.descFlexFieldPrivateDescSeg30 = descFlexFieldPrivateDescSeg30;
	}

	public String getCancelCancelDate() {
		return cancelCancelDate;
	}

	public void setCancelCancelDate(String cancelCancelDate) {
		this.cancelCancelDate = cancelCancelDate;
	}

	public Integer getCancelCanceled() {
		return cancelCanceled;
	}

	public void setCancelCanceled(Integer cancelCanceled) {
		this.cancelCanceled = cancelCanceled;
	}

	public String getCancelCancelUser() {
		return cancelCancelUser;
	}

	public void setCancelCancelUser(String cancelCancelUser) {
		this.cancelCancelUser = cancelCancelUser;
	}

	public String getCancelCancelReason() {
		return cancelCancelReason;
	}

	public void setCancelCancelReason(String cancelCancelReason) {
		this.cancelCancelReason = cancelCancelReason;
	}

	public String getHoldReason() {
		return holdReason;
	}

	public void setHoldReason(String holdReason) {
		this.holdReason = holdReason;
	}

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getBusinessDate() {
		return businessDate;
	}

	public void setBusinessDate(String businessDate) {
		this.businessDate = businessDate;
	}

	public String getSourceTypeSrcDocType() {
		return sourceTypeSrcDocType;
	}

	public void setSourceTypeSrcDocType(String sourceTypeSrcDocType) {
		this.sourceTypeSrcDocType = sourceTypeSrcDocType;
	}

	public String getSourceTypeSrcDocID() {
		return sourceTypeSrcDocID;
	}

	public void setSourceTypeSrcDocID(String sourceTypeSrcDocID) {
		this.sourceTypeSrcDocID = sourceTypeSrcDocID;
	}

	public String getSourceTypeSrcDocLineID() {
		return sourceTypeSrcDocLineID;
	}

	public void setSourceTypeSrcDocLineID(String sourceTypeSrcDocLineID) {
		this.sourceTypeSrcDocLineID = sourceTypeSrcDocLineID;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
