package factoryExercise;

public abstract class ProductDichVu {
	protected String maDV;
	protected String tenDV;
	protected double gia;
	public ProductDichVu(String maDV, String tenDV, double gia) {
		super();
		this.maDV = maDV;
		this.tenDV = tenDV;
		this.gia = gia;
	}
	public ProductDichVu() {
		super();
	}
	public String getMaDV() {
		return maDV;
	}
	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}
	public String getTenDV() {
		return tenDV;
	}
	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	
}
