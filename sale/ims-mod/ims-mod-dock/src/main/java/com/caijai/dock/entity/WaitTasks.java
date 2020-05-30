package com.caijai.dock.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.RealOff;
import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.sysenum.Sort;
import com.caijai.base.sysenum.TypeOff;

/**
 * Title: WaitSolveTasks
 * <p>
 * Description:待处理任务 <br>
 * 调用U9接口执行不生效或执行失败时,将任务存入待处理表中,系统会定时查询待处理任务,并执行.
 * 
 * @author 杨雪景
 * @date 2019年02月22日
 */
@Table(name = "BD_WaitTasks")
public class WaitTasks extends BaseTable {

	private static final long serialVersionUID = -5821397658195651593L;

	/** ID */
	@Column(name = "ID", primary = true)
	private String id;

	/** 编码 */
	@Column(name = "code")
	private String code;

	/** 名称 */
	@Column(name = "name")
	private String name;

	/** 执行任务 */
	@Column(name = "stProcedure")
	private String stProcedure;

	/** 系统预置 */
	@Column(name = "sysPreset")
	private String sysPreset;

	/** 备注 */
	@Column(name = "remark")
	private String remark;

	/** 处理状态 */
	@Column(name = "RealTimeState")
	private RealOff realTimeState;

	/** 处理时间 */
	@Column(name = "HadSolveTime")
	private String HadSolveTime;

	/** 任务类型 */
	@Column(name = "taskType")
	private TypeOff taskType;

	/** 订单ID */
	@Column(name = "orderId")
	private String orderId;

	/** 订单编码 */
	@Column(name = "orderNum")
	private String orderNum;

	/** 执行人 */
	@Column(name = "ExecuteBy")
	private String executeBy;

	/** 执行时间 */
	@Column(name = "ExecuteOn")
	private String executeOn;
	
	/** 执行次数 */
	@Column(name = "ExecuteTimes")
	private Integer executeTimes;
	
	/** 执行结果 */
	@Column(name = "ExecRes")
	private String execRes;

	/** 是脱机数据还是非脱机数据 */
	@Column(name = "isOffline")
	private SYSSET isOffline;
	
	/** 是任务单据来源(大类型)  区别采购和完工 */
	@Column(name = "Source")
	private String source;

	/** 删除标识 */
	@Column(name = "Dr")
	private Integer dr;

	/** 时间戳 */
	@Column(name = "Ts")
	private String ts;

	/** 创建时间 */
	@Column(name = "CreatedOn",sort=Sort.ASC)
	private String createdOn;

	/** 创建人 */
	@Column(name = "CreatedBy")
	private String createdBy;

	/** 修改时间 */
	@Column(name = "ModifiedOn")
	private String modifiedOn;

	/** 修改人 */
	@Column(name = "ModifiedBy")
	private String modifiedBy;

	/** 组织ID */
	@Column(name = "Org")
	private String org;

	/** 预留字段1 */
	@Column(name = "Def1")
	private String def1;

	/** 预留字段1 */
	@Column(name = "Def2")
	private String def2;

	/** 预留字段1 */
	@Column(name = "Def3")
	private String def3;

	/** 预留字段1 */
	@Column(name = "Def4")
	private String def4;

	/** 预留字段1 */
	@Column(name = "Def5")
	private String def5;
	
	/** 开始时间 用于前台查询时间段*/
	private String startOn;
	
	/** 结束时间 用于前台查询时间段*/
	private String stopOn;

	public String getStartOn() {
		return startOn;
	}

	public void setStartOn(String startOn) {
		this.startOn = startOn;
	}

	public String getStopOn() {
		return stopOn;
	}

	public void setStopOn(String stopOn) {
		this.stopOn = stopOn;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStProcedure() {
		return stProcedure;
	}

	public void setStProcedure(String stProcedure) {
		this.stProcedure = stProcedure;
	}

	public String getSysPreset() {
		return sysPreset;
	}

	public void setSysPreset(String sysPreset) {
		this.sysPreset = sysPreset;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public RealOff getRealTimeState() {
		return realTimeState;
	}

	public void setRealTimeState(RealOff realTimeState) {
		this.realTimeState = realTimeState;
	}

	public String getHadSolveTime() {
		return HadSolveTime;
	}

	public void setHadSolveTime(String hadSolveTime) {
		HadSolveTime = hadSolveTime;
	}

	public TypeOff getTaskType() {
		return taskType;
	}

	public void setTaskType(TypeOff taskType) {
		this.taskType = taskType;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getExecuteBy() {
		return executeBy;
	}

	public void setExecuteBy(String executeBy) {
		this.executeBy = executeBy;
	}

	public String getExecuteOn() {
		return executeOn;
	}

	public void setExecuteOn(String executeOn) {
		this.executeOn = executeOn;
	}

	public Integer getExecuteTimes() {
		return executeTimes;
	}

	public void setExecuteTimes(Integer executeTimes) {
		this.executeTimes = executeTimes;
	}

	public String getExecRes() {
		return execRes;
	}

	public void setExecRes(String execRes) {
		this.execRes = execRes;
	}

	public SYSSET getIsOffline() {
		return isOffline;
	}

	public void setIsOffline(SYSSET isOffline) {
		this.isOffline = isOffline;
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

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
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
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "WaitTasks [id=" + id + ", code=" + code + ", name=" + name + ", stProcedure=" + stProcedure
				+ ", sysPreset=" + sysPreset + ", remark=" + remark + ", realTimeState=" + realTimeState
				+ ", HadSolveTime=" + HadSolveTime + ", taskType=" + taskType + ", orderId=" + orderId + ", orderNum="
				+ orderNum + ", executeBy=" + executeBy + ", executeOn=" + executeOn + ", executeTimes=" + executeTimes
				+ ", execRes=" + execRes + ", isOffline=" + isOffline + ", dr=" + dr + ", ts=" + ts + ", createdOn="
				+ createdOn + ", createdBy=" + createdBy + ", modifiedOn=" + modifiedOn + ", modifiedBy=" + modifiedBy
				+ ", org=" + org + ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + ", def4=" + def4 + ", def5="
				+ def5 + ", startOn=" + startOn + ", stopOn=" + stopOn + "]";
	}
}
