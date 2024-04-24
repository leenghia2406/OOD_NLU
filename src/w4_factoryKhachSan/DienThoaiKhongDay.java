package w4_factoryKhachSan;

public class DienThoaiKhongDay extends FactoryDienThoai{
	static int count=0;
	public DienThoaiKhongDay() {
		super();
		// TODO Auto-generated constructor stub
		maDienThoai=""+(++count);
		loai="DT khong day";
	}

	public DienThoaiKhongDay(String maDienThoai, String loai) {
		super(maDienThoai, loai);
		// TODO Auto-generated constructor stub
	}
	

}
