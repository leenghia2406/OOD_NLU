package w3_decoratorCompany;

public class KhachHang {
	private String maKH;
	private String tenKH;
	private XayDungComponent listXD;
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public KhachHang(String maKH, String tenKH, XayDungComponent listXD) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.listXD = listXD;
		
	}
	
	public double ThanhToan() {
		
		return listXD.chiPhi();
	}
	
	public void hoaDon() {
		System.out.println("Ma KH:"+ maKH+"\t"+"Ten Khach Hang: "+tenKH);
		System.out.println("Danh sach don hang:");
		System.out.println("Ten San Pham"+"\t\t\t"+"Don Gia");
		System.out.println(listXD.thongTinXayNha()+"\t\t\t"+listXD.chiPhi()+" $");
		System.out.println("Tong thanh tien : " +ThanhToan()+" $");
		System.out.println();
	}
	
}
