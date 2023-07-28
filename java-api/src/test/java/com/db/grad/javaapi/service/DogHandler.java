package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;

public class DogHandler {
    private DogsRepository itsDogRepo;

    public DogHandler(DogsRepository repo){
        itsDogRepo = repo;
    }

    public long addDog(Dog theDog) {
        return  itsDogRepo.save(theDog);
    }

    public long getNoOfDogs() {
        return itsDogRepo.count();
    }

    public Dog getDogById(long id) {
        if (id==0){
            return null;
        }
        else{ 
            return itsDogRepo.findById(id);
        }
    }

    public Dog getDogByName(String name) {
        List<Dog> dogs = itsDogRepo.findByName(name);
        if (dogs.size() != 1) {
            return null;
        } else {
            return dogs.get(0);
        }
    }


}
