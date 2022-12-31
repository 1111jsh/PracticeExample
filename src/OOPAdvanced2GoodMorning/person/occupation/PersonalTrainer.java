package OOPAdvanced2GoodMorning.person.occupation;

import OOPAdvanced2GoodMorning.person.Hyodoable;
import OOPAdvanced2GoodMorning.person.Person;

public class PersonalTrainer extends Person implements Hyodoable {

    private int awards;

    public PersonalTrainer(String name, int awards) {
        super(name);
        this.awards = awards;
    }

    public void teach() {
        System.out.println("PT를 합니다. ");
    }

    @Override
    public void hyodo() {
        System.out.println("부모님께 운동 가르쳐드리기");
    }
}