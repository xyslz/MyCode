package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;

/**
 * Title: 工序 Description: <br>
 * 
 * @author 杨雪景
 * @date 2019年4月11日
 */
@Table(name = "BD_Operation")
public class Operation extends BaseTable {

	private static final long serialVersionUID = 8238563464084911237L;

	@Column(name = "ID")
	private String id;

	/**
	 * 更改类型
	 */
	@Column(name = "ACDType")
	private Integer acdType;

	/**
	 * 完工时间单位
	 */
	@Column(name = "CapacityTimeUOM")
	private String capacityTimeUOM;

	/**
	 * 开工时间单位
	 */
	@Column(name = "CapStartTimeUOM")
	private String capStartTimeUOM;

	private String moDocNo;
	
	/**
	 * 变动完工时间
	 */
	@Column(name = "ChangeComTime")
	private Double changeComTime;

	/**
	 * 变动开工时间
	 */
	@Column(name = "ChangeStartTime")
	private Double changeStartTime;

	/**
	 * 完工时间计算方式
	 */
	@Column(name = "CompleteTimeCalcMode")
	private Integer completeTimeCalcMode;

	/**
	 * 完工时间底数
	 */
	@Column(name = "ComTimeNum")
	private Double comTimeNum;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedOn", sort = Sort.DESC)
	private String createdOn;

	/**
	 * 累计工序产出率
	 */
	@Column(name = "CumYield")
	private Double cumYield;

	@Column(name = "DescFlexField_ContextValue")
	private String descFlexField_ContextValue;

	@Column(name = "DescFlexField_PrivateDescSeg1")
	private String descFlexField_PrivateDescSeg1;

	@Column(name = "DescFlexField_PrivateDescSeg10")
	private String descFlexField_PrivateDescSeg10;

	@Column(name = "DescFlexField_PrivateDescSeg11")
	private String descFlexField_PrivateDescSeg11;

	@Column(name = "DescFlexField_PrivateDescSeg12")
	private String descFlexField_PrivateDescSeg12;

	@Column(name = "DescFlexField_PrivateDescSeg13")
	private String descFlexField_PrivateDescSeg13;

	@Column(name = "DescFlexField_PrivateDescSeg14")
	private String descFlexField_PrivateDescSeg14;

	@Column(name = "DescFlexField_PrivateDescSeg15")
	private String descFlexField_PrivateDescSeg15;

	@Column(name = "DescFlexField_PrivateDescSeg16")
	private String descFlexField_PrivateDescSeg16;

	@Column(name = "DescFlexField_PrivateDescSeg17")
	private String descFlexField_PrivateDescSeg17;

	@Column(name = "DescFlexField_PrivateDescSeg18")
	private String descFlexField_PrivateDescSeg18;

	@Column(name = "DescFlexField_PrivateDescSeg19")
	private String descFlexField_PrivateDescSeg19;

	@Column(name = "DescFlexField_PrivateDescSeg2")
	private String descFlexField_PrivateDescSeg2;

	@Column(name = "DescFlexField_PrivateDescSeg20")
	private String descFlexField_PrivateDescSeg20;

	@Column(name = "DescFlexField_PrivateDescSeg21")
	private String descFlexField_PrivateDescSeg21;

	@Column(name = "DescFlexField_PrivateDescSeg22")
	private String descFlexField_PrivateDescSeg22;

	@Column(name = "DescFlexField_PrivateDescSeg23")
	private String descFlexField_PrivateDescSeg23;

	@Column(name = "DescFlexField_PrivateDescSeg24")
	private String descFlexField_PrivateDescSeg24;

	@Column(name = "DescFlexField_PrivateDescSeg25")
	private String descFlexField_PrivateDescSeg25;

	@Column(name = "DescFlexField_PrivateDescSeg26")
	private String descFlexField_PrivateDescSeg26;

	@Column(name = "DescFlexField_PrivateDescSeg27")
	private String descFlexField_PrivateDescSeg27;

	@Column(name = "DescFlexField_PrivateDescSeg28")
	private String descFlexField_PrivateDescSeg28;

	@Column(name = "DescFlexField_PrivateDescSeg29")
	private String descFlexField_PrivateDescSeg29;

	@Column(name = "DescFlexField_PrivateDescSeg3")
	private String descFlexField_PrivateDescSeg3;

	@Column(name = "DescFlexField_PrivateDescSeg30")
	private String descFlexField_PrivateDescSeg30;

	@Column(name = "DescFlexField_PrivateDescSeg4")
	private String descFlexField_PrivateDescSeg4;

	@Column(name = "DescFlexField_PrivateDescSeg5")
	private String descFlexField_PrivateDescSeg5;

	@Column(name = "DescFlexField_PrivateDescSeg6")
	private String descFlexField_PrivateDescSeg6;

	@Column(name = "DescFlexField_PrivateDescSeg7")
	private String descFlexField_PrivateDescSeg7;

	@Column(name = "DescFlexField_PrivateDescSeg8")
	private String descFlexField_PrivateDescSeg8;

	@Column(name = "DescFlexField_PrivateDescSeg9")
	private String descFlexField_PrivateDescSeg9;

	@Column(name = "DescFlexField_PubDescSeg1")
	private String descFlexField_PubDescSeg1;

	@Column(name = "DescFlexField_PubDescSeg10")
	private String descFlexField_PubDescSeg10;

	@Column(name = "DescFlexField_PubDescSeg11")
	private String descFlexField_PubDescSeg11;

	@Column(name = "DescFlexField_PubDescSeg12")
	private String descFlexField_PubDescSeg12;

	@Column(name = "DescFlexField_PubDescSeg13")
	private String descFlexField_PubDescSeg13;

	@Column(name = "DescFlexField_PubDescSeg14")
	private String descFlexField_PubDescSeg14;

	@Column(name = "DescFlexField_PubDescSeg15")
	private String descFlexField_PubDescSeg15;

	@Column(name = "DescFlexField_PubDescSeg16")
	private String descFlexField_PubDescSeg16;

	@Column(name = "DescFlexField_PubDescSeg17")
	private String descFlexField_PubDescSeg17;

	@Column(name = "DescFlexField_PubDescSeg18")
	private String descFlexField_PubDescSeg18;

	@Column(name = "DescFlexField_PubDescSeg19")
	private String descFlexField_PubDescSeg19;

	@Column(name = "DescFlexField_PubDescSeg2")
	private String descFlexField_PubDescSeg2;

	@Column(name = "DescFlexField_PubDescSeg20")
	private String descFlexField_PubDescSeg20;

	@Column(name = "DescFlexField_PubDescSeg21")
	private String descFlexField_PubDescSeg21;

	@Column(name = "DescFlexField_PubDescSeg22")
	private String descFlexField_PubDescSeg22;

	@Column(name = "DescFlexField_PubDescSeg23")
	private String descFlexField_PubDescSeg23;

