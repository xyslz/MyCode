package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseEntity;
import com.caijai.base.sysenum.Sort;

/**
 * 分类
 * @author Administrator
 *
 */
@Table(name = "BD_Category")
public class Category extends BaseEntity{

	private static final long serialVersionUID = -3166017003408230778L;
	
	@Column(name = "id",primary = true)
	private String id;
	
	@Column(name = "createdOn", sort = Sort.DESC)
	private String createdOn;
	
	@Column(name = "createdBy")
	private String createdBy;
	
	@Column(name = "modifiedOn")
	private String modifiedOn;
	
	@Column(name = "modifiedBy")
	private String modifiedBy;
	
	@Column(name = "sysVersion")
	private String sysVersion;
	
	@Column(name = "categorySystem")
	private String categorySystem;
	
	@Column(name = "categoryUOM")
	private String categoryUOM;
	
	@Column(name = "keyFlexFieldStru")
	private String keyFlexFieldStru;
	
	@Column(name = "code")
	private String code;
	
	/**
	 * 扩展项1
	 */
	@Column(name = "DescFlexField_PubDescSeg1")
	private String descflexfieldPubdescseg1;

	/**
	 * 扩展项2
	 */
	@Column(name = "DescFlexField_PubDescSeg2")
	private String descflexfieldPubdescseg2;

	/**
	 * 扩展项3
	 */
	@Column(name = "DescFlexField_PubDescSeg3")
	private String descflexfieldPubdescseg3;

	/**
	 * 扩展项4
	 */
	@Column(name = "DescFlexField_PubDescSeg4")
	private String descflexfieldPubdescseg4;

	/**
	 * 扩展项5
	 */
	@Column(name = "DescFlexField_PubDescSeg5")
	private String descflexfieldPubdescseg5;

	/**
	 * 扩展项6
	 */
	@Column(name = "DescFlexField_PubDescSeg6")
	private String descflexfieldPubdescseg6;

	/**
	 * 扩展项7
	 */
	@Column(name = "DescFlexField_PubDescSeg7")
	private String descflexfieldPubdescseg7;

	/**
	 * 扩展项8
	 */
	@Column(name = "DescFlexField_PubDescSeg8")
	private String descflexfieldPubdescseg8;

	/**
	 * 扩展项9
	 */
	@Column(name = "DescFlexField_PubDescSeg9")
	private String descflexfieldPubdescseg9;

	/**
	 * 扩展项10
	 */
	@Column(name = "DescFlexField_PubDescSeg10")
	private String descflexfieldPubdescseg10;

	/**
	 * 扩展项11
	 */
	@Column(name = "DescFlexField_PubDescSeg11")
	private String descflexfieldPubdescseg11;

	/**
	 * 扩展项12
	 */
	@Column(name = "DescFlexField_PubDescSeg12")
	private String descflexfieldPubdescseg12;

	/**
	 * 扩展项13
	 */
	@Column(name = "DescFlexField_PubDescSeg13")
	private String descflexfieldPubdescseg13;

	/**
	 * 扩展项14
	 */
	@Column(name = "DescFlexField_PubDescSeg14")
	private String descflexfieldPubdescseg14;

	/**
	 * 扩展项15
	 */
	@Column(name = "DescFlexField_PubDescSeg15")
	private String descflexfieldPubdescseg15;

	/**
	 * 扩展项16
	 */
	@Column(name = "DescFlexField_PubDescSeg16")
	private String descflexfieldPubdescseg16;

	/**
	 * 扩展项17
	 */
	@Column(name = "DescFlexField_PubDescSeg17")
	private String descflexfieldPubdescseg17;

	/**
	 * 扩展项18
	 */
	@Column(name = "DescFlexField_PubDescSeg18")
	private String descflexfieldPubdescseg18;

	/**
	 * 扩展项19
	 */
	@Column(name = "DescFlexField_PubDescSeg19")
	private String descflexfieldPubdescseg19;

	/**
	 * 扩展项20
	 */
	@Column(name = "DescFlexField_PubDescSeg20")
	private String descflexfieldPubdescseg20;

	/**
	 * 扩展项21
	 */
	@Column(name = "DescFlexField_PubDescSeg21")
	private String descflexfieldPubdescseg21;

	/**
	 * 扩展项22
	 */
	@Column(name = "DescFlexField_PubDescSeg22")
	private String descflexfieldPubdescseg22;

	/**
	 * 扩展项23
	 */
	@Column(name = "DescFlexField_PubDescSeg23")
	private String descflexfieldPubdescseg23;

	/**
	 * 扩展项24
	 */
	@Column(name = "DescFlexField_PubDescSeg24")
	private String descflexfieldPubdescseg24;

	/**
	 * 扩展项25
	 */
	@Column(name = "DescFlexField_PubDescSeg25")
	private String descflexfieldPubdescseg25;

	/**
	 * 扩展项26
	 */
	@Column(name = "DescFlexField_PubDescSeg26")
	private String descflexfieldPubdescseg26;

