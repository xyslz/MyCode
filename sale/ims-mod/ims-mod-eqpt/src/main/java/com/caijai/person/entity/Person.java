package com.caijai.person.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseEntity;

@Table(name = "SYS_Person")
public class Person extends BaseEntity {

	private static final long serialVersionUID = -6259422285274234756L;

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
	 * 创建日期
	 */
	@Column(name = "CreateDate")
	private String createdate;

	/**
	 * 创建组织
	 */
	@Column(name = "CreateOrg")
	private String createorg;

	/**
	 * 是否是从员工菜单进入
	 */
	@Column(name = "IsDirectNode")
	private String isdirectnode;

	/**
	 * 人事归属中心
	 */
	@Column(name = "AttachOrg")
	private String attachorg;

	/**
	 * 联系对象
	 */
	@Column(name = "LinkMan")
	private String linkman;

	/**
	 * 国籍
	 */
	@Column(name = "Nationality")
	private String nationality;

	/**
	 * 证件类别
	 */
	@Column(name = "CertificateType")
	private Integer certificatetype;

	/**
	 * 证件号码
	 */
	@Column(name = "PersonID")
	private String personid;

	/**
	 * 姓名
	 */
	@Column(name = "Name")
	private String name;

	/**
	 * 姓
	 */
	@Column(name = "LastName")
	private String lastname;

	/**
	 * 中间名
	 */
	@Column(name = "MiddleName")
	private String middlename;

	/**
	 * 名
	 */
	@Column(name = "FirstName")
	private String firstname;

	/**
	 * 昵称
	 */
	@Column(name = "NickName")
	private String nickname;

	/**
	 * 性别
	 */
	@Column(name = "Sex")
	private Integer sex;

	/**
	 * 出生日期
	 */
	@Column(name = "Birthday")
	private String birthday;

	/**
	 * 年龄
	 */
	@Column(name = "Age")
	private String age;

	/**
	 * 婚姻状况
	 */
	@Column(name = "MarriageStatus")
	private Integer marriagestatus;

	/**
	 * 血型
	 */
	@Column(name = "BloodType")
	private Integer bloodtype;

	/**
	 * 学历
	 */
	@Column(name = "Diploma")
	private String diploma;

	/**
	 * 学位
	 */
	@Column(name = "Degree")
	private String degree;

	/**
	 * 专业技术职务
	 */
	@Column(name = "JobTtile")
	private String jobttile;

	/**
	 * 职业资格
	 */
	@Column(name = "WorkQualification")
	private Integer workqualification;

	/**
	 * 就业日期
	 */
	@Column(name = "OccupationDate")
	private String occupationdate;

	/**
	 * 宗教
	 */
	@Column(name = "Religion")
	private Integer religion;

	/**
	 * 残障人士
	 */
	@Column(name = "IsDeformity")
	private String isdeformity;

	/**
	 * 离退休日期
	 */
	@Column(name = "RetirTime")
	private String retirtime;

	/**
	 * 离退休年龄
	 */
	@Column(name = "RetireAge")
	private String retireage;

	/**
	 * 工龄
	 */
	@Column(name = "WorkAge")
	private String workage;

	/**
	 * 工龄计算校正值
	 */
	@Column(name = "LOSReviseValue")
	private String losrevisevalue;

	/**
	 * 出生地
	 */
	@Column(name = "BornCountry")
	private String borncountry;

	/**
	 * 现居住地
	 */
	@Column(name = "NowLivingCountry")
	private String nowlivingcountry;

	/**
	 * 人事异动组织
	 */
	@Column(name = "HRChangeOrg")
	private Integer hrchangeorg;

	/**
	 * 薪资信息组织
	 */
	@Column(name = "PayOrg")
	private Integer payorg;

	/**
	 * 劳动合同组织
	 */
	@Column(name = "LabourContractOrg")
	private Integer labourcontractorg;

