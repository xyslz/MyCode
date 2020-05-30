package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.FmType;
import com.caijai.base.sysenum.STATE;

/**
 * 配方表
 * @author wdh
 *
 */

@Table(name = "PL_Formula_Elementpercent")
public class FormulaElementpercent extends BaseTable{
	
	private static final long serialVersionUID = 6205087166161382075L;

	@Column(name = "id",primary = true)
	private String id;
	
	@Column(name = "CreatedOn")
	private String createdOn;
	
	@Column(name = "CreatedBy")
	private String createdBy;
	
	@Column(name = "ModifiedOn")
	private String modifiedOn;
	
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	
	@Column(name = "SysVersion")
	private String sysVersion;
	
	@Column(name = "Org")
	private String org;
	
	@Column(name = "Dr")
	private Integer dr;
	
	@Column(name = "Ts")
	private String ts;
	
	@Column(name = "syncTs")
	private String syncTs;

	@Column(name = "SyncSourceID")
	private String syncSourceID;
	
	@Column(name = "SyncSource")
	private String syncSource;
	
	@Column(name = "SyncMemo")
	private String syncMemo;
	
	/** 配方关系ID */ 
	@Column(name = "ItemFormula")
	private String itemFormula;
	
	/** 配方编号 */
	@Column(name = "Code")
	private String code;
	
	/** 配方物料类型，0-熔炼钕铁硼，1-熔炼钐钴，2-粗粉，3-细粉 */
	@Column(name = "flag")
	private FmType flag;
	
	/** 元素名称 */
	@Column(name = "ElementID")
	private String elementID;
	
	/** 元素含量，配方按照规律加20，起到保密作用 */
	@Column(name = "Element_Value")
	private Double elementValue;
	
	/**
	 * 元素摩尔质量
	 */
	@Column(name="Atomic_Weights")
	private Double atomicWeights;
	
	/** 元素原子量 */
	@Column(name = "Atomic_Number")
	private Double element;
	
	/** 元素名称 */
	@Column(name = "ElementName")
	private String elementName;
	
	/** 元素符号 */
	@Column(name = "Element_Symbol")
	private String elementCode;
	
	/** 新建类型，0-新建，1-参考修改 默认为0 */
	@Column(name = "type")
	private String type;
	
	/** 是否为新配方，0,-新建，1-参考旧配方 默认为0 */
	@Column(name = "IsNew")
	private String isNew;
	
	/** 参考来源配方号 */
	@Column(name = "From_Code")
	private String fromCode;
	
	/** 是否生效，0-生效，1-失效，默认为0 */
	@Column(name = "IsEffective")
	private STATE isEffective;

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

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
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

	public String getSyncTs() {
		return syncTs;
	}

	public void setSyncTs(String syncTs) {
		this.syncTs = syncTs;
	}

	public String getSyncSourceID() {
		return syncSourceID;
	}

	public void setSyncSourceID(String syncSourceID) {
		this.syncSourceID = syncSourceID;
	}

	public String getSyncSource() {
		return syncSource;
	}

	public void setSyncSource(String syncSource) {
		this.syncSource = syncSource;
	}

	public String getSyncMemo() {
		return syncMemo;
	}

	public void setSyncMemo(String syncMemo) {
		this.syncMemo = syncMemo;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public FmType getFlag() {
		return flag;
	}

	public void setFlag(FmType flag) {
		this.flag = flag;
	}

	public String getElementID() {
		return elementID;
	}

	public void setElementID(String elementID) {
		this.elementID = elementID;
	}

	public Double getElementValue() {
		return elementValue;
	}

	public void setElementValue(Double elementValue) {
		this.elementValue = elementValue;
	}

	public Double getElement() {
		return element;
	}

	public void setElement(Double element) {
		this.element = element;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getElementCode() {
		return elementCode;
	}

	public void setElementCode(String elementCode) {
		this.elementCode = elementCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIsNew() {
		return isNew;
	}

	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}

	public String getFromCode() {
		return fromCode;
	}

	public void setFromCode(String fromCode) {
		this.fromCode = fromCode;
	}

	public STATE getIsEffective() {
		return isEffective;
	}

	public void setIsEffective(STATE isEffective) {
		this.isEffective = isEffective;
	}

	public String getItemFormula() {
		return itemFormula;
	}

	public void setItemFormula(String itemFormula) {
		this.itemFormula = itemFormula;
	}

	public Double getAtomicWeights() {
		return atomicWeights;
	}

	public void setAtomicWeights(Double atomicWeights) {
		this.atomicWeights = atomicWeights;
	}

}
