package factoryExercise;

public class ConcreteDichVu implements CreatorDichVu{

	@Override
	public ProductDichVu taoDV(String loai) {
		// TODO Auto-generated method stub
		ProductDichVu dichvu = null;
		if (loai.equalsIgnoreCase("tam")) {
			dichvu = new DVTamHoi();
		}else if (loai.equalsIgnoreCase("xe")) {
			dichvu = new DVThueXe();
		}else if (loai.equalsIgnoreCase("an")) {
			dichvu = new DVAn();
		}else if (loai.equalsIgnoreCase("gym")) {
			dichvu = new DVGYM();
		}else {
			System.out.println("Dich vu khong hop le");
		}
		return dichvu;
	}

	@Override
	public ProductDichVu themDV(ProductDichVu dichvu) {
		// TODO Auto-generated method stub
		if (dichvu instanceof DVTamHoi) {
			
		}else if (dichvu instanceof DVAn) {
			
		}else if (dichvu instanceof DVThueXe) {
			
		}else if (dichvu instanceof DVGYM) {
			
		}
		return dichvu;	
	}


	
	
}