	@Column(name = "DescFlexField_PubDescSeg24")
	private String descFlexField_PubDescSeg24;

	@Column(name = "DescFlexField_PubDescSeg25")
	private String descFlexField_PubDescSeg25;

	@Column(name = "DescFlexField_PubDescSeg26")
	private String descFlexField_PubDescSeg26;

	@Column(name = "DescFlexField_PubDescSeg27")
	private String descFlexField_PubDescSeg27;

	@Column(name = "DescFlexField_PubDescSeg28")
	private String descFlexField_PubDescSeg28;

	@Column(name = "DescFlexField_PubDescSeg29")
	private String descFlexField_PubDescSeg29;

	@Column(name = "DescFlexField_PubDescSeg3")
	private String descFlexField_PubDescSeg3;

	@Column(name = "DescFlexField_PubDescSeg30")
	private String descFlexField_PubDescSeg30;

	@Column(name = "DescFlexField_PubDescSeg31")
	private String descFlexField_PubDescSeg31;

	@Column(name = "DescFlexField_PubDescSeg32")
	private String descFlexField_PubDescSeg32;

	@Column(name = "DescFlexField_PubDescSeg33")
	private String descFlexField_PubDescSeg33;

	@Column(name = "DescFlexField_PubDescSeg34")
	private String descFlexField_PubDescSeg34;

	@Column(name = "DescFlexField_PubDescSeg35")
	private String descFlexField_PubDescSeg35;

	@Column(name = "DescFlexField_PubDescSeg36")
	private String descFlexField_PubDescSeg36;

	@Column(name = "DescFlexField_PubDescSeg37")
	private String descFlexField_PubDescSeg37;

	@Column(name = "DescFlexField_PubDescSeg38")
	private String descFlexField_PubDescSeg38;

	@Column(name = "DescFlexField_PubDescSeg39")
	private String descFlexField_PubDescSeg39;

	@Column(name = "DescFlexField_PubDescSeg4")
	private String descFlexField_PubDescSeg4;

	@Column(name = "DescFlexField_PubDescSeg40")
	private String descFlexField_PubDescSeg40;

	@Column(name = "DescFlexField_PubDescSeg41")
	private String descFlexField_PubDescSeg41;

	@Column(name = "DescFlexField_PubDescSeg42")
	private String descFlexField_PubDescSeg42;

	@Column(name = "DescFlexField_PubDescSeg43")
	private String descFlexField_PubDescSeg43;

	@Column(name = "DescFlexField_PubDescSeg44")
	private String descFlexField_PubDescSeg44;

	@Column(name = "DescFlexField_PubDescSeg45")
	private String descFlexField_PubDescSeg45;

	@Column(name = "DescFlexField_PubDescSeg46")
	private String descFlexField_PubDescSeg46;

	@Column(name = "DescFlexField_PubDescSeg47")
	private String descFlexField_PubDescSeg47;

	@Column(name = "DescFlexField_PubDescSeg48")
	private String descFlexField_PubDescSeg48;

	@Column(name = "DescFlexField_PubDescSeg49")
	private String descFlexField_PubDescSeg49;

	@Column(name = "DescFlexField_PubDescSeg5")
	private String descFlexField_PubDescSeg5;

	@Column(name = "DescFlexField_PubDescSeg50")
	private String descFlexField_PubDescSeg50;

	@Column(name = "DescFlexField_PubDescSeg6")
	private String descFlexField_PubDescSeg6;

	@Column(name = "DescFlexField_PubDescSeg7")
	private String descFlexField_PubDescSeg7;

	@Column(name = "DescFlexField_PubDescSeg8")
	private String descFlexField_PubDescSeg8;

	@Column(name = "DescFlexField_PubDescSeg9")
	private String descFlexField_PubDescSeg9;

	@Column(name = "Dr")
	private Integer dr;

	@Column(name = "ECNCode")
	private String eCNCode;

	@Column(name = "ECNEntity_EntityID")
	private String eCNEntity_EntityID;

	@Column(name = "ECNEntity_EntityType")
	private String eCNEntity_EntityType;

	@Column(name = "eCNExecuteDate")
	private String ECNExecuteDate;

	/**
	 * 固定完工时间
	 */
	@Column(name = "FixedComTime")
	private Double fixedComTime;

	/**
	 * 固定开工时间
	 */
	@Column(name = "FixedStartTime")
	private Double fixedStartTime;

	/**
	 * 检验方案
	 */
	@Column(name = "InspectScheme")
	private String inspectScheme;

	@Column(name = "InspectSchemeVersion")
	private String inspectSchemeVersion;

	@Column(name = "IsAllowUncontinueRun")
	private Integer isAllowUncontinueRun;

	@Column(name = "IsAutoCharge")
	private Integer isAutoCharge;

	@Column(name = "IsBackLabor")
	private Integer isBackLabor;

	@Column(name = "IsBackMachine")
	private Integer isBackMachine;

	@Column(name = "IsBackMaterial")
	private Integer isBackMaterial;

	@Column(name = "IsBackOthers")
	private Integer isBackOthers;

	@Column(name = "IsContinuousDispatch")
	private Integer isContinuousDispatch;

	@Column(name = "IsCountPoint")
	private Integer isCountPoint;

	@Column(name = "IsInspect")
	private Integer isInspect;

	@Column(name = "IsInspectPoint")
	private Integer isInspectPoint;

	@Column(name = "IsNeckOper")
	private Integer isNeckOper;

	@Column(name = "IsPrintSeqTransferDoc")
	private Integer isPrintSeqTransferDoc;

	@Column(name = "IsRcvDirectly")
	private Integer isRcvDirectly;

	@Column(name = "IsRollupCost")
	private Integer isRollupCost;

	@Column(name = "IsSubcontract")
	private Integer isSubcontract;

	@Column(name = "IsSubcOperation")
	private Integer isSubcOperation;

	@Column(name = "IssueBin")
	private String issueBin;

	@Column(name = "IssueWareHouse")
	private String issueWareHouse;

	@Column(name = "IsSyncSubc")
	private Integer isSyncSubc;

	@Column(name = "IsTraceLotSn")
	private Integer isTraceLotSn;

	@Column(name = "IsTraceSerialNo")
	private Integer isTraceSerialNo;

	@Column(name = "MaxTransferTime")
	private Double maxTransferTime;

	@Column(name = "MinRunLot")
	private Integer minRunLot;

	@Column(name = "MinTransferTime")
	private Double minTransferTime;

	@Column(name = "MinTransQty")
	private Double minTransQty;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

	@Column(name = "NextSequence")
	private String nextSequence;

	@Column(name = "OffSetPercent")
	private Double offSetPercent;

	@Column(name = "Org")
	private String org;

	/**
	 * 工序产出副单位
	 */
	@Column(name = "OutputBaseUOM")
	private String outputBaseUOM;

