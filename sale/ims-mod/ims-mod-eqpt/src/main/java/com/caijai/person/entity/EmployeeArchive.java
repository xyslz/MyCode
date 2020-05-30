package com.caijai.person.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Relation;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
 * 员工记录表
 * @author Administrator
 *
 */
@Table(name = "SYS_EmployeeArchive")
public class EmployeeArchive extends BaseTable{

	private static final long serialVersionUID = 150093983172681542L;
	
	@Column(name = "ID", primary = true)
	private String id;
	
	@Column(name = "CreatedOn")
	private String createdOn;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "ModifiedOn")
	private String modifiedOn;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "SysVersion")
	private String sysVersion;

	@Column(name = "CreateOrg")
	private String createOrg;

	@Column(name = "OwnerOrg")
	private String ownerOrg;

	@Column(name = "WorkingOrg")
	private String workingOrg;

	@Column(name = "PersonCategory")
	private String personCategory;
	
	@Column(name = "personCategoryCode",readonly = true)
	@Relation(table = "SYS_EmployCategory", value = "ID", show = "code", ref = "PersonCategory")
	private String personCategoryCode;

	@Column(name = "EmployeeCode")
	private String employeeCode;

	@Column(name = "BusinessOrg")
	private String businessOrg;

	@Column(name = "Dept")
	private String dept;

	@Column(name = "Job")
	private String job;

	@Column(name = "Position")
	private String position;

	@Column(name = "JobLevel")
	private String jobLevel;

	@Column(name = "InnerAge")
	private String innerAge;

	@Column(name = "InnerAgeValue")
	private String innerAgeValue;

	@Column(name = "EntranceType")
	private Integer entranceType;

	@Column(name = "EntranceDate")
	private String entranceDate;

	@Column(name = "EntranceEndDate")
	private String entranceEndDate;

	@Column(name = "EntranceDoc")
	private String entranceDoc;

	@Column(name = "Person")
	private String person;
	
	@Column(name = "personMail",readonly = true)
	@Relation(table = "SYS_Person", value = "ID", show = "email", ref = "person")
	private String personMail;
	
	//区分维修班组人员
	@Column(name = "personClass",readonly = true)
	@Relation(table = "SYS_Department", value = "ID", show = "DescFlexField_PrivateDescSeg5", ref = "dept")
	private String personClass;

	@Column(name = "Name")
	private String name;

	@Column(name = "BuilderEmpCode")
	private String builderEmpCode;

	@Column(name = "Resource")
	private String resource;

	@Column(name = "dr")
	private Integer dr;

	@Column(name = "ts")
	private String ts;

	@Column(name = "sys_source")
	private String sysSource;

	public String getPersonClass() {
		return personClass;
	}

	public void setPersonClass(String personClass) {
		this.personClass = personClass;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPersonCategoryCode() {
		return personCategoryCode;
	}

	public void setPersonCategoryCode(String personCategoryCode) {
		this.personCategoryCode = personCategoryCode;
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

	public String getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getCreateOrg() {
		return createOrg;
	}

	public void setCreateOrg(String createOrg) {
		this.createOrg = createOrg;
	}

	public String getOwnerOrg() {
		return ownerOrg;
	}

	public void setOwnerOrg(String ownerOrg) {
		this.ownerOrg = ownerOrg;
	}

	public String getWorkingOrg() {
		return workingOrg;
	}

	public void setWorkingOrg(String workingOrg) {
		this.workingOrg = workingOrg;
	}

	public String getPersonCategory() {
		return personCategory;
	}

	public void setPersonCategory(String personCategory) {
		this.personCategory = personCategory;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getBusinessOrg() {
		return businessOrg;
	}

	public void setBusinessOrg(String businessOrg) {
		this.businessOrg = businessOrg;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}

	public String getInnerAge() {
		return innerAge;
	}

	public void setInnerAge(String innerAge) {
		this.innerAge = innerAge;
	}

	public String getInnerAgeValue() {
		return innerAgeValue;
	}

	public void setInnerAgeValue(String innerAgeValue) {
		this.innerAgeValue = innerAgeValue;
	}

	public Integer getEntranceType() {
		return entranceType;
	}

	public void setEntranceType(Integer entranceType) {
		this.entranceType = entranceType;
	}

	public String getEntranceDate() {
		return entranceDate;
	}

	public void setEntranceDate(String entranceDate) {
		this.entranceDate = entranceDate;
	}

	public String getEntranceEndDate() {
		return entranceEndDate;
	}

	public void setEntranceEndDate(String entranceEndDate) {
		this.entranceEndDate = entranceEndDate;
	}

	public String getEntranceDoc() {
		return entranceDoc;
	}

	public void setEntranceDoc(String entranceDoc) {
		this.entranceDoc = entranceDoc;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBuilderEmpCode() {
		return builderEmpCode;
	}

	public void setBuilderEmpCode(String builderEmpCode) {
		this.builderEmpCode = builderEmpCode;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
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

	public String getSysSource() {
		return sysSource;
	}

	public void setSysSource(String sysSource) {
		this.sysSource = sysSource;
	}

	public String getPersonMail() {
		return personMail;
	}

	public void setPersonMail(String personMail) {
		this.personMail = personMail;
	}

	@Override
	public String toString() {
		return "EmployeeArchive [id=" + id + ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", modifiedOn="
				+ modifiedOn + ", modifiedBy=" + modifiedBy + ", sysVersion=" + sysVersion + ", createOrg=" + createOrg
				+ ", ownerOrg=" + ownerOrg + ", workingOrg=" + workingOrg + ", personCategory=" + personCategory
				+ ", personCategoryCode=" + personCategoryCode + ", employeeCode=" + employeeCode + ", businessOrg="
				+ businessOrg + ", dept=" + dept + ", job=" + job + ", position=" + position + ", jobLevel=" + jobLevel
				+ ", innerAge=" + innerAge + ", innerAgeValue=" + innerAgeValue + ", entranceType=" + entranceType
				+ ", entranceDate=" + entranceDate + ", entranceEndDate=" + entranceEndDate + ", entranceDoc="
				+ entranceDoc + ", person=" + person + ", personMail=" + personMail + ", personClass=" + personClass
				+ ", name=" + name + ", builderEmpCode=" + builderEmpCode + ", resource=" + resource + ", dr=" + dr
				+ ", ts=" + ts + ", sysSource=" + sysSource + "]";
	}
	
}
