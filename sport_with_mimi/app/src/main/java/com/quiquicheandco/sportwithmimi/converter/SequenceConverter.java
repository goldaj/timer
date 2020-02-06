package com.quiquicheandco.sportwithmimi.converter;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.quiquicheandco.sportwithmimi.model.Exercice;
import com.quiquicheandco.sportwithmimi.model.Sequence;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class SequenceConverter {
    static Gson gson = new Gson();

    @TypeConverter
    public static List<Sequence> stringToSequenceList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }
        Type listType = new TypeToken<List<Sequence>>() {
        }.getType();
        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String sequenceListToString(List<Sequence> sequences) {
        return gson.toJson(sequences);
    }
}
