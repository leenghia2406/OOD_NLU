package factoryExercise;

public class TLAqua extends TuLanh {
	static int count = 0;
	public TLAqua() {
		super();
		// TODO Auto-generated constructor stub
		maTuLanh = "AQ" + (++count);
		tenTuLanh = "AQUA";
	}

	public TLAqua(String maTuLanh, String tenTuLanh) {
		super(maTuLanh, tenTuLanh);
		// TODO Auto-generated constructor stub
	}
	
	
}
