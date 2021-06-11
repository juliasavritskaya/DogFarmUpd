package by.mnkqn.employees;

import by.mnkqn.helpers.*;

public abstract class Humanity implements Eatable, Workable {
    private String name;
    private int age;

    public Humanity(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Humans are eating");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
