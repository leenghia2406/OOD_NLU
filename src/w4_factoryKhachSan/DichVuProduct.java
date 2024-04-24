package w4_factoryKhachSan;

public abstract class DichVuProduct {
	protected String maDV;
	protected String tenDV;
	protected double doGia;
	public DichVuProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DichVuProduct(String maDV, String tenDV, double doGia) {
		super();
		this.maDV = maDV;
		this.tenDV = tenDV;
		this.doGia = doGia;
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
	public double getDoGia() {
		return doGia;
	}
	public void setDoGia(double doGia) {
		this.doGia = doGia;
	}

	@Override
	public String toString() {
		return tenDV;
	}
	public abstract double tinhTien();
}
