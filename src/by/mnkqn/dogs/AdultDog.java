package by.mnkqn.dogs;

import by.mnkqn.helpers.Jobs;

public class AdultDog extends Dog {
    
    @Override
    public void eat() {
        System.out.println(getName() + " is eating food for adult dogs");
    }

    public void goToWork(Jobs jobs) {
        System.out.println(getName() + " goes to work to " + jobs.getName());
    }
    
}
