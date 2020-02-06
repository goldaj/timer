package com.quiquicheandco.sportwithmimi;

import java.util.List;

public class Sequence {
    private String id;

    private String label;

    private List<Exercice> exercices;

    private Boolean saved; //TODO: see if usefull

    private Boolean selected; //If on selection to do some action (save/delete)/

    public void saveSequence() {
        //TODO
    }

    public void deleteSequence() {
        //TODO
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Exercice> getExercices() {
        return exercices;
    }

    public void setExercices(List<Exercice> exercices) {
        this.exercices = exercices;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Boolean getSaved() {
        return saved;
    }

    public void setSaved(Boolean saved) {
        this.saved = saved;
    }
}
