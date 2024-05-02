package bank_template;

public abstract class BankTemplate {
	protected double soTienThaoTac;
	
	public double getSoTienThaoTac() {
		return soTienThaoTac;
	}

	public void setSoTienThaoTac(double soTienThaoTac) {
		this.soTienThaoTac = soTienThaoTac;
	}

	final void thaoTac(int soTien) {
		this.soTienThaoTac = soTien;
		dangNhap();
		xacThucTaiKhoan();
		thucHienThaoTac();
		ghiNhatKi();
	}

	protected void ghiNhatKi() {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	protected abstract void thucHienThaoTac();

	protected void xacThucTaiKhoan() {
		// TODO Auto-generated method stub
		System.out.println("Tài khoản hợp lệ");
	}

	protected void dangNhap() {
		// TODO Auto-generated method stub
		System.out.println("Đăng nhập thành công");
	}
	public static void main(String[] args) {
        System.out.println("==== Rút tiền ====");
        RutTien rutTien = new RutTien("111", "LTN", 3000);
        rutTien.thaoTac(4000);;
        System.out.println("\n==== Chuyển tiền ====");
        ChuyenTien chuyenTien = new ChuyenTien("112", "ABC", 3000);
        chuyenTien.thaoTac(2000);
	}
	
}
