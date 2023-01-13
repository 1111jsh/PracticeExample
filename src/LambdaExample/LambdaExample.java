package LambdaExample;

public class LambdaExample {
    public static void main(String[] args) {

        // 람다식 Object obj = (num1, num2) -> num1 + num2; 로 대체 가능
//        Object obj = new Object() {
//            int sum(int num1, int num2) {
//                return num1 + num1;
//            }
//        };
        ExampleFunction exampleFuction = (num1, num2) -> num1 + num2;
        System.out.println(exampleFuction.sum(10, 15));

    }

}
    @FunctionalInterface
    interface ExampleFunction {
        int sum(int num1, int num2);
    }

