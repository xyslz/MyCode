package com.caijai.eqpt.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.wx.DryConfiguration;
import com.caijai.base.sysenum.wx.DryWarmWay;
import com.caijai.base.sysenum.wx.FeedWay;
import com.caijai.base.sysenum.wx.MainSource;
import com.caijai.base.sysenum.wx.ParamWay;
import com.caijai.base.sysenum.wx.UniformDayMode;
import com.caijai.base.sysenum.wx.VacuumWay;
import com.caijai.base.sysenum.wx.WaterSource;

/**
 * 生产线参数
 * 
 * @author CY
 *
 */
@Table(name = "EQ_ProLineParam")
public class ProLineParam extends BaseTable {

	private static final long serialVersionUID = 7890058711956976874L;

	@Column(name = "ID", primary = true)
	private String id;
	
	/**
	 * 设备编码   
	 */
	@Column(name = "emCode",readonly = true)
	@Relation(table = "EQ_EM", value = "id",ref = "emID", show = "code")
	private String emCode;
	
	/**
	 * 设备规格
	 */
	@Column(name = "emSpecs",readonly = true)
	@Relation(table = "EQ_EM", value = "id",ref = "emID", show = "specs")
	private String emSpecs;
	
	/**
	 * 资产编号
	 */
	@Column(name = "emAssetsCode",readonly = true)
	@Relation(table = "EQ_EM", value = "id",ref = "emID", show = "assetsCode")
	private String emAssetsCode;
	
	/**
	 *  设备供应商 
	 */
	@Column(name = "emSupplierName",readonly = true)
	@Relation(table = "EQ_EM", value = "id",ref = "emID", show = "supplier")
	private String emSupplierName;
	
	/**
	 * 物料名称
	 */
	@Column(name = "itemName",readonly = true)
	@Relation(table = "BD_ItemMaster", value = "id",ref = "itemMaster", show = "name")
	private String itemName;
	
	/**
	 * 物料编码
	 */
	@Column(name = "itemCode",readonly = true)
	@Relation(table = "BD_ItemMaster", value = "id",ref = "itemMaster", show = "code")
	private String itemCode;
	
	/**
	 * 部门名称
	 */
	@Column(name = "deptName",readonly = true)
	@Relation(table = "SYS_Department", value = "id",ref = "dept", show = "name")
	private String deptName;
	
	/**
	 * 组织名称
	 */
	@Column(name = "orgName",readonly = true)
	@Relation(table = "SYS_Organization", value = "id",ref = "org", show = "name")
	private String orgName;

	/**
	 * 产线
	 */
	@Column(name = "productionLine")
	private String productionLine;

	/**
	 * 车间（部门）
	 */
	@Column(name = "dept")
	private String dept;

	/**
	 * 主机（设备）
	 */
	@Column(name = "emID")
	private String emID;

	/**
	 * 侧喂料数量
	 */
	@Column(name = "sideFeedQty")
	private Integer sideFeedQty;
	
	/**
	 * 液体加注口数量
	 */
	@Column(name = "liquidQty")
	private Integer liquidQty;

	/**
	 * 喂料方式
	 */
	@Column(name = "feedWay")
	private FeedWay feedWay;

	/**
	 * 失重秤数量
	 */
	@Column(name = "lossWeight")
	private Integer lossWeight;
	
	/**
	 * 真空口数量
	 */
	@Column(name = "vacuumPort")
	private Integer vacuumPort;

	/**
	 * 干燥均化机配置
	 */
	@Column(name = "dryConfiguration")
	private DryConfiguration dryConfiguration;

	/**
	 * 主要产品
	 */
	@Column(name = "itemMaster")
	private String itemMaster;

	/**
	 * 生产能力kg/hr
	 */
	@Column(name = "proMode")
	private Double proMode;

	/**
	 * 主料来源
	 */
	@Column(name = "mainSource")
	private MainSource mainSource;

	/**
	 * 主料配料方式
	 */
	@Column(name = "mainBurdenWay")
	private ParamWay mainBurdenWay;
	
	/**
	 * 助剂/小剂配料方式
	 */
	@Column(name = "aidsBurdenWay")
	private ParamWay aidsBurdenWay;
	
