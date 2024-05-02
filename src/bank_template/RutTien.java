package bank_template;

public class RutTien extends TaiKhoan{
	boolean flag = false;
	public RutTien(String maTK, String tenTK, double soTienHienCo) {
		super(maTK, tenTK, soTienHienCo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void thucHienThaoTac() {
		// TODO Auto-generated method stub
		if (soTienThaoTac <= soTienHienCo) {
			flag = true;
			soTienHienCo -= soTienThaoTac;
			System.out.println("Rút tiền thành công: " + soTienThaoTac);
			System.out.println("Số tiền hiện có: "+ getSoTienHienCo());
		}else {
            System.out.println("Không đủ tiền để rút.");
            return;
        }
	}
	@Override
	protected void ghiNhatKi() {
		// TODO Auto-generated method stub
		System.out.println(flag == false ? "Giao dịch rút tiền không thành công" : "Rút tiền thành công");
	}
	
	
	
}
