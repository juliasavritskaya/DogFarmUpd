package by.mnkqn;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import by.mnkqn.dogs.*;
import by.mnkqn.employees.*;
import by.mnkqn.farm.*;
import by.mnkqn.helpers.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<Aviary> aviaries = new ArrayList<>();
        CreateCollections.fillAviaryCollection(aviaries);

        List<Dog> dogs = new ArrayList<>();
        CreateCollections.fillDogCollection(dogs, aviaries);

        List<Vets> vets = new ArrayList<>();
        CreateCollections.fillVetsCollection(vets);

        List<TrainingGround> trainingGrounds = new ArrayList<>();
        CreateCollections.fillTrainingGroundCollection(trainingGrounds);

        List<Staff> staffs = new ArrayList<>();
        CreateCollections.fillStaffCollection(staffs);

        List<Jobs> jobs = new ArrayList<>();
        CreateCollections.fillJobsCollection(jobs);

        for (Dog dog : dogs) {
            dog.eat();
        }

        System.out.println();

        for (Dog dog : dogs) {
            int vetRandom = vets.size();
            vets.get(random.nextInt(vetRandom)).reviewDog(dog);
        }

        System.out.println();

        for (Aviary aviary : aviaries) {
            int staffRandom = staffs.size();
            staffs.get(random.nextInt(staffRandom)).cleanAviary(aviary);
        }

        System.out.println();

        /*Why I use instanceof : methods could've been an interface, but they need different parameteres, and for old dog there's even none*/
        for (Dog dog : dogs) {
            int trainingGroundsRandom = trainingGrounds.size();
            int jobsRandom = jobs.size();
            if (dog instanceof Puppy) {
                ((Puppy) dog).trainPuppy(trainingGrounds.get(random.nextInt(trainingGroundsRandom)));
            } else if (dog instanceof AdultDog) {
                ((AdultDog) dog).goToWork(jobs.get(random.nextInt(jobsRandom)));
            } else if (dog instanceof OldDog) {
                ((OldDog) dog).staysAtAviary();
            }
        }

        System.out.println();

        for (Dog dog : dogs) {
            dog.eat();

        }
    }
}