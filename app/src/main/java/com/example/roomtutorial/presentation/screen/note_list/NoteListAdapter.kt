package com.example.roomtutorial.presentation.screen.note_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roomtutorial.R
import com.example.roomtutorial.domain.model.NoteModel
import kotlinx.android.synthetic.main.item_layout.view.*

class NoteListAdapter: RecyclerView.Adapter<NoteListAdapter.NoteViewHolder>() {

    private var listNote = emptyList<NoteModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.item_layout,
                parent,
                false
            )
        return NoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.itemView.item_title.text = listNote[position].title
    }

    override fun getItemCount(): Int = listNote.size



    class NoteViewHolder(view: View): RecyclerView.ViewHolder(view)
}