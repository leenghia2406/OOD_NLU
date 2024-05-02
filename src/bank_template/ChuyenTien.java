package bank_template;

public class ChuyenTien extends TaiKhoan{

	public ChuyenTien(String maTK, String tenTK, double soTienHienCo) {
		super(maTK, tenTK, soTienHienCo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void thucHienThaoTac() {
		// TODO Auto-generated method stub
		TaiKhoan taiKhoanDich = new ChuyenTien("123", "Lionel Messi", 0);
		if (soTienThaoTac <= soTienHienCo) {
			soTienHienCo -= soTienThaoTac;
			taiKhoanDich.setSoTienHienCo(taiKhoanDich.getSoTienHienCo() + soTienThaoTac);
			System.out.println("Chuyển tiền thành công: " + soTienThaoTac + " đến tài khoản: "+taiKhoanDich.toString());
			System.out.println("Số tiền hiện có: "+ getSoTienHienCo());
		} else {
			System.out.println("Không đủ tiền để chuyển.");
		}
	}
	@Override
	protected void ghiNhatKi() {
		// TODO Auto-generated method stub
		System.out.println("Giao dịch chuyển tiền thành công");
	}
	@Override
	public String toString() {
		return "Tai khoan: "+ getTenTK() + ", mã tài khoản: "+ getMaTK();
	}
	
}
