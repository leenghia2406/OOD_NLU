package bank_template;

public abstract class TaiKhoan extends BankTemplate{
	protected String maTK;
	protected String tenTK;
	protected double soTienHienCo;
	public TaiKhoan(String maTK, String tenTK, double soTienHienCo) {
		super();
		this.maTK = maTK;
		this.tenTK = tenTK;
		this.soTienHienCo = soTienHienCo;
	}
	public String getMaTK() {
		return maTK;
	}
	public void setMaTK(String maTK) {
		this.maTK = maTK;
	}
	public String getTenTK() {
		return tenTK;
	}
	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}
	public double getSoTienHienCo() {
		return soTienHienCo;
	}
	public void setSoTienHienCo(double soTienHienCo) {
		this.soTienHienCo = soTienHienCo;
	}
	
	
		
}
