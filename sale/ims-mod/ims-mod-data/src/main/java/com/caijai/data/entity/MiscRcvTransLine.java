/**  
 * Title: MiscRcvTransLine.java<p>
 * Description: 库存杂收单行<br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 杨雪景
 * @date 2018年12月19日
 * @version 1.0  
 */
package com.caijai.data.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;
import com.caijai.base.sysenum.Sort;
import com.caijai.base.sysenum.Status;

/**
 * Title: MiscRcvTransLine
 * <p>
 * Description:库存杂收单行 <br>
 * 
 * @author 杨雪景
 * @date 2018年12月19日
 */
@Table(name = "InvDoc_MiscRcvTransL")
public class MiscRcvTransLine extends BaseTable {

	private static final long serialVersionUID = 3093767565182152564L;

	@Column(name = "ID", primary = true)
	private String id;
	
	@Column(name = "docNo", readonly = true)
	@Relation(table = "InvDoc_MiscRcvTrans", value = "id", ref = "MiscRcvTrans", show = "docNo")
	private String docNo;
	
	@Column(name = "status", readonly = true)
	@Relation(table = "InvDoc_MiscRcvTrans", value = "id", ref = "MiscRcvTrans", show = "status")
	private Status status;

	@Column(name = "bin")
	private String bin;

	@Column(name = "binName", readonly = true)
	@Relation(table = "PM_Bin", value = "id", ref = "bin", show = "name")
	private String binName;

	@Column(name = "binCode", readonly = true)
	@Relation(table = "PM_Bin", value = "id", ref = "bin", show = "code")
	private String binCode;

	@Column(name = "AAIStatus")
	private Integer aaIStatus;

	@Column(name = "BalanceRoute")
	private String balanceRoute;

	@Column(name = "BenefitBin_Bin")
	private String benefitBin_Bin;

	@Column(name = "BenefitBin_Code")
	private String benefitBin_Code;

	@Column(name = "BenefitBin_Name")
	private String benefitBin_Name;

	@Column(name = "BenefitDept")
	private String benefitDept;

	@Column(name = "BenefitOrg")
	private String benefitOrg;

	@Column(name = "BenefitOwnerOrg")
	private String benefitOwnerOrg;

	@Column(name = "BenefitProject")
	private String benefitProject;

	@Column(name = "BenefitPsn")
	private String benefitPsn;

	@Column(name = "BenefitWh")
	private String benefitWh;

	@Column(name = "CollabAmt")
	private Double collabAmt;

	@Column(name = "CostBaseUOM")
	private String costBaseUOM;

	@Column(name = "CostMny")
	private Double costMny;

	@Column(name = "CostPrice")
	private Double costPrice;

	@Column(name = "CostUOM")
	private String costUOM;

	@Column(name = "CostUOMQty")
	private Double costUOMQty;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedOn")
	private String createdOn;

	@Column(name = "CustomerInfo_Code")
	private String customerInfo_Code;

	@Column(name = "CustomerInfo_Customer")
	private String customerInfo_Customer;

	@Column(name = "CustomerInfo_ShortName")
	private String customerInfo_ShortName;

	@Column(name = "CUToCBURate")
	private Double cuToCBURate;

	@Column(name = "DocLineNo", sort = Sort.ASC)
	private Integer docLineNo;

	@Column(name = "Dr")
	private Integer dr;

	@Column(name = "FinishedItem")
	private String finishedItem;

	@Column(name = "FinishedItemGrade")
	private Integer finishedItemGrade;

	@Column(name = "FinishedItemPotency")
	private Integer finishedItemPotency;

	@Column(name = "FinishedItemVersion")
	private String finishedItemVersion;

	@Column(name = "HandleDept")
	private String handleDept;

	@Column(name = "HandlePsn")
	private String handlePsn;

	@Column(name = "IsMFG")
	private Integer isMFG;

	@Column(name = "IsNeedGenAAI")
	private Integer isNeedGenAAI;

	@Column(name = "IsNeedToGL")
	private Integer isNeedToGL;

	@Column(name = "IsRelatedOrg")
	private Integer isRelatedOrg;

	@Column(name = "IsToGL")
	private Integer isToGL;

	@Column(name = "IsVMI")
	private Integer isVMI;

	@Column(name = "IsZeroCost")
	private Integer isZeroCost;

	@Column(name = "IsZeroCostField")
	private Integer isZeroCostField;

	@Column(name = "ItemAmt")
	private Double itemAmt;

	@Column(name = "ItemInfo_ItemCode")
	private String itemInfoItemCode;

	@Column(name = "ItemInfo_ItemCode1", readonly = true)
	@Relation(table = "BD_ItemMaster", value = "id", ref = "ItemInfo_ItemID", show = "code1")
	private String itemInfoItemCode1;

	@Column(name = "ItemInfo_ItemGrade")
	private Integer itemInfoItemGrade;

	@Column(name = "ItemInfo_ItemID")
	private String itemInfoItemID;

	@Column(name = "ItemInfo_ItemName")
	private String itemInfoItemName;

	@Column(name = "ItemInfo_ItemPotency")
	private Integer itemInfoItemPotency;

