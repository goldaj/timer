package com.quiquicheandco.sportwithmimi.db.entity;

import com.quiquicheandco.sportwithmimi.model.Sequence;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "sequences",
        foreignKeys = {@ForeignKey(entity = SeanceEntity.class,
                parentColumns = "id",
                childColumns = "seanceId",
                onDelete = ForeignKey.CASCADE)},
        indices = {@Index(value = "seanceId")
        })
public class SequenceEntity implements Sequence {
    @PrimaryKey(autoGenerate = true)
    private Integer id;
    private Integer seanceId;
    private String label;
    private Boolean saved;
    private Boolean selected;
}
