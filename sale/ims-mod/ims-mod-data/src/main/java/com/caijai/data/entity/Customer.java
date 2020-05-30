package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseEntity;
import com.caijai.base.sysenum.Sort;

@Table(name = "BD_Customer")
public class Customer extends BaseEntity {

	private static final long serialVersionUID = -2539440505469261170L;

	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 名称
	 */
	@Column(name = "name")
	private String name;
	
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
	@Column(name = "CustomerCategory")
	private String customercategory;

	/**
	 * 搜索码
	 */
	@Column(name = "SearchCode")
	private String searchcode;

	/**
	 * 部门
	 */
	@Column(name = "Department")
	private String department;

	/**
	 * 业务员
	 */
	@Column(name = "Saleser")
	private String saleser;

	/**
	 * 行业
	 */
	@Column(name = "TradeCategory")
	private Integer tradecategory;

	/**
	 * 资本额
	 */
	@Column(name = "RegisterCapital")
	private Double registercapital;

	/**
	 * 营业额
	 */
	@Column(name = "Turnover")
	private Double turnover;

	/**
	 * 员工人数
	 */
	@Column(name = "EmployeeCount")
	private Integer employeecount;

	/**
	 * 成立日期
	 */
	@Column(name = "EstablishDate")
	private String establishdate;

	/**
	 * 语言
	 */
	@Column(name = "Language")
	private String language;

	/**
	 * 收款币种
	 */
	@Column(name = "PayCurrency")
	private String paycurrency;

	/**
	 * 交易币种
	 */
	@Column(name = "TradeCurrency")
	private String tradecurrency;

	/**
	 * 缴纳保证金
	 */
	@Column(name = "IsDeposit")
	private Integer isdeposit;

	/**
	 * 收款条件
	 */
	@Column(name = "RecervalTerm")
	private String recervalterm;

	/**
	 * 收款条件可改
	 */
	@Column(name = "IsRecTermModify")
	private Integer isrectermmodify;

	/**
	 * 享受折扣
	 */
	@Column(name = "IsSalesDiscount")
	private Integer issalesdiscount;

	/**
	 * 运输提前期
	 */
	@Column(name = "TransitLeadTime")
	private Integer transitleadtime;

	/**
	 * 出货原则
	 */
	@Column(name = "ShippmentRule")
	private String shippmentrule;

	/**
	 * 出货原则可改
	 */
	@Column(name = "IsShipmentModify")
	private Integer isshipmentmodify;

	/**
	 * 退货条件
	 */
	@Column(name = "ReturnTerm")
	private String returnterm;

	/**
	 * 价目表可改
	 */
	@Column(name = "IsPriceListModify")
	private Integer ispricelistmodify;

	/**
	 * 国税号
	 */
	@Column(name = "StateTaxNo")
	private String statetaxno;

	/**
	 * 税组合
	 */
	@Column(name = "TaxSchedule")
	private String taxschedule;

	/**
	 * 地税号
	 */
	@Column(name = "DistrictTaxNo")
	private String districttaxno;

	/**
	 * 信用检查
	 */
	@Column(name = "IsCreditCheck")
	private Integer iscreditcheck;

	/**
	 * 邮寄对账单
	 */
	@Column(name = "IsPost")
	private Integer ispost;

	/**
	 * 对账期间
	 */
	@Column(name = "CheckAccountPeriod")
	private Integer checkaccountperiod;

	/**
	 * 对账单格式
	 */
	@Column(name = "AccountListFormat")
	private String accountlistformat;

	/**
	 * 最近打印日
	 */
	@Column(name = "LastPrintDate")
	private String lastprintdate;

	/**
	 * 下次打印日
	 */
	@Column(name = "NextPrintDate")
	private String nextprintdate;

	/**
	 * 按余额开票
	 */
	@Column(name = "IsBillByBalance")
	private Integer isbillbybalance;

