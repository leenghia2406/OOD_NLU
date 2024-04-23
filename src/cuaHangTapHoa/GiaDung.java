package cuaHangTapHoa;

public class GiaDung extends SanPham{
	int thoiGianBaoHanh;

	public GiaDung(String maHang, String tenHang, double gia, int thoiGianBaoHanh) {
		super(maHang, tenHang, gia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
}
