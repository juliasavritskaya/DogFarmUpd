package by.mnkqn.dogs;

import by.mnkqn.farm.TrainingGround;

public class Puppy extends Dog {
    
    private boolean trained;

    @Override
    public void eat() {
        System.out.println(getName() + " is eating puppy's food");
    }

    public void trainPuppy(TrainingGround trainingGround) {
        System.out.println("Puppy " + getName() + " is trained on a " + trainingGround.getName());
        setTrained(true);
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }
    
}
