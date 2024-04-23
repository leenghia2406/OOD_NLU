package factoryExercise;

public abstract class ABNLPhong implements FactoryNguyenLieuXayDung{
	protected String maPhong;
	protected String tenPhong;
	public ABNLPhong(String maPhong, String tenPhong) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
	}
	public ABNLPhong() {
		super();
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

}
