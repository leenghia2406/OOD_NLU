package w2_observerShop;

import java.util.List;

public class KhachHangVIP extends KhachHang implements ObserverKM,ObserverSPM{
	private int diemTichLuy;

	public KhachHangVIP() {
		super();
		// TODO Auto-generated constructor stub
		this.diemTichLuy=50;
	}

	public KhachHangVIP(String maKH, String tenK, Date ngaySinh,String sodienthoai, List<SanPham> listSP) {
		super(maKH, tenK, ngaySinh,sodienthoai, listSP);
		// TODO Auto-generated constructor stub
		this.diemTichLuy=50;
	}

	public KhachHangVIP(String maKH, String tenK, int diemTichLuy,Date ngaySinh,String sodienthoai, List<SanPham> listSP) {
		super(maKH, tenK, ngaySinh, sodienthoai,listSP);
		this.diemTichLuy=diemTichLuy>0?diemTichLuy:50;
		flagNhanKM=false;
	
	}

	
	public int getDiemTichLuy() {
		return diemTichLuy;
	}

	public void setDiemTichLuy(int diemTichLuy) {
		this.diemTichLuy = diemTichLuy;
	}

	@Override
	public double thanhtien() {
		// TODO Auto-generated method stub
		double total=0;
		for (SanPham sanPham : listSP) {
			total+=(flagNhanKM==true?sanPham.getDonGia()*(1-(double)2/100):sanPham.getDonGia());
		}
		return  total - (this.diemTichLuy>=50? (double)5/100*total:0);
	}

	@Override
	public void updateSPM(String tenCongTy, String noidungchuongtrinh) {
		// TODO Auto-generated method stub
		System.out.printf("%s nhan tin tu : %s - TIN: '%s'\n",getSodienthoai(), tenCongTy, noidungchuongtrinh);
	}

	@Override
	public void upatedKM(String tenCongTy, String noidungchuongtrinh) {
		// TODO Auto-generated method stub
		flagNhanKM=true;
		System.out.printf("%s nhan tin tu : %s - TIN: '%s'\n",getSodienthoai(), tenCongTy, noidungchuongtrinh);
		
	}

	

}
