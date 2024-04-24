package w4_factoryKhachSan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoKhachSan {
	List<KhachHang> list;
	
	public DemoKhachSan() {
		super();
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
	}
	
	public void addKhachHang(KhachHang kh) {
		list.add(kh);
	}
	
	public double tongDoanhThu() {
		double sum=0;
		for (KhachHang khachHang : list) {
			sum+=khachHang.thanhTien();
		}
		return sum;
	}
	
	public void inTCaHoaDon() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Khach Hang " + "0" + (i + 1));
			list.get(i).hoaDon();
			System.out.println("=================================================================\n");
			
			
		}
		System.out.println();
		System.out.println("Tong doanh thu cua Khach San : " + tongDoanhThu()+" VND");
	}
	
	public KhachHang sudungMaxDV(Date start, Date end) {
		KhachHang max=list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if(list.get(i).demSoDVSD(start, end)>max.demSoDVSD(start, end)) {
				max=list.get(i);
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		DemoKhachSan demo= new DemoKhachSan();
		KhachSan ksThuong= new DatPhongThuong();
		ProductPhong phongThuong= ksThuong.taoPhong("thuong");
		KhachHang kh1 = new KhachHang("KH001", "An", "Viet Nam", 200.0, 
				phongThuong, new Date(2,2,2004), new Date(12,2,2004));
		
		ProductPhong phongThuong2= ksThuong.taoPhong("thuong");
		KhachHang kh2 = new KhachHang("KH002", "Binh", "Viet Nam", 0.0, 
				phongThuong2, new Date(1,2,2004), new Date(2,2,2004));
		
		KhachSan ksVip= new DatPhongVip();
		ProductPhong phongVip=ksVip.taoPhong("vip");
		
		ProductPhong phongVip2= ksVip.taoPhong("vip");

		DichVuProduct an=ksVip.taoDichVu("an");
		DichVuProduct tam=ksVip.taoDichVu("tam");
		DichVuProduct kara=ksVip.taoDichVu("kara");
		DichVuProduct xe=ksVip.taoDichVu("xe");
		Set<DichVuProduct> list1= new HashSet<>();
		list1.add(an);list1.add(xe);
		Set<DichVuProduct> list2= new HashSet<>();
		list2.add(tam);list2.add(kara);
		//Them dich vu da tao truoc do
		list2.add(ksVip.ThemDV(tam));
		
		KhachHang kh3 = new KhachHang("KH003", "Thuy", "Viet Nam", 200.0,
				phongVip, new Date(2,2,2004), new Date(12,2,2004),list1);
	
		KhachHang kh4 = new KhachHang("KH004", "Thanh", "Viet Nam", 0.0,
				phongVip2, new Date(1,2,2004), new Date(2,2,2004),list2);
	
		kh1.setList(list1);
		demo.addKhachHang(kh1);
		demo.addKhachHang(kh2);
		demo.addKhachHang(kh3);
		demo.addKhachHang(kh4);
		System.out.println("DANH SACH KHACH HANG ");
		System.out.println("=================================================================\n");
		demo.inTCaHoaDon();
		
		System.out.println("KHACH HANG DUNG NHIEU DICH VU NHAT ");
		
		demo.sudungMaxDV(new Date(1,2,2004), new Date(5,2,2004)).hoaDon();
		
	}

}
