package com.caijai.eqpt.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseEntity;
import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.sysenum.U9STATE;

/**
 * 设备参数模板
 * 
 * @author ChenYu
 *
 */
@Table(name = "eq_parameter")
public class EmParam extends BaseEntity {

	private static final long serialVersionUID = 3594525639062435627L;

	@Column(name = "id", primary = true)
	private String id; 

	@Column(name="equiTempNo")
	private String equiTempNo;// 编码
	
	@Column(name = "equiTempName")
	private String equiTempName; // 名称

	@Column(name = "remark")
	private String remark; // 备注

	@Column(name = "isState")
	private U9STATE isState; // 生效

	@Column(name = "sysPreset")
	private SYSSET sysPreset; // 系统预制

	@Column(name = "creator")
	private String creator; // 创建人

	@Column(name = "createTime")
	private String createTime; // 创建时间

	@Column(name = "modifier")
	private String modifier; // 修改人

	@Column(name = "modifyTime")
	private String modifyTime; // 修改时间

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

	@Column(name = "company")
	private String org;// 集团

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public U9STATE getIsState() {
		return isState;
	}

	public void setIsState(U9STATE isState) {
		this.isState = isState;
	}

	public SYSSET getSysPreset() {
		return sysPreset;
	}

	public void setSysPreset(SYSSET sysPreset) {
		this.sysPreset = sysPreset;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
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

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	@Override
	public String toString() {
		return "EmParam [id=" + id + ", equiTempNo=" + equiTempNo + ", equiTempName=" + equiTempName + ", remark="
				+ remark + ", isState=" + isState + ", sysPreset=" + sysPreset + ", creator=" + creator
				+ ", createTime=" + createTime + ", modifier=" + modifier + ", modifyTime=" + modifyTime + ", dr=" + dr
				+ ", ts=" + ts + ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + ", def4=" + def4 + ", def5="
				+ def5 + ", org=" + org + "]";
	}
	
}