	/**
	 * 颜色配料方式
	 */
	@Column(name = "colorBurdenWay")
	private ParamWay colorBurdenWay;
	
	/**
	 * 包装方式
	 */
	@Column(name = "packWay")
	private ParamWay packWay;

	/**
	 * 码垛方式
	 */
	@Column(name = "stackWay")
	private ParamWay stackWay;

	/**
	 * 均化干燥模式
	 */
	@Column(name = "uniformDayMode")
	private UniformDayMode uniformDayMode;

	/**
	 * 干燥加热节能方式
	 */
	@Column(name="dryWarmWay")
	private DryWarmWay dryWarmWay;

	/**
	 * 真空方式
	 */
	@Column(name = "vacuumWay")
	private VacuumWay vacuumWay;
	
	/**
	 * 循环水来源
	 */
	@Column(name = "waterSource")
	private WaterSource waterSource;

	/**
	 * 配混料人/班 
	 */
	@Column(name = "burdenMan")
	private Double burdenMan;

	/**
	 * 挤出包装人/班
	 */
	@Column(name = "outPackagMan")
	private Double outPackagMan;
	
	/**
	 * 一线管理人员 人/班
	 */
	@Column(name = "frontlineManager")
	private Double frontlineManager;

	/**
	 * 颜色人员 /班
	 */
	@Column(name = "colorMan")
	private Double colorMan;

	/**
	 * 辅助人员/班
	 */
	@Column(name = "supportMan")
	private Double supportMan;

	/**
	 * 混配料电耗度
	 */
	@Column(name = "currentDrain")
	private Double currentDrain;

	/**
	 * 挤出包造粒耗 度/T
	 */
	@Column(name = "extruderSize")
	private Double extruderSize;

	/**
	 * 干燥均化电耗
	 */
	@Column(name = "dryEqualizePower")
	private Double dryEqualizePower;

	/**
	 * 干燥蒸汽用量吨/T
	 */
	@Column(name = "drySteam")
	private Double drySteam;

	/**
	 * 包装码垛度/T.hr 
	 */
	@Column(name = "packagStack")
	private Double packagStack;

	/**
	 * 产品切换电耗 度/hr
	 */
	@Column(name = "proSwitchPower")
	private Double proSwitchPower;

	/**
	 * 生产用水量 立方/吨
	 */
	@Column(name = "proWater")
	private Double proWater;

	/**
	 * 颜色/本色切换物料消耗
	 */
	@Column(name = "colorSwitchMaterial")
	private Integer colorSwitchMaterial;

	/**
	 * 黑色产品切换物料消耗
	 */
	@Column(name = "blackproSwitchMaterial")
	private Integer blackproSwitchMaterial;

	@Column(name="Org")
	private String org;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedOn")
	private String createdOn;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

	@Column(name = "dr")
	private Integer dr;

	@Column(name = "ts")
	private String ts;

	@Column(name = "Def1")
	private String def1;

	@Column(name = "Def2")
	private String def2;

	@Column(name = "Def3")
	private String def3;

	@Column(name = "Def4")
	private String def4;

	@Column(name = "Def5")
	private String def5;

	@Column(name = "Def6")
	private String def6;

	@Column(name = "Def7")
	private String def7;

	@Column(name = "Def8")
	private String def8;

	@Column(name = "Def9")
	private String def9;

	@Column(name = "Def10")
	private String def10;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductionLine() {
		return productionLine;
	}

