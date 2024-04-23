package w3_decoratorCompany;

public abstract class DichVuDecorator extends XayDungComponent{
	protected XayDungComponent xayDung;
	public DichVuDecorator() {
		super();
		// TODO Auto-generated constructor stub
		if(xayDung==null) {
			this.xayDung=new KienTruc();
		}
	}

	public DichVuDecorator(String maLoai, String ten) {
		super(maLoai, ten);
		// TODO Auto-generated constructor stub
	}

	public DichVuDecorator(XayDungComponent xayDung) {
		if(xayDung==null) {
			this.xayDung=new KienTruc();
		}else {
			this.xayDung=xayDung;
		}
	}
	public abstract String thongTinXayNha();
	public abstract double chiPhi();
}
