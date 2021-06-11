package by.mnkqn.employees;

import by.mnkqn.farm.Aviary;

public class Staff extends Humanity {

    public Staff(String name) {
        super(name);
    }

    public void work() {
        System.out.println("Staff is working");
    }

    public void cleanAviary(Aviary aviary) {
        if (aviary.isClean()) {
            System.out.println(aviary.getName() + " is already clean.");
        } else {
            System.out.println(getName() + " cleans volier " + aviary.getName());
            aviary.setClean(true);
            System.out.println(aviary.getName() + " is now clean");
        }
    }

}
