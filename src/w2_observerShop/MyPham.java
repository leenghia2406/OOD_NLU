package w2_observerShop;

public class MyPham extends SanPham{
	private Date ngaySX;
	private Date ngayHHSD;
	public MyPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyPham(String maSP, String tenSP, double donGia, String noiSX) {
		super(maSP, tenSP, donGia, noiSX);
		// TODO Auto-generated constructor stub
	}
	public MyPham(String maSP, String tenSP, double donGia, String noiSX,Date ngaySX, Date ngayHHSD) {
		super(maSP, tenSP, donGia, noiSX);
		this.ngaySX = ngaySX;
		this.ngayHHSD = ngayHHSD;
	}
	public Date getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(Date ngaySX) {
		this.ngaySX = ngaySX;
	}
	public Date getNgayHHSD() {
		return ngayHHSD;
	}
	public void setNgayHHSD(Date ngayHHSD) {
		this.ngayHHSD = ngayHHSD;
	}
	

}
