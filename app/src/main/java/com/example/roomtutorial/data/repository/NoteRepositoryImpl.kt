package com.example.roomtutorial.data.repository

import androidx.lifecycle.LiveData
import com.example.roomtutorial.data.dao.NoteDao
import com.example.roomtutorial.domain.model.NoteModel
import com.example.roomtutorial.domain.repository.NoteRepository

class NoteRepositoryImpl(private val noteDao: NoteDao) : NoteRepository {

    override val allNotes: LiveData<List<NoteModel>>

    override suspend fun insertNote(noteModel: NoteModel, onSuccess: () -> Unit) {
    }

    override suspend fun deleteNote(noteModel: NoteModel, onSuccess: () -> Unit) {
    }


}