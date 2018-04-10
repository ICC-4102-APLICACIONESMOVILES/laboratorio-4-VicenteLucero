package com.example.gamma.lab04;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface DaoAccess {

    @Insert
    void insertOnlySingleFormulario (Formularios formularios);
    @Insert
    void insertMultipleFormularios(List<Formularios> formulariosList);
    @Query("SELECT * FROM Formularios WHERE Nombre = :Nombre")
    Formularios fetchOneFormulariosbyNombre(String Nombre);
    @Update
    void updateFormularios (Formularios formularios);
    @Delete
    void deleteFormularios (Formularios formularios);
}
