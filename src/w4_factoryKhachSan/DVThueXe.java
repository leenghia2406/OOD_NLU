package w4_factoryKhachSan;

public class DVThueXe extends DichVuProduct{
	static int songayThue=0;
	static int count =0;

	public DVThueXe() {
		super();
		// TODO Auto-generated constructor stub
		maDV="TX"+(++count);
		tenDV="Dich Vu Thue Xe";
		doGia=200000;
		++songayThue;
	}
	public DVThueXe(String maDV, String tenDV, double doGia) {
		super(maDV, tenDV, doGia);
		// TODO Auto-generated constructor stub
	}

	public DVThueXe(String maDV, String tenDV, double doGia,int songayThue) {
		super(maDV, tenDV, doGia);
		//this.songayThue = songayThue;
	}
	public static int getSongayThue() {
		return songayThue;
	}
	public static void setSongayThue(int songayThue) {
		DVThueXe.songayThue = songayThue;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		DVThueXe.count = count;
	}
	
	@Override
	public double tinhTien() {
		// TODO Auto-generated method stub
		return songayThue*doGia;
	}
	

}
