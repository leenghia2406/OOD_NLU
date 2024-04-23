package strategy_simUDuck;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	public void performQuack() {
		quackBehavior.quack();
	}
	public void performFly() {
		flyBehavior.fly();
	}
	public void setFlyBehavior(FlyBehavior fb) {
			flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
			quackBehavior = qb;
	}
}
