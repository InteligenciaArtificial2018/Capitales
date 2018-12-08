package com.example.allan.capitales.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(entities = [CapitalesDao::class], version = 2, exportSchema = false)
abstract class CapitalesListDatabase: RoomDatabase() {
    /**
     * Este es un método abstracto que retorna el DAO para la base de datos.
     */
    abstract fun getToDoDao(): CapitalesDao

    /**
     * Un patrón de diseño Singleton es utilizado para asegurarnos que
     * solamente se cree una instancia de la base de datos.
     */
    companion object {
        val databaseName = "tododatabase"
        var todoListDatabase: CapitalesListDatabase? = null

        fun getInstance(context: Context): CapitalesListDatabase? {
            if (todoListDatabase == null) {
                todoListDatabase = Room.databaseBuilder(context,
                    CapitalesListDatabase::class.java,
                    CapitalesListDatabase.databaseName)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return todoListDatabase
        }
    }
}