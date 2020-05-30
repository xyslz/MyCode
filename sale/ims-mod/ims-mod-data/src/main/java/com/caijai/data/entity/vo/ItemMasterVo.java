package com.caijai.data.entity.vo;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.ItemParamWay;
import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.sysenum.Sort;
import com.caijai.base.sysenum.Wrap;

@Table(name = "BD_ItemMaster")
public class ItemMasterVo extends BaseTable {

	private static final long serialVersionUID = 7941100757258160973L;

	@Column(name = "ID", primary = true)
	private String id;
	
	private Double lp;

	private Double ln;
	
	/**
	 * 质检方案（新增）
	 */
	@Column(name = "QCSchemaHead")
	private String qcSchemaHead;
	
	/**
	 * 质检方案编码（新增）
	 */
	@Column(name="qcSchemaHeadCode" ,readonly =true)
	@Relation(table="QC_QCSchemaHead",ref="qcSchemaHead",show="code", value = "id")
	private String qcSchemaHeadCode;
	
	/**
	 * 质检方案名称（新增）
	 */
	@Column(name="qcSchemaHeadName" ,readonly =true)
	@Relation(table="QC_QCSchemaHead",ref="qcSchemaHead",show="name", value = "id")
	private String qcSchemaHeadName;

	/**
	 * 料品编码-大类码（新增）
	 */
	@Column(name = "Segment1")
	private String segment1;

	/**
	 * 料品编码-小类码（新增）
	 */
	@Column(name = "Segment2")
	private String segment2;

	/**
	 * 编码（新增）
	 */
	@Column(name = "Segment3")
	private String segment3;

	/**
	 * 定额（新增（外高桥项目完工显示用））
	 */
	@Column(name = "DescFlexField_PrivateDescSeg14")
	private String quota;

	/**
	 * 堆积密度
	 */
	@Column(name = "packDensity")
	private Double packDensity;

	/**
	 * MRP包装方式
	 */
	@Column(name = "packWay")
	private ItemParamWay packWay;

	/**
	 * 缠绕外套摸
	 */
	@Column(name = "wrap")
	private Wrap wrap;

	/**
	 * MRP分类
	 */
	@Column(name = "MRPCategory")
	private String mrpCategory;

	/**
	 * 参考料号1 nvarchar
	 */
	@Column(name = "Code1")
	private String code1;

	/**
	 * 参考料号2 nvarchar
	 */
	@Column(name = "Code2")
	private String code2;

	/**
	 * 创建人 nvarchar
	 */
	@Column(name = "CreatedBy")
	private String createdBy;

	/**
	 * 创建时间 datetime
	 */
	@Column(name = "CreatedOn" , sort = Sort.DESC)
	private String createdOn;

	/**
	 * 规格 nvarchar
	 */
	@Column(name = "SPECS")
	private String specs;

	/**
	 * 料号 nvarchar
	 */
	@Column(name = "Code")
	private String code;

	/**
	 * 品名 nvarchar
	 */
	@Column(name = "Name")
	private String name;

	/**
	 * 起始成分 int
	 */
	@Column(name = "StartPotency")
	private Integer startPotency;

	/**
	 * 起始等级 int
	 */
	@Column(name = "StartGrade")
	private Integer startGrade;

	/**
	 * 生产单位 bigint
	 */
	@Column(name = "ManufactureUOM")
	private String manufactureUOM;

	@Column(name = "manufactureUOMName", readonly = true)
	@Relation(table = "BD_UOM", value = "id", ref = "ManufactureUOM", show = "name")
	private String manufactureUOMName;

	@Column(name = "Ratio", readonly = true)
	@Relation(table = "BD_ItemConvertRatioInClass", value = "ItemMaster", ref = "id", show = "ratio")
	private String ratio;

	@Column(name = "RatioUOMName", readonly = true)
	@Relation(table = "BD_ItemConvertRatioInClass", value = "ItemMaster", ref = "id", show = "UOMName")
	private String ratioUOMName;

	/**
	 * 采购单位
	 */
	@Column(name = "purchaseUOM")
	private String purchaseUOM;

	@Column(name = "purchaseUOMName")
	@Relation(table = "BD_UOM", value = "id", ref = "purchaseUOM", show = "name")
	private String purchaseUOMName;

	@Column(name = "priceUOM")
	private String priceUOM;

	@Column(name = "priceUOMName")
	@Relation(table = "BD_UOM", value = "id", ref = "priceUOM", show = "name")
	private String priceUOMName;

	@Column(name = "inventorySecondUOM")
	private String inventorySecondUOM;

