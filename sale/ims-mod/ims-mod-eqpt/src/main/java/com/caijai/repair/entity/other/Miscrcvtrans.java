package com.caijai.repair.entity.other;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseEntity;

/**
 * 备品备料杂收单
 * @author ChenYu
 *
 */
@Table(name = "eq_MiscRcvTrans")
public class Miscrcvtrans extends BaseEntity {

	private static final long serialVersionUID = -7639909485883571257L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;
	
	/**
	 * 派工单(对应派工单单号信息)
	 */
	@Column(name="order")
	private String order;
	
	/**
	 * 申请人
	 */
	@Column(name = "applicant")
	private String applicant;

	/**
	 * 申請人姓名
	 */
	@Column(name = "applicantName", readonly = true)
	@Relation(table = "sys_person", value = "id", ref = "applicant", show = "name")
	private String applicantName;
		
	/**
	 * 创建时间
	 */
	@Column(name = "CreatedOn")
	private String createdOn;

	/**
	 * 创建人
	 */
	@Column(name = "CreatedBy")
	private String createdBy;

	/**
	 * 修改时间
	 */
	@Column(name = "ModifiedOn")
	private String modifiedOn;

	/**
	 * 修改人
	 */
	@Column(name = "ModifiedBy")
	private String modifiedBy;

	/**
	 * 系统版本
	 */
	@Column(name = "SysVersion")
	private String sysversion;

	/**
	 * 组织
	 */
	@Column(name = "Org")
	private String org;

	/**
	 * 单据编码
	 */
	@Column(name = "DocNo")
	private String docno;

	/**
	 * 业务日期
	 */
	@Column(name = "BusinessDate")
	private String businessdate;

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
	 * 最后一次打印次数
	 */
	@Column(name = "LatestPrintedDate")
	private String latestprinteddate;

	/**
	 * 是否关闭
	 */
	@Column(name = "Cancel_Canceled")
	private Integer cancelCanceled;

	/**
	 * 关闭时间
	 */
	@Column(name = "Cancel_CancelDate")
	private String cancelCanceldate;

	/**
	 * 关闭原因
	 */
	@Column(name = "Cancel_CancelReason")
	private String cancelCancelreason;

	/**
	 * 关闭人
	 */
	@Column(name = "Cancel_CancelUser")
	private String cancelCanceluser;

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
	 * 挂起原因
	 */
	@Column(name = "HoldReason")
	private String holdreason;

	/**
	 * 挂起人
	 */
	@Column(name = "HoldUser")
	private String holduser;

	/**
	 * 挂起日期
	 */
	@Column(name = "HoldDate")
	private String holddate;

	/**
	 * 下达原因
	 */
	@Column(name = "ReleaseReason")
	private String releasereason;

	/**
	 * 下达人
	 */
	@Column(name = "ReleaseUser")
	private String releaseuser;

	/**
	 * 下达日期
	 */
	@Column(name = "ReleaseDate")
	private String releasedate;

	/**
	 * 扩展项1
	 */
	@Column(name = "DescFlexField_PubDescSeg1")
	private String descflexfieldPubdescseg1;

	/**
	 * 扩展项2
	 */
	@Column(name = "DescFlexField_PubDescSeg2")
	private String descflexfieldPubdescseg2;

	/**
	 * 扩展项3
	 */
	@Column(name = "DescFlexField_PubDescSeg3")
	private String descflexfieldPubdescseg3;

	/**
	 * 扩展项4
	 */
	@Column(name = "DescFlexField_PubDescSeg4")
	private String descflexfieldPubdescseg4;

	/**
	 * 扩展项5
	 */
	@Column(name = "DescFlexField_PubDescSeg5")
	private String descflexfieldPubdescseg5;

	/**
	 * 扩展项6
	 */
	@Column(name = "DescFlexField_PubDescSeg6")
	private String descflexfieldPubdescseg6;

	/**
	 * 扩展项7
	 */
	@Column(name = "DescFlexField_PubDescSeg7")
	private String descflexfieldPubdescseg7;

	/**
	 * 扩展项8
	 */
	@Column(name = "DescFlexField_PubDescSeg8")
	private String descflexfieldPubdescseg8;

	/**
	 * 扩展项9
	 */
	@Column(name = "DescFlexField_PubDescSeg9")
	private String descflexfieldPubdescseg9;

	/**
	 * 扩展项10
	 */
	@Column(name = "DescFlexField_PubDescSeg10")
	private String descflexfieldPubdescseg10;

	/**
	 * 扩展项11
	 */
	@Column(name = "DescFlexField_PubDescSeg11")
	private String descflexfieldPubdescseg11;

	/**
	 * 扩展项12
	 */
	@Column(name = "DescFlexField_PubDescSeg12")
	private String descflexfieldPubdescseg12;

	/**
	 * 扩展项13
	 */
	@Column(name = "DescFlexField_PubDescSeg13")
	private String descflexfieldPubdescseg13;

	/**
	 * 扩展项14
	 */
	@Column(name = "DescFlexField_PubDescSeg14")
	private String descflexfieldPubdescseg14;

	/**
	 * 扩展项15
	 */
	@Column(name = "DescFlexField_PubDescSeg15")
	private String descflexfieldPubdescseg15;

	/**
	 * 扩展项16
	 */
	@Column(name = "DescFlexField_PubDescSeg16")
	private String descflexfieldPubdescseg16;

	/**
	 * 扩展项17
	 */
	@Column(name = "DescFlexField_PubDescSeg17")
	private String descflexfieldPubdescseg17;

	/**
	 * 扩展项18
	 */
	@Column(name = "DescFlexField_PubDescSeg18")
	private String descflexfieldPubdescseg18;

	/**
	 * 扩展项19
	 */
	@Column(name = "DescFlexField_PubDescSeg19")
	private String descflexfieldPubdescseg19;

	/**
	 * 扩展项20
	 */
	@Column(name = "DescFlexField_PubDescSeg20")
	private String descflexfieldPubdescseg20;

	/**
	 * 扩展项21
	 */
	@Column(name = "DescFlexField_PubDescSeg21")
	private String descflexfieldPubdescseg21;

	/**
	 * 扩展项22
	 */
	@Column(name = "DescFlexField_PubDescSeg22")
	private String descflexfieldPubdescseg22;

	/**
	 * 扩展项23
	 */
	@Column(name = "DescFlexField_PubDescSeg23")
	private String descflexfieldPubdescseg23;

	/**
	 * 扩展项24
	 */
	@Column(name = "DescFlexField_PubDescSeg24")
	private String descflexfieldPubdescseg24;

	/**
	 * 扩展项25
	 */
	@Column(name = "DescFlexField_PubDescSeg25")
	private String descflexfieldPubdescseg25;

	/**
	 * 扩展项26
	 */
	@Column(name = "DescFlexField_PubDescSeg26")
	private String descflexfieldPubdescseg26;

	/**
	 * 扩展项27
	 */
	@Column(name = "DescFlexField_PubDescSeg27")
	private String descflexfieldPubdescseg27;

	/**
	 * 扩展项28
	 */
	@Column(name = "DescFlexField_PubDescSeg28")
	private String descflexfieldPubdescseg28;

