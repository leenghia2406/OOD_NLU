package w3_decoratorCompany;

public abstract class XayDungComponent {
	protected String maLoai;
	protected String ten;
	protected double dongia;
	
	public XayDungComponent() {
		super();
		// TODO Auto-generated constructor stu
		dongia = 40000;
	}

	public XayDungComponent(String maLoai, String ten) {
		super();
		this.maLoai = maLoai;
		this.ten = ten;
		this.dongia = 40000;
	}

	public String thongTinXayNha() {
		return ten;
	}

	public abstract double chiPhi();

}
