package com.caijai.data.entity;

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
public class Unit extends BaseTable {

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
	
	/**
	 * 编码
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 简称
	 */
	@Column(name = "ShortName")
	private String shortName;

	/**
	 * 主副单位转换率
	 */
	@Column(name = "RatioToBase")
	private Double ratioToBase;

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
	 * 单位组
	 */
	@Column(name = "UOMClass")
	private Integer uomClass;

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
	@Column(name = "CreatedOn", sort = Sort.DESC)
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
	 * 基准单位
	 */
	@Column(name = "IsBase")
	private Integer isBase;

	/**
	 * 作废标识
	 */
	@Column(name = "dr")
	private Integer dr;
	
	@Column(name = "ts")
	private String ts;
	
	/**
	 * Round_Precision
	 */
	@Column(name = "Round_Precision")
	private Integer precision;
	
	/**
	 * Round_Precision
	 */
	@Column(name = "Round_RoundType")
	private Integer Round_RoundType;
	
	/**
	 * Round_Precision
	 */
	@Column(name = "Round_Precision")
	private Integer roundValue;

	/**
	 * 失效日期
	 */
	@Column(name = "Effective_DisableDate")
	private String disableDate;
	
	/**
	 * 生效日期
	 */
	@Column(name = "Effective_EffectiveDate")
	private String effectiveDate;

	/**
	 * 自定义1
	 */
	@Column(name = "DescFlexField_PubDescSeg1")
	private String pubDescSeg1;

	/**
	 * 自定义2
	 */
	@Column(name = "DescFlexField_PubDescSeg2")
	private String pubDescSeg2;

	/**
	 * 自定义3
	 */
	@Column(name = "DescFlexField_PubDescSeg3")
	private String pubDescSeg3;

	/**
	 * 自定义4
	 */
	@Column(name = "DescFlexField_PubDescSeg4")
	private String pubDescSeg4;

	/**
	 * 自定义5
	 */
	@Column(name = "DescFlexField_PubDescSeg5")
	private String pubDescSeg5;

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

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Double getRatioToBase() {
		return ratioToBase;
	}

	public void setRatioToBase(Double ratioToBase) {
		this.ratioToBase = ratioToBase;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
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

	public Integer getUomClass() {
		return uomClass;
	}

	public void setUomClass(Integer uomClass) {
		this.uomClass = uomClass;
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

	public Integer getIsBase() {
		return isBase;
	}

	public void setIsBase(Integer isBase) {
		this.isBase = isBase;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public Integer getPrecision() {
		return precision;
	}

	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	public Integer getRound_RoundType() {
		return Round_RoundType;
	}

	public void setRound_RoundType(Integer round_RoundType) {
		Round_RoundType = round_RoundType;
	}

	public Integer getRoundValue() {
		return roundValue;
	}

	public void setRoundValue(Integer roundValue) {
		this.roundValue = roundValue;
	}

	public String getDisableDate() {
		return disableDate;
	}

	public void setDisableDate(String disableDate) {
		this.disableDate = disableDate;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getPubDescSeg1() {
		return pubDescSeg1;
	}

	public void setPubDescSeg1(String pubDescSeg1) {
		this.pubDescSeg1 = pubDescSeg1;
	}

	public String getPubDescSeg2() {
		return pubDescSeg2;
	}

	public void setPubDescSeg2(String pubDescSeg2) {
		this.pubDescSeg2 = pubDescSeg2;
	}

	public String getPubDescSeg3() {
		return pubDescSeg3;
	}

	public void setPubDescSeg3(String pubDescSeg3) {
		this.pubDescSeg3 = pubDescSeg3;
	}

	public String getPubDescSeg4() {
		return pubDescSeg4;
	}

	public void setPubDescSeg4(String pubDescSeg4) {
		this.pubDescSeg4 = pubDescSeg4;
	}

	public String getPubDescSeg5() {
		return pubDescSeg5;
	}

	public void setPubDescSeg5(String pubDescSeg5) {
		this.pubDescSeg5 = pubDescSeg5;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}