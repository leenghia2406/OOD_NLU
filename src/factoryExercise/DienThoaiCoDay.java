package factoryExercise;

public class DienThoaiCoDay extends DienThoai {
	static int count = 0;
	public DienThoaiCoDay() {
		super();
		// TODO Auto-generated constructor stub
		maDienThoai = "CD" + (++count);
		tenDienThoai = "DT CO DAY";
	}

	public DienThoaiCoDay(String maDienThoai, String tenDienThoai) {
		super(maDienThoai, tenDienThoai);
		// TODO Auto-generated constructor stub
	}

	
	
}