	/**
	 * 核销顺序
	 */
	@Column(name = "InvoiceVerificationOrder")
	private Integer invoiceverificationorder;

	/**
	 * 核销明细
	 */
	@Column(name = "VerificationMode")
	private Integer verificationmode;

	/**
	 * 征收托收费
	 */
	@Column(name = "IsCharge")
	private Integer ischarge;

	/**
	 * 按账龄催款
	 */
	@Column(name = "IsByAccountAge")
	private Integer isbyaccountage;

	/**
	 * 挂起计息
	 */
	@Column(name = "IsSuspendAccrual")
	private Integer issuspendaccrual;

	/**
	 * 利息转应收
	 */
	@Column(name = "IsAccrualToAR")
	private Integer isaccrualtoar;

	/**
	 * 延迟付款计息
	 */
	@Column(name = "IsDelay")
	private Integer isdelay;

	/**
	 * 重复计息
	 */
	@Column(name = "IsCompound")
	private Integer iscompound;

	/**
	 * 宽限期间
	 */
	@Column(name = "ExtendLimitDays")
	private Integer extendlimitdays;

	/**
	 * 计息期间
	 */
	@Column(name = "InterestPeriod")
	private Integer interestperiod;

	/**
	 * 客户状况
	 */
	@Column(name = "State")
	private Integer state;

	/**
	 * 出货位置
	 */
	@Column(name = "DefaultShipTo")
	private String defaultshipto;

	/**
	 * 收票位置
	 */
	@Column(name = "DefaultBillTo")
	private String defaultbillto;

	/**
	 * 索赔位置
	 */
	@Column(name = "DefaultClaim")
	private String defaultclaim;

	/**
	 * 办公地址
	 */
	@Column(name = "OfficialLocation")
	private String officiallocation;

	/**
	 * 允限销类型
	 */
	@Column(name = "SaleType")
	private Integer saletype;

	/**
	 * 简称
	 */
	@Column(name = "ShortName")
	private String shortname;

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
	 * 挂起人
	 */
	@Column(name = "HoldUser")
	private String holduser;

	/**
	 * 解除人
	 */
	@Column(name = "ReleaseUser")
	private String releaseuser;

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
	 * 组织
	 */
	@Column(name = "Org")
	private String org;

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
	 * 立账条件
	 */
	@Column(name = "ARConfirmTerm")
	private String arconfirmterm;

	/**
	 * 预收款
	 */
	@Column(name = "IsPreReceival")
	private Integer isprereceival;

	/**
	 * 立账条件可改
	 */
	@Column(name = "IsARCfmModify")
	private Integer isarcfmmodify;

	/**
	 * 联系对象
	 */
	@Column(name = "DefaultContact")
	private String defaultcontact;

	/**
	 * 收款人
	 */
	@Column(name = "Payee")
	private String payee;

	/**
	 * 催款函格式
	 */
	@Column(name = "DundocFormat")
	private String dundocformat;

	/**
	 * 质保方式
	 */
	@Column(name = "QualityPledge")
	private Integer qualitypledge;

	/**
	 * 一次性客户
	 */
	@Column(name = "IsMISC")
	private Integer ismisc;

	/**
	 * 注册地址
	 */
	@Column(name = "RegisterLocation")
	private String registerlocation;

	/**
	 * 返利政策
	 */
	@Column(name = "ReturnBenefitRule")
	private String returnbenefitrule;

	/**
	 * 发票格式
	 */
	@Column(name = "BillFromat")
	private String billfromat;

	/**
	 * 订单格式
	 */
	@Column(name = "OrderFormat")
	private String orderformat;

	/**
	 * 地区
	 */
	@Column(name = "Territory")
	private String territory;

	/**
	 * 成交方式
	 */
	@Column(name = "Bargain")
	private Integer bargain;

	/**
	 * 当期收回率%
	 */
	@Column(name = "CurrentPercent")
	private Double currentpercent;

