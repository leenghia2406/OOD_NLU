package decorator;

import java.util.List;

public class KhachHang {
	private String tenKH;
	private String maKH;
	private List<XayNha> xayNha;
	
	
	public KhachHang(String tenKH, String maKH, List<XayNha> xayNha) {
		super();
		this.tenKH = tenKH;
		this.maKH = maKH;
		this.xayNha = xayNha;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public List<XayNha> getXayNha() {
		return xayNha;
	}

	public void setXayNha(List<XayNha> xayNha) {
		this.xayNha = xayNha;
	}
	public double tinhTongTien() {
		double tongtien = 0;
		for (XayNha xn : xayNha) {
			tongtien += xn.chiPhi();
		}
		return tongtien;
	}
	public void getThongTin() {
		for (XayNha xn : xayNha) {
			System.out.println(xn.thongTin());
		}
	}
	
}
