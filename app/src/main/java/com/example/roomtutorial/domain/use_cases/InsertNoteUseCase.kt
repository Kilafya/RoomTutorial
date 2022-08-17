package com.example.roomtutorial.domain.use_cases

import com.example.roomtutorial.domain.model.NoteModel
import com.example.roomtutorial.domain.repository.NoteRepository

class InsertNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(noteModel: NoteModel, onSuccess: () -> Unit) {
        repository.insertNote(noteModel, onSuccess)
    }
}