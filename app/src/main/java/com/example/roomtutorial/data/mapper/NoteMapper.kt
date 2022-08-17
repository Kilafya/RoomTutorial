package com.example.roomtutorial.data.mapper

import com.example.roomtutorial.data.model.NoteDbModel
import com.example.roomtutorial.domain.model.NoteModel

class NoteMapper {

    fun mapModelToDbModel(noteModel: NoteModel) = NoteDbModel(
        id = noteModel.id,
        title = noteModel.title,
        description = noteModel.description
    )

    private fun mapDbModelToModel(noteDbModel: NoteDbModel) = NoteModel(
        id = noteDbModel.id,
        title = noteDbModel.title,
        description = noteDbModel.description
    )

    fun mapDbModelListToModelList(list: List<NoteDbModel>) = list.map { mapDbModelToModel(it) }
}