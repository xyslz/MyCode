package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.CustomerState;
import com.caijai.base.sysenum.Sort;
import com.caijai.base.sysenum.U9STATE;

/**
 * 客户位置
 * @author CY
 *
 */
@Table(name="BD_CustomerSite")
public class CustomerSite extends BaseTable{

	private static final long serialVersionUID = 1528736299078614682L;
	
	/**
	 * 主键
	 */
	@Column(name = "ID", primary = true)
	private String id;

	/**
	 * 客户
	 */
	@Column(name = "customer")
	private String customer;
	
	@Column(name = "customerName",readonly = true)
	@Relation(table = "BD_Customer", value = "id",ref = "customer", show = "name")
	private String customerName;
	
	@Column(name = "customerCode",readonly = true)
	@Relation(table = "BD_Customer", value = "id",ref = "customer", show = "code")
	private String customerCode;

	/**
	 * 位置编码
	 */
	@Column(name = "code",sort = Sort.ASC)
	private String code;
	
	/**
	 * 位置编码
	 */
	@Column(name = "name")
	private String name;
	
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
	 * 收货位置
	 */
	@Column(name = "isShipTo")
	private Integer isShipTo;		

	/**
	 * 收货位置失效日期
	 */
	@Column(name = "shiptoDisableDate")
	private String shiptoDisableDate;	
	
	/**
	 * 开票位置
	 */
	@Column(name = "isBillTo")
	private Integer isBillTo;		

	/**
	 * 开票位置失效日期
	 */
	@Column(name = "billToDisableDate")
	private String billToDisableDate;		
	
	/**
	 * 付款位置
	 */
	@Column(name = "isPayment")
	private Integer isPayment;		

	/**
	 * 付款位置失效日期
	 */
	@Column(name = "paymentDisableDate")
	private String paymentDisableDate;		
	
	/**
	 * 索赔位置
	 */
	@Column(name = "isClaim")
	private Integer isClaim;		

	/**
	 * 索赔位置失效日期
	 */
	@Column(name = "claimDisableDate")
	private String claimDisableDate;		

	/**
	 * 对账单位置
	 */
	@Column(name = "isContrast")
	private Integer isContrast;		

	/**
	 * 失效日期
	 */
	@Column(name = "contrastDisableDate")
	private String contrastDisableDate;		

	/**
	 * 办公地址失效日期
	 */
	@Column(name = "officeDisableDate")
	private String officeDisableDate;		

	/**
	 * 注册地址失效日期
	 */
	@Column(name = "registerDisableDate")
	private String registerDisableDate;		

	/**
	 * 搜索码
	 */
	@Column(name = "searchCode")
	private String searchCode;		

	/**
	 * 地区
	 */
	@Column(name = "territory")
	private String territory;		
	
	@Column(name = "territoryName",readonly = true)
	@Relation(table = "BD_territory", value = "id",ref = "territory", show = "name")
	private String territoryName;

	/**
	 * 语言
	 */
	@Column(name = "language")
	private String language;		

	/**
	 * 发票位置
	 */
	@Column(name = "billToSite")
	private String billToSite;		

	/**
	 * 税组合
	 */
	@Column(name = "taxSchedule")
	private String taxSchedule;		

	/**
	 * 交易币种
	 */
	@Column(name = "tradeCurrency")
	private String tradeCurrency;		

	/**
	 * 收款币种
	 */
	@Column(name = "paymentCurrency")
	private String paymentCurrency;		

	/**
	 * 缴纳保证金
	 */
	@Column(name = "needDeposit")
	private Integer needDeposit;		

	/**
	 * 收款条件
	 */
	@Column(name = "paymentTerm")
	private String paymentTerm;		

	/**
	 * 收款条件可改
	 */
	@Column(name = "isPaymentTermEditable")
	private Integer isPaymentTermEditable;		

	/**
	 * 享受折扣
	 */
	@Column(name = "isSalesDiscount")
	private Integer isSalesDiscount;		

	/**
	 * 收款人
	 */
	@Column(name = "payee")
	private String payee;		

	/**
	 * 出货原则
	 */
	@Column(name = "shippmentRule")
	private String shippmentRule;		

	/**
	 * 出货原则可改
	 */
	@Column(name = "isShippmentRuleEditable")
	private Integer isShippmentRuleEditable;		

	/**
	 * 出货方式
	 */
	@Column(name = "shipmentMode")
	private Integer shipmentMode;

	/**
	 * 运输方式
	 */
	@Column(name = "transitMode")
	private String transitMode;		

	/**
	 * 运输提前期
	 */
	@Column(name = "transitLeadTime")
	private Integer transitLeadTime;

	/**
	 * 价目表可改
	 */
	@Column(name = "isPriceListModify")
	private Integer isPriceListModify;		

	/**
	 * 国税号
	 */
	@Column(name = "stateTaxNo")
	private String stateTaxNo;		

	/**
	 * 地税号
	 */
	@Column(name = "districtTaxNo")
	private String districtTaxNo;		

	/**
	 * 邮寄对账单
	 */
	@Column(name = "isPostBankCheckList")
	private Integer isPostBankCheckList;		

	/**
	 * 对账期间
	 */
	@Column(name = "bankCheckPeriod")
	private Integer bankCheckPeriod;

	/**
	 * 最近打印日
	 */
	@Column(name = "latelyPrintDate")
	private String latelyPrintDate;		

	/**
	 * 下次打印日
	 */
	@Column(name = "nextPrintDate")
	private String nextPrintDate;		

	/**
	 * 客户状况
	 */
	@Column(name = "customerState")
	private CustomerState customerState;

	/**
	 * 对账单格式
	 */
	@Column(name = "bankStatementFormat")
	private String bankStatementFormat;		

	/**
	 * 联系对象
	 */
	@Column(name = "defaultContact")
	private String defaultContact;		

	/**
	 * 预收款
	 */
	@Column(name = "isPrePayment")
	private Integer isPrePayment;		

	/**
	 * 催款函格式
	 */
	@Column(name = "pressPaymentStyle")
	private String pressPaymentStyle;		

	/**
	 * 质保方式
	 */
	@Column(name = "qualityGuaranteeType")
	private Integer qualityGuaranteeType;

	/**
	 * 默认收货位置
	 */
	@Column(name = "isDefaultShipTo")
	private Integer isDefaultShipTo;		

	/**
	 * 默认开票位置
	 */
	@Column(name = "isDefaultBillTo")
	private Integer isDefaultBillTo;		

	/**
	 * 默认付款位置
	 */
	@Column(name = "isDefaultPayment")
	private Integer isDefaultPayment;		

	/**
	 * 默认对账单位置
	 */
	@Column(name = "isDefaultContrast")
	private Integer isDefaultContrast;		

	/**
	 * 默认索赔位置
	 */
	@Column(name = "isDefaultClaim")
	private Integer isDefaultClaim;		

	/**
	 * 办公地址
	 */
	@Column(name = "officeSite")
	private String officeSite;		

	/**
	 * 注册地址
	 */
	@Column(name = "registerAddress")
	private String registerAddress;		

	/**
	 * 发票格式
	 */
	@Column(name = "businessBillStyle")
	private String businessBillStyle;		

	/**
	 * 订单格式
	 */
	@Column(name = "saleOrderStyle")
	private String saleOrderStyle;		

	/**
	 * 挂起原因
	 */
	@Column(name = "holdReason")
	private String holdReason;		

	/**
	 * 解除原因
	 */
	@Column(name = "releaseReason")
	private String releaseReason;		
	
	/**
	 * 挂起人
	 */
	@Column(name = "holdUser")
	private String holdUser;		
	
