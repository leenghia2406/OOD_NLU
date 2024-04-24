package bank_template;

public class RutTien extends TaiKhoan{
	
	public RutTien(String maTK, String tenTK, double soTienHienCo) {
		super(maTK, tenTK, soTienHienCo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void thucHienThaoTac() {
		// TODO Auto-generated method stub
		if (soTienThaoTac <= soTienHienCo) {
			soTienHienCo -= soTienThaoTac;
			System.out.println("Rút tiền thành công: " + soTienThaoTac);
			System.out.println("Số tiền hiện có: "+ getSoTienHienCo());
		}else {
            System.out.println("Không đủ tiền để rút.");
        }
	}
	
	
	
}
