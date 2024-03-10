package QuanLiHocVien;

public class Teacher {
	String nameTeacher;
	String dateOfBirth;
	String education;
	public Teacher(String name, String dateOfBirth, String education) {
		super();
		this.nameTeacher = name;
		this.dateOfBirth = dateOfBirth;
		this.education = education;
	}
	public String getName() {
		return nameTeacher;
	}
	public void setName(String name) {
		this.nameTeacher = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	
}
