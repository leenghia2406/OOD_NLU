package w2_observerShop;

import java.util.ArrayList;
import java.util.List;

public class TestShop {
private List<KhachHang> danhSachKhachHang;
	
	public TestShop() {
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
			doanhthu+=danhSachKhachHang.get(i).thanhtien();
		}
		return doanhthu;
	}
	
	public void hoaDon(KhachHang ks) {
		//KhachHangVIP vip = (KhachHangVIP) ks;
		System.out.println("Ma KH:"+ ks.maKH+"\t"+"Ten Khach Hang: "+ks.tenK+"\n"
				+"Diem thuong: "+ (ks instanceof KhachHangVIP?((KhachHangVIP) ks).getDiemTichLuy():0));
		System.out.println("Danh sach don hang:");
		System.out.println("STT" +"\t\t"+"Ma SanPham"+"\t\t"+"Ten San Pham"+"\t\t"+"Don Gia");
		for(int i=0;i<ks.listSP.size();i++) {
			System.out.println((i+1) +"\t\t"+ks.listSP.get(i).maSP+"\t\t"+ks.listSP.get(i).tenSP+"\t\t"+ks.listSP.get(i).donGia);
		}
	}


	public void inTCaHoaDon() {
		for (int i = 0; i < danhSachKhachHang.size(); i++) {
			System.out.println("Khach Hang "+"0"+(i+1));
			hoaDon(danhSachKhachHang.get(i));
			System.out.println("Tong thanh tien : " +danhSachKhachHang.get(i).thanhtien() );
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		TestShop ch= new TestShop();
		List<SanPham> list1 = new ArrayList<>();
		list1.add(new ThoiTrang("AO_001", "AOSOMI", 100000, "VIET TIEN",3));
		list1.add(new MyPham("NUOCHOA_002", "CHAME", 100000,"VIET NAM",new Date(1, 1, 2024), new Date(30, 1, 2024)));
		KhachHangVIP KH1= new KhachHangVIP("VIP001","An",70,new Date(1, 1, 1970),"099999999",list1);
		
		List<SanPham> list2 = new ArrayList<>();
		list2.add(new ThoiTrang("DAMO_001", "AOSOMI", 180000, "K&K FASHION",3));
		list2.add(new MyPham("KEM_002", "KEM CHONG NANG", 200000,"VIET NAM",new Date(1, 1, 2024), new Date(30, 1, 2024)));
		KhachHangTHUONG KH2= new KhachHangTHUONG("KH001","Binh Phuong",new Date(9, 1, 1990),"8888888",list2);
		List<SanPham> list3 = new ArrayList<>();
		list3.add(new ThoiTrang("DAMO_001", "AOSOMI", 180000, "K&K FASHION",3));
		list3.add(new MyPham("KEM_002", "KEM CHONG NANG", 200000,"VIET NAM",new Date(1, 1, 2024), new Date(30, 1, 2024)));
		KhachHangVIP KH3= new KhachHangVIP("VIP002","Xuan Anh",-1,new Date(1, 1, 1981),"777999999",list3);
		ch.addKH(KH1);
		ch.addKH(KH2);
		ch.addKH(KH3);
	
		CuaHangSubject SHOP = new CuaHangSubject("Cong Ty xyz");
		SHOP.registerObserverKM(KH1);
		SHOP.registerObserverSPM(KH1);
		SHOP.registerObserverKM(KH2);
		SHOP.registerObserverSPM(KH3);
		SHOP.registerObserverKM(KH3);
		SHOP.setNewsKM("Chuong trinh giam gia 20%");
		SHOP.setNewsSPM("Cong Ty moi ra Bo San Pham moi!");
		SHOP.removeObserverKM(KH1);
		SHOP.setNewsKM("Chuong trinh giam gia 20%");
		SHOP.setNewsSPM("Cong Ty moi ra Bo San Pham moi!");
		
		System.out.println("===Tong Doanh Thu cua hang=======\n");
		System.out.println("Tong doanh thu: "+ch.tongDoanhThu());
		
		System.out.println("==In hoa don =======\n");
		ch.inTCaHoaDon();
	}

}