	/**
	 * 扩展项27
	 */
	@Column(name = "DescFlexField_PubDescSeg27")
	private String descflexfieldPubdescseg27;

	/**
	 * 扩展项28
	 */
	@Column(name = "DescFlexField_PubDescSeg28")
	private String descflexfieldPubdescseg28;

	/**
	 * 扩展项29
	 */
	@Column(name = "DescFlexField_PubDescSeg29")
	private String descflexfieldPubdescseg29;

	/**
	 * 扩展项30
	 */
	@Column(name = "DescFlexField_PubDescSeg30")
	private String descflexfieldPubdescseg30;

	/**
	 * 扩展项31
	 */
	@Column(name = "DescFlexField_PubDescSeg31")
	private String descflexfieldPubdescseg31;

	/**
	 * 扩展项32
	 */
	@Column(name = "DescFlexField_PubDescSeg32")
	private String descflexfieldPubdescseg32;

	/**
	 * 扩展项33
	 */
	@Column(name = "DescFlexField_PubDescSeg33")
	private String descflexfieldPubdescseg33;

	/**
	 * 扩展项34
	 */
	@Column(name = "DescFlexField_PubDescSeg34")
	private String descflexfieldPubdescseg34;

	/**
	 * 扩展项35
	 */
	@Column(name = "DescFlexField_PubDescSeg35")
	private String descflexfieldPubdescseg35;

	/**
	 * 扩展项36
	 */
	@Column(name = "DescFlexField_PubDescSeg36")
	private String descflexfieldPubdescseg36;

	/**
	 * 扩展项37
	 */
	@Column(name = "DescFlexField_PubDescSeg37")
	private String descflexfieldPubdescseg37;

	/**
	 * 扩展项38
	 */
	@Column(name = "DescFlexField_PubDescSeg38")
	private String descflexfieldPubdescseg38;

	/**
	 * 扩展项39
	 */
	@Column(name = "DescFlexField_PubDescSeg39")
	private String descflexfieldPubdescseg39;

	/**
	 * 扩展项40
	 */
	@Column(name = "DescFlexField_PubDescSeg40")
	private String descflexfieldPubdescseg40;

	/**
	 * 扩展项41
	 */
	@Column(name = "DescFlexField_PubDescSeg41")
	private String descflexfieldPubdescseg41;

	/**
	 * 扩展项42
	 */
	@Column(name = "DescFlexField_PubDescSeg42")
	private String descflexfieldPubdescseg42;

	/**
	 * 扩展项43
	 */
	@Column(name = "DescFlexField_PubDescSeg43")
	private String descflexfieldPubdescseg43;

	/**
	 * 扩展项44
	 */
	@Column(name = "DescFlexField_PubDescSeg44")
	private String descflexfieldPubdescseg44;

	/**
	 * 扩展项45
	 */
	@Column(name = "DescFlexField_PubDescSeg45")
	private String descflexfieldPubdescseg45;

	/**
	 * 扩展项46
	 */
	@Column(name = "DescFlexField_PubDescSeg46")
	private String descflexfieldPubdescseg46;

	/**
	 * 扩展项47
	 */
	@Column(name = "DescFlexField_PubDescSeg47")
	private String descflexfieldPubdescseg47;

	/**
	 * 扩展项48
	 */
	@Column(name = "DescFlexField_PubDescSeg48")
	private String descflexfieldPubdescseg48;

	/**
	 * 扩展项49
	 */
	@Column(name = "DescFlexField_PubDescSeg49")
	private String descflexfieldPubdescseg49;

	/**
	 * 扩展项50
	 */
	@Column(name = "DescFlexField_PubDescSeg50")
	private String descflexfieldPubdescseg50;

	/**
	 * 自定义
	 */
	@Column(name = "DescFlexField_ContextValue")
	private String descflexfieldContextvalue;

	/**
	 * 自定义1
	 */
	@Column(name = "DescFlexField_PrivateDescSeg1")
	private String descflexfieldPrivatedescseg1;

	/**
	 * 自定义2
	 */
	@Column(name = "DescFlexField_PrivateDescSeg2")
	private String descflexfieldPrivatedescseg2;

	/**
	 * 自定义3
	 */
	@Column(name = "DescFlexField_PrivateDescSeg3")
	private String descflexfieldPrivatedescseg3;

	/**
	 * 自定义4
	 */
	@Column(name = "DescFlexField_PrivateDescSeg4")
	private String descflexfieldPrivatedescseg4;

	/**
	 * 自定义5
	 */
	@Column(name = "DescFlexField_PrivateDescSeg5")
	private String descflexfieldPrivatedescseg5;

	/**
	 * 自定义6
	 */
	@Column(name = "DescFlexField_PrivateDescSeg6")
	private String descflexfieldPrivatedescseg6;

	/**
	 * 自定义7
	 */
	@Column(name = "DescFlexField_PrivateDescSeg7")
	private String descflexfieldPrivatedescseg7;

