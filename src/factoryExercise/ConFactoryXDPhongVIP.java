package factoryExercise;

public class ConFactoryXDPhongVIP extends ABNLPhong {

	@Override
	public DienThoai taoDT() {
		// TODO Auto-generated method stub
		return new DienThoaiKhongDay();
	}

	@Override
	public Tivi taoTV() {
		// TODO Auto-generated method stub
		return new TVSamSung();
	}

	@Override
	public TuLanh taoTL() {
		// TODO Auto-generated method stub
		return new TLSamSung();
	}
	
}
