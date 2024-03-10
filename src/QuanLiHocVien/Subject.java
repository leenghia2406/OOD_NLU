package QuanLiHocVien;

public class Subject {
	String nameSub;
	int numOfCredits;
	Teacher teach;
	public Subject(String nameSub, int numOfCredits, Teacher teach) {
		super();
		this.nameSub = nameSub;
		this.numOfCredits = numOfCredits;
		this.teach = teach;
	}
	public String getNameSub() {
		return nameSub;
	}
	public void setNameSub(String nameSub) {
		this.nameSub = nameSub;
	}
	public int getNumOfCredits() {
		return numOfCredits;
	}
	public void setNumOfCredits(int numOfCredits) {
		this.numOfCredits = numOfCredits;
	}
	public Teacher getTeach() {
		return teach;
	}
	public void setTeach(Teacher teach) {
		this.teach = teach;
	}
	
	
}
