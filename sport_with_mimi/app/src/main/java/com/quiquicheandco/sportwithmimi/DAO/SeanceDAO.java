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
public interface SeanceDAO {


    @Insert
    void insert(Seance seance);

    @Query("DELETE FROM seance")
    void deleteAll();

    @Query("SELECT * FROM seance")
    List<Seance> getAll();

    @Delete
    void remove(Seance seance);

    @Update
    void update(Seance seance);
}
