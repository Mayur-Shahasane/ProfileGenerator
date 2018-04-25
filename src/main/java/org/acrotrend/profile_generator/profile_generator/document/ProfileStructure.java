package org.acrotrend.profile_generator.profile_generator.document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "UserProfile")
public class ProfileStructure 
{
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private String aboutMe;
	private String topQualification;
	private String commonCertifications;
	private String extraCertifications;
	private String roleName;
	private String yearExperience;
	private String monthExperience;
	private String sector;
	private String sectorFree;
	private String clientList;
	private String clientListFree;
	private String tech;
	private String tool;
	private String arch;
	private String domain;
	private String customerInsight;
	private String customerInsightFree;
	
	
	public ProfileStructure(Integer id, String firstName, String lastName, String aboutMe,
			String topQualification, String commonCertifications, String extraCertifications,
			String roleName, String yearExperience, String monthExperience, String sector, String sectorFree,
			String clientList, String clientListFree, String tech, String tool, String arch, String domain,
			String customerInsight, String customerInsightFree) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.aboutMe = aboutMe;
		this.topQualification = topQualification;
		this.commonCertifications = commonCertifications;
		this.extraCertifications = extraCertifications;
		this.roleName = roleName;
		this.yearExperience = yearExperience;
		this.monthExperience = monthExperience;
		this.sector = sector;
		this.sectorFree = sectorFree;
		this.clientList = clientList;
		this.clientListFree = clientListFree;
		this.tech = tech;
		this.tool = tool;
		this.arch = arch;
		this.domain = domain;
		this.customerInsight = customerInsight;
		this.customerInsightFree = customerInsightFree;
	}
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	public String getTopQualification() {
		return topQualification;
	}
	public void setTopQualification(String topQualification) {
		this.topQualification = topQualification;
	}
	public String getCommonCertifications() {
		return commonCertifications;
	}
	public void setCommonCertifications(String commonCertifications) {
		this.commonCertifications = commonCertifications;
	}
	public String getExtraCertifications() {
		return extraCertifications;
	}
	public void setExtraCertifications(String extraCertifications) {
		this.extraCertifications = extraCertifications;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getYearExperience() {
		return yearExperience;
	}
	public void setYearExperience(String yearExperience) {
		this.yearExperience = yearExperience;
	}
	public String getMonthExperience() {
		return monthExperience;
	}
	public void setMonthExperience(String monthExperience) {
		this.monthExperience = monthExperience;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getSectorFree() {
		return sectorFree;
	}
	public void setSectorFree(String sectorFree) {
		this.sectorFree = sectorFree;
	}
	public String getClientList() {
		return clientList;
	}
	public void setClientList(String clientList) {
		this.clientList = clientList;
	}
	public String getClientListFree() {
		return clientListFree;
	}
	public void setClientListFree(String clientListFree) {
		this.clientListFree = clientListFree;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	public String getArch() {
		return arch;
	}
	public void setArch(String arch) {
		this.arch = arch;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getCustomerInsight() {
		return customerInsight;
	}
	public void setCustomerInsight(String customerInsight) {
		this.customerInsight = customerInsight;
	}
	public String getCustomerInsightFree() {
		return customerInsightFree;
	}
	public void setCustomerInsightFree(String customerInsightFree) {
		this.customerInsightFree = customerInsightFree;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
