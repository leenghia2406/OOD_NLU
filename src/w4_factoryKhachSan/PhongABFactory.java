package w4_factoryKhachSan;

public abstract class PhongABFactory implements FactoryVLXayDungPhong {
	protected String maPhong;
	protected String tenPhong;
	
	public PhongABFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhongABFactory(String maPhong, String tenPhong) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		

	}
	
	

}