	/**
	 * 自定义8
	 */
	@Column(name = "DescFlexField_PrivateDescSeg8")
	private String descflexfieldPrivatedescseg8;

	/**
	 * 自定义9
	 */
	@Column(name = "DescFlexField_PrivateDescSeg9")
	private String descflexfieldPrivatedescseg9;

	/**
	 * 自定义10
	 */
	@Column(name = "DescFlexField_PrivateDescSeg10")
	private String descflexfieldPrivatedescseg10;

	/**
	 * 自定义11
	 */
	@Column(name = "DescFlexField_PrivateDescSeg11")
	private String descflexfieldPrivatedescseg11;

	/**
	 * 自定义12
	 */
	@Column(name = "DescFlexField_PrivateDescSeg12")
	private String descflexfieldPrivatedescseg12;

	/**
	 * 自定义13
	 */
	@Column(name = "DescFlexField_PrivateDescSeg13")
	private String descflexfieldPrivatedescseg13;

	/**
	 * 自定义14
	 */
	@Column(name = "DescFlexField_PrivateDescSeg14")
	private String descflexfieldPrivatedescseg14;

	/**
	 * 自定义15
	 */
	@Column(name = "DescFlexField_PrivateDescSeg15")
	private String descflexfieldPrivatedescseg15;

	/**
	 * 自定义16
	 */
	@Column(name = "DescFlexField_PrivateDescSeg16")
	private String descflexfieldPrivatedescseg16;

	/**
	 * 自定义17
	 */
	@Column(name = "DescFlexField_PrivateDescSeg17")
	private String descflexfieldPrivatedescseg17;

	/**
	 * 自定义18
	 */
	@Column(name = "DescFlexField_PrivateDescSeg18")
	private String descflexfieldPrivatedescseg18;

	/**
	 * 自定义19
	 */
	@Column(name = "DescFlexField_PrivateDescSeg19")
	private String descflexfieldPrivatedescseg19;

	/**
	 * 自定义20
	 */
	@Column(name = "DescFlexField_PrivateDescSeg20")
	private String descflexfieldPrivatedescseg20;

	/**
	 * 自定义21
	 */
	@Column(name = "DescFlexField_PrivateDescSeg21")
	private String descflexfieldPrivatedescseg21;

	/**
	 * 自定义22
	 */
	@Column(name = "DescFlexField_PrivateDescSeg22")
	private String descflexfieldPrivatedescseg22;

	/**
	 * 自定义23
	 */
	@Column(name = "DescFlexField_PrivateDescSeg23")
	private String descflexfieldPrivatedescseg23;

	/**
	 * 自定义24
	 */
	@Column(name = "DescFlexField_PrivateDescSeg24")
	private String descflexfieldPrivatedescseg24;

	/**
	 * 自定义25
	 */
	@Column(name = "DescFlexField_PrivateDescSeg25")
	private String descflexfieldPrivatedescseg25;

	/**
	 * 自定义26
	 */
	@Column(name = "DescFlexField_PrivateDescSeg26")
	private String descflexfieldPrivatedescseg26;

	/**
	 * 自定义27
	 */
	@Column(name = "DescFlexField_PrivateDescSeg27")
	private String descflexfieldPrivatedescseg27;

	/**
	 * 自定义28
	 */
	@Column(name = "DescFlexField_PrivateDescSeg28")
	private String descflexfieldPrivatedescseg28;

	/**
	 * 自定义29
	 */
	@Column(name = "DescFlexField_PrivateDescSeg29")
	private String descflexfieldPrivatedescseg29;

	/**
	 * 自定义30
	 */
	@Column(name = "DescFlexField_PrivateDescSeg30")
	private String descflexfieldPrivatedescseg30;
	
	@Column(name = "dr")
	private Integer dr;
	
	@Column(name = "ts")
	private String ts;
	
	
	@Column(name = "name")
	private String name;
	
	/**
	 * 组织
	 */
	@Column(name = "Org")
	private String org;
	
	/**
	 * 来源组织
	 */
	@Column(name = "MasterOrg")
	private String masterOrg;
	
	@Column(name = "segment1")
	private String segment1;

	@Column(name = "segment2")
	private String segment2;

	@Column(name = "segment3")
	private String segment3;

	@Column(name = "segment4")
	private String segment4;

	@Column(name = "segment5")
	private String segment5;

	@Column(name = "segment6")
	private String segment6;

	@Column(name = "segment7")
	private String segment7;

	@Column(name = "segment8")
	private String segment8;

	@Column(name = "segment9")
	private String segment9;

	@Column(name = "segment10")
	private String segment10;

	@Column(name = "segment11")
	private String segment11;

	@Column(name = "segment12")
	private String segment12;

	@Column(name = "segment13")
	private String segment13;

	@Column(name = "segment14")
	private String segment14;

	@Column(name = "segment15")
	private String segment15;

	@Column(name = "segment16")
	private String segment16;

