package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.sysenum.Sort;

@Table(name = "BD_ItemMaster")
public class ItemMaster extends BaseTable {

	private static final long serialVersionUID = 7941100757258160973L;

	@Column(name = "ID", primary = true)
	private String id;

	@Column(name = "productVersion")
	private String productVersion;
	
	/**
	 * 堆积密度
	 */
	@Column(name = "packDensity")
	private Double packDensity;

	/**
	 * MRP包装方式
	 */
	@Column(name = "packWay")
	private Integer packWay;

	/**
	 * 缠绕外套摸
	 */
	@Column(name = "wrap")
	private Integer wrap;

	/**
	 * MRP分类
	 */
	@Column(name = "MRPCategory")
	private String mrpCategory;

	/**
	 * VMI标志 bit
	 */
	@Column(name = "isVMIEnable")
	private Integer isVMIEnable;

	/**
	 * 版本数量控制 bit
	 */
	@Column(name = "isVersionQtyControl")
	private Integer isVersionQtyControl;

	/**
	 * 保税盘差率 decimal
	 */
	@Column(name = "boundedCountToLerance")
	private Double boundedCountToLerance;

	/**
	 * 保税品 bit
	 */
	@Column(name = "IsBounded")
	private Integer isBounded;

	/**
	 * 保税品类别 int
	 */
	@Column(name = "BoundedCategory")
	private Integer boundedCategory;

	/**
	 * 保税应补税率 decimal
	 */
	@Column(name = "BoundedCountTaxRate")
	private String boundedCountTaxRate;

	/**
	 * 编码结构 bigint
	 */
	@Column(name = "KeyFlexFieldStru")
	private String keyFlexFieldStru;

	/**
	 * 标准成本 decimal
	 */
	@Column(name = "StandardCost")
	private Double standardCost;

	/**
	 * 标准成分 int
	 */
	@Column(name = "StandardPotency")
	private Integer standardPotency;

	/**
	 * 标准等级 int
	 */
	@Column(name = "StandardGrade")
	private Integer standardGrade;

	/**
	 * 标准批量 decimal
	 */
	@Column(name = "StandardBatchQty")
	private Double standardBatchQty;

	/**
	 * 财务分类 bigint
	 */
	@Column(name = "AssetCategory")
	private String assetCategory;

	/**
	 * 采购单位 bigint
	 */
	@Column(name = "PurchaseUOM")
	private String purchaseUOM;

	/**
	 * 采购分类 bigint
	 */
	@Column(name = "PurchaseCategory")
	private String purchaseCategory;

	/**
	 * 参考成本 decimal
	 */
	@Column(name = "RefrenceCost")
	private Double refrenceCost;

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
	 * 厂牌 bigint
	 */
	@Column(name = "TradeMark")
	private String tradeMark;

	/**
	 * 厂牌管理 bit
	 */
	@Column(name = "IsTrademark")
	private Integer isTrademark;

	/**
	 * 成本币种 bigint
	 */
	@Column(name = "CostCurrency")
	private String costCurrency;

	/**
	 * 成本单位 bigint
	 */
	@Column(name = "CostUOM")
	private String costUOM;

	/**
	 * 成本分类 bigint
	 */
	@Column(name = "CostCategory")
	private String costCategory;

	/**
	 * 成本卷算 bit
	 */
	@Column(name = "IsIncludedCostCa")
	private Integer isIncludedCostCa;

	/**
	 * 成分控制 bit
	 */
	@Column(name = "IsPotencyControl")
	private Integer isPotencyControl;

	/**
	 * 成分影响成本 bit
	 */
	@Column(name = "IsCostCalByPotency")
	private Integer isCostCalByPotency;

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
	 * 存货资产 bit
	 */
	@Column(name = "IsIncludedStockAsset")
	private Integer isIncludedStockAsset;

	/**
	 * 单位相同时数量同步 bit
	 */
	@Column(name = "IsSyncQuantity")
	private Integer isSyncQuantity;

	/**
	 * 当前版本 nvarchar
	 */
	@Column(name = "Version")
	private String version;

	/**
	 * 当前版本ID bigint
	 */
	@Column(name = "VersionID")
	private String versionID;

