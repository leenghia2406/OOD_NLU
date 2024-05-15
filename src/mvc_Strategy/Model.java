package mvc_Strategy;

public class Model {
	public Strategy strategy;

	public Model(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public Model() {
		super();
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
}
