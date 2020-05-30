package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Localization;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.wx.RepairState;
import com.caijai.base.sysenum.SYSSET;

/**
 * 报修单子表
 * 
 * @author duan2
 *
 */
@Table(name = "EQ_RepairOrderLine")
@Localization("报修单子表")
public class RepairOrderLine extends BaseTable {

	private static final long serialVersionUID = 2604609107273181729L;

	/**
	 * ID
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 报修单
	 */
	@Column(name = "repairOrder")
	private String repairOrder;
	
	/**
	 * 是否停机维修
	 */
	@Column(name = "isStopMaintenance",readonly = true)
	@Relation(table = "EQ_RepairOrder", value = "id", ref = "repairOrder", show = "isStopMaintenance")
	private SYSSET isStopMaintenance;

	/**
	 * 设备id
	 */
	@Column(name = "emid")
	private String emid;

	/**
	 * 设备编码
	 */
	@Localization("设备编码")
	@Column(name = "emcode", readonly = true)
	@Relation(table = "EQ_EM", value = "id", ref = "emid", show = "Code")
	private String emcode;

	/**
	 * 设备名称
	 */
	@Column(name = "emname", readonly = true)
	@Localization("设备名称")
	@Relation(table = "EQ_EM", value = "id", ref = "emid", show = "name")
	private String emname;

	/**
	 * 设备规格
	 */
	@Localization("设备规格")
	@Column(name = "emspecs", readonly = true)
	@Relation(table = "EQ_EM", value = "id", ref = "emid", show = "specs")
	private String emspecs;

	/**
	 * 计划开始时间
	 */
	@Localization("计划开始时间")
	@Column(name = "PlanStartTime")
	private String planStartTime;

	/**
	 * 计划完工时间
	 */
	@Localization("计划完工时间")
	@Column(name = "PlanEndTime")
	private String planEndTime;

	/**
	 * 开始时间
	 */
	@Localization("开始时间")
	@Column(name = "StartTime")
	private String startTime;

	/**
	 * 完工时间
	 */
	@Localization("完工时间")
	@Column(name = "EndTime")
	private String endTime;

	/**
	 * 故障id
	 */
	@Column(name = "FaultID")
	private String faultid;

	/**
	 * 故障码
	 */
	@Column(name = "FaultCode", readonly = true)
	@Relation(show = "code", table = "EQ_FaultCode", value = "ID", ref = "faultid")
	private String faultcode;

	/**
	 * 故障部位
	 */
	@Localization("故障部位")
	@Column(name = "FaultPart")
	private String faultpart;

	/**
	 * 故障描述
	 */
	@Localization("故障描述")
	@Column(name = "FaultDesc")
	private String faultdesc;

	/**
	 * 故障原因
	 */
	@Localization("故障原因")
	@Column(name = "Reason")
	private String reason;

	/**
	 * 维修处理描述
	 */
	@Localization("维修处理描述")
	@Column(name = "RepairDesc")
	private String repairdesc;

	/**
	 * 处理方式
	 */
	@Localization("处理方式")
	@Column(name = "RepairType")
	private String repairtype;

	/**
	 * 维修状态
	 */
	@Localization("维修状态")
	@Column(name = "RepairState")
	private RepairState repairState;

	/**
	 * 报修人员确认
	 */
	@Localization("报修人员确认")
	@Column(name = "Confirm")
	private String confirm;

	/**
	 * 确认日期
	 */
	@Localization("确认日期")
	@Column(name = "confirmDate")
	private String confirmDate;

	/**
	 * 是否转移
	 */
	@Localization("是否转移")
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
	@Localization("原产线")
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
	@Localization("现产线")
	@Column(name = "CurrentLineCode", readonly = true)
	@Relation(table = "EQ_ProductionLine", value = "id", show = "name", ref = "currentLine")
	private String currentLineCode;

	/**
	 * 备注
	 */
	@Localization("备注")
	@Column(name = "Meno")
	private String meno;

