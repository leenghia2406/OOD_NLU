package w4_factoryKhachSan;

public class DVKara extends DichVuProduct{
	static int soGio=0;

	static int count =0;

	public DVKara() {
		super();
		// TODO Auto-generated constructor stub
		maDV="KR"+(++count);
		tenDV="Dich Vu Karaoke";
		doGia=100000;
		++soGio;
	}
	public DVKara(int soGio) {
		super();
		this.soGio = soGio;
	}

	public DVKara(String maDV, String tenDV, double doGia,int soGio) {
		super(maDV, tenDV, doGia);
		// TODO Auto-generated constructor stub
		//this.soGio = soGio;
	}
	public static int getSoGio() {
		return soGio;
	}
	public static void setSoGio(int soGio) {
		DVKara.soGio = soGio;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		DVKara.count = count;
	}
	@Override
	public double tinhTien() {
		// TODO Auto-generated method stub
		return soGio*doGia;
	}
	

	

}
