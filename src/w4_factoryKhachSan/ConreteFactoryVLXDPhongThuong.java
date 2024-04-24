package w4_factoryKhachSan;

public class ConreteFactoryVLXDPhongThuong extends PhongABFactory {

	public ConreteFactoryVLXDPhongThuong() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public FactoryDienThoai taoDienThoai() {
		// TODO Auto-generated method stub
		return new DienThoaiCoDay();
	}

	@Override
	public FactoryTiVi taoTiVi() {
		// TODO Auto-generated method stub
		return new TiViTCL();
	}

	@Override
	public FactoryTuLanh taoTuLanh() {
		// TODO Auto-generated method stub
		return new TuLanhAQua();
	}

}