	/**
	 * 勤务组织
	 */
	@Column(name = "LogisticsOrg")
	private Integer logisticsorg;

	/**
	 * 保密
	 */
	@Column(name = "IsSecrecy")
	private String issecrecy;

	/**
	 * 照片
	 */
	@Column(name = "Photo")
	private String photo;

	/**
	 * 民族
	 */
	@Column(name = "Nation")
	private String nation;

	/**
	 * 政治面貌
	 */
	@Column(name = "PoliticalStatus")
	private Integer politicalstatus;

	/**
	 * 加入党(团)日期
	 */
	@Column(name = "JoinDate")
	private String joindate;

	/**
	 * 个人身份
	 */
	@Column(name = "PersonalStatus")
	private Integer personalstatus;

	/**
	 * 现身份起始日期
	 */
	@Column(name = "StatusStartDate")
	private String statusstartdate;

	/**
	 * 户口性质
	 */
	@Column(name = "RegisteredResidenceType")
	private Integer registeredresidencetype;

	/**
	 * 户籍
	 */
	@Column(name = "RegisteredResidence")
	private String registeredresidence;

	/**
	 * 籍贯
	 */
	@Column(name = "NativePlace")
	private String nativeplace;

	/**
	 * 地址
	 */
	@Column(name = "Address")
	private String address;

	/**
	 * 固定电话
	 */
	@Column(name = "TelPhone")
	private String telphone;

	/**
	 * 移动电话
	 */
	@Column(name = "MobilePhone")
	private String mobilephone;

	/**
	 * 传真
	 */
	@Column(name = "Fax")
	private String fax;

	/**
	 * EMail
	 */
	@Column(name = "EMail")
	private String email;
	
	/**
	 * 作废标识
	 */
	@Column(name = "dr")
	private Integer dr;

	/**
	 * 动态扩展1
	 */
	@Column(name = "DescFlexField_PubDescSeg1")
	private String descflexfieldPubdescseg1;

	/**
	 * 动态扩展2
	 */
	@Column(name = "DescFlexField_PubDescSeg2")
	private String descflexfieldPubdescseg2;

	/**
	 * 动态扩展3
	 */
	@Column(name = "DescFlexField_PubDescSeg3")
	private String descflexfieldPubdescseg3;

	/**
	 * 动态扩展4
	 */
	@Column(name = "DescFlexField_PubDescSeg4")
	private String descflexfieldPubdescseg4;

	/**
	 * 动态扩展5
	 */
	@Column(name = "DescFlexField_PubDescSeg5")
	private String descflexfieldPubdescseg5;

	/**
	 * 动态扩展6
	 */
	@Column(name = "DescFlexField_PubDescSeg6")
	private String descflexfieldPubdescseg6;

	/**
	 * 动态扩展7
	 */
	@Column(name = "DescFlexField_PubDescSeg7")
	private String descflexfieldPubdescseg7;

	/**
	 * 动态扩展8
	 */
	@Column(name = "DescFlexField_PubDescSeg8")
	private String descflexfieldPubdescseg8;

	/**
	 * 动态扩展9
	 */
	@Column(name = "DescFlexField_PubDescSeg9")
	private String descflexfieldPubdescseg9;

	/**
	 * 动态扩展10
	 */
	@Column(name = "DescFlexField_PubDescSeg10")
	private String descflexfieldPubdescseg10;

	/**
	 * 动态扩展11
	 */
	@Column(name = "DescFlexField_PubDescSeg11")
	private String descflexfieldPubdescseg11;

	/**
	 * 动态扩展12
	 */
	@Column(name = "DescFlexField_PubDescSeg12")
	private String descflexfieldPubdescseg12;

	/**
	 * 动态扩展13
	 */
	@Column(name = "DescFlexField_PubDescSeg13")
	private String descflexfieldPubdescseg13;

	/**
	 * 动态扩展14
	 */
	@Column(name = "DescFlexField_PubDescSeg14")
	private String descflexfieldPubdescseg14;

