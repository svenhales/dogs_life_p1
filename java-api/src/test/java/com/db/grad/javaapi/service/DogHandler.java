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
        return itsDogRepo.findById(id);
    }



}
