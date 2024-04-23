package w1_strategyPattern;

public class ThucPham extends SanPham{
	private Date ngaySX, ngayHH;

	public ThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThucPham(String maMH, String tenMH, float gia) {
		super(maMH, tenMH, gia);
		// TODO Auto-generated constructor stub
	}

	public ThucPham(String maMH, String tenMH, float gia,Date ngaySX, Date ngayHH) {
		super(maMH, tenMH, gia);
		this.ngaySX = ngaySX;
		this.ngayHH = ngayHH;
	}
	

}
