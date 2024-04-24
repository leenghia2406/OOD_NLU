package w4_factoryKhachSan;

public class FactoryTuLanh implements ConreteProductTuLanh{
	protected String id;
	protected String name;
	public FactoryTuLanh(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public FactoryTuLanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return id+"\t"+name;
	}
}
