package w4_factoryKhachSan;

public class DienThoaiCoDay extends FactoryDienThoai{
	private static int count=0;
	public DienThoaiCoDay() {
		super();
		// TODO Auto-generated constructor stub
		maDienThoai=""+(++count);
		loai="DT khong day";
	}

	public DienThoaiCoDay(String maDienThoai, String loai) {
		super(maDienThoai, loai);
		// TODO Auto-generated constructor stub
	}
	

}
