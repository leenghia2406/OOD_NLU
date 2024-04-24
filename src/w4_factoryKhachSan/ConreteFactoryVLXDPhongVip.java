package w4_factoryKhachSan;

public class ConreteFactoryVLXDPhongVip extends PhongABFactory {

	public ConreteFactoryVLXDPhongVip() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public FactoryDienThoai taoDienThoai() {
		// TODO Auto-generated method stub
		return new DienThoaiKhongDay();
	}

	@Override
	public FactoryTiVi taoTiVi() {
		// TODO Auto-generated method stub
		return new TiViSamSung();
	}

	@Override
	public FactoryTuLanh taoTuLanh() {
		// TODO Auto-generated method stub
		return new TuLanhSamSung();
	}

}
