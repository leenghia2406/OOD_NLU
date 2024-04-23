package w1_strategyPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class KhachHang {
	protected String maKH;
	protected String tenKH;
	protected Date ngaySinh;
	protected int diemThuong;
	protected List<SanPham> listHH;
	protected HinhThucThanhToan hinhThucThanhToan;
	protected HinhThucTichDiem hinhThucTichDiem;
	
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
		listHH = new ArrayList<>();
	}

	public KhachHang(String maKH, String tenKH, Date ngaySinh, int diemThuong, List<SanPham> listHH) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.ngaySinh = ngaySinh;
		this.diemThuong = diemThuong;
		this.listHH = listHH;
	}
	
	public abstract double thanhTien();
	

	@Override
	public String toString() {
		return  maKH + "\t" + tenKH + "\t" + ngaySinh + "\t" + diemThuong;
			
	}
	public double thucHienHinhThucThanhToan() {
		return hinhThucThanhToan.giamThanhToan();
	}
	
	public int thucHienTichDiem() {
		return hinhThucTichDiem.diemThuong();
	}

}