	/**
	 * 扩展项29
	 */
	@Column(name = "DescFlexField_PubDescSeg29")
	private String descflexfieldPubdescseg29;

	/**
	 * 扩展项30
	 */
	@Column(name = "DescFlexField_PubDescSeg30")
	private String descflexfieldPubdescseg30;

	/**
	 * 扩展项31
	 */
	@Column(name = "DescFlexField_PubDescSeg31")
	private String descflexfieldPubdescseg31;

	/**
	 * 扩展项32
	 */
	@Column(name = "DescFlexField_PubDescSeg32")
	private String descflexfieldPubdescseg32;

	/**
	 * 扩展项33
	 */
	@Column(name = "DescFlexField_PubDescSeg33")
	private String descflexfieldPubdescseg33;

	/**
	 * 扩展项34
	 */
	@Column(name = "DescFlexField_PubDescSeg34")
	private String descflexfieldPubdescseg34;

	/**
	 * 扩展项35
	 */
	@Column(name = "DescFlexField_PubDescSeg35")
	private String descflexfieldPubdescseg35;

	/**
	 * 扩展项36
	 */
	@Column(name = "DescFlexField_PubDescSeg36")
	private String descflexfieldPubdescseg36;

	/**
	 * 扩展项37
	 */
	@Column(name = "DescFlexField_PubDescSeg37")
	private String descflexfieldPubdescseg37;

	/**
	 * 扩展项38
	 */
	@Column(name = "DescFlexField_PubDescSeg38")
	private String descflexfieldPubdescseg38;

	/**
	 * 扩展项39
	 */
	@Column(name = "DescFlexField_PubDescSeg39")
	private String descflexfieldPubdescseg39;

	/**
	 * 扩展项40
	 */
	@Column(name = "DescFlexField_PubDescSeg40")
	private String descflexfieldPubdescseg40;

	/**
	 * 扩展项41
	 */
	@Column(name = "DescFlexField_PubDescSeg41")
	private String descflexfieldPubdescseg41;

	/**
	 * 扩展项42
	 */
	@Column(name = "DescFlexField_PubDescSeg42")
	private String descflexfieldPubdescseg42;

	/**
	 * 扩展项43
	 */
	@Column(name = "DescFlexField_PubDescSeg43")
	private String descflexfieldPubdescseg43;

	/**
	 * 扩展项44
	 */
	@Column(name = "DescFlexField_PubDescSeg44")
	private String descflexfieldPubdescseg44;

	/**
	 * 扩展项45
	 */
	@Column(name = "DescFlexField_PubDescSeg45")
	private String descflexfieldPubdescseg45;

	/**
	 * 扩展项46
	 */
	@Column(name = "DescFlexField_PubDescSeg46")
	private String descflexfieldPubdescseg46;

	/**
	 * 扩展项47
	 */
	@Column(name = "DescFlexField_PubDescSeg47")
	private String descflexfieldPubdescseg47;

	/**
	 * 扩展项48
	 */
	@Column(name = "DescFlexField_PubDescSeg48")
	private String descflexfieldPubdescseg48;

	/**
	 * 扩展项49
	 */
	@Column(name = "DescFlexField_PubDescSeg49")
	private String descflexfieldPubdescseg49;

	/**
	 * 扩展项50
	 */
	@Column(name = "DescFlexField_PubDescSeg50")
	private String descflexfieldPubdescseg50;

	/**
	 * 自定义
	 */
	@Column(name = "DescFlexField_ContextValue")
	private String descflexfieldContextvalue;

	/**
	 * 自定义1
	 */
	@Column(name = "DescFlexField_PrivateDescSeg1")
	private String descflexfieldPrivatedescseg1;

	/**
	 * 自定义2
	 */
	@Column(name = "DescFlexField_PrivateDescSeg2")
	private String descflexfieldPrivatedescseg2;

	/**
	 * 自定义3
	 */
	@Column(name = "DescFlexField_PrivateDescSeg3")
	private String descflexfieldPrivatedescseg3;

	/**
	 * 自定义4
	 */
	@Column(name = "DescFlexField_PrivateDescSeg4")
	private String descflexfieldPrivatedescseg4;

	/**
	 * 自定义5
	 */
	@Column(name = "DescFlexField_PrivateDescSeg5")
	private String descflexfieldPrivatedescseg5;

	/**
	 * 自定义6
	 */
	@Column(name = "DescFlexField_PrivateDescSeg6")
	private String descflexfieldPrivatedescseg6;

	/**
	 * 自定义7
	 */
	@Column(name = "DescFlexField_PrivateDescSeg7")
	private String descflexfieldPrivatedescseg7;

	/**
	 * 自定义8
	 */
	@Column(name = "DescFlexField_PrivateDescSeg8")
	private String descflexfieldPrivatedescseg8;

	/**
	 * 自定义9
	 */
	@Column(name = "DescFlexField_PrivateDescSeg9")
	private String descflexfieldPrivatedescseg9;

	/**
	 * 自定义10
	 */
	@Column(name = "DescFlexField_PrivateDescSeg10")
	private String descflexfieldPrivatedescseg10;

	/**
	 * 自定义11
	 */
	@Column(name = "DescFlexField_PrivateDescSeg11")
	private String descflexfieldPrivatedescseg11;

	/**
	 * 自定义12
	 */
	@Column(name = "DescFlexField_PrivateDescSeg12")
	private String descflexfieldPrivatedescseg12;

	/**
	 * 自定义13
	 */
	@Column(name = "DescFlexField_PrivateDescSeg13")
	private String descflexfieldPrivatedescseg13;

	/**
	 * 自定义14
	 */
	@Column(name = "DescFlexField_PrivateDescSeg14")
	private String descflexfieldPrivatedescseg14;

	/**
	 * 自定义15
	 */
	@Column(name = "DescFlexField_PrivateDescSeg15")
	private String descflexfieldPrivatedescseg15;

	/**
	 * 自定义16
	 */
	@Column(name = "DescFlexField_PrivateDescSeg16")
	private String descflexfieldPrivatedescseg16;

	/**
	 * 自定义17
	 */
	@Column(name = "DescFlexField_PrivateDescSeg17")
	private String descflexfieldPrivatedescseg17;

	/**
	 * 自定义18
	 */
	@Column(name = "DescFlexField_PrivateDescSeg18")
	private String descflexfieldPrivatedescseg18;

	/**
	 * 自定义19
	 */
	@Column(name = "DescFlexField_PrivateDescSeg19")
	private String descflexfieldPrivatedescseg19;

	/**
	 * 自定义20
	 */
	@Column(name = "DescFlexField_PrivateDescSeg20")
	private String descflexfieldPrivatedescseg20;

	/**
	 * 自定义21
	 */
	@Column(name = "DescFlexField_PrivateDescSeg21")
	private String descflexfieldPrivatedescseg21;

	/**
	 * 自定义22
	 */
	@Column(name = "DescFlexField_PrivateDescSeg22")
	private String descflexfieldPrivatedescseg22;

	/**
	 * 自定义23
	 */
	@Column(name = "DescFlexField_PrivateDescSeg23")
	private String descflexfieldPrivatedescseg23;

