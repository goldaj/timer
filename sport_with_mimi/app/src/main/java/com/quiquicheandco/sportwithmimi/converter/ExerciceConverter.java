package com.quiquicheandco.sportwithmimi.converter;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.quiquicheandco.sportwithmimi.model.Exercice;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class ExerciceConverter {
    static Gson gson = new Gson();

    @TypeConverter
    public static List<Exercice> stringToExerciceList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }
        Type listType = new TypeToken<List<Exercice>>() {
        }.getType();
        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String exerciceListToString(List<Exercice> exercices) {
        return gson.toJson(exercices);
    }

}
