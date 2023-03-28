package com.example.notes.listeners;

//untuk lihat notes,

import com.example.notes.entities.Note;

public interface NotesListener {
// ketika note diklik
    void onNoteClicked(Note note, int position);
}