	/**
	 * 等级控制 bit
	 */
	@Column(name = "IsGradeControl")
	private Integer isGradeControl;

	/**
	 * 等级影响成本 bit
	 */
	@Column(name = "IsCostCalByGrade")
	private Integer isCostCalByGrade;

	/**
	 * 多单位 bit
	 */
	@Column(name = "IsMultyUOM")
	private Integer isMultyUOM;

	/**
	 * 固定转换率 bit
	 */
	@Column(name = "IsVarRatio")
	private Integer isVarRatio;

	/**
	 * 规格 nvarchar
	 */
	@Column(name = "SPECS")
	private String specs;

	/**
	 * 海关编码 nvarchar
	 */
	@Column(name = "CustomNumber")
	private String customNumber;

	/**
	 * 海关征税率 decimal
	 */
	@Column(name = "CustomTaxRate")
	private Double customTaxRate;

	/**
	 * 计划价 decimal
	 */
	@Column(name = "PlanCost")
	private Double planCost;

	/**
	 * 计价单位 bigint
	 */
	@Column(name = "PriceUOM")
	private String priceUOM;

	/**
	 * 价格分类 bigint
	 */
	@Column(name = "PriceCategory")
	private String priceCategory;

	/**
	 * 结束成分 int
	 */
	@Column(name = "EndPotency")
	private Integer endPotency;

	/**
	 * 结束等级 int
	 */
	@Column(name = "EndGrade")
	private Integer endGrade;

	/**
	 * 进出口信息 bigint
	 */
	@Column(name = "EntranceInfo")
	private String entranceInfo;

	/**
	 * 可BOM bit
	 */
	@Column(name = "IsBOMEnable")
	private Integer isBOMEnable;

	/**
	 * 可MRP bit
	 */
	@Column(name = "IsMRPEnable")
	private Integer isMRPEnable;

	/**
	 * 可采购 bit
	 */
	@Column(name = "IsPurchaseEnable")
	private Integer isPurchaseEnable;

	/**
	 * 可库存交易 bit
	 */
	@Column(name = "IsInventoryEnable")
	private Integer isInventoryEnable;

	/**
	 * 可流向统计 bit
	 */
	@Column(name = "IsCanFlowStat")
	private Integer isCanFlowStat;

	/**
	 * 可生产 bit
	 */
	@Column(name = "IsBuildEnable")
	private Integer isBuildEnable;

	/**
	 * 可委外 bit
	 */
	@Column(name = "IsOutsideOperationEnable")
	private Integer isOutsideOperationEnable;

	/**
	 * 可销售 bit
	 */
	@Column(name = "IsSalesEnable")
	private Integer isSalesEnable;

	/**
	 * 可选配 bit
	 */
	@Column(name = "IsMFGConfigEnable")
	private Integer isMFGConfigEnable;

	/**
	 * 控制组织 bigint
	 */
	@Column(name = "MasterOrg")
	private String masterOrg;

	/**
	 * 库存单位 bigint
	 */
	@Column(name = "InventorySecondUOM")
	private String inventorySecondUOM;

	/**
	 * 库存单位体积 decimal
	 */
	@Column(name = "ItemBulk")
	private Double itemBulk;

	/**
	 * 库存单位重量 decimal
	 */
	@Column(name = "Weight")
	private Double weight;

	/**
	 * 库存分类 bigint
	 */
	@Column(name = "StockCategory")
	private String stockCategory;

	/**
	 * 库存主单位 bigint
	 */
	@Column(name = "InventoryUOM")
	private String inventoryUOM;

	/**
	 * 库存主单位计量单位组 int
	 */
	@Column(name = "InventoryUOMGroup")
	private Integer inventoryUOMGroup;

	/**
	 * 来源 nvarchar
	 */
	@Column(name = "ItemSource")
	private String itemSource;

	/**
	 * 料号 nvarchar
	 */
	@Column(name = "Code")
	private String code;
	
	/**
	 * 大分类（新增）
	 */
	@Column(name = "Segment1")
	private String segment1;

	/**
	 * 小分类（新增）
	 */
	@Column(name = "Segment2")
	private String segment2;

	/**
	 * 编码（新增）
	 */
	@Column(name = "Segment3")
	private String segment3;

