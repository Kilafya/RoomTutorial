package com.example.roomtutorial.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.roomtutorial.data.dao.NoteDao
import com.example.roomtutorial.data.mapper.NoteMapper
import com.example.roomtutorial.domain.model.NoteModel
import com.example.roomtutorial.domain.repository.NoteRepository

class NoteRepositoryImpl(private val noteDao: NoteDao) : NoteRepository {

    private val mapper = NoteMapper()

    override val allNotes: LiveData<List<NoteModel>>
        get() = Transformations.map(noteDao.getAllNotes()) {
            mapper.mapDbModelListToModelList(it)
        }

    override suspend fun insertNote(noteModel: NoteModel, onSuccess: () -> Unit) {
        noteDao.insert(mapper.mapModelToDbModel(noteModel))
        onSuccess()
    }

    override suspend fun deleteNote(noteModel: NoteModel, onSuccess: () -> Unit) {
        noteDao.delete(mapper.mapModelToDbModel(noteModel))
        onSuccess()
    }


}