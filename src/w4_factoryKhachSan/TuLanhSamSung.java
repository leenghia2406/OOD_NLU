package w4_factoryKhachSan;

public class TuLanhSamSung extends FactoryTuLanh{


	static int count=0;
	public TuLanhSamSung() {
		super();
		// TODO Auto-generated constructor stub
		id="SA"+(++count);
		name="TuLanhSamSung";
	}

	public TuLanhSamSung(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	

}
