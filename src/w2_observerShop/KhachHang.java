package w2_observerShop;

import java.util.List;

public abstract class KhachHang {
	protected String maKH;
	protected String tenK;
	protected Date ngaySinh;
	private String sodienthoai;
	protected List<SanPham> listSP;
	boolean flagNhanKM;
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
		flagNhanKM=false;
	}
	public KhachHang(String maKH, String tenK, Date ngaySinh,String sodienthoai, List<SanPham> listSP) {
		super();
		this.maKH = maKH;
		this.tenK = tenK;
		this.ngaySinh = ngaySinh;
		this.sodienthoai=sodienthoai;
		this.sodienthoai=sodienthoai;
		this.listSP = listSP;
		flagNhanKM=false;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenK() {
		return tenK;
	}
	public void setTenK(String tenK) {
		this.tenK = tenK;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public List<SanPham> getListSP() {
		return listSP;
	}
	public void setListSP(List<SanPham> listSP) {
		this.listSP = listSP;
	}
	
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public boolean isFlagNhanKM() {
		return flagNhanKM;
	}
	public void setFlagNhanKM(boolean flagNhanKM) {
		this.flagNhanKM = flagNhanKM;
	}
	public abstract double thanhtien();
}
