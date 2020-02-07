package com.quiquicheandco.sportwithmimi.model;

import com.quiquicheandco.sportwithmimi.R;

public enum MainPagerModel {
    MAIN_LAYOUT("main_layout", R.layout.main_timer),
    CREATE_SEANCE("create_seance", R.layout.create_seance);

    private String titleResourceId;
    private int layoutResourceId;

    MainPagerModel(String titleResourceId, int layoutResourceId) {
        this.titleResourceId = titleResourceId;
        this.layoutResourceId = layoutResourceId;
    }

    public String getTitleResourceId() {
        return this.titleResourceId;
    }

    public int getLayoutResourceId() {
        return this.layoutResourceId;
    }
}