	/**
	 * 工序产出单位
	 */
	@Column(name = "OutputUOM")
	private String outputUOM;
	
	@Column(name = "outputUOMName")
	@Relation(table = "BD_UOM", value = "id", ref = "outputUOM", show = "name")
	private String outputUOMName;

	@Column(name = "OutputUOMRatio2Base")
	private Double outputUOMRatio2Base;

	@Column(name = "OutputUOMRatio2PU")
	private Double outputUOMRatio2PU;

	@Column(name = "OverlapRate")
	private Double overlapRate;

	@Column(name = "OverlapSequence")
	private String overlapSequence;

	@Column(name = "OverlapTyp")
	private Integer overlapTyp;

	@Column(name = "PLMID")
	private String plmid;

	@Column(name = "Position")
	private String position;

	@Column(name = "PreSeqMaxTransferTime")
	private Double preSeqMaxTransferTime;

	@Column(name = "PreSeqMinTransferTime")
	private Double preSeqMinTransferTime;

	@Column(name = "PreSequence")
	private String preSequence;

	@Column(name = "RcvBin")
	private String rcvBin;

	@Column(name = "RcvWareHouse")
	private String rcvWareHouse;

	@Column(name = "Routing")
	private String routing;

	@Column(name = "RunTime")
	private Double runTime;

	@Column(name = "Sequence")
	private String sequence;

	@Column(name = "SetupTime")
	private Double setupTime;

	@Column(name = "ShiftGroup")
	private String shiftGroup;

	@Column(name = "SplitMerge")
	private Integer splitMerge;

	@Column(name = "SrcRowID")
	private String srcRowID;

	@Column(name = "StartInWholeSet")
	private Integer startInWholeSet;

	@Column(name = "StartTimeNum")
	private Double startTimeNum;

	@Column(name = "StdOperation")
	private String stdOperation;

	@Column(name = "SubcontractItemMaster")
	private String subcontractItemMaster;

	@Column(name = "SyncMemo")
	private String syncMemo;

	@Column(name = "SyncSource")
	private String syncSource;

	@Column(name = "SyncSourceID")
	private String syncSourceID;

	@Column(name = "SyncTs")
	private String syncTs;

	@Column(name = "SysVersion")
	private String sysVersion;

	@Column(name = "TimeUOM")
	private String timeUOM;

	@Column(name = "Ts")
	private String ts;

	@Column(name = "WorkCenter")
	private String workCenter;

	@Column(name = "Yield")
	private Double yield;

	@Column(name = "Description")
	private String description;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAcdType() {
		return acdType;
	}

	public void setAcdType(Integer acdType) {
		this.acdType = acdType;
	}

	public String getCapacityTimeUOM() {
		return capacityTimeUOM;
	}

	public void setCapacityTimeUOM(String capacityTimeUOM) {
		this.capacityTimeUOM = capacityTimeUOM;
	}

	public String getCapStartTimeUOM() {
		return capStartTimeUOM;
	}

	public void setCapStartTimeUOM(String capStartTimeUOM) {
		this.capStartTimeUOM = capStartTimeUOM;
	}

	public Double getChangeComTime() {
		return changeComTime;
	}

	public void setChangeComTime(Double changeComTime) {
		this.changeComTime = changeComTime;
	}

	public Double getChangeStartTime() {
		return changeStartTime;
	}

	public void setChangeStartTime(Double changeStartTime) {
		this.changeStartTime = changeStartTime;
	}

	public Integer getCompleteTimeCalcMode() {
		return completeTimeCalcMode;
	}

	public void setCompleteTimeCalcMode(Integer completeTimeCalcMode) {
		this.completeTimeCalcMode = completeTimeCalcMode;
	}

	public Double getComTimeNum() {
		return comTimeNum;
	}

