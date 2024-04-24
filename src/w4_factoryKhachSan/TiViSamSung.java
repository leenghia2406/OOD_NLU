package w4_factoryKhachSan;

public class TiViSamSung extends FactoryTiVi{

	static int count=0;
	public TiViSamSung() {
		super();
		// TODO Auto-generated constructor stub
		id="TVSA"+(++count);
		ten="TiViSamSung";
	}

	public TiViSamSung(String id, String ten) {
		super(id, ten);
		// TODO Auto-generated constructor stub
	}
	

}
