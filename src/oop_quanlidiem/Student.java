package oop_quanlidiem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
	private String name;
	private Date dateOfBith;
	private Lecturer assistant;
	private List<Register> courseRegister = new ArrayList<Register>();
	
	public Student(String name, Date dateOfBith) {
		super();
		this.name = name;
		this.dateOfBith = dateOfBith;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBith() {
		return dateOfBith;
	}

	public void setDateOfBith(Date dateOfBith) {
		this.dateOfBith = dateOfBith;
	}

	public Lecturer getAssistant() {
		return assistant;
	}

	public void setAssistant(Lecturer assistant) {
		this.assistant = assistant;
	}

	public List<Register> getCourseRegister() {
		return courseRegister;
	}

	public void setCourseRegister(List<Register> courseRegister) {
		this.courseRegister = courseRegister;
	}

	// đăng kí môn
	public void register(Course c) {
		courseRegister.add(new Register(c));
	}
	// thay đổi điểm của môn học
	public void updateGrade(Course c, float grade) {
		for (Register register : courseRegister) {
			if (register.getCourse().getName().equals(c.getName())) {
				register.setGrade(grade);
				break;
			}
		}
	}
	// điểm trung bình học kì
	public float averageOfGrade() {
		float sum = 0;
		int creditTotal = 0;
		for (Register register : courseRegister) {
			creditTotal += register.getCredits();
			sum += register.getGrade() * register.getCredits();
		}
		return sum / creditTotal;
	}
	public String rank() {
		float average = averageOfGrade();
		if (average >= 9) {
			return "XUẤT SẮC";
		}else if (average >= 8) {
			return "GIỎI";
		}else if (average >= 7) {
			return "KHÁ";
		}else if (average >= 6) {
			return "TRUNG BÌNH KHÁ";
		}else if (average >= 5) {
			return "TRUNG BÌNH";
		}else {
			return "RỚT";
		}
	}
	public void printGradeReport() {
		System.out.println("Name: "+ getName());
		System.out.println("DATE OF BIRTH: "+ getDateOfBith());
		System.out.println("STT\tMon\tDiem");
		for (int i = 0; i < courseRegister.size(); i++) {
			System.out.println(i + "\t"
					+ courseRegister.get(i).getCourse().getName() + "\t"
					+ courseRegister.get(i).getGrade());
		}
		System.out.println("AVERAGE SCORE: "+ averageOfGrade());
		System.out.println("RANK: "+ rank());
		System.out.println("-------------");
	}
	@Override
	public String toString() {
		return getName() +" "+ getDateOfBith();
	}
	
	
}