	/**
	 * 推迟一期天数
	 */
	@Column(name = "SuspendOneperiod")
	private Integer suspendoneperiod;

	/**
	 * 推迟一期收回率%
	 */
	@Column(name = "SuspendOnePercent")
	private Double suspendonepercent;

	/**
	 * 推迟二期天数
	 */
	@Column(name = "SuspendTwoperiod")
	private Integer suspendtwoperiod;

	/**
	 * 推迟二期收回率%
	 */
	@Column(name = "SuspendTwoPercent")
	private Double suspendtwopercent;

	/**
	 * 推迟三期天数
	 */
	@Column(name = "SuspendThreeperiod")
	private Integer suspendthreeperiod;

	/**
	 * 推迟三期收回率%
	 */
	@Column(name = "SuspendThreePercent")
	private Double suspendthreepercent;

	/**
	 * 对账单位置
	 */
	@Column(name = "DefaultContrast")
	private String defaultcontrast;

	/**
	 * 收款位置
	 */
	@Column(name = "DefaultGathering")
	private String defaultgathering;

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
	 * 信用控管范围
	 */
	@Column(name = "CreditCtrlScope")
	private Integer creditctrlscope;

	/**
	 * 出货条件
	 */
	@Column(name = "ShipmentTerms")
	private String shipmentterms;

	/**
	 * 出货条件编码
	 */
	@Column(name = "ShipmentTermsCode")
	private String shipmenttermscode;

	/**
	 * 出货条件名称
	 */
	@Column(name = "ShipmentTermsName")
	private String shipmenttermsname;

	/**
	 * 预收比例
	 */
	@Column(name = "PreRcvRate")
	private Double prercvrate;

	/**
	 * 预收比例可改
	 */
	@Column(name = "IsPreRcvRateModify")
	private Integer isprercvratemodify;

	/**
	 * 启用门户
	 */
	@Column(name = "IsUseAppPotal")
	private Integer isuseapppotal;

	/**
	 * 门户
	 */
	@Column(name = "AppPortal")
	private String appportal;

	/**
	 * 启用收款政策
	 */
	@Column(name = "UseGatheringPolicy")
	private Integer usegatheringpolicy;

	/**
	 * 信用政策
	 */
	@Column(name = "CreditPolicy")
	private String creditpolicy;

	/**
	 * 信用等级1
	 */
	@Column(name = "CreditLevel1")
	private String creditlevel1;

	/**
	 * 信用等级2
	 */
	@Column(name = "CreditLevel2")
	private String creditlevel2;

	/**
	 * 信用政策编码
	 */
	@Column(name = "CreditPolicyCode")
	private String creditpolicycode;

	/**
	 * 信用政策名称
	 */
	@Column(name = "CreditPolicyName")
	private String creditpolicyname;

	/**
	 * 信用等级1编码
	 */
	@Column(name = "CreditLevel1Code")
	private String creditlevel1code;

	/**
	 * 信用等级1名称
	 */
	@Column(name = "CreditLevel1Name")
	private String creditlevel1name;

	/**
	 * 信用等级2编码
	 */
	@Column(name = "CreditLevel2Code")
	private String creditlevel2code;

	/**
	 * 信用等级2名称
	 */
	@Column(name = "CreditLevel2Name")
	private String creditlevel2name;

	/**
	 * 信用控制点
	 */
	@Column(name = "ControlPoint")
	private Integer controlpoint;

	/**
	 * 同等级
	 */
	@Column(name = "ControlPDiff")
	private Integer controlpdiff;

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
	 * 返还互用组
	 */
	@Column(name = "ShareGroup")
	private String sharegroup;

	/**
	 * 佣金方式
	 */
	@Column(name = "CommissionType")
	private Integer commissiontype;

	/**
	 * 佣金币种
	 */
	@Column(name = "CommissionCurrency")
	private String commissioncurrency;