	public void setComTimeNum(Double comTimeNum) {
		this.comTimeNum = comTimeNum;
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

	public Double getCumYield() {
		return cumYield;
	}

	public void setCumYield(Double cumYield) {
		this.cumYield = cumYield;
	}

	public String getDescFlexField_ContextValue() {
		return descFlexField_ContextValue;
	}

	public void setDescFlexField_ContextValue(String descFlexField_ContextValue) {
		this.descFlexField_ContextValue = descFlexField_ContextValue;
	}

	public String getDescFlexField_PrivateDescSeg1() {
		return descFlexField_PrivateDescSeg1;
	}

	public void setDescFlexField_PrivateDescSeg1(String descFlexField_PrivateDescSeg1) {
		this.descFlexField_PrivateDescSeg1 = descFlexField_PrivateDescSeg1;
	}

	public String getDescFlexField_PrivateDescSeg10() {
		return descFlexField_PrivateDescSeg10;
	}

	public void setDescFlexField_PrivateDescSeg10(String descFlexField_PrivateDescSeg10) {
		this.descFlexField_PrivateDescSeg10 = descFlexField_PrivateDescSeg10;
	}

	public String getDescFlexField_PrivateDescSeg11() {
		return descFlexField_PrivateDescSeg11;
	}

	public void setDescFlexField_PrivateDescSeg11(String descFlexField_PrivateDescSeg11) {
		this.descFlexField_PrivateDescSeg11 = descFlexField_PrivateDescSeg11;
	}

	public String getDescFlexField_PrivateDescSeg12() {
		return descFlexField_PrivateDescSeg12;
	}

	public void setDescFlexField_PrivateDescSeg12(String descFlexField_PrivateDescSeg12) {
		this.descFlexField_PrivateDescSeg12 = descFlexField_PrivateDescSeg12;
	}

	public String getDescFlexField_PrivateDescSeg13() {
		return descFlexField_PrivateDescSeg13;
	}

	public void setDescFlexField_PrivateDescSeg13(String descFlexField_PrivateDescSeg13) {
		this.descFlexField_PrivateDescSeg13 = descFlexField_PrivateDescSeg13;
	}

	public String getDescFlexField_PrivateDescSeg14() {
		return descFlexField_PrivateDescSeg14;
	}

	public void setDescFlexField_PrivateDescSeg14(String descFlexField_PrivateDescSeg14) {
		this.descFlexField_PrivateDescSeg14 = descFlexField_PrivateDescSeg14;
	}

	public String getDescFlexField_PrivateDescSeg15() {
		return descFlexField_PrivateDescSeg15;
	}

	public void setDescFlexField_PrivateDescSeg15(String descFlexField_PrivateDescSeg15) {
		this.descFlexField_PrivateDescSeg15 = descFlexField_PrivateDescSeg15;
	}

	public String getDescFlexField_PrivateDescSeg16() {
		return descFlexField_PrivateDescSeg16;
	}

	public void setDescFlexField_PrivateDescSeg16(String descFlexField_PrivateDescSeg16) {
		this.descFlexField_PrivateDescSeg16 = descFlexField_PrivateDescSeg16;
	}

	public String getDescFlexField_PrivateDescSeg17() {
		return descFlexField_PrivateDescSeg17;
	}

	public void setDescFlexField_PrivateDescSeg17(String descFlexField_PrivateDescSeg17) {
		this.descFlexField_PrivateDescSeg17 = descFlexField_PrivateDescSeg17;
	}

	public String getDescFlexField_PrivateDescSeg18() {
		return descFlexField_PrivateDescSeg18;
	}

	public void setDescFlexField_PrivateDescSeg18(String descFlexField_PrivateDescSeg18) {
		this.descFlexField_PrivateDescSeg18 = descFlexField_PrivateDescSeg18;
	}

	public String getDescFlexField_PrivateDescSeg19() {
		return descFlexField_PrivateDescSeg19;
	}

	public void setDescFlexField_PrivateDescSeg19(String descFlexField_PrivateDescSeg19) {
		this.descFlexField_PrivateDescSeg19 = descFlexField_PrivateDescSeg19;
	}

	public String getDescFlexField_PrivateDescSeg2() {
		return descFlexField_PrivateDescSeg2;
	}

	public void setDescFlexField_PrivateDescSeg2(String descFlexField_PrivateDescSeg2) {
		this.descFlexField_PrivateDescSeg2 = descFlexField_PrivateDescSeg2;
	}

	public String getDescFlexField_PrivateDescSeg20() {
		return descFlexField_PrivateDescSeg20;
	}

	public void setDescFlexField_PrivateDescSeg20(String descFlexField_PrivateDescSeg20) {
		this.descFlexField_PrivateDescSeg20 = descFlexField_PrivateDescSeg20;
	}

	public String getDescFlexField_PrivateDescSeg21() {
		return descFlexField_PrivateDescSeg21;
	}

	public void setDescFlexField_PrivateDescSeg21(String descFlexField_PrivateDescSeg21) {
		this.descFlexField_PrivateDescSeg21 = descFlexField_PrivateDescSeg21;
	}

	public String getDescFlexField_PrivateDescSeg22() {
		return descFlexField_PrivateDescSeg22;
	}

	public void setDescFlexField_PrivateDescSeg22(String descFlexField_PrivateDescSeg22) {
		this.descFlexField_PrivateDescSeg22 = descFlexField_PrivateDescSeg22;
	}

	public String getDescFlexField_PrivateDescSeg23() {
		return descFlexField_PrivateDescSeg23;
	}

	public void setDescFlexField_PrivateDescSeg23(String descFlexField_PrivateDescSeg23) {
		this.descFlexField_PrivateDescSeg23 = descFlexField_PrivateDescSeg23;
	}

	public String getDescFlexField_PrivateDescSeg24() {
		return descFlexField_PrivateDescSeg24;
	}

	public void setDescFlexField_PrivateDescSeg24(String descFlexField_PrivateDescSeg24) {
		this.descFlexField_PrivateDescSeg24 = descFlexField_PrivateDescSeg24;
	}

	public String getDescFlexField_PrivateDescSeg25() {
		return descFlexField_PrivateDescSeg25;
	}

	public void setDescFlexField_PrivateDescSeg25(String descFlexField_PrivateDescSeg25) {
		this.descFlexField_PrivateDescSeg25 = descFlexField_PrivateDescSeg25;
	}

	public String getDescFlexField_PrivateDescSeg26() {
		return descFlexField_PrivateDescSeg26;
	}

	public void setDescFlexField_PrivateDescSeg26(String descFlexField_PrivateDescSeg26) {
		this.descFlexField_PrivateDescSeg26 = descFlexField_PrivateDescSeg26;
	}

	public String getDescFlexField_PrivateDescSeg27() {
		return descFlexField_PrivateDescSeg27;
	}

	public void setDescFlexField_PrivateDescSeg27(String descFlexField_PrivateDescSeg27) {
		this.descFlexField_PrivateDescSeg27 = descFlexField_PrivateDescSeg27;
	}

	public String getDescFlexField_PrivateDescSeg28() {
		return descFlexField_PrivateDescSeg28;
	}

	public void setDescFlexField_PrivateDescSeg28(String descFlexField_PrivateDescSeg28) {
		this.descFlexField_PrivateDescSeg28 = descFlexField_PrivateDescSeg28;
	}

	public String getDescFlexField_PrivateDescSeg29() {
		return descFlexField_PrivateDescSeg29;
	}

	public void setDescFlexField_PrivateDescSeg29(String descFlexField_PrivateDescSeg29) {
		this.descFlexField_PrivateDescSeg29 = descFlexField_PrivateDescSeg29;
	}

	public String getDescFlexField_PrivateDescSeg3() {
		return descFlexField_PrivateDescSeg3;
	}

	public void setDescFlexField_PrivateDescSeg3(String descFlexField_PrivateDescSeg3) {
		this.descFlexField_PrivateDescSeg3 = descFlexField_PrivateDescSeg3;
	}

	public String getDescFlexField_PrivateDescSeg30() {
		return descFlexField_PrivateDescSeg30;
	}

	public void setDescFlexField_PrivateDescSeg30(String descFlexField_PrivateDescSeg30) {
		this.descFlexField_PrivateDescSeg30 = descFlexField_PrivateDescSeg30;
	}

	public String getDescFlexField_PrivateDescSeg4() {
		return descFlexField_PrivateDescSeg4;
	}

	public void setDescFlexField_PrivateDescSeg4(String descFlexField_PrivateDescSeg4) {
		this.descFlexField_PrivateDescSeg4 = descFlexField_PrivateDescSeg4;
	}

	public String getDescFlexField_PrivateDescSeg5() {
		return descFlexField_PrivateDescSeg5;
	}

	public void setDescFlexField_PrivateDescSeg5(String descFlexField_PrivateDescSeg5) {
		this.descFlexField_PrivateDescSeg5 = descFlexField_PrivateDescSeg5;
	}

	public String getDescFlexField_PrivateDescSeg6() {
		return descFlexField_PrivateDescSeg6;
	}

	public void setDescFlexField_PrivateDescSeg6(String descFlexField_PrivateDescSeg6) {
		this.descFlexField_PrivateDescSeg6 = descFlexField_PrivateDescSeg6;
	}

	public String getDescFlexField_PrivateDescSeg7() {
		return descFlexField_PrivateDescSeg7;
	}

	public void setDescFlexField_PrivateDescSeg7(String descFlexField_PrivateDescSeg7) {
		this.descFlexField_PrivateDescSeg7 = descFlexField_PrivateDescSeg7;
	}

	public String getDescFlexField_PrivateDescSeg8() {
		return descFlexField_PrivateDescSeg8;
	}

	public void setDescFlexField_PrivateDescSeg8(String descFlexField_PrivateDescSeg8) {
		this.descFlexField_PrivateDescSeg8 = descFlexField_PrivateDescSeg8;
	}

	public String getDescFlexField_PrivateDescSeg9() {
		return descFlexField_PrivateDescSeg9;
	}

	public void setDescFlexField_PrivateDescSeg9(String descFlexField_PrivateDescSeg9) {
		this.descFlexField_PrivateDescSeg9 = descFlexField_PrivateDescSeg9;
	}

	public String getDescFlexField_PubDescSeg1() {
		return descFlexField_PubDescSeg1;
	}

	public void setDescFlexField_PubDescSeg1(String descFlexField_PubDescSeg1) {
		this.descFlexField_PubDescSeg1 = descFlexField_PubDescSeg1;
	}

	public String getDescFlexField_PubDescSeg10() {
		return descFlexField_PubDescSeg10;
	}

	public void setDescFlexField_PubDescSeg10(String descFlexField_PubDescSeg10) {
		this.descFlexField_PubDescSeg10 = descFlexField_PubDescSeg10;
	}

	public String getDescFlexField_PubDescSeg11() {
		return descFlexField_PubDescSeg11;
	}

	public void setDescFlexField_PubDescSeg11(String descFlexField_PubDescSeg11) {
		this.descFlexField_PubDescSeg11 = descFlexField_PubDescSeg11;
	}

	public String getDescFlexField_PubDescSeg12() {
		return descFlexField_PubDescSeg12;
	}

	public void setDescFlexField_PubDescSeg12(String descFlexField_PubDescSeg12) {
		this.descFlexField_PubDescSeg12 = descFlexField_PubDescSeg12;
	}

	public String getDescFlexField_PubDescSeg13() {
		return descFlexField_PubDescSeg13;
	}

	public void setDescFlexField_PubDescSeg13(String descFlexField_PubDescSeg13) {
		this.descFlexField_PubDescSeg13 = descFlexField_PubDescSeg13;
	}

	public String getDescFlexField_PubDescSeg14() {
		return descFlexField_PubDescSeg14;
	}

	public void setDescFlexField_PubDescSeg14(String descFlexField_PubDescSeg14) {
		this.descFlexField_PubDescSeg14 = descFlexField_PubDescSeg14;
	}

	public String getDescFlexField_PubDescSeg15() {
		return descFlexField_PubDescSeg15;
	}

	public void setDescFlexField_PubDescSeg15(String descFlexField_PubDescSeg15) {
		this.descFlexField_PubDescSeg15 = descFlexField_PubDescSeg15;
	}

	public String getDescFlexField_PubDescSeg16() {
		return descFlexField_PubDescSeg16;
	}

	public void setDescFlexField_PubDescSeg16(String descFlexField_PubDescSeg16) {
		this.descFlexField_PubDescSeg16 = descFlexField_PubDescSeg16;
	}

	public String getDescFlexField_PubDescSeg17() {
		return descFlexField_PubDescSeg17;
	}

	public void setDescFlexField_PubDescSeg17(String descFlexField_PubDescSeg17) {
		this.descFlexField_PubDescSeg17 = descFlexField_PubDescSeg17;
	}

	public String getDescFlexField_PubDescSeg18() {
		return descFlexField_PubDescSeg18;
	}

	public void setDescFlexField_PubDescSeg18(String descFlexField_PubDescSeg18) {
		this.descFlexField_PubDescSeg18 = descFlexField_PubDescSeg18;
	}

	public String getDescFlexField_PubDescSeg19() {
		return descFlexField_PubDescSeg19;
	}

	public void setDescFlexField_PubDescSeg19(String descFlexField_PubDescSeg19) {
		this.descFlexField_PubDescSeg19 = descFlexField_PubDescSeg19;
	}

	public String getDescFlexField_PubDescSeg2() {
		return descFlexField_PubDescSeg2;
	}

	public void setDescFlexField_PubDescSeg2(String descFlexField_PubDescSeg2) {
		this.descFlexField_PubDescSeg2 = descFlexField_PubDescSeg2;
	}

	public String getDescFlexField_PubDescSeg20() {
		return descFlexField_PubDescSeg20;
	}

	public void setDescFlexField_PubDescSeg20(String descFlexField_PubDescSeg20) {
		this.descFlexField_PubDescSeg20 = descFlexField_PubDescSeg20;
	}

	public String getDescFlexField_PubDescSeg21() {
		return descFlexField_PubDescSeg21;
	}

	public void setDescFlexField_PubDescSeg21(String descFlexField_PubDescSeg21) {
		this.descFlexField_PubDescSeg21 = descFlexField_PubDescSeg21;
	}

	public String getDescFlexField_PubDescSeg22() {
		return descFlexField_PubDescSeg22;
	}

	public void setDescFlexField_PubDescSeg22(String descFlexField_PubDescSeg22) {
		this.descFlexField_PubDescSeg22 = descFlexField_PubDescSeg22;
	}

	public String getDescFlexField_PubDescSeg23() {
		return descFlexField_PubDescSeg23;
	}

	public void setDescFlexField_PubDescSeg23(String descFlexField_PubDescSeg23) {
		this.descFlexField_PubDescSeg23 = descFlexField_PubDescSeg23;
	}

	public String getDescFlexField_PubDescSeg24() {
		return descFlexField_PubDescSeg24;
	}

	public void setDescFlexField_PubDescSeg24(String descFlexField_PubDescSeg24) {
		this.descFlexField_PubDescSeg24 = descFlexField_PubDescSeg24;
	}

	public String getDescFlexField_PubDescSeg25() {
		return descFlexField_PubDescSeg25;
	}

	public void setDescFlexField_PubDescSeg25(String descFlexField_PubDescSeg25) {
		this.descFlexField_PubDescSeg25 = descFlexField_PubDescSeg25;
	}

	public String getDescFlexField_PubDescSeg26() {
		return descFlexField_PubDescSeg26;
	}

	public void setDescFlexField_PubDescSeg26(String descFlexField_PubDescSeg26) {
		this.descFlexField_PubDescSeg26 = descFlexField_PubDescSeg26;
	}

	public String getDescFlexField_PubDescSeg27() {
		return descFlexField_PubDescSeg27;
	}

	public void setDescFlexField_PubDescSeg27(String descFlexField_PubDescSeg27) {
		this.descFlexField_PubDescSeg27 = descFlexField_PubDescSeg27;
	}

	public String getDescFlexField_PubDescSeg28() {
		return descFlexField_PubDescSeg28;
	}

	public void setDescFlexField_PubDescSeg28(String descFlexField_PubDescSeg28) {
		this.descFlexField_PubDescSeg28 = descFlexField_PubDescSeg28;
	}

	public String getDescFlexField_PubDescSeg29() {
		return descFlexField_PubDescSeg29;
	}

	public void setDescFlexField_PubDescSeg29(String descFlexField_PubDescSeg29) {
		this.descFlexField_PubDescSeg29 = descFlexField_PubDescSeg29;
	}

	public String getDescFlexField_PubDescSeg3() {
		return descFlexField_PubDescSeg3;
	}

	public void setDescFlexField_PubDescSeg3(String descFlexField_PubDescSeg3) {
		this.descFlexField_PubDescSeg3 = descFlexField_PubDescSeg3;
	}

	public String getDescFlexField_PubDescSeg30() {
		return descFlexField_PubDescSeg30;
	}

	public void setDescFlexField_PubDescSeg30(String descFlexField_PubDescSeg30) {
		this.descFlexField_PubDescSeg30 = descFlexField_PubDescSeg30;
	}

	public String getDescFlexField_PubDescSeg31() {
		return descFlexField_PubDescSeg31;
	}

	public void setDescFlexField_PubDescSeg31(String descFlexField_PubDescSeg31) {
		this.descFlexField_PubDescSeg31 = descFlexField_PubDescSeg31;
	}

	public String getDescFlexField_PubDescSeg32() {
		return descFlexField_PubDescSeg32;
	}

	public void setDescFlexField_PubDescSeg32(String descFlexField_PubDescSeg32) {
		this.descFlexField_PubDescSeg32 = descFlexField_PubDescSeg32;
	}

	public String getDescFlexField_PubDescSeg33() {
		return descFlexField_PubDescSeg33;
	}

	public void setDescFlexField_PubDescSeg33(String descFlexField_PubDescSeg33) {
		this.descFlexField_PubDescSeg33 = descFlexField_PubDescSeg33;
	}

	public String getDescFlexField_PubDescSeg34() {
		return descFlexField_PubDescSeg34;
	}

	public void setDescFlexField_PubDescSeg34(String descFlexField_PubDescSeg34) {
		this.descFlexField_PubDescSeg34 = descFlexField_PubDescSeg34;
	}

	public String getDescFlexField_PubDescSeg35() {
		return descFlexField_PubDescSeg35;
	}

	public void setDescFlexField_PubDescSeg35(String descFlexField_PubDescSeg35) {
		this.descFlexField_PubDescSeg35 = descFlexField_PubDescSeg35;
	}

	public String getDescFlexField_PubDescSeg36() {
		return descFlexField_PubDescSeg36;
	}

	public void setDescFlexField_PubDescSeg36(String descFlexField_PubDescSeg36) {
		this.descFlexField_PubDescSeg36 = descFlexField_PubDescSeg36;
	}

	public String getDescFlexField_PubDescSeg37() {
		return descFlexField_PubDescSeg37;
	}

	public void setDescFlexField_PubDescSeg37(String descFlexField_PubDescSeg37) {
		this.descFlexField_PubDescSeg37 = descFlexField_PubDescSeg37;
	}

	public String getDescFlexField_PubDescSeg38() {
		return descFlexField_PubDescSeg38;
	}

	public void setDescFlexField_PubDescSeg38(String descFlexField_PubDescSeg38) {
		this.descFlexField_PubDescSeg38 = descFlexField_PubDescSeg38;
	}

	public String getDescFlexField_PubDescSeg39() {
		return descFlexField_PubDescSeg39;
	}

	public void setDescFlexField_PubDescSeg39(String descFlexField_PubDescSeg39) {
		this.descFlexField_PubDescSeg39 = descFlexField_PubDescSeg39;
	}

	public String getDescFlexField_PubDescSeg4() {
		return descFlexField_PubDescSeg4;
	}

	public void setDescFlexField_PubDescSeg4(String descFlexField_PubDescSeg4) {
		this.descFlexField_PubDescSeg4 = descFlexField_PubDescSeg4;
	}

	public String getDescFlexField_PubDescSeg40() {
		return descFlexField_PubDescSeg40;
	}

	public void setDescFlexField_PubDescSeg40(String descFlexField_PubDescSeg40) {
		this.descFlexField_PubDescSeg40 = descFlexField_PubDescSeg40;
	}

	public String getDescFlexField_PubDescSeg41() {
		return descFlexField_PubDescSeg41;
	}

	public void setDescFlexField_PubDescSeg41(String descFlexField_PubDescSeg41) {
		this.descFlexField_PubDescSeg41 = descFlexField_PubDescSeg41;
	}

	public String getDescFlexField_PubDescSeg42() {
		return descFlexField_PubDescSeg42;
	}

	public void setDescFlexField_PubDescSeg42(String descFlexField_PubDescSeg42) {
		this.descFlexField_PubDescSeg42 = descFlexField_PubDescSeg42;
	}

	public String getDescFlexField_PubDescSeg43() {
		return descFlexField_PubDescSeg43;
	}

	public void setDescFlexField_PubDescSeg43(String descFlexField_PubDescSeg43) {
		this.descFlexField_PubDescSeg43 = descFlexField_PubDescSeg43;
	}

	public String getDescFlexField_PubDescSeg44() {
		return descFlexField_PubDescSeg44;
	}

	public void setDescFlexField_PubDescSeg44(String descFlexField_PubDescSeg44) {
		this.descFlexField_PubDescSeg44 = descFlexField_PubDescSeg44;
	}

	public String getDescFlexField_PubDescSeg45() {
		return descFlexField_PubDescSeg45;
	}

	public void setDescFlexField_PubDescSeg45(String descFlexField_PubDescSeg45) {
		this.descFlexField_PubDescSeg45 = descFlexField_PubDescSeg45;
	}

	public String getDescFlexField_PubDescSeg46() {
		return descFlexField_PubDescSeg46;
	}

	public void setDescFlexField_PubDescSeg46(String descFlexField_PubDescSeg46) {
		this.descFlexField_PubDescSeg46 = descFlexField_PubDescSeg46;
	}

	public String getDescFlexField_PubDescSeg47() {
		return descFlexField_PubDescSeg47;
	}

	public void setDescFlexField_PubDescSeg47(String descFlexField_PubDescSeg47) {
		this.descFlexField_PubDescSeg47 = descFlexField_PubDescSeg47;
	}

	public String getDescFlexField_PubDescSeg48() {
		return descFlexField_PubDescSeg48;
	}

	public void setDescFlexField_PubDescSeg48(String descFlexField_PubDescSeg48) {
		this.descFlexField_PubDescSeg48 = descFlexField_PubDescSeg48;
	}

	public String getDescFlexField_PubDescSeg49() {
		return descFlexField_PubDescSeg49;
	}

	public void setDescFlexField_PubDescSeg49(String descFlexField_PubDescSeg49) {
		this.descFlexField_PubDescSeg49 = descFlexField_PubDescSeg49;
	}

	public String getDescFlexField_PubDescSeg5() {
		return descFlexField_PubDescSeg5;
	}

	public void setDescFlexField_PubDescSeg5(String descFlexField_PubDescSeg5) {
		this.descFlexField_PubDescSeg5 = descFlexField_PubDescSeg5;
	}

	public String getDescFlexField_PubDescSeg50() {
		return descFlexField_PubDescSeg50;
	}

	public void setDescFlexField_PubDescSeg50(String descFlexField_PubDescSeg50) {
		this.descFlexField_PubDescSeg50 = descFlexField_PubDescSeg50;
	}

	public String getDescFlexField_PubDescSeg6() {
		return descFlexField_PubDescSeg6;
	}

	public void setDescFlexField_PubDescSeg6(String descFlexField_PubDescSeg6) {
		this.descFlexField_PubDescSeg6 = descFlexField_PubDescSeg6;
	}

	public String getDescFlexField_PubDescSeg7() {
		return descFlexField_PubDescSeg7;
	}

	public void setDescFlexField_PubDescSeg7(String descFlexField_PubDescSeg7) {
		this.descFlexField_PubDescSeg7 = descFlexField_PubDescSeg7;
	}

	public String getDescFlexField_PubDescSeg8() {
		return descFlexField_PubDescSeg8;
	}

	public void setDescFlexField_PubDescSeg8(String descFlexField_PubDescSeg8) {
		this.descFlexField_PubDescSeg8 = descFlexField_PubDescSeg8;
	}

	public String getDescFlexField_PubDescSeg9() {
		return descFlexField_PubDescSeg9;
	}

	public void setDescFlexField_PubDescSeg9(String descFlexField_PubDescSeg9) {
		this.descFlexField_PubDescSeg9 = descFlexField_PubDescSeg9;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String geteCNCode() {
		return eCNCode;
	}

	public void seteCNCode(String eCNCode) {
		this.eCNCode = eCNCode;
	}

	public String geteCNEntity_EntityID() {
		return eCNEntity_EntityID;
	}

	public void seteCNEntity_EntityID(String eCNEntity_EntityID) {
		this.eCNEntity_EntityID = eCNEntity_EntityID;
	}

	public String geteCNEntity_EntityType() {
		return eCNEntity_EntityType;
	}

	public void seteCNEntity_EntityType(String eCNEntity_EntityType) {
		this.eCNEntity_EntityType = eCNEntity_EntityType;
	}

	public String getECNExecuteDate() {
		return ECNExecuteDate;
	}

	public void setECNExecuteDate(String eCNExecuteDate) {
		ECNExecuteDate = eCNExecuteDate;
	}

	public Double getFixedComTime() {
		return fixedComTime;
	}

	public void setFixedComTime(Double fixedComTime) {
		this.fixedComTime = fixedComTime;
	}

	public Double getFixedStartTime() {
		return fixedStartTime;
	}

	public void setFixedStartTime(Double fixedStartTime) {
		this.fixedStartTime = fixedStartTime;
	}

	public String getInspectScheme() {
		return inspectScheme;
	}

	public void setInspectScheme(String inspectScheme) {
		this.inspectScheme = inspectScheme;
	}

	public String getInspectSchemeVersion() {
		return inspectSchemeVersion;
	}

	public void setInspectSchemeVersion(String inspectSchemeVersion) {
		this.inspectSchemeVersion = inspectSchemeVersion;
	}

	public Integer getIsAllowUncontinueRun() {
		return isAllowUncontinueRun;
	}

	public void setIsAllowUncontinueRun(Integer isAllowUncontinueRun) {
		this.isAllowUncontinueRun = isAllowUncontinueRun;
	}

	public Integer getIsAutoCharge() {
		return isAutoCharge;
	}

	public void setIsAutoCharge(Integer isAutoCharge) {
		this.isAutoCharge = isAutoCharge;
	}

	public Integer getIsBackLabor() {
		return isBackLabor;
	}

	public void setIsBackLabor(Integer isBackLabor) {
		this.isBackLabor = isBackLabor;
	}

	public Integer getIsBackMachine() {
		return isBackMachine;
	}

	public void setIsBackMachine(Integer isBackMachine) {
		this.isBackMachine = isBackMachine;
	}

	public Integer getIsBackMaterial() {
		return isBackMaterial;
	}

	public void setIsBackMaterial(Integer isBackMaterial) {
		this.isBackMaterial = isBackMaterial;
	}

	public Integer getIsBackOthers() {
		return isBackOthers;
	}

	public void setIsBackOthers(Integer isBackOthers) {
		this.isBackOthers = isBackOthers;
	}

	public Integer getIsContinuousDispatch() {
		return isContinuousDispatch;
	}

	public void setIsContinuousDispatch(Integer isContinuousDispatch) {
		this.isContinuousDispatch = isContinuousDispatch;
	}

	public Integer getIsCountPoint() {
		return isCountPoint;
	}

	public void setIsCountPoint(Integer isCountPoint) {
		this.isCountPoint = isCountPoint;
	}

	public Integer getIsInspect() {
		return isInspect;
	}

	public void setIsInspect(Integer isInspect) {
		this.isInspect = isInspect;
	}

	public Integer getIsInspectPoint() {
		return isInspectPoint;
	}

	public void setIsInspectPoint(Integer isInspectPoint) {
		this.isInspectPoint = isInspectPoint;
	}

	public Integer getIsNeckOper() {
		return isNeckOper;
	}

	public void setIsNeckOper(Integer isNeckOper) {
		this.isNeckOper = isNeckOper;
	}

	public Integer getIsPrintSeqTransferDoc() {
		return isPrintSeqTransferDoc;
	}

	public void setIsPrintSeqTransferDoc(Integer isPrintSeqTransferDoc) {
		this.isPrintSeqTransferDoc = isPrintSeqTransferDoc;
	}

	public Integer getIsRcvDirectly() {
		return isRcvDirectly;
	}

	public void setIsRcvDirectly(Integer isRcvDirectly) {
		this.isRcvDirectly = isRcvDirectly;
	}

	public Integer getIsRollupCost() {
		return isRollupCost;
	}

	public void setIsRollupCost(Integer isRollupCost) {
		this.isRollupCost = isRollupCost;
	}

	public Integer getIsSubcontract() {
		return isSubcontract;
	}

	public void setIsSubcontract(Integer isSubcontract) {
		this.isSubcontract = isSubcontract;
	}

	public Integer getIsSubcOperation() {
		return isSubcOperation;
	}

	public void setIsSubcOperation(Integer isSubcOperation) {
		this.isSubcOperation = isSubcOperation;
	}

	public String getIssueBin() {
		return issueBin;
	}

	public void setIssueBin(String issueBin) {
		this.issueBin = issueBin;
	}

	public String getIssueWareHouse() {
		return issueWareHouse;
	}

	public void setIssueWareHouse(String issueWareHouse) {
		this.issueWareHouse = issueWareHouse;
	}

	public Integer getIsSyncSubc() {
		return isSyncSubc;
	}

	public void setIsSyncSubc(Integer isSyncSubc) {
		this.isSyncSubc = isSyncSubc;
	}

	public Integer getIsTraceLotSn() {
		return isTraceLotSn;
	}

	public void setIsTraceLotSn(Integer isTraceLotSn) {
		this.isTraceLotSn = isTraceLotSn;
	}

	public Integer getIsTraceSerialNo() {
		return isTraceSerialNo;
	}

	public void setIsTraceSerialNo(Integer isTraceSerialNo) {
		this.isTraceSerialNo = isTraceSerialNo;
	}

	public Double getMaxTransferTime() {
		return maxTransferTime;
	}

	public void setMaxTransferTime(Double maxTransferTime) {
		this.maxTransferTime = maxTransferTime;
	}

	public Integer getMinRunLot() {
		return minRunLot;
	}

	public void setMinRunLot(Integer minRunLot) {
		this.minRunLot = minRunLot;
	}

	public Double getMinTransferTime() {
		return minTransferTime;
	}

	public void setMinTransferTime(Double minTransferTime) {
		this.minTransferTime = minTransferTime;
	}

	public Double getMinTransQty() {
		return minTransQty;
	}

	public void setMinTransQty(Double minTransQty) {
		this.minTransQty = minTransQty;
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

	public String getNextSequence() {
		return nextSequence;
	}

	public void setNextSequence(String nextSequence) {
		this.nextSequence = nextSequence;
	}

	public Double getOffSetPercent() {
		return offSetPercent;
	}

	public void setOffSetPercent(Double offSetPercent) {
		this.offSetPercent = offSetPercent;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getOutputBaseUOM() {
		return outputBaseUOM;
	}

	public void setOutputBaseUOM(String outputBaseUOM) {
		this.outputBaseUOM = outputBaseUOM;
	}

	public String getOutputUOM() {
		return outputUOM;
	}

	public void setOutputUOM(String outputUOM) {
		this.outputUOM = outputUOM;
	}

	public Double getOutputUOMRatio2Base() {
		return outputUOMRatio2Base;
	}

	public void setOutputUOMRatio2Base(Double outputUOMRatio2Base) {
		this.outputUOMRatio2Base = outputUOMRatio2Base;
	}

	public Double getOutputUOMRatio2PU() {
		return outputUOMRatio2PU;
	}

	public void setOutputUOMRatio2PU(Double outputUOMRatio2PU) {
		this.outputUOMRatio2PU = outputUOMRatio2PU;
	}

	public Double getOverlapRate() {
		return overlapRate;
	}

	public void setOverlapRate(Double overlapRate) {
		this.overlapRate = overlapRate;
	}

	public String getOverlapSequence() {
		return overlapSequence;
	}

	public void setOverlapSequence(String overlapSequence) {
		this.overlapSequence = overlapSequence;
	}

	public Integer getOverlapTyp() {
		return overlapTyp;
	}

	public void setOverlapTyp(Integer overlapTyp) {
		this.overlapTyp = overlapTyp;
	}

	public String getPlmid() {
		return plmid;
	}

	public void setPlmid(String plmid) {
		this.plmid = plmid;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Double getPreSeqMaxTransferTime() {
		return preSeqMaxTransferTime;
	}

	public void setPreSeqMaxTransferTime(Double preSeqMaxTransferTime) {
		this.preSeqMaxTransferTime = preSeqMaxTransferTime;
	}

	public Double getPreSeqMinTransferTime() {
		return preSeqMinTransferTime;
	}

	public void setPreSeqMinTransferTime(Double preSeqMinTransferTime) {
		this.preSeqMinTransferTime = preSeqMinTransferTime;
	}

	public String getPreSequence() {
		return preSequence;
	}

	public void setPreSequence(String preSequence) {
		this.preSequence = preSequence;
	}

	public String getRcvBin() {
		return rcvBin;
	}

	public void setRcvBin(String rcvBin) {
		this.rcvBin = rcvBin;
	}

	public String getRcvWareHouse() {
		return rcvWareHouse;
	}

	public void setRcvWareHouse(String rcvWareHouse) {
		this.rcvWareHouse = rcvWareHouse;
	}

	public String getRouting() {
		return routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

	public Double getRunTime() {
		return runTime;
	}

	public void setRunTime(Double runTime) {
		this.runTime = runTime;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public Double getSetupTime() {
		return setupTime;
	}

	public void setSetupTime(Double setupTime) {
		this.setupTime = setupTime;
	}

	public String getShiftGroup() {
		return shiftGroup;
	}

	public void setShiftGroup(String shiftGroup) {
		this.shiftGroup = shiftGroup;
	}

	public Integer getSplitMerge() {
		return splitMerge;
	}

	public void setSplitMerge(Integer splitMerge) {
		this.splitMerge = splitMerge;
	}

	public String getSrcRowID() {
		return srcRowID;
	}

	public void setSrcRowID(String srcRowID) {
		this.srcRowID = srcRowID;
	}

	public Integer getStartInWholeSet() {
		return startInWholeSet;
	}

	public void setStartInWholeSet(Integer startInWholeSet) {
		this.startInWholeSet = startInWholeSet;
	}

	public Double getStartTimeNum() {
		return startTimeNum;
	}

	public void setStartTimeNum(Double startTimeNum) {
		this.startTimeNum = startTimeNum;
	}

	public String getStdOperation() {
		return stdOperation;
	}

	public void setStdOperation(String stdOperation) {
		this.stdOperation = stdOperation;
	}

	public String getSubcontractItemMaster() {
		return subcontractItemMaster;
	}

	public void setSubcontractItemMaster(String subcontractItemMaster) {
		this.subcontractItemMaster = subcontractItemMaster;
	}

	public String getSyncMemo() {
		return syncMemo;
	}

	public void setSyncMemo(String syncMemo) {
		this.syncMemo = syncMemo;
	}

	public String getSyncSource() {
		return syncSource;
	}

	public void setSyncSource(String syncSource) {
		this.syncSource = syncSource;
	}

	public String getSyncSourceID() {
		return syncSourceID;
	}

	public void setSyncSourceID(String syncSourceID) {
		this.syncSourceID = syncSourceID;
	}

	public String getSyncTs() {
		return syncTs;
	}

	public void setSyncTs(String syncTs) {
		this.syncTs = syncTs;
	}

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getTimeUOM() {
		return timeUOM;
	}

	public void setTimeUOM(String timeUOM) {
		this.timeUOM = timeUOM;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getWorkCenter() {
		return workCenter;
	}

	public void setWorkCenter(String workCenter) {
		this.workCenter = workCenter;
	}

	public Double getYield() {
		return yield;
	}

	public void setYield(Double yield) {
		this.yield = yield;
	}

	public String getOutputUOMName() {
		return outputUOMName;
	}

	public void setOutputUOMName(String outputUOMName) {
		this.outputUOMName = outputUOMName;
	}

	public String getMoDocNo() {
		return moDocNo;
	}

	public void setMoDocNo(String moDocNo) {
		this.moDocNo = moDocNo;
	}

	
}
