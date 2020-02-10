package com.quiquicheandco.sportwithmimi.db.entity;

import com.quiquicheandco.sportwithmimi.model.Seance;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "seances")
public class SeanceEntity implements Seance {
    @PrimaryKey(autoGenerate = true)
    private Integer id;
    private String label;
    private Boolean saved; //TODO: see if usefull
    private Boolean selected; //If on selection to do some action (save/delete)/
}
