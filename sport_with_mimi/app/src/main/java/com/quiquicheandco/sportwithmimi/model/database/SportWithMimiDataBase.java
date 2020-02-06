package com.quiquicheandco.sportwithmimi.model.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.quiquicheandco.sportwithmimi.DAO.ExerciceDAO;
import com.quiquicheandco.sportwithmimi.DAO.SeanceDAO;
import com.quiquicheandco.sportwithmimi.DAO.SequenceDAO;
import com.quiquicheandco.sportwithmimi.model.Exercice;
import com.quiquicheandco.sportwithmimi.model.Seance;
import com.quiquicheandco.sportwithmimi.model.Sequence;

@Database(entities = {Exercice.class, Seance.class, Sequence.class}, version = 1, exportSchema = false)
public abstract class SportWithMimiDataBase extends RoomDatabase {

    public abstract ExerciceDAO exerciceDAO();
    public abstract SeanceDAO seanceDAO();
    public abstract SequenceDAO sequenceDAO();


    private static volatile SportWithMimiDataBase INSTANCE;

    public static SportWithMimiDataBase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (SportWithMimiDataBase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),SportWithMimiDataBase.class,"SportWithMimi").build();
                }
            }
        }
        return INSTANCE;
    }
}
