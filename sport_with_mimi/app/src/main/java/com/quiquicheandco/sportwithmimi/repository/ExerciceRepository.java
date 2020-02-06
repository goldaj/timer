package com.quiquicheandco.sportwithmimi.repository;

import android.app.Application;
import android.os.AsyncTask;

import com.quiquicheandco.sportwithmimi.DAO.ExerciceDAO;
import com.quiquicheandco.sportwithmimi.model.Exercice;
import com.quiquicheandco.sportwithmimi.model.database.SportWithMimiDataBase;

import java.util.List;

import androidx.lifecycle.MutableLiveData;

public class ExerciceRepository {
    private ExerciceDAO exerciceDAO;
    private MutableLiveData<List<Exercice>> sequences = new MutableLiveData<>();

    public ExerciceRepository(Application application) {
        SportWithMimiDataBase database = SportWithMimiDataBase.getDatabase(application);
        exerciceDAO = database.exerciceDAO();
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                sequences.postValue(exerciceDAO.getAll());
            }
        });
    }

    public MutableLiveData<List<Exercice>> getSequences() {
        return sequences;
    }

    public void insert(final Exercice exercice) {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                exerciceDAO.insert(exercice);
            }
        });
    }

    public Exercice getSequence(int position) {
        return sequences.getValue().get(position);
    }

    public void remove(int position) {
        final Exercice exercice = getSequence(position);
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                exerciceDAO.remove(exercice);
            }
        });
    }

    public void update(final Exercice exercice) {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                exerciceDAO.update(exercice);
            }
        });
    }
}
