package lat.futuredevelopers.beans;

public class CashPayment implements IPayment {

	@Override
	public void executePayment(int amount) {
		System.out.println("Perform Cash Payment for amount ... " + amount); 
	}

}
