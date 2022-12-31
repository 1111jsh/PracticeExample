package interfaceexample;

import interfaceexample.cafecustomer.CafeCustomerA;
import interfaceexample.cafecustomer.CafeCustomerB;

//        카페를 운영하는 사람이 있습니다.
//        단골손님들은 매일 마시는 음료가 정해져 있습니다.
//        단골손님A는 항상 아이스 아메리카노를 주문합니다.
//        단골손님B는 매일 아침 딸기라떼를 구매합니다.

// 메뉴 주문
public class OrderExample {
    public static void main(String[] args) {
        CafeOwner o = new CafeOwner();
        CafeCustomerA a = new CafeCustomerA();
        CafeCustomerB b = new CafeCustomerB();

        o.giveItem(a);
        o.giveItem(b);
    }
}