	/**
	 * 佣金金额
	 */
	@Column(name = "Commission")
	private Double commission;

	/**
	 * 佣金比例
	 */
	@Column(name = "CommissionRate")
	private Double commissionrate;

	/**
	 * 来自CRM
	 */
	@Column(name = "IsFromCRM")
	private Integer isfromcrm;

	/**
	 * 必须有合同
	 */
	@Column(name = "IsHaveContract")
	private Integer ishavecontract;

	/**
	 * 默认计划模板
	 */
	@Column(name = "PortalDefaultPlanTemplet")
	private String portaldefaultplantemplet;

	/**
	 * 默认计划模板编码
	 */
	@Column(name = "PortalDefaultPlanTempletCode")
	private String portaldefaultplantempletcode;

	/**
	 * 供应来源
	 */
	@Column(name = "SupplySource")
	private Integer supplysource;

	/**
	 * 供应类型
	 */
	@Column(name = "DemandTransType")
	private Integer demandtranstype;

	/**
	 * 供应组织
	 */
	@Column(name = "SupplyOrg")
	private String supplyorg;

	/**
	 * 存储地点
	 */
	@Column(name = "WH")
	private String wh;

	/**
	 * 供应商
	 */
	@Column(name = "Supplier")
	private String supplier;

	/**
	 * 收款力度政策
	 */
	@Column(name = "GatheringPolicy")
	private String gatheringpolicy;

	/**
	 * 逾期收款力度政策
	 */
	@Column(name = "DelayGatheringPolicy")
	private String delaygatheringpolicy;

	/**
	 * 是否作废
	 */
	@Column(name = "dr")
	private Integer dr;
	
	@Column(name = "ts")
	private String ts;
	
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

	public String getCustomercategory() {
		return customercategory;
	}

	public void setCustomercategory(String customercategory) {
		this.customercategory = customercategory;
	}

	public String getSearchcode() {
		return searchcode;
	}

