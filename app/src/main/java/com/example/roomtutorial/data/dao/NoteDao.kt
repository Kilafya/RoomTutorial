package com.example.roomtutorial.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.roomtutorial.data.model.NoteDbModel

@Dao
interface NoteDao {

    @Query("SELECT * from note_table")
    fun getAllNotes(): LiveData<List<NoteDbModel>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(noteDbModel: NoteDbModel)

    @Delete
    suspend fun delete(noteDbModel: NoteDbModel)
}