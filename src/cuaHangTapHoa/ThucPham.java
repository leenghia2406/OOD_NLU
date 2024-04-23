package cuaHangTapHoa;

public class ThucPham extends SanPham{
	Date ngaySanXuat;
	Date ngayHetHan;
	public ThucPham(String maHang, String tenHang, double gia, Date ngaySanXuat, Date ngayHetHan) {
		super(maHang, tenHang, gia);
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public Date getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(Date ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	
}
