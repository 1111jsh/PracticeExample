package OOPAdvanced2GoodMorning.person.occupation;

import OOPAdvanced2GoodMorning.person.Hyodoable;
import OOPAdvanced2GoodMorning.person.Person;

public class Programmer extends Person implements Hyodoable {

    private boolean hasTooMuchWork;

    public Programmer(String name, boolean hasTooMuchWork) {
        super(name);
        this.hasTooMuchWork = hasTooMuchWork;
    }

    public void work() {
        System.out.println("타닥..타닥...타다닥... 탁!!!");
    }

    @Override
    public void hyodo() {
        System.out.println("부모님 컴퓨터 관리해드리기");
    }
}