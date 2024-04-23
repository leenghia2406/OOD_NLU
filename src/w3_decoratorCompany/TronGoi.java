package w3_decoratorCompany;

public class TronGoi extends XayDungComponent{

	
	public TronGoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TronGoi(String maLoai, String ten) {
		super(maLoai, ten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String thongTinXayNha() {
		// TODO Auto-generated method stub
		ten="Xay nha tron goi ";
		return ten;
	}

	@Override
	public double chiPhi() {
		// TODO Auto-generated method stub
		return dongia+20000;
	}

}
