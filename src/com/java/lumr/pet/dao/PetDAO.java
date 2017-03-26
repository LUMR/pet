package com.java.lumr.pet.dao;

import com.java.lumr.pet.vo.Pet;

import java.util.List;

/**petDao
 * Created by fsweb on 17-3-24.
 */
public interface PetDAO {
    List<Pet> getAllPet();
    List<Pet> getAllPet(String breed);
    List<String> getPetBreed();

    int addPet(Pet pet);
}
