package com.caijai.data.entity.vo;

import com.caijai.base.entity.BaseEntity;

public class PartVO extends BaseEntity{

	private static final long serialVersionUID = 5812386524217334607L;

	private String id;
	
	private String code;
	
	private String name;
	
	private String categoryCode;
	
	private String categoryName;
	
	private String org;

	private Integer dr;

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

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	@Override
	public String toString() {
		return "PartVO [id=" + id + ", code=" + code + ", name=" + name + ", categoryCode=" + categoryCode
				+ ", categoryName=" + categoryName + ", org=" + org + ", dr=" + dr + "]";
	}
	
}