	/**
	 * 料品MRP相关信息 bigint
	 */
	@Column(name = "MrpInfo")
	private String mrpInfo;

	/**
	 * 料品采购相关信息 bigint
	 */
	@Column(name = "PurchaseInfo")
	private String purchaseInfo;

	/**
	 * 料品库存相关信息 bigint
	 */
	@Column(name = "InventoryInfo")
	private String inventoryInfo;

	/**
	 * 料品生产相关信息 bigint
	 */
	@Column(name = "MfgInfo")
	private String mfgInfo;

	/**
	 * 料品税则号 nvarchar
	 */
	@Column(name = "BoundedTaxNO")
	private String boundedTaxNO;

	/**
	 * 料品销售相关信息 bigint
	 */
	@Column(name = "SaleInfo")
	private String saleInfo;

	/**
	 * 料品形态 int
	 */
	@Column(name = "ItemForm")
	private Integer itemForm;

	/**
	 * 料品形态属性 int
	 */
	@Column(name = "ItemFormAttribute")
	private Integer itemFormAttribute;

	/**
	 * 料品质量相关信息 bigint
	 */
	@Column(name = "InspectionInfo")
	private String inspectionInfo;

	/**
	 * 领料单位 bigint
	 */
	@Column(name = "MaterialOutUOM")
	private String materialOutUOM;

	/**
	 * 目录编号 nvarchar
	 */
	@Column(name = "CatalogNO")
	private String catalogNO;

	/**
	 * 内部转移成本 decimal
	 */
	@Column(name = "InternalTransCost")
	private Double internalTransCost;

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

	/**
	 * 生产分类 bigint
	 */
	@Column(name = "ProductionCategory")
	private String productionCategory;

	/**
	 * 是否SKU料 bit
	 */
	@Column(name = "IsSKU")
	private Integer isSKU;

	/**
	 * 双单位 bit
	 */
	@Column(name = "IsDualUOM")
	private Integer isDualUOM;

	/**
	 * 双数量 bit
	 */
	@Column(name = "IsDualQuantity")
	private Integer isDualQuantity;

	/**
	 * 搜索码 nvarchar
	 */
	@Column(name = "SearchCode")
	private String searchCode;

	/**
	 * 体积单位 bigint
	 */
	@Column(name = "BulkUom")
	private String bulkUom;

	/**
	 * 图片 varbinary
	 */
	@Column(name = "Picture")
	private String picture;

	/**
	 * 退税率 decimal
	 */
	@Column(name = "DrawbackRate")
	private Double drawbackRate;

	/**
	 * 销售单位 bigint
	 */
	@Column(name = "SalesUOM")
	private String salesUOM;

	/**
	 * 销售分类 bigint
	 */
	@Column(name = "SaleCategory")
	private String saleCategory;

	/**
	 * 信用分类 bigint
	 */
	@Column(name = "CreditCategory")
	private String creditCategory;

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
	 * 需商检 bit
	 */
	@Column(name = "NeedInspect")
	private Integer needInspect;

	/**
	 * 需许可证 bit
	 */
	@Column(name = "IsNeedLicence")
	private Integer isNeedLicence;

	/**
	 * 杂项料品 bit
	 */
	@Column(name = "IsMISC")
	private Integer isMISC;

	/**
	 * 重量单位 bigint
	 */
	@Column(name = "WeightUom")
	private String weightUom;

	/**
	 * 主分类 bigint
	 */
	@Column(name = "MainItemCategory")
	private String mainItemCategory;

	/**
	 * 专用料 bit
	 */
	@Column(name = "IsSpecialItem")
	private Integer isSpecialItem;

	/**
	 * 转换率策略
	 */
	@Column(name = "converRatioRule")
	private Integer converRatioRule;

	/**
	 * 状态码
	 */
	@Column(name = "Status")
	private String status;

	/**
	 * 自由项1
	 */
	@Column(name = "FreeItem1")
	private String freeItem1;

	/**
	 * 自由项2
	 */
	@Column(name = "FreeItem2")
	private String freeItem2;

	/**
	 * 自由项3
	 */
	@Column(name = "freeItem3")
	private String freeItem3;

	/**
	 * 组织
	 */
	@Column(name = "org")
	private String org;

