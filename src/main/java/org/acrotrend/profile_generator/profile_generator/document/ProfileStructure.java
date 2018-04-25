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
	/*private String aboutMe;
	private String topQualification;
	private String certification;
	private String jobRole;
	private String YearsExperience;
	private String MonthExperience;
	private String Sector;
	private String Client;
	private String skillSetTech;
	private String skillSetTool;
	private String skillSetArch;
	private String domain;
	private String customerIA;
	*/
	
	public ProfileStructure(Integer id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
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
