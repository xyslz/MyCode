package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;

/**
 * 库位
 * 
 * @author CY
 *
 */
@Table(name = "PM_Bin")
public class Bin extends BaseTable {

	private static final long serialVersionUID = 1313853553383897787L;

	@Column(name = "ID", primary = true)
	private String id;

	@Column(name = "CreatedOn", sort = Sort.DESC)
	private String createdOn;

	@Column(name = "Name")
	private String name;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "SysVersion")
	private String sysVersion;

	@Column(name = "Warehouse")
	private String warehouse;

	/** 存储位置编码 */
	@Column(name = "whCode", readonly = true)
	@Relation(table = "BD_Wh", value = "id", ref = "warehouse", show = "code")
	private String whCode;

	/** 存储位置名称 */
	@Column(name = "whName", readonly = true)
	@Relation(table = "BD_Wh", value = "id", ref = "warehouse", show = "name")
	private String whName;

	@Column(name = "MaxVolume")
	private Double maxVolume;

	@Column(name = "CurrentVolume")
	private Double currentVolume;

	@Column(name = "IsSingle")
	private Integer isSingle;

	@Column(name = "WhMan")
	private String whMan;

	@Column(name = "MaxWeight")
	private Double maxWeight;

	@Column(name = "CurrentWeight")
	private Double currentWeight;

	@Column(name = "KeyFlexFieldStru")
	private String keyFlexFieldStru;

	@Column(name = "Segment1")
	private String segment1;

	@Column(name = "Segment2")
	private String segment2;

	@Column(name = "Segment3")
	private String segment3;

	@Column(name = "Segment4")
	private String segment4;

	@Column(name = "Segment5")
	private String segment5;

	@Column(name = "Segment6")
	private String segment6;

	@Column(name = "Segment7")
	private String segment7;

	@Column(name = "Segment8")
	private String segment8;

	@Column(name = "Segment9")
	private String segment9;

	@Column(name = "Segment10")
	private String segment10;

	@Column(name = "Segment11")
	private String segment11;

	@Column(name = "Segment12")
	private String segment12;

	@Column(name = "Segment13")
	private String segment13;

	@Column(name = "Segment14")
	private String segment14;

	@Column(name = "Segment15")
	private String segment15;

	@Column(name = "Segment16")
	private String segment16;

	@Column(name = "Segment17")
	private String segment17;

	@Column(name = "Segment18")
	private String segment18;

	@Column(name = "Segment19")
	private String segment19;

	@Column(name = "Segment20")
	private String segment20;

	@Column(name = "Code")
	private String code;

	@Column(name = "Effective_IsEffective")
	private Integer effective_IsEffective;

	@Column(name = "Effective_EffectiveDate")
	private String effective_EffectiveDate;

	@Column(name = "Effective_DisableDate")
	private String effective_DisableDate;

	@Column(name = "ParentNode")
	private String parentNode;

	@Column(name = "Level")
	private Integer level;

	@Column(name = "IsLeaf")
	private Integer isLeaf;

	@Column(name = "Org")
	private String org;

	@Column(name = "orgName", readonly = true)
	@Relation(table = "SYS_Organization", value = "id", ref = "org", show = "name")
	private String orgName;

	@Column(name = "DescFlexField_PubDescSeg1")
	private String descFlexField_PubDescSeg1;

	@Column(name = "DescFlexField_PubDescSeg2")
	private String descFlexField_PubDescSeg2;

	@Column(name = "DescFlexField_PubDescSeg3")
	private String descFlexField_PubDescSeg3;

	@Column(name = "DescFlexField_PubDescSeg4")
	private String descFlexField_PubDescSeg4;

	@Column(name = "DescFlexField_PubDescSeg5")
	private String descFlexField_PubDescSeg5;

	@Column(name = "DescFlexField_PubDescSeg6")
	private String descFlexField_PubDescSeg6;

	@Column(name = "DescFlexField_PubDescSeg7")
	private String descFlexField_PubDescSeg7;

	@Column(name = "DescFlexField_PubDescSeg8")
	private String descFlexField_PubDescSeg8;

	@Column(name = "DescFlexField_PubDescSeg9")
	private String descFlexField_PubDescSeg9;

	@Column(name = "DescFlexField_PubDescSeg10")
	private String descFlexField_PubDescSeg10;

	@Column(name = "DescFlexField_PubDescSeg11")
	private String descFlexField_PubDescSeg11;

	@Column(name = "DescFlexField_PubDescSeg12")
	private String descFlexField_PubDescSeg12;

	@Column(name = "DescFlexField_PubDescSeg13")
	private String descFlexField_PubDescSeg13;

	@Column(name = "DescFlexField_PubDescSeg14")
	private String descFlexField_PubDescSeg14;

	@Column(name = "DescFlexField_PubDescSeg15")
	private String descFlexField_PubDescSeg15;

	@Column(name = "DescFlexField_PubDescSeg16")
	private String descFlexField_PubDescSeg16;

	@Column(name = "DescFlexField_PubDescSeg17")
	private String descFlexField_PubDescSeg17;

	@Column(name = "DescFlexField_PubDescSeg18")
	private String descFlexField_PubDescSeg18;

	@Column(name = "DescFlexField_PubDescSeg19")
	private String descFlexField_PubDescSeg19;

	@Column(name = "DescFlexField_PubDescSeg20")
	private String descFlexField_PubDescSeg20;

	@Column(name = "DescFlexField_PubDescSeg21")
	private String descFlexField_PubDescSeg21;

	@Column(name = "DescFlexField_PubDescSeg22")
	private String descFlexField_PubDescSeg22;

	@Column(name = "DescFlexField_PubDescSeg23")
	private String descFlexField_PubDescSeg23;

	@Column(name = "DescFlexField_PubDescSeg24")
	private String descFlexField_PubDescSeg24;

	@Column(name = "DescFlexField_PubDescSeg25")
	private String descFlexField_PubDescSeg25;

	@Column(name = "DescFlexField_PubDescSeg26")
	private String descFlexField_PubDescSeg26;

	@Column(name = "DescFlexField_PubDescSeg27")
	private String descFlexField_PubDescSeg27;

	@Column(name = "DescFlexField_PubDescSeg28")
	private String descFlexField_PubDescSeg28;

	@Column(name = "DescFlexField_PubDescSeg29")
	private String descFlexField_PubDescSeg29;

	@Column(name = "DescFlexField_PubDescSeg30")
	private String descFlexField_PubDescSeg30;

	@Column(name = "DescFlexField_PubDescSeg31")
	private String descFlexField_PubDescSeg31;

	@Column(name = "DescFlexField_PubDescSeg32")
	private String descFlexField_PubDescSeg32;

	@Column(name = "DescFlexField_PubDescSeg33")
	private String descFlexField_PubDescSeg33;

	@Column(name = "DescFlexField_PubDescSeg34")
	private String descFlexField_PubDescSeg34;

	@Column(name = "DescFlexField_PubDescSeg35")
	private String descFlexField_PubDescSeg35;

	@Column(name = "DescFlexField_PubDescSeg36")
	private String descFlexField_PubDescSeg36;

	@Column(name = "DescFlexField_PubDescSeg37")
	private String descFlexField_PubDescSeg37;

	@Column(name = "DescFlexField_PubDescSeg38")
	private String descFlexField_PubDescSeg38;

	@Column(name = "DescFlexField_PubDescSeg39")
	private String descFlexField_PubDescSeg39;

	@Column(name = "DescFlexField_PubDescSeg40")
	private String descFlexField_PubDescSeg40;

	@Column(name = "DescFlexField_PubDescSeg41")
	private String descFlexField_PubDescSeg41;

	@Column(name = "DescFlexField_PubDescSeg42")
	private String descFlexField_PubDescSeg42;

	@Column(name = "DescFlexField_PubDescSeg43")
	private String descFlexField_PubDescSeg43;

	@Column(name = "DescFlexField_PubDescSeg44")
	private String descFlexField_PubDescSeg44;

	@Column(name = "DescFlexField_PubDescSeg45")
	private String descFlexField_PubDescSeg45;

	@Column(name = "DescFlexField_PubDescSeg46")
	private String descFlexField_PubDescSeg46;

	@Column(name = "DescFlexField_PubDescSeg47")
	private String descFlexField_PubDescSeg47;

	@Column(name = "DescFlexField_PubDescSeg48")
	private String descFlexField_PubDescSeg48;

	@Column(name = "DescFlexField_PubDescSeg49")
	private String descFlexField_PubDescSeg49;

	@Column(name = "DescFlexField_PubDescSeg50")
	private String descFlexField_PubDescSeg50;

	@Column(name = "DescFlexField_ContextValue")
	private String descFlexField_ContextValue;

	@Column(name = "DescFlexField_PrivateDescSeg1")
	private String descFlexField_PrivateDescSeg1;

	@Column(name = "DescFlexField_PrivateDescSeg2")
	private String descFlexField_PrivateDescSeg2;

	@Column(name = "DescFlexField_PrivateDescSeg3")
	private String descFlexField_PrivateDescSeg3;

	@Column(name = "DescFlexField_PrivateDescSeg4")
	private String descFlexField_PrivateDescSeg4;

	@Column(name = "DescFlexField_PrivateDescSeg5")
	private String descFlexField_PrivateDescSeg5;

	@Column(name = "DescFlexField_PrivateDescSeg6")
	private String descFlexField_PrivateDescSeg6;

	@Column(name = "DescFlexField_PrivateDescSeg7")
	private String descFlexField_PrivateDescSeg7;

	@Column(name = "DescFlexField_PrivateDescSeg8")
	private String descFlexField_PrivateDescSeg8;

	@Column(name = "DescFlexField_PrivateDescSeg9")
	private String descFlexField_PrivateDescSeg9;

	@Column(name = "DescFlexField_PrivateDescSeg10")
	private String descFlexField_PrivateDescSeg10;

	@Column(name = "DescFlexField_PrivateDescSeg11")
	private String descFlexField_PrivateDescSeg11;

	@Column(name = "DescFlexField_PrivateDescSeg12")
	private String descFlexField_PrivateDescSeg12;

	@Column(name = "DescFlexField_PrivateDescSeg13")
	private String descFlexField_PrivateDescSeg13;

	@Column(name = "DescFlexField_PrivateDescSeg14")
	private String descFlexField_PrivateDescSeg14;

	@Column(name = "DescFlexField_PrivateDescSeg15")
	private String descFlexField_PrivateDescSeg15;

	@Column(name = "DescFlexField_PrivateDescSeg16")
	private String descFlexField_PrivateDescSeg16;

	@Column(name = "DescFlexField_PrivateDescSeg17")
	private String descFlexField_PrivateDescSeg17;

	@Column(name = "DescFlexField_PrivateDescSeg18")
	private String descFlexField_PrivateDescSeg18;

	@Column(name = "DescFlexField_PrivateDescSeg19")
	private String descFlexField_PrivateDescSeg19;

	@Column(name = "DescFlexField_PrivateDescSeg20")
	private String descFlexField_PrivateDescSeg20;

	@Column(name = "DescFlexField_PrivateDescSeg21")
	private String descFlexField_PrivateDescSeg21;

	@Column(name = "DescFlexField_PrivateDescSeg22")
	private String descFlexField_PrivateDescSeg22;

	@Column(name = "DescFlexField_PrivateDescSeg23")
	private String descFlexField_PrivateDescSeg23;

	@Column(name = "DescFlexField_PrivateDescSeg24")
	private String descFlexField_PrivateDescSeg24;

	@Column(name = "DescFlexField_PrivateDescSeg25")
	private String descFlexField_PrivateDescSeg25;

	@Column(name = "DescFlexField_PrivateDescSeg26")
	private String descFlexField_PrivateDescSeg26;

	@Column(name = "DescFlexField_PrivateDescSeg27")
	private String descFlexField_PrivateDescSeg27;

	@Column(name = "DescFlexField_PrivateDescSeg28")
	private String descFlexField_PrivateDescSeg28;

	@Column(name = "DescFlexField_PrivateDescSeg29")
	private String descFlexField_PrivateDescSeg29;

	@Column(name = "DescFlexField_PrivateDescSeg30")
	private String descFlexField_PrivateDescSeg30;

	@Column(name = "VolumeUOM")
	private String volumeUOM;

	// 容量单位
	@Column(name = "VolumeUOMName", readonly = true)
	@Relation(table = "BD_UOM", value = "id", ref = "volumeUOM", show = "name")
	private String volumeUOMName;

	@Column(name = "WeightUOM")
	private String weightUOM;

	// 重量单位
	@Column(name = "weightUOMName", readonly = true)
	@Relation(table = "BD_UOM", value = "id", ref = "weightUOM", show = "name")
	private String weightUOMName;

	@Column(name = "IsVMI")
	private Integer isVMI;

	@Column(name = "WeightControl")
	private Integer weightControl;

	@Column(name = "VolumeControl")
	private Integer volumeControl;

	@Column(name = "MasterOrg")
	private String masterOrg;

	@Column(name = "Segment30")
	private String segment30;

	@Column(name = "Segment21")
	private String segment21;

	@Column(name = "Segment22")
	private String segment22;

	@Column(name = "Segment23")
	private String segment23;

	@Column(name = "Segment24")
	private String segment24;

	@Column(name = "Segment25")
	private String segment25;

	@Column(name = "Segment26")
	private String segment26;

	@Column(name = "Segment27")
	private String segment27;

	@Column(name = "Segment28")
	private String segment28;

	@Column(name = "Segment29")
	private String segment29;

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

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public Double getMaxVolume() {
		return maxVolume;
	}

	public void setMaxVolume(Double maxVolume) {
		this.maxVolume = maxVolume;
	}

	public Double getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(Double currentVolume) {
		this.currentVolume = currentVolume;
	}

	public Integer getIsSingle() {
		return isSingle;
	}

	public void setIsSingle(Integer isSingle) {
		this.isSingle = isSingle;
	}

	public String getWhMan() {
		return whMan;
	}

	public void setWhMan(String whMan) {
		this.whMan = whMan;
	}

	public Double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(Double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public Double getCurrentWeight() {
		return currentWeight;
	}

	public void setCurrentWeight(Double currentWeight) {
		this.currentWeight = currentWeight;
	}

	public String getKeyFlexFieldStru() {
		return keyFlexFieldStru;
	}

	public void setKeyFlexFieldStru(String keyFlexFieldStru) {
		this.keyFlexFieldStru = keyFlexFieldStru;
	}

	public String getSegment1() {
		return segment1;
	}

	public void setSegment1(String segment1) {
		this.segment1 = segment1;
	}

	public String getSegment2() {
		return segment2;
	}

	public void setSegment2(String segment2) {
		this.segment2 = segment2;
	}

	public String getSegment3() {
		return segment3;
	}

	public void setSegment3(String segment3) {
		this.segment3 = segment3;
	}

	public String getSegment4() {
		return segment4;
	}

	public void setSegment4(String segment4) {
		this.segment4 = segment4;
	}

	public String getSegment5() {
		return segment5;
	}

	public void setSegment5(String segment5) {
		this.segment5 = segment5;
	}

	public String getSegment6() {
		return segment6;
	}

	public void setSegment6(String segment6) {
		this.segment6 = segment6;
	}

	public String getSegment7() {
		return segment7;
	}

	public void setSegment7(String segment7) {
		this.segment7 = segment7;
	}

	public String getSegment8() {
		return segment8;
	}

	public void setSegment8(String segment8) {
		this.segment8 = segment8;
	}

	public String getSegment9() {
		return segment9;
	}

	public void setSegment9(String segment9) {
		this.segment9 = segment9;
	}

	public String getSegment10() {
		return segment10;
	}

	public void setSegment10(String segment10) {
		this.segment10 = segment10;
	}

	public String getSegment11() {
		return segment11;
	}

	public void setSegment11(String segment11) {
		this.segment11 = segment11;
	}

	public String getSegment12() {
		return segment12;
	}

	public void setSegment12(String segment12) {
		this.segment12 = segment12;
	}

	public String getSegment13() {
		return segment13;
	}

	public void setSegment13(String segment13) {
		this.segment13 = segment13;
	}

	public String getSegment14() {
		return segment14;
	}

	public void setSegment14(String segment14) {
		this.segment14 = segment14;
	}

	public String getSegment15() {
		return segment15;
	}

	public void setSegment15(String segment15) {
		this.segment15 = segment15;
	}

	public String getSegment16() {
		return segment16;
	}

	public void setSegment16(String segment16) {
		this.segment16 = segment16;
	}

	public String getSegment17() {
		return segment17;
	}

	public void setSegment17(String segment17) {
		this.segment17 = segment17;
	}

	public String getSegment18() {
		return segment18;
	}

	public void setSegment18(String segment18) {
		this.segment18 = segment18;
	}

	public String getSegment19() {
		return segment19;
	}

	public void setSegment19(String segment19) {
		this.segment19 = segment19;
	}

	public String getSegment20() {
		return segment20;
	}

	public void setSegment20(String segment20) {
		this.segment20 = segment20;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getEffective_IsEffective() {
		return effective_IsEffective;
	}

	public void setEffective_IsEffective(Integer effective_IsEffective) {
		this.effective_IsEffective = effective_IsEffective;
	}

	public String getEffective_EffectiveDate() {
		return effective_EffectiveDate;
	}

	public void setEffective_EffectiveDate(String effective_EffectiveDate) {
		this.effective_EffectiveDate = effective_EffectiveDate;
	}

	public String getEffective_DisableDate() {
		return effective_DisableDate;
	}

	public void setEffective_DisableDate(String effective_DisableDate) {
		this.effective_DisableDate = effective_DisableDate;
	}

	public String getParentNode() {
		return parentNode;
	}

	public void setParentNode(String parentNode) {
		this.parentNode = parentNode;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(Integer isLeaf) {
		this.isLeaf = isLeaf;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getDescFlexField_PubDescSeg1() {
		return descFlexField_PubDescSeg1;
	}

	public void setDescFlexField_PubDescSeg1(String descFlexField_PubDescSeg1) {
		this.descFlexField_PubDescSeg1 = descFlexField_PubDescSeg1;
	}

	public String getDescFlexField_PubDescSeg2() {
		return descFlexField_PubDescSeg2;
	}

	public void setDescFlexField_PubDescSeg2(String descFlexField_PubDescSeg2) {
		this.descFlexField_PubDescSeg2 = descFlexField_PubDescSeg2;
	}

	public String getDescFlexField_PubDescSeg3() {
		return descFlexField_PubDescSeg3;
	}

	public void setDescFlexField_PubDescSeg3(String descFlexField_PubDescSeg3) {
		this.descFlexField_PubDescSeg3 = descFlexField_PubDescSeg3;
	}

	public String getDescFlexField_PubDescSeg4() {
		return descFlexField_PubDescSeg4;
	}

	public void setDescFlexField_PubDescSeg4(String descFlexField_PubDescSeg4) {
		this.descFlexField_PubDescSeg4 = descFlexField_PubDescSeg4;
	}

	public String getDescFlexField_PubDescSeg5() {
		return descFlexField_PubDescSeg5;
	}

	public void setDescFlexField_PubDescSeg5(String descFlexField_PubDescSeg5) {
		this.descFlexField_PubDescSeg5 = descFlexField_PubDescSeg5;
	}

	public String getDescFlexField_PubDescSeg6() {
		return descFlexField_PubDescSeg6;
	}

	public void setDescFlexField_PubDescSeg6(String descFlexField_PubDescSeg6) {
		this.descFlexField_PubDescSeg6 = descFlexField_PubDescSeg6;
	}

	public String getDescFlexField_PubDescSeg7() {
		return descFlexField_PubDescSeg7;
	}

	public void setDescFlexField_PubDescSeg7(String descFlexField_PubDescSeg7) {
		this.descFlexField_PubDescSeg7 = descFlexField_PubDescSeg7;
	}

	public String getDescFlexField_PubDescSeg8() {
		return descFlexField_PubDescSeg8;
	}

	public void setDescFlexField_PubDescSeg8(String descFlexField_PubDescSeg8) {
		this.descFlexField_PubDescSeg8 = descFlexField_PubDescSeg8;
	}

	public String getDescFlexField_PubDescSeg9() {
		return descFlexField_PubDescSeg9;
	}

	public void setDescFlexField_PubDescSeg9(String descFlexField_PubDescSeg9) {
		this.descFlexField_PubDescSeg9 = descFlexField_PubDescSeg9;
	}

	public String getDescFlexField_PubDescSeg10() {
		return descFlexField_PubDescSeg10;
	}

	public void setDescFlexField_PubDescSeg10(String descFlexField_PubDescSeg10) {
		this.descFlexField_PubDescSeg10 = descFlexField_PubDescSeg10;
	}

	public String getDescFlexField_PubDescSeg11() {
		return descFlexField_PubDescSeg11;
	}

	public void setDescFlexField_PubDescSeg11(String descFlexField_PubDescSeg11) {
		this.descFlexField_PubDescSeg11 = descFlexField_PubDescSeg11;
	}

	public String getDescFlexField_PubDescSeg12() {
		return descFlexField_PubDescSeg12;
	}

	public void setDescFlexField_PubDescSeg12(String descFlexField_PubDescSeg12) {
		this.descFlexField_PubDescSeg12 = descFlexField_PubDescSeg12;
	}

	public String getDescFlexField_PubDescSeg13() {
		return descFlexField_PubDescSeg13;
	}

	public void setDescFlexField_PubDescSeg13(String descFlexField_PubDescSeg13) {
		this.descFlexField_PubDescSeg13 = descFlexField_PubDescSeg13;
	}

	public String getDescFlexField_PubDescSeg14() {
		return descFlexField_PubDescSeg14;
	}

	public void setDescFlexField_PubDescSeg14(String descFlexField_PubDescSeg14) {
		this.descFlexField_PubDescSeg14 = descFlexField_PubDescSeg14;
	}

	public String getDescFlexField_PubDescSeg15() {
		return descFlexField_PubDescSeg15;
	}

	public void setDescFlexField_PubDescSeg15(String descFlexField_PubDescSeg15) {
		this.descFlexField_PubDescSeg15 = descFlexField_PubDescSeg15;
	}

	public String getDescFlexField_PubDescSeg16() {
		return descFlexField_PubDescSeg16;
	}

	public void setDescFlexField_PubDescSeg16(String descFlexField_PubDescSeg16) {
		this.descFlexField_PubDescSeg16 = descFlexField_PubDescSeg16;
	}

	public String getDescFlexField_PubDescSeg17() {
		return descFlexField_PubDescSeg17;
	}

	public void setDescFlexField_PubDescSeg17(String descFlexField_PubDescSeg17) {
		this.descFlexField_PubDescSeg17 = descFlexField_PubDescSeg17;
	}

	public String getDescFlexField_PubDescSeg18() {
		return descFlexField_PubDescSeg18;
	}

	public void setDescFlexField_PubDescSeg18(String descFlexField_PubDescSeg18) {
		this.descFlexField_PubDescSeg18 = descFlexField_PubDescSeg18;
	}

	public String getDescFlexField_PubDescSeg19() {
		return descFlexField_PubDescSeg19;
	}

	public void setDescFlexField_PubDescSeg19(String descFlexField_PubDescSeg19) {
		this.descFlexField_PubDescSeg19 = descFlexField_PubDescSeg19;
	}

	public String getDescFlexField_PubDescSeg20() {
		return descFlexField_PubDescSeg20;
	}

	public void setDescFlexField_PubDescSeg20(String descFlexField_PubDescSeg20) {
		this.descFlexField_PubDescSeg20 = descFlexField_PubDescSeg20;
	}

	public String getDescFlexField_PubDescSeg21() {
		return descFlexField_PubDescSeg21;
	}

	public void setDescFlexField_PubDescSeg21(String descFlexField_PubDescSeg21) {
		this.descFlexField_PubDescSeg21 = descFlexField_PubDescSeg21;
	}

	public String getDescFlexField_PubDescSeg22() {
		return descFlexField_PubDescSeg22;
	}

	public void setDescFlexField_PubDescSeg22(String descFlexField_PubDescSeg22) {
		this.descFlexField_PubDescSeg22 = descFlexField_PubDescSeg22;
	}

	public String getDescFlexField_PubDescSeg23() {
		return descFlexField_PubDescSeg23;
	}

	public void setDescFlexField_PubDescSeg23(String descFlexField_PubDescSeg23) {
		this.descFlexField_PubDescSeg23 = descFlexField_PubDescSeg23;
	}

	public String getDescFlexField_PubDescSeg24() {
		return descFlexField_PubDescSeg24;
	}

	public void setDescFlexField_PubDescSeg24(String descFlexField_PubDescSeg24) {
		this.descFlexField_PubDescSeg24 = descFlexField_PubDescSeg24;
	}

	public String getDescFlexField_PubDescSeg25() {
		return descFlexField_PubDescSeg25;
	}

	public void setDescFlexField_PubDescSeg25(String descFlexField_PubDescSeg25) {
		this.descFlexField_PubDescSeg25 = descFlexField_PubDescSeg25;
	}

	public String getDescFlexField_PubDescSeg26() {
		return descFlexField_PubDescSeg26;
	}

	public void setDescFlexField_PubDescSeg26(String descFlexField_PubDescSeg26) {
		this.descFlexField_PubDescSeg26 = descFlexField_PubDescSeg26;
	}

	public String getDescFlexField_PubDescSeg27() {
		return descFlexField_PubDescSeg27;
	}

	public void setDescFlexField_PubDescSeg27(String descFlexField_PubDescSeg27) {
		this.descFlexField_PubDescSeg27 = descFlexField_PubDescSeg27;
	}

	public String getDescFlexField_PubDescSeg28() {
		return descFlexField_PubDescSeg28;
	}

	public void setDescFlexField_PubDescSeg28(String descFlexField_PubDescSeg28) {
		this.descFlexField_PubDescSeg28 = descFlexField_PubDescSeg28;
	}

	public String getDescFlexField_PubDescSeg29() {
		return descFlexField_PubDescSeg29;
	}

	public void setDescFlexField_PubDescSeg29(String descFlexField_PubDescSeg29) {
		this.descFlexField_PubDescSeg29 = descFlexField_PubDescSeg29;
	}

	public String getDescFlexField_PubDescSeg30() {
		return descFlexField_PubDescSeg30;
	}

	public void setDescFlexField_PubDescSeg30(String descFlexField_PubDescSeg30) {
		this.descFlexField_PubDescSeg30 = descFlexField_PubDescSeg30;
	}

	public String getDescFlexField_PubDescSeg31() {
		return descFlexField_PubDescSeg31;
	}

	public void setDescFlexField_PubDescSeg31(String descFlexField_PubDescSeg31) {
		this.descFlexField_PubDescSeg31 = descFlexField_PubDescSeg31;
	}

	public String getDescFlexField_PubDescSeg32() {
		return descFlexField_PubDescSeg32;
	}

	public void setDescFlexField_PubDescSeg32(String descFlexField_PubDescSeg32) {
		this.descFlexField_PubDescSeg32 = descFlexField_PubDescSeg32;
	}

	public String getDescFlexField_PubDescSeg33() {
		return descFlexField_PubDescSeg33;
	}

	public void setDescFlexField_PubDescSeg33(String descFlexField_PubDescSeg33) {
		this.descFlexField_PubDescSeg33 = descFlexField_PubDescSeg33;
	}

	public String getDescFlexField_PubDescSeg34() {
		return descFlexField_PubDescSeg34;
	}

	public void setDescFlexField_PubDescSeg34(String descFlexField_PubDescSeg34) {
		this.descFlexField_PubDescSeg34 = descFlexField_PubDescSeg34;
	}

	public String getDescFlexField_PubDescSeg35() {
		return descFlexField_PubDescSeg35;
	}

	public void setDescFlexField_PubDescSeg35(String descFlexField_PubDescSeg35) {
		this.descFlexField_PubDescSeg35 = descFlexField_PubDescSeg35;
	}

	public String getDescFlexField_PubDescSeg36() {
		return descFlexField_PubDescSeg36;
	}

	public void setDescFlexField_PubDescSeg36(String descFlexField_PubDescSeg36) {
		this.descFlexField_PubDescSeg36 = descFlexField_PubDescSeg36;
	}

	public String getDescFlexField_PubDescSeg37() {
		return descFlexField_PubDescSeg37;
	}

	public void setDescFlexField_PubDescSeg37(String descFlexField_PubDescSeg37) {
		this.descFlexField_PubDescSeg37 = descFlexField_PubDescSeg37;
	}

	public String getDescFlexField_PubDescSeg38() {
		return descFlexField_PubDescSeg38;
	}

	public void setDescFlexField_PubDescSeg38(String descFlexField_PubDescSeg38) {
		this.descFlexField_PubDescSeg38 = descFlexField_PubDescSeg38;
	}

	public String getDescFlexField_PubDescSeg39() {
		return descFlexField_PubDescSeg39;
	}

	public void setDescFlexField_PubDescSeg39(String descFlexField_PubDescSeg39) {
		this.descFlexField_PubDescSeg39 = descFlexField_PubDescSeg39;
	}

	public String getDescFlexField_PubDescSeg40() {
		return descFlexField_PubDescSeg40;
	}

	public void setDescFlexField_PubDescSeg40(String descFlexField_PubDescSeg40) {
		this.descFlexField_PubDescSeg40 = descFlexField_PubDescSeg40;
	}

	public String getDescFlexField_PubDescSeg41() {
		return descFlexField_PubDescSeg41;
	}

	public void setDescFlexField_PubDescSeg41(String descFlexField_PubDescSeg41) {
		this.descFlexField_PubDescSeg41 = descFlexField_PubDescSeg41;
	}

	public String getDescFlexField_PubDescSeg42() {
		return descFlexField_PubDescSeg42;
	}

	public void setDescFlexField_PubDescSeg42(String descFlexField_PubDescSeg42) {
		this.descFlexField_PubDescSeg42 = descFlexField_PubDescSeg42;
	}

	public String getDescFlexField_PubDescSeg43() {
		return descFlexField_PubDescSeg43;
	}

	public void setDescFlexField_PubDescSeg43(String descFlexField_PubDescSeg43) {
		this.descFlexField_PubDescSeg43 = descFlexField_PubDescSeg43;
	}

	public String getDescFlexField_PubDescSeg44() {
		return descFlexField_PubDescSeg44;
	}

	public void setDescFlexField_PubDescSeg44(String descFlexField_PubDescSeg44) {
		this.descFlexField_PubDescSeg44 = descFlexField_PubDescSeg44;
	}

	public String getDescFlexField_PubDescSeg45() {
		return descFlexField_PubDescSeg45;
	}

	public void setDescFlexField_PubDescSeg45(String descFlexField_PubDescSeg45) {
		this.descFlexField_PubDescSeg45 = descFlexField_PubDescSeg45;
	}

	public String getDescFlexField_PubDescSeg46() {
		return descFlexField_PubDescSeg46;
	}

	public void setDescFlexField_PubDescSeg46(String descFlexField_PubDescSeg46) {
		this.descFlexField_PubDescSeg46 = descFlexField_PubDescSeg46;
	}

	public String getDescFlexField_PubDescSeg47() {
		return descFlexField_PubDescSeg47;
	}

	public void setDescFlexField_PubDescSeg47(String descFlexField_PubDescSeg47) {
		this.descFlexField_PubDescSeg47 = descFlexField_PubDescSeg47;
	}

	public String getDescFlexField_PubDescSeg48() {
		return descFlexField_PubDescSeg48;
	}

	public void setDescFlexField_PubDescSeg48(String descFlexField_PubDescSeg48) {
		this.descFlexField_PubDescSeg48 = descFlexField_PubDescSeg48;
	}

	public String getDescFlexField_PubDescSeg49() {
		return descFlexField_PubDescSeg49;
	}

	public void setDescFlexField_PubDescSeg49(String descFlexField_PubDescSeg49) {
		this.descFlexField_PubDescSeg49 = descFlexField_PubDescSeg49;
	}

	public String getDescFlexField_PubDescSeg50() {
		return descFlexField_PubDescSeg50;
	}

	public void setDescFlexField_PubDescSeg50(String descFlexField_PubDescSeg50) {
		this.descFlexField_PubDescSeg50 = descFlexField_PubDescSeg50;
	}

	public String getDescFlexField_ContextValue() {
		return descFlexField_ContextValue;
	}

	public void setDescFlexField_ContextValue(String descFlexField_ContextValue) {
		this.descFlexField_ContextValue = descFlexField_ContextValue;
	}

	public String getDescFlexField_PrivateDescSeg1() {
		return descFlexField_PrivateDescSeg1;
	}

	public void setDescFlexField_PrivateDescSeg1(String descFlexField_PrivateDescSeg1) {
		this.descFlexField_PrivateDescSeg1 = descFlexField_PrivateDescSeg1;
	}

	public String getDescFlexField_PrivateDescSeg2() {
		return descFlexField_PrivateDescSeg2;
	}

	public void setDescFlexField_PrivateDescSeg2(String descFlexField_PrivateDescSeg2) {
		this.descFlexField_PrivateDescSeg2 = descFlexField_PrivateDescSeg2;
	}

	public String getDescFlexField_PrivateDescSeg3() {
		return descFlexField_PrivateDescSeg3;
	}

	public void setDescFlexField_PrivateDescSeg3(String descFlexField_PrivateDescSeg3) {
		this.descFlexField_PrivateDescSeg3 = descFlexField_PrivateDescSeg3;
	}

	public String getDescFlexField_PrivateDescSeg4() {
		return descFlexField_PrivateDescSeg4;
	}

	public void setDescFlexField_PrivateDescSeg4(String descFlexField_PrivateDescSeg4) {
		this.descFlexField_PrivateDescSeg4 = descFlexField_PrivateDescSeg4;
	}

	public String getDescFlexField_PrivateDescSeg5() {
		return descFlexField_PrivateDescSeg5;
	}

	public void setDescFlexField_PrivateDescSeg5(String descFlexField_PrivateDescSeg5) {
		this.descFlexField_PrivateDescSeg5 = descFlexField_PrivateDescSeg5;
	}

	public String getDescFlexField_PrivateDescSeg6() {
		return descFlexField_PrivateDescSeg6;
	}

	public void setDescFlexField_PrivateDescSeg6(String descFlexField_PrivateDescSeg6) {
		this.descFlexField_PrivateDescSeg6 = descFlexField_PrivateDescSeg6;
	}

	public String getDescFlexField_PrivateDescSeg7() {
		return descFlexField_PrivateDescSeg7;
	}

	public void setDescFlexField_PrivateDescSeg7(String descFlexField_PrivateDescSeg7) {
		this.descFlexField_PrivateDescSeg7 = descFlexField_PrivateDescSeg7;
	}

	public String getDescFlexField_PrivateDescSeg8() {
		return descFlexField_PrivateDescSeg8;
	}

	public void setDescFlexField_PrivateDescSeg8(String descFlexField_PrivateDescSeg8) {
		this.descFlexField_PrivateDescSeg8 = descFlexField_PrivateDescSeg8;
	}

	public String getDescFlexField_PrivateDescSeg9() {
		return descFlexField_PrivateDescSeg9;
	}

	public void setDescFlexField_PrivateDescSeg9(String descFlexField_PrivateDescSeg9) {
		this.descFlexField_PrivateDescSeg9 = descFlexField_PrivateDescSeg9;
	}

	public String getDescFlexField_PrivateDescSeg10() {
		return descFlexField_PrivateDescSeg10;
	}

	public void setDescFlexField_PrivateDescSeg10(String descFlexField_PrivateDescSeg10) {
		this.descFlexField_PrivateDescSeg10 = descFlexField_PrivateDescSeg10;
	}

	public String getDescFlexField_PrivateDescSeg11() {
		return descFlexField_PrivateDescSeg11;
	}

	public void setDescFlexField_PrivateDescSeg11(String descFlexField_PrivateDescSeg11) {
		this.descFlexField_PrivateDescSeg11 = descFlexField_PrivateDescSeg11;
	}

	public String getDescFlexField_PrivateDescSeg12() {
		return descFlexField_PrivateDescSeg12;
	}

	public void setDescFlexField_PrivateDescSeg12(String descFlexField_PrivateDescSeg12) {
		this.descFlexField_PrivateDescSeg12 = descFlexField_PrivateDescSeg12;
	}

	public String getDescFlexField_PrivateDescSeg13() {
		return descFlexField_PrivateDescSeg13;
	}

	public void setDescFlexField_PrivateDescSeg13(String descFlexField_PrivateDescSeg13) {
		this.descFlexField_PrivateDescSeg13 = descFlexField_PrivateDescSeg13;
	}

	public String getDescFlexField_PrivateDescSeg14() {
		return descFlexField_PrivateDescSeg14;
	}

	public void setDescFlexField_PrivateDescSeg14(String descFlexField_PrivateDescSeg14) {
		this.descFlexField_PrivateDescSeg14 = descFlexField_PrivateDescSeg14;
	}

	public String getDescFlexField_PrivateDescSeg15() {
		return descFlexField_PrivateDescSeg15;
	}

	public void setDescFlexField_PrivateDescSeg15(String descFlexField_PrivateDescSeg15) {
		this.descFlexField_PrivateDescSeg15 = descFlexField_PrivateDescSeg15;
	}

	public String getDescFlexField_PrivateDescSeg16() {
		return descFlexField_PrivateDescSeg16;
	}

	public void setDescFlexField_PrivateDescSeg16(String descFlexField_PrivateDescSeg16) {
		this.descFlexField_PrivateDescSeg16 = descFlexField_PrivateDescSeg16;
	}

	public String getDescFlexField_PrivateDescSeg17() {
		return descFlexField_PrivateDescSeg17;
	}

	public void setDescFlexField_PrivateDescSeg17(String descFlexField_PrivateDescSeg17) {
		this.descFlexField_PrivateDescSeg17 = descFlexField_PrivateDescSeg17;
	}

	public String getDescFlexField_PrivateDescSeg18() {
		return descFlexField_PrivateDescSeg18;
	}

	public void setDescFlexField_PrivateDescSeg18(String descFlexField_PrivateDescSeg18) {
		this.descFlexField_PrivateDescSeg18 = descFlexField_PrivateDescSeg18;
	}

	public String getDescFlexField_PrivateDescSeg19() {
		return descFlexField_PrivateDescSeg19;
	}

	public void setDescFlexField_PrivateDescSeg19(String descFlexField_PrivateDescSeg19) {
		this.descFlexField_PrivateDescSeg19 = descFlexField_PrivateDescSeg19;
	}

	public String getDescFlexField_PrivateDescSeg20() {
		return descFlexField_PrivateDescSeg20;
	}

	public void setDescFlexField_PrivateDescSeg20(String descFlexField_PrivateDescSeg20) {
		this.descFlexField_PrivateDescSeg20 = descFlexField_PrivateDescSeg20;
	}

	public String getDescFlexField_PrivateDescSeg21() {
		return descFlexField_PrivateDescSeg21;
	}

	public void setDescFlexField_PrivateDescSeg21(String descFlexField_PrivateDescSeg21) {
		this.descFlexField_PrivateDescSeg21 = descFlexField_PrivateDescSeg21;
	}

	public String getDescFlexField_PrivateDescSeg22() {
		return descFlexField_PrivateDescSeg22;
	}

	public void setDescFlexField_PrivateDescSeg22(String descFlexField_PrivateDescSeg22) {
		this.descFlexField_PrivateDescSeg22 = descFlexField_PrivateDescSeg22;
	}

	public String getDescFlexField_PrivateDescSeg23() {
		return descFlexField_PrivateDescSeg23;
	}

	public void setDescFlexField_PrivateDescSeg23(String descFlexField_PrivateDescSeg23) {
		this.descFlexField_PrivateDescSeg23 = descFlexField_PrivateDescSeg23;
	}

	public String getDescFlexField_PrivateDescSeg24() {
		return descFlexField_PrivateDescSeg24;
	}

	public void setDescFlexField_PrivateDescSeg24(String descFlexField_PrivateDescSeg24) {
		this.descFlexField_PrivateDescSeg24 = descFlexField_PrivateDescSeg24;
	}

	public String getDescFlexField_PrivateDescSeg25() {
		return descFlexField_PrivateDescSeg25;
	}

	public void setDescFlexField_PrivateDescSeg25(String descFlexField_PrivateDescSeg25) {
		this.descFlexField_PrivateDescSeg25 = descFlexField_PrivateDescSeg25;
	}

	public String getDescFlexField_PrivateDescSeg26() {
		return descFlexField_PrivateDescSeg26;
	}

	public void setDescFlexField_PrivateDescSeg26(String descFlexField_PrivateDescSeg26) {
		this.descFlexField_PrivateDescSeg26 = descFlexField_PrivateDescSeg26;
	}

	public String getDescFlexField_PrivateDescSeg27() {
		return descFlexField_PrivateDescSeg27;
	}

	public void setDescFlexField_PrivateDescSeg27(String descFlexField_PrivateDescSeg27) {
		this.descFlexField_PrivateDescSeg27 = descFlexField_PrivateDescSeg27;
	}

	public String getDescFlexField_PrivateDescSeg28() {
		return descFlexField_PrivateDescSeg28;
	}

	public void setDescFlexField_PrivateDescSeg28(String descFlexField_PrivateDescSeg28) {
		this.descFlexField_PrivateDescSeg28 = descFlexField_PrivateDescSeg28;
	}

	public String getDescFlexField_PrivateDescSeg29() {
		return descFlexField_PrivateDescSeg29;
	}

	public void setDescFlexField_PrivateDescSeg29(String descFlexField_PrivateDescSeg29) {
		this.descFlexField_PrivateDescSeg29 = descFlexField_PrivateDescSeg29;
	}

	public String getDescFlexField_PrivateDescSeg30() {
		return descFlexField_PrivateDescSeg30;
	}

	public void setDescFlexField_PrivateDescSeg30(String descFlexField_PrivateDescSeg30) {
		this.descFlexField_PrivateDescSeg30 = descFlexField_PrivateDescSeg30;
	}

	public String getVolumeUOM() {
		return volumeUOM;
	}

	public void setVolumeUOM(String volumeUOM) {
		this.volumeUOM = volumeUOM;
	}

	public String getWeightUOM() {
		return weightUOM;
	}

	public void setWeightUOM(String weightUOM) {
		this.weightUOM = weightUOM;
	}

	public Integer getIsVMI() {
		return isVMI;
	}

	public void setIsVMI(Integer isVMI) {
		this.isVMI = isVMI;
	}

	public Integer getWeightControl() {
		return weightControl;
	}

	public void setWeightControl(Integer weightControl) {
		this.weightControl = weightControl;
	}

	public Integer getVolumeControl() {
		return volumeControl;
	}

	public void setVolumeControl(Integer volumeControl) {
		this.volumeControl = volumeControl;
	}

	public String getMasterOrg() {
		return masterOrg;
	}

	public void setMasterOrg(String masterOrg) {
		this.masterOrg = masterOrg;
	}

	public String getSegment30() {
		return segment30;
	}

	public void setSegment30(String segment30) {
		this.segment30 = segment30;
	}

	public String getSegment21() {
		return segment21;
	}

	public void setSegment21(String segment21) {
		this.segment21 = segment21;
	}

	public String getSegment22() {
		return segment22;
	}

	public void setSegment22(String segment22) {
		this.segment22 = segment22;
	}

	public String getSegment23() {
		return segment23;
	}

	public void setSegment23(String segment23) {
		this.segment23 = segment23;
	}

	public String getSegment24() {
		return segment24;
	}

	public void setSegment24(String segment24) {
		this.segment24 = segment24;
	}

	public String getSegment25() {
		return segment25;
	}

	public void setSegment25(String segment25) {
		this.segment25 = segment25;
	}

	public String getSegment26() {
		return segment26;
	}

	public void setSegment26(String segment26) {
		this.segment26 = segment26;
	}

	public String getSegment27() {
		return segment27;
	}

	public void setSegment27(String segment27) {
		this.segment27 = segment27;
	}

	public String getSegment28() {
		return segment28;
	}

	public void setSegment28(String segment28) {
		this.segment28 = segment28;
	}

	public String getSegment29() {
		return segment29;
	}

	public void setSegment29(String segment29) {
		this.segment29 = segment29;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWhCode() {
		return whCode;
	}

	public void setWhCode(String whCode) {
		this.whCode = whCode;
	}

	public String getWhName() {
		return whName;
	}

	public void setWhName(String whName) {
		this.whName = whName;
	}

	public String getVolumeUOMName() {
		return volumeUOMName;
	}

	public void setVolumeUOMName(String volumeUOMName) {
		this.volumeUOMName = volumeUOMName;
	}

	public String getWeightUOMName() {
		return weightUOMName;
	}

	public void setWeightUOMName(String weightUOMName) {
		this.weightUOMName = weightUOMName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

}