	/**
	 * 解除人
	 */
	@Column(name = "releaseUser")
	private String releaseUser;		
	
	/**
	 * 挂起日期
	 */
	@Column(name = "holdDate")
	private String holdDate;		
	
	/**
	 * 解除日期
	 */
	@Column(name = "releaseDate")
	private String releaseDate;		

	//TODO 数据库类型bit-->int
	@Column(name = "effective_IsEffective")
	private U9STATE isEffective;		

	@Column(name = "effective_EffectiveDate")
	private String effectiveDate;		

	@Column(name = "effective_DisableDate")
	private String disableDate;		

	/**
	 * 挂起
	 */
	@Column(name = "isHoldRelease")
	private Integer isHoldRelease;				

	/**
	 * 价目表
	 */
	@Column(name = "priceListID")
	private String priceListID;		

	/**
	 * 核销顺序
	 */
	@Column(name = "invoiceVerificationOrder")
	private Integer invoiceVerificationOrder;	

	/**
	 * 核销明细
	 */
	@Column(name = "verificationMode")
	private Integer verificationMode;

	/**
	 * 价目表编码
	 */
	@Column(name = "priceListCode")
	private String priceListCode;		

	/**
	 * 价目表名称
	 */
	@Column(name = "priceListName")
	private String priceListName;		

	/**
	 * 默认联系人
	 */
	@Column(name = "defaultContactPsn")
	private String defaultContactPsn;		

	/**
	 * 默认银行账号
	 */
	@Column(name = "defaultBankAccount")
	private String defaultBankAccount;		

	/**
	 * 信用政策
	 */
	@Column(name = "creditPolicy")
	private String creditPolicy;		

	/**
	 * 信用政策编码
	 */
	@Column(name = "creditPolicyCode")
	private String creditPolicyCode;		

	/**
	 * 信用政策名称
	 */
	@Column(name = "creditPolicyName")
	private String creditPolicyName;		

	/**
	 * 信用等级1
	 */
	@Column(name = "creditLevel1")
	private String creditLevel1;		

	/**
	 * 信用等级1编码
	 */
	@Column(name = "creditLevel1Code")
	private String creditLevel1Code;		

	/**
	 * 信用等级1名称
	 */
	@Column(name = "creditLevel1Name")
	private String creditLevel1Name;		

	/**
	 * 信用等级2
	 */
	@Column(name = "creditLevel2")
	private String creditLevel2;		

	/**
	 * 信用等级2编码
	 */
	@Column(name = "creditLevel2Code")
	private String creditLevel2Code;		

	/**
	 * 信用等级2名称
	 */
	@Column(name = "creditLevel2Name")
	private String creditLevel2Name;		

	/**
	 * 信用控制点
	 */
	@Column(name = "controlPoint")
	private Integer controlPoint;	

	/**
	 * 同等级
	 */
	@Column(name = "controlPDiff")
	private String controlPDiff;		

	/**
	 * 承运商
	 */
	@Column(name = "carrier")
	private String carrier;		

	/**
	 * 立账条件
	 */
	@Column(name = "arConfirmTerm")
	private String arConfirmTerm;		

	/**
	 * 来源行ID
	 */
	@Column(name = "srcRowID")
	private String srcRowID;		

	/**
	 * 装运港
	 */
	@Column(name = "shippingHavenID")
	private String shippingHavenID;		

	/**
	 * 装运港编码
	 */
	@Column(name = "shippingHavenCode")
	private String shippingHavenCode;		

	/**
	 * 装运港名称
	 */
	@Column(name = "shippingHavenName")
	private String shippingHavenName;		

	/**
	 * 目的港
	 */
	@Column(name = "targetHavenID")
	private String targetHavenID;		

	/**
	 * 目的港编码
	 */
	@Column(name = "targetHavenCode")
	private String targetHavenCode;		

	/**
	 * 目的港名称
	 */
	@Column(name = "targetHavenName")
	private String targetHavenName;		

	@Column(name = "descFlexField_PubDescSeg1")
	private String descFlexField_PubDescSeg1;		

	@Column(name = "descFlexField_PubDescSeg2")
	private String descFlexField_PubDescSeg2;		

	@Column(name = "descFlexField_PubDescSeg3")
	private String descFlexField_PubDescSeg3;		

	@Column(name = "descFlexField_PubDescSeg4")
	private String descFlexField_PubDescSeg4;		

	@Column(name = "descFlexField_PubDescSeg5")
	private String descFlexField_PubDescSeg5;		

	@Column(name = "descFlexField_PubDescSeg6")
	private String descFlexField_PubDescSeg6;		

	@Column(name = "descFlexField_PubDescSeg7")
	private String descFlexField_PubDescSeg7;		

	@Column(name = "descFlexField_PubDescSeg8")
	private String descFlexField_PubDescSeg8;		

	@Column(name = "descFlexField_PubDescSeg9")
	private String descFlexField_PubDescSeg9;		

	@Column(name = "descFlexField_PubDescSeg10")
	private String descFlexField_PubDescSeg10;		

	@Column(name = "descFlexField_PubDescSeg11")
	private String descFlexField_PubDescSeg11;		

	@Column(name = "descFlexField_PubDescSeg12")
	private String descFlexField_PubDescSeg12;		

	@Column(name = "descFlexField_PubDescSeg13")
	private String descFlexField_PubDescSeg13;		

	@Column(name = "descFlexField_PubDescSeg14")
	private String descFlexField_PubDescSeg14;		

	@Column(name = "descFlexField_PubDescSeg15")
	private String descFlexField_PubDescSeg15;		

	@Column(name = "descFlexField_PubDescSeg16")
	private String descFlexField_PubDescSeg16;		

	@Column(name = "descFlexField_PubDescSeg17")
	private String descFlexField_PubDescSeg17;		

	@Column(name = "descFlexField_PubDescSeg18")
	private String descFlexField_PubDescSeg18;		

	@Column(name = "descFlexField_PubDescSeg19")
	private String descFlexField_PubDescSeg19;		

	@Column(name = "descFlexField_PubDescSeg20")
	private String descFlexField_PubDescSeg20;		

	@Column(name = "descFlexField_PubDescSeg21")
	private String descFlexField_PubDescSeg21;		

	@Column(name = "descFlexField_PubDescSeg22")
	private String descFlexField_PubDescSeg22;		

	@Column(name = "descFlexField_PubDescSeg23")
	private String descFlexField_PubDescSeg23;		

	@Column(name = "descFlexField_PubDescSeg24")
	private String descFlexField_PubDescSeg24;		

	@Column(name = "descFlexField_PubDescSeg25")
	private String descFlexField_PubDescSeg25;		

	@Column(name = "descFlexField_PubDescSeg26")
	private String descFlexField_PubDescSeg26;		

	@Column(name = "descFlexField_PubDescSeg27")
	private String descFlexField_PubDescSeg27;		

	@Column(name = "descFlexField_PubDescSeg28")
	private String descFlexField_PubDescSeg28;		

	@Column(name = "descFlexField_PubDescSeg29")
	private String descFlexField_PubDescSeg29;		

	@Column(name = "descFlexField_PubDescSeg30")
	private String descFlexField_PubDescSeg30;		

	@Column(name = "descFlexField_PubDescSeg31")
	private String descFlexField_PubDescSeg31;		

	@Column(name = "descFlexField_PubDescSeg32")
	private String descFlexField_PubDescSeg32;		

	@Column(name = "descFlexField_PubDescSeg33")
	private String descFlexField_PubDescSeg33;		

	@Column(name = "descFlexField_PubDescSeg34")
	private String descFlexField_PubDescSeg34;		

	@Column(name = "descFlexField_PubDescSeg35")
	private String descFlexField_PubDescSeg35;		

