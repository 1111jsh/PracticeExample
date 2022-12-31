package main.java;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.cv = "클래스변수2"; // 모든 객체에 영향
        System.out.println(car1.cv);
        System.out.println(car2.cv);
        System.out.println(Car.cv);

        car1.iv = "인스턴스 변수2";
        System.out.println(car1.iv);
        System.out.println(car2.iv);
//        System.out.println(Car.cv);
//        System.out.println(Car.iv);
    }
}

class Car {
    public String iv = "인스턴스 변수";
    public static String cv = "클래스변수";

    public static void classmethod() {
//        System.out.println(iv); // classmethod -> 클래스변수 접근가능, 인스턴스변수 접근 불가
        System.out.println(cv);
    }

    public void instancemethod() {
        System.out.println(iv);
        System.out.println(cv);
    }
}

