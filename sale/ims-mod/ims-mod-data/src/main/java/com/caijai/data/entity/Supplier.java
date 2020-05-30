package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseEntity;
import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.sysenum.Sort;
import com.caijai.base.sysenum.SupplierState;

/**
 * 供应商
 * 
 * @author duan2
 *
 */
@Table(name = "BD_Supplier")
public class Supplier extends BaseEntity {

	private static final long serialVersionUID = 5787065070122378860L;

	// 用于操作
	private String supState;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 是否需要确认交期
	 */
	@Column(name = "isConfrimDelivery")
	private SYSSET isConfrimDelivery;

	/**
	 * 邮箱
	 */
	@Column(name = "email")
	private String email;

	/** 行业 */
	@Column(name = "trade")
	private String trade;

	@Column(name = "tradeName", readonly = true)
	@Relation(table = "BD_Trade", value = "id", ref = "trade", show = "name")
	private String tradeName;

	@Column(name = "tradeCode", readonly = true)
	@Relation(table = "BD_Trade", value = "id", ref = "trade", show = "code")
	private String tradeCode;

	/**
	 * 抄送邮箱
	 */
	@Column(name = "mailbox")
	private String mailbox;

	/**
	 * 名称
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 绑定用户
	 */
	@Column(name = "buyer")
	private String buyer;

	@Column(name = "buyerName", readonly = true)
	@Relation(table = "BD_Operators", value = "id", ref = "buyer", show = "name")
	private String buyerName;

	/**
	 * 创建时间
	 */
	@Column(name = "CreatedOn", sort = Sort.DESC)
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
	 * 分类
	 */
	@Column(name = "Category")
	private String category;

	/**
	 * 部门
	 */
	@Column(name = "Department")
	private String department;

	/**
	 * 业务员
	 */
	@Column(name = "Purchaser")
	private String purchaser;

	/**
	 * 行业
	 */
	@Column(name = "TradeCategory")
	private Integer tradecategory;

	/**
	 * 工商注册码
	 */
	@Column(name = "CorpUnifyCode")
	private String corpunifycode;

	/**
	 * 国税号
	 */
	@Column(name = "StateTaxNo")
	private String statetaxno;

	/**
	 * 地税号
	 */
	@Column(name = "DistrictTaxNo")
	private String districttaxno;

	/**
	 * 供应商状态
	 */
	@Column(name = "State")
	private SupplierState state;

	/**
	 * 地区
	 */
	@Column(name = "Territory")
	private String territory;
	
	/**
	 * 不准交易原因
	 */
	@Column(name = "disableReason")
	private String disableReason;
	
	/**
	 * 注册地址
	 */
	@Column(name = "RegisterLocation")
	private String registerlocation;

	/**
	 * 收货原则
	 */
	@Column(name = "ReceiptRule")
	private String receiptrule;

	/**
	 * 收货原则可改
	 */
	@Column(name = "IsReceiptRuleEditable")
	private Integer isreceiptruleeditable;

	/**
	 * 运输提前期
	 */
	@Column(name = "TransitLeadTime")
	private Integer transitleadtime;

	/**
	 * 付款条件
	 */
	@Column(name = "PaymentTerm")
	private String paymentterm;

	/**
	 * 发票核销顺序
	 */
	@Column(name = "InvoiceVerificationOrder")
	private Integer invoiceverificationorder;

	/**
	 * 核销明细
	 */
	@Column(name = "InvoiceVerificationDetai")
	private Integer invoiceverificationdetai;

	/**
	 * 单据核销顺序
	 */
	@Column(name = "DocVerificationOrder")
	private Integer docverificationorder;

	/**
	 * 评估等级
	 */
	@Column(name = "EvaluateLevel")
	private Integer evaluatelevel;

	/**
	 * 付款币种
	 */
	@Column(name = "CheckCurrency")
	private String checkcurrency;

	/**
	 * 交易币种
	 */
	@Column(name = "TradeCurrency")
	private String tradecurrency;

	/**
	 * 税组合
	 */
	@Column(name = "TaxSchedule")
	private String taxschedule;

