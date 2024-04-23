package factoryExercise;

public abstract class Tivi {
	protected String maTV;
	protected String tenTV;
	public Tivi(String maTV, String tenTV) {
		super();
		this.maTV = maTV;
		this.tenTV = tenTV;
	}
	public Tivi() {
		super();
	}
	public String getMaTV() {
		return maTV;
	}
	public void setMaTV(String maTV) {
		this.maTV = maTV;
	}
	public String getTenTV() {
		return tenTV;
	}
	public void setTenTV(String tenTV) {
		this.tenTV = tenTV;
	}
	
	
}
