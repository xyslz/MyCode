package com.caijai.repair.entity.other;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
 * 备品备料杂收单行
 * @author ChenYu
 *
 */
@Table(name = "eq_MiscRcvTransL")
public class MiscrcvtransL extends BaseTable {

	private static final long serialVersionUID = -1345940698850540570L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 创建时间
	 */
	@Column(name = "CreatedOn")
	private String createdOn;

	/**
	 * 创建人
	 */
	@Column(name = "CreatedBy")
	private String createdBy;

	/**
	 * 修改时间
	 */
	@Column(name = "ModifiedOn")
	private String modifiedOn;

	/**
	 * 修改人
	 */
	@Column(name = "ModifiedBy")
	private String modifiedBy;

	/**
	 * 系统版本
	 */
	@Column(name = "SysVersion")
	private String sysversion;

	/**
	 * 库存杂收单
	 */
	@Column(name = "MiscRcvTrans")
	private String miscrcvtrans;

	/**
	 * 行号
	 */
	@Column(name = "DocLineNo")
	private Integer doclineno;

	/**
	 * 料品ID
	 */
	@Column(name = "ItemInfo_ItemID")
	private String iteminfoItemid;

	/**
	 * 品名
	 */
	@Column(name = "ItemInfo_ItemName")
	private String iteminfoItemname;

	/**
	 * 料品编码
	 */
	@Column(name = "ItemInfo_ItemCode")
	private String iteminfoItemcode;

	/**
	 * 料品等级
	 */
	@Column(name = "ItemInfo_ItemGrade")
	private Integer iteminfoItemgrade;

	/**
	 * 料品成分
	 */
	@Column(name = "ItemInfo_ItemPotency")
	private Integer iteminfoItempotency;

	/**
	 * 自由项1
	 */
	@Column(name = "ItemInfo_ItemOpt1")
	private String iteminfoItemopt1;

	/**
	 * 自由项2
	 */
	@Column(name = "ItemInfo_ItemOpt2")
	private String iteminfoItemopt2;

	/**
	 * 自由项3
	 */
	@Column(name = "ItemInfo_ItemOpt3")
	private String iteminfoItemopt3;

	/**
	 * 料品版本
	 */
	@Column(name = "ItemInfo_ItemVersion")
	private String iteminfoItemversion;

	/**
	 * 自由项10
	 */
	@Column(name = "ItemInfo_ItemOpt10")
	private String iteminfoItemopt10;

	/**
	 * 自由项4
	 */
	@Column(name = "ItemInfo_ItemOpt4")
	private String iteminfoItemopt4;

	/**
	 * 自由项5
	 */
	@Column(name = "ItemInfo_ItemOpt5")
	private String iteminfoItemopt5;

	/**
	 * 自由项6
	 */
	@Column(name = "ItemInfo_ItemOpt6")
	private String iteminfoItemopt6;

	/**
	 * 自由项7
	 */
	@Column(name = "ItemInfo_ItemOpt7")
	private String iteminfoItemopt7;

	/**
	 * 自由项8
	 */
	@Column(name = "ItemInfo_ItemOpt8")
	private String iteminfoItemopt8;

	/**
	 * 自由项9
	 */
	@Column(name = "ItemInfo_ItemOpt9")
	private String iteminfoItemopt9;

	/**
	 * 存储类型
	 */
	@Column(name = "StoreType")
	private Integer storetype;

	/**
	 * 存储地点
	 */
	@Column(name = "Wh")
	private String wh;

	/**
	 * 库管员
	 */
	@Column(name = "WhMan")
	private String whman;

	/**
	 * 货主组织
	 */
	@Column(name = "OwnerOrg")
	private String ownerorg;

	/**
	 * 客户
	 */
	@Column(name = "CustomerInfo_Customer")
	private String customerinfoCustomer;

	/**
	 * 客户编码
	 */
	@Column(name = "CustomerInfo_Code")
	private String customerinfoCode;

	/**
	 * 客户简称
	 */
	@Column(name = "CustomerInfo_ShortName")
	private String customerinfoShortname;

	/**
	 * 供应商
	 */
	@Column(name = "SupplierInfo_Supplier")
	private String supplierinfoSupplier;

	/**
	 * 供应商编码
	 */
	@Column(name = "SupplierInfo_Code")
	private String supplierinfoCode;

	/**
	 * 供应商简称
	 */
	@Column(name = "SupplierInfo_ShortName")
	private String supplierinfoShortname;

	/**
	 * 厂牌供应商
	 */
	@Column(name = "ManufacturerInfo_Supplier")
	private String manufacturerinfoSupplier;

	/**
	 * 厂牌编码
	 */
	@Column(name = "ManufacturerInfo_Code")
	private String manufacturerinfoCode;

	/**
	 * 厂牌简称
	 */
	@Column(name = "ManufacturerInfo_ShortName")
	private String manufacturerinfoShortname;

	/**
	 * 批号
	 */
	@Column(name = "LotInfo_LotCode")
	private String lotinfoLotcode;

	/**
	 * 批号失效日期
	 */
	@Column(name = "LotInfo_DisabledString")
	private String lotinfoDisabledstring;

	/**
	 * 批号
	 */
	@Column(name = "LotInfo_LotMaster")
	private String lotinfoLotmaster;

	/**
	 * 批号有效期
	 */
	@Column(name = "LotInfo_LotValidDate")
	private Integer lotinfoLotvaliddate;

	/**
	 * 数量
	 */
	@Column(name = "TradeUOMQty")
	private Double tradeuomqty;

	/**
	 * 库存数量
	 */
	@Column(name = "StoreUOMQty")
	private Double storeuomqty;

	/**
	 * 交易-库存
	 */
	@Column(name = "TBUToSBURate")
	private Double tbutosburate;

	/**
	 * 成本数量
	 */
	@Column(name = "CostUOMQty")
	private Double costuomqty;

	/**
	 * 交易-成本
	 */
	@Column(name = "TBUToCBURate")
	private Double tbutocburate;

	/**
	 * 币种
	 */
	@Column(name = "SobCurrency")
	private String sobcurrency;

	/**
	 * 单价
	 */
	@Column(name = "CostPrice")
	private Double costprice;

	/**
	 * 成本
	 */
	@Column(name = "CostMny")
	private Double costmny;

	/**
	 * 项目
	 */
	@Column(name = "Project")
	private String project;

	/**
	 * 任务
	 */
	@Column(name = "Task")
	private String task;

	/**
	 * 经手部门
	 */
	@Column(name = "HandleDept")
	private String handledept;

	/**
	 * 经手人
	 */
	@Column(name = "HandlePsn")
	private String handlepsn;

	/**
	 * 生产相关
	 */
	@Column(name = "IsMFG")
	private Integer ismfg;

	/**
	 * 生产订单号
	 */
	@Column(name = "MoDocNo")
	private String modocno;

	/**
	 * 生产日期
	 */
	@Column(name = "ProductDate")
	private String productdate;

	/**
	 * 生产线
	 */
	@Column(name = "ProductLine")
	private String productline;

	/**
	 * 产成品
	 */
	@Column(name = "FinishedItem")
	private String finisheditem;

	/**
	 * 版本
	 */
	@Column(name = "FinishedItemVersion")
	private String finisheditemversion;

	/**
	 * 等级
	 */
	@Column(name = "FinishedItemGrade")
	private Integer finisheditemgrade;

	/**
	 * 成分
	 */
	@Column(name = "FinishedItemPotency")
	private Integer finisheditempotency;

	/**
	 * 来源单据信息实体编码
	 */
	@Column(name = "SrcDoc_SrcDoc_EntityID")
	private String srcdocSrcdocEntityid;

	/**
	 * 来源单据信息实体类型
	 */
	@Column(name = "SrcDoc_SrcDoc_EntityType")
	private String srcdocSrcdocEntitytype;

	/**
	 * 来源单据组织
	 */
	@Column(name = "SrcDoc_SrcDocOrg")
	private String srcdocSrcdocorg;

	/**
	 * 来源单据业务类型
	 */
	@Column(name = "SrcDoc_SrcDocBusiType")
	private Integer srcdocSrcdocbusitype;

	/**
	 * 来源单据实体类型实体编码
	 */
	@Column(name = "SrcDoc_SrcDocTransType_EntityID")
	private String srcdocSrcdoctranstypeEntityid;

	/**
	 * 来源单据实体类型实体类型
	 */
	@Column(name = "SrcDoc_SrcDocTransType_EntityType")
	private String srcdocSrcdoctranstypeEntitytype;

	/**
	 * 来源单据编码
	 */
	@Column(name = "SrcDoc_SrcDocNo")
	private String srcdocSrcdocno;

	/**
	 * 来源单据日期
	 */
	@Column(name = "SrcDoc_SrcDocDate")
	private String srcdocSrcdocdate;

	/**
	 * 来源单据版本
	 */
	@Column(name = "SrcDoc_SrcDocVer")
	private Integer srcdocSrcdocver;

	/**
	 * 来源单据行实体编码
	 */
	@Column(name = "SrcDoc_SrcDocLine_EntityID")
	private String srcdocSrcdoclineEntityid;

	/**
	 * 来源单据行实体类型
	 */
	@Column(name = "SrcDoc_SrcDocLine_EntityType")
	private String srcdocSrcdoclineEntitytype;

	/**
	 * 来源单据行号
	 */
	@Column(name = "SrcDoc_SrcDocLineNo")
	private Integer srcdocSrcdoclineno;

	/**
	 * 来源单据子行实体编码
	 */
	@Column(name = "SrcDoc_SrcDocSubLine_EntityID")
	private String srcdocSrcdocsublineEntityid;

	/**
	 * 来源单据子行实体类型
	 */
	@Column(name = "SrcDoc_SrcDocSubLine_EntityType")
	private String srcdocSrcdocsublineEntitytype;

	/**
	 * 来源单据子行号
	 */
	@Column(name = "SrcDoc_SrcDocSubLineNo")
	private Integer srcdocSrcdocsublineno;

	/**
	 * 来源单据子行号（字符串）
	 */
	@Column(name = "SrcDoc_SrcDocSubLineNoStr")
	private String srcdocSrcdocsublinenostr;

	/**
	 * 扩展项1
	 */
	@Column(name = "DescFlexSegments_PubDescSeg1")
	private String descflexsegmentsPubdescseg1;

	/**
	 * 扩展项2
	 */
	@Column(name = "DescFlexSegments_PubDescSeg2")
	private String descflexsegmentsPubdescseg2;

	/**
	 * 扩展项3
	 */
	@Column(name = "DescFlexSegments_PubDescSeg3")
	private String descflexsegmentsPubdescseg3;

	/**
	 * 扩展项4
	 */
	@Column(name = "DescFlexSegments_PubDescSeg4")
	private String descflexsegmentsPubdescseg4;

	/**
	 * 扩展项5
	 */
	@Column(name = "DescFlexSegments_PubDescSeg5")
	private String descflexsegmentsPubdescseg5;

	/**
	 * 扩展项6
	 */
	@Column(name = "DescFlexSegments_PubDescSeg6")
	private String descflexsegmentsPubdescseg6;

	/**
	 * 扩展项7
	 */
	@Column(name = "DescFlexSegments_PubDescSeg7")
	private String descflexsegmentsPubdescseg7;

	/**
	 * 扩展项8
	 */
	@Column(name = "DescFlexSegments_PubDescSeg8")
	private String descflexsegmentsPubdescseg8;

	/**
	 * 扩展项9
	 */
	@Column(name = "DescFlexSegments_PubDescSeg9")
	private String descflexsegmentsPubdescseg9;

	/**
	 * 扩展项10
	 */
	@Column(name = "DescFlexSegments_PubDescSeg10")
	private String descflexsegmentsPubdescseg10;

	/**
	 * 扩展项11
	 */
	@Column(name = "DescFlexSegments_PubDescSeg11")
	private String descflexsegmentsPubdescseg11;