	/**
	 * 动态扩展15
	 */
	@Column(name = "DescFlexField_PubDescSeg15")
	private String descflexfieldPubdescseg15;

	/**
	 * 动态扩展16
	 */
	@Column(name = "DescFlexField_PubDescSeg16")
	private String descflexfieldPubdescseg16;

	/**
	 * 动态扩展17
	 */
	@Column(name = "DescFlexField_PubDescSeg17")
	private String descflexfieldPubdescseg17;

	/**
	 * 动态扩展18
	 */
	@Column(name = "DescFlexField_PubDescSeg18")
	private String descflexfieldPubdescseg18;

	/**
	 * 动态扩展19
	 */
	@Column(name = "DescFlexField_PubDescSeg19")
	private String descflexfieldPubdescseg19;

	/**
	 * 动态扩展20
	 */
	@Column(name = "DescFlexField_PubDescSeg20")
	private String descflexfieldPubdescseg20;

	/**
	 * 动态扩展21
	 */
	@Column(name = "DescFlexField_PubDescSeg21")
	private String descflexfieldPubdescseg21;

	/**
	 * 动态扩展22
	 */
	@Column(name = "DescFlexField_PubDescSeg22")
	private String descflexfieldPubdescseg22;

	/**
	 * 动态扩展23
	 */
	@Column(name = "DescFlexField_PubDescSeg23")
	private String descflexfieldPubdescseg23;

	/**
	 * 动态扩展24
	 */
	@Column(name = "DescFlexField_PubDescSeg24")
	private String descflexfieldPubdescseg24;

	/**
	 * 动态扩展25
	 */
	@Column(name = "DescFlexField_PubDescSeg25")
	private String descflexfieldPubdescseg25;

	/**
	 * 动态扩展26
	 */
	@Column(name = "DescFlexField_PubDescSeg26")
	private String descflexfieldPubdescseg26;

	/**
	 * 动态扩展27
	 */
	@Column(name = "DescFlexField_PubDescSeg27")
	private String descflexfieldPubdescseg27;

	/**
	 * 动态扩展28
	 */
	@Column(name = "DescFlexField_PubDescSeg28")
	private String descflexfieldPubdescseg28;

	/**
	 * 动态扩展29
	 */
	@Column(name = "DescFlexField_PubDescSeg29")
	private String descflexfieldPubdescseg29;

	/**
	 * 动态扩展30
	 */
	@Column(name = "DescFlexField_PubDescSeg30")
	private String descflexfieldPubdescseg30;

	/**
	 * 动态扩展31
	 */
	@Column(name = "DescFlexField_PubDescSeg31")
	private String descflexfieldPubdescseg31;

	/**
	 * 动态扩展32
	 */
	@Column(name = "DescFlexField_PubDescSeg32")
	private String descflexfieldPubdescseg32;

	/**
	 * 动态扩展33
	 */
	@Column(name = "DescFlexField_PubDescSeg33")
	private String descflexfieldPubdescseg33;

	/**
	 * 动态扩展34
	 */
	@Column(name = "DescFlexField_PubDescSeg34")
	private String descflexfieldPubdescseg34;

	/**
	 * 动态扩展35
	 */
	@Column(name = "DescFlexField_PubDescSeg35")
	private String descflexfieldPubdescseg35;

	/**
	 * 动态扩展36
	 */
	@Column(name = "DescFlexField_PubDescSeg36")
	private String descflexfieldPubdescseg36;

	/**
	 * 动态扩展37
	 */
	@Column(name = "DescFlexField_PubDescSeg37")
	private String descflexfieldPubdescseg37;

	/**
	 * 动态扩展38
	 */
	@Column(name = "DescFlexField_PubDescSeg38")
	private String descflexfieldPubdescseg38;

	/**
	 * 动态扩展39
	 */
	@Column(name = "DescFlexField_PubDescSeg39")
	private String descflexfieldPubdescseg39;

