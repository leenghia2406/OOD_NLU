package w4_factoryKhachSan;

public class DatPhongVip extends KhachSan{

	@Override
	protected ProductPhong taoPhong(String loaiPhong) {
		// TODO Auto-generated method stub
		ProductPhong phong=null;
		FactoryVLXayDungPhong xd = new ConreteFactoryVLXDPhongVip();
		if(loaiPhong.equalsIgnoreCase("vip")) {
			phong= new ConreteProductPhongVIP(xd);
			
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
//		if (dv instanceof DVKara) {
//			DVKara.setSoGio(DVKara.getSoGio()+1);
//		} else if (dv instanceof DVTamHoi) {
//			DVTamHoi.setSolan(DVTamHoi.getSolan()+1);
//		} else if (dv instanceof DVAnUong) {
//			DVAnUong.setSolan(DVAnUong.getSolan()+1);
//		} else if (dv instanceof DVThueXe) {
//			DVThueXe.setSongayThue(DVThueXe.getSongayThue());
//		}
		CreatorDichVu dichvu= new ConreteCreatorDichVu();
		return dichvu.ThemDV(dv);
		//return dv;
	}

}