	/**
	 * 自定义24
	 */
	@Column(name = "DescFlexField_PrivateDescSeg24")
	private String descflexfieldPrivatedescseg24;

	/**
	 * 自定义25
	 */
	@Column(name = "DescFlexField_PrivateDescSeg25")
	private String descflexfieldPrivatedescseg25;

	/**
	 * 自定义26
	 */
	@Column(name = "DescFlexField_PrivateDescSeg26")
	private String descflexfieldPrivatedescseg26;

	/**
	 * 自定义27
	 */
	@Column(name = "DescFlexField_PrivateDescSeg27")
	private String descflexfieldPrivatedescseg27;

	/**
	 * 自定义28
	 */
	@Column(name = "DescFlexField_PrivateDescSeg28")
	private String descflexfieldPrivatedescseg28;

	/**
	 * 自定义29
	 */
	@Column(name = "DescFlexField_PrivateDescSeg29")
	private String descflexfieldPrivatedescseg29;

	/**
	 * 自定义30
	 */
	@Column(name = "DescFlexField_PrivateDescSeg30")
	private String descflexfieldPrivatedescseg30;

	/**
	 * 状态
	 */
	@Column(name = "Status")
	private Integer status;

	/**
	 * 单据类型
	 */
	@Column(name = "MiscRcvDocType")
	private String miscrcvdoctype;

	/**
	 * 财务关闭
	 */
	@Column(name = "GLClose")
	private Integer glclose;

	/**
	 * 状态
	 */
	@Column(name = "WFCurrentState")
	private Integer wfcurrentstate;

	/**
	 * 之前状态
	 */
	@Column(name = "WFOriginalState")
	private Integer wforiginalstate;

	/**
	 * 记账期间
	 */
	@Column(name = "SOBAccountPeriod")
	private String sobaccountperiod;

	/**
	 * 当前活动
	 */
	@Column(name = "CurrAction")
	private Integer curraction;

	/**
	 * 审核人
	 */
	@Column(name = "ApprovedBy")
	private String approvedby;

	/**
	 * 审核日期
	 */
	@Column(name = "ApprovedOn")
	private String approvedon;

	/**
	 * 弃审人
	 */
	@Column(name = "CancelApprovedBy")
	private String cancelapprovedby;

	/**
	 * 弃审日期
	 */
	@Column(name = "CancelApprovedOn")
	private String cancelapprovedon;

	/**
	 * 财务关闭日期
	 */
	@Column(name = "GLClosedOn")
	private String glclosedon;

	/**
	 * 假退料
	 */
	@Column(name = "DummyRecede")
	private Integer dummyrecede;

	/**
	 * VMI单据AAI标志
	 */
	@Column(name = "IsUnCreateAAI")
	private Integer isuncreateaai;

	/**
	 * 来源单据类别
	 */
	@Column(name = "SrcDocType")
	private Integer srcdoctype;

	/**
	 * 受益组织
	 */
	@Column(name = "BenefitOrg")
	private String benefitorg;

	/**
	 * 受益人
	 */
	@Column(name = "BenefitPsn")
	private String benefitpsn;

	/**
	 * 经手人
	 */
	@Column(name = "HandlePsn")
	private String handlepsn;

	/**
	 * 库管员
	 */
	@Column(name = "WhMan")
	private String whman;

	/**
	 * 取来源单据成本
	 */
	@Column(name = "IsFromSrcCost")
	private Integer isfromsrccost;

	/**
	 * 逆向登账
	 */
	@Column(name = "ReverseMiscRcv")
	private Integer reversemiscrcv;

	/**
	 * 生成调拨单
	 */
	@Column(name = "IsTransfer")
	private Integer istransfer;

	/**
	 * 实例流
	 */
	@Column(name = "FlowInstance")
	private String flowinstance;

	/**
	 * 是否作废
	 */
	@Column(name = "dr")
	private Integer dr;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getSysversion() {
		return sysversion;
	}

