package com.quiquicheandco.sportwithmimi.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "exercice")
public class Exercice implements Parcelable {
    @PrimaryKey(autoGenerate = true)
    private Integer id;

    private String label;

    private int duration;

    private Boolean saved; //TODO: see if usefull

    private Boolean selected; //If on selection to do some action (save/delete)/


    public Exercice() {
    }

    protected Exercice(Parcel in) {
        id = in.readInt();
        label = in.readString();
        duration = in.readInt();
        saved = in.readByte() != 0;
        selected = in.readByte() != 0;
    }

    public static final Creator<Exercice> CREATOR = new Creator<Exercice>() {
        @Override
        public Exercice createFromParcel(Parcel in) {
            return new Exercice(in);
        }

        @Override
        public Exercice[] newArray(int size) {
            return new Exercice[size];
        }
    };

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.label);
        dest.writeInt(this.duration);
        dest.writeByte((byte) (this.saved ? 1 : 0));
        dest.writeByte((byte) (this.selected ? 1 : 0));
    }

    @Override
    public String toString() {
        return "Exercice{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", duration=" + duration +
                ", saved=" + saved +
                ", selected=" + selected +
                '}';
    }
}
