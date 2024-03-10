package QuanLiHocVien;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String nameSt;
	String dateOfBirth;
	Teacher teacher;
	List<Subject> lisSub = new ArrayList<>();
	public Student(String nameSt, String dateOfBirth, Teacher teacher, List<Subject> lisSub) {
		super();
		this.nameSt = nameSt;
		this.dateOfBirth = dateOfBirth;
		this.teacher = teacher;
		this.lisSub = lisSub;
	}
	public String getNameSt() {
		return nameSt;
	}
	public void setNameSt(String nameSt) {
		this.nameSt = nameSt;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List<Subject> getLisSub() {
		return lisSub;
	}
	public void setLisSub(List<Subject> lisSub) {
		this.lisSub = lisSub;
	}
	@Override
	public String toString() {
		return "Student [nameSt=" + nameSt + ", dateOfBirth=" + dateOfBirth + ", teacher=" + teacher + ", lisSub="
				+ lisSub + "]";
	}
	
	
	
}
