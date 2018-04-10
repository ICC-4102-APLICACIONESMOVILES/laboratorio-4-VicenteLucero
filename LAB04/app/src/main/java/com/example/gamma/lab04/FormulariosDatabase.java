package com.example.gamma.lab04;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Formularios.class}, version = 1, exportSchema = false)
public abstract class FormulariosDatabase extends RoomDatabase {
    public abstract static DaoAccess daoAccess() ;
}