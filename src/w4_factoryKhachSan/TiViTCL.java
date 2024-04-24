package w4_factoryKhachSan;

public class TiViTCL extends FactoryTiVi{

	static int count=0;
	public TiViTCL() {
		super();
		// TODO Auto-generated constructor stub
		id="TVSA"+(++count);
		ten="TiViSamSung";
	}

	public TiViTCL(String id, String ten) {
		super(id, ten);
		// TODO Auto-generated constructor stub
	}
	

}
