package w3_decoratorCompany;

public class ThayDoiMauSon extends DichVuDecorator{

	public ThayDoiMauSon() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ThayDoiMauSon(XayDungComponent xayDung) {
		super(xayDung);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String thongTinXayNha() {
		// TODO Auto-generated method stub
		return xayDung.thongTinXayNha()+"\n\tVa doi mau son theo yeu cau";
	}

	@Override
	public double chiPhi() {
		// TODO Auto-generated method stub
		return xayDung.chiPhi()+500;
	}
	

}
