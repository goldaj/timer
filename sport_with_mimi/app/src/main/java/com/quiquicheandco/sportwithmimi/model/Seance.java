package com.quiquicheandco.sportwithmimi.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "seance")
public class Seance implements Parcelable {
    @PrimaryKey(autoGenerate = true)
    private Integer id;

    private String label;
    @Ignore
    private List<Sequence> sequences;

    @ForeignKey
            (entity = Sequence.class,
                    parentColumns = "id",
                    childColumns = "publisherId",
                    onDelete = CASCADE)
    private Integer sequenceId;

    private Boolean saved; //TODO: see if usefull

    private Boolean selected; //If on selection to do some action (save/delete)/

    public Seance() {
    }

    protected Seance(Parcel in) {
        id = in.readInt();
        label = in.readString();
        saved = in.readByte() != 0;
        selected = in.readByte() != 0;
    }

    public static final Creator<Seance> CREATOR = new Creator<Seance>() {
        @Override
        public Seance createFromParcel(Parcel in) {
            return new Seance(in);
        }

        @Override
        public Seance[] newArray(int size) {
            return new Seance[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.label);
        dest.writeParcelableArray((Parcelable[]) this.sequences.toArray(),flags);
        dest.writeByte((byte) (this.saved ? 1 : 0));
        dest.writeByte((byte) (this.selected ? 1 : 0));
    }
}