	public void setSysversion(String sysversion) {
		this.sysversion = sysversion;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getDocno() {
		return docno;
	}

	public void setDocno(String docno) {
		this.docno = docno;
	}

	public String getBusinessdate() {
		return businessdate;
	}

	public void setBusinessdate(String businessdate) {
		this.businessdate = businessdate;
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

	public String getLatestprinteddate() {
		return latestprinteddate;
	}

	public void setLatestprinteddate(String latestprinteddate) {
		this.latestprinteddate = latestprinteddate;
	}

	public Integer getCancelCanceled() {
		return cancelCanceled;
	}

	public void setCancelCanceled(Integer cancelCanceled) {
		this.cancelCanceled = cancelCanceled;
	}

	public String getCancelCanceldate() {
		return cancelCanceldate;
	}

	public void setCancelCanceldate(String cancelCanceldate) {
		this.cancelCanceldate = cancelCanceldate;
	}

	public String getCancelCancelreason() {
		return cancelCancelreason;
	}

	public void setCancelCancelreason(String cancelCancelreason) {
		this.cancelCancelreason = cancelCancelreason;
	}

	public String getCancelCanceluser() {
		return cancelCanceluser;
	}

	public void setCancelCanceluser(String cancelCanceluser) {
		this.cancelCanceluser = cancelCanceluser;
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

	public String getHoldreason() {
		return holdreason;
	}

	public void setHoldreason(String holdreason) {
		this.holdreason = holdreason;
	}

	public String getHolduser() {
		return holduser;
	}

	public void setHolduser(String holduser) {
		this.holduser = holduser;
	}

	public String getHolddate() {
		return holddate;
	}

	public void setHolddate(String holddate) {
		this.holddate = holddate;
	}

	public String getReleasereason() {
		return releasereason;
	}

	public void setReleasereason(String releasereason) {
		this.releasereason = releasereason;
	}

	public String getReleaseuser() {
		return releaseuser;
	}

	public void setReleaseuser(String releaseuser) {
		this.releaseuser = releaseuser;
	}

	public String getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}

	public String getDescflexfieldPubdescseg1() {
		return descflexfieldPubdescseg1;
	}

	public void setDescflexfieldPubdescseg1(String descflexfieldPubdescseg1) {
		this.descflexfieldPubdescseg1 = descflexfieldPubdescseg1;
	}

	public String getDescflexfieldPubdescseg2() {
		return descflexfieldPubdescseg2;
	}

	public void setDescflexfieldPubdescseg2(String descflexfieldPubdescseg2) {
		this.descflexfieldPubdescseg2 = descflexfieldPubdescseg2;
	}

	public String getDescflexfieldPubdescseg3() {
		return descflexfieldPubdescseg3;
	}

	public void setDescflexfieldPubdescseg3(String descflexfieldPubdescseg3) {
		this.descflexfieldPubdescseg3 = descflexfieldPubdescseg3;
	}

	public String getDescflexfieldPubdescseg4() {
		return descflexfieldPubdescseg4;
	}

	public void setDescflexfieldPubdescseg4(String descflexfieldPubdescseg4) {
		this.descflexfieldPubdescseg4 = descflexfieldPubdescseg4;
	}

	public String getDescflexfieldPubdescseg5() {
		return descflexfieldPubdescseg5;
	}

	public void setDescflexfieldPubdescseg5(String descflexfieldPubdescseg5) {
		this.descflexfieldPubdescseg5 = descflexfieldPubdescseg5;
	}

	public String getDescflexfieldPubdescseg6() {
		return descflexfieldPubdescseg6;
	}

	public void setDescflexfieldPubdescseg6(String descflexfieldPubdescseg6) {
		this.descflexfieldPubdescseg6 = descflexfieldPubdescseg6;
	}

	public String getDescflexfieldPubdescseg7() {
		return descflexfieldPubdescseg7;
	}

	public void setDescflexfieldPubdescseg7(String descflexfieldPubdescseg7) {
		this.descflexfieldPubdescseg7 = descflexfieldPubdescseg7;
	}

	public String getDescflexfieldPubdescseg8() {
		return descflexfieldPubdescseg8;
	}

	public void setDescflexfieldPubdescseg8(String descflexfieldPubdescseg8) {
		this.descflexfieldPubdescseg8 = descflexfieldPubdescseg8;
	}

	public String getDescflexfieldPubdescseg9() {
		return descflexfieldPubdescseg9;
	}

	public void setDescflexfieldPubdescseg9(String descflexfieldPubdescseg9) {
		this.descflexfieldPubdescseg9 = descflexfieldPubdescseg9;
	}

	public String getDescflexfieldPubdescseg10() {
		return descflexfieldPubdescseg10;
	}

	public void setDescflexfieldPubdescseg10(String descflexfieldPubdescseg10) {
		this.descflexfieldPubdescseg10 = descflexfieldPubdescseg10;
	}

	public String getDescflexfieldPubdescseg11() {
		return descflexfieldPubdescseg11;
	}

	public void setDescflexfieldPubdescseg11(String descflexfieldPubdescseg11) {
		this.descflexfieldPubdescseg11 = descflexfieldPubdescseg11;
	}

	public String getDescflexfieldPubdescseg12() {
		return descflexfieldPubdescseg12;
	}

	public void setDescflexfieldPubdescseg12(String descflexfieldPubdescseg12) {
		this.descflexfieldPubdescseg12 = descflexfieldPubdescseg12;
	}

	public String getDescflexfieldPubdescseg13() {
		return descflexfieldPubdescseg13;
	}

	public void setDescflexfieldPubdescseg13(String descflexfieldPubdescseg13) {
		this.descflexfieldPubdescseg13 = descflexfieldPubdescseg13;
	}

	public String getDescflexfieldPubdescseg14() {
		return descflexfieldPubdescseg14;
	}

	public void setDescflexfieldPubdescseg14(String descflexfieldPubdescseg14) {
		this.descflexfieldPubdescseg14 = descflexfieldPubdescseg14;
	}

	public String getDescflexfieldPubdescseg15() {
		return descflexfieldPubdescseg15;
	}

	public void setDescflexfieldPubdescseg15(String descflexfieldPubdescseg15) {
		this.descflexfieldPubdescseg15 = descflexfieldPubdescseg15;
	}

	public String getDescflexfieldPubdescseg16() {
		return descflexfieldPubdescseg16;
	}

	public void setDescflexfieldPubdescseg16(String descflexfieldPubdescseg16) {
		this.descflexfieldPubdescseg16 = descflexfieldPubdescseg16;
	}

	public String getDescflexfieldPubdescseg17() {
		return descflexfieldPubdescseg17;
	}

	public void setDescflexfieldPubdescseg17(String descflexfieldPubdescseg17) {
		this.descflexfieldPubdescseg17 = descflexfieldPubdescseg17;
	}

	public String getDescflexfieldPubdescseg18() {
		return descflexfieldPubdescseg18;
	}

	public void setDescflexfieldPubdescseg18(String descflexfieldPubdescseg18) {
		this.descflexfieldPubdescseg18 = descflexfieldPubdescseg18;
	}

	public String getDescflexfieldPubdescseg19() {
		return descflexfieldPubdescseg19;
	}

	public void setDescflexfieldPubdescseg19(String descflexfieldPubdescseg19) {
		this.descflexfieldPubdescseg19 = descflexfieldPubdescseg19;
	}

	public String getDescflexfieldPubdescseg20() {
		return descflexfieldPubdescseg20;
	}

	public void setDescflexfieldPubdescseg20(String descflexfieldPubdescseg20) {
		this.descflexfieldPubdescseg20 = descflexfieldPubdescseg20;
	}

	public String getDescflexfieldPubdescseg21() {
		return descflexfieldPubdescseg21;
	}

	public void setDescflexfieldPubdescseg21(String descflexfieldPubdescseg21) {
		this.descflexfieldPubdescseg21 = descflexfieldPubdescseg21;
	}

	public String getDescflexfieldPubdescseg22() {
		return descflexfieldPubdescseg22;
	}

	public void setDescflexfieldPubdescseg22(String descflexfieldPubdescseg22) {
		this.descflexfieldPubdescseg22 = descflexfieldPubdescseg22;
	}

	public String getDescflexfieldPubdescseg23() {
		return descflexfieldPubdescseg23;
	}

	public void setDescflexfieldPubdescseg23(String descflexfieldPubdescseg23) {
		this.descflexfieldPubdescseg23 = descflexfieldPubdescseg23;
	}

	public String getDescflexfieldPubdescseg24() {
		return descflexfieldPubdescseg24;
	}

	public void setDescflexfieldPubdescseg24(String descflexfieldPubdescseg24) {
		this.descflexfieldPubdescseg24 = descflexfieldPubdescseg24;
	}

	public String getDescflexfieldPubdescseg25() {
		return descflexfieldPubdescseg25;
	}

	public void setDescflexfieldPubdescseg25(String descflexfieldPubdescseg25) {
		this.descflexfieldPubdescseg25 = descflexfieldPubdescseg25;
	}

	public String getDescflexfieldPubdescseg26() {
		return descflexfieldPubdescseg26;
	}

	public void setDescflexfieldPubdescseg26(String descflexfieldPubdescseg26) {
		this.descflexfieldPubdescseg26 = descflexfieldPubdescseg26;
	}

	public String getDescflexfieldPubdescseg27() {
		return descflexfieldPubdescseg27;
	}

	public void setDescflexfieldPubdescseg27(String descflexfieldPubdescseg27) {
		this.descflexfieldPubdescseg27 = descflexfieldPubdescseg27;
	}

	public String getDescflexfieldPubdescseg28() {
		return descflexfieldPubdescseg28;
	}

	public void setDescflexfieldPubdescseg28(String descflexfieldPubdescseg28) {
		this.descflexfieldPubdescseg28 = descflexfieldPubdescseg28;
	}

	public String getDescflexfieldPubdescseg29() {
		return descflexfieldPubdescseg29;
	}

	public void setDescflexfieldPubdescseg29(String descflexfieldPubdescseg29) {
		this.descflexfieldPubdescseg29 = descflexfieldPubdescseg29;
	}

	public String getDescflexfieldPubdescseg30() {
		return descflexfieldPubdescseg30;
	}

	public void setDescflexfieldPubdescseg30(String descflexfieldPubdescseg30) {
		this.descflexfieldPubdescseg30 = descflexfieldPubdescseg30;
	}

	public String getDescflexfieldPubdescseg31() {
		return descflexfieldPubdescseg31;
	}

	public void setDescflexfieldPubdescseg31(String descflexfieldPubdescseg31) {
		this.descflexfieldPubdescseg31 = descflexfieldPubdescseg31;
	}

	public String getDescflexfieldPubdescseg32() {
		return descflexfieldPubdescseg32;
	}

	public void setDescflexfieldPubdescseg32(String descflexfieldPubdescseg32) {
		this.descflexfieldPubdescseg32 = descflexfieldPubdescseg32;
	}

	public String getDescflexfieldPubdescseg33() {
		return descflexfieldPubdescseg33;
	}

	public void setDescflexfieldPubdescseg33(String descflexfieldPubdescseg33) {
		this.descflexfieldPubdescseg33 = descflexfieldPubdescseg33;
	}

	public String getDescflexfieldPubdescseg34() {
		return descflexfieldPubdescseg34;
	}

	public void setDescflexfieldPubdescseg34(String descflexfieldPubdescseg34) {
		this.descflexfieldPubdescseg34 = descflexfieldPubdescseg34;
	}

	public String getDescflexfieldPubdescseg35() {
		return descflexfieldPubdescseg35;
	}

	public void setDescflexfieldPubdescseg35(String descflexfieldPubdescseg35) {
		this.descflexfieldPubdescseg35 = descflexfieldPubdescseg35;
	}

	public String getDescflexfieldPubdescseg36() {
		return descflexfieldPubdescseg36;
	}

	public void setDescflexfieldPubdescseg36(String descflexfieldPubdescseg36) {
		this.descflexfieldPubdescseg36 = descflexfieldPubdescseg36;
	}

	public String getDescflexfieldPubdescseg37() {
		return descflexfieldPubdescseg37;
	}

	public void setDescflexfieldPubdescseg37(String descflexfieldPubdescseg37) {
		this.descflexfieldPubdescseg37 = descflexfieldPubdescseg37;
	}

	public String getDescflexfieldPubdescseg38() {
		return descflexfieldPubdescseg38;
	}

	public void setDescflexfieldPubdescseg38(String descflexfieldPubdescseg38) {
		this.descflexfieldPubdescseg38 = descflexfieldPubdescseg38;
	}

	public String getDescflexfieldPubdescseg39() {
		return descflexfieldPubdescseg39;
	}

	public void setDescflexfieldPubdescseg39(String descflexfieldPubdescseg39) {
		this.descflexfieldPubdescseg39 = descflexfieldPubdescseg39;
	}

	public String getDescflexfieldPubdescseg40() {
		return descflexfieldPubdescseg40;
	}

	public void setDescflexfieldPubdescseg40(String descflexfieldPubdescseg40) {
		this.descflexfieldPubdescseg40 = descflexfieldPubdescseg40;
	}

	public String getDescflexfieldPubdescseg41() {
		return descflexfieldPubdescseg41;
	}

	public void setDescflexfieldPubdescseg41(String descflexfieldPubdescseg41) {
		this.descflexfieldPubdescseg41 = descflexfieldPubdescseg41;
	}

	public String getDescflexfieldPubdescseg42() {
		return descflexfieldPubdescseg42;
	}

	public void setDescflexfieldPubdescseg42(String descflexfieldPubdescseg42) {
		this.descflexfieldPubdescseg42 = descflexfieldPubdescseg42;
	}

	public String getDescflexfieldPubdescseg43() {
		return descflexfieldPubdescseg43;
	}

	public void setDescflexfieldPubdescseg43(String descflexfieldPubdescseg43) {
		this.descflexfieldPubdescseg43 = descflexfieldPubdescseg43;
	}

	public String getDescflexfieldPubdescseg44() {
		return descflexfieldPubdescseg44;
	}

	public void setDescflexfieldPubdescseg44(String descflexfieldPubdescseg44) {
		this.descflexfieldPubdescseg44 = descflexfieldPubdescseg44;
	}

	public String getDescflexfieldPubdescseg45() {
		return descflexfieldPubdescseg45;
	}

	public void setDescflexfieldPubdescseg45(String descflexfieldPubdescseg45) {
		this.descflexfieldPubdescseg45 = descflexfieldPubdescseg45;
	}

	public String getDescflexfieldPubdescseg46() {
		return descflexfieldPubdescseg46;
	}

	public void setDescflexfieldPubdescseg46(String descflexfieldPubdescseg46) {
		this.descflexfieldPubdescseg46 = descflexfieldPubdescseg46;
	}

	public String getDescflexfieldPubdescseg47() {
		return descflexfieldPubdescseg47;
	}

	public void setDescflexfieldPubdescseg47(String descflexfieldPubdescseg47) {
		this.descflexfieldPubdescseg47 = descflexfieldPubdescseg47;
	}

	public String getDescflexfieldPubdescseg48() {
		return descflexfieldPubdescseg48;
	}

	public void setDescflexfieldPubdescseg48(String descflexfieldPubdescseg48) {
		this.descflexfieldPubdescseg48 = descflexfieldPubdescseg48;
	}

	public String getDescflexfieldPubdescseg49() {
		return descflexfieldPubdescseg49;
	}

	public void setDescflexfieldPubdescseg49(String descflexfieldPubdescseg49) {
		this.descflexfieldPubdescseg49 = descflexfieldPubdescseg49;
	}

	public String getDescflexfieldPubdescseg50() {
		return descflexfieldPubdescseg50;
	}

	public void setDescflexfieldPubdescseg50(String descflexfieldPubdescseg50) {
		this.descflexfieldPubdescseg50 = descflexfieldPubdescseg50;
	}

	public String getDescflexfieldContextvalue() {
		return descflexfieldContextvalue;
	}

	public void setDescflexfieldContextvalue(String descflexfieldContextvalue) {
		this.descflexfieldContextvalue = descflexfieldContextvalue;
	}

	public String getDescflexfieldPrivatedescseg1() {
		return descflexfieldPrivatedescseg1;
	}

	public void setDescflexfieldPrivatedescseg1(String descflexfieldPrivatedescseg1) {
		this.descflexfieldPrivatedescseg1 = descflexfieldPrivatedescseg1;
	}

	public String getDescflexfieldPrivatedescseg2() {
		return descflexfieldPrivatedescseg2;
	}

	public void setDescflexfieldPrivatedescseg2(String descflexfieldPrivatedescseg2) {
		this.descflexfieldPrivatedescseg2 = descflexfieldPrivatedescseg2;
	}

	public String getDescflexfieldPrivatedescseg3() {
		return descflexfieldPrivatedescseg3;
	}

	public void setDescflexfieldPrivatedescseg3(String descflexfieldPrivatedescseg3) {
		this.descflexfieldPrivatedescseg3 = descflexfieldPrivatedescseg3;
	}

	public String getDescflexfieldPrivatedescseg4() {
		return descflexfieldPrivatedescseg4;
	}

	public void setDescflexfieldPrivatedescseg4(String descflexfieldPrivatedescseg4) {
		this.descflexfieldPrivatedescseg4 = descflexfieldPrivatedescseg4;
	}

	public String getDescflexfieldPrivatedescseg5() {
		return descflexfieldPrivatedescseg5;
	}

	public void setDescflexfieldPrivatedescseg5(String descflexfieldPrivatedescseg5) {
		this.descflexfieldPrivatedescseg5 = descflexfieldPrivatedescseg5;
	}

	public String getDescflexfieldPrivatedescseg6() {
		return descflexfieldPrivatedescseg6;
	}

	public void setDescflexfieldPrivatedescseg6(String descflexfieldPrivatedescseg6) {
		this.descflexfieldPrivatedescseg6 = descflexfieldPrivatedescseg6;
	}

	public String getDescflexfieldPrivatedescseg7() {
		return descflexfieldPrivatedescseg7;
	}

	public void setDescflexfieldPrivatedescseg7(String descflexfieldPrivatedescseg7) {
		this.descflexfieldPrivatedescseg7 = descflexfieldPrivatedescseg7;
	}

	public String getDescflexfieldPrivatedescseg8() {
		return descflexfieldPrivatedescseg8;
	}

	public void setDescflexfieldPrivatedescseg8(String descflexfieldPrivatedescseg8) {
		this.descflexfieldPrivatedescseg8 = descflexfieldPrivatedescseg8;
	}

	public String getDescflexfieldPrivatedescseg9() {
		return descflexfieldPrivatedescseg9;
	}

	public void setDescflexfieldPrivatedescseg9(String descflexfieldPrivatedescseg9) {
		this.descflexfieldPrivatedescseg9 = descflexfieldPrivatedescseg9;
	}

	public String getDescflexfieldPrivatedescseg10() {
		return descflexfieldPrivatedescseg10;
	}

	public void setDescflexfieldPrivatedescseg10(String descflexfieldPrivatedescseg10) {
		this.descflexfieldPrivatedescseg10 = descflexfieldPrivatedescseg10;
	}

	public String getDescflexfieldPrivatedescseg11() {
		return descflexfieldPrivatedescseg11;
	}

	public void setDescflexfieldPrivatedescseg11(String descflexfieldPrivatedescseg11) {
		this.descflexfieldPrivatedescseg11 = descflexfieldPrivatedescseg11;
	}

	public String getDescflexfieldPrivatedescseg12() {
		return descflexfieldPrivatedescseg12;
	}

	public void setDescflexfieldPrivatedescseg12(String descflexfieldPrivatedescseg12) {
		this.descflexfieldPrivatedescseg12 = descflexfieldPrivatedescseg12;
	}

	public String getDescflexfieldPrivatedescseg13() {
		return descflexfieldPrivatedescseg13;
	}

	public void setDescflexfieldPrivatedescseg13(String descflexfieldPrivatedescseg13) {
		this.descflexfieldPrivatedescseg13 = descflexfieldPrivatedescseg13;
	}

	public String getDescflexfieldPrivatedescseg14() {
		return descflexfieldPrivatedescseg14;
	}

	public void setDescflexfieldPrivatedescseg14(String descflexfieldPrivatedescseg14) {
		this.descflexfieldPrivatedescseg14 = descflexfieldPrivatedescseg14;
	}

	public String getDescflexfieldPrivatedescseg15() {
		return descflexfieldPrivatedescseg15;
	}

	public void setDescflexfieldPrivatedescseg15(String descflexfieldPrivatedescseg15) {
		this.descflexfieldPrivatedescseg15 = descflexfieldPrivatedescseg15;
	}

	public String getDescflexfieldPrivatedescseg16() {
		return descflexfieldPrivatedescseg16;
	}

	public void setDescflexfieldPrivatedescseg16(String descflexfieldPrivatedescseg16) {
		this.descflexfieldPrivatedescseg16 = descflexfieldPrivatedescseg16;
	}

	public String getDescflexfieldPrivatedescseg17() {
		return descflexfieldPrivatedescseg17;
	}

	public void setDescflexfieldPrivatedescseg17(String descflexfieldPrivatedescseg17) {
		this.descflexfieldPrivatedescseg17 = descflexfieldPrivatedescseg17;
	}

	public String getDescflexfieldPrivatedescseg18() {
		return descflexfieldPrivatedescseg18;
	}

	public void setDescflexfieldPrivatedescseg18(String descflexfieldPrivatedescseg18) {
		this.descflexfieldPrivatedescseg18 = descflexfieldPrivatedescseg18;
	}

	public String getDescflexfieldPrivatedescseg19() {
		return descflexfieldPrivatedescseg19;
	}

	public void setDescflexfieldPrivatedescseg19(String descflexfieldPrivatedescseg19) {
		this.descflexfieldPrivatedescseg19 = descflexfieldPrivatedescseg19;
	}

	public String getDescflexfieldPrivatedescseg20() {
		return descflexfieldPrivatedescseg20;
	}

	public void setDescflexfieldPrivatedescseg20(String descflexfieldPrivatedescseg20) {
		this.descflexfieldPrivatedescseg20 = descflexfieldPrivatedescseg20;
	}

	public String getDescflexfieldPrivatedescseg21() {
		return descflexfieldPrivatedescseg21;
	}

	public void setDescflexfieldPrivatedescseg21(String descflexfieldPrivatedescseg21) {
		this.descflexfieldPrivatedescseg21 = descflexfieldPrivatedescseg21;
	}

	public String getDescflexfieldPrivatedescseg22() {
		return descflexfieldPrivatedescseg22;
	}

	public void setDescflexfieldPrivatedescseg22(String descflexfieldPrivatedescseg22) {
		this.descflexfieldPrivatedescseg22 = descflexfieldPrivatedescseg22;
	}

	public String getDescflexfieldPrivatedescseg23() {
		return descflexfieldPrivatedescseg23;
	}

	public void setDescflexfieldPrivatedescseg23(String descflexfieldPrivatedescseg23) {
		this.descflexfieldPrivatedescseg23 = descflexfieldPrivatedescseg23;
	}

	public String getDescflexfieldPrivatedescseg24() {
		return descflexfieldPrivatedescseg24;
	}

	public void setDescflexfieldPrivatedescseg24(String descflexfieldPrivatedescseg24) {
		this.descflexfieldPrivatedescseg24 = descflexfieldPrivatedescseg24;
	}

	public String getDescflexfieldPrivatedescseg25() {
		return descflexfieldPrivatedescseg25;
	}

	public void setDescflexfieldPrivatedescseg25(String descflexfieldPrivatedescseg25) {
		this.descflexfieldPrivatedescseg25 = descflexfieldPrivatedescseg25;
	}

	public String getDescflexfieldPrivatedescseg26() {
		return descflexfieldPrivatedescseg26;
	}

	public void setDescflexfieldPrivatedescseg26(String descflexfieldPrivatedescseg26) {
		this.descflexfieldPrivatedescseg26 = descflexfieldPrivatedescseg26;
	}

	public String getDescflexfieldPrivatedescseg27() {
		return descflexfieldPrivatedescseg27;
	}

	public void setDescflexfieldPrivatedescseg27(String descflexfieldPrivatedescseg27) {
		this.descflexfieldPrivatedescseg27 = descflexfieldPrivatedescseg27;
	}

	public String getDescflexfieldPrivatedescseg28() {
		return descflexfieldPrivatedescseg28;
	}

	public void setDescflexfieldPrivatedescseg28(String descflexfieldPrivatedescseg28) {
		this.descflexfieldPrivatedescseg28 = descflexfieldPrivatedescseg28;
	}

	public String getDescflexfieldPrivatedescseg29() {
		return descflexfieldPrivatedescseg29;
	}

	public void setDescflexfieldPrivatedescseg29(String descflexfieldPrivatedescseg29) {
		this.descflexfieldPrivatedescseg29 = descflexfieldPrivatedescseg29;
	}

	public String getDescflexfieldPrivatedescseg30() {
		return descflexfieldPrivatedescseg30;
	}

	public void setDescflexfieldPrivatedescseg30(String descflexfieldPrivatedescseg30) {
		this.descflexfieldPrivatedescseg30 = descflexfieldPrivatedescseg30;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMiscrcvdoctype() {
		return miscrcvdoctype;
	}

	public void setMiscrcvdoctype(String miscrcvdoctype) {
		this.miscrcvdoctype = miscrcvdoctype;
	}

	public Integer getGlclose() {
		return glclose;
	}

	public void setGlclose(Integer glclose) {
		this.glclose = glclose;
	}

	public Integer getWfcurrentstate() {
		return wfcurrentstate;
	}

	public void setWfcurrentstate(Integer wfcurrentstate) {
		this.wfcurrentstate = wfcurrentstate;
	}

	public Integer getWforiginalstate() {
		return wforiginalstate;
	}

	public void setWforiginalstate(Integer wforiginalstate) {
		this.wforiginalstate = wforiginalstate;
	}

	public String getSobaccountperiod() {
		return sobaccountperiod;
	}

	public void setSobaccountperiod(String sobaccountperiod) {
		this.sobaccountperiod = sobaccountperiod;
	}

	public Integer getCurraction() {
		return curraction;
	}

	public void setCurraction(Integer curraction) {
		this.curraction = curraction;
	}

	public String getApprovedby() {
		return approvedby;
	}

	public void setApprovedby(String approvedby) {
		this.approvedby = approvedby;
	}

	public String getApprovedon() {
		return approvedon;
	}

	public void setApprovedon(String approvedon) {
		this.approvedon = approvedon;
	}

	public String getCancelapprovedby() {
		return cancelapprovedby;
	}

	public void setCancelapprovedby(String cancelapprovedby) {
		this.cancelapprovedby = cancelapprovedby;
	}

	public String getCancelapprovedon() {
		return cancelapprovedon;
	}

	public void setCancelapprovedon(String cancelapprovedon) {
		this.cancelapprovedon = cancelapprovedon;
	}

	public String getGlclosedon() {
		return glclosedon;
	}

	public void setGlclosedon(String glclosedon) {
		this.glclosedon = glclosedon;
	}

	public Integer getDummyrecede() {
		return dummyrecede;
	}

	public void setDummyrecede(Integer dummyrecede) {
		this.dummyrecede = dummyrecede;
	}

	public Integer getIsuncreateaai() {
		return isuncreateaai;
	}

	public void setIsuncreateaai(Integer isuncreateaai) {
		this.isuncreateaai = isuncreateaai;
	}

	public Integer getSrcdoctype() {
		return srcdoctype;
	}

	public void setSrcdoctype(Integer srcdoctype) {
		this.srcdoctype = srcdoctype;
	}

	public String getBenefitorg() {
		return benefitorg;
	}

	public void setBenefitorg(String benefitorg) {
		this.benefitorg = benefitorg;
	}

	public String getBenefitpsn() {
		return benefitpsn;
	}

	public void setBenefitpsn(String benefitpsn) {
		this.benefitpsn = benefitpsn;
	}

	public String getHandlepsn() {
		return handlepsn;
	}

	public void setHandlepsn(String handlepsn) {
		this.handlepsn = handlepsn;
	}

	public String getWhman() {
		return whman;
	}

	public void setWhman(String whman) {
		this.whman = whman;
	}

	public Integer getIsfromsrccost() {
		return isfromsrccost;
	}

	public void setIsfromsrccost(Integer isfromsrccost) {
		this.isfromsrccost = isfromsrccost;
	}

	public Integer getReversemiscrcv() {
		return reversemiscrcv;
	}

	public void setReversemiscrcv(Integer reversemiscrcv) {
		this.reversemiscrcv = reversemiscrcv;
	}

	public Integer getIstransfer() {
		return istransfer;
	}

	public void setIstransfer(Integer istransfer) {
		this.istransfer = istransfer;
	}

	public String getFlowinstance() {
		return flowinstance;
	}

	public void setFlowinstance(String flowinstance) {
		this.flowinstance = flowinstance;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
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

	@Override
	public String toString() {
		return "Miscrcvtrans [id=" + id + ", order=" + order + ", applicant=" + applicant + ", applicantName="
				+ applicantName + ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", modifiedOn=" + modifiedOn
				+ ", modifiedBy=" + modifiedBy + ", sysversion=" + sysversion + ", org=" + org + ", docno=" + docno
				+ ", businessdate=" + businessdate + ", version=" + version + ", printamount=" + printamount
				+ ", latestprinteddate=" + latestprinteddate + ", cancelCanceled=" + cancelCanceled
				+ ", cancelCanceldate=" + cancelCanceldate + ", cancelCancelreason=" + cancelCancelreason
				+ ", cancelCanceluser=" + cancelCanceluser + ", workflowid=" + workflowid + ", statemachineid="
				+ statemachineid + ", holdreason=" + holdreason + ", holduser=" + holduser + ", holddate=" + holddate
				+ ", releasereason=" + releasereason + ", releaseuser=" + releaseuser + ", releasedate=" + releasedate
				+ ", descflexfieldPubdescseg1=" + descflexfieldPubdescseg1 + ", descflexfieldPubdescseg2="
				+ descflexfieldPubdescseg2 + ", descflexfieldPubdescseg3=" + descflexfieldPubdescseg3
				+ ", descflexfieldPubdescseg4=" + descflexfieldPubdescseg4 + ", descflexfieldPubdescseg5="
				+ descflexfieldPubdescseg5 + ", descflexfieldPubdescseg6=" + descflexfieldPubdescseg6
				+ ", descflexfieldPubdescseg7=" + descflexfieldPubdescseg7 + ", descflexfieldPubdescseg8="
				+ descflexfieldPubdescseg8 + ", descflexfieldPubdescseg9=" + descflexfieldPubdescseg9
				+ ", descflexfieldPubdescseg10=" + descflexfieldPubdescseg10 + ", descflexfieldPubdescseg11="
				+ descflexfieldPubdescseg11 + ", descflexfieldPubdescseg12=" + descflexfieldPubdescseg12
				+ ", descflexfieldPubdescseg13=" + descflexfieldPubdescseg13 + ", descflexfieldPubdescseg14="
				+ descflexfieldPubdescseg14 + ", descflexfieldPubdescseg15=" + descflexfieldPubdescseg15
				+ ", descflexfieldPubdescseg16=" + descflexfieldPubdescseg16 + ", descflexfieldPubdescseg17="
				+ descflexfieldPubdescseg17 + ", descflexfieldPubdescseg18=" + descflexfieldPubdescseg18
				+ ", descflexfieldPubdescseg19=" + descflexfieldPubdescseg19 + ", descflexfieldPubdescseg20="
				+ descflexfieldPubdescseg20 + ", descflexfieldPubdescseg21=" + descflexfieldPubdescseg21
				+ ", descflexfieldPubdescseg22=" + descflexfieldPubdescseg22 + ", descflexfieldPubdescseg23="
				+ descflexfieldPubdescseg23 + ", descflexfieldPubdescseg24=" + descflexfieldPubdescseg24
				+ ", descflexfieldPubdescseg25=" + descflexfieldPubdescseg25 + ", descflexfieldPubdescseg26="
				+ descflexfieldPubdescseg26 + ", descflexfieldPubdescseg27=" + descflexfieldPubdescseg27
				+ ", descflexfieldPubdescseg28=" + descflexfieldPubdescseg28 + ", descflexfieldPubdescseg29="
				+ descflexfieldPubdescseg29 + ", descflexfieldPubdescseg30=" + descflexfieldPubdescseg30
				+ ", descflexfieldPubdescseg31=" + descflexfieldPubdescseg31 + ", descflexfieldPubdescseg32="
				+ descflexfieldPubdescseg32 + ", descflexfieldPubdescseg33=" + descflexfieldPubdescseg33
				+ ", descflexfieldPubdescseg34=" + descflexfieldPubdescseg34 + ", descflexfieldPubdescseg35="
				+ descflexfieldPubdescseg35 + ", descflexfieldPubdescseg36=" + descflexfieldPubdescseg36
				+ ", descflexfieldPubdescseg37=" + descflexfieldPubdescseg37 + ", descflexfieldPubdescseg38="
				+ descflexfieldPubdescseg38 + ", descflexfieldPubdescseg39=" + descflexfieldPubdescseg39
				+ ", descflexfieldPubdescseg40=" + descflexfieldPubdescseg40 + ", descflexfieldPubdescseg41="
				+ descflexfieldPubdescseg41 + ", descflexfieldPubdescseg42=" + descflexfieldPubdescseg42
				+ ", descflexfieldPubdescseg43=" + descflexfieldPubdescseg43 + ", descflexfieldPubdescseg44="
				+ descflexfieldPubdescseg44 + ", descflexfieldPubdescseg45=" + descflexfieldPubdescseg45
				+ ", descflexfieldPubdescseg46=" + descflexfieldPubdescseg46 + ", descflexfieldPubdescseg47="
				+ descflexfieldPubdescseg47 + ", descflexfieldPubdescseg48=" + descflexfieldPubdescseg48
				+ ", descflexfieldPubdescseg49=" + descflexfieldPubdescseg49 + ", descflexfieldPubdescseg50="
				+ descflexfieldPubdescseg50 + ", descflexfieldContextvalue=" + descflexfieldContextvalue
				+ ", descflexfieldPrivatedescseg1=" + descflexfieldPrivatedescseg1 + ", descflexfieldPrivatedescseg2="
				+ descflexfieldPrivatedescseg2 + ", descflexfieldPrivatedescseg3=" + descflexfieldPrivatedescseg3
				+ ", descflexfieldPrivatedescseg4=" + descflexfieldPrivatedescseg4 + ", descflexfieldPrivatedescseg5="
				+ descflexfieldPrivatedescseg5 + ", descflexfieldPrivatedescseg6=" + descflexfieldPrivatedescseg6
				+ ", descflexfieldPrivatedescseg7=" + descflexfieldPrivatedescseg7 + ", descflexfieldPrivatedescseg8="
				+ descflexfieldPrivatedescseg8 + ", descflexfieldPrivatedescseg9=" + descflexfieldPrivatedescseg9
				+ ", descflexfieldPrivatedescseg10=" + descflexfieldPrivatedescseg10
				+ ", descflexfieldPrivatedescseg11=" + descflexfieldPrivatedescseg11
				+ ", descflexfieldPrivatedescseg12=" + descflexfieldPrivatedescseg12
				+ ", descflexfieldPrivatedescseg13=" + descflexfieldPrivatedescseg13
				+ ", descflexfieldPrivatedescseg14=" + descflexfieldPrivatedescseg14
				+ ", descflexfieldPrivatedescseg15=" + descflexfieldPrivatedescseg15
				+ ", descflexfieldPrivatedescseg16=" + descflexfieldPrivatedescseg16
				+ ", descflexfieldPrivatedescseg17=" + descflexfieldPrivatedescseg17
				+ ", descflexfieldPrivatedescseg18=" + descflexfieldPrivatedescseg18
				+ ", descflexfieldPrivatedescseg19=" + descflexfieldPrivatedescseg19
				+ ", descflexfieldPrivatedescseg20=" + descflexfieldPrivatedescseg20
				+ ", descflexfieldPrivatedescseg21=" + descflexfieldPrivatedescseg21
				+ ", descflexfieldPrivatedescseg22=" + descflexfieldPrivatedescseg22
				+ ", descflexfieldPrivatedescseg23=" + descflexfieldPrivatedescseg23
				+ ", descflexfieldPrivatedescseg24=" + descflexfieldPrivatedescseg24
				+ ", descflexfieldPrivatedescseg25=" + descflexfieldPrivatedescseg25
				+ ", descflexfieldPrivatedescseg26=" + descflexfieldPrivatedescseg26
				+ ", descflexfieldPrivatedescseg27=" + descflexfieldPrivatedescseg27
				+ ", descflexfieldPrivatedescseg28=" + descflexfieldPrivatedescseg28
				+ ", descflexfieldPrivatedescseg29=" + descflexfieldPrivatedescseg29
				+ ", descflexfieldPrivatedescseg30=" + descflexfieldPrivatedescseg30 + ", status=" + status
				+ ", miscrcvdoctype=" + miscrcvdoctype + ", glclose=" + glclose + ", wfcurrentstate=" + wfcurrentstate
				+ ", wforiginalstate=" + wforiginalstate + ", sobaccountperiod=" + sobaccountperiod + ", curraction="
				+ curraction + ", approvedby=" + approvedby + ", approvedon=" + approvedon + ", cancelapprovedby="
				+ cancelapprovedby + ", cancelapprovedon=" + cancelapprovedon + ", glclosedon=" + glclosedon
				+ ", dummyrecede=" + dummyrecede + ", isuncreateaai=" + isuncreateaai + ", srcdoctype=" + srcdoctype
				+ ", benefitorg=" + benefitorg + ", benefitpsn=" + benefitpsn + ", handlepsn=" + handlepsn + ", whman="
				+ whman + ", isfromsrccost=" + isfromsrccost + ", reversemiscrcv=" + reversemiscrcv + ", istransfer="
				+ istransfer + ", flowinstance=" + flowinstance + ", dr=" + dr + "]";
	}
}