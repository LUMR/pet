package com.java.lumr.pet.dao.impl;

import com.java.lumr.pet.dao.BaseDAO;
import com.java.lumr.pet.dao.PetDAO;
import com.java.lumr.pet.vo.Pet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * impl
 * Created by lumr on 2017/3/26.
 */
public class PetDAOImpl extends BaseDAO implements PetDAO {
    @Override
    public List<Pet> getAllPet() {
        getConn();
        String sql = "SELECT * FROM pet;";
        List<Pet> list = new ArrayList<>();
        try {
            pstmt = conn.prepareStatement(sql);
            result = pstmt.executeQuery();
            Pet pet;
            while (result.next()) {
                pet = new Pet(result.getInt("petId"), result.getString("petName"), result.getString("breed"),
                        result.getString("petSex"), result.getDate("birthday"), result.getString("description"));
                list.add(pet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return list;
    }

    @Override
    public List<Pet> getAllPet(String breed) {
        getConn();
        String sql = "SELECT * FROM pet WHERE breed = ?;";
        List<Pet> list = new ArrayList<>();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, breed);
            result = pstmt.executeQuery();
            Pet pet;
            while (result.next()) {
                pet = new Pet(result.getInt("petId"), result.getString("petName"), result.getString("breed"),
                        result.getString("petSex"), result.getDate("birthday"), result.getString("description"));
                list.add(pet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return list;
    }

    @Override
    public List<String> getPetBreed() {
        getConn();
        String sql = "SELECT breed FROM pet GROUP BY breed;";
        List<String> list = new ArrayList<>();
        try {
            pstmt = conn.prepareStatement(sql);
            result = pstmt.executeQuery();
            while (result.next()) {
                list.add(result.getString("breed"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return list;
    }

    @Override
    public int addPet(Pet pet) {
        getConn();
        String sql = "INSERT INTO pet VALUES(NULL,?,?,?,?,?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, pet.getName());
            pstmt.setObject(2, pet.getBreed());
            pstmt.setObject(3, pet.getSex());
            pstmt.setObject(4, pet.getBrithday());
            pstmt.setObject(5, pet.getDescription());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } finally {
            closeAll();
        }
    }
}
