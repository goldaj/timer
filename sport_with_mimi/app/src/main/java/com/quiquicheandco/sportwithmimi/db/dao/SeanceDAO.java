package com.quiquicheandco.sportwithmimi.db.dao;

import com.quiquicheandco.sportwithmimi.db.entity.SeanceEntity;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface SeanceDAO {
    @Query("SELECT * FROM seances")
    LiveData<List<SeanceEntity>> loadAllSeances();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<SeanceEntity> products);

    @Query("select * from seances where id = :seanceId")
    LiveData<SeanceEntity> loadSeance(int seanceId);

    @Query("select * from seances where id = :seanceId")
    SeanceEntity loadSeanceSync(int seanceId);
}
