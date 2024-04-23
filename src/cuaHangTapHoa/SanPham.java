package cuaHangTapHoa;

public abstract class SanPham {
	protected String maHang;
	protected String tenHang;
	protected double gia;
	public SanPham(String maHang, String tenHang, double gia) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.gia = gia;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	
}
