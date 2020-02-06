package com.quiquicheandco.sportwithmimi.repository;

import android.app.Application;
import android.os.AsyncTask;

import com.quiquicheandco.sportwithmimi.DAO.SeanceDAO;
import com.quiquicheandco.sportwithmimi.model.Seance;
import com.quiquicheandco.sportwithmimi.model.database.SportWithMimiDataBase;

import java.util.List;

import androidx.lifecycle.MutableLiveData;

public class SeanceRepository {
    private SeanceDAO seanceDAO;
    private MutableLiveData<List<Seance>> sequences = new MutableLiveData<>();

    public SeanceRepository(Application application) {
        SportWithMimiDataBase database = SportWithMimiDataBase.getDatabase(application);
        seanceDAO = database.seanceDAO();
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                sequences.postValue(seanceDAO.getAll());
            }
        });
    }

    public MutableLiveData<List<Seance>> getSequences() {
        return sequences;
    }

    public void insert(final Seance seance) {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                seanceDAO.insert(seance);
            }
        });
    }

    public Seance getSequence(int position) {
        return sequences.getValue().get(position);
    }

    public void remove(int position) {
        final Seance seance = getSequence(position);
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                seanceDAO.remove(seance);
            }
        });
    }

    public void update(final Seance seance) {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                seanceDAO.update(seance);
            }
        });
    }
}
