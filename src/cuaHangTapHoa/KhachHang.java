package cuaHangTapHoa;

import java.util.ArrayList;
import java.util.List;

public abstract class KhachHang {
	protected String maKH;
	protected String tenKH;
	protected int diemTichLuy;
	protected Date ngaySinh;
	protected List<SanPham> dsSanPham;
	protected HinhThucThanhToan htThanhToan;
	protected HinhThucDiemThuong htDiemThuong;
	
	
//	public KhachHang() {
//		super();
//		dsSanPham = new ArrayList<>();
//	}

	public KhachHang(String maKH, String tenKH, int diemTichLuy, Date ngaySinh, List<SanPham> dsSanPham) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diemTichLuy = diemTichLuy;
		this.ngaySinh = ngaySinh;
		this.dsSanPham = dsSanPham;
	}
	
	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public int getDiemTichLuy() {
		return diemTichLuy;
	}

	public void setDiemTichLuy(int diemTichLuy) {
		this.diemTichLuy = diemTichLuy;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public List<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(List<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public HinhThucThanhToan getHtThanhToan() {
		return htThanhToan;
	}

	public void setHtThanhToan(HinhThucThanhToan htThanhToan) {
		this.htThanhToan = htThanhToan;
	}

	public HinhThucDiemThuong getHtDiemThuong() {
		return htDiemThuong;
	}

	public void setHtDiemThuong(HinhThucDiemThuong htDiemThuong) {
		this.htDiemThuong = htDiemThuong;
	}

	public abstract double thanhTien();
	
	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", diemTichLuy=" + diemTichLuy + ", ngaySinh="
				+ ngaySinh + ", dsSanPham=" + dsSanPham + ", htThanhToan=" + htThanhToan + ", htDiemThuong="
				+ htDiemThuong + "]";
	}

	public double thucHienHTThanhToan() {
		return htThanhToan.giamGiaHTThanhToan();
	}
	public double thucHienHTDiemThuong() {
		return htDiemThuong.giamGiaHTDT();
	}
}
