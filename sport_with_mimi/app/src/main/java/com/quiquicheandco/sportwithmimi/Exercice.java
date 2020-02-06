package com.quiquicheandco.sportwithmimi;

public class Exercice {
    private String id;

    private String label;

    private String duration;

    private Boolean saved; //TODO: see if usefull

    private Boolean selected; //If on selection to do some action (save/delete)/

    public void saveExercice() {
        //TODO
    }

    public void deleteExercice() {
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Boolean getSaved() {
        return saved;
    }

    public void setSaved(Boolean saved) {
        this.saved = saved;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
