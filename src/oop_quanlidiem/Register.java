package oop_quanlidiem;

public class Register {
	private Course course;
	private float grade;
	
	public Register(Course course) {
		super();
		this.course = course;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	public float getCredits() {
		return course.getCredits();
	}
}