	@Column(name = "ItemInfo_ItemVersion")
	private String itemInfoItemVersion;

	@Column(name = "LotInfo_DisabledDatetime")
	private String lotInfoDisabledDatetime;

	@Column(name = "LotInfo_LotCode")
	private String lotInfoLotCode;

	@Column(name = "LotInfo_LotMaster")
	private String lotInfoLotMaster;

	@Column(name = "LotInfo_LotValidDate")
	private Integer lotInfoLotValidDate;

	@Column(name = "MacAmt")
	private Double macAmt;

	@Column(name = "ManufacturerInfo_Code")
	private String manufacturerInfo_Code;

	@Column(name = "ManufacturerInfo_ShortName")
	private String manufacturerInfo_ShortName;

	@Column(name = "ManufacturerInfo_Supplier")
	private String manufacturerInfo_Supplier;

	@Column(name = "MFCAmt")
	private Double mfCAmt;

	@Column(name = "MiscRcvTrans")
	private String miscRcvTrans;

	@Column(name = "MOAction")
	private Integer moAction;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

	@Column(name = "MoDocEntity_EntityID")
	private String moDocEntity_EntityID;

	@Column(name = "MoDocEntity_EntityType")
	private String moDocEntity_EntityType;

	@Column(name = "MoDocNo")
	private String moDocNo;

	@Column(name = "Org")
	private String org;

	@Column(name = "OwnerOrg")
	private String ownerOrg;

	@Column(name = "PLS")
	private String pls;

	@Column(name = "PLSEntity_EntityID")
	private String plSEntityEntityID;

	@Column(name = "PLSEntity_EntityType")
	private String plSEntityEntityType;

	@Column(name = "PriceSourcesEnum")
	private Integer priceSourcesEnum;

	@Column(name = "ProductDate")
	private String productDate;

	@Column(name = "ProductLine")
	private String productLine;

	@Column(name = "ProductLineEntity_EntityID")
	private String productLineEntity_EntityID;

	@Column(name = "ProductLineEntity_EntityType")
	private String productLineEntity_EntityType;

	@Column(name = "Project")
	private String project;

	@Column(name = "PurAmt")
	private Double purAmt;

	@Column(name = "Seiban")
	private String seiban;

	@Column(name = "SeibanCode")
	private String seibanCode;

	@Column(name = "SMUToSMBURate")
	private Double smUToSMBURate;

	@Column(name = "SnCode")
	private String snCode;

	@Column(name = "SobCurrency")
	private String sobCurrency;

	@Column(name = "SrcDoc_SrcDoc_EntityID")
	private String srcDoc_SrcDoc_EntityID;

	@Column(name = "SrcDoc_SrcDoc_EntityType")
	private String srcDoc_SrcDoc_EntityType;

	@Column(name = "SrcDoc_SrcDocBusiType")
	private Integer srcDoc_SrcDocBusiType;

	@Column(name = "SrcDoc_SrcDocDate")
	private String srcDoc_SrcDocDate;

	@Column(name = "SrcDoc_SrcDocLine_EntityID")
	private String srcDoc_SrcDocLine_EntityID;

	@Column(name = "SrcDoc_SrcDocLine_EntityType")
	private String srcDoc_SrcDocLine_EntityType;

	@Column(name = "SrcDoc_SrcDocLineNo")
	private Integer srcDoc_SrcDocLineNo;

	@Column(name = "SrcDoc_SrcDocNo")
	private String srcDoc_SrcDocNo;

	@Column(name = "SrcDoc_SrcDocOrg")
	private String srcDoc_SrcDocOrg;

	@Column(name = "SrcDoc_SrcDocSubLine_EntityID")
	private String srcDoc_SrcDocSubLine_EntityID;

	@Column(name = "SrcDoc_SrcDocSubLine_EntityType")
	private String srcDoc_SrcDocSubLine_EntityType;

	@Column(name = "SrcDoc_SrcDocSubLineNo")
	private Integer srcDoc_SrcDocSubLineNo;

	@Column(name = "SrcDoc_SrcDocSubLineNoStr")
	private String srcDoc_SrcDocSubLineNoStr;

	@Column(name = "SrcDoc_SrcDocTransType_EntityID")
	private String srcDoc_SrcDocTransType_EntityID;

	@Column(name = "SrcDoc_SrcDocTransType_EntityType")
	private String srcDoc_SrcDocTransType_EntityType;

	@Column(name = "SrcDoc_SrcDocVer")
	private Integer srcDoc_SrcDocVer;

	@Column(name = "SrcDocLineSysVer")
	private String srcDocLineSysVer;

	@Column(name = "StoreBaseUOM")
	private String storeBaseUOM;

	@Column(name = "StoreMainUOM")
	private String storeMainUOM;

	@Column(name = "StoreMainUOMQty")
	private Double storeMainUOMQty;

	@Column(name = "StoreSubUOM")
	private String storeSubUOM;

	@Column(name = "StoreType")
	private Integer storeType;

	@Column(name = "StoreUOM")
	private String storeUOM;

	@Column(name = "StoreUOMQty")
	private Double storeUOMQty;