	/**
	 * 出货位置
	 */
	@Column(name = "DefaultShipTo")
	private String defaultshipto;

	/**
	 * 发票位置
	 */
	@Column(name = "DefaultBillTo")
	private String defaultbillto;

	/**
	 * 索赔位置
	 */
	@Column(name = "DefaultClaim")
	private String defaultclaim;

	/**
	 * 对账位置
	 */
	@Column(name = "DefaultContrast")
	private String defaultcontrast;

	/**
	 * 汇款位置
	 */
	@Column(name = "DefaultRemit")
	private String defaultremit;

	/**
	 * 询价位置
	 */
	@Column(name = "DefaultRFQ")
	private String defaultrfq;

	/**
	 * 办公地址
	 */
	@Column(name = "OfficialLocation")
	private String officiallocation;

	/**
	 * 立账条件可改
	 */
	@Column(name = "IsAPConfirmTermEditable")
	private Integer isapconfirmtermeditable;

	/**
	 * 立账条件
	 */
	@Column(name = "APConfirmTerm")
	private String apconfirmterm;

	/**
	 * 成立日期
	 */
	@Column(name = "EstablishDate")
	private String establishdate;

	/**
	 * 挂起原因
	 */
	@Column(name = "HoldReason")
	private String holdreason;

	/**
	 * 解除原因
	 */
	@Column(name = "ReleaseReason")
	private String releasereason;

	/**
	 * 挂起日期
	 */
	@Column(name = "HoldDate")
	private String holddate;

	/**
	 * 解除日期
	 */
	@Column(name = "ReleaseDate")
	private String releasedate;

	/**
	 * 简称
	 */
	@Column(name = "ShortName")
	private String shortname;

	/**
	 * 组织
	 */
	@Column(name = "Org")
	private String org;

	/**
	 * 付款条件可改
	 */
	@Column(name = "IsPaymentTermModify")
	private Integer ispaymenttermmodify;

	/**
	 * 联系对象
	 */
	@Column(name = "ContactObject")
	private String contactobject;

	/**
	 * 价目表可改
	 */
	@Column(name = "IsPriceListModify")
	private Integer ispricelistmodify;

	/**
	 * 搜索码
	 */
	@Column(name = "SearchCode")
	private String searchcode;

	/**
	 * 一次性供应商
	 */
	@Column(name = "IsMISC")
	private Integer ismisc;

	/**
	 * 员工人数
	 */
	@Column(name = "EmployeeCount")
	private Integer employeecount;

	/**
	 * 语言
	 */
	@Column(name = "Language")
	private String language;

	/**
	 * 质保方式
	 */
	@Column(name = "QualityPledge")
	private Integer qualitypledge;

	/**
	 * 押单方式
	 */
	@Column(name = "PledgeMode")
	private Integer pledgemode;

	/**
	 * 报关行
	 */
	@Column(name = "IsBGLineNO")
	private Integer isbglineno;

	/**
	 * 外协供应商
	 */
	@Column(name = "IsAssistance")
	private Integer isassistance;

	/**
	 * 营业额
	 */
	@Column(name = "Turnover")
	private Double turnover;

	/**
	 * 最近评估日
	 */
	@Column(name = "LastEvaluateDate")
	private String lastevaluatedate;

	/**
	 * 押单笔数
	 */
	@Column(name = "PledgeCount")
	private Integer pledgecount;

	/**
	 * 资本额
	 */
	@Column(name = "RegisterCapital")
	private Double registercapital;

	/**
	 * 主承运商
	 */
	@Column(name = "Carrier")
	private String carrier;

	/**
	 * 佣金比率
	 */
	@Column(name = "CommissionRate")
	private Double commissionrate;

	/**
	 * 保险费率
	 */
	@Column(name = "InsuranceRate")
	private Double insurancerate;

	/**
	 * 国别
	 */
	@Column(name = "Country")
	private String country;

	/**
	 * 成交方式
	 */
	@Column(name = "Bargain")
	private Integer bargain;

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

	/**
	 * 解除人
	 */
	@Column(name = "ReleaseUser")
	private String releaseuser;

	/**
	 * 挂起人
	 */
	@Column(name = "HoldUser")
	private String holduser;

