package w4_factoryKhachSan;

public class ConreteProductPhongVIP extends ProductPhong{
	private FactoryVLXayDungPhong xayDung;
	

	public ConreteProductPhongVIP() {
		super();
		// TODO Auto-generated constructor stub
		donGia =300000;
	}


	public ConreteProductPhongVIP(FactoryVLXayDungPhong xayDung) {
		super();
		this.xayDung = xayDung;
		donGia =300000;
		taoVLXDPhong() ;
	}


	@Override
	protected void taoVLXDPhong() {
		// TODO Auto-generated method stub
		
		setTenPhong("PHONG VIP");
		dienThoai=xayDung.taoDienThoai();
		tuLanh=xayDung.taoTuLanh();
		tiVi=xayDung.taoTiVi();
		
		
	}

	

}
