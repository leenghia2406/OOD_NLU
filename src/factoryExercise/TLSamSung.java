package factoryExercise;

public class TLSamSung extends TuLanh {
	static int count = 0;
	public TLSamSung() {
		super();
		// TODO Auto-generated constructor stub
		maTuLanh = "SA" + (++count);
		tenTuLanh = "SamSung";
	}

	public TLSamSung(String maTuLanh, String tenTuLanh) {
		super(maTuLanh, tenTuLanh);
		// TODO Auto-generated constructor stub
	}
	
}
