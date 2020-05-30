package com.caijai.common.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
* 
* @author whd
* @String 2019-05-17
* 用户与自定义组件关系表
* 数据表COMMON_CUSTOM映射bean，由Mybaits自动生成工具生成
*/
@Table(name="COMMON_CUSTOM")
public class Custom extends BaseTable{
	private static final long serialVersionUID = 1928314501966590304L;

	/**
     * 主键ID
	 * 列名:id 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "id",primary=true)
    private String id;

    /**
     * 用户ID
	 * 列名:cus_user_id 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "cus_user_id")
    private String cusUserId;

    /**
     * 自定义组件ID
	 * 列名:cus_ass_id 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "cus_ass_id")
    private String cusAssId;

    /**
     * 删除标识 1代表是   0代表否
	 * 列名:dr 类型:INTEGER(10) 允许空:true 缺省值:null
     */
    @Column(name = "dr")
    private Integer dr;

    /**
     * 时间戳
	 * 列名:ts 类型:TIMESTAMP(23) 允许空:true 缺省值:null
     */
    @Column(name = "ts")
    private String ts;

    /**
     * 创建时间
	 * 列名:createdOn 类型:TIMESTAMP(23) 允许空:true 缺省值:null
     */
    @Column(name = "createdOn")
    private String createdon;

    /**
     * 创建人
	 * 列名:createdBy 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "createdBy")
    private String createdby;

    /**
     * 修改时间
	 * 列名:modifiedOn 类型:TIMESTAMP(23) 允许空:true 缺省值:null
     */
    @Column(name = "modifiedOn")
    private String modifiedon;

    /**
     * 修改人
	 * 列名:modifiedBy 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "modifiedBy")
    private String modifiedby;

    /**
     * 组织ID
	 * 列名:org 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "org")
    private String org;

    /**
     * 预留字段
	 * 列名:def1 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def1")
    private String def1;

    /**
     * 预留字段
	 * 列名:def2 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def2")
    private String def2;

    /**
     * 预留字段
	 * 列名:def3 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def3")
    private String def3;

    /**
     * 预留字段
	 * 列名:def4 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def4")
    private String def4;

    /**
     * 预留字段
	 * 列名:def5 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def5")
    private String def5;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCusUserId() {
        return cusUserId;
    }

    public void setCusUserId(String cusUserId) {
        this.cusUserId = cusUserId == null ? null : cusUserId.trim();
    }

    public String getCusAssId() {
        return cusAssId;
    }

    public void setCusAssId(String cusAssId) {
        this.cusAssId = cusAssId == null ? null : cusAssId.trim();
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

    public String getCreatedon() {
        return createdon;
    }

    public void setCreatedon(String createdon) {
        this.createdon = createdon;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public String getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(String modifiedon) {
        this.modifiedon = modifiedon;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby == null ? null : modifiedby.trim();
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org == null ? null : org.trim();
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1 == null ? null : def1.trim();
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2 == null ? null : def2.trim();
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3 == null ? null : def3.trim();
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4 == null ? null : def4.trim();
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5 == null ? null : def5.trim();
    }

	@Override
	public String toString() {
		return "Custom [id=" + id + ", cusUserId=" + cusUserId + ", cusAssId=" + cusAssId + ", dr=" + dr + ", ts=" + ts
				+ ", createdon=" + createdon + ", createdby=" + createdby + ", modifiedon=" + modifiedon
				+ ", modifiedby=" + modifiedby + ", org=" + org + ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3
				+ ", def4=" + def4 + ", def5=" + def5 + "]";
	}
    
}