	/**
	 * 是否有效
	 */
	@Column(name = "Effective_IsEffective")
	private Integer effectiveIseffective;

	/**
	 * 有效时间
	 */
	@Column(name = "Effective_EffectiveDate")
	private String effectiveEffectivedate;

	/**
	 * 失效时间
	 */
	@Column(name = "Effective_DisableDate")
	private String effectiveDisabledate;

	/**
	 * 关键性弹性域结构
	 */
	@Column(name = "KeyFlexFieldStru")
	private String keyflexfieldstru;

	/**
	 * 编码
	 */
	@Column(name = "Code")
	private String code;

	/**
	 * 段1
	 */
	@Column(name = "Segment1")
	private String segment1;

	/**
	 * 段2
	 */
	@Column(name = "Segment2")
	private String segment2;

	/**
	 * 段3
	 */
	@Column(name = "Segment3")
	private String segment3;

	/**
	 * 段4
	 */
	@Column(name = "Segment4")
	private String segment4;

	/**
	 * 段5
	 */
	@Column(name = "Segment5")
	private String segment5;

	/**
	 * 段6
	 */
	@Column(name = "Segment6")
	private String segment6;

	/**
	 * 段7
	 */
	@Column(name = "Segment7")
	private String segment7;

	/**
	 * 段8
	 */
	@Column(name = "Segment8")
	private String segment8;

	/**
	 * 段9
	 */
	@Column(name = "Segment9")
	private String segment9;

	/**
	 * 段10
	 */
	@Column(name = "Segment10")
	private String segment10;

	/**
	 * 段11
	 */
	@Column(name = "Segment11")
	private String segment11;

	/**
	 * 段12
	 */
	@Column(name = "Segment12")
	private String segment12;

	/**
	 * 段13
	 */
	@Column(name = "Segment13")
	private String segment13;

	/**
	 * 段14
	 */
	@Column(name = "Segment14")
	private String segment14;

	/**
	 * 段15
	 */
	@Column(name = "Segment15")
	private String segment15;

	/**
	 * 段16
	 */
	@Column(name = "Segment16")
	private String segment16;

	/**
	 * 段17
	 */
	@Column(name = "Segment17")
	private String segment17;

	/**
	 * 段18
	 */
	@Column(name = "Segment18")
	private String segment18;

	/**
	 * 段19
	 */
	@Column(name = "Segment19")
	private String segment19;

	/**
	 * 段20
	 */
	@Column(name = "Segment20")
	private String segment20;

	/**
	 * 价目表
	 */
	@Column(name = "PriceListID")
	private String pricelistid;

	/**
	 * 资本额币种
	 */
	@Column(name = "RegisterCapitalCurrency")
	private String registercapitalcurrency;

	/**
	 * 营业额币种
	 */
	@Column(name = "TurnoverCurrency")
	private String turnovercurrency;

	/**
	 * 状态人
	 */
	@Column(name = "StateUser")
	private String stateuser;

	/**
	 * 状态时间
	 */
	@Column(name = "StateTime")
	private String statetime;

	/**
	 * 控制组织
	 */
	@Column(name = "MasterOrg")
	private String masterorg;

	/**
	 * 挂起
	 */
	@Column(name = "IsHoldRelease")
	private Integer isholdrelease;

	/**
	 * 价目表编码
	 */
	@Column(name = "PriceListCode")
	private String pricelistcode;

	/**
	 * 价目表名称
	 */
	@Column(name = "PriceListName")
	private String pricelistname;

	/**
	 * 一揽子合同类型
	 */
	@Column(name = "DefaultContractType")
	private String defaultcontracttype;

	/**
	 * 合同类型编码
	 */
	@Column(name = "ContractTypeCode")
	private String contracttypecode;

	/**
	 * 合同类型名称
	 */
	@Column(name = "ContractTypeName")
	private String contracttypename;

	/**
	 * 启用门户
	 */
	@Column(name = "IsUseAppPortal")
	private Integer isuseappportal;

	/**
	 * 门户
	 */
	@Column(name = "AppPortal")
	private String appportal;