	@Column(name = "descFlexField_PubDescSeg36")
	private String descFlexField_PubDescSeg36;		

	@Column(name = "descFlexField_PubDescSeg37")
	private String descFlexField_PubDescSeg37;		

	@Column(name = "descFlexField_PubDescSeg38")
	private String descFlexField_PubDescSeg38;		

	@Column(name = "descFlexField_PubDescSeg39")
	private String descFlexField_PubDescSeg39;		

	@Column(name = "descFlexField_PubDescSeg40")
	private String descFlexField_PubDescSeg40;		

	@Column(name = "descFlexField_PubDescSeg41")
	private String descFlexField_PubDescSeg41;		

	@Column(name = "descFlexField_PubDescSeg42")
	private String descFlexField_PubDescSeg42;		

	@Column(name = "descFlexField_PubDescSeg43")
	private String descFlexField_PubDescSeg43;		

	@Column(name = "descFlexField_PubDescSeg44")
	private String descFlexField_PubDescSeg44;		

	@Column(name = "descFlexField_PubDescSeg45")
	private String descFlexField_PubDescSeg45;		

	@Column(name = "descFlexField_PubDescSeg46")
	private String descFlexField_PubDescSeg46;		

	@Column(name = "descFlexField_PubDescSeg47")
	private String descFlexField_PubDescSeg47;		

	@Column(name = "descFlexField_PubDescSeg48")
	private String descFlexField_PubDescSeg48;		

	@Column(name = "descFlexField_PubDescSeg49")
	private String descFlexField_PubDescSeg49;		

	@Column(name = "descFlexField_PubDescSeg50")
	private String descFlexField_PubDescSeg50;		

	@Column(name = "descFlexField_ContextValue")
	private String descFlexField_ContextValue;		

	@Column(name = "descFlexField_PrivateDescSeg1")
	private String descFlexField_PrivateDescSeg1;		

	@Column(name = "descFlexField_PrivateDescSeg2")
	private String descFlexField_PrivateDescSeg2;		

	@Column(name = "descFlexField_PrivateDescSeg3")
	private String descFlexField_PrivateDescSeg3;		

	@Column(name = "descFlexField_PrivateDescSeg4")
	private String descFlexField_PrivateDescSeg4;		

	@Column(name = "descFlexField_PrivateDescSeg5")
	private String descFlexField_PrivateDescSeg5;		

	@Column(name = "descFlexField_PrivateDescSeg6")
	private String descFlexField_PrivateDescSeg6;		

	@Column(name = "descFlexField_PrivateDescSeg7")
	private String descFlexField_PrivateDescSeg7;		

	@Column(name = "descFlexField_PrivateDescSeg8")
	private String descFlexField_PrivateDescSeg8;		

	@Column(name = "descFlexField_PrivateDescSeg9")
	private String descFlexField_PrivateDescSeg9;		

	@Column(name = "descFlexField_PrivateDescSeg10")
	private String descFlexField_PrivateDescSeg10;		

	@Column(name = "descFlexField_PrivateDescSeg11")
	private String descFlexField_PrivateDescSeg11;		

	@Column(name = "descFlexField_PrivateDescSeg12")
	private String descFlexField_PrivateDescSeg12;		

	@Column(name = "descFlexField_PrivateDescSeg13")
	private String descFlexField_PrivateDescSeg13;		

	@Column(name = "descFlexField_PrivateDescSeg14")
	private String descFlexField_PrivateDescSeg14;		

	@Column(name = "descFlexField_PrivateDescSeg15")
	private String descFlexField_PrivateDescSeg15;		

	@Column(name = "descFlexField_PrivateDescSeg16")
	private String descFlexField_PrivateDescSeg16;		

	@Column(name = "descFlexField_PrivateDescSeg17")
	private String descFlexField_PrivateDescSeg17;		

	@Column(name = "descFlexField_PrivateDescSeg18")
	private String descFlexField_PrivateDescSeg18;		

	@Column(name = "descFlexField_PrivateDescSeg19")
	private String descFlexField_PrivateDescSeg19;		

	@Column(name = "descFlexField_PrivateDescSeg20")
	private String descFlexField_PrivateDescSeg20;		

	@Column(name = "descFlexField_PrivateDescSeg21")
	private String descFlexField_PrivateDescSeg21;		

	@Column(name = "descFlexField_PrivateDescSeg22")
	private String descFlexField_PrivateDescSeg22;		

	@Column(name = "descFlexField_PrivateDescSeg23")
	private String descFlexField_PrivateDescSeg23;		

	@Column(name = "descFlexField_PrivateDescSeg24")
	private String descFlexField_PrivateDescSeg24;		

	@Column(name = "descFlexField_PrivateDescSeg25")
	private String descFlexField_PrivateDescSeg25;		

	@Column(name = "descFlexField_PrivateDescSeg26")
	private String descFlexField_PrivateDescSeg26;		

	@Column(name = "descFlexField_PrivateDescSeg27")
	private String descFlexField_PrivateDescSeg27;		

	@Column(name = "descFlexField_PrivateDescSeg28")
	private String descFlexField_PrivateDescSeg28;		

	@Column(name = "descFlexField_PrivateDescSeg29")
	private String descFlexField_PrivateDescSeg29;		

	@Column(name = "descFlexField_PrivateDescSeg30")
	private String descFlexField_PrivateDescSeg30;		

	/**
	 * 供应来源
	 */
	@Column(name = "supplySource")
	private Integer supplySource;

	/**
	 * 供应类型
	 */
	@Column(name = "demandTransType")
	private Integer demandTransType;

	/**
	 * 供应组织
	 */
	@Column(name = "supplyOrg")
	private String supplyOrg;	

	/**
	 * 存储地点
	 */
	@Column(name = "wh")
	private String wh;

	/**
	 * 供应商
	 */
	@Column(name = "supplier")
	private String supplier;

	@Column(name = "dr")
	private Integer dr;

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

	public Integer getIsShipTo() {
		return isShipTo;
	}

	public void setIsShipTo(Integer isShipTo) {
		this.isShipTo = isShipTo;
	}

	public String getShiptoDisableDate() {
		return shiptoDisableDate;
	}

	public void setShiptoDisableDate(String shiptoDisableDate) {
		this.shiptoDisableDate = shiptoDisableDate;
	}

	public Integer getIsBillTo() {
		return isBillTo;
	}

	public void setIsBillTo(Integer isBillTo) {
		this.isBillTo = isBillTo;
	}

	public String getBillToDisableDate() {
		return billToDisableDate;
	}

	public void setBillToDisableDate(String billToDisableDate) {
		this.billToDisableDate = billToDisableDate;
	}

	public Integer getIsPayment() {
		return isPayment;
	}

	public void setIsPayment(Integer isPayment) {
		this.isPayment = isPayment;
	}

	public String getPaymentDisableDate() {
		return paymentDisableDate;
	}

	public void setPaymentDisableDate(String paymentDisableDate) {
		this.paymentDisableDate = paymentDisableDate;
	}

	public Integer getIsClaim() {
		return isClaim;
	}

	public void setIsClaim(Integer isClaim) {
		this.isClaim = isClaim;
	}

	public String getClaimDisableDate() {
		return claimDisableDate;
	}

	public void setClaimDisableDate(String claimDisableDate) {
		this.claimDisableDate = claimDisableDate;
	}

	public Integer getIsContrast() {
		return isContrast;
	}

	public void setIsContrast(Integer isContrast) {
		this.isContrast = isContrast;
	}

	public String getContrastDisableDate() {
		return contrastDisableDate;
	}

	public void setContrastDisableDate(String contrastDisableDate) {
		this.contrastDisableDate = contrastDisableDate;
	}

