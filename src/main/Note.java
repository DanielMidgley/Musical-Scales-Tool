package main;

class Note {
    
    private final String noteName;
    private final int noteOrder;
    
    public Note(String noteName, int noteOrder){
        this.noteName = noteName;
        this.noteOrder = noteOrder;
    }
    
    public String getNoteName() {
        return this.noteName;
    }
    
    public int getOrder(){
        return this.noteOrder;
    }
    
    @Override
    public String toString(){
        return this.noteName;
    }
    
    public static Note getNoteWithOrder(int order){
        Scale scale = new Scale();
        NoteInScale[] notes = scale.getNotesInScale();
        for (NoteInScale note : notes) {
            if (note.getOrder() == order) {
                return note;
            }
        }
        return null;
    }
    
    public static Note getNote(String noteName){
        Scale scale = new Scale();
        NoteInScale[] notes = scale.getNotesInScale();
        for (NoteInScale note : notes) {
            if (note.getNoteName().equals(noteName)) {
                return note;
            }
        }
        return null;
    }
    
    public static String[] listAllNotes() {
        return Utilities.arrToString(new Scale().getNotesInScale());
    }
    
}
