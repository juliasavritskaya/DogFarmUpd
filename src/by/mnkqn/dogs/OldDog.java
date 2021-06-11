package by.mnkqn.dogs;

public class OldDog extends Dog {

    @Override
    public void eat() {
        System.out.println(getName() + " is eating food for old dogs");
    }

    public void staysAtAviary() {
        System.out.println(getName() + " stays home at  aviary " + getAviary());
    }
    
}
