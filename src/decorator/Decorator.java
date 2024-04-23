package decorator;

public abstract class Decorator extends XayNha{
	protected XayNha xayNha;
	public Decorator() {
		super();
	}
	public Decorator(String maXD, XayNha xayNha) {
		super();
		this.xayNha = xayNha;
	}
	
}
