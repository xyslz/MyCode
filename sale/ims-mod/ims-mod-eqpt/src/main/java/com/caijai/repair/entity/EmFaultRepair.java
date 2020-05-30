package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;

/**
 * 维修方案子表
 * @author duan2
 *
 */
@Table(name="EQ_EmFaultRepair")
public class EmFaultRepair extends BaseTable{

	private static final long serialVersionUID = -5433152818030419952L;

	@Column(name = "ID",primary = true)
	private String id;
	
	/**
	 * 故障主表
	 */
	@Column(name = "EmFault")
	private String emFault;
	
	/**
	 * 序列
	 */
	@Column(name = "No",sort=Sort.ASC)
	private Integer no;
	
	/**
	 * 维修描述
	 */
	@Column(name = "RepairDesc")
	private String repairDesc;
	
	/**
	 * 所用工具
	 */
	@Column(name = "Tools")
	private String tools;
	
	/**
	 * 图片
	 */
	@Column(name = "Image")
	private String image;
	
	/**
	 * 文件
	 */
	@Column(name = "file")
	private String file;
	
	/**
	 * 备注
	 */
	@Column(name = "Memo")
	private String memo;
	
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
	@Column(name = "CreatedOn")
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
	
	@Column(name = "def1")
	private String def1;
	
	@Column(name = "def2")
	private String def2;
	
	@Column(name = "def3")
	private String def3;
	
	@Column(name = "def4")
	private String def4;
	
	@Column(name = "def5")
	private String def5;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmFault() {
		return emFault;
	}

	public void setEmFault(String emFault) {
		this.emFault = emFault;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getRepairDesc() {
		return repairDesc;
	}

	public void setRepairDesc(String repairDesc) {
		this.repairDesc = repairDesc;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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
		return "EmFaultRepair [id=" + id + ", emFault=" + emFault + ", no=" + no + ", repairDesc=" + repairDesc
				+ ", tools=" + tools + ", memo=" + memo + ", org=" + org + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", dr=" + dr + ", ts=" + ts
				+ ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + ", def4=" + def4 + ", def5=" + def5 + "]";
	}

}