	@Column(name = "SupplierInfo_Code")
	private String supplierInfoCode;

	@Column(name = "SupplierInfo_ShortName")
	private String supplierInfoShortName;

	@Column(name = "SupplierInfo_Supplier")
	private String supplierInfoSupplier;

	@Column(name = "SUToCURate")
	private Double suToCURate;

	@Column(name = "SUToSBURate")
	private Double suToSBURate;

	@Column(name = "SUTOSMURate")
	private Double suTOSMURate;

	@Column(name = "SysVersion")
	private String sysVersion;

	@Column(name = "Task")
	private String task;

	@Column(name = "TBUToCBURate")
	private Double tbUToCBURate;

	@Column(name = "TBUToSBURate")
	private Double tbUToSBURate;

	@Column(name = "TradeBaseUOM")
	private String tradeBaseUOM;

	@Column(name = "TradeBaseUOMQty")
	private Double tradeBaseUOMQty;

	@Column(name = "TradeUOM")
	private String tradeUOM;

	@Column(name = "tradeUOMName", readonly = true)
	@Relation(table = "BD_UOM", value = "id", ref = "tradeUOM", show = "name")
	private String tradeUOMName;

	@Column(name = "TradeUOMQty")
	private Double tradeUOMQty;

	@Column(name = "Ts")
	private String ts;

	@Column(name = "TUToTBURate")
	private Double tuToTBURate;

	@Column(name = "VoucherID")
	private String voucherID;

	@Column(name = "VoucherNo")
	private String voucherNo;

	@Column(name = "VoucherTypeID")
	private String voucherTypeID;

	@Column(name = "Wh")
	private String wh;

	@Column(name = "whCode", readonly = true)
	@Relation(table = "BD_Wh", value = "id", ref = "wh", show = "code")
	private String whCode;

	@Column(name = "whName", readonly = true)
	@Relation(table = "BD_Wh", value = "id", ref = "wh", show = "name")
	private String whName;

	@Column(name = "WhMan")
	private String whMan;

	@Column(name = "WorkAmt")
	private Double workAmt;

	@Column(name = "WorkProcNo")
	private String workProcNo;

	@Column(name = "WorkProcNoEnity_EntityID")
	private String workProcNoEnity_EntityID;

	@Column(name = "WorkProcNoEnity_EntityType")
	private String workProcNoEnity_EntityType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAaIStatus() {
		return aaIStatus;
	}

	public void setAaIStatus(Integer aaIStatus) {
		this.aaIStatus = aaIStatus;
	}

	public String getBalanceRoute() {
		return balanceRoute;
	}

	public void setBalanceRoute(String balanceRoute) {
		this.balanceRoute = balanceRoute;
	}

	public String getBenefitBin_Bin() {
		return benefitBin_Bin;
	}

	public void setBenefitBin_Bin(String benefitBin_Bin) {
		this.benefitBin_Bin = benefitBin_Bin;
	}

	public String getBenefitBin_Code() {
		return benefitBin_Code;
	}

	public void setBenefitBin_Code(String benefitBin_Code) {
		this.benefitBin_Code = benefitBin_Code;
	}

	public String getBenefitBin_Name() {
		return benefitBin_Name;
	}

	public void setBenefitBin_Name(String benefitBin_Name) {
		this.benefitBin_Name = benefitBin_Name;
	}

	public String getBenefitDept() {
		return benefitDept;
	}

	public void setBenefitDept(String benefitDept) {
		this.benefitDept = benefitDept;
	}

	public String getBenefitOrg() {
		return benefitOrg;
	}

	public void setBenefitOrg(String benefitOrg) {
		this.benefitOrg = benefitOrg;
	}

	public String getBenefitOwnerOrg() {
		return benefitOwnerOrg;
	}

	public void setBenefitOwnerOrg(String benefitOwnerOrg) {
		this.benefitOwnerOrg = benefitOwnerOrg;
	}

	public String getBenefitProject() {
		return benefitProject;
	}

	public void setBenefitProject(String benefitProject) {
		this.benefitProject = benefitProject;
	}

	public String getBenefitPsn() {
		return benefitPsn;
	}

	public void setBenefitPsn(String benefitPsn) {
		this.benefitPsn = benefitPsn;
	}

	public String getBenefitWh() {
		return benefitWh;
	}

	public void setBenefitWh(String benefitWh) {
		this.benefitWh = benefitWh;
	}

	public Double getCollabAmt() {
		return collabAmt;
	}

	public void setCollabAmt(Double collabAmt) {
		this.collabAmt = collabAmt;
	}

	public String getCostBaseUOM() {
		return costBaseUOM;
	}

	public void setCostBaseUOM(String costBaseUOM) {
		this.costBaseUOM = costBaseUOM;
	}

	public Double getCostMny() {
		return costMny;
	}