	@Column(name = "segment17")
	private String segment17;

	@Column(name = "segment18")
	private String segment18;

	@Column(name = "segment19")
	private String segment19;

	@Column(name = "segment20")
	private String segment20;

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

	public String getCategorySystem() {
		return categorySystem;
	}

	public void setCategorySystem(String categorySystem) {
		this.categorySystem = categorySystem;
	}

	public String getCategoryUOM() {
		return categoryUOM;
	}

	public void setCategoryUOM(String categoryUOM) {
		this.categoryUOM = categoryUOM;
	}

	public String getKeyFlexFieldStru() {
		return keyFlexFieldStru;
	}

	public void setKeyFlexFieldStru(String keyFlexFieldStru) {
		this.keyFlexFieldStru = keyFlexFieldStru;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescflexfieldPubdescseg1() {
		return descflexfieldPubdescseg1;
	}

	public void setDescflexfieldPubdescseg1(String descflexfieldPubdescseg1) {
		this.descflexfieldPubdescseg1 = descflexfieldPubdescseg1;
	}

	public String getDescflexfieldPubdescseg2() {
		return descflexfieldPubdescseg2;
	}

	public void setDescflexfieldPubdescseg2(String descflexfieldPubdescseg2) {
		this.descflexfieldPubdescseg2 = descflexfieldPubdescseg2;
	}

	public String getDescflexfieldPubdescseg3() {
		return descflexfieldPubdescseg3;
	}

	public void setDescflexfieldPubdescseg3(String descflexfieldPubdescseg3) {
		this.descflexfieldPubdescseg3 = descflexfieldPubdescseg3;
	}

	public String getDescflexfieldPubdescseg4() {
		return descflexfieldPubdescseg4;
	}

	public void setDescflexfieldPubdescseg4(String descflexfieldPubdescseg4) {
		this.descflexfieldPubdescseg4 = descflexfieldPubdescseg4;
	}

	public String getDescflexfieldPubdescseg5() {
		return descflexfieldPubdescseg5;
	}

	public void setDescflexfieldPubdescseg5(String descflexfieldPubdescseg5) {
		this.descflexfieldPubdescseg5 = descflexfieldPubdescseg5;
	}

	public String getDescflexfieldPubdescseg6() {
		return descflexfieldPubdescseg6;
	}

	public void setDescflexfieldPubdescseg6(String descflexfieldPubdescseg6) {
		this.descflexfieldPubdescseg6 = descflexfieldPubdescseg6;
	}

	public String getDescflexfieldPubdescseg7() {
		return descflexfieldPubdescseg7;
	}

	public void setDescflexfieldPubdescseg7(String descflexfieldPubdescseg7) {
		this.descflexfieldPubdescseg7 = descflexfieldPubdescseg7;
	}

	public String getDescflexfieldPubdescseg8() {
		return descflexfieldPubdescseg8;
	}

	public void setDescflexfieldPubdescseg8(String descflexfieldPubdescseg8) {
		this.descflexfieldPubdescseg8 = descflexfieldPubdescseg8;
	}

	public String getDescflexfieldPubdescseg9() {
		return descflexfieldPubdescseg9;
	}

	public void setDescflexfieldPubdescseg9(String descflexfieldPubdescseg9) {
		this.descflexfieldPubdescseg9 = descflexfieldPubdescseg9;
	}

	public String getDescflexfieldPubdescseg10() {
		return descflexfieldPubdescseg10;
	}

	public void setDescflexfieldPubdescseg10(String descflexfieldPubdescseg10) {
		this.descflexfieldPubdescseg10 = descflexfieldPubdescseg10;
	}

	public String getDescflexfieldPubdescseg11() {
		return descflexfieldPubdescseg11;
	}

	public void setDescflexfieldPubdescseg11(String descflexfieldPubdescseg11) {
		this.descflexfieldPubdescseg11 = descflexfieldPubdescseg11;
	}

	public String getDescflexfieldPubdescseg12() {
		return descflexfieldPubdescseg12;
	}

	public void setDescflexfieldPubdescseg12(String descflexfieldPubdescseg12) {
		this.descflexfieldPubdescseg12 = descflexfieldPubdescseg12;
	}

	public String getDescflexfieldPubdescseg13() {
		return descflexfieldPubdescseg13;
	}

	public void setDescflexfieldPubdescseg13(String descflexfieldPubdescseg13) {
		this.descflexfieldPubdescseg13 = descflexfieldPubdescseg13;
	}

	public String getDescflexfieldPubdescseg14() {
		return descflexfieldPubdescseg14;
	}

	public void setDescflexfieldPubdescseg14(String descflexfieldPubdescseg14) {
		this.descflexfieldPubdescseg14 = descflexfieldPubdescseg14;
	}

	public String getDescflexfieldPubdescseg15() {
		return descflexfieldPubdescseg15;
	}

	public void setDescflexfieldPubdescseg15(String descflexfieldPubdescseg15) {
		this.descflexfieldPubdescseg15 = descflexfieldPubdescseg15;
	}

	public String getDescflexfieldPubdescseg16() {
		return descflexfieldPubdescseg16;
	}

	public void setDescflexfieldPubdescseg16(String descflexfieldPubdescseg16) {
		this.descflexfieldPubdescseg16 = descflexfieldPubdescseg16;
	}

	public String getDescflexfieldPubdescseg17() {
		return descflexfieldPubdescseg17;
	}

	public void setDescflexfieldPubdescseg17(String descflexfieldPubdescseg17) {
		this.descflexfieldPubdescseg17 = descflexfieldPubdescseg17;
	}

	public String getDescflexfieldPubdescseg18() {
		return descflexfieldPubdescseg18;
	}

	public void setDescflexfieldPubdescseg18(String descflexfieldPubdescseg18) {
		this.descflexfieldPubdescseg18 = descflexfieldPubdescseg18;
	}

	public String getDescflexfieldPubdescseg19() {
		return descflexfieldPubdescseg19;
	}

	public void setDescflexfieldPubdescseg19(String descflexfieldPubdescseg19) {
		this.descflexfieldPubdescseg19 = descflexfieldPubdescseg19;
	}

	public String getDescflexfieldPubdescseg20() {
		return descflexfieldPubdescseg20;
	}

	public void setDescflexfieldPubdescseg20(String descflexfieldPubdescseg20) {
		this.descflexfieldPubdescseg20 = descflexfieldPubdescseg20;
	}

	public String getDescflexfieldPubdescseg21() {
		return descflexfieldPubdescseg21;
	}

	public void setDescflexfieldPubdescseg21(String descflexfieldPubdescseg21) {
		this.descflexfieldPubdescseg21 = descflexfieldPubdescseg21;
	}

	public String getDescflexfieldPubdescseg22() {
		return descflexfieldPubdescseg22;
	}

	public void setDescflexfieldPubdescseg22(String descflexfieldPubdescseg22) {
		this.descflexfieldPubdescseg22 = descflexfieldPubdescseg22;
	}

	public String getDescflexfieldPubdescseg23() {
		return descflexfieldPubdescseg23;
	}

	public void setDescflexfieldPubdescseg23(String descflexfieldPubdescseg23) {
		this.descflexfieldPubdescseg23 = descflexfieldPubdescseg23;
	}

	public String getDescflexfieldPubdescseg24() {
		return descflexfieldPubdescseg24;
	}

	public void setDescflexfieldPubdescseg24(String descflexfieldPubdescseg24) {
		this.descflexfieldPubdescseg24 = descflexfieldPubdescseg24;
	}

	public String getDescflexfieldPubdescseg25() {
		return descflexfieldPubdescseg25;
	}

	public void setDescflexfieldPubdescseg25(String descflexfieldPubdescseg25) {
		this.descflexfieldPubdescseg25 = descflexfieldPubdescseg25;
	}

	public String getDescflexfieldPubdescseg26() {
		return descflexfieldPubdescseg26;
	}

	public void setDescflexfieldPubdescseg26(String descflexfieldPubdescseg26) {
		this.descflexfieldPubdescseg26 = descflexfieldPubdescseg26;
	}

	public String getDescflexfieldPubdescseg27() {
		return descflexfieldPubdescseg27;
	}

	public void setDescflexfieldPubdescseg27(String descflexfieldPubdescseg27) {
		this.descflexfieldPubdescseg27 = descflexfieldPubdescseg27;
	}

	public String getDescflexfieldPubdescseg28() {
		return descflexfieldPubdescseg28;
	}

	public void setDescflexfieldPubdescseg28(String descflexfieldPubdescseg28) {
		this.descflexfieldPubdescseg28 = descflexfieldPubdescseg28;
	}

	public String getDescflexfieldPubdescseg29() {
		return descflexfieldPubdescseg29;
	}

	public void setDescflexfieldPubdescseg29(String descflexfieldPubdescseg29) {
		this.descflexfieldPubdescseg29 = descflexfieldPubdescseg29;
	}

	public String getDescflexfieldPubdescseg30() {
		return descflexfieldPubdescseg30;
	}

	public void setDescflexfieldPubdescseg30(String descflexfieldPubdescseg30) {
		this.descflexfieldPubdescseg30 = descflexfieldPubdescseg30;
	}

	public String getDescflexfieldPubdescseg31() {
		return descflexfieldPubdescseg31;
	}

	public void setDescflexfieldPubdescseg31(String descflexfieldPubdescseg31) {
		this.descflexfieldPubdescseg31 = descflexfieldPubdescseg31;
	}

	public String getDescflexfieldPubdescseg32() {
		return descflexfieldPubdescseg32;
	}

	public void setDescflexfieldPubdescseg32(String descflexfieldPubdescseg32) {
		this.descflexfieldPubdescseg32 = descflexfieldPubdescseg32;
	}

	public String getDescflexfieldPubdescseg33() {
		return descflexfieldPubdescseg33;
	}

	public void setDescflexfieldPubdescseg33(String descflexfieldPubdescseg33) {
		this.descflexfieldPubdescseg33 = descflexfieldPubdescseg33;
	}

	public String getDescflexfieldPubdescseg34() {
		return descflexfieldPubdescseg34;
	}

	public void setDescflexfieldPubdescseg34(String descflexfieldPubdescseg34) {
		this.descflexfieldPubdescseg34 = descflexfieldPubdescseg34;
	}

	public String getDescflexfieldPubdescseg35() {
		return descflexfieldPubdescseg35;
	}

	public void setDescflexfieldPubdescseg35(String descflexfieldPubdescseg35) {
		this.descflexfieldPubdescseg35 = descflexfieldPubdescseg35;
	}

	public String getDescflexfieldPubdescseg36() {
		return descflexfieldPubdescseg36;
	}

	public void setDescflexfieldPubdescseg36(String descflexfieldPubdescseg36) {
		this.descflexfieldPubdescseg36 = descflexfieldPubdescseg36;
	}

	public String getDescflexfieldPubdescseg37() {
		return descflexfieldPubdescseg37;
	}

	public void setDescflexfieldPubdescseg37(String descflexfieldPubdescseg37) {
		this.descflexfieldPubdescseg37 = descflexfieldPubdescseg37;
	}

	public String getDescflexfieldPubdescseg38() {
		return descflexfieldPubdescseg38;
	}

	public void setDescflexfieldPubdescseg38(String descflexfieldPubdescseg38) {
		this.descflexfieldPubdescseg38 = descflexfieldPubdescseg38;
	}

	public String getDescflexfieldPubdescseg39() {
		return descflexfieldPubdescseg39;
	}

	public void setDescflexfieldPubdescseg39(String descflexfieldPubdescseg39) {
		this.descflexfieldPubdescseg39 = descflexfieldPubdescseg39;
	}

	public String getDescflexfieldPubdescseg40() {
		return descflexfieldPubdescseg40;
	}

	public void setDescflexfieldPubdescseg40(String descflexfieldPubdescseg40) {
		this.descflexfieldPubdescseg40 = descflexfieldPubdescseg40;
	}

	public String getDescflexfieldPubdescseg41() {
		return descflexfieldPubdescseg41;
	}

	public void setDescflexfieldPubdescseg41(String descflexfieldPubdescseg41) {
		this.descflexfieldPubdescseg41 = descflexfieldPubdescseg41;
	}

	public String getDescflexfieldPubdescseg42() {
		return descflexfieldPubdescseg42;
	}

	public void setDescflexfieldPubdescseg42(String descflexfieldPubdescseg42) {
		this.descflexfieldPubdescseg42 = descflexfieldPubdescseg42;
	}

	public String getDescflexfieldPubdescseg43() {
		return descflexfieldPubdescseg43;
	}

	public void setDescflexfieldPubdescseg43(String descflexfieldPubdescseg43) {
		this.descflexfieldPubdescseg43 = descflexfieldPubdescseg43;
	}

	public String getDescflexfieldPubdescseg44() {
		return descflexfieldPubdescseg44;
	}

	public void setDescflexfieldPubdescseg44(String descflexfieldPubdescseg44) {
		this.descflexfieldPubdescseg44 = descflexfieldPubdescseg44;
	}

	public String getDescflexfieldPubdescseg45() {
		return descflexfieldPubdescseg45;
	}

	public void setDescflexfieldPubdescseg45(String descflexfieldPubdescseg45) {
		this.descflexfieldPubdescseg45 = descflexfieldPubdescseg45;
	}

	public String getDescflexfieldPubdescseg46() {
		return descflexfieldPubdescseg46;
	}

	public void setDescflexfieldPubdescseg46(String descflexfieldPubdescseg46) {
		this.descflexfieldPubdescseg46 = descflexfieldPubdescseg46;
	}

	public String getDescflexfieldPubdescseg47() {
		return descflexfieldPubdescseg47;
	}

	public void setDescflexfieldPubdescseg47(String descflexfieldPubdescseg47) {
		this.descflexfieldPubdescseg47 = descflexfieldPubdescseg47;
	}

	public String getDescflexfieldPubdescseg48() {
		return descflexfieldPubdescseg48;
	}

	public void setDescflexfieldPubdescseg48(String descflexfieldPubdescseg48) {
		this.descflexfieldPubdescseg48 = descflexfieldPubdescseg48;
	}

	public String getDescflexfieldPubdescseg49() {
		return descflexfieldPubdescseg49;
	}

	public void setDescflexfieldPubdescseg49(String descflexfieldPubdescseg49) {
		this.descflexfieldPubdescseg49 = descflexfieldPubdescseg49;
	}

	public String getDescflexfieldPubdescseg50() {
		return descflexfieldPubdescseg50;
	}

	public void setDescflexfieldPubdescseg50(String descflexfieldPubdescseg50) {
		this.descflexfieldPubdescseg50 = descflexfieldPubdescseg50;
	}

	public String getDescflexfieldContextvalue() {
		return descflexfieldContextvalue;
	}

	public void setDescflexfieldContextvalue(String descflexfieldContextvalue) {
		this.descflexfieldContextvalue = descflexfieldContextvalue;
	}

	public String getDescflexfieldPrivatedescseg1() {
		return descflexfieldPrivatedescseg1;
	}

	public void setDescflexfieldPrivatedescseg1(String descflexfieldPrivatedescseg1) {
		this.descflexfieldPrivatedescseg1 = descflexfieldPrivatedescseg1;
	}

	public String getDescflexfieldPrivatedescseg2() {
		return descflexfieldPrivatedescseg2;
	}

	public void setDescflexfieldPrivatedescseg2(String descflexfieldPrivatedescseg2) {
		this.descflexfieldPrivatedescseg2 = descflexfieldPrivatedescseg2;
	}

	public String getDescflexfieldPrivatedescseg3() {
		return descflexfieldPrivatedescseg3;
	}

	public void setDescflexfieldPrivatedescseg3(String descflexfieldPrivatedescseg3) {
		this.descflexfieldPrivatedescseg3 = descflexfieldPrivatedescseg3;
	}

	public String getDescflexfieldPrivatedescseg4() {
		return descflexfieldPrivatedescseg4;
	}

	public void setDescflexfieldPrivatedescseg4(String descflexfieldPrivatedescseg4) {
		this.descflexfieldPrivatedescseg4 = descflexfieldPrivatedescseg4;
	}

	public String getDescflexfieldPrivatedescseg5() {
		return descflexfieldPrivatedescseg5;
	}

	public void setDescflexfieldPrivatedescseg5(String descflexfieldPrivatedescseg5) {
		this.descflexfieldPrivatedescseg5 = descflexfieldPrivatedescseg5;
	}

	public String getDescflexfieldPrivatedescseg6() {
		return descflexfieldPrivatedescseg6;
	}

	public void setDescflexfieldPrivatedescseg6(String descflexfieldPrivatedescseg6) {
		this.descflexfieldPrivatedescseg6 = descflexfieldPrivatedescseg6;
	}

	public String getDescflexfieldPrivatedescseg7() {
		return descflexfieldPrivatedescseg7;
	}

	public void setDescflexfieldPrivatedescseg7(String descflexfieldPrivatedescseg7) {
		this.descflexfieldPrivatedescseg7 = descflexfieldPrivatedescseg7;
	}

	public String getDescflexfieldPrivatedescseg8() {
		return descflexfieldPrivatedescseg8;
	}

	public void setDescflexfieldPrivatedescseg8(String descflexfieldPrivatedescseg8) {
		this.descflexfieldPrivatedescseg8 = descflexfieldPrivatedescseg8;
	}

	public String getDescflexfieldPrivatedescseg9() {
		return descflexfieldPrivatedescseg9;
	}

	public void setDescflexfieldPrivatedescseg9(String descflexfieldPrivatedescseg9) {
		this.descflexfieldPrivatedescseg9 = descflexfieldPrivatedescseg9;
	}

	public String getDescflexfieldPrivatedescseg10() {
		return descflexfieldPrivatedescseg10;
	}

	public void setDescflexfieldPrivatedescseg10(String descflexfieldPrivatedescseg10) {
		this.descflexfieldPrivatedescseg10 = descflexfieldPrivatedescseg10;
	}

	public String getDescflexfieldPrivatedescseg11() {
		return descflexfieldPrivatedescseg11;
	}

	public void setDescflexfieldPrivatedescseg11(String descflexfieldPrivatedescseg11) {
		this.descflexfieldPrivatedescseg11 = descflexfieldPrivatedescseg11;
	}

	public String getDescflexfieldPrivatedescseg12() {
		return descflexfieldPrivatedescseg12;
	}

	public void setDescflexfieldPrivatedescseg12(String descflexfieldPrivatedescseg12) {
		this.descflexfieldPrivatedescseg12 = descflexfieldPrivatedescseg12;
	}

	public String getDescflexfieldPrivatedescseg13() {
		return descflexfieldPrivatedescseg13;
	}

	public void setDescflexfieldPrivatedescseg13(String descflexfieldPrivatedescseg13) {
		this.descflexfieldPrivatedescseg13 = descflexfieldPrivatedescseg13;
	}

	public String getDescflexfieldPrivatedescseg14() {
		return descflexfieldPrivatedescseg14;
	}

	public void setDescflexfieldPrivatedescseg14(String descflexfieldPrivatedescseg14) {
		this.descflexfieldPrivatedescseg14 = descflexfieldPrivatedescseg14;
	}

	public String getDescflexfieldPrivatedescseg15() {
		return descflexfieldPrivatedescseg15;
	}

	public void setDescflexfieldPrivatedescseg15(String descflexfieldPrivatedescseg15) {
		this.descflexfieldPrivatedescseg15 = descflexfieldPrivatedescseg15;
	}

	public String getDescflexfieldPrivatedescseg16() {
		return descflexfieldPrivatedescseg16;
	}

	public void setDescflexfieldPrivatedescseg16(String descflexfieldPrivatedescseg16) {
		this.descflexfieldPrivatedescseg16 = descflexfieldPrivatedescseg16;
	}

	public String getDescflexfieldPrivatedescseg17() {
		return descflexfieldPrivatedescseg17;
	}

	public void setDescflexfieldPrivatedescseg17(String descflexfieldPrivatedescseg17) {
		this.descflexfieldPrivatedescseg17 = descflexfieldPrivatedescseg17;
	}

	public String getDescflexfieldPrivatedescseg18() {
		return descflexfieldPrivatedescseg18;
	}

	public void setDescflexfieldPrivatedescseg18(String descflexfieldPrivatedescseg18) {
		this.descflexfieldPrivatedescseg18 = descflexfieldPrivatedescseg18;
	}

	public String getDescflexfieldPrivatedescseg19() {
		return descflexfieldPrivatedescseg19;
	}

	public void setDescflexfieldPrivatedescseg19(String descflexfieldPrivatedescseg19) {
		this.descflexfieldPrivatedescseg19 = descflexfieldPrivatedescseg19;
	}

	public String getDescflexfieldPrivatedescseg20() {
		return descflexfieldPrivatedescseg20;
	}

	public void setDescflexfieldPrivatedescseg20(String descflexfieldPrivatedescseg20) {
		this.descflexfieldPrivatedescseg20 = descflexfieldPrivatedescseg20;
	}

	public String getDescflexfieldPrivatedescseg21() {
		return descflexfieldPrivatedescseg21;
	}

	public void setDescflexfieldPrivatedescseg21(String descflexfieldPrivatedescseg21) {
		this.descflexfieldPrivatedescseg21 = descflexfieldPrivatedescseg21;
	}

	public String getDescflexfieldPrivatedescseg22() {
		return descflexfieldPrivatedescseg22;
	}

	public void setDescflexfieldPrivatedescseg22(String descflexfieldPrivatedescseg22) {
		this.descflexfieldPrivatedescseg22 = descflexfieldPrivatedescseg22;
	}

	public String getDescflexfieldPrivatedescseg23() {
		return descflexfieldPrivatedescseg23;
	}

	public void setDescflexfieldPrivatedescseg23(String descflexfieldPrivatedescseg23) {
		this.descflexfieldPrivatedescseg23 = descflexfieldPrivatedescseg23;
	}

	public String getDescflexfieldPrivatedescseg24() {
		return descflexfieldPrivatedescseg24;
	}

	public void setDescflexfieldPrivatedescseg24(String descflexfieldPrivatedescseg24) {
		this.descflexfieldPrivatedescseg24 = descflexfieldPrivatedescseg24;
	}

	public String getDescflexfieldPrivatedescseg25() {
		return descflexfieldPrivatedescseg25;
	}

	public void setDescflexfieldPrivatedescseg25(String descflexfieldPrivatedescseg25) {
		this.descflexfieldPrivatedescseg25 = descflexfieldPrivatedescseg25;
	}

	public String getDescflexfieldPrivatedescseg26() {
		return descflexfieldPrivatedescseg26;
	}

	public void setDescflexfieldPrivatedescseg26(String descflexfieldPrivatedescseg26) {
		this.descflexfieldPrivatedescseg26 = descflexfieldPrivatedescseg26;
	}

	public String getDescflexfieldPrivatedescseg27() {
		return descflexfieldPrivatedescseg27;
	}

	public void setDescflexfieldPrivatedescseg27(String descflexfieldPrivatedescseg27) {
		this.descflexfieldPrivatedescseg27 = descflexfieldPrivatedescseg27;
	}

	public String getDescflexfieldPrivatedescseg28() {
		return descflexfieldPrivatedescseg28;
	}

	public void setDescflexfieldPrivatedescseg28(String descflexfieldPrivatedescseg28) {
		this.descflexfieldPrivatedescseg28 = descflexfieldPrivatedescseg28;
	}

	public String getDescflexfieldPrivatedescseg29() {
		return descflexfieldPrivatedescseg29;
	}

	public void setDescflexfieldPrivatedescseg29(String descflexfieldPrivatedescseg29) {
		this.descflexfieldPrivatedescseg29 = descflexfieldPrivatedescseg29;
	}

	public String getDescflexfieldPrivatedescseg30() {
		return descflexfieldPrivatedescseg30;
	}

	public void setDescflexfieldPrivatedescseg30(String descflexfieldPrivatedescseg30) {
		this.descflexfieldPrivatedescseg30 = descflexfieldPrivatedescseg30;
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

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getMasterOrg() {
		return masterOrg;
	}

	public void setMasterOrg(String masterOrg) {
		this.masterOrg = masterOrg;
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

}
