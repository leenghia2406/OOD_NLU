package cuaHangTapHoa;

import java.util.ArrayList;
import java.util.List;

public class CuaHang {
	List<KhachHang> dsKH;
	public CuaHang() {
		super();
		this.dsKH = dsKH;
	}
	public void addKhachHang(KhachHang kh) {
		dsKH.add(kh);
	}
	public double tongDoanhThu() {
		double doanhThu = 0;
		for (int i = 0; i < dsKH.size(); i++) {
			doanhThu += dsKH.get(i).thanhTien();
		}
		return doanhThu;
	}
	public void hoaDon (KhachHang kh) {
		System.out.println("Ma KH: "+ kh.maKH +"\t"+"Ten khach hang:" +kh.tenKH + "Diem thuong: "+kh.diemTichLuy);
		System.out.println("Danh sach don hang: ");
		System.out.println("STT"+"\t"+"Ten san pham: "+"\t"+"Don hang");
		for (int i = 0; i < kh.dsSanPham.size(); i++) {
			System.out.println((i + 1)+"\t"+kh.dsSanPham.get(i).maHang+"\t");
		}
	}
	public void inCaHoaDon() {
		for (int i = 0; i < dsKH.size(); i++) {
			System.out.println("Khach hang "+"0"+(i + 1));
			hoaDon(dsKH.get(i));
			System.out.println("Tong thanh tien: "+ dsKH.get(i).thanhTien());
			System.out.println();
		}
	}
	public static void main(String[] args) {
//		CuaHang ch = new CuaHang(dsKH);
		List<SanPham> listKh01 = new ArrayList<>();
		SanPham tp01 = new ThucPham("tp01", "Gao", 450000.0, new Date(24, 6, 2004), new Date(24, 6, 2096));
		SanPham dl02 = new DienLanh("bd01", "Tu Lanh", 1350000.0, 2, 24, 250);
		SanPham gd03 = new GiaDung("gd03", "Bep Dien", 500000.0, 2);
		listKh01.add(tp01);
		listKh01.add(dl02);
		listKh01.add(gd03);
		KhachHang kh01 = new KHChuyenKhoanDuoi1Trieu("001", "Nghia", 5, new Date(24, 6, 2004), listKh01);
//		ch.addKhachHang(kh01);
//		ch.inCaHoaDon();
		
	}
}