	/**
	 * 段30
	 */
	@Column(name = "Segment30")
	private String segment30;

	/**
	 * 段21
	 */
	@Column(name = "Segment21")
	private String segment21;

	/**
	 * 段22
	 */
	@Column(name = "Segment22")
	private String segment22;

	/**
	 * 段23
	 */
	@Column(name = "Segment23")
	private String segment23;

	/**
	 * 段24
	 */
	@Column(name = "Segment24")
	private String segment24;

	/**
	 * 段25
	 */
	@Column(name = "Segment25")
	private String segment25;

	/**
	 * 段26
	 */
	@Column(name = "Segment26")
	private String segment26;

	/**
	 * 段27
	 */
	@Column(name = "Segment27")
	private String segment27;

	/**
	 * 段28
	 */
	@Column(name = "Segment28")
	private String segment28;

	/**
	 * 段29
	 */
	@Column(name = "Segment29")
	private String segment29;

	/**
	 * 我方供应收货参考依据
	 */
	@Column(name = "OurSideSupplyRecRefStd")
	private Integer oursidesupplyrecrefstd;

	/**
	 * 必须有合同
	 */
	@Column(name = "IsHaveContract")
	private Integer ishavecontract;

	/**
	 * 预付款
	 */
	@Column(name = "IsPrePay")
	private Integer isprepay;

	/**
	 * 最高预付比例
	 */
	@Column(name = "MaxPrePayRate")
	private Double maxprepayrate;

	/**
	 * 预付比例可改
	 */
	@Column(name = "IsPrePayRateEditable")
	private Integer isprepayrateeditable;

	/**
	 * VMI规则
	 */
	@Column(name = "VMIRule")
	private String vmirule;

	/**
	 * VMI规则编码
	 */
	@Column(name = "VMIRuleCode")
	private String vmirulecode;

	/**
	 * VMI规则名称
	 */
	@Column(name = "VMIRuleName")
	private String vmirulename;

	/**
	 * 预付政策
	 */
	@Column(name = "PrePayPolicy")
	private String prepaypolicy;

	/**
	 * 预付政策编码
	 */
	@Column(name = "PrePayPolicyCode")
	private String prepaypolicycode;

	/**
	 * 预付政策名称
	 */
	@Column(name = "PrePayPolicyName")
	private String prepaypolicyname;

	/**
	 * 预付政策可改
	 */
	@Column(name = "IsPrePayPolicyModify")
	private Integer isprepaypolicymodify;

	/**
	 * 价格含税
	 */
	@Column(name = "IsTaxPrice")
	private Integer istaxprice;

	/**
	 * 是否作废
	 */
	@Column(name = "dr")
	private Integer dr;

	@Column(name = "ts")
	private String ts;

	/** 拉黑人 */
	@Column(name = "blackBy")
	private String blackBy;

	/** 拉黑时间 */
	@Column(name = "blackOn")
	private String blackOn;

	/** 邀约人 */
	@Column(name = "invitationBy")
	private String invitationBy;

	/** 邀约时间 */
	@Column(name = "invitationOn")
	private String invitationOn;

	/** 审核人 */
	@Column(name = "reviewBy")
	private String reviewBy;

	/** 审核时间 */
	@Column(name = "reviewOn")
	private String reviewOn;

	@Column(name = "syncSource")
	private String syncSource;

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPurchaser() {
		return purchaser;
	}

	public void setPurchaser(String purchaser) {
		this.purchaser = purchaser;
	}

	public Integer getTradecategory() {
		return tradecategory;
	}

	public void setTradecategory(Integer tradecategory) {
		this.tradecategory = tradecategory;
	}

	public String getCorpunifycode() {
		return corpunifycode;
	}

	public void setCorpunifycode(String corpunifycode) {
		this.corpunifycode = corpunifycode;
	}

	public String getStatetaxno() {
		return statetaxno;
	}

	public void setStatetaxno(String statetaxno) {
		this.statetaxno = statetaxno;
	}

	public String getDistricttaxno() {
		return districttaxno;
	}

	public void setDistricttaxno(String districttaxno) {
		this.districttaxno = districttaxno;
	}