	public void setProductionLine(String productionLine) {
		this.productionLine = productionLine;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmID() {
		return emID;
	}

	public void setEmID(String emID) {
		this.emID = emID;
	}

	public Integer getSideFeedQty() {
		return sideFeedQty;
	}

	public void setSideFeedQty(Integer sideFeedQty) {
		this.sideFeedQty = sideFeedQty;
	}

	public Integer getLiquidQty() {
		return liquidQty;
	}

	public void setLiquidQty(Integer liquidQty) {
		this.liquidQty = liquidQty;
	}

	public Integer getLossWeight() {
		return lossWeight;
	}

	public void setLossWeight(Integer lossWeight) {
		this.lossWeight = lossWeight;
	}

	public Integer getVacuumPort() {
		return vacuumPort;
	}

	public void setVacuumPort(Integer vacuumPort) {
		this.vacuumPort = vacuumPort;
	}
	public String getItemMaster() {
		return itemMaster;
	}

	public void setItemMaster(String itemMaster) {
		this.itemMaster = itemMaster;
	}

	public ParamWay getMainBurdenWay() {
		return mainBurdenWay;
	}

	public ParamWay getAidsBurdenWay() {
		return aidsBurdenWay;
	}

	public ParamWay getColorBurdenWay() {
		return colorBurdenWay;
	}

	public ParamWay getPackWay() {
		return packWay;
	}

	public ParamWay getStackWay() {
		return stackWay;
	}

	public void setMainBurdenWay(ParamWay mainBurdenWay) {
		this.mainBurdenWay = mainBurdenWay;
	}

	public void setAidsBurdenWay(ParamWay aidsBurdenWay) {
		this.aidsBurdenWay = aidsBurdenWay;
	}

	public void setColorBurdenWay(ParamWay colorBurdenWay) {
		this.colorBurdenWay = colorBurdenWay;
	}

	public void setPackWay(ParamWay packWay) {
		this.packWay = packWay;
	}

	public void setStackWay(ParamWay stackWay) {
		this.stackWay = stackWay;
	}

	public Double getBurdenMan() {
		return burdenMan;
	}

	public void setBurdenMan(Double burdenMan) {
		this.burdenMan = burdenMan;
	}

	public Double getOutPackagMan() {
		return outPackagMan;
	}

	public void setOutPackagMan(Double outPackagMan) {
		this.outPackagMan = outPackagMan;
	}

	public Double getFrontlineManager() {
		return frontlineManager;
	}

	public void setFrontlineManager(Double frontlineManager) {
		this.frontlineManager = frontlineManager;
	}

	public Double getColorMan() {
		return colorMan;
	}

	public void setColorMan(Double colorMan) {
		this.colorMan = colorMan;
	}

	public Double getSupportMan() {
		return supportMan;
	}

	public void setSupportMan(Double supportMan) {
		this.supportMan = supportMan;
	}

	public Double getCurrentDrain() {
		return currentDrain;
	}

	public void setCurrentDrain(Double currentDrain) {
		this.currentDrain = currentDrain;
	}

	public Double getExtruderSize() {
		return extruderSize;
	}

	public void setExtruderSize(Double extruderSize) {
		this.extruderSize = extruderSize;
	}

	public Double getDryEqualizePower() {
		return dryEqualizePower;
	}

	public void setDryEqualizePower(Double dryEqualizePower) {
		this.dryEqualizePower = dryEqualizePower;
	}

	public Double getDrySteam() {
		return drySteam;
	}

	public void setDrySteam(Double drySteam) {
		this.drySteam = drySteam;
	}

	public Double getPackagStack() {
		return packagStack;
	}

	public void setPackagStack(Double packagStack) {
		this.packagStack = packagStack;
	}

	public Double getProSwitchPower() {
		return proSwitchPower;
	}

	public void setProSwitchPower(Double proSwitchPower) {
		this.proSwitchPower = proSwitchPower;
	}

	public Double getProWater() {
		return proWater;
	}

	public void setProWater(Double proWater) {
		this.proWater = proWater;
	}

	public Integer getColorSwitchMaterial() {
		return colorSwitchMaterial;
	}

	public void setColorSwitchMaterial(Integer colorSwitchMaterial) {
		this.colorSwitchMaterial = colorSwitchMaterial;
	}

	public Integer getBlackproSwitchMaterial() {
		return blackproSwitchMaterial;
	}

	public void setBlackproSwitchMaterial(Integer blackproSwitchMaterial) {
		this.blackproSwitchMaterial = blackproSwitchMaterial;
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

	public String getDef1() {
		return def1;
	}

	public void setDef1(String def1) {
		this.def1 = def1;
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

	public String getDef6() {
		return def6;
	}

	public void setDef6(String def6) {
		this.def6 = def6;
	}

	public String getDef7() {
		return def7;
	}

	public void setDef7(String def7) {
		this.def7 = def7;
	}

	public String getDef8() {
		return def8;
	}

	public void setDef8(String def8) {
		this.def8 = def8;
	}

	public String getDef9() {
		return def9;
	}

	public void setDef9(String def9) {
		this.def9 = def9;
	}

	public String getDef10() {
		return def10;
	}

	public void setDef10(String def10) {
		this.def10 = def10;
	}

	public String getEmCode() {
		return emCode;
	}

	public void setEmCode(String emCode) {
		this.emCode = emCode;
	}

	public String getEmSpecs() {
		return emSpecs;
	}

	public void setEmSpecs(String emSpecs) {
		this.emSpecs = emSpecs;
	}

	public String getEmAssetsCode() {
		return emAssetsCode;
	}

	public void setEmAssetsCode(String emAssetsCode) {
		this.emAssetsCode = emAssetsCode;
	}

	public String getEmSupplierName() {
		return emSupplierName;
	}

	public void setEmSupplierName(String emSupplierName) {
		this.emSupplierName = emSupplierName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public FeedWay getFeedWay() {
		return feedWay;
	}

	public void setFeedWay(FeedWay feedWay) {
		this.feedWay = feedWay;
	}

	public DryConfiguration getDryConfiguration() {
		return dryConfiguration;
	}

	public void setDryConfiguration(DryConfiguration dryConfiguration) {
		this.dryConfiguration = dryConfiguration;
	}

	public Double getProMode() {
		return proMode;
	}

	public void setProMode(Double proMode) {
		this.proMode = proMode;
	}

	public MainSource getMainSource() {
		return mainSource;
	}

	public void setMainSource(MainSource mainSource) {
		this.mainSource = mainSource;
	}

	public UniformDayMode getUniformDayMode() {
		return uniformDayMode;
	}

	public void setUniformDayMode(UniformDayMode uniformDayMode) {
		this.uniformDayMode = uniformDayMode;
	}

	public DryWarmWay getDryWarmWay() {
		return dryWarmWay;
	}

	public void setDryWarmWay(DryWarmWay dryWarmWay) {
		this.dryWarmWay = dryWarmWay;
	}

	public VacuumWay getVacuumWay() {
		return vacuumWay;
	}

	public void setVacuumWay(VacuumWay vacuumWay) {
		this.vacuumWay = vacuumWay;
	}

	public WaterSource getWaterSource() {
		return waterSource;
	}

	public void setWaterSource(WaterSource waterSource) {
		this.waterSource = waterSource;
	}

	@Override
	public String toString() {
		return "ProLineParam [id=" + id + ", productionLine=" + productionLine + ", dept=" + dept + ", emID=" + emID
				+ ", sideFeedQty=" + sideFeedQty + ", liquidQty=" + liquidQty + ", feedWay=" + feedWay + ", lossWeight="
				+ lossWeight + ", vacuumPort=" + vacuumPort + ", dryConfiguration=" + dryConfiguration + ", itemMaster="
				+ itemMaster + ", proMode=" + proMode + ", mainSource=" + mainSource + ", mainBurdenWay="
				+ mainBurdenWay + ", aidsBurdenWay=" + aidsBurdenWay + ", colorBurdenWay=" + colorBurdenWay
				+ ", packWay=" + packWay + ", stackWay=" + stackWay + ", uniformDayMode=" + uniformDayMode
				+ ", dryWarmWay=" + dryWarmWay + ", vacuumWay=" + vacuumWay + ", waterSource=" + waterSource
				+ ", burdenMan=" + burdenMan + ", outPackagMan=" + outPackagMan + ", frontlineManager="
				+ frontlineManager + ", colorMan=" + colorMan + ", supportMan=" + supportMan + ", currentDrain="
				+ currentDrain + ", extruderSize=" + extruderSize + ", dryEqualizePower=" + dryEqualizePower
				+ ", drySteam=" + drySteam + ", packagStack=" + packagStack + ", proSwitchPower=" + proSwitchPower
				+ ", proWater=" + proWater + ", colorSwitchMaterial=" + colorSwitchMaterial
				+ ", blackproSwitchMaterial=" + blackproSwitchMaterial + ", org=" + org + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", dr="
				+ dr + ", ts=" + ts + ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + ", def4=" + def4
				+ ", def5=" + def5 + ", def6=" + def6 + ", def7=" + def7 + ", def8=" + def8 + ", def9=" + def9
				+ ", def10=" + def10 + "]";
	}
	
}
