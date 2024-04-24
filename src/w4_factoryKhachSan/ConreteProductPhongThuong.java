package w4_factoryKhachSan;

public class ConreteProductPhongThuong extends ProductPhong{
	private FactoryVLXayDungPhong xayDung;

	public ConreteProductPhongThuong() {
		super();
		// TODO Auto-generated constructor stub
		donGia =100000;
	}

	
	public ConreteProductPhongThuong(FactoryVLXayDungPhong xayDung) {
		super();
		this.xayDung = xayDung;
		donGia =100000;
		taoVLXDPhong() ;
	}


	@Override
	protected void taoVLXDPhong() {
		// TODO Auto-generated method stub
		setTenPhong("PHONG THUONG");
		dienThoai=xayDung.taoDienThoai();
		tiVi=xayDung.taoTiVi();
		tuLanh=xayDung.taoTuLanh();
		
		
	}
	

}
