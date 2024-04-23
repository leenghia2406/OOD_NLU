package w2_observerShop;

import java.util.List;

public class KhachHangTHUONG extends KhachHang implements ObserverKM{
	public KhachHangTHUONG() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachHangTHUONG(String maKH, String tenK, Date ngaySinh,String sodienthoai, List<SanPham> listSP) {
		super(maKH, tenK, ngaySinh, sodienthoai, listSP);
		// TODO Auto-generated constructor stub
		flagNhanKM=false;
	}
	@Override
	public double thanhtien() {
		// TODO Auto-generated method stub
		double total=0;
		for (SanPham sanPham : listSP) {
			total+=(flagNhanKM==true?sanPham.getDonGia()*(1-(double)2/100):sanPham.getDonGia());
		}
		return total;
	}
	@Override
	public void upatedKM(String tenCongTy, String noidungchuongtrinh) {
		// TODO Auto-generated method stub
		flagNhanKM=true;
		System.out.printf("%s nhan tin : %s  - TIN: '%s'\n",getSodienthoai(), "tu " +tenCongTy, noidungchuongtrinh);
	}

}
