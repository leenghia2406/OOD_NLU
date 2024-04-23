package w2_observerShop;

public class SanPham {
	protected String maSP;
	protected String tenSP;
	protected double donGia;
	protected String noiSX;
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SanPham(String maSP, String tenSP, double donGia, String noiSX) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.noiSX = noiSX;
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public String getNoiSX() {
		return noiSX;
	}
	public void setNoiSX(String noiSX) {
		this.noiSX = noiSX;
	}
	

}
