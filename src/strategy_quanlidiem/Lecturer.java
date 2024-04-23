package strategy_quanlidiem;

import java.util.Date;

public class Lecturer {
	private String name;
	private Date dateOfBirth;
	private String degree;
	
	public Lecturer(String name, Date dateOfBirth, String degree) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.degree = degree;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return getDegree() + " " +getName();
	}
	
}
