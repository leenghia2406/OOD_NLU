package factoryExercise;

public class ConFactoryXDPhongThuong extends ABNLPhong {

	public ConFactoryXDPhongThuong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConFactoryXDPhongThuong(String maPhong, String tenPhong) {
		super(maPhong, tenPhong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public DienThoai taoDT() {
		// TODO Auto-generated method stub
		return new DienThoaiCoDay();
	}

	@Override
	public Tivi taoTV() {
		// TODO Auto-generated method stub
		return new TVTCL();
	}

	@Override
	public TuLanh taoTL() {
		// TODO Auto-generated method stub
		return new TLAqua();
	}
	
	
}
