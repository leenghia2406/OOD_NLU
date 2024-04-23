package cuaHangTapHoa;

public class DienLanh extends SanPham{
	int thoiGianBaoHanh;
	int dienAp;
	int congSuat;
	public DienLanh(String maHang, String tenHang, double gia, int thoiGianBaoHanh, int dienAp, int congSuat) {
		super(maHang, tenHang, gia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.dienAp = dienAp;
		this.congSuat = congSuat;
	}
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public int getDienAp() {
		return dienAp;
	}
	public void setDienAp(int dienAp) {
		this.dienAp = dienAp;
	}
	public int getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}
	
}
