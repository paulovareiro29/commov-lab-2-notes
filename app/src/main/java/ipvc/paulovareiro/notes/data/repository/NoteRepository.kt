package ipvc.paulovareiro.notes.data.repository

import androidx.lifecycle.LiveData
import ipvc.paulovareiro.notes.data.dao.NoteDao
import ipvc.paulovareiro.notes.data.entities.Note

class NotesRepository(private  val noteDao: NoteDao) {
    val readAllNotes : LiveData<List<Note>> = noteDao.readAllNotes()

    suspend fun addNote(note: Note){
        noteDao.addNote(note)
    }

    suspend fun updateNote(note: Note) {
        noteDao.updateNote(note)
    }

    suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }
}