package w3_decoratorCompany;

public class KienTruc extends XayDungComponent{

	
	public KienTruc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KienTruc(String maLoai, String ten) {
		super(maLoai, ten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String thongTinXayNha() {
		// TODO Auto-generated method stub
		ten="Goi thiet ke";
		return ten;
	}

	@Override
	public double chiPhi() {
		// TODO Auto-generated method stub
		dongia=2000;
		return dongia;
	}

}
