package com.quiquicheandco.sportwithmimi.model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

public class SequenceExerciceDetails {
    public SequenceExerciceDetails() {
    }

    @Embedded
    public Sequence sequence;

    @Relation(parentColumn = "id", entityColumn = "exerciceId", entity = Exercice.class)
    private List<Exercice> exercices;
}
