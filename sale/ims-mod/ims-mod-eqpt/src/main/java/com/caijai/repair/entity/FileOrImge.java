package com.caijai.repair.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseEntity;
import com.caijai.base.sysenum.U9STATE;

@Table(name="EQ_FileOrImge")
public class FileOrImge extends BaseEntity{

	private static final long serialVersionUID = 4265869545025305014L;

	/**
	 * ID
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 编码
	 */
	@Column(name = "Code")
	private String code;

	/**
	 * 名称
	 */
	@Column(name = "Name")
	private String name;
	
	/**
	 * 类型
	 */
	@Column(name = "type")
	private String type;
	
	/**
	 * 路径
	 */
	@Column(name = "Location")
	private String location;
	
	/**
	 * 设备组
	 */
	@Column(name = "EmGroup")
	private String emGroup;
	
	/**
	 * 设备组
	 */
	@Column(name = "emGroupName",readonly = true)
	@Relation( table = "EQ_EMGroup", value = "id",show = "name",ref="emGroupID")
	private String emGroupName;
	
	/**
	 * 方案
	 */
	@Column(name = "Method")
	private String method;
	
	/**
	 * 备注
	 */
	@Column(name = "Memo")
	private String memo;
	
	/**
	 * 生效
	 */
	@Column(name = "isstate")
	private U9STATE isstate;

	/**
	 * 组织
	 */
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmGroup() {
		return emGroup;
	}

	public void setEmGroup(String emGroup) {
		this.emGroup = emGroup;
	}

	public String getEmGroupName() {
		return emGroupName;
	}

	public void setEmGroupName(String emGroupName) {
		this.emGroupName = emGroupName;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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

	@Override
	public String toString() {
		return "FileOrImge [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + ", location="
				+ location + ", emGroup=" + emGroup + ", emGroupName=" + emGroupName + ", method=" + method + ", memo="
				+ memo + ", isstate=" + isstate + ", org=" + org + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", dr=" + dr + ", ts=" + ts
				+ "]";
	}
}
