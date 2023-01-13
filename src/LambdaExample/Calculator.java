package LambdaExample;

/*
정적메서드 결과 : 8
인스턴스 메서드 결과 : 15
*/
public class Calculator {
    public static int staticMethod(int x, int y) {
        return x + y;
    }

    public int instanceMethod(int x, int y) {
        return x * y;
    }
}