	public String getOfficeDisableDate() {
		return officeDisableDate;
	}

	public void setOfficeDisableDate(String officeDisableDate) {
		this.officeDisableDate = officeDisableDate;
	}

	public String getRegisterDisableDate() {
		return registerDisableDate;
	}

	public void setRegisterDisableDate(String registerDisableDate) {
		this.registerDisableDate = registerDisableDate;
	}

	public String getSearchCode() {
		return searchCode;
	}

	public void setSearchCode(String searchCode) {
		this.searchCode = searchCode;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getBillToSite() {
		return billToSite;
	}

	public void setBillToSite(String billToSite) {
		this.billToSite = billToSite;
	}

	public String getTaxSchedule() {
		return taxSchedule;
	}

	public void setTaxSchedule(String taxSchedule) {
		this.taxSchedule = taxSchedule;
	}

	public String getTradeCurrency() {
		return tradeCurrency;
	}

	public void setTradeCurrency(String tradeCurrency) {
		this.tradeCurrency = tradeCurrency;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public Integer getNeedDeposit() {
		return needDeposit;
	}

	public void setNeedDeposit(Integer needDeposit) {
		this.needDeposit = needDeposit;
	}

	public String getPaymentTerm() {
		return paymentTerm;
	}

	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}

	public Integer getIsPaymentTermEditable() {
		return isPaymentTermEditable;
	}

	public void setIsPaymentTermEditable(Integer isPaymentTermEditable) {
		this.isPaymentTermEditable = isPaymentTermEditable;
	}

	public Integer getIsSalesDiscount() {
		return isSalesDiscount;
	}

	public void setIsSalesDiscount(Integer isSalesDiscount) {
		this.isSalesDiscount = isSalesDiscount;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getShippmentRule() {
		return shippmentRule;
	}

	public void setShippmentRule(String shippmentRule) {
		this.shippmentRule = shippmentRule;
	}

	public Integer getIsShippmentRuleEditable() {
		return isShippmentRuleEditable;
	}

	public void setIsShippmentRuleEditable(Integer isShippmentRuleEditable) {
		this.isShippmentRuleEditable = isShippmentRuleEditable;
	}

	public Integer getShipmentMode() {
		return shipmentMode;
	}

	public void setShipmentMode(Integer shipmentMode) {
		this.shipmentMode = shipmentMode;
	}

	public String getTransitMode() {
		return transitMode;
	}

	public void setTransitMode(String transitMode) {
		this.transitMode = transitMode;
	}

	public Integer getTransitLeadTime() {
		return transitLeadTime;
	}

	public void setTransitLeadTime(Integer transitLeadTime) {
		this.transitLeadTime = transitLeadTime;
	}

	public Integer getIsPriceListModify() {
		return isPriceListModify;
	}

	public void setIsPriceListModify(Integer isPriceListModify) {
		this.isPriceListModify = isPriceListModify;
	}

	public String getStateTaxNo() {
		return stateTaxNo;
	}

	public void setStateTaxNo(String stateTaxNo) {
		this.stateTaxNo = stateTaxNo;
	}

	public String getDistrictTaxNo() {
		return districtTaxNo;
	}

	public void setDistrictTaxNo(String districtTaxNo) {
		this.districtTaxNo = districtTaxNo;
	}

	public Integer getIsPostBankCheckList() {
		return isPostBankCheckList;
	}

	public void setIsPostBankCheckList(Integer isPostBankCheckList) {
		this.isPostBankCheckList = isPostBankCheckList;
	}

	public Integer getBankCheckPeriod() {
		return bankCheckPeriod;
	}

	public void setBankCheckPeriod(Integer bankCheckPeriod) {
		this.bankCheckPeriod = bankCheckPeriod;
	}

	public String getLatelyPrintDate() {
		return latelyPrintDate;
	}

	public void setLatelyPrintDate(String latelyPrintDate) {
		this.latelyPrintDate = latelyPrintDate;
	}

	public String getNextPrintDate() {
		return nextPrintDate;
	}

	public void setNextPrintDate(String nextPrintDate) {
		this.nextPrintDate = nextPrintDate;
	}

	public CustomerState getCustomerState() {
		return customerState;
	}

	public void setCustomerState(CustomerState customerState) {
		this.customerState = customerState;
	}

	public String getBankStatementFormat() {
		return bankStatementFormat;
	}

	public void setBankStatementFormat(String bankStatementFormat) {
		this.bankStatementFormat = bankStatementFormat;
	}

	public String getDefaultContact() {
		return defaultContact;
	}

	public void setDefaultContact(String defaultContact) {
		this.defaultContact = defaultContact;
	}

	public Integer getIsPrePayment() {
		return isPrePayment;
	}

	public void setIsPrePayment(Integer isPrePayment) {
		this.isPrePayment = isPrePayment;
	}

	public String getPressPaymentStyle() {
		return pressPaymentStyle;
	}

	public void setPressPaymentStyle(String pressPaymentStyle) {
		this.pressPaymentStyle = pressPaymentStyle;
	}

	public Integer getQualityGuaranteeType() {
		return qualityGuaranteeType;
	}

	public void setQualityGuaranteeType(Integer qualityGuaranteeType) {
		this.qualityGuaranteeType = qualityGuaranteeType;
	}

	public Integer getIsDefaultShipTo() {
		return isDefaultShipTo;
	}

	public void setIsDefaultShipTo(Integer isDefaultShipTo) {
		this.isDefaultShipTo = isDefaultShipTo;
	}

	public Integer getIsDefaultBillTo() {
		return isDefaultBillTo;
	}

	public void setIsDefaultBillTo(Integer isDefaultBillTo) {
		this.isDefaultBillTo = isDefaultBillTo;
	}

	public Integer getIsDefaultPayment() {
		return isDefaultPayment;
	}

	public void setIsDefaultPayment(Integer isDefaultPayment) {
		this.isDefaultPayment = isDefaultPayment;
	}

	public Integer getIsDefaultContrast() {
		return isDefaultContrast;
	}

	public void setIsDefaultContrast(Integer isDefaultContrast) {
		this.isDefaultContrast = isDefaultContrast;
	}

	public Integer getIsDefaultClaim() {
		return isDefaultClaim;
	}

	public void setIsDefaultClaim(Integer isDefaultClaim) {
		this.isDefaultClaim = isDefaultClaim;
	}

	public String getOfficeSite() {
		return officeSite;
	}

	public void setOfficeSite(String officeSite) {
		this.officeSite = officeSite;
	}

	public String getRegisterAddress() {
		return registerAddress;
	}

	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}

	public String getBusinessBillStyle() {
		return businessBillStyle;
	}

	public void setBusinessBillStyle(String businessBillStyle) {
		this.businessBillStyle = businessBillStyle;
	}

	public String getSaleOrderStyle() {
		return saleOrderStyle;
	}

	public void setSaleOrderStyle(String saleOrderStyle) {
		this.saleOrderStyle = saleOrderStyle;
	}

	public String getHoldReason() {
		return holdReason;
	}

	public void setHoldReason(String holdReason) {
		this.holdReason = holdReason;
	}

	public String getReleaseReason() {
		return releaseReason;
	}

	public void setReleaseReason(String releaseReason) {
		this.releaseReason = releaseReason;
	}

	public String getHoldUser() {
		return holdUser;
	}

	public void setHoldUser(String holdUser) {
		this.holdUser = holdUser;
	}

	public String getReleaseUser() {
		return releaseUser;
	}

	public void setReleaseUser(String releaseUser) {
		this.releaseUser = releaseUser;
	}

	public String getHoldDate() {
		return holdDate;
	}

	public void setHoldDate(String holdDate) {
		this.holdDate = holdDate;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public U9STATE getIsEffective() {
		return isEffective;
	}

	public void setIsEffective(U9STATE isEffective) {
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

	public Integer getIsHoldRelease() {
		return isHoldRelease;
	}

	public void setIsHoldRelease(Integer isHoldRelease) {
		this.isHoldRelease = isHoldRelease;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getPriceListID() {
		return priceListID;
	}

	public void setPriceListID(String priceListID) {
		this.priceListID = priceListID;
	}

	public Integer getInvoiceVerificationOrder() {
		return invoiceVerificationOrder;
	}

	public void setInvoiceVerificationOrder(Integer invoiceVerificationOrder) {
		this.invoiceVerificationOrder = invoiceVerificationOrder;
	}

	public Integer getVerificationMode() {
		return verificationMode;
	}

	public void setVerificationMode(Integer verificationMode) {
		this.verificationMode = verificationMode;
	}

	public String getPriceListCode() {
		return priceListCode;
	}

	public void setPriceListCode(String priceListCode) {
		this.priceListCode = priceListCode;
	}

	public String getPriceListName() {
		return priceListName;
	}

	public void setPriceListName(String priceListName) {
		this.priceListName = priceListName;
	}

	public String getDefaultContactPsn() {
		return defaultContactPsn;
	}

	public void setDefaultContactPsn(String defaultContactPsn) {
		this.defaultContactPsn = defaultContactPsn;
	}

	public String getDefaultBankAccount() {
		return defaultBankAccount;
	}

	public void setDefaultBankAccount(String defaultBankAccount) {
		this.defaultBankAccount = defaultBankAccount;
	}

	public String getCreditPolicy() {
		return creditPolicy;
	}

	public void setCreditPolicy(String creditPolicy) {
		this.creditPolicy = creditPolicy;
	}

	public String getCreditPolicyCode() {
		return creditPolicyCode;
	}

	public void setCreditPolicyCode(String creditPolicyCode) {
		this.creditPolicyCode = creditPolicyCode;
	}

	public String getCreditPolicyName() {
		return creditPolicyName;
	}

	public void setCreditPolicyName(String creditPolicyName) {
		this.creditPolicyName = creditPolicyName;
	}

	public String getCreditLevel1() {
		return creditLevel1;
	}

	public void setCreditLevel1(String creditLevel1) {
		this.creditLevel1 = creditLevel1;
	}

	public String getCreditLevel1Code() {
		return creditLevel1Code;
	}

	public void setCreditLevel1Code(String creditLevel1Code) {
		this.creditLevel1Code = creditLevel1Code;
	}

	public String getCreditLevel1Name() {
		return creditLevel1Name;
	}

	public void setCreditLevel1Name(String creditLevel1Name) {
		this.creditLevel1Name = creditLevel1Name;
	}

	public String getCreditLevel2() {
		return creditLevel2;
	}

	public void setCreditLevel2(String creditLevel2) {
		this.creditLevel2 = creditLevel2;
	}

	public String getCreditLevel2Code() {
		return creditLevel2Code;
	}

	public void setCreditLevel2Code(String creditLevel2Code) {
		this.creditLevel2Code = creditLevel2Code;
	}

	public String getCreditLevel2Name() {
		return creditLevel2Name;
	}

	public void setCreditLevel2Name(String creditLevel2Name) {
		this.creditLevel2Name = creditLevel2Name;
	}

	public Integer getControlPoint() {
		return controlPoint;
	}

	public void setControlPoint(Integer controlPoint) {
		this.controlPoint = controlPoint;
	}

	public String getControlPDiff() {
		return controlPDiff;
	}

	public void setControlPDiff(String controlPDiff) {
		this.controlPDiff = controlPDiff;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getArConfirmTerm() {
		return arConfirmTerm;
	}

	public void setArConfirmTerm(String arConfirmTerm) {
		this.arConfirmTerm = arConfirmTerm;
	}

	public String getSrcRowID() {
		return srcRowID;
	}

	public void setSrcRowID(String srcRowID) {
		this.srcRowID = srcRowID;
	}

	public String getShippingHavenID() {
		return shippingHavenID;
	}

	public void setShippingHavenID(String shippingHavenID) {
		this.shippingHavenID = shippingHavenID;
	}

	public String getShippingHavenCode() {
		return shippingHavenCode;
	}

	public void setShippingHavenCode(String shippingHavenCode) {
		this.shippingHavenCode = shippingHavenCode;
	}

	public String getShippingHavenName() {
		return shippingHavenName;
	}

	public void setShippingHavenName(String shippingHavenName) {
		this.shippingHavenName = shippingHavenName;
	}

	public String getTargetHavenID() {
		return targetHavenID;
	}

	public void setTargetHavenID(String targetHavenID) {
		this.targetHavenID = targetHavenID;
	}

	public String getTargetHavenCode() {
		return targetHavenCode;
	}

	public void setTargetHavenCode(String targetHavenCode) {
		this.targetHavenCode = targetHavenCode;
	}

	public String getTargetHavenName() {
		return targetHavenName;
	}

	public void setTargetHavenName(String targetHavenName) {
		this.targetHavenName = targetHavenName;
	}

	public String getDescFlexField_PubDescSeg1() {
		return descFlexField_PubDescSeg1;
	}

	public void setDescFlexField_PubDescSeg1(String descFlexField_PubDescSeg1) {
		this.descFlexField_PubDescSeg1 = descFlexField_PubDescSeg1;
	}

	public String getDescFlexField_PubDescSeg2() {
		return descFlexField_PubDescSeg2;
	}

	public void setDescFlexField_PubDescSeg2(String descFlexField_PubDescSeg2) {
		this.descFlexField_PubDescSeg2 = descFlexField_PubDescSeg2;
	}

	public String getDescFlexField_PubDescSeg3() {
		return descFlexField_PubDescSeg3;
	}

	public void setDescFlexField_PubDescSeg3(String descFlexField_PubDescSeg3) {
		this.descFlexField_PubDescSeg3 = descFlexField_PubDescSeg3;
	}

	public String getDescFlexField_PubDescSeg4() {
		return descFlexField_PubDescSeg4;
	}

	public void setDescFlexField_PubDescSeg4(String descFlexField_PubDescSeg4) {
		this.descFlexField_PubDescSeg4 = descFlexField_PubDescSeg4;
	}

	public String getDescFlexField_PubDescSeg5() {
		return descFlexField_PubDescSeg5;
	}

	public void setDescFlexField_PubDescSeg5(String descFlexField_PubDescSeg5) {
		this.descFlexField_PubDescSeg5 = descFlexField_PubDescSeg5;
	}

	public String getDescFlexField_PubDescSeg6() {
		return descFlexField_PubDescSeg6;
	}

	public void setDescFlexField_PubDescSeg6(String descFlexField_PubDescSeg6) {
		this.descFlexField_PubDescSeg6 = descFlexField_PubDescSeg6;
	}

	public String getDescFlexField_PubDescSeg7() {
		return descFlexField_PubDescSeg7;
	}

	public void setDescFlexField_PubDescSeg7(String descFlexField_PubDescSeg7) {
		this.descFlexField_PubDescSeg7 = descFlexField_PubDescSeg7;
	}

	public String getDescFlexField_PubDescSeg8() {
		return descFlexField_PubDescSeg8;
	}

	public void setDescFlexField_PubDescSeg8(String descFlexField_PubDescSeg8) {
		this.descFlexField_PubDescSeg8 = descFlexField_PubDescSeg8;
	}

	public String getDescFlexField_PubDescSeg9() {
		return descFlexField_PubDescSeg9;
	}

	public void setDescFlexField_PubDescSeg9(String descFlexField_PubDescSeg9) {
		this.descFlexField_PubDescSeg9 = descFlexField_PubDescSeg9;
	}

	public String getDescFlexField_PubDescSeg10() {
		return descFlexField_PubDescSeg10;
	}

	public void setDescFlexField_PubDescSeg10(String descFlexField_PubDescSeg10) {
		this.descFlexField_PubDescSeg10 = descFlexField_PubDescSeg10;
	}

	public String getDescFlexField_PubDescSeg11() {
		return descFlexField_PubDescSeg11;
	}

	public void setDescFlexField_PubDescSeg11(String descFlexField_PubDescSeg11) {
		this.descFlexField_PubDescSeg11 = descFlexField_PubDescSeg11;
	}

	public String getDescFlexField_PubDescSeg12() {
		return descFlexField_PubDescSeg12;
	}

	public void setDescFlexField_PubDescSeg12(String descFlexField_PubDescSeg12) {
		this.descFlexField_PubDescSeg12 = descFlexField_PubDescSeg12;
	}

	public String getDescFlexField_PubDescSeg13() {
		return descFlexField_PubDescSeg13;
	}

	public void setDescFlexField_PubDescSeg13(String descFlexField_PubDescSeg13) {
		this.descFlexField_PubDescSeg13 = descFlexField_PubDescSeg13;
	}

	public String getDescFlexField_PubDescSeg14() {
		return descFlexField_PubDescSeg14;
	}

	public void setDescFlexField_PubDescSeg14(String descFlexField_PubDescSeg14) {
		this.descFlexField_PubDescSeg14 = descFlexField_PubDescSeg14;
	}

	public String getDescFlexField_PubDescSeg15() {
		return descFlexField_PubDescSeg15;
	}

	public void setDescFlexField_PubDescSeg15(String descFlexField_PubDescSeg15) {
		this.descFlexField_PubDescSeg15 = descFlexField_PubDescSeg15;
	}

	public String getDescFlexField_PubDescSeg16() {
		return descFlexField_PubDescSeg16;
	}

	public void setDescFlexField_PubDescSeg16(String descFlexField_PubDescSeg16) {
		this.descFlexField_PubDescSeg16 = descFlexField_PubDescSeg16;
	}

	public String getDescFlexField_PubDescSeg17() {
		return descFlexField_PubDescSeg17;
	}

	public void setDescFlexField_PubDescSeg17(String descFlexField_PubDescSeg17) {
		this.descFlexField_PubDescSeg17 = descFlexField_PubDescSeg17;
	}

	public String getDescFlexField_PubDescSeg18() {
		return descFlexField_PubDescSeg18;
	}

	public void setDescFlexField_PubDescSeg18(String descFlexField_PubDescSeg18) {
		this.descFlexField_PubDescSeg18 = descFlexField_PubDescSeg18;
	}

	public String getDescFlexField_PubDescSeg19() {
		return descFlexField_PubDescSeg19;
	}

	public void setDescFlexField_PubDescSeg19(String descFlexField_PubDescSeg19) {
		this.descFlexField_PubDescSeg19 = descFlexField_PubDescSeg19;
	}

	public String getDescFlexField_PubDescSeg20() {
		return descFlexField_PubDescSeg20;
	}

	public void setDescFlexField_PubDescSeg20(String descFlexField_PubDescSeg20) {
		this.descFlexField_PubDescSeg20 = descFlexField_PubDescSeg20;
	}

	public String getDescFlexField_PubDescSeg21() {
		return descFlexField_PubDescSeg21;
	}

	public void setDescFlexField_PubDescSeg21(String descFlexField_PubDescSeg21) {
		this.descFlexField_PubDescSeg21 = descFlexField_PubDescSeg21;
	}

	public String getDescFlexField_PubDescSeg22() {
		return descFlexField_PubDescSeg22;
	}

	public void setDescFlexField_PubDescSeg22(String descFlexField_PubDescSeg22) {
		this.descFlexField_PubDescSeg22 = descFlexField_PubDescSeg22;
	}

	public String getDescFlexField_PubDescSeg23() {
		return descFlexField_PubDescSeg23;
	}

	public void setDescFlexField_PubDescSeg23(String descFlexField_PubDescSeg23) {
		this.descFlexField_PubDescSeg23 = descFlexField_PubDescSeg23;
	}

	public String getDescFlexField_PubDescSeg24() {
		return descFlexField_PubDescSeg24;
	}

	public void setDescFlexField_PubDescSeg24(String descFlexField_PubDescSeg24) {
		this.descFlexField_PubDescSeg24 = descFlexField_PubDescSeg24;
	}

	public String getDescFlexField_PubDescSeg25() {
		return descFlexField_PubDescSeg25;
	}

	public void setDescFlexField_PubDescSeg25(String descFlexField_PubDescSeg25) {
		this.descFlexField_PubDescSeg25 = descFlexField_PubDescSeg25;
	}

	public String getDescFlexField_PubDescSeg26() {
		return descFlexField_PubDescSeg26;
	}

	public void setDescFlexField_PubDescSeg26(String descFlexField_PubDescSeg26) {
		this.descFlexField_PubDescSeg26 = descFlexField_PubDescSeg26;
	}

	public String getDescFlexField_PubDescSeg27() {
		return descFlexField_PubDescSeg27;
	}

	public void setDescFlexField_PubDescSeg27(String descFlexField_PubDescSeg27) {
		this.descFlexField_PubDescSeg27 = descFlexField_PubDescSeg27;
	}

	public String getDescFlexField_PubDescSeg28() {
		return descFlexField_PubDescSeg28;
	}

	public void setDescFlexField_PubDescSeg28(String descFlexField_PubDescSeg28) {
		this.descFlexField_PubDescSeg28 = descFlexField_PubDescSeg28;
	}

	public String getDescFlexField_PubDescSeg29() {
		return descFlexField_PubDescSeg29;
	}

	public void setDescFlexField_PubDescSeg29(String descFlexField_PubDescSeg29) {
		this.descFlexField_PubDescSeg29 = descFlexField_PubDescSeg29;
	}

	public String getDescFlexField_PubDescSeg30() {
		return descFlexField_PubDescSeg30;
	}

	public void setDescFlexField_PubDescSeg30(String descFlexField_PubDescSeg30) {
		this.descFlexField_PubDescSeg30 = descFlexField_PubDescSeg30;
	}

	public String getDescFlexField_PubDescSeg31() {
		return descFlexField_PubDescSeg31;
	}

	public void setDescFlexField_PubDescSeg31(String descFlexField_PubDescSeg31) {
		this.descFlexField_PubDescSeg31 = descFlexField_PubDescSeg31;
	}

	public String getDescFlexField_PubDescSeg32() {
		return descFlexField_PubDescSeg32;
	}

	public void setDescFlexField_PubDescSeg32(String descFlexField_PubDescSeg32) {
		this.descFlexField_PubDescSeg32 = descFlexField_PubDescSeg32;
	}

	public String getDescFlexField_PubDescSeg33() {
		return descFlexField_PubDescSeg33;
	}

	public void setDescFlexField_PubDescSeg33(String descFlexField_PubDescSeg33) {
		this.descFlexField_PubDescSeg33 = descFlexField_PubDescSeg33;
	}

	public String getDescFlexField_PubDescSeg34() {
		return descFlexField_PubDescSeg34;
	}

	public void setDescFlexField_PubDescSeg34(String descFlexField_PubDescSeg34) {
		this.descFlexField_PubDescSeg34 = descFlexField_PubDescSeg34;
	}

	public String getDescFlexField_PubDescSeg35() {
		return descFlexField_PubDescSeg35;
	}

	public void setDescFlexField_PubDescSeg35(String descFlexField_PubDescSeg35) {
		this.descFlexField_PubDescSeg35 = descFlexField_PubDescSeg35;
	}

	public String getDescFlexField_PubDescSeg36() {
		return descFlexField_PubDescSeg36;
	}

	public void setDescFlexField_PubDescSeg36(String descFlexField_PubDescSeg36) {
		this.descFlexField_PubDescSeg36 = descFlexField_PubDescSeg36;
	}

	public String getDescFlexField_PubDescSeg37() {
		return descFlexField_PubDescSeg37;
	}

	public void setDescFlexField_PubDescSeg37(String descFlexField_PubDescSeg37) {
		this.descFlexField_PubDescSeg37 = descFlexField_PubDescSeg37;
	}

	public String getDescFlexField_PubDescSeg38() {
		return descFlexField_PubDescSeg38;
	}

	public void setDescFlexField_PubDescSeg38(String descFlexField_PubDescSeg38) {
		this.descFlexField_PubDescSeg38 = descFlexField_PubDescSeg38;
	}

	public String getDescFlexField_PubDescSeg39() {
		return descFlexField_PubDescSeg39;
	}

	public void setDescFlexField_PubDescSeg39(String descFlexField_PubDescSeg39) {
		this.descFlexField_PubDescSeg39 = descFlexField_PubDescSeg39;
	}

	public String getDescFlexField_PubDescSeg40() {
		return descFlexField_PubDescSeg40;
	}

	public void setDescFlexField_PubDescSeg40(String descFlexField_PubDescSeg40) {
		this.descFlexField_PubDescSeg40 = descFlexField_PubDescSeg40;
	}

	public String getDescFlexField_PubDescSeg41() {
		return descFlexField_PubDescSeg41;
	}

	public void setDescFlexField_PubDescSeg41(String descFlexField_PubDescSeg41) {
		this.descFlexField_PubDescSeg41 = descFlexField_PubDescSeg41;
	}

	public String getDescFlexField_PubDescSeg42() {
		return descFlexField_PubDescSeg42;
	}

	public void setDescFlexField_PubDescSeg42(String descFlexField_PubDescSeg42) {
		this.descFlexField_PubDescSeg42 = descFlexField_PubDescSeg42;
	}

	public String getDescFlexField_PubDescSeg43() {
		return descFlexField_PubDescSeg43;
	}

	public void setDescFlexField_PubDescSeg43(String descFlexField_PubDescSeg43) {
		this.descFlexField_PubDescSeg43 = descFlexField_PubDescSeg43;
	}

	public String getDescFlexField_PubDescSeg44() {
		return descFlexField_PubDescSeg44;
	}

	public void setDescFlexField_PubDescSeg44(String descFlexField_PubDescSeg44) {
		this.descFlexField_PubDescSeg44 = descFlexField_PubDescSeg44;
	}

	public String getDescFlexField_PubDescSeg45() {
		return descFlexField_PubDescSeg45;
	}

	public void setDescFlexField_PubDescSeg45(String descFlexField_PubDescSeg45) {
		this.descFlexField_PubDescSeg45 = descFlexField_PubDescSeg45;
	}

	public String getDescFlexField_PubDescSeg46() {
		return descFlexField_PubDescSeg46;
	}

	public void setDescFlexField_PubDescSeg46(String descFlexField_PubDescSeg46) {
		this.descFlexField_PubDescSeg46 = descFlexField_PubDescSeg46;
	}

	public String getDescFlexField_PubDescSeg47() {
		return descFlexField_PubDescSeg47;
	}

	public void setDescFlexField_PubDescSeg47(String descFlexField_PubDescSeg47) {
		this.descFlexField_PubDescSeg47 = descFlexField_PubDescSeg47;
	}

	public String getDescFlexField_PubDescSeg48() {
		return descFlexField_PubDescSeg48;
	}

	public void setDescFlexField_PubDescSeg48(String descFlexField_PubDescSeg48) {
		this.descFlexField_PubDescSeg48 = descFlexField_PubDescSeg48;
	}

	public String getDescFlexField_PubDescSeg49() {
		return descFlexField_PubDescSeg49;
	}

	public void setDescFlexField_PubDescSeg49(String descFlexField_PubDescSeg49) {
		this.descFlexField_PubDescSeg49 = descFlexField_PubDescSeg49;
	}

	public String getDescFlexField_PubDescSeg50() {
		return descFlexField_PubDescSeg50;
	}

	public void setDescFlexField_PubDescSeg50(String descFlexField_PubDescSeg50) {
		this.descFlexField_PubDescSeg50 = descFlexField_PubDescSeg50;
	}

	public String getDescFlexField_ContextValue() {
		return descFlexField_ContextValue;
	}

	public void setDescFlexField_ContextValue(String descFlexField_ContextValue) {
		this.descFlexField_ContextValue = descFlexField_ContextValue;
	}

	public String getDescFlexField_PrivateDescSeg1() {
		return descFlexField_PrivateDescSeg1;
	}

	public void setDescFlexField_PrivateDescSeg1(String descFlexField_PrivateDescSeg1) {
		this.descFlexField_PrivateDescSeg1 = descFlexField_PrivateDescSeg1;
	}

	public String getDescFlexField_PrivateDescSeg2() {
		return descFlexField_PrivateDescSeg2;
	}

	public void setDescFlexField_PrivateDescSeg2(String descFlexField_PrivateDescSeg2) {
		this.descFlexField_PrivateDescSeg2 = descFlexField_PrivateDescSeg2;
	}

	public String getDescFlexField_PrivateDescSeg3() {
		return descFlexField_PrivateDescSeg3;
	}

	public void setDescFlexField_PrivateDescSeg3(String descFlexField_PrivateDescSeg3) {
		this.descFlexField_PrivateDescSeg3 = descFlexField_PrivateDescSeg3;
	}

	public String getDescFlexField_PrivateDescSeg4() {
		return descFlexField_PrivateDescSeg4;
	}

	public void setDescFlexField_PrivateDescSeg4(String descFlexField_PrivateDescSeg4) {
		this.descFlexField_PrivateDescSeg4 = descFlexField_PrivateDescSeg4;
	}

	public String getDescFlexField_PrivateDescSeg5() {
		return descFlexField_PrivateDescSeg5;
	}

	public void setDescFlexField_PrivateDescSeg5(String descFlexField_PrivateDescSeg5) {
		this.descFlexField_PrivateDescSeg5 = descFlexField_PrivateDescSeg5;
	}

	public String getDescFlexField_PrivateDescSeg6() {
		return descFlexField_PrivateDescSeg6;
	}

	public void setDescFlexField_PrivateDescSeg6(String descFlexField_PrivateDescSeg6) {
		this.descFlexField_PrivateDescSeg6 = descFlexField_PrivateDescSeg6;
	}

	public String getDescFlexField_PrivateDescSeg7() {
		return descFlexField_PrivateDescSeg7;
	}

	public void setDescFlexField_PrivateDescSeg7(String descFlexField_PrivateDescSeg7) {
		this.descFlexField_PrivateDescSeg7 = descFlexField_PrivateDescSeg7;
	}

	public String getDescFlexField_PrivateDescSeg8() {
		return descFlexField_PrivateDescSeg8;
	}

	public void setDescFlexField_PrivateDescSeg8(String descFlexField_PrivateDescSeg8) {
		this.descFlexField_PrivateDescSeg8 = descFlexField_PrivateDescSeg8;
	}

	public String getDescFlexField_PrivateDescSeg9() {
		return descFlexField_PrivateDescSeg9;
	}

	public void setDescFlexField_PrivateDescSeg9(String descFlexField_PrivateDescSeg9) {
		this.descFlexField_PrivateDescSeg9 = descFlexField_PrivateDescSeg9;
	}

	public String getDescFlexField_PrivateDescSeg10() {
		return descFlexField_PrivateDescSeg10;
	}

	public void setDescFlexField_PrivateDescSeg10(String descFlexField_PrivateDescSeg10) {
		this.descFlexField_PrivateDescSeg10 = descFlexField_PrivateDescSeg10;
	}

	public String getDescFlexField_PrivateDescSeg11() {
		return descFlexField_PrivateDescSeg11;
	}

	public void setDescFlexField_PrivateDescSeg11(String descFlexField_PrivateDescSeg11) {
		this.descFlexField_PrivateDescSeg11 = descFlexField_PrivateDescSeg11;
	}

	public String getDescFlexField_PrivateDescSeg12() {
		return descFlexField_PrivateDescSeg12;
	}

	public void setDescFlexField_PrivateDescSeg12(String descFlexField_PrivateDescSeg12) {
		this.descFlexField_PrivateDescSeg12 = descFlexField_PrivateDescSeg12;
	}

	public String getDescFlexField_PrivateDescSeg13() {
		return descFlexField_PrivateDescSeg13;
	}

	public void setDescFlexField_PrivateDescSeg13(String descFlexField_PrivateDescSeg13) {
		this.descFlexField_PrivateDescSeg13 = descFlexField_PrivateDescSeg13;
	}

	public String getDescFlexField_PrivateDescSeg14() {
		return descFlexField_PrivateDescSeg14;
	}

	public void setDescFlexField_PrivateDescSeg14(String descFlexField_PrivateDescSeg14) {
		this.descFlexField_PrivateDescSeg14 = descFlexField_PrivateDescSeg14;
	}

	public String getDescFlexField_PrivateDescSeg15() {
		return descFlexField_PrivateDescSeg15;
	}

	public void setDescFlexField_PrivateDescSeg15(String descFlexField_PrivateDescSeg15) {
		this.descFlexField_PrivateDescSeg15 = descFlexField_PrivateDescSeg15;
	}

	public String getDescFlexField_PrivateDescSeg16() {
		return descFlexField_PrivateDescSeg16;
	}

	public void setDescFlexField_PrivateDescSeg16(String descFlexField_PrivateDescSeg16) {
		this.descFlexField_PrivateDescSeg16 = descFlexField_PrivateDescSeg16;
	}

	public String getDescFlexField_PrivateDescSeg17() {
		return descFlexField_PrivateDescSeg17;
	}

	public void setDescFlexField_PrivateDescSeg17(String descFlexField_PrivateDescSeg17) {
		this.descFlexField_PrivateDescSeg17 = descFlexField_PrivateDescSeg17;
	}

	public String getDescFlexField_PrivateDescSeg18() {
		return descFlexField_PrivateDescSeg18;
	}

	public void setDescFlexField_PrivateDescSeg18(String descFlexField_PrivateDescSeg18) {
		this.descFlexField_PrivateDescSeg18 = descFlexField_PrivateDescSeg18;
	}

	public String getDescFlexField_PrivateDescSeg19() {
		return descFlexField_PrivateDescSeg19;
	}

	public void setDescFlexField_PrivateDescSeg19(String descFlexField_PrivateDescSeg19) {
		this.descFlexField_PrivateDescSeg19 = descFlexField_PrivateDescSeg19;
	}

	public String getDescFlexField_PrivateDescSeg20() {
		return descFlexField_PrivateDescSeg20;
	}

	public void setDescFlexField_PrivateDescSeg20(String descFlexField_PrivateDescSeg20) {
		this.descFlexField_PrivateDescSeg20 = descFlexField_PrivateDescSeg20;
	}

	public String getDescFlexField_PrivateDescSeg21() {
		return descFlexField_PrivateDescSeg21;
	}

	public void setDescFlexField_PrivateDescSeg21(String descFlexField_PrivateDescSeg21) {
		this.descFlexField_PrivateDescSeg21 = descFlexField_PrivateDescSeg21;
	}

	public String getDescFlexField_PrivateDescSeg22() {
		return descFlexField_PrivateDescSeg22;
	}

	public void setDescFlexField_PrivateDescSeg22(String descFlexField_PrivateDescSeg22) {
		this.descFlexField_PrivateDescSeg22 = descFlexField_PrivateDescSeg22;
	}

	public String getDescFlexField_PrivateDescSeg23() {
		return descFlexField_PrivateDescSeg23;
	}

	public void setDescFlexField_PrivateDescSeg23(String descFlexField_PrivateDescSeg23) {
		this.descFlexField_PrivateDescSeg23 = descFlexField_PrivateDescSeg23;
	}

	public String getDescFlexField_PrivateDescSeg24() {
		return descFlexField_PrivateDescSeg24;
	}

	public void setDescFlexField_PrivateDescSeg24(String descFlexField_PrivateDescSeg24) {
		this.descFlexField_PrivateDescSeg24 = descFlexField_PrivateDescSeg24;
	}

	public String getDescFlexField_PrivateDescSeg25() {
		return descFlexField_PrivateDescSeg25;
	}

	public void setDescFlexField_PrivateDescSeg25(String descFlexField_PrivateDescSeg25) {
		this.descFlexField_PrivateDescSeg25 = descFlexField_PrivateDescSeg25;
	}

	public String getDescFlexField_PrivateDescSeg26() {
		return descFlexField_PrivateDescSeg26;
	}

	public void setDescFlexField_PrivateDescSeg26(String descFlexField_PrivateDescSeg26) {
		this.descFlexField_PrivateDescSeg26 = descFlexField_PrivateDescSeg26;
	}

	public String getDescFlexField_PrivateDescSeg27() {
		return descFlexField_PrivateDescSeg27;
	}

	public void setDescFlexField_PrivateDescSeg27(String descFlexField_PrivateDescSeg27) {
		this.descFlexField_PrivateDescSeg27 = descFlexField_PrivateDescSeg27;
	}

	public String getDescFlexField_PrivateDescSeg28() {
		return descFlexField_PrivateDescSeg28;
	}

	public void setDescFlexField_PrivateDescSeg28(String descFlexField_PrivateDescSeg28) {
		this.descFlexField_PrivateDescSeg28 = descFlexField_PrivateDescSeg28;
	}

	public String getDescFlexField_PrivateDescSeg29() {
		return descFlexField_PrivateDescSeg29;
	}

	public void setDescFlexField_PrivateDescSeg29(String descFlexField_PrivateDescSeg29) {
		this.descFlexField_PrivateDescSeg29 = descFlexField_PrivateDescSeg29;
	}

	public String getDescFlexField_PrivateDescSeg30() {
		return descFlexField_PrivateDescSeg30;
	}

	public void setDescFlexField_PrivateDescSeg30(String descFlexField_PrivateDescSeg30) {
		this.descFlexField_PrivateDescSeg30 = descFlexField_PrivateDescSeg30;
	}

	public Integer getSupplySource() {
		return supplySource;
	}

	public void setSupplySource(Integer supplySource) {
		this.supplySource = supplySource;
	}

	public Integer getDemandTransType() {
		return demandTransType;
	}

	public void setDemandTransType(Integer demandTransType) {
		this.demandTransType = demandTransType;
	}

	public String getSupplyOrg() {
		return supplyOrg;
	}

	public void setSupplyOrg(String supplyOrg) {
		this.supplyOrg = supplyOrg;
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

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTerritoryName() {
		return territoryName;
	}

	public void setTerritoryName(String territoryName) {
		this.territoryName = territoryName;
	}

}
