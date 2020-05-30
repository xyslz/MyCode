package com.caijai.eqpt.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.U9STATE;

/**
 * 设备参数绑定
 * 
 * @author ChenYu
 *
 */
@Table(name = "eq_ParameterBinding")
public class EmParamBind extends BaseTable {

	private static final long serialVersionUID = -4486752991378452794L;

	@Column(name = "bindID", primary = true)
	private String id; // 主键

	@Column(name = "emcode")
	private String emcode; // 设备编码
	
	@Column(name = "emname")
	private String emname; // 设备名称

	@Column(name = "equiTempNo")
	private String equiTempNo; // 设备参数编码
	
	@Column(name = "equiTempName")
	private String equiTempName; // 设备参数名称

	@Column(name = "isstate")
	private U9STATE isstate; // 生效

	@Column(name = "org")
	private String org;// 所属公司
	
	@Column(name = "creator")
	private String createdBy; // 创建人

	@Column(name = "createTime")
	private String createdOn; // 创建时间

	@Column(name = "modifier")
	private String modifiedBy; // 修改人

	@Column(name = "modifyTime")
	private String modifiedOn; // 修改时间

	@Column(name = "dr")
	private Integer dr; // 作废标识

	@Column(name = "ts")
	private String ts; // 时间戳

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

	public String getEquiTempNo() {
		return equiTempNo;
	}

	public void setEquiTempNo(String equiTempNo) {
		this.equiTempNo = equiTempNo;
	}

	public String getEquiTempName() {
		return equiTempName;
	}

	public void setEquiTempName(String equiTempName) {
		this.equiTempName = equiTempName;
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
		return "EmParamBind [id=" + id + ", emcode=" + emcode + ", emname=" + emname + ", equiTempNo=" + equiTempNo
				+ ", equiTempName=" + equiTempName + ", isstate=" + isstate + ", org=" + org + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn
				+ ", dr=" + dr + ", ts=" + ts + ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + ", def4="
				+ def4 + ", def5=" + def5 + "]";
	}


}
