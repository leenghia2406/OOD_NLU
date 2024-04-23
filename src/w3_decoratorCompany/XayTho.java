package w3_decoratorCompany;

public class XayTho extends XayDungComponent{

	
	public XayTho() {
		super();
		// TODO Auto-generated constructor stub
	}

	public XayTho(String maLoai, String ten) {
		super(maLoai, ten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String thongTinXayNha() {
		// TODO Auto-generated method stub
		ten="Xay nha tho";
		return ten;
	}

	@Override
	public double chiPhi() {
		// TODO Auto-generated method stub
		return dongia;
	}

}
