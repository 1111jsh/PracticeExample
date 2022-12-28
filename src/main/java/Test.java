package main.java;

public class Test {
    public static void main(String[] args) {
        System.out.println(test2.cv);
//        System.out.println(test.iv);
    }
}

class test2 {
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

