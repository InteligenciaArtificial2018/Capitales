package com.example.allan.capitales.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "Tcapitales")
class Tcapitales(
    @ColumnInfo(name = "nombre")
    var nombre: String = "",
    @ColumnInfo(name = "respuesta1")
    var respuesta1: String = "",
    @ColumnInfo(name = "respuesta2")
    var priorrespuesta2idad: Int = 0,
    @ColumnInfo(name = "respuesta3")
    var respuesta3: String = "")
{
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}


