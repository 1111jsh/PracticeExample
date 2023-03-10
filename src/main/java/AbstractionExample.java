package main.java;
abstract class Animal {
    public String kind;
    public abstract void sound();
}

class Dog extends Animal {
    public Dog() {
        this.kind = "포유류";
    }

    public void sound() { // 메서드 오버라이딩 -> 구현부 완성
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public Cat() {
        this.kind = "포유류";
    }
    public void sound() {
        System.out.println("야옹");
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}

