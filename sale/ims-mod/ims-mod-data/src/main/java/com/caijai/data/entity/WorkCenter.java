package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;

/**
 * Title:WorkCenter
 * <p>
 * Description: 工作中心
 * 
 * @author 杨雪景
 * @date 2019年4月
 */
@Table(name = "BD_WorkCenter")
public class WorkCenter extends BaseTable {

	private static final long serialVersionUID = -7250032922274420758L;

	@Column(name = "ID")
	private String id;

	@Column(name = "Bin")
	private String bin;

	@Column(name = "Code")
	private String code;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedOn", sort = Sort.DESC)
	private String createdOn;

	@Column(name = "Department")
	private String department;

	@Column(name = "DeptName", readonly = true)
	@Relation(table = "SYS_Department", value = "id", ref = "department", show = "name")
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Column(name = "DescFlexField_ContextValue")
	private String descFlexField_ContextValue;

	@Column(name = "DescFlexField_PrivateDescSeg1")
	private String descFlexField_PrivateDescSeg1;

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

	@Column(name = "DescFlexField_PrivateDescSeg2")
	private String descFlexField_PrivateDescSeg2;

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

	@Column(name = "DescFlexField_PrivateDescSeg3")
	private String descFlexField_PrivateDescSeg3;

	@Column(name = "DescFlexField_PrivateDescSeg30")
	private String descFlexField_PrivateDescSeg30;

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

	@Column(name = "DescFlexField_PubDescSeg1")
	private String descFlexField_PubDescSeg1;

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

	@Column(name = "DescFlexField_PubDescSeg2")
	private String descFlexField_PubDescSeg2;

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

	@Column(name = "DescFlexField_PubDescSeg3")
	private String descFlexField_PubDescSeg3;

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

	@Column(name = "DescFlexField_PubDescSeg4")
	private String descFlexField_PubDescSeg4;

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

	@Column(name = "DescFlexField_PubDescSeg5")
	private String descFlexField_PubDescSeg5;

	@Column(name = "DescFlexField_PubDescSeg50")
	private String descFlexField_PubDescSeg50;

	@Column(name = "DescFlexField_PubDescSeg6")
	private String descFlexField_PubDescSeg6;

	@Column(name = "DescFlexField_PubDescSeg7")
	private String descFlexField_PubDescSeg7;

	@Column(name = "DescFlexField_PubDescSeg8")
	private String descFlexField_PubDescSeg8;

	@Column(name = "DescFlexField_PubDescSeg9")
	private String descFlexField_PubDescSeg9;

	@Column(name = "Dr")
	private Integer dr;

	@Column(name = "Effective_DisableDate")
	private String effective_DisableDate;

	@Column(name = "Effective_EffectiveDate")
	private String effective_EffectiveDate;

	@Column(name = "Effective_IsEffective")
	private Integer effective_IsEffective;

	@Column(name = "Factory")
	private String factory;

	@Column(name = "IdealCapacity")
	private Double idealCapacity;

	@Column(name = "Is24")
	private Integer is24;

	@Column(name = "IsBottleneckWC")
	private Integer isBottleneckWC;

	@Column(name = "IsCalcCapacity")
	private Integer isCalcCapacity;

	@Column(name = "IsKeyWorkCenter")
	private Integer isKeyWorkCenter;

	@Column(name = "KeyType")
	private Integer keyType;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

	@Column(name = "Name")
	private String name;

	@Column(name = "NormalCapacity")
	private Double normalCapacity;

	@Column(name = "Org")
	private String org;

	@Column(name = "PreBufferTime")
	private Double preBufferTime;

	@Column(name = "StandardCapacity")
	private Double standardCapacity;

	@Column(name = "SyncMemo")
	private String syncMemo;

	@Column(name = "SyncSource")
	private String syncSource;

	@Column(name = "SyncSourceID")
	private String syncSourceID;

	@Column(name = "SyncTs")
	private String syncTs;

	@Column(name = "SysVersion")
	private String sysVersion;

	@Column(name = "TimeUOM")
	private String timeUOM;

	@Column(name = "Ts")
	private String ts;

	@Column(name = "WareHouse")
	private String wareHouse;

	@Column(name = "WorkCalendar")
	private String workCalendar;

	@Column(name = "WorkCenterGroup")
	private Integer workCenterGroup;

	@Column(name = "WorkCenterType")
	private Integer workCenterType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	public String getDescFlexField_PrivateDescSeg2() {
		return descFlexField_PrivateDescSeg2;
	}