	public void setSearchcode(String searchcode) {
		this.searchcode = searchcode;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSaleser() {
		return saleser;
	}

	public void setSaleser(String saleser) {
		this.saleser = saleser;
	}

	public Integer getTradecategory() {
		return tradecategory;
	}

	public void setTradecategory(Integer tradecategory) {
		this.tradecategory = tradecategory;
	}

	public Double getRegistercapital() {
		return registercapital;
	}

	public void setRegistercapital(Double registercapital) {
		this.registercapital = registercapital;
	}

	public Double getTurnover() {
		return turnover;
	}

	public void setTurnover(Double turnover) {
		this.turnover = turnover;
	}

	public Integer getEmployeecount() {
		return employeecount;
	}

	public void setEmployeecount(Integer employeecount) {
		this.employeecount = employeecount;
	}

	public String getEstablishdate() {
		return establishdate;
	}

	public void setEstablishdate(String establishdate) {
		this.establishdate = establishdate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPaycurrency() {
		return paycurrency;
	}

	public void setPaycurrency(String paycurrency) {
		this.paycurrency = paycurrency;
	}

	public String getTradecurrency() {
		return tradecurrency;
	}

	public void setTradecurrency(String tradecurrency) {
		this.tradecurrency = tradecurrency;
	}

	public Integer getIsdeposit() {
		return isdeposit;
	}

	public void setIsdeposit(Integer isdeposit) {
		this.isdeposit = isdeposit;
	}

	public String getRecervalterm() {
		return recervalterm;
	}

	public void setRecervalterm(String recervalterm) {
		this.recervalterm = recervalterm;
	}

	public Integer getIsrectermmodify() {
		return isrectermmodify;
	}

	public void setIsrectermmodify(Integer isrectermmodify) {
		this.isrectermmodify = isrectermmodify;
	}

	public Integer getIssalesdiscount() {
		return issalesdiscount;
	}

	public void setIssalesdiscount(Integer issalesdiscount) {
		this.issalesdiscount = issalesdiscount;
	}

	public Integer getTransitleadtime() {
		return transitleadtime;
	}

	public void setTransitleadtime(Integer transitleadtime) {
		this.transitleadtime = transitleadtime;
	}

	public String getShippmentrule() {
		return shippmentrule;
	}

	public void setShippmentrule(String shippmentrule) {
		this.shippmentrule = shippmentrule;
	}

	public Integer getIsshipmentmodify() {
		return isshipmentmodify;
	}

	public void setIsshipmentmodify(Integer isshipmentmodify) {
		this.isshipmentmodify = isshipmentmodify;
	}

	public String getReturnterm() {
		return returnterm;
	}

	public void setReturnterm(String returnterm) {
		this.returnterm = returnterm;
	}

	public Integer getIspricelistmodify() {
		return ispricelistmodify;
	}

	public void setIspricelistmodify(Integer ispricelistmodify) {
		this.ispricelistmodify = ispricelistmodify;
	}

	public String getStatetaxno() {
		return statetaxno;
	}

	public void setStatetaxno(String statetaxno) {
		this.statetaxno = statetaxno;
	}

	public String getTaxschedule() {
		return taxschedule;
	}

	public void setTaxschedule(String taxschedule) {
		this.taxschedule = taxschedule;
	}

	public String getDistricttaxno() {
		return districttaxno;
	}

	public void setDistricttaxno(String districttaxno) {
		this.districttaxno = districttaxno;
	}

	public Integer getIscreditcheck() {
		return iscreditcheck;
	}

	public void setIscreditcheck(Integer iscreditcheck) {
		this.iscreditcheck = iscreditcheck;
	}

	public Integer getIspost() {
		return ispost;
	}

	public void setIspost(Integer ispost) {
		this.ispost = ispost;
	}

	public Integer getCheckaccountperiod() {
		return checkaccountperiod;
	}

	public void setCheckaccountperiod(Integer checkaccountperiod) {
		this.checkaccountperiod = checkaccountperiod;
	}

	public String getAccountlistformat() {
		return accountlistformat;
	}

	public void setAccountlistformat(String accountlistformat) {
		this.accountlistformat = accountlistformat;
	}

	public String getLastprintdate() {
		return lastprintdate;
	}

	public void setLastprintdate(String lastprintdate) {
		this.lastprintdate = lastprintdate;
	}

	public String getNextprintdate() {
		return nextprintdate;
	}

	public void setNextprintdate(String nextprintdate) {
		this.nextprintdate = nextprintdate;
	}

	public Integer getIsbillbybalance() {
		return isbillbybalance;
	}

	public void setIsbillbybalance(Integer isbillbybalance) {
		this.isbillbybalance = isbillbybalance;
	}

	public Integer getInvoiceverificationorder() {
		return invoiceverificationorder;
	}

	public void setInvoiceverificationorder(Integer invoiceverificationorder) {
		this.invoiceverificationorder = invoiceverificationorder;
	}

	public Integer getVerificationmode() {
		return verificationmode;
	}

	public void setVerificationmode(Integer verificationmode) {
		this.verificationmode = verificationmode;
	}

	public Integer getIscharge() {
		return ischarge;
	}

	public void setIscharge(Integer ischarge) {
		this.ischarge = ischarge;
	}

	public Integer getIsbyaccountage() {
		return isbyaccountage;
	}

	public void setIsbyaccountage(Integer isbyaccountage) {
		this.isbyaccountage = isbyaccountage;
	}

	public Integer getIssuspendaccrual() {
		return issuspendaccrual;
	}

	public void setIssuspendaccrual(Integer issuspendaccrual) {
		this.issuspendaccrual = issuspendaccrual;
	}

	public Integer getIsaccrualtoar() {
		return isaccrualtoar;
	}

	public void setIsaccrualtoar(Integer isaccrualtoar) {
		this.isaccrualtoar = isaccrualtoar;
	}

	public Integer getIsdelay() {
		return isdelay;
	}

	public void setIsdelay(Integer isdelay) {
		this.isdelay = isdelay;
	}

	public Integer getIscompound() {
		return iscompound;
	}

	public void setIscompound(Integer iscompound) {
		this.iscompound = iscompound;
	}

	public Integer getExtendlimitdays() {
		return extendlimitdays;
	}

	public void setExtendlimitdays(Integer extendlimitdays) {
		this.extendlimitdays = extendlimitdays;
	}

	public Integer getInterestperiod() {
		return interestperiod;
	}

	public void setInterestperiod(Integer interestperiod) {
		this.interestperiod = interestperiod;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
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

	public String getOfficiallocation() {
		return officiallocation;
	}

	public void setOfficiallocation(String officiallocation) {
		this.officiallocation = officiallocation;
	}

	public Integer getSaletype() {
		return saletype;
	}

	public void setSaletype(Integer saletype) {
		this.saletype = saletype;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
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

	public String getHolduser() {
		return holduser;
	}

	public void setHolduser(String holduser) {
		this.holduser = holduser;
	}

	public String getReleaseuser() {
		return releaseuser;
	}

	public void setReleaseuser(String releaseuser) {
		this.releaseuser = releaseuser;
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

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
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

	public String getArconfirmterm() {
		return arconfirmterm;
	}

	public void setArconfirmterm(String arconfirmterm) {
		this.arconfirmterm = arconfirmterm;
	}

	public Integer getIsprereceival() {
		return isprereceival;
	}

	public void setIsprereceival(Integer isprereceival) {
		this.isprereceival = isprereceival;
	}

	public Integer getIsarcfmmodify() {
		return isarcfmmodify;
	}

	public void setIsarcfmmodify(Integer isarcfmmodify) {
		this.isarcfmmodify = isarcfmmodify;
	}

	public String getDefaultcontact() {
		return defaultcontact;
	}

	public void setDefaultcontact(String defaultcontact) {
		this.defaultcontact = defaultcontact;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getDundocformat() {
		return dundocformat;
	}

	public void setDundocformat(String dundocformat) {
		this.dundocformat = dundocformat;
	}

	public Integer getQualitypledge() {
		return qualitypledge;
	}

	public void setQualitypledge(Integer qualitypledge) {
		this.qualitypledge = qualitypledge;
	}

	public Integer getIsmisc() {
		return ismisc;
	}

	public void setIsmisc(Integer ismisc) {
		this.ismisc = ismisc;
	}

	public String getRegisterlocation() {
		return registerlocation;
	}

	public void setRegisterlocation(String registerlocation) {
		this.registerlocation = registerlocation;
	}

	public String getReturnbenefitrule() {
		return returnbenefitrule;
	}

	public void setReturnbenefitrule(String returnbenefitrule) {
		this.returnbenefitrule = returnbenefitrule;
	}

	public String getBillfromat() {
		return billfromat;
	}

	public void setBillfromat(String billfromat) {
		this.billfromat = billfromat;
	}

	public String getOrderformat() {
		return orderformat;
	}

	public void setOrderformat(String orderformat) {
		this.orderformat = orderformat;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public Integer getBargain() {
		return bargain;
	}

	public void setBargain(Integer bargain) {
		this.bargain = bargain;
	}

	public Double getCurrentpercent() {
		return currentpercent;
	}

	public void setCurrentpercent(Double currentpercent) {
		this.currentpercent = currentpercent;
	}

	public Integer getSuspendoneperiod() {
		return suspendoneperiod;
	}

	public void setSuspendoneperiod(Integer suspendoneperiod) {
		this.suspendoneperiod = suspendoneperiod;
	}

	public Double getSuspendonepercent() {
		return suspendonepercent;
	}

	public void setSuspendonepercent(Double suspendonepercent) {
		this.suspendonepercent = suspendonepercent;
	}

	public Integer getSuspendtwoperiod() {
		return suspendtwoperiod;
	}

	public void setSuspendtwoperiod(Integer suspendtwoperiod) {
		this.suspendtwoperiod = suspendtwoperiod;
	}

	public Double getSuspendtwopercent() {
		return suspendtwopercent;
	}

	public void setSuspendtwopercent(Double suspendtwopercent) {
		this.suspendtwopercent = suspendtwopercent;
	}

	public Integer getSuspendthreeperiod() {
		return suspendthreeperiod;
	}

	public void setSuspendthreeperiod(Integer suspendthreeperiod) {
		this.suspendthreeperiod = suspendthreeperiod;
	}

	public Double getSuspendthreepercent() {
		return suspendthreepercent;
	}

	public void setSuspendthreepercent(Double suspendthreepercent) {
		this.suspendthreepercent = suspendthreepercent;
	}

	public String getDefaultcontrast() {
		return defaultcontrast;
	}

	public void setDefaultcontrast(String defaultcontrast) {
		this.defaultcontrast = defaultcontrast;
	}

	public String getDefaultgathering() {
		return defaultgathering;
	}

	public void setDefaultgathering(String defaultgathering) {
		this.defaultgathering = defaultgathering;
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

	public Integer getCreditctrlscope() {
		return creditctrlscope;
	}

	public void setCreditctrlscope(Integer creditctrlscope) {
		this.creditctrlscope = creditctrlscope;
	}

	public String getShipmentterms() {
		return shipmentterms;
	}

	public void setShipmentterms(String shipmentterms) {
		this.shipmentterms = shipmentterms;
	}

	public String getShipmenttermscode() {
		return shipmenttermscode;
	}

	public void setShipmenttermscode(String shipmenttermscode) {
		this.shipmenttermscode = shipmenttermscode;
	}

	public String getShipmenttermsname() {
		return shipmenttermsname;
	}

	public void setShipmenttermsname(String shipmenttermsname) {
		this.shipmenttermsname = shipmenttermsname;
	}

	public Double getPrercvrate() {
		return prercvrate;
	}

	public void setPrercvrate(Double prercvrate) {
		this.prercvrate = prercvrate;
	}

	public Integer getIsprercvratemodify() {
		return isprercvratemodify;
	}

	public void setIsprercvratemodify(Integer isprercvratemodify) {
		this.isprercvratemodify = isprercvratemodify;
	}

	public Integer getIsuseapppotal() {
		return isuseapppotal;
	}

	public void setIsuseapppotal(Integer isuseapppotal) {
		this.isuseapppotal = isuseapppotal;
	}

	public String getAppportal() {
		return appportal;
	}

	public void setAppportal(String appportal) {
		this.appportal = appportal;
	}

	public Integer getUsegatheringpolicy() {
		return usegatheringpolicy;
	}

	public void setUsegatheringpolicy(Integer usegatheringpolicy) {
		this.usegatheringpolicy = usegatheringpolicy;
	}

	public String getCreditpolicy() {
		return creditpolicy;
	}

	public void setCreditpolicy(String creditpolicy) {
		this.creditpolicy = creditpolicy;
	}

	public String getCreditlevel1() {
		return creditlevel1;
	}

	public void setCreditlevel1(String creditlevel1) {
		this.creditlevel1 = creditlevel1;
	}

	public String getCreditlevel2() {
		return creditlevel2;
	}

	public void setCreditlevel2(String creditlevel2) {
		this.creditlevel2 = creditlevel2;
	}

	public String getCreditpolicycode() {
		return creditpolicycode;
	}

	public void setCreditpolicycode(String creditpolicycode) {
		this.creditpolicycode = creditpolicycode;
	}

	public String getCreditpolicyname() {
		return creditpolicyname;
	}

	public void setCreditpolicyname(String creditpolicyname) {
		this.creditpolicyname = creditpolicyname;
	}

	public String getCreditlevel1code() {
		return creditlevel1code;
	}

	public void setCreditlevel1code(String creditlevel1code) {
		this.creditlevel1code = creditlevel1code;
	}

	public String getCreditlevel1name() {
		return creditlevel1name;
	}

	public void setCreditlevel1name(String creditlevel1name) {
		this.creditlevel1name = creditlevel1name;
	}

	public String getCreditlevel2code() {
		return creditlevel2code;
	}

	public void setCreditlevel2code(String creditlevel2code) {
		this.creditlevel2code = creditlevel2code;
	}

	public String getCreditlevel2name() {
		return creditlevel2name;
	}

	public void setCreditlevel2name(String creditlevel2name) {
		this.creditlevel2name = creditlevel2name;
	}

	public Integer getControlpoint() {
		return controlpoint;
	}

	public void setControlpoint(Integer controlpoint) {
		this.controlpoint = controlpoint;
	}

	public Integer getControlpdiff() {
		return controlpdiff;
	}

	public void setControlpdiff(Integer controlpdiff) {
		this.controlpdiff = controlpdiff;
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

	public String getSharegroup() {
		return sharegroup;
	}

	public void setSharegroup(String sharegroup) {
		this.sharegroup = sharegroup;
	}

	public Integer getCommissiontype() {
		return commissiontype;
	}

	public void setCommissiontype(Integer commissiontype) {
		this.commissiontype = commissiontype;
	}

	public String getCommissioncurrency() {
		return commissioncurrency;
	}

	public void setCommissioncurrency(String commissioncurrency) {
		this.commissioncurrency = commissioncurrency;
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	public Double getCommissionrate() {
		return commissionrate;
	}

	public void setCommissionrate(Double commissionrate) {
		this.commissionrate = commissionrate;
	}

	public Integer getIsfromcrm() {
		return isfromcrm;
	}

	public void setIsfromcrm(Integer isfromcrm) {
		this.isfromcrm = isfromcrm;
	}

	public Integer getIshavecontract() {
		return ishavecontract;
	}

	public void setIshavecontract(Integer ishavecontract) {
		this.ishavecontract = ishavecontract;
	}

	public String getPortaldefaultplantemplet() {
		return portaldefaultplantemplet;
	}

	public void setPortaldefaultplantemplet(String portaldefaultplantemplet) {
		this.portaldefaultplantemplet = portaldefaultplantemplet;
	}

	public String getPortaldefaultplantempletcode() {
		return portaldefaultplantempletcode;
	}

	public void setPortaldefaultplantempletcode(String portaldefaultplantempletcode) {
		this.portaldefaultplantempletcode = portaldefaultplantempletcode;
	}

	public Integer getSupplysource() {
		return supplysource;
	}

	public void setSupplysource(Integer supplysource) {
		this.supplysource = supplysource;
	}

	public Integer getDemandtranstype() {
		return demandtranstype;
	}

	public void setDemandtranstype(Integer demandtranstype) {
		this.demandtranstype = demandtranstype;
	}

	public String getSupplyorg() {
		return supplyorg;
	}

	public void setSupplyorg(String supplyorg) {
		this.supplyorg = supplyorg;
	}

	public String getWh() {
		return wh;
	}

	public void setWh(String wh) {
		this.wh = wh;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getGatheringpolicy() {
		return gatheringpolicy;
	}

	public void setGatheringpolicy(String gatheringpolicy) {
		this.gatheringpolicy = gatheringpolicy;
	}

	public String getDelaygatheringpolicy() {
		return delaygatheringpolicy;
	}

	public void setDelaygatheringpolicy(String delaygatheringpolicy) {
		this.delaygatheringpolicy = delaygatheringpolicy;
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

}