	/**
	 * 扩展项12
	 */
	@Column(name = "DescFlexSegments_PubDescSeg12")
	private String descflexsegmentsPubdescseg12;

	/**
	 * 扩展项13
	 */
	@Column(name = "DescFlexSegments_PubDescSeg13")
	private String descflexsegmentsPubdescseg13;

	/**
	 * 扩展项14
	 */
	@Column(name = "DescFlexSegments_PubDescSeg14")
	private String descflexsegmentsPubdescseg14;

	/**
	 * 扩展项15
	 */
	@Column(name = "DescFlexSegments_PubDescSeg15")
	private String descflexsegmentsPubdescseg15;

	/**
	 * 扩展项16
	 */
	@Column(name = "DescFlexSegments_PubDescSeg16")
	private String descflexsegmentsPubdescseg16;

	/**
	 * 扩展项17
	 */
	@Column(name = "DescFlexSegments_PubDescSeg17")
	private String descflexsegmentsPubdescseg17;

	/**
	 * 扩展项18
	 */
	@Column(name = "DescFlexSegments_PubDescSeg18")
	private String descflexsegmentsPubdescseg18;

	/**
	 * 扩展项19
	 */
	@Column(name = "DescFlexSegments_PubDescSeg19")
	private String descflexsegmentsPubdescseg19;

	/**
	 * 扩展项20
	 */
	@Column(name = "DescFlexSegments_PubDescSeg20")
	private String descflexsegmentsPubdescseg20;

	/**
	 * 扩展项21
	 */
	@Column(name = "DescFlexSegments_PubDescSeg21")
	private String descflexsegmentsPubdescseg21;

	/**
	 * 扩展项22
	 */
	@Column(name = "DescFlexSegments_PubDescSeg22")
	private String descflexsegmentsPubdescseg22;

	/**
	 * 扩展项23
	 */
	@Column(name = "DescFlexSegments_PubDescSeg23")
	private String descflexsegmentsPubdescseg23;

	/**
	 * 扩展项24
	 */
	@Column(name = "DescFlexSegments_PubDescSeg24")
	private String descflexsegmentsPubdescseg24;

	/**
	 * 扩展项25
	 */
	@Column(name = "DescFlexSegments_PubDescSeg25")
	private String descflexsegmentsPubdescseg25;

	/**
	 * 扩展项26
	 */
	@Column(name = "DescFlexSegments_PubDescSeg26")
	private String descflexsegmentsPubdescseg26;

	/**
	 * 扩展项27
	 */
	@Column(name = "DescFlexSegments_PubDescSeg27")
	private String descflexsegmentsPubdescseg27;

	/**
	 * 扩展项28
	 */
	@Column(name = "DescFlexSegments_PubDescSeg28")
	private String descflexsegmentsPubdescseg28;

	/**
	 * 扩展项29
	 */
	@Column(name = "DescFlexSegments_PubDescSeg29")
	private String descflexsegmentsPubdescseg29;

	/**
	 * 扩展项30
	 */
	@Column(name = "DescFlexSegments_PubDescSeg30")
	private String descflexsegmentsPubdescseg30;

	/**
	 * 扩展项31
	 */
	@Column(name = "DescFlexSegments_PubDescSeg31")
	private String descflexsegmentsPubdescseg31;

	/**
	 * 扩展项32
	 */
	@Column(name = "DescFlexSegments_PubDescSeg32")
	private String descflexsegmentsPubdescseg32;

	/**
	 * 扩展项33
	 */
	@Column(name = "DescFlexSegments_PubDescSeg33")
	private String descflexsegmentsPubdescseg33;

	/**
	 * 扩展项34
	 */
	@Column(name = "DescFlexSegments_PubDescSeg34")
	private String descflexsegmentsPubdescseg34;

	/**
	 * 扩展项35
	 */
	@Column(name = "DescFlexSegments_PubDescSeg35")
	private String descflexsegmentsPubdescseg35;

	/**
	 * 扩展项36
	 */
	@Column(name = "DescFlexSegments_PubDescSeg36")
	private String descflexsegmentsPubdescseg36;

	/**
	 * 扩展项37
	 */
	@Column(name = "DescFlexSegments_PubDescSeg37")
	private String descflexsegmentsPubdescseg37;

	/**
	 * 扩展项38
	 */
	@Column(name = "DescFlexSegments_PubDescSeg38")
	private String descflexsegmentsPubdescseg38;

	/**
	 * 扩展项39
	 */
	@Column(name = "DescFlexSegments_PubDescSeg39")
	private String descflexsegmentsPubdescseg39;

	/**
	 * 扩展项40
	 */
	@Column(name = "DescFlexSegments_PubDescSeg40")
	private String descflexsegmentsPubdescseg40;

	/**
	 * 扩展项41
	 */
	@Column(name = "DescFlexSegments_PubDescSeg41")
	private String descflexsegmentsPubdescseg41;

	/**
	 * 扩展项42
	 */
	@Column(name = "DescFlexSegments_PubDescSeg42")
	private String descflexsegmentsPubdescseg42;

	/**
	 * 扩展项43
	 */
	@Column(name = "DescFlexSegments_PubDescSeg43")
	private String descflexsegmentsPubdescseg43;

	/**
	 * 扩展项44
	 */
	@Column(name = "DescFlexSegments_PubDescSeg44")
	private String descflexsegmentsPubdescseg44;

	/**
	 * 扩展项45
	 */
	@Column(name = "DescFlexSegments_PubDescSeg45")
	private String descflexsegmentsPubdescseg45;

	/**
	 * 扩展项46
	 */
	@Column(name = "DescFlexSegments_PubDescSeg46")
	private String descflexsegmentsPubdescseg46;

	/**
	 * 扩展项47
	 */
	@Column(name = "DescFlexSegments_PubDescSeg47")
	private String descflexsegmentsPubdescseg47;

	/**
	 * 扩展项48
	 */
	@Column(name = "DescFlexSegments_PubDescSeg48")
	private String descflexsegmentsPubdescseg48;

	/**
	 * 扩展项49
	 */
	@Column(name = "DescFlexSegments_PubDescSeg49")
	private String descflexsegmentsPubdescseg49;

	/**
	 * 扩展项50
	 */
	@Column(name = "DescFlexSegments_PubDescSeg50")
	private String descflexsegmentsPubdescseg50;

	/**
	 * 自定义
	 */
	@Column(name = "DescFlexSegments_ContextValue")
	private String descflexsegmentsContextvalue;

	/**
	 * 自定义1
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg1")
	private String descflexsegmentsPrivatedescseg1;

	/**
	 * 自定义2
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg2")
	private String descflexsegmentsPrivatedescseg2;

	/**
	 * 自定义3
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg3")
	private String descflexsegmentsPrivatedescseg3;

	/**
	 * 自定义4
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg4")
	private String descflexsegmentsPrivatedescseg4;

	/**
	 * 自定义5
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg5")
	private String descflexsegmentsPrivatedescseg5;

	/**
	 * 自定义6
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg6")
	private String descflexsegmentsPrivatedescseg6;

	/**
	 * 自定义7
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg7")
	private String descflexsegmentsPrivatedescseg7;

	/**
	 * 自定义8
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg8")
	private String descflexsegmentsPrivatedescseg8;

	/**
	 * 自定义9
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg9")
	private String descflexsegmentsPrivatedescseg9;

	/**
	 * 自定义10
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg10")
	private String descflexsegmentsPrivatedescseg10;

	/**
	 * 自定义11
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg11")
	private String descflexsegmentsPrivatedescseg11;

	/**
	 * 自定义12
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg12")
	private String descflexsegmentsPrivatedescseg12;

	/**
	 * 自定义13
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg13")
	private String descflexsegmentsPrivatedescseg13;

	/**
	 * 自定义14
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg14")
	private String descflexsegmentsPrivatedescseg14;

	/**
	 * 自定义15
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg15")
	private String descflexsegmentsPrivatedescseg15;

	/**
	 * 自定义16
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg16")
	private String descflexsegmentsPrivatedescseg16;

	/**
	 * 自定义17
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg17")
	private String descflexsegmentsPrivatedescseg17;

	/**
	 * 自定义18
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg18")
	private String descflexsegmentsPrivatedescseg18;

	/**
	 * 自定义19
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg19")
	private String descflexsegmentsPrivatedescseg19;

	/**
	 * 自定义20
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg20")
	private String descflexsegmentsPrivatedescseg20;

	/**
	 * 自定义21
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg21")
	private String descflexsegmentsPrivatedescseg21;

	/**
	 * 自定义22
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg22")
	private String descflexsegmentsPrivatedescseg22;

	/**
	 * 自定义23
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg23")
	private String descflexsegmentsPrivatedescseg23;

	/**
	 * 自定义24
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg24")
	private String descflexsegmentsPrivatedescseg24;

	/**
	 * 自定义25
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg25")
	private String descflexsegmentsPrivatedescseg25;

	/**
	 * 自定义26
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg26")
	private String descflexsegmentsPrivatedescseg26;

	/**
	 * 自定义27
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg27")
	private String descflexsegmentsPrivatedescseg27;

	/**
	 * 自定义28
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg28")
	private String descflexsegmentsPrivatedescseg28;

	/**
	 * 自定义29
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg29")
	private String descflexsegmentsPrivatedescseg29;

	/**
	 * 自定义30
	 */
	@Column(name = "DescFlexSegments_PrivateDescSeg30")
	private String descflexsegmentsPrivatedescseg30;

	/**
	 * 工序号
	 */
	@Column(name = "WorkProcNo")
	private String workprocno;

	/**
	 * 组织
	 */
	@Column(name = "Org")
	private String org;

	/**
	 * 库存单位
	 */
	@Column(name = "StoreUOM")
	private String storeuom;

	/**
	 * 库存单位副单位
	 */
	@Column(name = "StoreBaseUOM")
	private String storebaseuom;

	/**
	 * 库存-基准
	 */
	@Column(name = "SUToSBURate")
	private Double sutosburate;

	/**
	 * 成本单位
	 */
	@Column(name = "CostUOM")
	private String costuom;

	/**
	 * 成本单位副单位
	 */
	@Column(name = "CostBaseUOM")
	private String costbaseuom;

	/**
	 * 成本-基准
	 */
	@Column(name = "CUToCBURate")
	private Double cutocburate;

	/**
	 * 单位
	 */
	@Column(name = "TradeUOM")
	private String tradeuom;

	/**
	 * 基准单位
	 */
	@Column(name = "TradeBaseUOM")
	private String tradebaseuom;

	/**
	 * 数量2
	 */
	@Column(name = "TradeBaseUOMQty")
	private Double tradebaseuomqty;

	/**
	 * 交易-基准
	 */
	@Column(name = "TUToTBURate")
	private Double tutotburate;

	/**
	 * 材料费
	 */
	@Column(name = "ItemAmt")
	private Double itemamt;

	/**
	 * 制造费
	 */
	@Column(name = "MFCAmt")
	private Double mfcamt;

	/**
	 * 人工费
	 */
	@Column(name = "WorkAmt")
	private Double workamt;

	/**
	 * 外协费
	 */
	@Column(name = "CollabAmt")
	private Double collabamt;

	/**
	 * 采购成本
	 */
	@Column(name = "PurAmt")
	private Double puramt;

	/**
	 * 机器费
	 */
	@Column(name = "MacAmt")
	private Double macamt;

	/**
	 * VMI标志
	 */
	@Column(name = "IsVMI")
	private Integer isvmi;

	/**
	 * 来源单据明细系统版本
	 */
	@Column(name = "SrcDocLineSysVer")
	private String srcdoclinesysver;

	/**
	 * 零成本
	 */
	@Column(name = "IsZeroCost")
	private Integer iszerocost;

