public class poly2 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano());
        customer.buyCoffee(new CaffeLatte());

        System.out.println("잔액은 : " + customer.money);
    }
}

class Coffee {
    int price;

    public Coffee(int price) {
        this.price = price;
    }
}

class Americano extends Coffee {
    public Americano() {
        super(4000); // 상위 클래스 Coffe 의 생성자 호출
    }

    public String toString() {return "아메리카노";} // Object 클래스 toString() 오버라이딩
};
class CaffeLatte extends Coffee {
    public CaffeLatte() {
        super(5000);
    }

    public String toString() {return "카페라떼";}
};

class Customer {
    int money = 50000;

//    void buyCoffee(Americano americano) { // 아메리카노 구입
//        money = money - americano.price;
//    }
//    void buyCoffee(CaffeLatte caffeLatte) { // 카페라떼 구입
//        money = money - caffeLatte.price;
//    }
    void buyCoffee(Coffee coffee) { // 매개 변수의 다형성
        if (money < coffee.price) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        money = money - coffee.price;
        System.out.println(coffee + "를 구입했습니다");


    }
}