	@Column(name = "inventorySecondUOMName")
	@Relation(table = "BD_UOM", value = "id", ref = "inventorySecondUOM", show = "name")
	private String inventorySecondUOMName;

	/**
	 * 生产分类 bigint
	 */
	@Column(name = "ProductionCategory")
	private String productionCategory;

	/**
	 * 修改人 nvarchar
	 */
	@Column(name = "ModifiedBy")
	private String modifiedBy;

	/**
	 * 修改时间 datetime
	 */
	@Column(name = "ModifiedOn")
	private String modifiedOn;

	/**
	 * 重量单位 bigint
	 */
	@Column(name = "WeightUom")
	private String weightUom;

	/**
	 * 主分类 bigint
	 */
	@Column(name = "mainName")
	@Relation(table = "BD_Category", value = "id", ref = "MainItemCategory", show = "name")
	private String mainName;

	/**
	 * 主分类编码
	 * 
	 * @author 端鹏程
	 * @date 2018年12月28日18:50:39
	 */
	@Column(name = "mainCode", readonly = true)
	@Relation(table = "BD_Category", value = "id", ref = "MainItemCategory", show = "code")
	private String mainCode;

	@Column(name = "MainItemCategory")
	private String mainItemCategory;

	/**
	 * 专用料 bit
	 */
	@Column(name = "IsSpecialItem")
	private Integer isSpecialItem;

	/**
	 * 组织
	 */
	@Column(name = "org")
	private String org;

	/**
	 * 是否有效
	 */
	@Column(name = "Effective_isEffective")
	private Integer isEffective;

	/**
	 * 有效日期
	 */
	@Column(name = "Effective_EffectiveDate")
	private String effectiveDate;

	/**
	 * 失效日期
	 */
	@Column(name = "Effective_DisableDate")
	private String disableDate;

	/**
	 * state
	 */
	@Column(name = "state")
	private Integer state;

	/**
	 * stateUser
	 */
	@Column(name = "stateUser")
	private String stateUser;

	/**
	 * stateTime
	 */
	@Column(name = "StateTime")
	private String stateTime;

	@Column(name = "dr")
	private Integer dr;

	@Column(name = "ts")
	private String ts;

	@Column(name = "productVersion")
	private String productVersion;

	/**
	 * @return the mainCode
	 */
	public String getMainCode() {
		return mainCode;
	}

	/**
	 * @param mainCode
	 *            the mainCode to set
	 */
	public void setMainCode(String mainCode) {
		this.mainCode = mainCode;
	}

	public String getMainName() {
		return mainName;
	}

