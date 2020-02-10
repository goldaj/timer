/*
 * Copyright 2017, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.persistence.db;

import android.content.Context;

import com.quiquicheandco.sportwithmimi.db.dao.ExerciceDAO;
import com.quiquicheandco.sportwithmimi.db.dao.SeanceDAO;
import com.quiquicheandco.sportwithmimi.db.dao.SequenceDAO;
import com.quiquicheandco.sportwithmimi.db.entity.ExerciceEntity;
import com.quiquicheandco.sportwithmimi.db.entity.SeanceEntity;
import com.quiquicheandco.sportwithmimi.db.entity.SequenceEntity;

import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {SeanceEntity.class, SequenceEntity.class, ExerciceEntity.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {

    private static volatile AppDatabase sInstance;

    @VisibleForTesting
    public static final String DATABASE_NAME = "sport-with-mimi-db";

    public abstract ExerciceDAO exerciceDAO();

    public abstract SequenceDAO sequenceDAO();

    public abstract SeanceDAO seanceDAO();

    public static AppDatabase getInstance(final Context context) {
        if (sInstance == null) {
            synchronized (AppDatabase.class) {
                if (sInstance == null) {
                    sInstance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, DATABASE_NAME).build();

                }
            }
        }
        return sInstance;
    }

}
