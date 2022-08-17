package com.example.roomtutorial.domain.use_cases

import com.example.roomtutorial.domain.repository.NoteRepository

class GetAllNotesUseCase(
    private val repository: NoteRepository
) {
    operator fun invoke() = repository.allNotes
}