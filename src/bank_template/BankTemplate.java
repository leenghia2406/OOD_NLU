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
		
	}

	protected abstract void thucHienThaoTac();

	protected void xacThucTaiKhoan() {
		// TODO Auto-generated method stub
		
	}

	protected void dangNhap() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// Tạo một tài khoản để test
        TaiKhoan taiKhoan = new ChuyenTien("001", "Nguyen Van A", 1000);

        // Test giao dịch rút tiền
        System.out.println("==== Thử rút tiền ====");
        RutTien rutTien = new RutTien("111", "LTN", 2000);
        rutTien.setSoTienThaoTac(1000);
        rutTien.thucHienThaoTac(); // Thực hiện giao dịch rút tiền
        // Test giao dịch chuyển tiền
        System.out.println("\n==== Thử chuyển tiền ====");
        ChuyenTien chuyenTien = new ChuyenTien("112", "ABC", 3000);
        chuyenTien.setSoTienThaoTac(1500);
        chuyenTien.thucHienThaoTac(); // Thực hiện giao dịch chuyển tiền
	}
	
}
