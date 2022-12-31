package OOPAdvanced2GoodMorning.person;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println("쿨쿨쿨...zZZ");
    }

    public void eat() {
        System.out.println("여유롭게 냠냠냠");
    }

}

// 의존성 주입 -> Dependency Injection(DI)