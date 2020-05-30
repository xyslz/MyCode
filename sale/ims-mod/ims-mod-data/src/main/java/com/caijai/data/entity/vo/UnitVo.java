package com.caijai.data.entity.vo;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;

/**
 * 计量单位
 * @author ChenYu
 *
 */
@Table(name = "BD_UOM")
public class UnitVo extends BaseTable {

	private static final long serialVersionUID = 501267294110170044L;
	
	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 编码
	 */
	@Column(name = "Code")
	private String code;
	
	@Column(name = "ShortName")
	private String shortName;

	/**
	 * 简称
	 */
	@Column(name = "Name")
	private String name;

	/**
	 * 单位组
	 */
	@Column(name = "UOMClass")
	private Integer uomClass;

	/**
	 * 主副单位转换率
	 */
	@Column(name = "RatioToBase")
	private Double ratioToBase;

	/**
	 * 基准单位
	 */
	@Column(name = "IsBase")
	private Integer isBase;

	/**
	 * 副单位
	 */
	@Column(name = "BaseUOM")
	private String baseUOM;

	/**
	 * 站点
	 */
	@Column(name = "MasterSite")
	private String masterSite;

	/**
	 * 系统版本
	 */
	@Column(name = "SysVersion")
	private String sysVersion;

	/**
	 * 创建人
	 */
	@Column(name = "CreatedBy")
	private String createdBy;

	/**
	 * 创建时间
	 */
	@Column(name = "CreatedOn" , sort = Sort.DESC)
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
	
	@Column(name = "ts")
	private String ts;
	
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

	public Integer getUomClass() {
		return uomClass;
	}

	public void setUomClass(Integer uomClass) {
		this.uomClass = uomClass;
	}

	public Double getRatioToBase() {
		return ratioToBase;
	}

	public void setRatioToBase(Double ratioToBase) {
		this.ratioToBase = ratioToBase;
	}

	public Integer getIsBase() {
		return isBase;
	}

	public void setIsBase(Integer isBase) {
		this.isBase = isBase;
	}

	public String getBaseUOM() {
		return baseUOM;
	}

	public void setBaseUOM(String baseUOM) {
		this.baseUOM = baseUOM;
	}

	public String getMasterSite() {
		return masterSite;
	}

	public void setMasterSite(String masterSite) {
		this.masterSite = masterSite;
	}

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
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

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}