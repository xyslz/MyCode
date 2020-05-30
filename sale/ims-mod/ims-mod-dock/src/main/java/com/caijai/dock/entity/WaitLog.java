package com.caijai.dock.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;

/**
 * 待处理任务执行记录
 * 
 * @author WHD
 *
 */
@Table(name = "BD_Wait_Log")
public class WaitLog extends BaseTable {

	private static final long serialVersionUID = -5821397658195651593L;

	/** 主键ID */
	@Column(name = "id",primary = true)
	private String id;

	/** 任务编码 */
	@Column(name = "waitCode")
	private String waitCode;

	/** 任务名称 */
	@Column(name = "waitName")
	private String waitName;

	/** 已执行次数 */
	@Column(name = "ExecuteTimes")
	private Integer executeTimes;

	/** 执行人 */
	@Column(name = "ExecuteBy")
	private String executeBy;

	/** 执行时间 */
	@Column(name = "ExecuteOn")
	private String executeOn;
	
	/** 执行结果 */
	@Column(name = "ExecRes")
	private String execRes;

	/** 备注 */
	@Column(name = "remark")
	private String remark;

	/** 删除标识 */
	@Column(name = "Dr")
	private Integer dr;

	/** 时间戳 */
	@Column(name = "Ts",sort=Sort.DESC)
	private String ts;

	/** 创建时间 */
	@Column(name = "CreatedOn")
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWaitCode() {
		return waitCode;
	}

	public void setWaitCode(String waitCode) {
		this.waitCode = waitCode;
	}

	public String getWaitName() {
		return waitName;
	}

	public void setWaitName(String waitName) {
		this.waitName = waitName;
	}


	public Integer getExecuteTimes() {
		return executeTimes;
	}

	public void setExecuteTimes(Integer executeTimes) {
		this.executeTimes = executeTimes;
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

	public String getExecRes() {
		return execRes;
	}

	public void setExecRes(String execRes) {
		this.execRes = execRes;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	@Override
	public String toString() {
		return "WaitLog [id=" + id + ", waitCode=" + waitCode + ", waitName=" + waitName + ", executeTimes="
				+ executeTimes + ", executeBy=" + executeBy + ", executeOn=" + executeOn + ", remark=" + remark
				+ ", dr=" + dr + ", ts=" + ts + ", createdOn=" + createdOn + ", createdBy=" + createdBy
				+ ", modifiedOn=" + modifiedOn + ", modifiedBy=" + modifiedBy + ", org=" + org + ", def1=" + def1
				+ ", def2=" + def2 + ", def3=" + def3 + ", def4=" + def4 + ", def5=" + def5 + "]";
	}

	
}