	/**
	 * 动态扩展40
	 */
	@Column(name = "DescFlexField_PubDescSeg40")
	private String descflexfieldPubdescseg40;

	/**
	 * 动态扩展41
	 */
	@Column(name = "DescFlexField_PubDescSeg41")
	private String descflexfieldPubdescseg41;

	/**
	 * 动态扩展42
	 */
	@Column(name = "DescFlexField_PubDescSeg42")
	private String descflexfieldPubdescseg42;

	/**
	 * 动态扩展43
	 */
	@Column(name = "DescFlexField_PubDescSeg43")
	private String descflexfieldPubdescseg43;

	/**
	 * 动态扩展44
	 */
	@Column(name = "DescFlexField_PubDescSeg44")
	private String descflexfieldPubdescseg44;

	/**
	 * 动态扩展45
	 */
	@Column(name = "DescFlexField_PubDescSeg45")
	private String descflexfieldPubdescseg45;

	/**
	 * 动态扩展46
	 */
	@Column(name = "DescFlexField_PubDescSeg46")
	private String descflexfieldPubdescseg46;

	/**
	 * 动态扩展47
	 */
	@Column(name = "DescFlexField_PubDescSeg47")
	private String descflexfieldPubdescseg47;

	/**
	 * 动态扩展48
	 */
	@Column(name = "DescFlexField_PubDescSeg48")
	private String descflexfieldPubdescseg48;

	/**
	 * 动态扩展49
	 */
	@Column(name = "DescFlexField_PubDescSeg49")
	private String descflexfieldPubdescseg49;

	/**
	 * 动态扩展50
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
	 * 时间戳
	 */
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

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getCreateorg() {
		return createorg;
	}

	public void setCreateorg(String createorg) {
		this.createorg = createorg;
	}

	public String getIsdirectnode() {
		return isdirectnode;
	}

	public void setIsdirectnode(String isdirectnode) {
		this.isdirectnode = isdirectnode;
	}

	public String getAttachorg() {
		return attachorg;
	}

