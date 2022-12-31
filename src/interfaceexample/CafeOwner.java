package interfaceexample;

import interfaceexample.cafecustomer.CafeCustomerA;
import interfaceexample.cafecustomer.CafeCustomerB;
import interfaceexample.cafecustomer.Customer;

// 카페 사장님
public class CafeOwner {
    public void giveItem(Customer customer) {
        System.out.println("Item :  " + customer.getOrder());
    }
}
