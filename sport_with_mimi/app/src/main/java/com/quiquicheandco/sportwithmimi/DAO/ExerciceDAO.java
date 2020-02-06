package com.quiquicheandco.sportwithmimi.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.quiquicheandco.sportwithmimi.model.Exercice;
import com.quiquicheandco.sportwithmimi.model.Seance;

import java.util.List;

@Dao
public interface ExerciceDAO {

    @Insert
    void insert(Exercice exercice);

    @Query("DELETE FROM exercice")
    void deleteAll();

    @Query("SELECT * FROM exercice")
    List<Exercice> getAll();

    @Delete
    void remove(Exercice exercice);

    @Update
    void update(Exercice exercice);
}
