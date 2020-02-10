package com.quiquicheandco.sportwithmimi.db.dao;

import com.quiquicheandco.sportwithmimi.db.entity.ExerciceEntity;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface ExerciceDAO {
    @Query("SELECT * FROM exercices where sequenceId = :sequenceId")
    LiveData<List<ExerciceEntity>> loadExercices(int sequenceId);

    @Query("SELECT * FROM exercices where sequenceId = :sequenceId")
    List<ExerciceEntity> loadExercicesSync(int sequenceId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<ExerciceEntity> exercices);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(ExerciceEntity exercice);
}
