package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		VIPCustomer customerLee = new VIPCustomer();
		customerLee.setCustomerID(10020);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 10000;
		System.out.println(customerLee.showCustomerInfo());
	}
}