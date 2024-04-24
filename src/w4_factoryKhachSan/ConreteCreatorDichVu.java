package w4_factoryKhachSan;

public class ConreteCreatorDichVu implements CreatorDichVu{
	
	@Override
	public DichVuProduct taoDichVu(String loaiDV) {
		// TODO Auto-generated method stub
		DichVuProduct dichvu = null;
		if(loaiDV.equalsIgnoreCase("tam")) {
			dichvu = new DVTamHoi();
			
		}else if(loaiDV.equalsIgnoreCase("xe")) {
			dichvu = new DVThueXe();
		
		}else if(loaiDV.equalsIgnoreCase("an")) {
			dichvu = new DVAnUong();
			
		}else if(loaiDV.equalsIgnoreCase("kara")) {
			dichvu = new DVKara();
			
		}else if(loaiDV.equalsIgnoreCase("gym")) {
			dichvu = new DVGYM();
			
		}
		else{
			System.out.println("Dich vu khong hop le!");
		}
		return dichvu;
	}

	@Override
	public DichVuProduct ThemDV(DichVuProduct dv) {
		// TODO Auto-generated method stub

		if (dv instanceof DVKara) {
			DVKara.setSoGio(DVKara.getSoGio()+1);
		} else if (dv instanceof DVTamHoi) {
			DVTamHoi.setSolan(DVTamHoi.getSolan()+1);
		} else if (dv instanceof DVAnUong) {
			DVAnUong.setSolan(DVAnUong.getSolan()+1);
		} else if (dv instanceof DVThueXe) {
			DVThueXe.setSongayThue(DVThueXe.getSongayThue());
		}
		else if (dv instanceof DVGYM) {
			DVGYM.setSoGio(DVGYM.getSoGio());
		}
		return dv;
	}


}
