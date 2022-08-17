package com.example.roomtutorial.domain.use_cases

import com.example.roomtutorial.domain.model.NoteModel
import com.example.roomtutorial.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(noteModel: NoteModel, onSuccess: () -> Unit) {
        repository.deleteNote(noteModel, onSuccess)
    }
}