	/**
	 * 最新成本
	 */
	@Column(name = "RecentlyCost")
	private Double recentlyCost;

	/**
	 * sysVersion
	 */
	@Column(name = "sysVersion")
	private String sysVersion;

	/**
	 * statusLastModify
	 */
	@Column(name = "statusLastModify")
	private String statusLastModify;

	/**
	 * 是否有效
	 */
	@Column(name = "Effective_IsEffective")
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
	/**
	 * 定额（新增（外高桥项目完工显示用））
	 */
	@Column(name = "DescFlexField_PrivateDescSeg14")
	private String quota;

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
	
	@Column(name = "PickingRule")
	private String pickingRule;
	
	public String getPickingRule() {
		return pickingRule;
	}

	public void setPickingRule(String pickingRule) {
		this.pickingRule = pickingRule;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
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

	public Integer getIsVMIEnable() {
		return isVMIEnable;
	}

	public void setIsVMIEnable(Integer isVMIEnable) {
		this.isVMIEnable = isVMIEnable;
	}

	public Integer getIsVersionQtyControl() {
		return isVersionQtyControl;
	}

	public void setIsVersionQtyControl(Integer isVersionQtyControl) {
		this.isVersionQtyControl = isVersionQtyControl;
	}

	public Double getBoundedCountToLerance() {
		return boundedCountToLerance;
	}

	public void setBoundedCountToLerance(Double boundedCountToLerance) {
		this.boundedCountToLerance = boundedCountToLerance;
	}

	public Integer getIsBounded() {
		return isBounded;
	}

	public void setIsBounded(Integer isBounded) {
		this.isBounded = isBounded;
	}

	public Integer getBoundedCategory() {
		return boundedCategory;
	}

	public void setBoundedCategory(Integer boundedCategory) {
		this.boundedCategory = boundedCategory;
	}

	public String getBoundedCountTaxRate() {
		return boundedCountTaxRate;
	}

	public void setBoundedCountTaxRate(String boundedCountTaxRate) {
		this.boundedCountTaxRate = boundedCountTaxRate;
	}

	public String getKeyFlexFieldStru() {
		return keyFlexFieldStru;
	}

	public void setKeyFlexFieldStru(String keyFlexFieldStru) {
		this.keyFlexFieldStru = keyFlexFieldStru;
	}

	public Double getStandardCost() {
		return standardCost;
	}

	public void setStandardCost(Double standardCost) {
		this.standardCost = standardCost;
	}

	public Integer getStandardPotency() {
		return standardPotency;
	}

	public void setStandardPotency(Integer standardPotency) {
		this.standardPotency = standardPotency;
	}

	public Integer getStandardGrade() {
		return standardGrade;
	}

	public void setStandardGrade(Integer standardGrade) {
		this.standardGrade = standardGrade;
	}

	public Double getStandardBatchQty() {
		return standardBatchQty;
	}

	public void setStandardBatchQty(Double standardBatchQty) {
		this.standardBatchQty = standardBatchQty;
	}

	public String getAssetCategory() {
		return assetCategory;
	}

	public void setAssetCategory(String assetCategory) {
		this.assetCategory = assetCategory;
	}

	public String getPurchaseUOM() {
		return purchaseUOM;
	}

	public void setPurchaseUOM(String purchaseUOM) {
		this.purchaseUOM = purchaseUOM;
	}

	public String getPurchaseCategory() {
		return purchaseCategory;
	}

	public void setPurchaseCategory(String purchaseCategory) {
		this.purchaseCategory = purchaseCategory;
	}

	public Double getRefrenceCost() {
		return refrenceCost;
	}

	public void setRefrenceCost(Double refrenceCost) {
		this.refrenceCost = refrenceCost;
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

	public String getTradeMark() {
		return tradeMark;
	}

	public void setTradeMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}

	public Integer getIsTrademark() {
		return isTrademark;
	}

	public void setIsTrademark(Integer isTrademark) {
		this.isTrademark = isTrademark;
	}

	public String getCostCurrency() {
		return costCurrency;
	}

	public void setCostCurrency(String costCurrency) {
		this.costCurrency = costCurrency;
	}

	public String getCostUOM() {
		return costUOM;
	}

	public void setCostUOM(String costUOM) {
		this.costUOM = costUOM;
	}

	public String getCostCategory() {
		return costCategory;
	}

	public void setCostCategory(String costCategory) {
		this.costCategory = costCategory;
	}

	public Integer getIsIncludedCostCa() {
		return isIncludedCostCa;
	}

	public void setIsIncludedCostCa(Integer isIncludedCostCa) {
		this.isIncludedCostCa = isIncludedCostCa;
	}

	public Integer getIsPotencyControl() {
		return isPotencyControl;
	}

	public void setIsPotencyControl(Integer isPotencyControl) {
		this.isPotencyControl = isPotencyControl;
	}

	public Integer getIsCostCalByPotency() {
		return isCostCalByPotency;
	}

	public void setIsCostCalByPotency(Integer isCostCalByPotency) {
		this.isCostCalByPotency = isCostCalByPotency;
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

	public Integer getIsIncludedStockAsset() {
		return isIncludedStockAsset;
	}

	public void setIsIncludedStockAsset(Integer isIncludedStockAsset) {
		this.isIncludedStockAsset = isIncludedStockAsset;
	}

	public Integer getIsSyncQuantity() {
		return isSyncQuantity;
	}

	public void setIsSyncQuantity(Integer isSyncQuantity) {
		this.isSyncQuantity = isSyncQuantity;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersionID() {
		return versionID;
	}

	public void setVersionID(String versionID) {
		this.versionID = versionID;
	}

	public Integer getIsGradeControl() {
		return isGradeControl;
	}

	public void setIsGradeControl(Integer isGradeControl) {
		this.isGradeControl = isGradeControl;
	}

	public Integer getIsCostCalByGrade() {
		return isCostCalByGrade;
	}

	public void setIsCostCalByGrade(Integer isCostCalByGrade) {
		this.isCostCalByGrade = isCostCalByGrade;
	}

	public Integer getIsMultyUOM() {
		return isMultyUOM;
	}

	public void setIsMultyUOM(Integer isMultyUOM) {
		this.isMultyUOM = isMultyUOM;
	}

	public Integer getIsVarRatio() {
		return isVarRatio;
	}

	public void setIsVarRatio(Integer isVarRatio) {
		this.isVarRatio = isVarRatio;
	}

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	public String getCustomNumber() {
		return customNumber;
	}

	public void setCustomNumber(String customNumber) {
		this.customNumber = customNumber;
	}

	public Double getCustomTaxRate() {
		return customTaxRate;
	}

	public void setCustomTaxRate(Double customTaxRate) {
		this.customTaxRate = customTaxRate;
	}

	public Double getPlanCost() {
		return planCost;
	}

	public void setPlanCost(Double planCost) {
		this.planCost = planCost;
	}

	public String getPriceUOM() {
		return priceUOM;
	}

	public void setPriceUOM(String priceUOM) {
		this.priceUOM = priceUOM;
	}

	public String getPriceCategory() {
		return priceCategory;
	}

	public void setPriceCategory(String priceCategory) {
		this.priceCategory = priceCategory;
	}

	public Integer getEndPotency() {
		return endPotency;
	}

	public void setEndPotency(Integer endPotency) {
		this.endPotency = endPotency;
	}

	public Integer getEndGrade() {
		return endGrade;
	}

	public void setEndGrade(Integer endGrade) {
		this.endGrade = endGrade;
	}

	public String getEntranceInfo() {
		return entranceInfo;
	}

	public void setEntranceInfo(String entranceInfo) {
		this.entranceInfo = entranceInfo;
	}

	public Integer getIsBOMEnable() {
		return isBOMEnable;
	}

	public void setIsBOMEnable(Integer isBOMEnable) {
		this.isBOMEnable = isBOMEnable;
	}

	public Integer getIsMRPEnable() {
		return isMRPEnable;
	}

	public void setIsMRPEnable(Integer isMRPEnable) {
		this.isMRPEnable = isMRPEnable;
	}

	public Integer getIsPurchaseEnable() {
		return isPurchaseEnable;
	}

	public void setIsPurchaseEnable(Integer isPurchaseEnable) {
		this.isPurchaseEnable = isPurchaseEnable;
	}

	public Integer getIsInventoryEnable() {
		return isInventoryEnable;
	}

	public void setIsInventoryEnable(Integer isInventoryEnable) {
		this.isInventoryEnable = isInventoryEnable;
	}

	public Integer getIsCanFlowStat() {
		return isCanFlowStat;
	}

	public void setIsCanFlowStat(Integer isCanFlowStat) {
		this.isCanFlowStat = isCanFlowStat;
	}

	public Integer getIsBuildEnable() {
		return isBuildEnable;
	}

	public void setIsBuildEnable(Integer isBuildEnable) {
		this.isBuildEnable = isBuildEnable;
	}

	public Integer getIsOutsideOperationEnable() {
		return isOutsideOperationEnable;
	}

	public void setIsOutsideOperationEnable(Integer isOutsideOperationEnable) {
		this.isOutsideOperationEnable = isOutsideOperationEnable;
	}

	public Integer getIsSalesEnable() {
		return isSalesEnable;
	}

	public void setIsSalesEnable(Integer isSalesEnable) {
		this.isSalesEnable = isSalesEnable;
	}

	public Integer getIsMFGConfigEnable() {
		return isMFGConfigEnable;
	}

	public void setIsMFGConfigEnable(Integer isMFGConfigEnable) {
		this.isMFGConfigEnable = isMFGConfigEnable;
	}

	public String getMasterOrg() {
		return masterOrg;
	}

	public void setMasterOrg(String masterOrg) {
		this.masterOrg = masterOrg;
	}

	public String getInventorySecondUOM() {
		return inventorySecondUOM;
	}

	public void setInventorySecondUOM(String inventorySecondUOM) {
		this.inventorySecondUOM = inventorySecondUOM;
	}

	public Double getItemBulk() {
		return itemBulk;
	}

	public void setItemBulk(Double itemBulk) {
		this.itemBulk = itemBulk;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getStockCategory() {
		return stockCategory;
	}

	public void setStockCategory(String stockCategory) {
		this.stockCategory = stockCategory;
	}

	public String getInventoryUOM() {
		return inventoryUOM;
	}

	public void setInventoryUOM(String inventoryUOM) {
		this.inventoryUOM = inventoryUOM;
	}

	public Integer getInventoryUOMGroup() {
		return inventoryUOMGroup;
	}

	public void setInventoryUOMGroup(Integer inventoryUOMGroup) {
		this.inventoryUOMGroup = inventoryUOMGroup;
	}

	public String getItemSource() {
		return itemSource;
	}

	public void setItemSource(String itemSource) {
		this.itemSource = itemSource;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMrpInfo() {
		return mrpInfo;
	}

	public void setMrpInfo(String mrpInfo) {
		this.mrpInfo = mrpInfo;
	}

	public String getPurchaseInfo() {
		return purchaseInfo;
	}

	public void setPurchaseInfo(String purchaseInfo) {
		this.purchaseInfo = purchaseInfo;
	}

	public String getInventoryInfo() {
		return inventoryInfo;
	}

	public void setInventoryInfo(String inventoryInfo) {
		this.inventoryInfo = inventoryInfo;
	}

	public String getMfgInfo() {
		return mfgInfo;
	}

	public void setMfgInfo(String mfgInfo) {
		this.mfgInfo = mfgInfo;
	}

	public String getBoundedTaxNO() {
		return boundedTaxNO;
	}

	public void setBoundedTaxNO(String boundedTaxNO) {
		this.boundedTaxNO = boundedTaxNO;
	}

	public String getSaleInfo() {
		return saleInfo;
	}

	public void setSaleInfo(String saleInfo) {
		this.saleInfo = saleInfo;
	}

	public Integer getItemForm() {
		return itemForm;
	}

	public void setItemForm(Integer itemForm) {
		this.itemForm = itemForm;
	}

	public Integer getItemFormAttribute() {
		return itemFormAttribute;
	}

	public void setItemFormAttribute(Integer itemFormAttribute) {
		this.itemFormAttribute = itemFormAttribute;
	}

	public String getInspectionInfo() {
		return inspectionInfo;
	}

	public void setInspectionInfo(String inspectionInfo) {
		this.inspectionInfo = inspectionInfo;
	}

	public String getMaterialOutUOM() {
		return materialOutUOM;
	}

	public void setMaterialOutUOM(String materialOutUOM) {
		this.materialOutUOM = materialOutUOM;
	}

	public String getCatalogNO() {
		return catalogNO;
	}

	public void setCatalogNO(String catalogNO) {
		this.catalogNO = catalogNO;
	}

	public Double getInternalTransCost() {
		return internalTransCost;
	}

	public void setInternalTransCost(Double internalTransCost) {
		this.internalTransCost = internalTransCost;
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

	public Integer getIsSKU() {
		return isSKU;
	}

	public void setIsSKU(Integer isSKU) {
		this.isSKU = isSKU;
	}

	public Integer getIsDualUOM() {
		return isDualUOM;
	}

	public void setIsDualUOM(Integer isDualUOM) {
		this.isDualUOM = isDualUOM;
	}

	public Integer getIsDualQuantity() {
		return isDualQuantity;
	}

	public void setIsDualQuantity(Integer isDualQuantity) {
		this.isDualQuantity = isDualQuantity;
	}

	public String getSearchCode() {
		return searchCode;
	}

	public void setSearchCode(String searchCode) {
		this.searchCode = searchCode;
	}

	public String getBulkUom() {
		return bulkUom;
	}

	public void setBulkUom(String bulkUom) {
		this.bulkUom = bulkUom;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Double getDrawbackRate() {
		return drawbackRate;
	}

	public void setDrawbackRate(Double drawbackRate) {
		this.drawbackRate = drawbackRate;
	}

	public String getSalesUOM() {
		return salesUOM;
	}

	public void setSalesUOM(String salesUOM) {
		this.salesUOM = salesUOM;
	}

	public String getSaleCategory() {
		return saleCategory;
	}

	public void setSaleCategory(String saleCategory) {
		this.saleCategory = saleCategory;
	}

	public String getCreditCategory() {
		return creditCategory;
	}

	public void setCreditCategory(String creditCategory) {
		this.creditCategory = creditCategory;
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

	public Integer getNeedInspect() {
		return needInspect;
	}

	public void setNeedInspect(Integer needInspect) {
		this.needInspect = needInspect;
	}

	public Integer getIsNeedLicence() {
		return isNeedLicence;
	}

	public void setIsNeedLicence(Integer isNeedLicence) {
		this.isNeedLicence = isNeedLicence;
	}

	public Integer getIsMISC() {
		return isMISC;
	}

	public void setIsMISC(Integer isMISC) {
		this.isMISC = isMISC;
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

	public Integer getConverRatioRule() {
		return converRatioRule;
	}

	public void setConverRatioRule(Integer converRatioRule) {
		this.converRatioRule = converRatioRule;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFreeItem1() {
		return freeItem1;
	}

	public void setFreeItem1(String freeItem1) {
		this.freeItem1 = freeItem1;
	}

	public String getFreeItem2() {
		return freeItem2;
	}

	public void setFreeItem2(String freeItem2) {
		this.freeItem2 = freeItem2;
	}

	public String getFreeItem3() {
		return freeItem3;
	}

	public void setFreeItem3(String freeItem3) {
		this.freeItem3 = freeItem3;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public Double getRecentlyCost() {
		return recentlyCost;
	}

	public void setRecentlyCost(Double recentlyCost) {
		this.recentlyCost = recentlyCost;
	}

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getStatusLastModify() {
		return statusLastModify;
	}

	public void setStatusLastModify(String statusLastModify) {
		this.statusLastModify = statusLastModify;
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

	public String getQuota() {
		return quota;
	}

	public void setQuota(String quota) {
		this.quota = quota;
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

	public Double getPackDensity() {
		return packDensity;
	}

	public void setPackDensity(Double packDensity) {
		this.packDensity = packDensity;
	}

	public Integer getPackWay() {
		return packWay;
	}

	public void setPackWay(Integer packWay) {
		this.packWay = packWay;
	}

	public Integer getWrap() {
		return wrap;
	}

	public void setWrap(Integer wrap) {
		this.wrap = wrap;
	}

	/**
	 * @return the productVersion
	 */
	public String getProductVersion() {
		return productVersion;
	}

	/**
	 * @param productVersion
	 *            the productVersion to set
	 */
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
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