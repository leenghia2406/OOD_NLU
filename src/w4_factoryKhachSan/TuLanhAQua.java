package w4_factoryKhachSan;

public class TuLanhAQua extends FactoryTuLanh{

	static int count=0;
	public TuLanhAQua() {
		super();
		// TODO Auto-generated constructor stub
		id="AQ"+(++count);
		name="TuLanhAQua";
	}

	public TuLanhAQua(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	

}
