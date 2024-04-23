package ex4_factory_bank;

public class BankFactory{
//	Factory class
	public static final Bank getBank(BankType bankType) {
		switch (bankType) {
		 
        case TPBANK:
            return new TPBank();
 
        case VIETCOMBANK:
            return new Vietcombank();
 
        default:
            throw new IllegalArgumentException("This bank type is unsupported");
        }
	}
}

