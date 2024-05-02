package bank_singleton;

public class TaiKhoan {
	private volatile static TaiKhoan uniqueInstance;
	private volatile static int sodu = 10000;
	private TaiKhoan() {
		System.out.println("Tai khoan hien co so du: "+ sodu);
	}
	public static TaiKhoan getInstance() {
		if (uniqueInstance == null) {
			synchronized(TaiKhoan.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new TaiKhoan();
				}
			}
		}
		return uniqueInstance;
	}
	public static TaiKhoan getInstance2() {
		if (uniqueInstance == null) {
			uniqueInstance = new TaiKhoan();
		}
		return uniqueInstance;
	}
	public void giaoDichRutTien(int sotienrut) {
		System.out.println("Giao dich rut tien dang thuc hien voi so tien: "+ sotienrut);
		if (sodu < sotienrut) {
			System.out.println("So tien trong tai khoan khong du");
		}else {
			sodu -= sotienrut;
			System.out.println("Rut tien thanh cong, so du hien co: "+ sodu);
		}
	}
	public void giaoDichNopTienVaoTK(int sotiennop) {
		System.out.println("Giao dich nop tien dang thuc hien voi so tien: "+ sotiennop);
		sodu += sotiennop;
		System.out.println("Nop tien thanh cong, so du hien co trong tai khoan la: "+ sodu);
	}
}
