package w4_factoryKhachSan;

public class DatPhongThuong extends KhachSan{

	
	public DatPhongThuong() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	@Override
	protected ProductPhong taoPhong(String loaiPhong) {
		// TODO Auto-generated method stub
		
		ProductPhong phong=null;
		ConreteFactoryVLXDPhongThuong xd = new ConreteFactoryVLXDPhongThuong();
		if(loaiPhong.equalsIgnoreCase("thuong")) {
			phong = new ConreteProductPhongThuong(xd);
		
		}else {
			System.out.println("Khong hop le!");
		}
		return phong;
	}

	@Override
	protected DichVuProduct taoDichVu(String loaiDV) {
		// TODO Auto-generated method stub
		CreatorDichVu dichvu= new ConreteCreatorDichVu();
		return dichvu.taoDichVu(loaiDV);
	}

	@Override
	protected DichVuProduct ThemDV(DichVuProduct dv) {
		// TODO Auto-generated method stub
		
		CreatorDichVu dichvu= new ConreteCreatorDichVu();
		return dichvu.ThemDV(dv);
	}
	

}