	/**
	 * 创建人
	 */
	@Localization("创建人")
	@Column(name = "CreatedBy")
	private String createdBy;

	/**
	 * 创建时间
	 */
	@Localization("创建时间")
	@Column(name = "CreatedOn")
	private String createdOn;

	/**
	 * 修改人
	 */
	@Localization("修改人")
	@Column(name = "ModifiedBy")
	private String modifiedBy;

	/**
	 * 修改时间
	 */
	@Localization("修改时间")
	@Column(name = "ModifiedOn")
	private String modifiedOn;

	/**
	 * 公司
	 */
	@Localization("公司")
	@Column(name = "Org")
	private String org;

	@Column(name = "dr")
	private Integer dr;

	@Column(name = "ts")
	private String ts;

	private String def1;

	private String def2;

	private String def3;

	private String def4;

	private String def5;

	private String def6;

	private String def7;

	private String def8;

	private String def9;

	private String def10;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRepairOrder() {
		return repairOrder;
	}

	public void setRepairOrder(String repairOrder) {
		this.repairOrder = repairOrder;
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

	public RepairState getRepairState() {
		return repairState;
	}

	public void setRepairState(RepairState repairState) {
		this.repairState = repairState;
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

	public String getDef1() {
		return def1;
	}

	public void setDef1(String def1) {
		this.def1 = def1;
	}

	public String getDef2() {
		return def2;
	}

	public void setDef2(String def2) {
		this.def2 = def2;
	}

	public String getDef3() {
		return def3;
	}

	public void setDef3(String def3) {
		this.def3 = def3;
	}

	public String getDef4() {
		return def4;
	}

	public void setDef4(String def4) {
		this.def4 = def4;
	}

	public String getDef5() {
		return def5;
	}

	public void setDef5(String def5) {
		this.def5 = def5;
	}

	public String getDef6() {
		return def6;
	}

	public void setDef6(String def6) {
		this.def6 = def6;
	}

	public String getDef7() {
		return def7;
	}

	public void setDef7(String def7) {
		this.def7 = def7;
	}

	public String getDef8() {
		return def8;
	}

	public void setDef8(String def8) {
		this.def8 = def8;
	}

	public String getDef9() {
		return def9;
	}

	public void setDef9(String def9) {
		this.def9 = def9;
	}

	public String getDef10() {
		return def10;
	}

	public void setDef10(String def10) {
		this.def10 = def10;
	}

	public SYSSET getIsStopMaintenance() {
		return isStopMaintenance;
	}

	public void setIsStopMaintenance(SYSSET isStopMaintenance) {
		this.isStopMaintenance = isStopMaintenance;
	}

	@Override
	public String toString() {
		return "RepairOrderLine [id=" + id + ", repairOrder=" + repairOrder + ", emid=" + emid + ", emcode=" + emcode
				+ ", emname=" + emname + ", emspecs=" + emspecs + ", planStartTime=" + planStartTime + ", planEndTime="
				+ planEndTime + ", startTime=" + startTime + ", endTime=" + endTime + ", faultid=" + faultid
				+ ", faultcode=" + faultcode + ", faultpart=" + faultpart + ", faultdesc=" + faultdesc + ", reason="
				+ reason + ", repairdesc=" + repairdesc + ", repairtype=" + repairtype + ", repairState=" + repairState
				+ ", confirm=" + confirm + ", confirmDate=" + confirmDate + ", ismove=" + ismove + ", originLine="
				+ originLine + ", originLineCode=" + originLineCode + ", currentLine=" + currentLine
				+ ", currentLineCode=" + currentLineCode + ", meno=" + meno + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", org="
				+ org + ", dr=" + dr + ", ts=" + ts + ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + ", def4="
				+ def4 + ", def5=" + def5 + ", def6=" + def6 + ", def7=" + def7 + ", def8=" + def8 + ", def9=" + def9
				+ ", def10=" + def10 + "]";
	}
}