	public void setCostMny(Double costMny) {
		this.costMny = costMny;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public String getCostUOM() {
		return costUOM;
	}

	public void setCostUOM(String costUOM) {
		this.costUOM = costUOM;
	}

	public Double getCostUOMQty() {
		return costUOMQty;
	}

	public void setCostUOMQty(Double costUOMQty) {
		this.costUOMQty = costUOMQty;
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

	public String getCustomerInfo_Code() {
		return customerInfo_Code;
	}

	public void setCustomerInfo_Code(String customerInfo_Code) {
		this.customerInfo_Code = customerInfo_Code;
	}

	public String getCustomerInfo_Customer() {
		return customerInfo_Customer;
	}

	public void setCustomerInfo_Customer(String customerInfo_Customer) {
		this.customerInfo_Customer = customerInfo_Customer;
	}

	public String getCustomerInfo_ShortName() {
		return customerInfo_ShortName;
	}

	public void setCustomerInfo_ShortName(String customerInfo_ShortName) {
		this.customerInfo_ShortName = customerInfo_ShortName;
	}

	public Double getCuToCBURate() {
		return cuToCBURate;
	}

	public void setCuToCBURate(Double cuToCBURate) {
		this.cuToCBURate = cuToCBURate;
	}

	public Integer getDocLineNo() {
		return docLineNo;
	}

	public void setDocLineNo(Integer docLineNo) {
		this.docLineNo = docLineNo;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getFinishedItem() {
		return finishedItem;
	}

	public void setFinishedItem(String finishedItem) {
		this.finishedItem = finishedItem;
	}

	public Integer getFinishedItemGrade() {
		return finishedItemGrade;
	}

	public void setFinishedItemGrade(Integer finishedItemGrade) {
		this.finishedItemGrade = finishedItemGrade;
	}

	public Integer getFinishedItemPotency() {
		return finishedItemPotency;
	}

	public void setFinishedItemPotency(Integer finishedItemPotency) {
		this.finishedItemPotency = finishedItemPotency;
	}

	public String getFinishedItemVersion() {
		return finishedItemVersion;
	}

	public void setFinishedItemVersion(String finishedItemVersion) {
		this.finishedItemVersion = finishedItemVersion;
	}

	public String getHandleDept() {
		return handleDept;
	}

	public void setHandleDept(String handleDept) {
		this.handleDept = handleDept;
	}

	public String getHandlePsn() {
		return handlePsn;
	}

	public void setHandlePsn(String handlePsn) {
		this.handlePsn = handlePsn;
	}

	public Integer getIsMFG() {
		return isMFG;
	}

	public void setIsMFG(Integer isMFG) {
		this.isMFG = isMFG;
	}

	public Integer getIsNeedGenAAI() {
		return isNeedGenAAI;
	}

	public void setIsNeedGenAAI(Integer isNeedGenAAI) {
		this.isNeedGenAAI = isNeedGenAAI;
	}

	public Integer getIsNeedToGL() {
		return isNeedToGL;
	}

	public void setIsNeedToGL(Integer isNeedToGL) {
		this.isNeedToGL = isNeedToGL;
	}

	public Integer getIsRelatedOrg() {
		return isRelatedOrg;
	}

	public void setIsRelatedOrg(Integer isRelatedOrg) {
		this.isRelatedOrg = isRelatedOrg;
	}

	public Integer getIsToGL() {
		return isToGL;
	}

	public void setIsToGL(Integer isToGL) {
		this.isToGL = isToGL;
	}

	public Integer getIsVMI() {
		return isVMI;
	}

	public void setIsVMI(Integer isVMI) {
		this.isVMI = isVMI;
	}

	public Integer getIsZeroCost() {
		return isZeroCost;
	}

	public void setIsZeroCost(Integer isZeroCost) {
		this.isZeroCost = isZeroCost;
	}

	public Integer getIsZeroCostField() {
		return isZeroCostField;
	}

	public void setIsZeroCostField(Integer isZeroCostField) {
		this.isZeroCostField = isZeroCostField;
	}

	public Double getItemAmt() {
		return itemAmt;
	}

	public void setItemAmt(Double itemAmt) {
		this.itemAmt = itemAmt;
	}

	public Double getMacAmt() {
		return macAmt;
	}

	public void setMacAmt(Double macAmt) {
		this.macAmt = macAmt;
	}

	public String getManufacturerInfo_Code() {
		return manufacturerInfo_Code;
	}

	public void setManufacturerInfo_Code(String manufacturerInfo_Code) {
		this.manufacturerInfo_Code = manufacturerInfo_Code;
	}

	public String getManufacturerInfo_ShortName() {
		return manufacturerInfo_ShortName;
	}

	public void setManufacturerInfo_ShortName(String manufacturerInfo_ShortName) {
		this.manufacturerInfo_ShortName = manufacturerInfo_ShortName;
	}

	public String getManufacturerInfo_Supplier() {
		return manufacturerInfo_Supplier;
	}

	public void setManufacturerInfo_Supplier(String manufacturerInfo_Supplier) {
		this.manufacturerInfo_Supplier = manufacturerInfo_Supplier;
	}

	public Double getMfCAmt() {
		return mfCAmt;
	}

	public void setMfCAmt(Double mfCAmt) {
		this.mfCAmt = mfCAmt;
	}

	public String getMiscRcvTrans() {
		return miscRcvTrans;
	}

	public void setMiscRcvTrans(String miscRcvTrans) {
		this.miscRcvTrans = miscRcvTrans;
	}

	public Integer getMoAction() {
		return moAction;
	}

	public void setMoAction(Integer moAction) {
		this.moAction = moAction;
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

	public String getMoDocEntity_EntityID() {
		return moDocEntity_EntityID;
	}

	public void setMoDocEntity_EntityID(String moDocEntity_EntityID) {
		this.moDocEntity_EntityID = moDocEntity_EntityID;
	}

	public String getMoDocEntity_EntityType() {
		return moDocEntity_EntityType;
	}

	public void setMoDocEntity_EntityType(String moDocEntity_EntityType) {
		this.moDocEntity_EntityType = moDocEntity_EntityType;
	}

	public String getMoDocNo() {
		return moDocNo;
	}

	public void setMoDocNo(String moDocNo) {
		this.moDocNo = moDocNo;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getOwnerOrg() {
		return ownerOrg;
	}

	public void setOwnerOrg(String ownerOrg) {
		this.ownerOrg = ownerOrg;
	}

	public String getPls() {
		return pls;
	}

	public void setPls(String pls) {
		this.pls = pls;
	}

	public String getPlSEntityEntityID() {
		return plSEntityEntityID;
	}

	public void setPlSEntityEntityID(String plSEntityEntityID) {
		this.plSEntityEntityID = plSEntityEntityID;
	}

	public String getPlSEntityEntityType() {
		return plSEntityEntityType;
	}

	public void setPlSEntityEntityType(String plSEntityEntityType) {
		this.plSEntityEntityType = plSEntityEntityType;
	}

	public Integer getPriceSourcesEnum() {
		return priceSourcesEnum;
	}

	public void setPriceSourcesEnum(Integer priceSourcesEnum) {
		this.priceSourcesEnum = priceSourcesEnum;
	}

	public String getProductDate() {
		return productDate;
	}

	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getProductLineEntity_EntityID() {
		return productLineEntity_EntityID;
	}

	public void setProductLineEntity_EntityID(String productLineEntity_EntityID) {
		this.productLineEntity_EntityID = productLineEntity_EntityID;
	}

	public String getProductLineEntity_EntityType() {
		return productLineEntity_EntityType;
	}

	public void setProductLineEntity_EntityType(String productLineEntity_EntityType) {
		this.productLineEntity_EntityType = productLineEntity_EntityType;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Double getPurAmt() {
		return purAmt;
	}

	public void setPurAmt(Double purAmt) {
		this.purAmt = purAmt;
	}

	public String getSeiban() {
		return seiban;
	}

	public void setSeiban(String seiban) {
		this.seiban = seiban;
	}

	public String getSeibanCode() {
		return seibanCode;
	}

	public void setSeibanCode(String seibanCode) {
		this.seibanCode = seibanCode;
	}

	public Double getSmUToSMBURate() {
		return smUToSMBURate;
	}

	public void setSmUToSMBURate(Double smUToSMBURate) {
		this.smUToSMBURate = smUToSMBURate;
	}

	public String getSnCode() {
		return snCode;
	}

	public void setSnCode(String snCode) {
		this.snCode = snCode;
	}

	public String getSobCurrency() {
		return sobCurrency;
	}

	public void setSobCurrency(String sobCurrency) {
		this.sobCurrency = sobCurrency;
	}

	public String getSrcDoc_SrcDoc_EntityID() {
		return srcDoc_SrcDoc_EntityID;
	}

	public void setSrcDoc_SrcDoc_EntityID(String srcDoc_SrcDoc_EntityID) {
		this.srcDoc_SrcDoc_EntityID = srcDoc_SrcDoc_EntityID;
	}

	public String getSrcDoc_SrcDoc_EntityType() {
		return srcDoc_SrcDoc_EntityType;
	}

	public void setSrcDoc_SrcDoc_EntityType(String srcDoc_SrcDoc_EntityType) {
		this.srcDoc_SrcDoc_EntityType = srcDoc_SrcDoc_EntityType;
	}

	public Integer getSrcDoc_SrcDocBusiType() {
		return srcDoc_SrcDocBusiType;
	}

	public void setSrcDoc_SrcDocBusiType(Integer srcDoc_SrcDocBusiType) {
		this.srcDoc_SrcDocBusiType = srcDoc_SrcDocBusiType;
	}

	public String getSrcDoc_SrcDocDate() {
		return srcDoc_SrcDocDate;
	}

	public void setSrcDoc_SrcDocDate(String srcDoc_SrcDocDate) {
		this.srcDoc_SrcDocDate = srcDoc_SrcDocDate;
	}

	public String getSrcDoc_SrcDocLine_EntityID() {
		return srcDoc_SrcDocLine_EntityID;
	}

	public void setSrcDoc_SrcDocLine_EntityID(String srcDoc_SrcDocLine_EntityID) {
		this.srcDoc_SrcDocLine_EntityID = srcDoc_SrcDocLine_EntityID;
	}

	public String getSrcDoc_SrcDocLine_EntityType() {
		return srcDoc_SrcDocLine_EntityType;
	}

	public void setSrcDoc_SrcDocLine_EntityType(String srcDoc_SrcDocLine_EntityType) {
		this.srcDoc_SrcDocLine_EntityType = srcDoc_SrcDocLine_EntityType;
	}

	public Integer getSrcDoc_SrcDocLineNo() {
		return srcDoc_SrcDocLineNo;
	}

	public void setSrcDoc_SrcDocLineNo(Integer srcDoc_SrcDocLineNo) {
		this.srcDoc_SrcDocLineNo = srcDoc_SrcDocLineNo;
	}

	public String getSrcDoc_SrcDocNo() {
		return srcDoc_SrcDocNo;
	}

	public void setSrcDoc_SrcDocNo(String srcDoc_SrcDocNo) {
		this.srcDoc_SrcDocNo = srcDoc_SrcDocNo;
	}

	public String getSrcDoc_SrcDocOrg() {
		return srcDoc_SrcDocOrg;
	}

	public void setSrcDoc_SrcDocOrg(String srcDoc_SrcDocOrg) {
		this.srcDoc_SrcDocOrg = srcDoc_SrcDocOrg;
	}

	public String getSrcDoc_SrcDocSubLine_EntityID() {
		return srcDoc_SrcDocSubLine_EntityID;
	}

	public void setSrcDoc_SrcDocSubLine_EntityID(String srcDoc_SrcDocSubLine_EntityID) {
		this.srcDoc_SrcDocSubLine_EntityID = srcDoc_SrcDocSubLine_EntityID;
	}

	public String getSrcDoc_SrcDocSubLine_EntityType() {
		return srcDoc_SrcDocSubLine_EntityType;
	}

	public void setSrcDoc_SrcDocSubLine_EntityType(String srcDoc_SrcDocSubLine_EntityType) {
		this.srcDoc_SrcDocSubLine_EntityType = srcDoc_SrcDocSubLine_EntityType;
	}

	public Integer getSrcDoc_SrcDocSubLineNo() {
		return srcDoc_SrcDocSubLineNo;
	}

	public void setSrcDoc_SrcDocSubLineNo(Integer srcDoc_SrcDocSubLineNo) {
		this.srcDoc_SrcDocSubLineNo = srcDoc_SrcDocSubLineNo;
	}

	public String getSrcDoc_SrcDocSubLineNoStr() {
		return srcDoc_SrcDocSubLineNoStr;
	}

	public void setSrcDoc_SrcDocSubLineNoStr(String srcDoc_SrcDocSubLineNoStr) {
		this.srcDoc_SrcDocSubLineNoStr = srcDoc_SrcDocSubLineNoStr;
	}

	public String getSrcDoc_SrcDocTransType_EntityID() {
		return srcDoc_SrcDocTransType_EntityID;
	}

	public void setSrcDoc_SrcDocTransType_EntityID(String srcDoc_SrcDocTransType_EntityID) {
		this.srcDoc_SrcDocTransType_EntityID = srcDoc_SrcDocTransType_EntityID;
	}

	public String getSrcDoc_SrcDocTransType_EntityType() {
		return srcDoc_SrcDocTransType_EntityType;
	}

	public void setSrcDoc_SrcDocTransType_EntityType(String srcDoc_SrcDocTransType_EntityType) {
		this.srcDoc_SrcDocTransType_EntityType = srcDoc_SrcDocTransType_EntityType;
	}

	public Integer getSrcDoc_SrcDocVer() {
		return srcDoc_SrcDocVer;
	}

	public void setSrcDoc_SrcDocVer(Integer srcDoc_SrcDocVer) {
		this.srcDoc_SrcDocVer = srcDoc_SrcDocVer;
	}

	public String getSrcDocLineSysVer() {
		return srcDocLineSysVer;
	}

	public void setSrcDocLineSysVer(String srcDocLineSysVer) {
		this.srcDocLineSysVer = srcDocLineSysVer;
	}

	public String getStoreBaseUOM() {
		return storeBaseUOM;
	}

	public void setStoreBaseUOM(String storeBaseUOM) {
		this.storeBaseUOM = storeBaseUOM;
	}

	public String getStoreMainUOM() {
		return storeMainUOM;
	}

	public void setStoreMainUOM(String storeMainUOM) {
		this.storeMainUOM = storeMainUOM;
	}

	public Double getStoreMainUOMQty() {
		return storeMainUOMQty;
	}

	public void setStoreMainUOMQty(Double storeMainUOMQty) {
		this.storeMainUOMQty = storeMainUOMQty;
	}

	public String getStoreSubUOM() {
		return storeSubUOM;
	}

	public void setStoreSubUOM(String storeSubUOM) {
		this.storeSubUOM = storeSubUOM;
	}

	public Integer getStoreType() {
		return storeType;
	}

	public void setStoreType(Integer storeType) {
		this.storeType = storeType;
	}

	public String getStoreUOM() {
		return storeUOM;
	}

	public void setStoreUOM(String storeUOM) {
		this.storeUOM = storeUOM;
	}

	public Double getStoreUOMQty() {
		return storeUOMQty;
	}

	public void setStoreUOMQty(Double storeUOMQty) {
		this.storeUOMQty = storeUOMQty;
	}

	public Double getSuToCURate() {
		return suToCURate;
	}

	public void setSuToCURate(Double suToCURate) {
		this.suToCURate = suToCURate;
	}

	public Double getSuToSBURate() {
		return suToSBURate;
	}

	public void setSuToSBURate(Double suToSBURate) {
		this.suToSBURate = suToSBURate;
	}

	public Double getSuTOSMURate() {
		return suTOSMURate;
	}

	public void setSuTOSMURate(Double suTOSMURate) {
		this.suTOSMURate = suTOSMURate;
	}

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Double getTbUToCBURate() {
		return tbUToCBURate;
	}

	public void setTbUToCBURate(Double tbUToCBURate) {
		this.tbUToCBURate = tbUToCBURate;
	}

	public Double getTbUToSBURate() {
		return tbUToSBURate;
	}

	public void setTbUToSBURate(Double tbUToSBURate) {
		this.tbUToSBURate = tbUToSBURate;
	}

	public String getTradeBaseUOM() {
		return tradeBaseUOM;
	}

	public void setTradeBaseUOM(String tradeBaseUOM) {
		this.tradeBaseUOM = tradeBaseUOM;
	}

	public Double getTradeBaseUOMQty() {
		return tradeBaseUOMQty;
	}

	public void setTradeBaseUOMQty(Double tradeBaseUOMQty) {
		this.tradeBaseUOMQty = tradeBaseUOMQty;
	}

	public String getTradeUOM() {
		return tradeUOM;
	}

	public void setTradeUOM(String tradeUOM) {
		this.tradeUOM = tradeUOM;
	}

	public Double getTradeUOMQty() {
		return tradeUOMQty;
	}

	public void setTradeUOMQty(Double tradeUOMQty) {
		this.tradeUOMQty = tradeUOMQty;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public Double getTuToTBURate() {
		return tuToTBURate;
	}

	public void setTuToTBURate(Double tuToTBURate) {
		this.tuToTBURate = tuToTBURate;
	}

	public String getVoucherID() {
		return voucherID;
	}

	public void setVoucherID(String voucherID) {
		this.voucherID = voucherID;
	}

	public String getVoucherNo() {
		return voucherNo;
	}

	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

	public String getVoucherTypeID() {
		return voucherTypeID;
	}

	public void setVoucherTypeID(String voucherTypeID) {
		this.voucherTypeID = voucherTypeID;
	}

	public String getWh() {
		return wh;
	}

	public void setWh(String wh) {
		this.wh = wh;
	}

	public String getWhMan() {
		return whMan;
	}

	public void setWhMan(String whMan) {
		this.whMan = whMan;
	}

	public Double getWorkAmt() {
		return workAmt;
	}

	public void setWorkAmt(Double workAmt) {
		this.workAmt = workAmt;
	}

	public String getWorkProcNo() {
		return workProcNo;
	}

	public void setWorkProcNo(String workProcNo) {
		this.workProcNo = workProcNo;
	}

	public String getWorkProcNoEnity_EntityID() {
		return workProcNoEnity_EntityID;
	}

	public void setWorkProcNoEnity_EntityID(String workProcNoEnity_EntityID) {
		this.workProcNoEnity_EntityID = workProcNoEnity_EntityID;
	}

	public String getWorkProcNoEnity_EntityType() {
		return workProcNoEnity_EntityType;
	}

	public void setWorkProcNoEnity_EntityType(String workProcNoEnity_EntityType) {
		this.workProcNoEnity_EntityType = workProcNoEnity_EntityType;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	/**
	 * @return the binName
	 */
	public String getBinName() {
		return binName;
	}

	/**
	 * @param binName
	 *            the binName to set
	 */
	public void setBinName(String binName) {
		this.binName = binName;
	}

	/**
	 * @return the binCode
	 */
	public String getBinCode() {
		return binCode;
	}

	/**
	 * @param binCode
	 *            the binCode to set
	 */
	public void setBinCode(String binCode) {
		this.binCode = binCode;
	}

	/**
	 * @return the itemInfoItemCode
	 */
	public String getItemInfoItemCode() {
		return itemInfoItemCode;
	}

	/**
	 * @param itemInfoItemCode
	 *            the itemInfoItemCode to set
	 */
	public void setItemInfoItemCode(String itemInfoItemCode) {
		this.itemInfoItemCode = itemInfoItemCode;
	}

	/**
	 * @return the itemInfoItemCode1
	 */
	public String getItemInfoItemCode1() {
		return itemInfoItemCode1;
	}

	/**
	 * @param itemInfoItemCode1
	 *            the itemInfoItemCode1 to set
	 */
	public void setItemInfoItemCode1(String itemInfoItemCode1) {
		this.itemInfoItemCode1 = itemInfoItemCode1;
	}

	/**
	 * @return the itemInfoItemGrade
	 */
	public Integer getItemInfoItemGrade() {
		return itemInfoItemGrade;
	}

	/**
	 * @param itemInfoItemGrade
	 *            the itemInfoItemGrade to set
	 */
	public void setItemInfoItemGrade(Integer itemInfoItemGrade) {
		this.itemInfoItemGrade = itemInfoItemGrade;
	}

	/**
	 * @return the itemInfoItemID
	 */
	public String getItemInfoItemID() {
		return itemInfoItemID;
	}

	/**
	 * @param itemInfoItemID
	 *            the itemInfoItemID to set
	 */
	public void setItemInfoItemID(String itemInfoItemID) {
		this.itemInfoItemID = itemInfoItemID;
	}

	/**
	 * @return the itemInfoItemName
	 */
	public String getItemInfoItemName() {
		return itemInfoItemName;
	}

	/**
	 * @param itemInfoItemName
	 *            the itemInfoItemName to set
	 */
	public void setItemInfoItemName(String itemInfoItemName) {
		this.itemInfoItemName = itemInfoItemName;
	}

	/**
	 * @return the itemInfoItemPotency
	 */
	public Integer getItemInfoItemPotency() {
		return itemInfoItemPotency;
	}

	/**
	 * @param itemInfoItemPotency
	 *            the itemInfoItemPotency to set
	 */
	public void setItemInfoItemPotency(Integer itemInfoItemPotency) {
		this.itemInfoItemPotency = itemInfoItemPotency;
	}

	/**
	 * @return the itemInfoItemVersion
	 */
	public String getItemInfoItemVersion() {
		return itemInfoItemVersion;
	}

	/**
	 * @param itemInfoItemVersion
	 *            the itemInfoItemVersion to set
	 */
	public void setItemInfoItemVersion(String itemInfoItemVersion) {
		this.itemInfoItemVersion = itemInfoItemVersion;
	}

	/**
	 * @return the lotInfoDisabledDatetime
	 */
	public String getLotInfoDisabledDatetime() {
		return lotInfoDisabledDatetime;
	}

	/**
	 * @param lotInfoDisabledDatetime
	 *            the lotInfoDisabledDatetime to set
	 */
	public void setLotInfoDisabledDatetime(String lotInfoDisabledDatetime) {
		this.lotInfoDisabledDatetime = lotInfoDisabledDatetime;
	}

	/**
	 * @return the lotInfoLotCode
	 */
	public String getLotInfoLotCode() {
		return lotInfoLotCode;
	}

	/**
	 * @param lotInfoLotCode
	 *            the lotInfoLotCode to set
	 */
	public void setLotInfoLotCode(String lotInfoLotCode) {
		this.lotInfoLotCode = lotInfoLotCode;
	}

	/**
	 * @return the lotInfoLotMaster
	 */
	public String getLotInfoLotMaster() {
		return lotInfoLotMaster;
	}

	/**
	 * @param lotInfoLotMaster
	 *            the lotInfoLotMaster to set
	 */
	public void setLotInfoLotMaster(String lotInfoLotMaster) {
		this.lotInfoLotMaster = lotInfoLotMaster;
	}

	/**
	 * @return the lotInfoLotValidDate
	 */
	public Integer getLotInfoLotValidDate() {
		return lotInfoLotValidDate;
	}

	/**
	 * @param lotInfoLotValidDate
	 *            the lotInfoLotValidDate to set
	 */
	public void setLotInfoLotValidDate(Integer lotInfoLotValidDate) {
		this.lotInfoLotValidDate = lotInfoLotValidDate;
	}

	/**
	 * @return the supplierInfoCode
	 */
	public String getSupplierInfoCode() {
		return supplierInfoCode;
	}

	/**
	 * @param supplierInfoCode
	 *            the supplierInfoCode to set
	 */
	public void setSupplierInfoCode(String supplierInfoCode) {
		this.supplierInfoCode = supplierInfoCode;
	}

	/**
	 * @return the supplierInfoShortName
	 */
	public String getSupplierInfoShortName() {
		return supplierInfoShortName;
	}

	/**
	 * @param supplierInfoShortName
	 *            the supplierInfoShortName to set
	 */
	public void setSupplierInfoShortName(String supplierInfoShortName) {
		this.supplierInfoShortName = supplierInfoShortName;
	}

	/**
	 * @return the supplierInfoSupplier
	 */
	public String getSupplierInfoSupplier() {
		return supplierInfoSupplier;
	}

	/**
	 * @param supplierInfoSupplier
	 *            the supplierInfoSupplier to set
	 */
	public void setSupplierInfoSupplier(String supplierInfoSupplier) {
		this.supplierInfoSupplier = supplierInfoSupplier;
	}

	/**
	 * @return the whCode
	 */
	public String getWhCode() {
		return whCode;
	}

	/**
	 * @param whCode
	 *            the whCode to set
	 */
	public void setWhCode(String whCode) {
		this.whCode = whCode;
	}

	/**
	 * @return the whName
	 */
	public String getWhName() {
		return whName;
	}

	/**
	 * @param whName
	 *            the whName to set
	 */
	public void setWhName(String whName) {
		this.whName = whName;
	}

	public String getTradeUOMName() {
		return tradeUOMName;
	}

	public void setTradeUOMName(String tradeUOMName) {
		this.tradeUOMName = tradeUOMName;
	}

	public String getDocNo() {
		return docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
