package by.mnkqn.employees;

import by.mnkqn.dogs.Dog;

public class Vets extends Humanity {

    public Vets(String name) {
        super(name);
    }

    public void work() {
        System.out.println("Vet is working");
    }

    public void reviewDog(Dog dog) {
        System.out.println("Vet " + getName() + " reviews " + dog.getName());
        if (dog.isHealthy()) {
            System.out.println(dog.getName() + " is healthy\n");
        } else if (!dog.isHealthy()) {
            System.out.println(dog.getName() + " needs to be healed");
            healDog(dog);
        }
    }

    private void healDog(Dog dog) {
        System.out.println("Healing " + dog.getName());
        dog.setHealthy(true);
        System.out.println(dog.getName() + " is healthy now\n");
    }
}