	public void setDescFlexField_PrivateDescSeg2(String descFlexField_PrivateDescSeg2) {
		this.descFlexField_PrivateDescSeg2 = descFlexField_PrivateDescSeg2;
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

	public String getDescFlexField_PrivateDescSeg3() {
		return descFlexField_PrivateDescSeg3;
	}

	public void setDescFlexField_PrivateDescSeg3(String descFlexField_PrivateDescSeg3) {
		this.descFlexField_PrivateDescSeg3 = descFlexField_PrivateDescSeg3;
	}

	public String getDescFlexField_PrivateDescSeg30() {
		return descFlexField_PrivateDescSeg30;
	}

	public void setDescFlexField_PrivateDescSeg30(String descFlexField_PrivateDescSeg30) {
		this.descFlexField_PrivateDescSeg30 = descFlexField_PrivateDescSeg30;
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

	public String getDescFlexField_PubDescSeg1() {
		return descFlexField_PubDescSeg1;
	}

	public void setDescFlexField_PubDescSeg1(String descFlexField_PubDescSeg1) {
		this.descFlexField_PubDescSeg1 = descFlexField_PubDescSeg1;
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

	public String getDescFlexField_PubDescSeg2() {
		return descFlexField_PubDescSeg2;
	}

	public void setDescFlexField_PubDescSeg2(String descFlexField_PubDescSeg2) {
		this.descFlexField_PubDescSeg2 = descFlexField_PubDescSeg2;
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

	public String getDescFlexField_PubDescSeg3() {
		return descFlexField_PubDescSeg3;
	}

	public void setDescFlexField_PubDescSeg3(String descFlexField_PubDescSeg3) {
		this.descFlexField_PubDescSeg3 = descFlexField_PubDescSeg3;
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

	public String getDescFlexField_PubDescSeg4() {
		return descFlexField_PubDescSeg4;
	}

	public void setDescFlexField_PubDescSeg4(String descFlexField_PubDescSeg4) {
		this.descFlexField_PubDescSeg4 = descFlexField_PubDescSeg4;
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

	public String getDescFlexField_PubDescSeg5() {
		return descFlexField_PubDescSeg5;
	}

	public void setDescFlexField_PubDescSeg5(String descFlexField_PubDescSeg5) {
		this.descFlexField_PubDescSeg5 = descFlexField_PubDescSeg5;
	}

	public String getDescFlexField_PubDescSeg50() {
		return descFlexField_PubDescSeg50;
	}

	public void setDescFlexField_PubDescSeg50(String descFlexField_PubDescSeg50) {
		this.descFlexField_PubDescSeg50 = descFlexField_PubDescSeg50;
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

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getEffective_DisableDate() {
		return effective_DisableDate;
	}

	public void setEffective_DisableDate(String effective_DisableDate) {
		this.effective_DisableDate = effective_DisableDate;
	}

	public String getEffective_EffectiveDate() {
		return effective_EffectiveDate;
	}

	public void setEffective_EffectiveDate(String effective_EffectiveDate) {
		this.effective_EffectiveDate = effective_EffectiveDate;
	}

	public Integer getEffective_IsEffective() {
		return effective_IsEffective;
	}

	public void setEffective_IsEffective(Integer effective_IsEffective) {
		this.effective_IsEffective = effective_IsEffective;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public Double getIdealCapacity() {
		return idealCapacity;
	}

	public void setIdealCapacity(Double idealCapacity) {
		this.idealCapacity = idealCapacity;
	}

	public Integer getIs24() {
		return is24;
	}

	public void setIs24(Integer is24) {
		this.is24 = is24;
	}

	public Integer getIsBottleneckWC() {
		return isBottleneckWC;
	}

	public void setIsBottleneckWC(Integer isBottleneckWC) {
		this.isBottleneckWC = isBottleneckWC;
	}

	public Integer getIsCalcCapacity() {
		return isCalcCapacity;
	}

	public void setIsCalcCapacity(Integer isCalcCapacity) {
		this.isCalcCapacity = isCalcCapacity;
	}

	public Integer getIsKeyWorkCenter() {
		return isKeyWorkCenter;
	}

	public void setIsKeyWorkCenter(Integer isKeyWorkCenter) {
		this.isKeyWorkCenter = isKeyWorkCenter;
	}

	public Integer getKeyType() {
		return keyType;
	}

	public void setKeyType(Integer keyType) {
		this.keyType = keyType;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getNormalCapacity() {
		return normalCapacity;
	}

	public void setNormalCapacity(Double normalCapacity) {
		this.normalCapacity = normalCapacity;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public Double getPreBufferTime() {
		return preBufferTime;
	}

	public void setPreBufferTime(Double preBufferTime) {
		this.preBufferTime = preBufferTime;
	}

	public Double getStandardCapacity() {
		return standardCapacity;
	}

	public void setStandardCapacity(Double standardCapacity) {
		this.standardCapacity = standardCapacity;
	}

	public String getSyncMemo() {
		return syncMemo;
	}

	public void setSyncMemo(String syncMemo) {
		this.syncMemo = syncMemo;
	}

	public String getSyncSource() {
		return syncSource;
	}

	public void setSyncSource(String syncSource) {
		this.syncSource = syncSource;
	}

	public String getSyncSourceID() {
		return syncSourceID;
	}

	public void setSyncSourceID(String syncSourceID) {
		this.syncSourceID = syncSourceID;
	}

	public String getSyncTs() {
		return syncTs;
	}

	public void setSyncTs(String syncTs) {
		this.syncTs = syncTs;
	}

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getTimeUOM() {
		return timeUOM;
	}

	public void setTimeUOM(String timeUOM) {
		this.timeUOM = timeUOM;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getWareHouse() {
		return wareHouse;
	}

	public void setWareHouse(String wareHouse) {
		this.wareHouse = wareHouse;
	}

	public String getWorkCalendar() {
		return workCalendar;
	}

	public void setWorkCalendar(String workCalendar) {
		this.workCalendar = workCalendar;
	}

	public Integer getWorkCenterGroup() {
		return workCenterGroup;
	}

	public void setWorkCenterGroup(Integer workCenterGroup) {
		this.workCenterGroup = workCenterGroup;
	}

	public Integer getWorkCenterType() {
		return workCenterType;
	}

	public void setWorkCenterType(Integer workCenterType) {
		this.workCenterType = workCenterType;
	}

}
