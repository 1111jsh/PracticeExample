package OOPAdvanced2GoodMorning.person.occupation;

import OOPAdvanced2GoodMorning.person.Hyodoable;
import OOPAdvanced2GoodMorning.person.Person;

public class Musician extends Person implements Hyodoable {

    private boolean isGroup;

    public Musician(String name, boolean isGroup) {
        super(name);
        this.isGroup = isGroup;
    }

    public void perform() {
        System.out.println("공연을 합니다. ");
    }

    @Override
    public void hyodo() {
        System.out.println("부모님께 노래 불러드리기");
    }
}