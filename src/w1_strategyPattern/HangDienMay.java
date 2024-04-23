package w1_strategyPattern;

public class HangDienMay extends SanPham{
	private int thoiGianBH;
	private int dienAp, congSuat;
	public HangDienMay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HangDienMay(String maMH, String tenMH, float gia) {
		super(maMH, tenMH, gia);
		// TODO Auto-generated constructor stub
	}
	public HangDienMay(String maMH, String tenMH, float gia,int thoiGianBH, int dienAp, int congSuat) {
		super(maMH, tenMH, gia);
		this.thoiGianBH = thoiGianBH;
		this.dienAp = dienAp;
		this.congSuat = congSuat;
	}
	

}
