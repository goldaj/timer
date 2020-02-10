package com.quiquicheandco.sportwithmimi.db.entity;

import com.quiquicheandco.sportwithmimi.model.Exercice;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "exercices",
        foreignKeys = {
                @ForeignKey(entity = SeanceEntity.class,
                        parentColumns = "id",
                        childColumns = "sequenceId",
                        onDelete = ForeignKey.CASCADE)},
        indices = {@Index(value = "sequenceId")
        })
public class ExerciceEntity implements Exercice {
    @PrimaryKey(autoGenerate = true)
    private Integer id;
    private Integer sequenceId;
    private String label;
    private int duration;
    private Boolean saved;
    private Boolean selected;
}
