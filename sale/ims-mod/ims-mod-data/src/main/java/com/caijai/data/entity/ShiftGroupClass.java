package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.SYSSET;

/**
 * 班组分类
 * @author ChenYu
 *
 */
@Table(name = "bd_ShiftGroupClass")
public class ShiftGroupClass extends BaseTable{

	private static final long serialVersionUID = -302806555079285683L;
	
	/**
	 * 主键
	 */
	@Column(name = "id", primary = true)
	private String id;
	
	/**
	 * 分类编码
	 */
	@Column(name = "cid")
	private String cid;
	
	/**
	 * 分类名称
	 */
	@Column(name = "className")
	private String className;
	
	/**
	 * 是否为维修班组
	 */
	@Column(name = "isMaintainTeam")
	private Integer isMaintainTeam;
	
	/**
	 * 是否启用
	 */
	@Column(name = "isstate")
	private SYSSET isstate;
	
	/**
	 * 作废标识
	 */
	@Column(name = "dr")
	private Integer dr;
	
	/**
	 * 创建时间
	 */
	@Column(name = "createdOn")
	private String createdOn;
	
	/**
	 * 创建人
	 */
	@Column(name = "createdBy")
	private String createdBy;
	
	/**
	 * 修改时间
	 */
	@Column(name = "modifiedOn")
	private String modifiedOn;
	
	/**
	 * 修改人
	 */
	@Column(name = "modifiedBy")
	private String modifiedBy;
	
	/**
	 * 时间戳
	 */
	@Column(name = "ts")
	private String ts;
	
	/**
	 * 组织
	 */
	@Column(name = "org")
	private String org;
	
	/**
	 * 自定义1
	 */
	@Column(name = "def1")
	private String def1;
	
	/**
	 * 自定义2
	 */
	@Column(name = "def2")
	private String def2;
	
	/**
	 * 自定义3
	 */
	@Column(name = "def3")
	private String def3;
	
	/**
	 * 自定义4
	 */
	@Column(name = "def4")
	private String def4;
	
	/**
	 * 自定义5
	 */
	@Column(name = "def5")
	private String def5;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getIsMaintainTeam() {
		return isMaintainTeam;
	}

	public void setIsMaintainTeam(Integer isMaintainTeam) {
		this.isMaintainTeam = isMaintainTeam;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
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

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
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

	public SYSSET getIsstate() {
		return isstate;
	}

	public void setIsstate(SYSSET isstate) {
		this.isstate = isstate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