	/**
	 * 序列号序列化串
	 */
	@Column(name = "SnCode")
	private String sncode;

	/**
	 * 凭证线索
	 */
	@Column(name = "VoucherID")
	private String voucherid;

	/**
	 * 凭证号
	 */
	@Column(name = "VoucherNo")
	private String voucherno;

	/**
	 * 凭证类型
	 */
	@Column(name = "VoucherTypeID")
	private String vouchertypeid;

	/**
	 * 是否需要转总帐
	 */
	@Column(name = "IsNeedToGL")
	private Integer isneedtogl;

	/**
	 * 已转总帐
	 */
	@Column(name = "IsToGL")
	private Integer istogl;

	/**
	 * 生产活动
	 */
	@Column(name = "MOAction")
	private Integer moaction;

	/**
	 * 受益部门
	 */
	@Column(name = "BenefitDept")
	private String benefitdept;

	/**
	 * 受益人
	 */
	@Column(name = "BenefitPsn")
	private String benefitpsn;

	/**
	 * 生产订单通用实体编码
	 */
	@Column(name = "MoDocEntity_EntityID")
	private String modocentityEntityid;

	/**
	 * 生产订单通用实体类型
	 */
	@Column(name = "MoDocEntity_EntityType")
	private String modocentityEntitytype;

	/**
	 * 生产线通用实体编码
	 */
	@Column(name = "ProductLineEntity_EntityID")
	private String productlineentityEntityid;

	/**
	 * 生产线通用实体类型
	 */
	@Column(name = "ProductLineEntity_EntityType")
	private String productlineentityEntitytype;

	/**
	 * 工序通用实体编码
	 */
	@Column(name = "WorkProcNoEnity_EntityID")
	private String workprocnoenityEntityid;

	/**
	 * 工序通用实体类型
	 */
	@Column(name = "WorkProcNoEnity_EntityType")
	private String workprocnoenityEntitytype;

	/**
	 * 番号
	 */
	@Column(name = "Seiban")
	private String seiban;

	/**
	 * seiban号
	 */
	@Column(name = "SeibanCode")
	private String seibancode;

	/**
	 * 库存主单位
	 */
	@Column(name = "StoreMainUOM")
	private String storemainuom;

	/**
	 * 库存主单位副单位
	 */
	@Column(name = "StoreSubUOM")
	private String storesubuom;

	/**
	 * 库存单位-库存主单位
	 */
	@Column(name = "SUTOSMURate")
	private Double sutosmurate;

	/**
	 * 库存-成本
	 */
	@Column(name = "SUToCURate")
	private Double sutocurate;

	/**
	 * 库存主单位数量
	 */
	@Column(name = "StoreMainUOMQty")
	private Double storemainuomqty;

	/**
	 * 库存主单位内转换率
	 */
	@Column(name = "SMUToSMBURate")
	private Double smutosmburate;

	/**
	 * AAI状态
	 */
	@Column(name = "AAIStatus")
	private Integer aaistatus;

	/**
	 * 是否生成转总账AAI
	 */
	@Column(name = "IsNeedGenAAI")
	private Integer isneedgenaai;

	/**
	 * 结算路径
	 */
	@Column(name = "BalanceRoute")
	private String balanceroute;

	/**
	 * 内部交易
	 */
	@Column(name = "IsRelatedOrg")
	private Integer isrelatedorg;

	/**
	 * 生产线日计划
	 */
	@Column(name = "PLS")
	private String pls;

	/**
	 * 生产线日计划通用实体编码
	 */
	@Column(name = "PLSEntity_EntityID")
	private String plsentityEntityid;

	/**
	 * 生产线日计划通用实体类型
	 */
	@Column(name = "PLSEntity_EntityType")
	private String plsentityEntitytype;

	/**
	 * 受益货主
	 */
	@Column(name = "BenefitOwnerOrg")
	private String benefitownerorg;

	/**
	 * 受益存储地点
	 */
	@Column(name = "BenefitWh")
	private String benefitwh;

	/**
	 * 受益库位
	 */
	@Column(name = "BenefitBin_Bin")
	private String benefitbinBin;

	/**
	 * 受益编码
	 */
	@Column(name = "BenefitBin_Code")
	private String benefitbinCode;

	/**
	 * 受益名称
	 */
	@Column(name = "BenefitBin_Name")
	private String benefitbinName;

	/**
	 * 受益组织
	 */
	@Column(name = "BenefitOrg")
	private String benefitorg;

	/**
	 * 受益项目
	 */
	@Column(name = "BenefitProject")
	private String benefitproject;

	/**
	 * 取价来源
	 */
	@Column(name = "Price_Sources")
	private String priceSources;

	/**
	 * 价格来源枚举
	 */
	@Column(name = "PriceSourcesEnum")
	private Integer pricesourcesenum;

	/**
	 * 作废标识
	 */
	@Column(name = "dr")
	private Integer dr;

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

	public String getSysversion() {
		return sysversion;
	}

	public void setSysversion(String sysversion) {
		this.sysversion = sysversion;
	}

	public String getMiscrcvtrans() {
		return miscrcvtrans;
	}

	public void setMiscrcvtrans(String miscrcvtrans) {
		this.miscrcvtrans = miscrcvtrans;
	}

	public Integer getDoclineno() {
		return doclineno;
	}

	public void setDoclineno(Integer doclineno) {
		this.doclineno = doclineno;
	}

	public String getIteminfoItemid() {
		return iteminfoItemid;
	}

	public void setIteminfoItemid(String iteminfoItemid) {
		this.iteminfoItemid = iteminfoItemid;
	}

	public String getIteminfoItemname() {
		return iteminfoItemname;
	}

	public void setIteminfoItemname(String iteminfoItemname) {
		this.iteminfoItemname = iteminfoItemname;
	}

	public String getIteminfoItemcode() {
		return iteminfoItemcode;
	}

	public void setIteminfoItemcode(String iteminfoItemcode) {
		this.iteminfoItemcode = iteminfoItemcode;
	}

	public Integer getIteminfoItemgrade() {
		return iteminfoItemgrade;
	}

	public void setIteminfoItemgrade(Integer iteminfoItemgrade) {
		this.iteminfoItemgrade = iteminfoItemgrade;
	}

	public Integer getIteminfoItempotency() {
		return iteminfoItempotency;
	}

	public void setIteminfoItempotency(Integer iteminfoItempotency) {
		this.iteminfoItempotency = iteminfoItempotency;
	}

	public String getIteminfoItemopt1() {
		return iteminfoItemopt1;
	}

	public void setIteminfoItemopt1(String iteminfoItemopt1) {
		this.iteminfoItemopt1 = iteminfoItemopt1;
	}

	public String getIteminfoItemopt2() {
		return iteminfoItemopt2;
	}

	public void setIteminfoItemopt2(String iteminfoItemopt2) {
		this.iteminfoItemopt2 = iteminfoItemopt2;
	}

	public String getIteminfoItemopt3() {
		return iteminfoItemopt3;
	}

	public void setIteminfoItemopt3(String iteminfoItemopt3) {
		this.iteminfoItemopt3 = iteminfoItemopt3;
	}

	public String getIteminfoItemversion() {
		return iteminfoItemversion;
	}

	public void setIteminfoItemversion(String iteminfoItemversion) {
		this.iteminfoItemversion = iteminfoItemversion;
	}

	public String getIteminfoItemopt10() {
		return iteminfoItemopt10;
	}

	public void setIteminfoItemopt10(String iteminfoItemopt10) {
		this.iteminfoItemopt10 = iteminfoItemopt10;
	}

	public String getIteminfoItemopt4() {
		return iteminfoItemopt4;
	}

	public void setIteminfoItemopt4(String iteminfoItemopt4) {
		this.iteminfoItemopt4 = iteminfoItemopt4;
	}

	public String getIteminfoItemopt5() {
		return iteminfoItemopt5;
	}

	public void setIteminfoItemopt5(String iteminfoItemopt5) {
		this.iteminfoItemopt5 = iteminfoItemopt5;
	}

	public String getIteminfoItemopt6() {
		return iteminfoItemopt6;
	}

	public void setIteminfoItemopt6(String iteminfoItemopt6) {
		this.iteminfoItemopt6 = iteminfoItemopt6;
	}

	public String getIteminfoItemopt7() {
		return iteminfoItemopt7;
	}

	public void setIteminfoItemopt7(String iteminfoItemopt7) {
		this.iteminfoItemopt7 = iteminfoItemopt7;
	}

	public String getIteminfoItemopt8() {
		return iteminfoItemopt8;
	}

	public void setIteminfoItemopt8(String iteminfoItemopt8) {
		this.iteminfoItemopt8 = iteminfoItemopt8;
	}

	public String getIteminfoItemopt9() {
		return iteminfoItemopt9;
	}

	public void setIteminfoItemopt9(String iteminfoItemopt9) {
		this.iteminfoItemopt9 = iteminfoItemopt9;
	}

	public Integer getStoretype() {
		return storetype;
	}

	public void setStoretype(Integer storetype) {
		this.storetype = storetype;
	}

	public String getWh() {
		return wh;
	}

	public void setWh(String wh) {
		this.wh = wh;
	}

	public String getWhman() {
		return whman;
	}

	public void setWhman(String whman) {
		this.whman = whman;
	}

	public String getOwnerorg() {
		return ownerorg;
	}

	public void setOwnerorg(String ownerorg) {
		this.ownerorg = ownerorg;
	}

	public String getCustomerinfoCustomer() {
		return customerinfoCustomer;
	}

	public void setCustomerinfoCustomer(String customerinfoCustomer) {
		this.customerinfoCustomer = customerinfoCustomer;
	}

	public String getCustomerinfoCode() {
		return customerinfoCode;
	}

	public void setCustomerinfoCode(String customerinfoCode) {
		this.customerinfoCode = customerinfoCode;
	}

	public String getCustomerinfoShortname() {
		return customerinfoShortname;
	}

	public void setCustomerinfoShortname(String customerinfoShortname) {
		this.customerinfoShortname = customerinfoShortname;
	}

	public String getSupplierinfoSupplier() {
		return supplierinfoSupplier;
	}

	public void setSupplierinfoSupplier(String supplierinfoSupplier) {
		this.supplierinfoSupplier = supplierinfoSupplier;
	}

	public String getSupplierinfoCode() {
		return supplierinfoCode;
	}

	public void setSupplierinfoCode(String supplierinfoCode) {
		this.supplierinfoCode = supplierinfoCode;
	}

	public String getSupplierinfoShortname() {
		return supplierinfoShortname;
	}

	public void setSupplierinfoShortname(String supplierinfoShortname) {
		this.supplierinfoShortname = supplierinfoShortname;
	}

	public String getManufacturerinfoSupplier() {
		return manufacturerinfoSupplier;
	}

	public void setManufacturerinfoSupplier(String manufacturerinfoSupplier) {
		this.manufacturerinfoSupplier = manufacturerinfoSupplier;
	}

	public String getManufacturerinfoCode() {
		return manufacturerinfoCode;
	}

	public void setManufacturerinfoCode(String manufacturerinfoCode) {
		this.manufacturerinfoCode = manufacturerinfoCode;
	}

	public String getManufacturerinfoShortname() {
		return manufacturerinfoShortname;
	}

	public void setManufacturerinfoShortname(String manufacturerinfoShortname) {
		this.manufacturerinfoShortname = manufacturerinfoShortname;
	}

	public String getLotinfoLotcode() {
		return lotinfoLotcode;
	}

	public void setLotinfoLotcode(String lotinfoLotcode) {
		this.lotinfoLotcode = lotinfoLotcode;
	}

	public String getLotinfoDisabledstring() {
		return lotinfoDisabledstring;
	}

	public void setLotinfoDisabledstring(String lotinfoDisabledstring) {
		this.lotinfoDisabledstring = lotinfoDisabledstring;
	}

