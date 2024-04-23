package decorator;

import java.util.ArrayList;
import java.util.List;

public class CongTy {
	private String tenCongTy;
	private List<KhachHang> dsKH;
	
	public CongTy(String tenCongTy, List<KhachHang> dsKH) {
		super();
		this.tenCongTy = tenCongTy;
		this.dsKH = dsKH;
	}
	
	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public List<KhachHang> getDsKH() {
		return dsKH;
	}

	public void setDsKH(List<KhachHang> dsKH) {
		this.dsKH = dsKH;
	}

	public double tongDoanhThu() {
		double tongDoanhThu = 0;
		for (KhachHang khachHang : dsKH) {
			tongDoanhThu += khachHang.tinhTongTien();
			
		}
		return tongDoanhThu;
	}
	public void inHoaDon() {
		for (KhachHang khachHang : dsKH) {
			System.out.println("Ma Khach Hang: "+ khachHang.getMaKH() + "\t Ten khach hang: "+ khachHang.getTenKH());
			System.out.println("Noi dung: ");khachHang.getThongTin();
			System.out.println("Don gia: \t\t"+ khachHang.tinhTongTien());
			System.out.println("Tong tien: \t\t"+ khachHang.tinhTongTien());
		}
		System.out.println("Tong Doanh Thu: \t"+ tongDoanhThu());
	}
	public static void main(String[] args) {
		XayNha xayNha01 = new XayNhaTronGoi();
		XayNha xayNha02 = new ThayDoiMauSon();
		List<XayNha> xn01 = new ArrayList<>();
		xn01.add(xayNha01);
		xn01.add(xayNha02);
		KhachHang kh01 = new KhachHang("Kim Ri Cha", "KH01", xn01);
		List<XayNha> xn02 = new ArrayList<>();
		XayNha xayNha03 = new ThietKeCanhQuan();
		xn02.add(xayNha03);
		xn02.add(xayNha01);
		xn02.add(xayNha02);
		KhachHang kh02 = new KhachHang("Le Quang Liem", "KH02", xn02);
		List<KhachHang> dsKH01 = new ArrayList<>();
		dsKH01.add(kh01);
		dsKH01.add(kh02);
		CongTy congty1 = new CongTy("Nguyen Hien", dsKH01);
		congty1.inHoaDon();
		
	}
}
