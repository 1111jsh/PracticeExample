package OOPAdvanced2GoodMorning;

import OOPAdvanced2GoodMorning.person.Bus;
import OOPAdvanced2GoodMorning.person.Hyodoable;
import OOPAdvanced2GoodMorning.person.Person;
import OOPAdvanced2GoodMorning.person.occupation.Musician;
import OOPAdvanced2GoodMorning.person.occupation.PersonalTrainer;
import OOPAdvanced2GoodMorning.person.occupation.Programmer;

public class Main {
    public static void main(String[] args) {

        Hyodoable musician = new Musician("아이유", false);
        Hyodoable personalTrainer = new PersonalTrainer("김계란", 10);
        Hyodoable programmer = new Programmer("조영현", true);


        Bus bus = new Bus();

        bus.test(musician);
        bus.test(personalTrainer);
        bus.test(programmer);


    }
}

//        - test의 매개 변수 Hyodoable hyodoable에는 Hyodoable을 구현한 인스턴스만이 할당될 수 있다.
//        - 즉, hyodoable은 Hyodoable에 정의된 추상 메서드 hyodo()를 반드시 가지고 있다.
//        - hyodoable.hyodo()를 실행했을 때에 나타나는 결과는 hyodoable에 어떤 인스턴스가 할당되느냐에 따라 달라진다. -> "다형성"