	public String getLotinfoLotmaster() {
		return lotinfoLotmaster;
	}

	public void setLotinfoLotmaster(String lotinfoLotmaster) {
		this.lotinfoLotmaster = lotinfoLotmaster;
	}

	public Integer getLotinfoLotvaliddate() {
		return lotinfoLotvaliddate;
	}

	public void setLotinfoLotvaliddate(Integer lotinfoLotvaliddate) {
		this.lotinfoLotvaliddate = lotinfoLotvaliddate;
	}

	public Double getTradeuomqty() {
		return tradeuomqty;
	}

	public void setTradeuomqty(Double tradeuomqty) {
		this.tradeuomqty = tradeuomqty;
	}

	public Double getStoreuomqty() {
		return storeuomqty;
	}

	public void setStoreuomqty(Double storeuomqty) {
		this.storeuomqty = storeuomqty;
	}

	public Double getTbutosburate() {
		return tbutosburate;
	}

	public void setTbutosburate(Double tbutosburate) {
		this.tbutosburate = tbutosburate;
	}

	public Double getCostuomqty() {
		return costuomqty;
	}

	public void setCostuomqty(Double costuomqty) {
		this.costuomqty = costuomqty;
	}

	public Double getTbutocburate() {
		return tbutocburate;
	}

	public void setTbutocburate(Double tbutocburate) {
		this.tbutocburate = tbutocburate;
	}

	public String getSobcurrency() {
		return sobcurrency;
	}

	public void setSobcurrency(String sobcurrency) {
		this.sobcurrency = sobcurrency;
	}

	public Double getCostprice() {
		return costprice;
	}

	public void setCostprice(Double costprice) {
		this.costprice = costprice;
	}

	public Double getCostmny() {
		return costmny;
	}

