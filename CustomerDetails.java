class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
    
    public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
}
public class CustomerDetails {
	public static void main(String args[]) {
		Customer customer = new Customer();
		customer.customerId = "E26";
		customer.customerName = "Shreya S Poojary";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, Shreya House, Kundapura, 62729";
		customer.displayCustomerDetails();
	}
}
/*
	Displaying customer details 
	***********
	Customer Id : E26
	Customer Name : Shreya S Poojary
	Contact Number : 7856341287
	Address : D089, Shreya House, Kundapura, 62729
*/
