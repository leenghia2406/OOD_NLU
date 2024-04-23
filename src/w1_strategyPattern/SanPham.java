package w1_strategyPattern;

public class SanPham {
	public String maMH;
	public String tenMH;
	public float gia;
	
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SanPham(String maMH, String tenMH, float gia) {
		super();
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.gia = gia;
	}

	public String getMaMH() {
		return maMH;
	}

	public void setMaMH(String maMH) {
		this.maMH = maMH;
	}

	public String getTenMH() {
		return tenMH;
	}

	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}
	
	
}