	public void setAttachorg(String attachorg) {
		this.attachorg = attachorg;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Integer getCertificatetype() {
		return certificatetype;
	}

	public void setCertificatetype(Integer certificatetype) {
		this.certificatetype = certificatetype;
	}

	public String getPersonid() {
		return personid;
	}

	public void setPersonid(String personid) {
		this.personid = personid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Integer getMarriagestatus() {
		return marriagestatus;
	}

	public void setMarriagestatus(Integer marriagestatus) {
		this.marriagestatus = marriagestatus;
	}

	public Integer getBloodtype() {
		return bloodtype;
	}

	public void setBloodtype(Integer bloodtype) {
		this.bloodtype = bloodtype;
	}

	public String getDiploma() {
		return diploma;
	}

	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getJobttile() {
		return jobttile;
	}

	public void setJobttile(String jobttile) {
		this.jobttile = jobttile;
	}

	public Integer getWorkqualification() {
		return workqualification;
	}

	public void setWorkqualification(Integer workqualification) {
		this.workqualification = workqualification;
	}

	public String getOccupationdate() {
		return occupationdate;
	}

	public void setOccupationdate(String occupationdate) {
		this.occupationdate = occupationdate;
	}

	public Integer getReligion() {
		return religion;
	}

	public void setReligion(Integer religion) {
		this.religion = religion;
	}

	public String getIsdeformity() {
		return isdeformity;
	}

	public void setIsdeformity(String isdeformity) {
		this.isdeformity = isdeformity;
	}

	public String getRetirtime() {
		return retirtime;
	}

	public void setRetirtime(String retirtime) {
		this.retirtime = retirtime;
	}

	public String getRetireage() {
		return retireage;
	}

	public void setRetireage(String retireage) {
		this.retireage = retireage;
	}

	public String getWorkage() {
		return workage;
	}

	public void setWorkage(String workage) {
		this.workage = workage;
	}

	public String getLosrevisevalue() {
		return losrevisevalue;
	}

	public void setLosrevisevalue(String losrevisevalue) {
		this.losrevisevalue = losrevisevalue;
	}

	public String getBorncountry() {
		return borncountry;
	}

	public void setBorncountry(String borncountry) {
		this.borncountry = borncountry;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getNowlivingcountry() {
		return nowlivingcountry;
	}

	public void setNowlivingcountry(String nowlivingcountry) {
		this.nowlivingcountry = nowlivingcountry;
	}

	public Integer getHrchangeorg() {
		return hrchangeorg;
	}

	public void setHrchangeorg(Integer hrchangeorg) {
		this.hrchangeorg = hrchangeorg;
	}

	public Integer getPayorg() {
		return payorg;
	}

	public void setPayorg(Integer payorg) {
		this.payorg = payorg;
	}

	public Integer getLabourcontractorg() {
		return labourcontractorg;
	}

	public void setLabourcontractorg(Integer labourcontractorg) {
		this.labourcontractorg = labourcontractorg;
	}

	public Integer getLogisticsorg() {
		return logisticsorg;
	}

	public void setLogisticsorg(Integer logisticsorg) {
		this.logisticsorg = logisticsorg;
	}

	public String getIssecrecy() {
		return issecrecy;
	}

	public void setIssecrecy(String issecrecy) {
		this.issecrecy = issecrecy;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public Integer getPoliticalstatus() {
		return politicalstatus;
	}

	public void setPoliticalstatus(Integer politicalstatus) {
		this.politicalstatus = politicalstatus;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	public Integer getPersonalstatus() {
		return personalstatus;
	}

	public void setPersonalstatus(Integer personalstatus) {
		this.personalstatus = personalstatus;
	}

	public String getStatusstartdate() {
		return statusstartdate;
	}

	public void setStatusstartdate(String statusstartdate) {
		this.statusstartdate = statusstartdate;
	}

	public Integer getRegisteredresidencetype() {
		return registeredresidencetype;
	}

	public void setRegisteredresidencetype(Integer registeredresidencetype) {
		this.registeredresidencetype = registeredresidencetype;
	}

	public String getRegisteredresidence() {
		return registeredresidence;
	}

	public void setRegisteredresidence(String registeredresidence) {
		this.registeredresidence = registeredresidence;
	}

	public String getNativeplace() {
		return nativeplace;
	}

	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", modifiedOn="
				+ modifiedOn + ", modifiedBy=" + modifiedBy + ", sysversion=" + sysversion + ", createdate="
				+ createdate + ", createorg=" + createorg + ", isdirectnode=" + isdirectnode + ", attachorg="
				+ attachorg + ", linkman=" + linkman + ", nationality=" + nationality + ", certificatetype="
				+ certificatetype + ", personid=" + personid + ", name=" + name + ", lastname=" + lastname
				+ ", middlename=" + middlename + ", firstname=" + firstname + ", nickname=" + nickname + ", sex=" + sex
				+ ", birthday=" + birthday + ", age=" + age + ", marriagestatus=" + marriagestatus + ", bloodtype="
				+ bloodtype + ", diploma=" + diploma + ", degree=" + degree + ", jobttile=" + jobttile
				+ ", workqualification=" + workqualification + ", occupationdate=" + occupationdate + ", religion="
				+ religion + ", isdeformity=" + isdeformity + ", retirtime=" + retirtime + ", retireage=" + retireage
				+ ", workage=" + workage + ", losrevisevalue=" + losrevisevalue + ", borncountry=" + borncountry
				+ ", nowlivingcountry=" + nowlivingcountry + ", hrchangeorg=" + hrchangeorg + ", payorg=" + payorg
				+ ", labourcontractorg=" + labourcontractorg + ", logisticsorg=" + logisticsorg + ", issecrecy="
				+ issecrecy + ", photo=" + photo + ", nation=" + nation + ", politicalstatus=" + politicalstatus
				+ ", joindate=" + joindate + ", personalstatus=" + personalstatus + ", statusstartdate="
				+ statusstartdate + ", registeredresidencetype=" + registeredresidencetype + ", registeredresidence="
				+ registeredresidence + ", nativeplace=" + nativeplace + ", address=" + address + ", telphone="
				+ telphone + ", mobilephone=" + mobilephone + ", fax=" + fax + ", email=" + email + ", dr=" + dr
				+ ", descflexfieldPubdescseg1=" + descflexfieldPubdescseg1 + ", descflexfieldPubdescseg2="
				+ descflexfieldPubdescseg2 + ", descflexfieldPubdescseg3=" + descflexfieldPubdescseg3
				+ ", descflexfieldPubdescseg4=" + descflexfieldPubdescseg4 + ", descflexfieldPubdescseg5="
				+ descflexfieldPubdescseg5 + ", descflexfieldPubdescseg6=" + descflexfieldPubdescseg6
				+ ", descflexfieldPubdescseg7=" + descflexfieldPubdescseg7 + ", descflexfieldPubdescseg8="
				+ descflexfieldPubdescseg8 + ", descflexfieldPubdescseg9=" + descflexfieldPubdescseg9
				+ ", descflexfieldPubdescseg10=" + descflexfieldPubdescseg10 + ", descflexfieldPubdescseg11="
				+ descflexfieldPubdescseg11 + ", descflexfieldPubdescseg12=" + descflexfieldPubdescseg12
				+ ", descflexfieldPubdescseg13=" + descflexfieldPubdescseg13 + ", descflexfieldPubdescseg14="
				+ descflexfieldPubdescseg14 + ", descflexfieldPubdescseg15=" + descflexfieldPubdescseg15
				+ ", descflexfieldPubdescseg16=" + descflexfieldPubdescseg16 + ", descflexfieldPubdescseg17="
				+ descflexfieldPubdescseg17 + ", descflexfieldPubdescseg18=" + descflexfieldPubdescseg18
				+ ", descflexfieldPubdescseg19=" + descflexfieldPubdescseg19 + ", descflexfieldPubdescseg20="
				+ descflexfieldPubdescseg20 + ", descflexfieldPubdescseg21=" + descflexfieldPubdescseg21
				+ ", descflexfieldPubdescseg22=" + descflexfieldPubdescseg22 + ", descflexfieldPubdescseg23="
				+ descflexfieldPubdescseg23 + ", descflexfieldPubdescseg24=" + descflexfieldPubdescseg24
				+ ", descflexfieldPubdescseg25=" + descflexfieldPubdescseg25 + ", descflexfieldPubdescseg26="
				+ descflexfieldPubdescseg26 + ", descflexfieldPubdescseg27=" + descflexfieldPubdescseg27
				+ ", descflexfieldPubdescseg28=" + descflexfieldPubdescseg28 + ", descflexfieldPubdescseg29="
				+ descflexfieldPubdescseg29 + ", descflexfieldPubdescseg30=" + descflexfieldPubdescseg30
				+ ", descflexfieldPubdescseg31=" + descflexfieldPubdescseg31 + ", descflexfieldPubdescseg32="
				+ descflexfieldPubdescseg32 + ", descflexfieldPubdescseg33=" + descflexfieldPubdescseg33
				+ ", descflexfieldPubdescseg34=" + descflexfieldPubdescseg34 + ", descflexfieldPubdescseg35="
				+ descflexfieldPubdescseg35 + ", descflexfieldPubdescseg36=" + descflexfieldPubdescseg36
				+ ", descflexfieldPubdescseg37=" + descflexfieldPubdescseg37 + ", descflexfieldPubdescseg38="
				+ descflexfieldPubdescseg38 + ", descflexfieldPubdescseg39=" + descflexfieldPubdescseg39
				+ ", descflexfieldPubdescseg40=" + descflexfieldPubdescseg40 + ", descflexfieldPubdescseg41="
				+ descflexfieldPubdescseg41 + ", descflexfieldPubdescseg42=" + descflexfieldPubdescseg42
				+ ", descflexfieldPubdescseg43=" + descflexfieldPubdescseg43 + ", descflexfieldPubdescseg44="
				+ descflexfieldPubdescseg44 + ", descflexfieldPubdescseg45=" + descflexfieldPubdescseg45
				+ ", descflexfieldPubdescseg46=" + descflexfieldPubdescseg46 + ", descflexfieldPubdescseg47="
				+ descflexfieldPubdescseg47 + ", descflexfieldPubdescseg48=" + descflexfieldPubdescseg48
				+ ", descflexfieldPubdescseg49=" + descflexfieldPubdescseg49 + ", descflexfieldPubdescseg50="
				+ descflexfieldPubdescseg50 + ", descflexfieldContextvalue=" + descflexfieldContextvalue
				+ ", descflexfieldPrivatedescseg1=" + descflexfieldPrivatedescseg1 + ", descflexfieldPrivatedescseg2="
				+ descflexfieldPrivatedescseg2 + ", descflexfieldPrivatedescseg3=" + descflexfieldPrivatedescseg3
				+ ", descflexfieldPrivatedescseg4=" + descflexfieldPrivatedescseg4 + ", descflexfieldPrivatedescseg5="
				+ descflexfieldPrivatedescseg5 + ", descflexfieldPrivatedescseg6=" + descflexfieldPrivatedescseg6
				+ ", descflexfieldPrivatedescseg7=" + descflexfieldPrivatedescseg7 + ", descflexfieldPrivatedescseg8="
				+ descflexfieldPrivatedescseg8 + ", descflexfieldPrivatedescseg9=" + descflexfieldPrivatedescseg9
				+ ", descflexfieldPrivatedescseg10=" + descflexfieldPrivatedescseg10
				+ ", descflexfieldPrivatedescseg11=" + descflexfieldPrivatedescseg11
				+ ", descflexfieldPrivatedescseg12=" + descflexfieldPrivatedescseg12
				+ ", descflexfieldPrivatedescseg13=" + descflexfieldPrivatedescseg13
				+ ", descflexfieldPrivatedescseg14=" + descflexfieldPrivatedescseg14
				+ ", descflexfieldPrivatedescseg15=" + descflexfieldPrivatedescseg15
				+ ", descflexfieldPrivatedescseg16=" + descflexfieldPrivatedescseg16
				+ ", descflexfieldPrivatedescseg17=" + descflexfieldPrivatedescseg17
				+ ", descflexfieldPrivatedescseg18=" + descflexfieldPrivatedescseg18
				+ ", descflexfieldPrivatedescseg19=" + descflexfieldPrivatedescseg19
				+ ", descflexfieldPrivatedescseg20=" + descflexfieldPrivatedescseg20
				+ ", descflexfieldPrivatedescseg21=" + descflexfieldPrivatedescseg21
				+ ", descflexfieldPrivatedescseg22=" + descflexfieldPrivatedescseg22
				+ ", descflexfieldPrivatedescseg23=" + descflexfieldPrivatedescseg23
				+ ", descflexfieldPrivatedescseg24=" + descflexfieldPrivatedescseg24
				+ ", descflexfieldPrivatedescseg25=" + descflexfieldPrivatedescseg25
				+ ", descflexfieldPrivatedescseg26=" + descflexfieldPrivatedescseg26
				+ ", descflexfieldPrivatedescseg27=" + descflexfieldPrivatedescseg27
				+ ", descflexfieldPrivatedescseg28=" + descflexfieldPrivatedescseg28
				+ ", descflexfieldPrivatedescseg29=" + descflexfieldPrivatedescseg29
				+ ", descflexfieldPrivatedescseg30=" + descflexfieldPrivatedescseg30 + ", ts=" + ts + "]";
	}

}