	public void setCostmny(Double costmny) {
		this.costmny = costmny;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getHandledept() {
		return handledept;
	}

	public void setHandledept(String handledept) {
		this.handledept = handledept;
	}

	public String getHandlepsn() {
		return handlepsn;
	}

	public void setHandlepsn(String handlepsn) {
		this.handlepsn = handlepsn;
	}

	public Integer getIsmfg() {
		return ismfg;
	}

	public void setIsmfg(Integer ismfg) {
		this.ismfg = ismfg;
	}

	public String getModocno() {
		return modocno;
	}

	public void setModocno(String modocno) {
		this.modocno = modocno;
	}

	public String getProductdate() {
		return productdate;
	}

	public void setProductdate(String productdate) {
		this.productdate = productdate;
	}

	public String getProductline() {
		return productline;
	}

	public void setProductline(String productline) {
		this.productline = productline;
	}

	public String getFinisheditem() {
		return finisheditem;
	}

	public void setFinisheditem(String finisheditem) {
		this.finisheditem = finisheditem;
	}

	public String getFinisheditemversion() {
		return finisheditemversion;
	}

	public void setFinisheditemversion(String finisheditemversion) {
		this.finisheditemversion = finisheditemversion;
	}

	public Integer getFinisheditemgrade() {
		return finisheditemgrade;
	}

	public void setFinisheditemgrade(Integer finisheditemgrade) {
		this.finisheditemgrade = finisheditemgrade;
	}

	public Integer getFinisheditempotency() {
		return finisheditempotency;
	}

	public void setFinisheditempotency(Integer finisheditempotency) {
		this.finisheditempotency = finisheditempotency;
	}

	public String getSrcdocSrcdocEntityid() {
		return srcdocSrcdocEntityid;
	}

	public void setSrcdocSrcdocEntityid(String srcdocSrcdocEntityid) {
		this.srcdocSrcdocEntityid = srcdocSrcdocEntityid;
	}

	public String getSrcdocSrcdocEntitytype() {
		return srcdocSrcdocEntitytype;
	}

	public void setSrcdocSrcdocEntitytype(String srcdocSrcdocEntitytype) {
		this.srcdocSrcdocEntitytype = srcdocSrcdocEntitytype;
	}

	public String getSrcdocSrcdocorg() {
		return srcdocSrcdocorg;
	}

	public void setSrcdocSrcdocorg(String srcdocSrcdocorg) {
		this.srcdocSrcdocorg = srcdocSrcdocorg;
	}

	public Integer getSrcdocSrcdocbusitype() {
		return srcdocSrcdocbusitype;
	}

	public void setSrcdocSrcdocbusitype(Integer srcdocSrcdocbusitype) {
		this.srcdocSrcdocbusitype = srcdocSrcdocbusitype;
	}

	public String getSrcdocSrcdoctranstypeEntityid() {
		return srcdocSrcdoctranstypeEntityid;
	}

	public void setSrcdocSrcdoctranstypeEntityid(String srcdocSrcdoctranstypeEntityid) {
		this.srcdocSrcdoctranstypeEntityid = srcdocSrcdoctranstypeEntityid;
	}

	public String getSrcdocSrcdoctranstypeEntitytype() {
		return srcdocSrcdoctranstypeEntitytype;
	}

	public void setSrcdocSrcdoctranstypeEntitytype(String srcdocSrcdoctranstypeEntitytype) {
		this.srcdocSrcdoctranstypeEntitytype = srcdocSrcdoctranstypeEntitytype;
	}

	public String getSrcdocSrcdocno() {
		return srcdocSrcdocno;
	}

	public void setSrcdocSrcdocno(String srcdocSrcdocno) {
		this.srcdocSrcdocno = srcdocSrcdocno;
	}

	public String getSrcdocSrcdocdate() {
		return srcdocSrcdocdate;
	}

	public void setSrcdocSrcdocdate(String srcdocSrcdocdate) {
		this.srcdocSrcdocdate = srcdocSrcdocdate;
	}

	public Integer getSrcdocSrcdocver() {
		return srcdocSrcdocver;
	}

	public void setSrcdocSrcdocver(Integer srcdocSrcdocver) {
		this.srcdocSrcdocver = srcdocSrcdocver;
	}

	public String getSrcdocSrcdoclineEntityid() {
		return srcdocSrcdoclineEntityid;
	}

	public void setSrcdocSrcdoclineEntityid(String srcdocSrcdoclineEntityid) {
		this.srcdocSrcdoclineEntityid = srcdocSrcdoclineEntityid;
	}

	public String getSrcdocSrcdoclineEntitytype() {
		return srcdocSrcdoclineEntitytype;
	}

	public void setSrcdocSrcdoclineEntitytype(String srcdocSrcdoclineEntitytype) {
		this.srcdocSrcdoclineEntitytype = srcdocSrcdoclineEntitytype;
	}

	public Integer getSrcdocSrcdoclineno() {
		return srcdocSrcdoclineno;
	}

	public void setSrcdocSrcdoclineno(Integer srcdocSrcdoclineno) {
		this.srcdocSrcdoclineno = srcdocSrcdoclineno;
	}

	public String getSrcdocSrcdocsublineEntityid() {
		return srcdocSrcdocsublineEntityid;
	}

	public void setSrcdocSrcdocsublineEntityid(String srcdocSrcdocsublineEntityid) {
		this.srcdocSrcdocsublineEntityid = srcdocSrcdocsublineEntityid;
	}

	public String getSrcdocSrcdocsublineEntitytype() {
		return srcdocSrcdocsublineEntitytype;
	}

	public void setSrcdocSrcdocsublineEntitytype(String srcdocSrcdocsublineEntitytype) {
		this.srcdocSrcdocsublineEntitytype = srcdocSrcdocsublineEntitytype;
	}

	public Integer getSrcdocSrcdocsublineno() {
		return srcdocSrcdocsublineno;
	}

	public void setSrcdocSrcdocsublineno(Integer srcdocSrcdocsublineno) {
		this.srcdocSrcdocsublineno = srcdocSrcdocsublineno;
	}

	public String getSrcdocSrcdocsublinenostr() {
		return srcdocSrcdocsublinenostr;
	}

	public void setSrcdocSrcdocsublinenostr(String srcdocSrcdocsublinenostr) {
		this.srcdocSrcdocsublinenostr = srcdocSrcdocsublinenostr;
	}

	public String getDescflexsegmentsPubdescseg1() {
		return descflexsegmentsPubdescseg1;
	}

	public void setDescflexsegmentsPubdescseg1(String descflexsegmentsPubdescseg1) {
		this.descflexsegmentsPubdescseg1 = descflexsegmentsPubdescseg1;
	}

	public String getDescflexsegmentsPubdescseg2() {
		return descflexsegmentsPubdescseg2;
	}

	public void setDescflexsegmentsPubdescseg2(String descflexsegmentsPubdescseg2) {
		this.descflexsegmentsPubdescseg2 = descflexsegmentsPubdescseg2;
	}

	public String getDescflexsegmentsPubdescseg3() {
		return descflexsegmentsPubdescseg3;
	}

	public void setDescflexsegmentsPubdescseg3(String descflexsegmentsPubdescseg3) {
		this.descflexsegmentsPubdescseg3 = descflexsegmentsPubdescseg3;
	}

	public String getDescflexsegmentsPubdescseg4() {
		return descflexsegmentsPubdescseg4;
	}

	public void setDescflexsegmentsPubdescseg4(String descflexsegmentsPubdescseg4) {
		this.descflexsegmentsPubdescseg4 = descflexsegmentsPubdescseg4;
	}

	public String getDescflexsegmentsPubdescseg5() {
		return descflexsegmentsPubdescseg5;
	}

	public void setDescflexsegmentsPubdescseg5(String descflexsegmentsPubdescseg5) {
		this.descflexsegmentsPubdescseg5 = descflexsegmentsPubdescseg5;
	}

	public String getDescflexsegmentsPubdescseg6() {
		return descflexsegmentsPubdescseg6;
	}

	public void setDescflexsegmentsPubdescseg6(String descflexsegmentsPubdescseg6) {
		this.descflexsegmentsPubdescseg6 = descflexsegmentsPubdescseg6;
	}

	public String getDescflexsegmentsPubdescseg7() {
		return descflexsegmentsPubdescseg7;
	}

	public void setDescflexsegmentsPubdescseg7(String descflexsegmentsPubdescseg7) {
		this.descflexsegmentsPubdescseg7 = descflexsegmentsPubdescseg7;
	}

	public String getDescflexsegmentsPubdescseg8() {
		return descflexsegmentsPubdescseg8;
	}

	public void setDescflexsegmentsPubdescseg8(String descflexsegmentsPubdescseg8) {
		this.descflexsegmentsPubdescseg8 = descflexsegmentsPubdescseg8;
	}

	public String getDescflexsegmentsPubdescseg9() {
		return descflexsegmentsPubdescseg9;
	}

	public void setDescflexsegmentsPubdescseg9(String descflexsegmentsPubdescseg9) {
		this.descflexsegmentsPubdescseg9 = descflexsegmentsPubdescseg9;
	}

	public String getDescflexsegmentsPubdescseg10() {
		return descflexsegmentsPubdescseg10;
	}

	public void setDescflexsegmentsPubdescseg10(String descflexsegmentsPubdescseg10) {
		this.descflexsegmentsPubdescseg10 = descflexsegmentsPubdescseg10;
	}

	public String getDescflexsegmentsPubdescseg11() {
		return descflexsegmentsPubdescseg11;
	}

	public void setDescflexsegmentsPubdescseg11(String descflexsegmentsPubdescseg11) {
		this.descflexsegmentsPubdescseg11 = descflexsegmentsPubdescseg11;
	}

	public String getDescflexsegmentsPubdescseg12() {
		return descflexsegmentsPubdescseg12;
	}

	public void setDescflexsegmentsPubdescseg12(String descflexsegmentsPubdescseg12) {
		this.descflexsegmentsPubdescseg12 = descflexsegmentsPubdescseg12;
	}

	public String getDescflexsegmentsPubdescseg13() {
		return descflexsegmentsPubdescseg13;
	}

	public void setDescflexsegmentsPubdescseg13(String descflexsegmentsPubdescseg13) {
		this.descflexsegmentsPubdescseg13 = descflexsegmentsPubdescseg13;
	}

	public String getDescflexsegmentsPubdescseg14() {
		return descflexsegmentsPubdescseg14;
	}

	public void setDescflexsegmentsPubdescseg14(String descflexsegmentsPubdescseg14) {
		this.descflexsegmentsPubdescseg14 = descflexsegmentsPubdescseg14;
	}

	public String getDescflexsegmentsPubdescseg15() {
		return descflexsegmentsPubdescseg15;
	}

	public void setDescflexsegmentsPubdescseg15(String descflexsegmentsPubdescseg15) {
		this.descflexsegmentsPubdescseg15 = descflexsegmentsPubdescseg15;
	}

	public String getDescflexsegmentsPubdescseg16() {
		return descflexsegmentsPubdescseg16;
	}

	public void setDescflexsegmentsPubdescseg16(String descflexsegmentsPubdescseg16) {
		this.descflexsegmentsPubdescseg16 = descflexsegmentsPubdescseg16;
	}

	public String getDescflexsegmentsPubdescseg17() {
		return descflexsegmentsPubdescseg17;
	}

	public void setDescflexsegmentsPubdescseg17(String descflexsegmentsPubdescseg17) {
		this.descflexsegmentsPubdescseg17 = descflexsegmentsPubdescseg17;
	}

	public String getDescflexsegmentsPubdescseg18() {
		return descflexsegmentsPubdescseg18;
	}

	public void setDescflexsegmentsPubdescseg18(String descflexsegmentsPubdescseg18) {
		this.descflexsegmentsPubdescseg18 = descflexsegmentsPubdescseg18;
	}

	public String getDescflexsegmentsPubdescseg19() {
		return descflexsegmentsPubdescseg19;
	}

	public void setDescflexsegmentsPubdescseg19(String descflexsegmentsPubdescseg19) {
		this.descflexsegmentsPubdescseg19 = descflexsegmentsPubdescseg19;
	}

	public String getDescflexsegmentsPubdescseg20() {
		return descflexsegmentsPubdescseg20;
	}

	public void setDescflexsegmentsPubdescseg20(String descflexsegmentsPubdescseg20) {
		this.descflexsegmentsPubdescseg20 = descflexsegmentsPubdescseg20;
	}

	public String getDescflexsegmentsPubdescseg21() {
		return descflexsegmentsPubdescseg21;
	}

	public void setDescflexsegmentsPubdescseg21(String descflexsegmentsPubdescseg21) {
		this.descflexsegmentsPubdescseg21 = descflexsegmentsPubdescseg21;
	}

	public String getDescflexsegmentsPubdescseg22() {
		return descflexsegmentsPubdescseg22;
	}

	public void setDescflexsegmentsPubdescseg22(String descflexsegmentsPubdescseg22) {
		this.descflexsegmentsPubdescseg22 = descflexsegmentsPubdescseg22;
	}

	public String getDescflexsegmentsPubdescseg23() {
		return descflexsegmentsPubdescseg23;
	}

	public void setDescflexsegmentsPubdescseg23(String descflexsegmentsPubdescseg23) {
		this.descflexsegmentsPubdescseg23 = descflexsegmentsPubdescseg23;
	}

	public String getDescflexsegmentsPubdescseg24() {
		return descflexsegmentsPubdescseg24;
	}

	public void setDescflexsegmentsPubdescseg24(String descflexsegmentsPubdescseg24) {
		this.descflexsegmentsPubdescseg24 = descflexsegmentsPubdescseg24;
	}

	public String getDescflexsegmentsPubdescseg25() {
		return descflexsegmentsPubdescseg25;
	}

	public void setDescflexsegmentsPubdescseg25(String descflexsegmentsPubdescseg25) {
		this.descflexsegmentsPubdescseg25 = descflexsegmentsPubdescseg25;
	}

	public String getDescflexsegmentsPubdescseg26() {
		return descflexsegmentsPubdescseg26;
	}

	public void setDescflexsegmentsPubdescseg26(String descflexsegmentsPubdescseg26) {
		this.descflexsegmentsPubdescseg26 = descflexsegmentsPubdescseg26;
	}

	public String getDescflexsegmentsPubdescseg27() {
		return descflexsegmentsPubdescseg27;
	}

	public void setDescflexsegmentsPubdescseg27(String descflexsegmentsPubdescseg27) {
		this.descflexsegmentsPubdescseg27 = descflexsegmentsPubdescseg27;
	}

	public String getDescflexsegmentsPubdescseg28() {
		return descflexsegmentsPubdescseg28;
	}

	public void setDescflexsegmentsPubdescseg28(String descflexsegmentsPubdescseg28) {
		this.descflexsegmentsPubdescseg28 = descflexsegmentsPubdescseg28;
	}

	public String getDescflexsegmentsPubdescseg29() {
		return descflexsegmentsPubdescseg29;
	}

	public void setDescflexsegmentsPubdescseg29(String descflexsegmentsPubdescseg29) {
		this.descflexsegmentsPubdescseg29 = descflexsegmentsPubdescseg29;
	}

	public String getDescflexsegmentsPubdescseg30() {
		return descflexsegmentsPubdescseg30;
	}

	public void setDescflexsegmentsPubdescseg30(String descflexsegmentsPubdescseg30) {
		this.descflexsegmentsPubdescseg30 = descflexsegmentsPubdescseg30;
	}

	public String getDescflexsegmentsPubdescseg31() {
		return descflexsegmentsPubdescseg31;
	}

	public void setDescflexsegmentsPubdescseg31(String descflexsegmentsPubdescseg31) {
		this.descflexsegmentsPubdescseg31 = descflexsegmentsPubdescseg31;
	}

	public String getDescflexsegmentsPubdescseg32() {
		return descflexsegmentsPubdescseg32;
	}

	public void setDescflexsegmentsPubdescseg32(String descflexsegmentsPubdescseg32) {
		this.descflexsegmentsPubdescseg32 = descflexsegmentsPubdescseg32;
	}

	public String getDescflexsegmentsPubdescseg33() {
		return descflexsegmentsPubdescseg33;
	}

	public void setDescflexsegmentsPubdescseg33(String descflexsegmentsPubdescseg33) {
		this.descflexsegmentsPubdescseg33 = descflexsegmentsPubdescseg33;
	}

	public String getDescflexsegmentsPubdescseg34() {
		return descflexsegmentsPubdescseg34;
	}

	public void setDescflexsegmentsPubdescseg34(String descflexsegmentsPubdescseg34) {
		this.descflexsegmentsPubdescseg34 = descflexsegmentsPubdescseg34;
	}

	public String getDescflexsegmentsPubdescseg35() {
		return descflexsegmentsPubdescseg35;
	}

	public void setDescflexsegmentsPubdescseg35(String descflexsegmentsPubdescseg35) {
		this.descflexsegmentsPubdescseg35 = descflexsegmentsPubdescseg35;
	}

	public String getDescflexsegmentsPubdescseg36() {
		return descflexsegmentsPubdescseg36;
	}

	public void setDescflexsegmentsPubdescseg36(String descflexsegmentsPubdescseg36) {
		this.descflexsegmentsPubdescseg36 = descflexsegmentsPubdescseg36;
	}

	public String getDescflexsegmentsPubdescseg37() {
		return descflexsegmentsPubdescseg37;
	}

	public void setDescflexsegmentsPubdescseg37(String descflexsegmentsPubdescseg37) {
		this.descflexsegmentsPubdescseg37 = descflexsegmentsPubdescseg37;
	}

	public String getDescflexsegmentsPubdescseg38() {
		return descflexsegmentsPubdescseg38;
	}

	public void setDescflexsegmentsPubdescseg38(String descflexsegmentsPubdescseg38) {
		this.descflexsegmentsPubdescseg38 = descflexsegmentsPubdescseg38;
	}

	public String getDescflexsegmentsPubdescseg39() {
		return descflexsegmentsPubdescseg39;
	}

	public void setDescflexsegmentsPubdescseg39(String descflexsegmentsPubdescseg39) {
		this.descflexsegmentsPubdescseg39 = descflexsegmentsPubdescseg39;
	}

	public String getDescflexsegmentsPubdescseg40() {
		return descflexsegmentsPubdescseg40;
	}

	public void setDescflexsegmentsPubdescseg40(String descflexsegmentsPubdescseg40) {
		this.descflexsegmentsPubdescseg40 = descflexsegmentsPubdescseg40;
	}

	public String getDescflexsegmentsPubdescseg41() {
		return descflexsegmentsPubdescseg41;
	}

	public void setDescflexsegmentsPubdescseg41(String descflexsegmentsPubdescseg41) {
		this.descflexsegmentsPubdescseg41 = descflexsegmentsPubdescseg41;
	}

	public String getDescflexsegmentsPubdescseg42() {
		return descflexsegmentsPubdescseg42;
	}

	public void setDescflexsegmentsPubdescseg42(String descflexsegmentsPubdescseg42) {
		this.descflexsegmentsPubdescseg42 = descflexsegmentsPubdescseg42;
	}

	public String getDescflexsegmentsPubdescseg43() {
		return descflexsegmentsPubdescseg43;
	}

	public void setDescflexsegmentsPubdescseg43(String descflexsegmentsPubdescseg43) {
		this.descflexsegmentsPubdescseg43 = descflexsegmentsPubdescseg43;
	}

	public String getDescflexsegmentsPubdescseg44() {
		return descflexsegmentsPubdescseg44;
	}

	public void setDescflexsegmentsPubdescseg44(String descflexsegmentsPubdescseg44) {
		this.descflexsegmentsPubdescseg44 = descflexsegmentsPubdescseg44;
	}

	public String getDescflexsegmentsPubdescseg45() {
		return descflexsegmentsPubdescseg45;
	}

	public void setDescflexsegmentsPubdescseg45(String descflexsegmentsPubdescseg45) {
		this.descflexsegmentsPubdescseg45 = descflexsegmentsPubdescseg45;
	}

	public String getDescflexsegmentsPubdescseg46() {
		return descflexsegmentsPubdescseg46;
	}

	public void setDescflexsegmentsPubdescseg46(String descflexsegmentsPubdescseg46) {
		this.descflexsegmentsPubdescseg46 = descflexsegmentsPubdescseg46;
	}

	public String getDescflexsegmentsPubdescseg47() {
		return descflexsegmentsPubdescseg47;
	}

	public void setDescflexsegmentsPubdescseg47(String descflexsegmentsPubdescseg47) {
		this.descflexsegmentsPubdescseg47 = descflexsegmentsPubdescseg47;
	}

	public String getDescflexsegmentsPubdescseg48() {
		return descflexsegmentsPubdescseg48;
	}

	public void setDescflexsegmentsPubdescseg48(String descflexsegmentsPubdescseg48) {
		this.descflexsegmentsPubdescseg48 = descflexsegmentsPubdescseg48;
	}

	public String getDescflexsegmentsPubdescseg49() {
		return descflexsegmentsPubdescseg49;
	}

	public void setDescflexsegmentsPubdescseg49(String descflexsegmentsPubdescseg49) {
		this.descflexsegmentsPubdescseg49 = descflexsegmentsPubdescseg49;
	}

	public String getDescflexsegmentsPubdescseg50() {
		return descflexsegmentsPubdescseg50;
	}

	public void setDescflexsegmentsPubdescseg50(String descflexsegmentsPubdescseg50) {
		this.descflexsegmentsPubdescseg50 = descflexsegmentsPubdescseg50;
	}

	public String getDescflexsegmentsContextvalue() {
		return descflexsegmentsContextvalue;
	}

	public void setDescflexsegmentsContextvalue(String descflexsegmentsContextvalue) {
		this.descflexsegmentsContextvalue = descflexsegmentsContextvalue;
	}

	public String getDescflexsegmentsPrivatedescseg1() {
		return descflexsegmentsPrivatedescseg1;
	}

	public void setDescflexsegmentsPrivatedescseg1(String descflexsegmentsPrivatedescseg1) {
		this.descflexsegmentsPrivatedescseg1 = descflexsegmentsPrivatedescseg1;
	}

	public String getDescflexsegmentsPrivatedescseg2() {
		return descflexsegmentsPrivatedescseg2;
	}

	public void setDescflexsegmentsPrivatedescseg2(String descflexsegmentsPrivatedescseg2) {
		this.descflexsegmentsPrivatedescseg2 = descflexsegmentsPrivatedescseg2;
	}

	public String getDescflexsegmentsPrivatedescseg3() {
		return descflexsegmentsPrivatedescseg3;
	}

	public void setDescflexsegmentsPrivatedescseg3(String descflexsegmentsPrivatedescseg3) {
		this.descflexsegmentsPrivatedescseg3 = descflexsegmentsPrivatedescseg3;
	}

	public String getDescflexsegmentsPrivatedescseg4() {
		return descflexsegmentsPrivatedescseg4;
	}

	public void setDescflexsegmentsPrivatedescseg4(String descflexsegmentsPrivatedescseg4) {
		this.descflexsegmentsPrivatedescseg4 = descflexsegmentsPrivatedescseg4;
	}

	public String getDescflexsegmentsPrivatedescseg5() {
		return descflexsegmentsPrivatedescseg5;
	}

	public void setDescflexsegmentsPrivatedescseg5(String descflexsegmentsPrivatedescseg5) {
		this.descflexsegmentsPrivatedescseg5 = descflexsegmentsPrivatedescseg5;
	}

	public String getDescflexsegmentsPrivatedescseg6() {
		return descflexsegmentsPrivatedescseg6;
	}

	public void setDescflexsegmentsPrivatedescseg6(String descflexsegmentsPrivatedescseg6) {
		this.descflexsegmentsPrivatedescseg6 = descflexsegmentsPrivatedescseg6;
	}

	public String getDescflexsegmentsPrivatedescseg7() {
		return descflexsegmentsPrivatedescseg7;
	}

	public void setDescflexsegmentsPrivatedescseg7(String descflexsegmentsPrivatedescseg7) {
		this.descflexsegmentsPrivatedescseg7 = descflexsegmentsPrivatedescseg7;
	}

	public String getDescflexsegmentsPrivatedescseg8() {
		return descflexsegmentsPrivatedescseg8;
	}

	public void setDescflexsegmentsPrivatedescseg8(String descflexsegmentsPrivatedescseg8) {
		this.descflexsegmentsPrivatedescseg8 = descflexsegmentsPrivatedescseg8;
	}

	public String getDescflexsegmentsPrivatedescseg9() {
		return descflexsegmentsPrivatedescseg9;
	}

	public void setDescflexsegmentsPrivatedescseg9(String descflexsegmentsPrivatedescseg9) {
		this.descflexsegmentsPrivatedescseg9 = descflexsegmentsPrivatedescseg9;
	}

	public String getDescflexsegmentsPrivatedescseg10() {
		return descflexsegmentsPrivatedescseg10;
	}

	public void setDescflexsegmentsPrivatedescseg10(String descflexsegmentsPrivatedescseg10) {
		this.descflexsegmentsPrivatedescseg10 = descflexsegmentsPrivatedescseg10;
	}

	public String getDescflexsegmentsPrivatedescseg11() {
		return descflexsegmentsPrivatedescseg11;
	}

	public void setDescflexsegmentsPrivatedescseg11(String descflexsegmentsPrivatedescseg11) {
		this.descflexsegmentsPrivatedescseg11 = descflexsegmentsPrivatedescseg11;
	}

	public String getDescflexsegmentsPrivatedescseg12() {
		return descflexsegmentsPrivatedescseg12;
	}

	public void setDescflexsegmentsPrivatedescseg12(String descflexsegmentsPrivatedescseg12) {
		this.descflexsegmentsPrivatedescseg12 = descflexsegmentsPrivatedescseg12;
	}

	public String getDescflexsegmentsPrivatedescseg13() {
		return descflexsegmentsPrivatedescseg13;
	}

	public void setDescflexsegmentsPrivatedescseg13(String descflexsegmentsPrivatedescseg13) {
		this.descflexsegmentsPrivatedescseg13 = descflexsegmentsPrivatedescseg13;
	}

	public String getDescflexsegmentsPrivatedescseg14() {
		return descflexsegmentsPrivatedescseg14;
	}

	public void setDescflexsegmentsPrivatedescseg14(String descflexsegmentsPrivatedescseg14) {
		this.descflexsegmentsPrivatedescseg14 = descflexsegmentsPrivatedescseg14;
	}

	public String getDescflexsegmentsPrivatedescseg15() {
		return descflexsegmentsPrivatedescseg15;
	}

	public void setDescflexsegmentsPrivatedescseg15(String descflexsegmentsPrivatedescseg15) {
		this.descflexsegmentsPrivatedescseg15 = descflexsegmentsPrivatedescseg15;
	}

	public String getDescflexsegmentsPrivatedescseg16() {
		return descflexsegmentsPrivatedescseg16;
	}

	public void setDescflexsegmentsPrivatedescseg16(String descflexsegmentsPrivatedescseg16) {
		this.descflexsegmentsPrivatedescseg16 = descflexsegmentsPrivatedescseg16;
	}

	public String getDescflexsegmentsPrivatedescseg17() {
		return descflexsegmentsPrivatedescseg17;
	}

	public void setDescflexsegmentsPrivatedescseg17(String descflexsegmentsPrivatedescseg17) {
		this.descflexsegmentsPrivatedescseg17 = descflexsegmentsPrivatedescseg17;
	}

	public String getDescflexsegmentsPrivatedescseg18() {
		return descflexsegmentsPrivatedescseg18;
	}

	public void setDescflexsegmentsPrivatedescseg18(String descflexsegmentsPrivatedescseg18) {
		this.descflexsegmentsPrivatedescseg18 = descflexsegmentsPrivatedescseg18;
	}

	public String getDescflexsegmentsPrivatedescseg19() {
		return descflexsegmentsPrivatedescseg19;
	}

	public void setDescflexsegmentsPrivatedescseg19(String descflexsegmentsPrivatedescseg19) {
		this.descflexsegmentsPrivatedescseg19 = descflexsegmentsPrivatedescseg19;
	}

	public String getDescflexsegmentsPrivatedescseg20() {
		return descflexsegmentsPrivatedescseg20;
	}

	public void setDescflexsegmentsPrivatedescseg20(String descflexsegmentsPrivatedescseg20) {
		this.descflexsegmentsPrivatedescseg20 = descflexsegmentsPrivatedescseg20;
	}

	public String getDescflexsegmentsPrivatedescseg21() {
		return descflexsegmentsPrivatedescseg21;
	}

	public void setDescflexsegmentsPrivatedescseg21(String descflexsegmentsPrivatedescseg21) {
		this.descflexsegmentsPrivatedescseg21 = descflexsegmentsPrivatedescseg21;
	}

	public String getDescflexsegmentsPrivatedescseg22() {
		return descflexsegmentsPrivatedescseg22;
	}

	public void setDescflexsegmentsPrivatedescseg22(String descflexsegmentsPrivatedescseg22) {
		this.descflexsegmentsPrivatedescseg22 = descflexsegmentsPrivatedescseg22;
	}

	public String getDescflexsegmentsPrivatedescseg23() {
		return descflexsegmentsPrivatedescseg23;
	}

	public void setDescflexsegmentsPrivatedescseg23(String descflexsegmentsPrivatedescseg23) {
		this.descflexsegmentsPrivatedescseg23 = descflexsegmentsPrivatedescseg23;
	}

	public String getDescflexsegmentsPrivatedescseg24() {
		return descflexsegmentsPrivatedescseg24;
	}

	public void setDescflexsegmentsPrivatedescseg24(String descflexsegmentsPrivatedescseg24) {
		this.descflexsegmentsPrivatedescseg24 = descflexsegmentsPrivatedescseg24;
	}

	public String getDescflexsegmentsPrivatedescseg25() {
		return descflexsegmentsPrivatedescseg25;
	}

	public void setDescflexsegmentsPrivatedescseg25(String descflexsegmentsPrivatedescseg25) {
		this.descflexsegmentsPrivatedescseg25 = descflexsegmentsPrivatedescseg25;
	}

	public String getDescflexsegmentsPrivatedescseg26() {
		return descflexsegmentsPrivatedescseg26;
	}

	public void setDescflexsegmentsPrivatedescseg26(String descflexsegmentsPrivatedescseg26) {
		this.descflexsegmentsPrivatedescseg26 = descflexsegmentsPrivatedescseg26;
	}

	public String getDescflexsegmentsPrivatedescseg27() {
		return descflexsegmentsPrivatedescseg27;
	}

	public void setDescflexsegmentsPrivatedescseg27(String descflexsegmentsPrivatedescseg27) {
		this.descflexsegmentsPrivatedescseg27 = descflexsegmentsPrivatedescseg27;
	}

	public String getDescflexsegmentsPrivatedescseg28() {
		return descflexsegmentsPrivatedescseg28;
	}

	public void setDescflexsegmentsPrivatedescseg28(String descflexsegmentsPrivatedescseg28) {
		this.descflexsegmentsPrivatedescseg28 = descflexsegmentsPrivatedescseg28;
	}

	public String getDescflexsegmentsPrivatedescseg29() {
		return descflexsegmentsPrivatedescseg29;
	}

	public void setDescflexsegmentsPrivatedescseg29(String descflexsegmentsPrivatedescseg29) {
		this.descflexsegmentsPrivatedescseg29 = descflexsegmentsPrivatedescseg29;
	}

	public String getDescflexsegmentsPrivatedescseg30() {
		return descflexsegmentsPrivatedescseg30;
	}

	public void setDescflexsegmentsPrivatedescseg30(String descflexsegmentsPrivatedescseg30) {
		this.descflexsegmentsPrivatedescseg30 = descflexsegmentsPrivatedescseg30;
	}

	public String getWorkprocno() {
		return workprocno;
	}

	public void setWorkprocno(String workprocno) {
		this.workprocno = workprocno;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getStoreuom() {
		return storeuom;
	}

	public void setStoreuom(String storeuom) {
		this.storeuom = storeuom;
	}

	public String getStorebaseuom() {
		return storebaseuom;
	}

	public void setStorebaseuom(String storebaseuom) {
		this.storebaseuom = storebaseuom;
	}

	public Double getSutosburate() {
		return sutosburate;
	}

	public void setSutosburate(Double sutosburate) {
		this.sutosburate = sutosburate;
	}

	public String getCostuom() {
		return costuom;
	}

	public void setCostuom(String costuom) {
		this.costuom = costuom;
	}

	public String getCostbaseuom() {
		return costbaseuom;
	}

	public void setCostbaseuom(String costbaseuom) {
		this.costbaseuom = costbaseuom;
	}

	public Double getCutocburate() {
		return cutocburate;
	}

	public void setCutocburate(Double cutocburate) {
		this.cutocburate = cutocburate;
	}

	public String getTradeuom() {
		return tradeuom;
	}

	public void setTradeuom(String tradeuom) {
		this.tradeuom = tradeuom;
	}

	public String getTradebaseuom() {
		return tradebaseuom;
	}

	public void setTradebaseuom(String tradebaseuom) {
		this.tradebaseuom = tradebaseuom;
	}

	public Double getTradebaseuomqty() {
		return tradebaseuomqty;
	}

	public void setTradebaseuomqty(Double tradebaseuomqty) {
		this.tradebaseuomqty = tradebaseuomqty;
	}

	public Double getTutotburate() {
		return tutotburate;
	}

	public void setTutotburate(Double tutotburate) {
		this.tutotburate = tutotburate;
	}

	public Double getItemamt() {
		return itemamt;
	}

	public void setItemamt(Double itemamt) {
		this.itemamt = itemamt;
	}

	public Double getMfcamt() {
		return mfcamt;
	}

	public void setMfcamt(Double mfcamt) {
		this.mfcamt = mfcamt;
	}

	public Double getWorkamt() {
		return workamt;
	}

	public void setWorkamt(Double workamt) {
		this.workamt = workamt;
	}

	public Double getCollabamt() {
		return collabamt;
	}

	public void setCollabamt(Double collabamt) {
		this.collabamt = collabamt;
	}

	public Double getPuramt() {
		return puramt;
	}

	public void setPuramt(Double puramt) {
		this.puramt = puramt;
	}

	public Double getMacamt() {
		return macamt;
	}

	public void setMacamt(Double macamt) {
		this.macamt = macamt;
	}

	public Integer getIsvmi() {
		return isvmi;
	}

	public void setIsvmi(Integer isvmi) {
		this.isvmi = isvmi;
	}

	public String getSrcdoclinesysver() {
		return srcdoclinesysver;
	}

	public void setSrcdoclinesysver(String srcdoclinesysver) {
		this.srcdoclinesysver = srcdoclinesysver;
	}

	public Integer getIszerocost() {
		return iszerocost;
	}

	public void setIszerocost(Integer iszerocost) {
		this.iszerocost = iszerocost;
	}

	public String getSncode() {
		return sncode;
	}

	public void setSncode(String sncode) {
		this.sncode = sncode;
	}

	public String getVoucherid() {
		return voucherid;
	}

	public void setVoucherid(String voucherid) {
		this.voucherid = voucherid;
	}

	public String getVoucherno() {
		return voucherno;
	}

	public void setVoucherno(String voucherno) {
		this.voucherno = voucherno;
	}

	public String getVouchertypeid() {
		return vouchertypeid;
	}

	public void setVouchertypeid(String vouchertypeid) {
		this.vouchertypeid = vouchertypeid;
	}

	public Integer getIsneedtogl() {
		return isneedtogl;
	}

	public void setIsneedtogl(Integer isneedtogl) {
		this.isneedtogl = isneedtogl;
	}

	public Integer getIstogl() {
		return istogl;
	}

	public void setIstogl(Integer istogl) {
		this.istogl = istogl;
	}

	public Integer getMoaction() {
		return moaction;
	}

	public void setMoaction(Integer moaction) {
		this.moaction = moaction;
	}

	public String getBenefitdept() {
		return benefitdept;
	}

	public void setBenefitdept(String benefitdept) {
		this.benefitdept = benefitdept;
	}

	public String getBenefitpsn() {
		return benefitpsn;
	}

	public void setBenefitpsn(String benefitpsn) {
		this.benefitpsn = benefitpsn;
	}

	public String getModocentityEntityid() {
		return modocentityEntityid;
	}

	public void setModocentityEntityid(String modocentityEntityid) {
		this.modocentityEntityid = modocentityEntityid;
	}

	public String getModocentityEntitytype() {
		return modocentityEntitytype;
	}

	public void setModocentityEntitytype(String modocentityEntitytype) {
		this.modocentityEntitytype = modocentityEntitytype;
	}

	public String getProductlineentityEntityid() {
		return productlineentityEntityid;
	}

	public void setProductlineentityEntityid(String productlineentityEntityid) {
		this.productlineentityEntityid = productlineentityEntityid;
	}

	public String getProductlineentityEntitytype() {
		return productlineentityEntitytype;
	}

	public void setProductlineentityEntitytype(String productlineentityEntitytype) {
		this.productlineentityEntitytype = productlineentityEntitytype;
	}

	public String getWorkprocnoenityEntityid() {
		return workprocnoenityEntityid;
	}

	public void setWorkprocnoenityEntityid(String workprocnoenityEntityid) {
		this.workprocnoenityEntityid = workprocnoenityEntityid;
	}

	public String getWorkprocnoenityEntitytype() {
		return workprocnoenityEntitytype;
	}

	public void setWorkprocnoenityEntitytype(String workprocnoenityEntitytype) {
		this.workprocnoenityEntitytype = workprocnoenityEntitytype;
	}

	public String getSeiban() {
		return seiban;
	}

	public void setSeiban(String seiban) {
		this.seiban = seiban;
	}

	public String getSeibancode() {
		return seibancode;
	}

	public void setSeibancode(String seibancode) {
		this.seibancode = seibancode;
	}

	public String getStoremainuom() {
		return storemainuom;
	}

	public void setStoremainuom(String storemainuom) {
		this.storemainuom = storemainuom;
	}

	public String getStoresubuom() {
		return storesubuom;
	}

	public void setStoresubuom(String storesubuom) {
		this.storesubuom = storesubuom;
	}

	public Double getSutosmurate() {
		return sutosmurate;
	}

	public void setSutosmurate(Double sutosmurate) {
		this.sutosmurate = sutosmurate;
	}

	public Double getSutocurate() {
		return sutocurate;
	}

	public void setSutocurate(Double sutocurate) {
		this.sutocurate = sutocurate;
	}

	public Double getStoremainuomqty() {
		return storemainuomqty;
	}

	public void setStoremainuomqty(Double storemainuomqty) {
		this.storemainuomqty = storemainuomqty;
	}

	public Double getSmutosmburate() {
		return smutosmburate;
	}

	public void setSmutosmburate(Double smutosmburate) {
		this.smutosmburate = smutosmburate;
	}

	public Integer getAaistatus() {
		return aaistatus;
	}

	public void setAaistatus(Integer aaistatus) {
		this.aaistatus = aaistatus;
	}

	public Integer getIsneedgenaai() {
		return isneedgenaai;
	}

	public void setIsneedgenaai(Integer isneedgenaai) {
		this.isneedgenaai = isneedgenaai;
	}

	public String getBalanceroute() {
		return balanceroute;
	}

	public void setBalanceroute(String balanceroute) {
		this.balanceroute = balanceroute;
	}

	public Integer getIsrelatedorg() {
		return isrelatedorg;
	}

	public void setIsrelatedorg(Integer isrelatedorg) {
		this.isrelatedorg = isrelatedorg;
	}

	public String getPls() {
		return pls;
	}

	public void setPls(String pls) {
		this.pls = pls;
	}

	public String getPlsentityEntityid() {
		return plsentityEntityid;
	}

	public void setPlsentityEntityid(String plsentityEntityid) {
		this.plsentityEntityid = plsentityEntityid;
	}

	public String getPlsentityEntitytype() {
		return plsentityEntitytype;
	}

	public void setPlsentityEntitytype(String plsentityEntitytype) {
		this.plsentityEntitytype = plsentityEntitytype;
	}

	public String getBenefitownerorg() {
		return benefitownerorg;
	}

	public void setBenefitownerorg(String benefitownerorg) {
		this.benefitownerorg = benefitownerorg;
	}

	public String getBenefitwh() {
		return benefitwh;
	}

	public void setBenefitwh(String benefitwh) {
		this.benefitwh = benefitwh;
	}

	public String getBenefitbinBin() {
		return benefitbinBin;
	}

	public void setBenefitbinBin(String benefitbinBin) {
		this.benefitbinBin = benefitbinBin;
	}

	public String getBenefitbinCode() {
		return benefitbinCode;
	}

	public void setBenefitbinCode(String benefitbinCode) {
		this.benefitbinCode = benefitbinCode;
	}

	public String getBenefitbinName() {
		return benefitbinName;
	}

	public void setBenefitbinName(String benefitbinName) {
		this.benefitbinName = benefitbinName;
	}

	public String getBenefitorg() {
		return benefitorg;
	}

	public void setBenefitorg(String benefitorg) {
		this.benefitorg = benefitorg;
	}

	public String getBenefitproject() {
		return benefitproject;
	}

	public void setBenefitproject(String benefitproject) {
		this.benefitproject = benefitproject;
	}

	public String getPriceSources() {
		return priceSources;
	}

	public void setPriceSources(String priceSources) {
		this.priceSources = priceSources;
	}

	public Integer getPricesourcesenum() {
		return pricesourcesenum;
	}

	public void setPricesourcesenum(Integer pricesourcesenum) {
		this.pricesourcesenum = pricesourcesenum;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	@Override
	public String toString() {
		return "MiscrcvtransL [id=" + id + ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", modifiedOn="
				+ modifiedOn + ", modifiedBy=" + modifiedBy + ", sysversion=" + sysversion + ", miscrcvtrans="
				+ miscrcvtrans + ", doclineno=" + doclineno + ", iteminfoItemid=" + iteminfoItemid
				+ ", iteminfoItemname=" + iteminfoItemname + ", iteminfoItemcode=" + iteminfoItemcode
				+ ", iteminfoItemgrade=" + iteminfoItemgrade + ", iteminfoItempotency=" + iteminfoItempotency
				+ ", iteminfoItemopt1=" + iteminfoItemopt1 + ", iteminfoItemopt2=" + iteminfoItemopt2
				+ ", iteminfoItemopt3=" + iteminfoItemopt3 + ", iteminfoItemversion=" + iteminfoItemversion
				+ ", iteminfoItemopt10=" + iteminfoItemopt10 + ", iteminfoItemopt4=" + iteminfoItemopt4
				+ ", iteminfoItemopt5=" + iteminfoItemopt5 + ", iteminfoItemopt6=" + iteminfoItemopt6
				+ ", iteminfoItemopt7=" + iteminfoItemopt7 + ", iteminfoItemopt8=" + iteminfoItemopt8
				+ ", iteminfoItemopt9=" + iteminfoItemopt9 + ", storetype=" + storetype + ", wh=" + wh + ", whman="
				+ whman + ", ownerorg=" + ownerorg + ", customerinfoCustomer=" + customerinfoCustomer
				+ ", customerinfoCode=" + customerinfoCode + ", customerinfoShortname=" + customerinfoShortname
				+ ", supplierinfoSupplier=" + supplierinfoSupplier + ", supplierinfoCode=" + supplierinfoCode
				+ ", supplierinfoShortname=" + supplierinfoShortname + ", manufacturerinfoSupplier="
				+ manufacturerinfoSupplier + ", manufacturerinfoCode=" + manufacturerinfoCode
				+ ", manufacturerinfoShortname=" + manufacturerinfoShortname + ", lotinfoLotcode=" + lotinfoLotcode
				+ ", lotinfoDisabledstring=" + lotinfoDisabledstring + ", lotinfoLotmaster=" + lotinfoLotmaster
				+ ", lotinfoLotvaliddate=" + lotinfoLotvaliddate + ", tradeuomqty=" + tradeuomqty + ", storeuomqty="
				+ storeuomqty + ", tbutosburate=" + tbutosburate + ", costuomqty=" + costuomqty + ", tbutocburate="
				+ tbutocburate + ", sobcurrency=" + sobcurrency + ", costprice=" + costprice + ", costmny=" + costmny
				+ ", project=" + project + ", task=" + task + ", handledept=" + handledept + ", handlepsn=" + handlepsn
				+ ", ismfg=" + ismfg + ", modocno=" + modocno + ", productdate=" + productdate + ", productline="
				+ productline + ", finisheditem=" + finisheditem + ", finisheditemversion=" + finisheditemversion
				+ ", finisheditemgrade=" + finisheditemgrade + ", finisheditempotency=" + finisheditempotency
				+ ", srcdocSrcdocEntityid=" + srcdocSrcdocEntityid + ", srcdocSrcdocEntitytype="
				+ srcdocSrcdocEntitytype + ", srcdocSrcdocorg=" + srcdocSrcdocorg + ", srcdocSrcdocbusitype="
				+ srcdocSrcdocbusitype + ", srcdocSrcdoctranstypeEntityid=" + srcdocSrcdoctranstypeEntityid
				+ ", srcdocSrcdoctranstypeEntitytype=" + srcdocSrcdoctranstypeEntitytype + ", srcdocSrcdocno="
				+ srcdocSrcdocno + ", srcdocSrcdocdate=" + srcdocSrcdocdate + ", srcdocSrcdocver=" + srcdocSrcdocver
				+ ", srcdocSrcdoclineEntityid=" + srcdocSrcdoclineEntityid + ", srcdocSrcdoclineEntitytype="
				+ srcdocSrcdoclineEntitytype + ", srcdocSrcdoclineno=" + srcdocSrcdoclineno
				+ ", srcdocSrcdocsublineEntityid=" + srcdocSrcdocsublineEntityid + ", srcdocSrcdocsublineEntitytype="
				+ srcdocSrcdocsublineEntitytype + ", srcdocSrcdocsublineno=" + srcdocSrcdocsublineno
				+ ", srcdocSrcdocsublinenostr=" + srcdocSrcdocsublinenostr + ", descflexsegmentsPubdescseg1="
				+ descflexsegmentsPubdescseg1 + ", descflexsegmentsPubdescseg2=" + descflexsegmentsPubdescseg2
				+ ", descflexsegmentsPubdescseg3=" + descflexsegmentsPubdescseg3 + ", descflexsegmentsPubdescseg4="
				+ descflexsegmentsPubdescseg4 + ", descflexsegmentsPubdescseg5=" + descflexsegmentsPubdescseg5
				+ ", descflexsegmentsPubdescseg6=" + descflexsegmentsPubdescseg6 + ", descflexsegmentsPubdescseg7="
				+ descflexsegmentsPubdescseg7 + ", descflexsegmentsPubdescseg8=" + descflexsegmentsPubdescseg8
				+ ", descflexsegmentsPubdescseg9=" + descflexsegmentsPubdescseg9 + ", descflexsegmentsPubdescseg10="
				+ descflexsegmentsPubdescseg10 + ", descflexsegmentsPubdescseg11=" + descflexsegmentsPubdescseg11
				+ ", descflexsegmentsPubdescseg12=" + descflexsegmentsPubdescseg12 + ", descflexsegmentsPubdescseg13="
				+ descflexsegmentsPubdescseg13 + ", descflexsegmentsPubdescseg14=" + descflexsegmentsPubdescseg14
				+ ", descflexsegmentsPubdescseg15=" + descflexsegmentsPubdescseg15 + ", descflexsegmentsPubdescseg16="
				+ descflexsegmentsPubdescseg16 + ", descflexsegmentsPubdescseg17=" + descflexsegmentsPubdescseg17
				+ ", descflexsegmentsPubdescseg18=" + descflexsegmentsPubdescseg18 + ", descflexsegmentsPubdescseg19="
				+ descflexsegmentsPubdescseg19 + ", descflexsegmentsPubdescseg20=" + descflexsegmentsPubdescseg20
				+ ", descflexsegmentsPubdescseg21=" + descflexsegmentsPubdescseg21 + ", descflexsegmentsPubdescseg22="
				+ descflexsegmentsPubdescseg22 + ", descflexsegmentsPubdescseg23=" + descflexsegmentsPubdescseg23
				+ ", descflexsegmentsPubdescseg24=" + descflexsegmentsPubdescseg24 + ", descflexsegmentsPubdescseg25="
				+ descflexsegmentsPubdescseg25 + ", descflexsegmentsPubdescseg26=" + descflexsegmentsPubdescseg26
				+ ", descflexsegmentsPubdescseg27=" + descflexsegmentsPubdescseg27 + ", descflexsegmentsPubdescseg28="
				+ descflexsegmentsPubdescseg28 + ", descflexsegmentsPubdescseg29=" + descflexsegmentsPubdescseg29
				+ ", descflexsegmentsPubdescseg30=" + descflexsegmentsPubdescseg30 + ", descflexsegmentsPubdescseg31="
				+ descflexsegmentsPubdescseg31 + ", descflexsegmentsPubdescseg32=" + descflexsegmentsPubdescseg32
				+ ", descflexsegmentsPubdescseg33=" + descflexsegmentsPubdescseg33 + ", descflexsegmentsPubdescseg34="
				+ descflexsegmentsPubdescseg34 + ", descflexsegmentsPubdescseg35=" + descflexsegmentsPubdescseg35
				+ ", descflexsegmentsPubdescseg36=" + descflexsegmentsPubdescseg36 + ", descflexsegmentsPubdescseg37="
				+ descflexsegmentsPubdescseg37 + ", descflexsegmentsPubdescseg38=" + descflexsegmentsPubdescseg38
				+ ", descflexsegmentsPubdescseg39=" + descflexsegmentsPubdescseg39 + ", descflexsegmentsPubdescseg40="
				+ descflexsegmentsPubdescseg40 + ", descflexsegmentsPubdescseg41=" + descflexsegmentsPubdescseg41
				+ ", descflexsegmentsPubdescseg42=" + descflexsegmentsPubdescseg42 + ", descflexsegmentsPubdescseg43="
				+ descflexsegmentsPubdescseg43 + ", descflexsegmentsPubdescseg44=" + descflexsegmentsPubdescseg44
				+ ", descflexsegmentsPubdescseg45=" + descflexsegmentsPubdescseg45 + ", descflexsegmentsPubdescseg46="
				+ descflexsegmentsPubdescseg46 + ", descflexsegmentsPubdescseg47=" + descflexsegmentsPubdescseg47
				+ ", descflexsegmentsPubdescseg48=" + descflexsegmentsPubdescseg48 + ", descflexsegmentsPubdescseg49="
				+ descflexsegmentsPubdescseg49 + ", descflexsegmentsPubdescseg50=" + descflexsegmentsPubdescseg50
				+ ", descflexsegmentsContextvalue=" + descflexsegmentsContextvalue
				+ ", descflexsegmentsPrivatedescseg1=" + descflexsegmentsPrivatedescseg1
				+ ", descflexsegmentsPrivatedescseg2=" + descflexsegmentsPrivatedescseg2
				+ ", descflexsegmentsPrivatedescseg3=" + descflexsegmentsPrivatedescseg3
				+ ", descflexsegmentsPrivatedescseg4=" + descflexsegmentsPrivatedescseg4
				+ ", descflexsegmentsPrivatedescseg5=" + descflexsegmentsPrivatedescseg5
				+ ", descflexsegmentsPrivatedescseg6=" + descflexsegmentsPrivatedescseg6
				+ ", descflexsegmentsPrivatedescseg7=" + descflexsegmentsPrivatedescseg7
				+ ", descflexsegmentsPrivatedescseg8=" + descflexsegmentsPrivatedescseg8
				+ ", descflexsegmentsPrivatedescseg9=" + descflexsegmentsPrivatedescseg9
				+ ", descflexsegmentsPrivatedescseg10=" + descflexsegmentsPrivatedescseg10
				+ ", descflexsegmentsPrivatedescseg11=" + descflexsegmentsPrivatedescseg11
				+ ", descflexsegmentsPrivatedescseg12=" + descflexsegmentsPrivatedescseg12
				+ ", descflexsegmentsPrivatedescseg13=" + descflexsegmentsPrivatedescseg13
				+ ", descflexsegmentsPrivatedescseg14=" + descflexsegmentsPrivatedescseg14
				+ ", descflexsegmentsPrivatedescseg15=" + descflexsegmentsPrivatedescseg15
				+ ", descflexsegmentsPrivatedescseg16=" + descflexsegmentsPrivatedescseg16
				+ ", descflexsegmentsPrivatedescseg17=" + descflexsegmentsPrivatedescseg17
				+ ", descflexsegmentsPrivatedescseg18=" + descflexsegmentsPrivatedescseg18
				+ ", descflexsegmentsPrivatedescseg19=" + descflexsegmentsPrivatedescseg19
				+ ", descflexsegmentsPrivatedescseg20=" + descflexsegmentsPrivatedescseg20
				+ ", descflexsegmentsPrivatedescseg21=" + descflexsegmentsPrivatedescseg21
				+ ", descflexsegmentsPrivatedescseg22=" + descflexsegmentsPrivatedescseg22
				+ ", descflexsegmentsPrivatedescseg23=" + descflexsegmentsPrivatedescseg23
				+ ", descflexsegmentsPrivatedescseg24=" + descflexsegmentsPrivatedescseg24
				+ ", descflexsegmentsPrivatedescseg25=" + descflexsegmentsPrivatedescseg25
				+ ", descflexsegmentsPrivatedescseg26=" + descflexsegmentsPrivatedescseg26
				+ ", descflexsegmentsPrivatedescseg27=" + descflexsegmentsPrivatedescseg27
				+ ", descflexsegmentsPrivatedescseg28=" + descflexsegmentsPrivatedescseg28
				+ ", descflexsegmentsPrivatedescseg29=" + descflexsegmentsPrivatedescseg29
				+ ", descflexsegmentsPrivatedescseg30=" + descflexsegmentsPrivatedescseg30 + ", workprocno="
				+ workprocno + ", org=" + org + ", storeuom=" + storeuom + ", storebaseuom=" + storebaseuom
				+ ", sutosburate=" + sutosburate + ", costuom=" + costuom + ", costbaseuom=" + costbaseuom
				+ ", cutocburate=" + cutocburate + ", tradeuom=" + tradeuom + ", tradebaseuom=" + tradebaseuom
				+ ", tradebaseuomqty=" + tradebaseuomqty + ", tutotburate=" + tutotburate + ", itemamt=" + itemamt
				+ ", mfcamt=" + mfcamt + ", workamt=" + workamt + ", collabamt=" + collabamt + ", puramt=" + puramt
				+ ", macamt=" + macamt + ", isvmi=" + isvmi + ", srcdoclinesysver=" + srcdoclinesysver + ", iszerocost="
				+ iszerocost + ", sncode=" + sncode + ", voucherid=" + voucherid + ", voucherno=" + voucherno
				+ ", vouchertypeid=" + vouchertypeid + ", isneedtogl=" + isneedtogl + ", istogl=" + istogl
				+ ", moaction=" + moaction + ", benefitdept=" + benefitdept + ", benefitpsn=" + benefitpsn
				+ ", modocentityEntityid=" + modocentityEntityid + ", modocentityEntitytype=" + modocentityEntitytype
				+ ", productlineentityEntityid=" + productlineentityEntityid + ", productlineentityEntitytype="
				+ productlineentityEntitytype + ", workprocnoenityEntityid=" + workprocnoenityEntityid
				+ ", workprocnoenityEntitytype=" + workprocnoenityEntitytype + ", seiban=" + seiban + ", seibancode="
				+ seibancode + ", storemainuom=" + storemainuom + ", storesubuom=" + storesubuom + ", sutosmurate="
				+ sutosmurate + ", sutocurate=" + sutocurate + ", storemainuomqty=" + storemainuomqty
				+ ", smutosmburate=" + smutosmburate + ", aaistatus=" + aaistatus + ", isneedgenaai=" + isneedgenaai
				+ ", balanceroute=" + balanceroute + ", isrelatedorg=" + isrelatedorg + ", pls=" + pls
				+ ", plsentityEntityid=" + plsentityEntityid + ", plsentityEntitytype=" + plsentityEntitytype
				+ ", benefitownerorg=" + benefitownerorg + ", benefitwh=" + benefitwh + ", benefitbinBin="
				+ benefitbinBin + ", benefitbinCode=" + benefitbinCode + ", benefitbinName=" + benefitbinName
				+ ", benefitorg=" + benefitorg + ", benefitproject=" + benefitproject + ", priceSources=" + priceSources
				+ ", pricesourcesenum=" + pricesourcesenum + ", dr=" + dr + "]";
	}

}