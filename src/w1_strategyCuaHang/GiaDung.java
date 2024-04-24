package w1_strategyCuaHang;

public class GiaDung extends SanPham{
	private int thoiGianBH;

	public GiaDung() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaDung(String maMH, String tenMH, float gia) {
		super(maMH, tenMH, gia);
		// TODO Auto-generated constructor stub
	}

	public GiaDung(String maMH, String tenMH, float gia,int thoiGianBH) {
		super(maMH, tenMH, gia);
		this.thoiGianBH = thoiGianBH;
	}
	

}
