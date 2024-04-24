package w4_factoryKhachSan;

public class DVTamHoi extends DichVuProduct{
	static int solan=0;
	static int count =0;

	public DVTamHoi() {
		super();
		// TODO Auto-generated constructor stub
		maDV="TH"+(++count);
		tenDV="Dich Vu Tam Hoi";
		doGia=50000;
		solan++;
		System.out.println("hwhw");
	}

	public DVTamHoi(String maDV, String tenDV, double doGia) {
		super(maDV, tenDV, doGia);
		// TODO Auto-generated constructor stub
	}

	public DVTamHoi(String maDV, String tenDV, double doGia,int solan) {
		super(maDV, tenDV, doGia);
		
	}

	public static int getSolan() {
		return solan;
	}

	public static int getCount() {
		return count;
	}

	public static void setSolan(int solan) {
		DVTamHoi.solan = solan;
	}

	public static void setCount(int count) {
		DVTamHoi.count = count;
	}
	@Override
	public double tinhTien() {
		// TODO Auto-generated method stub
		return solan*doGia;
	}
	

	

}
