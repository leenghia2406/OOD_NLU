package w1_strategyCuaHang;

import java.util.ArrayList;
import java.util.List;

public class CuaHang {
	private List<KhachHang> danhSachKhachHang;
	
	public CuaHang() {
		super();
		// TODO Auto-generated constructor stub
		danhSachKhachHang= new ArrayList<>();
	}

	public void addKH(KhachHang kh) {
		danhSachKhachHang.add(kh);
	}
	
	public double tongDoanhThu() {
		//System.out.println(danhSachKhachHang.size());
		double doanhthu=0;
		for (int i = 0; i < danhSachKhachHang.size(); i++) {
			//System.out.println(danhSachKhachHang.get(i).thanhTien());
			doanhthu+=danhSachKhachHang.get(i).thanhTien();
		}
		return doanhthu;
	}
	
	public void hoaDon(KhachHang ks) {
		System.out.println("Ma KH:"+ ks.maKH+"\t"+"Ten Khach Hang: "+ks.tenKH+"\n"
				+"Diem thuong: "+ks.diemThuong+"");
		System.out.println("Danh sach don hang:");
		System.out.println("STT" +"\t\t"+"Ma SanPham"+"\t\t"+"Ten San Pham"+"\t\t"+"Don Gia");
		for(int i=0;i<ks.listHH.size();i++) {
			System.out.println((i+1) +"\t\t"+ks.listHH.get(i).maMH+"\t\t"+ks.listHH.get(i).tenMH+"\t\t"+ks.listHH.get(i).gia);
		}
	}

	public void inTCaHoaDon() {
		for (int i = 0; i < danhSachKhachHang.size(); i++) {
			System.out.println("Khach Hang "+"0"+(i+1));
			hoaDon(danhSachKhachHang.get(i));
			System.out.println("Tong thanh tien : " +danhSachKhachHang.get(i).thanhTien() );
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		CuaHang ch= new CuaHang();
		List<SanPham> list1 = new ArrayList<>();
		list1.add(new ThucPham("TP001", "Banh in", 100000, new Date(1, 1, 2024), new Date(30, 1, 2024)));
		list1.add(new HangDienMay("DM002", "Lo Vi Song", 100000,2,200,400));
		KhachHang KH1= new KhachHangThanhToanChuyenKhoanHDDuoiMotTrieu("KH001","An",new Date(1, 1, 1970),0,list1);
		
		List<SanPham> list2 = new ArrayList<>();
		list2.add(new ThucPham("TP002", "Banh Mi", 80000, new Date(1, 1, 2024), new Date(30, 1, 2024)));
		list2.add(new HangDienMay("DM002", "Noi chien khong dau", 90000,2,200,400));
		KhachHang KH2= new KhachHangThanhToanTienMatHDDuoiMotTrieu("KH002","Trang",new Date(1, 1, 1981),0,list2);
		List<SanPham> list3 = new ArrayList<>();
		list3.add(new ThucPham("TP002", "Banh Mi", 200000, new Date(1, 1, 2024), new Date(30, 1, 2024)));
		list3.add(new HangDienMay("DM002", "Noi chien khong dau", 150000,2,200,400));
		KhachHang KH3= new KhachHangThanhToanTienMatHDTrenMotTrieu("KH002","Xuan Anh",new Date(1, 1, 1981),0,list3);
		ch.addKH(KH1);
		ch.addKH(KH2);
		ch.addKH(KH3);
	
		System.out.println("===Tong Doanh Thu cua hang=======\n");
		System.out.println("Tong doanh thu: "+ch.tongDoanhThu());
		
		System.out.println("==In hoa don =======\n");
		ch.inTCaHoaDon();
	}
}
