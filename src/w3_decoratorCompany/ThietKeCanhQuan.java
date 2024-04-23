package w3_decoratorCompany;

public class ThietKeCanhQuan extends DichVuDecorator{

	public ThietKeCanhQuan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThietKeCanhQuan(XayDungComponent xayDung) {
		super(xayDung);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String thongTinXayNha() {
		// TODO Auto-generated method stub
		return xayDung.thongTinXayNha()+" \n\tVa goi thiet ke canh quan";
	}

	@Override
	public double chiPhi() {
		// TODO Auto-generated method stub
		return xayDung.chiPhi()+ 1000;
	}
	

}