	public void setMainName(String mainName) {
		this.mainName = mainName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMrpCategory() {
		return mrpCategory;
	}

	public void setMrpCategory(String mrpCategory) {
		this.mrpCategory = mrpCategory;
	}

	public String getCode1() {
		return code1;
	}

	public void setCode1(String code1) {
		this.code1 = code1;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
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

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
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

	public Integer getStartPotency() {
		return startPotency;
	}

	public void setStartPotency(Integer startPotency) {
		this.startPotency = startPotency;
	}

	public Integer getStartGrade() {
		return startGrade;
	}

	public void setStartGrade(Integer startGrade) {
		this.startGrade = startGrade;
	}

	public String getManufactureUOM() {
		return manufactureUOM;
	}

	public void setManufactureUOM(String manufactureUOM) {
		this.manufactureUOM = manufactureUOM;
	}

	public String getProductionCategory() {
		return productionCategory;
	}

	public void setProductionCategory(String productionCategory) {
		this.productionCategory = productionCategory;
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

	public String getWeightUom() {
		return weightUom;
	}

	public void setWeightUom(String weightUom) {
		this.weightUom = weightUom;
	}

	public String getMainItemCategory() {
		return mainItemCategory;
	}

	public void setMainItemCategory(String mainItemCategory) {
		this.mainItemCategory = mainItemCategory;
	}

	public Integer getIsSpecialItem() {
		return isSpecialItem;
	}

	public void setIsSpecialItem(Integer isSpecialItem) {
		this.isSpecialItem = isSpecialItem;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public Integer getIsEffective() {
		return isEffective;
	}

	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getDisableDate() {
		return disableDate;
	}

	public void setDisableDate(String disableDate) {
		this.disableDate = disableDate;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getStateUser() {
		return stateUser;
	}

	public void setStateUser(String stateUser) {
		this.stateUser = stateUser;
	}

	public String getStateTime() {
		return stateTime;
	}

	public void setStateTime(String stateTime) {
		this.stateTime = stateTime;
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

	public Double getPackDensity() {
		return packDensity;
	}

	public void setPackDensity(Double packDensity) {
		this.packDensity = packDensity;
	}

	public ItemParamWay getPackWay() {
		return packWay;
	}

	public void setPackWay(ItemParamWay packWay) {
		this.packWay = packWay;
	}

	public Wrap getWrap() {
		return wrap;
	}

	public void setWrap(Wrap wrap) {
		this.wrap = wrap;
	}

	public String getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	/**
	 * @return the quota
	 */
	public String getQuota() {
		return quota;
	}

	/**
	 * @param quota
	 *            the quota to set
	 */
	public void setQuota(String quota) {
		this.quota = quota;
	}

	/**
	 * @return the manufactureUOMName
	 */
	public String getManufactureUOMName() {
		return manufactureUOMName;
	}

	/**
	 * @param manufactureUOMName
	 *            the manufactureUOMName to set
	 */
	public void setManufactureUOMName(String manufactureUOMName) {
		this.manufactureUOMName = manufactureUOMName;
	}

	/**
	 * @return the ratio
	 */
	public String getRatio() {
		return ratio;
	}

	/**
	 * @param ratio
	 *            the ratio to set
	 */
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	/**
	 * @return the ratioUOMName
	 */
	public String getRatioUOMName() {
		return ratioUOMName;
	}

	/**
	 * @param ratioUOMName
	 *            the ratioUOMName to set
	 */
	public void setRatioUOMName(String ratioUOMName) {
		this.ratioUOMName = ratioUOMName;
	}

	/**
	 * @return the purchaseUOM
	 */
	public String getPurchaseUOM() {
		return purchaseUOM;
	}

	/**
	 * @param purchaseUOM
	 *            the purchaseUOM to set
	 */
	public void setPurchaseUOM(String purchaseUOM) {
		this.purchaseUOM = purchaseUOM;
	}

	/**
	 * @return the purchaseUOMName
	 */
	public String getPurchaseUOMName() {
		return purchaseUOMName;
	}

	/**
	 * @param purchaseUOMName
	 *            the purchaseUOMName to set
	 */
	public void setPurchaseUOMName(String purchaseUOMName) {
		this.purchaseUOMName = purchaseUOMName;
	}

	/**
	 * @return the priceUOM
	 */
	public String getPriceUOM() {
		return priceUOM;
	}

	/**
	 * @param priceUOM
	 *            the priceUOM to set
	 */
	public void setPriceUOM(String priceUOM) {
		this.priceUOM = priceUOM;
	}

	/**
	 * @return the priceUOMName
	 */
	public String getPriceUOMName() {
		return priceUOMName;
	}

	/**
	 * @param priceUOMName
	 *            the priceUOMName to set
	 */
	public void setPriceUOMName(String priceUOMName) {
		this.priceUOMName = priceUOMName;
	}

	/**
	 * @return the inventorySecondUOM
	 */
	public String getInventorySecondUOM() {
		return inventorySecondUOM;
	}

	/**
	 * @param inventorySecondUOM
	 *            the inventorySecondUOM to set
	 */
	public void setInventorySecondUOM(String inventorySecondUOM) {
		this.inventorySecondUOM = inventorySecondUOM;
	}

	/**
	 * @return the inventorySecondUOMName
	 */
	public String getInventorySecondUOMName() {
		return inventorySecondUOMName;
	}

	/**
	 * @param inventorySecondUOMName
	 *            the inventorySecondUOMName to set
	 */
	public void setInventorySecondUOMName(String inventorySecondUOMName) {
		this.inventorySecondUOMName = inventorySecondUOMName;
	}

	public Double getLp() {
		return lp;
	}

	public void setLp(Double lp) {
		this.lp = lp;
	}

	public Double getLn() {
		return ln;
	}

	public void setLn(Double ln) {
		this.ln = ln;
	}

	public String getQcSchemaHead() {
		return qcSchemaHead;
	}

	public void setQcSchemaHead(String qcSchemaHead) {
		this.qcSchemaHead = qcSchemaHead;
	}

	public String getQcSchemaHeadCode() {
		return qcSchemaHeadCode;
	}

	public void setQcSchemaHeadCode(String qcSchemaHeadCode) {
		this.qcSchemaHeadCode = qcSchemaHeadCode;
	}

	public String getQcSchemaHeadName() {
		return qcSchemaHeadName;
	}

	public void setQcSchemaHeadName(String qcSchemaHeadName) {
		this.qcSchemaHeadName = qcSchemaHeadName;
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

}