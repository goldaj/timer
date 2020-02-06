package com.quiquicheandco.sportwithmimi.repository;

import android.app.Application;
import android.os.AsyncTask;

import com.quiquicheandco.sportwithmimi.DAO.SequenceDAO;
import com.quiquicheandco.sportwithmimi.model.Sequence;
import com.quiquicheandco.sportwithmimi.model.database.SportWithMimiDataBase;

import java.util.List;

import androidx.lifecycle.MutableLiveData;

public class SequenceRepository {
    private SequenceDAO sequenceDAO;
    private MutableLiveData<List<Sequence>> sequences = new MutableLiveData<>();

    public SequenceRepository(Application application) {
        SportWithMimiDataBase database = SportWithMimiDataBase.getDatabase(application);
        sequenceDAO = database.sequenceDAO();
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                sequences.postValue(sequenceDAO.getAll());
            }
        });
    }

    public MutableLiveData<List<Sequence>> getSequences() {
        return sequences;
    }

    public void insert(final Sequence sequence) {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                sequenceDAO.insert(sequence);
            }
        });
    }

    public Sequence getSequence(int position) {
        return sequences.getValue().get(position);
    }

    public void remove(int position) {
        final Sequence sequence = getSequence(position);
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                sequenceDAO.remove(sequence);
            }
        });
    }

    public void update(final Sequence sequence) {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                sequenceDAO.update(sequence);
            }
        });
    }
}
