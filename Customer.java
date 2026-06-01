public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    //displayCustomerInformation() method displays the details of the customer
    void displayCustomerInformation(){
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Age: " + customerAge);
    }
    //changeCustomerAddress() method changes the address of the customer
    void changeCustomerAddress(String Address){
        customerAddress = Address;
    }
}