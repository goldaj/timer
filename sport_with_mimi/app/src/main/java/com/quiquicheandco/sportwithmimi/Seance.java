package com.quiquicheandco.sportwithmimi;

import java.util.List;

public class Seance {
    private String id;

    private String label;

    private List<Sequence> sequences;

    private Boolean saved; //TODO: see if usefull

    private Boolean selected; //If on selection to do some action (save/delete)/

    public void saveSeance() {
        //TODO
    }

    public void deleteSeance() {
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

    public List<Sequence> getSequences() {
        return sequences;
    }

    public void setSequences(List<Sequence> sequences) {
        this.sequences = sequences;
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
