package LambdaExample;

@FunctionalInterface
interface MyFunctionalInterface {
    void accept();
}
public class MyFunctionalInterfaceExample {

    public static void main(String[] args) throws Exception {

        MyFunctionalInterface example = () -> System.out.println("accept() 호출");
        example.accept();

    }
}

