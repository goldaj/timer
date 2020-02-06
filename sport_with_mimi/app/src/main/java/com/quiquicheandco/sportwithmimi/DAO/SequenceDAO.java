package com.quiquicheandco.sportwithmimi.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.quiquicheandco.sportwithmimi.model.Exercice;
import com.quiquicheandco.sportwithmimi.model.Seance;
import com.quiquicheandco.sportwithmimi.model.Sequence;

import java.util.List;

@Dao
public interface SequenceDAO {

    @Insert
    void insert(Sequence sequence);

    @Query("DELETE FROM sequence")
    void deleteAll();

    @Query("SELECT * FROM sequence")
    List<Sequence> getAll();

    @Delete
    void remove(Sequence sequence);

    @Update
    void update(Sequence sequence);
}
