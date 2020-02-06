package com.quiquicheandco.sportwithmimi.model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

public class SeanceSequenceDetails {
    public SeanceSequenceDetails() {
    }

    @Embedded
    private Seance seance;

    @Relation(parentColumn = "id", entityColumn = "sequenceId", entity = Sequence.class)
    private List<Sequence> sequence;
}
