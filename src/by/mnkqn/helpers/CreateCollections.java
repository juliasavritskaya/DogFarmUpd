package by.mnkqn.helpers;

import by.mnkqn.dogs.*;
import by.mnkqn.employees.*;
import by.mnkqn.farm.*;

import java.util.List;

public class CreateCollections {

    public static void fillDogCollection(List<Dog> dogs, List<Aviary> aviaries) {
        dogs.add(createDogs("Lucky", 15));
        dogs.get(0).setAviary(aviaries.get(0));
        dogs.get(0).setHealthy(true);
        dogs.add(createDogs("Stephen", 5));
        dogs.get(1).setAviary(aviaries.get(1));
        dogs.get(1).setHealthy(false);
        dogs.add(createDogs("Fluffy", 1));
        dogs.get(2).setAviary(aviaries.get(2));
        dogs.get(2).setHealthy(true);
    }

    private static Dog createDogs(String name, int age) {
        final int puppyMaxAge = 2;
        final int adultMaxAge = 8;
        Dog dog = null;
        /* ??? Dog dog;
        Dog = null;*/

        if (age <= puppyMaxAge) {
            dog = new Puppy();
            dog.setName(name);
            dog.setAge(age);
            return dog;
        } else if (age >= puppyMaxAge && age <= adultMaxAge) {
            dog = new AdultDog();
            dog.setName(name);
            dog.setAge(age);
            return dog;
        } else if (age >= adultMaxAge) {
            dog = new OldDog();
            dog.setName(name);
            dog.setAge(age);
            return dog;
        }
        return dog;
    }

    public static void fillVetsCollection(List<Vets> vets) {
        vets.add(new Vets("Andrew"));
        vets.add(new Vets("Helena"));
        vets.add(new Vets("Marie"));
    }

    public static void fillAviaryCollection(List<Aviary> voliers) {
        voliers.add(new Aviary("Volier 1", true));
        voliers.add(new Aviary("Volier 2", false));
        voliers.add(new Aviary("Volier 3", false));
    }

    public static void fillStaffCollection(List<Staff> staff) {
        staff.add(new Staff("Staff Amanda"));
        staff.add(new Staff("Staff Eugen"));
        staff.add(new Staff("Staff Marco"));
    }

    public static void fillTrainingGroundCollection(List<TrainingGround> trainingGrounds) {
        trainingGrounds.add(new TrainingGround("huge training ground"));
        trainingGrounds.add(new TrainingGround("small training ground #1"));
        trainingGrounds.add(new TrainingGround("small training ground #2"));
    }

    public static void fillJobsCollection(List<Jobs> jobs) {
        jobs.add(new Jobs("police station"));
        jobs.add(new Jobs("medical centre"));
        jobs.add(new Jobs("volunteer centre"));
    }

}