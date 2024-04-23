package strategy_simUDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.performFly();
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(
		new FlyRocketPowered());
		model.performFly();
	}
}
