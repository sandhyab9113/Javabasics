package ecommerce;

public class Customer {

	public void walkin() {

		System.out.println("Sandy is going out");

	}

	public void shop() {
		System.out.println("Sandy is shopping");

	}

	public void checkout() {
		Cashier ansariCashier = new Cashier();
		ansariCashier.estimate();


	}

}
