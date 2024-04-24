package w4_factoryKhachSan;

public class DVAnUong extends DichVuProduct{
	static int solan=0;
	static int count =0;

	public DVAnUong() {
		super();
		// TODO Auto-generated constructor stub
		maDV="AU"+(++count);
		tenDV="Dich Vu An Uong";
		doGia=70000;
		solan++;
	}

	public DVAnUong(String maDV, String tenDV, double doGia) {
		super(maDV, tenDV, doGia);
		// TODO Auto-generated constructor stub
	}

	public DVAnUong(String maDV, String tenDV, double doGia,int solan) {
		super(maDV, tenDV, doGia);
		//this.solan = solan;
	}

	public static int getSolan() {
		return solan;
	}

	public static int getCount() {
		return count;
	}

	public static void setSolan(int solan) {
		DVAnUong.solan = solan;
	}

	public static void setCount(int count) {
		DVAnUong.count = count;
	}

	@Override
	public double tinhTien() {
		// TODO Auto-generated method stub
		return doGia*solan;
	}

	

	
	

}
