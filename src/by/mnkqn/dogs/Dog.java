package by.mnkqn.dogs;

import by.mnkqn.farm.Aviary;
import by.mnkqn.helpers.Eatable;

public abstract class Dog implements Eatable {
    
    private String name;
    private int age;
    private boolean trained;
    private boolean healthy;
    private Aviary aviary;

    public void eat() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public void setAviary(Aviary aviary) {
        this.aviary = aviary;
    }

    public Aviary getAviary() {
        return aviary;
    }

}
