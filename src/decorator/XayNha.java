package decorator;

public abstract class XayNha {
	protected String maLoai;
	protected String ten;
	protected double donGia;
	
	public XayNha() {
		super();
	}
	public XayNha(String maLoai) {
		super();
		this.maLoai = maLoai;
	}
	public String getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public abstract String thongTin();
	public abstract double chiPhi();
}