	public SupplierState getState() {
		return state;
	}

	public void setState(SupplierState state) {
		this.state = state;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String getRegisterlocation() {
		return registerlocation;
	}

	public void setRegisterlocation(String registerlocation) {
		this.registerlocation = registerlocation;
	}

	public String getReceiptrule() {
		return receiptrule;
	}

	public void setReceiptrule(String receiptrule) {
		this.receiptrule = receiptrule;
	}

	public Integer getIsreceiptruleeditable() {
		return isreceiptruleeditable;
	}

	public void setIsreceiptruleeditable(Integer isreceiptruleeditable) {
		this.isreceiptruleeditable = isreceiptruleeditable;
	}

	public Integer getTransitleadtime() {
		return transitleadtime;
	}

	public void setTransitleadtime(Integer transitleadtime) {
		this.transitleadtime = transitleadtime;
	}

	public String getPaymentterm() {
		return paymentterm;
	}

	public void setPaymentterm(String paymentterm) {
		this.paymentterm = paymentterm;
	}

	public Integer getInvoiceverificationorder() {
		return invoiceverificationorder;
	}

	public void setInvoiceverificationorder(Integer invoiceverificationorder) {
		this.invoiceverificationorder = invoiceverificationorder;
	}

	public Integer getInvoiceverificationdetai() {
		return invoiceverificationdetai;
	}

	public void setInvoiceverificationdetai(Integer invoiceverificationdetai) {
		this.invoiceverificationdetai = invoiceverificationdetai;
	}

	public Integer getDocverificationorder() {
		return docverificationorder;
	}

	public void setDocverificationorder(Integer docverificationorder) {
		this.docverificationorder = docverificationorder;
	}

	public Integer getEvaluatelevel() {
		return evaluatelevel;
	}

	public void setEvaluatelevel(Integer evaluatelevel) {
		this.evaluatelevel = evaluatelevel;
	}

	public String getCheckcurrency() {
		return checkcurrency;
	}

	public void setCheckcurrency(String checkcurrency) {
		this.checkcurrency = checkcurrency;
	}

	public String getTradecurrency() {
		return tradecurrency;
	}

	public void setTradecurrency(String tradecurrency) {
		this.tradecurrency = tradecurrency;
	}

	public String getTaxschedule() {
		return taxschedule;
	}

	public void setTaxschedule(String taxschedule) {
		this.taxschedule = taxschedule;
	}

	public String getDefaultshipto() {
		return defaultshipto;
	}

	public void setDefaultshipto(String defaultshipto) {
		this.defaultshipto = defaultshipto;
	}

	public String getDefaultbillto() {
		return defaultbillto;
	}

	public void setDefaultbillto(String defaultbillto) {
		this.defaultbillto = defaultbillto;
	}

	public String getDefaultclaim() {
		return defaultclaim;
	}

	public void setDefaultclaim(String defaultclaim) {
		this.defaultclaim = defaultclaim;
	}

	public String getDefaultcontrast() {
		return defaultcontrast;
	}

	public void setDefaultcontrast(String defaultcontrast) {
		this.defaultcontrast = defaultcontrast;
	}

	public String getDefaultremit() {
		return defaultremit;
	}

	public void setDefaultremit(String defaultremit) {
		this.defaultremit = defaultremit;
	}

	public String getDefaultrfq() {
		return defaultrfq;
	}

	public void setDefaultrfq(String defaultrfq) {
		this.defaultrfq = defaultrfq;
	}

	public String getOfficiallocation() {
		return officiallocation;
	}

	public void setOfficiallocation(String officiallocation) {
		this.officiallocation = officiallocation;
	}

	public Integer getIsapconfirmtermeditable() {
		return isapconfirmtermeditable;
	}

	public void setIsapconfirmtermeditable(Integer isapconfirmtermeditable) {
		this.isapconfirmtermeditable = isapconfirmtermeditable;
	}

	public String getApconfirmterm() {
		return apconfirmterm;
	}

	public void setApconfirmterm(String apconfirmterm) {
		this.apconfirmterm = apconfirmterm;
	}

	public String getEstablishdate() {
		return establishdate;
	}

	public void setEstablishdate(String establishdate) {
		this.establishdate = establishdate;
	}

	public String getHoldreason() {
		return holdreason;
	}

	public void setHoldreason(String holdreason) {
		this.holdreason = holdreason;
	}

	public String getReleasereason() {
		return releasereason;
	}

	public void setReleasereason(String releasereason) {
		this.releasereason = releasereason;
	}

	public String getHolddate() {
		return holddate;
	}

	public void setHolddate(String holddate) {
		this.holddate = holddate;
	}

	public String getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public Integer getIspaymenttermmodify() {
		return ispaymenttermmodify;
	}

	public void setIspaymenttermmodify(Integer ispaymenttermmodify) {
		this.ispaymenttermmodify = ispaymenttermmodify;
	}

	public String getContactobject() {
		return contactobject;
	}

	public void setContactobject(String contactobject) {
		this.contactobject = contactobject;
	}

	public Integer getIspricelistmodify() {
		return ispricelistmodify;
	}

	public void setIspricelistmodify(Integer ispricelistmodify) {
		this.ispricelistmodify = ispricelistmodify;
	}

	public String getSearchcode() {
		return searchcode;
	}

	public void setSearchcode(String searchcode) {
		this.searchcode = searchcode;
	}

	public Integer getIsmisc() {
		return ismisc;
	}

	public void setIsmisc(Integer ismisc) {
		this.ismisc = ismisc;
	}

	public Integer getEmployeecount() {
		return employeecount;
	}

	public void setEmployeecount(Integer employeecount) {
		this.employeecount = employeecount;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getQualitypledge() {
		return qualitypledge;
	}

	public void setQualitypledge(Integer qualitypledge) {
		this.qualitypledge = qualitypledge;
	}

	public Integer getPledgemode() {
		return pledgemode;
	}

	public void setPledgemode(Integer pledgemode) {
		this.pledgemode = pledgemode;
	}

	public Integer getIsbglineno() {
		return isbglineno;
	}

	public void setIsbglineno(Integer isbglineno) {
		this.isbglineno = isbglineno;
	}

	public Integer getIsassistance() {
		return isassistance;
	}

	public void setIsassistance(Integer isassistance) {
		this.isassistance = isassistance;
	}

	public Double getTurnover() {
		return turnover;
	}

	public void setTurnover(Double turnover) {
		this.turnover = turnover;
	}

	public String getLastevaluatedate() {
		return lastevaluatedate;
	}

	public void setLastevaluatedate(String lastevaluatedate) {
		this.lastevaluatedate = lastevaluatedate;
	}

	public Integer getPledgecount() {
		return pledgecount;
	}

	public void setPledgecount(Integer pledgecount) {
		this.pledgecount = pledgecount;
	}

	public Double getRegistercapital() {
		return registercapital;
	}

	public void setRegistercapital(Double registercapital) {
		this.registercapital = registercapital;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public Double getCommissionrate() {
		return commissionrate;
	}

	public void setCommissionrate(Double commissionrate) {
		this.commissionrate = commissionrate;
	}

	public Double getInsurancerate() {
		return insurancerate;
	}

	public void setInsurancerate(Double insurancerate) {
		this.insurancerate = insurancerate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getBargain() {
		return bargain;
	}

	public void setBargain(Integer bargain) {
		this.bargain = bargain;
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

	public String getReleaseuser() {
		return releaseuser;
	}

	public void setReleaseuser(String releaseuser) {
		this.releaseuser = releaseuser;
	}

	public String getHolduser() {
		return holduser;
	}

	public void setHolduser(String holduser) {
		this.holduser = holduser;
	}

	public Integer getEffectiveIseffective() {
		return effectiveIseffective;
	}

	public void setEffectiveIseffective(Integer effectiveIseffective) {
		this.effectiveIseffective = effectiveIseffective;
	}

	public String getEffectiveEffectivedate() {
		return effectiveEffectivedate;
	}

	public void setEffectiveEffectivedate(String effectiveEffectivedate) {
		this.effectiveEffectivedate = effectiveEffectivedate;
	}

	public String getEffectiveDisabledate() {
		return effectiveDisabledate;
	}

	public void setEffectiveDisabledate(String effectiveDisabledate) {
		this.effectiveDisabledate = effectiveDisabledate;
	}

	public String getKeyflexfieldstru() {
		return keyflexfieldstru;
	}

	public void setKeyflexfieldstru(String keyflexfieldstru) {
		this.keyflexfieldstru = keyflexfieldstru;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getPricelistid() {
		return pricelistid;
	}

	public void setPricelistid(String pricelistid) {
		this.pricelistid = pricelistid;
	}

	public String getRegistercapitalcurrency() {
		return registercapitalcurrency;
	}

	public void setRegistercapitalcurrency(String registercapitalcurrency) {
		this.registercapitalcurrency = registercapitalcurrency;
	}

	public String getTurnovercurrency() {
		return turnovercurrency;
	}

	public void setTurnovercurrency(String turnovercurrency) {
		this.turnovercurrency = turnovercurrency;
	}

	public String getStateuser() {
		return stateuser;
	}

	public void setStateuser(String stateuser) {
		this.stateuser = stateuser;
	}

	public String getStatetime() {
		return statetime;
	}

	public void setStatetime(String statetime) {
		this.statetime = statetime;
	}

	public String getMasterorg() {
		return masterorg;
	}

	public void setMasterorg(String masterorg) {
		this.masterorg = masterorg;
	}

	public Integer getIsholdrelease() {
		return isholdrelease;
	}

	public void setIsholdrelease(Integer isholdrelease) {
		this.isholdrelease = isholdrelease;
	}

	public String getPricelistcode() {
		return pricelistcode;
	}

	public void setPricelistcode(String pricelistcode) {
		this.pricelistcode = pricelistcode;
	}

	public String getPricelistname() {
		return pricelistname;
	}

	public void setPricelistname(String pricelistname) {
		this.pricelistname = pricelistname;
	}

	public String getDefaultcontracttype() {
		return defaultcontracttype;
	}

	public void setDefaultcontracttype(String defaultcontracttype) {
		this.defaultcontracttype = defaultcontracttype;
	}

	public String getContracttypecode() {
		return contracttypecode;
	}

	public void setContracttypecode(String contracttypecode) {
		this.contracttypecode = contracttypecode;
	}

	public String getContracttypename() {
		return contracttypename;
	}

	public void setContracttypename(String contracttypename) {
		this.contracttypename = contracttypename;
	}

	public Integer getIsuseappportal() {
		return isuseappportal;
	}

	public void setIsuseappportal(Integer isuseappportal) {
		this.isuseappportal = isuseappportal;
	}

	public String getAppportal() {
		return appportal;
	}

	public void setAppportal(String appportal) {
		this.appportal = appportal;
	}

	public String getSegment30() {
		return segment30;
	}

	public void setSegment30(String segment30) {
		this.segment30 = segment30;
	}

	public String getSegment21() {
		return segment21;
	}

	public void setSegment21(String segment21) {
		this.segment21 = segment21;
	}

	public String getSegment22() {
		return segment22;
	}

	public void setSegment22(String segment22) {
		this.segment22 = segment22;
	}

	public String getSegment23() {
		return segment23;
	}

	public void setSegment23(String segment23) {
		this.segment23 = segment23;
	}

	public String getSegment24() {
		return segment24;
	}

	public void setSegment24(String segment24) {
		this.segment24 = segment24;
	}

	public String getSegment25() {
		return segment25;
	}

	public void setSegment25(String segment25) {
		this.segment25 = segment25;
	}

	public String getSegment26() {
		return segment26;
	}

	public void setSegment26(String segment26) {
		this.segment26 = segment26;
	}

	public String getSegment27() {
		return segment27;
	}

	public void setSegment27(String segment27) {
		this.segment27 = segment27;
	}

	public String getSegment28() {
		return segment28;
	}

	public void setSegment28(String segment28) {
		this.segment28 = segment28;
	}

	public String getSegment29() {
		return segment29;
	}

	public void setSegment29(String segment29) {
		this.segment29 = segment29;
	}

	public Integer getOursidesupplyrecrefstd() {
		return oursidesupplyrecrefstd;
	}

	public void setOursidesupplyrecrefstd(Integer oursidesupplyrecrefstd) {
		this.oursidesupplyrecrefstd = oursidesupplyrecrefstd;
	}

	public Integer getIshavecontract() {
		return ishavecontract;
	}

	public void setIshavecontract(Integer ishavecontract) {
		this.ishavecontract = ishavecontract;
	}

	public Integer getIsprepay() {
		return isprepay;
	}

	public void setIsprepay(Integer isprepay) {
		this.isprepay = isprepay;
	}

	public Double getMaxprepayrate() {
		return maxprepayrate;
	}

	public void setMaxprepayrate(Double maxprepayrate) {
		this.maxprepayrate = maxprepayrate;
	}

	public Integer getIsprepayrateeditable() {
		return isprepayrateeditable;
	}

	public void setIsprepayrateeditable(Integer isprepayrateeditable) {
		this.isprepayrateeditable = isprepayrateeditable;
	}

	public String getVmirule() {
		return vmirule;
	}

	public void setVmirule(String vmirule) {
		this.vmirule = vmirule;
	}

	public String getVmirulecode() {
		return vmirulecode;
	}

	public void setVmirulecode(String vmirulecode) {
		this.vmirulecode = vmirulecode;
	}

	public String getVmirulename() {
		return vmirulename;
	}

	public void setVmirulename(String vmirulename) {
		this.vmirulename = vmirulename;
	}

	public String getPrepaypolicy() {
		return prepaypolicy;
	}

	public void setPrepaypolicy(String prepaypolicy) {
		this.prepaypolicy = prepaypolicy;
	}

	public String getPrepaypolicycode() {
		return prepaypolicycode;
	}

	public void setPrepaypolicycode(String prepaypolicycode) {
		this.prepaypolicycode = prepaypolicycode;
	}

	public String getPrepaypolicyname() {
		return prepaypolicyname;
	}

	public void setPrepaypolicyname(String prepaypolicyname) {
		this.prepaypolicyname = prepaypolicyname;
	}

	public Integer getIsprepaypolicymodify() {
		return isprepaypolicymodify;
	}

	public void setIsprepaypolicymodify(Integer isprepaypolicymodify) {
		this.isprepaypolicymodify = isprepaypolicymodify;
	}

	public Integer getIstaxprice() {
		return istaxprice;
	}

	public void setIstaxprice(Integer istaxprice) {
		this.istaxprice = istaxprice;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SYSSET getIsConfrimDelivery() {
		return isConfrimDelivery;
	}

	public void setIsConfrimDelivery(SYSSET isConfrimDelivery) {
		this.isConfrimDelivery = isConfrimDelivery;
	}

	public String getMailbox() {
		return mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getTradeCode() {
		return tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public String getSyncSource() {
		return syncSource;
	}

	public void setSyncSource(String syncSource) {
		this.syncSource = syncSource;
	}

	public String getSupState() {
		return supState;
	}

	public void setSupState(String supState) {
		this.supState = supState;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getBlackBy() {
		return blackBy;
	}

	public void setBlackBy(String blackBy) {
		this.blackBy = blackBy;
	}

	public String getBlackOn() {
		return blackOn;
	}

	public void setBlackOn(String blackOn) {
		this.blackOn = blackOn;
	}

	public String getReviewBy() {
		return reviewBy;
	}

	public void setReviewBy(String reviewBy) {
		this.reviewBy = reviewBy;
	}

	public String getReviewOn() {
		return reviewOn;
	}

	public void setReviewOn(String reviewOn) {
		this.reviewOn = reviewOn;
	}

	public String getInvitationBy() {
		return invitationBy;
	}

	public void setInvitationBy(String invitationBy) {
		this.invitationBy = invitationBy;
	}

	public String getInvitationOn() {
		return invitationOn;
	}

	public void setInvitationOn(String invitationOn) {
		this.invitationOn = invitationOn;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getDisableReason() {
		return disableReason;
	}

	public void setDisableReason(String disableReason) {
		this.disableReason = disableReason;
	}

}