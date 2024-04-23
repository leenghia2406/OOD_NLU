package factoryExercise;

public class DienThoaiKhongDay extends DienThoai {
	static int count = 0;
	public DienThoaiKhongDay() {
		super();
		// TODO Auto-generated constructor stub
		maDienThoai = "KD" + (++count);
		tenDienThoai = "DT KHONG DAY";
	}

	public DienThoaiKhongDay(String maDienThoai, String tenDienThoai) {
		super(maDienThoai, tenDienThoai);
		// TODO Auto-generated constructor stub
	}

	
}
