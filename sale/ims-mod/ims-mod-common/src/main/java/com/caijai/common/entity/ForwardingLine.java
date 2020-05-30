package com.caijai.common.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
* 
* @author whd
* @date 2019-06-10
* 数据表InvDoc_ForwardingLine映射bean，由Mybaits自动生成工具生成
*/
@Table(name="InvDoc_ForwardingLine")
public class ForwardingLine extends BaseTable{
	private static final long serialVersionUID = 3383981977389234836L;

	/**
     * 
	 * 列名:id 类型:NVARCHAR(100) 允许空:false 缺省值:null
     */
    @Column(name = "id",primary=true)
    private String id;

    /**
     * 
	 * 列名:pickingID 类型:NVARCHAR(255) 允许空:true 缺省值:null
     */
    @Column(name = "pickingID")
    private String pickingID;

    /**
     * 
	 * 列名:forwardingID 类型:NVARCHAR(255) 允许空:true 缺省值:null
     */
    @Column(name = "forwardingID")
    private String forwardingID;

    /**
     * 
	 * 列名:itemCode 类型:NVARCHAR(255) 允许空:true 缺省值:null
     */
    @Column(name = "itemCode")
    private String itemCode;

    /**
     * 
	 * 列名:itemName 类型:NVARCHAR(255) 允许空:true 缺省值:null
     */
    @Column(name = "itemName")
    private String itemName;

    /**
     * 车次
	 * 列名:VehicleCoding 类型:NVARCHAR(255) 允许空:true 缺省值:null
     */
    @Column(name = "VehicleCode")
    private String vehicleCode;

    /**
     * 
	 * 列名:address 类型:NVARCHAR(255) 允许空:true 缺省值:null
     */
    @Column(name = "address")
    private String address;

    /**
     * 
	 * 列名:docNo 类型:NVARCHAR(255) 允许空:true 缺省值:null
     */
    @Column(name = "docNo")
    private String docNo;

    /**
     * 
	 * 列名:status 类型:INTEGER(10) 允许空:true 缺省值:null
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 
	 * 列名:dr 类型:INTEGER(10) 允许空:true 缺省值:null
     */
    @Column(name = "dr")
    private Integer dr;

    /**
     * 
	 * 列名:ts 类型:TIMESTAMP(23) 允许空:true 缺省值:null
     */
    @Column(name = "ts")
    private String ts;

    /**
     * 
	 * 列名:createdOn 类型:TIMESTAMP(23) 允许空:true 缺省值:null
     */
    @Column(name = "createdOn")
    private String createdOn;

    /**
     * 
	 * 列名:createdBy 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "createdBy")
    private String createdBy;

    /**
     * 
	 * 列名:modifiedOn 类型:TIMESTAMP(23) 允许空:true 缺省值:null
     */
    @Column(name = "modifiedOn")
    private String modifiedOn;

    /**
     * 
	 * 列名:modifiedBy 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "modifiedBy")
    private String modifiedBy;

    /**
     * 
	 * 列名:org 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "org")
    private String org;

    /**
     * 
	 * 列名:def2 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def2")
    private String def2;

    /**
     * 
	 * 列名:def3 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def3")
    private String def3;

    /**
     * 
	 * 列名:def4 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def4")
    private String def4;

    /**
     * 
	 * 列名:def5 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def5")
    private String def5;

    /**
     * 
	 * 列名:def1 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def1")
    private String def1;

    /**
     * 
	 * 列名:remark 类型:NVARCHAR(1000) 允许空:true 缺省值:null
     */
    @Column(name = "remark")
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPickingID() {
		return pickingID;
	}

	public void setPickingID(String pickingID) {
		this.pickingID = pickingID;
	}

	public String getForwardingID() {
		return forwardingID;
	}

	public void setForwardingID(String forwardingID) {
		this.forwardingID = forwardingID;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getVehicleCode() {
		return vehicleCode;
	}

	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDocNo() {
		return docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
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

	public String getDef1() {
		return def1;
	}

	public void setDef1(String def1) {
		this.def1 = def1;
	}

	public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}