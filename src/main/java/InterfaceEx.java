interface Cover { // 인터페이스
    void call();
}
public class InterfaceEx {
    public static void main(String[] args) {
        User user = new User();
//        Provider provider = new Provider();
//        user.callProvider(new Provider()); // Provider 객체생성 후 매개변수로 전달
        user.callProvider(new Provider());
    }
}

class User {

    public void callProvider(Cover cover) { // 매개변수 다형성 활용
        cover.call();
    }
}
class Provider implements Cover {
    public void call() {
        System.out.println("뮤야호");
    }

}
class Provider2 implements Cover{
    public void call() {
        System.out.println("야호");
    }
}