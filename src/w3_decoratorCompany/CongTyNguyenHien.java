package w3_decoratorCompany;

import java.util.ArrayList;
import java.util.List;

public class CongTyNguyenHien {
	private List<KhachHang> danhSachKhachHang;
	private String name;
	public CongTyNguyenHien(String ten) {
		super();
		// TODO Auto-generated constructor stub
		this.name=ten;
		danhSachKhachHang = new ArrayList<>();
	}

	public void addKH(KhachHang kh) {
		danhSachKhachHang.add(kh);
	}

	public double tongDoanhThu() {
		// System.out.println(danhSachKhachHang.size());
		double doanhthu = 0;
		for (int i = 0; i < danhSachKhachHang.size(); i++) {
			// System.out.println(danhSachKhachHang.get(i).thanhTien());
			doanhthu += danhSachKhachHang.get(i).ThanhToan();
		}
		return doanhthu;
	}

	public void inTCaHoaDon() {
		for (int i = 0; i < danhSachKhachHang.size(); i++) {
			System.out.println("Khach Hang " + "0" + (i + 1));
			danhSachKhachHang.get(i).hoaDon();
			System.out.println("=================================================================\n");
		}
		System.out.println();
		System.out.println("Tong so tien tu vab : " + tongDoanhThu()+" $");
	}

	public static void main(String[] args) {
		CongTyNguyenHien cty = new CongTyNguyenHien("Nguyen Hien");
		XayDungComponent list = new TronGoi();
		list = new ThayDoiMauSon(list);
		list = new ThietKeCanhQuan(list);
		KhachHang kh1 = new KhachHang("KH001", "Nguyen Khanh Duy", list);

		XayDungComponent list2 = new XayTho();
		list2 = new ThayDoiMauSon(list2);
		list2 = new ThietKeCanhQuan(list2);
		KhachHang kh2 = new KhachHang("KH002", "Binh Khanh An", list2);
		XayDungComponent list3 = new ThayDoiMauSon();//new TronGoi();
		KhachHang kh3 = new KhachHang("KH003", "Binh Khanh An", list3);
		XayDungComponent list4 = new TronGoi();
		KhachHang kh4 = new KhachHang("KH003", "Phan Khanh An", list4);
		cty.addKH(kh1);
		cty.addKH(kh2);
		cty.addKH(kh3);
		cty.addKH(kh4);
		System.out.println("DANH SACH KHACH HANG CAN THONG TIN TU VAN Cua Cong Ty "+ cty.name);
		System.out.println("=================================================================\n");
		cty.inTCaHoaDon();

	}

}
