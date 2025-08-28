package main;

public class Scale {
    
    private final NoteInScale[] notesInScale = new NoteInScale[12];
    private Note rootNote;

    public Scale() {
        createNotes();
    }
    
    public Scale(Note rootNote) {
        this.rootNote = rootNote;
        createNotes();
        for (int i = 0; i < this.notesInScale.length; i++) {
            notesInScale[(rootNote.getOrder() + i) % 12].setIsInScale(ScaleQualities.getScaleFormat("Major")[i]);
        }
    }
    
    public Scale(Note rootNote, String scaleQuality){
        this.rootNote = rootNote;
        createNotes();
        for (int i = 0; i < this.notesInScale.length; i++) {
            notesInScale[(rootNote.getOrder() + i) % 12].setIsInScale(ScaleQualities.getScaleFormat(scaleQuality)[i]);
        }
    }
    
    public NoteInScale[] getNotesInScale() {
        return this.notesInScale;
    }
    
    public String getScaleInfo() {
        String str = "";
        for (NoteInScale note : notesInScale) {
            str += note.getNoteName() + "\t" + note.getOrder() + "\t" + note.getIsInScale() + "\n";
        }
        return str;
    }
    
    private void createNotes() {
        String[] noteNames = {"C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B"};
        for (int i = 0; i < this.notesInScale.length; i++) {
            this.notesInScale[i] = new NoteInScale(noteNames[i], i, false);
        }
    }
    
    public boolean isNoteInScale(int noteOrder) {
        return this.notesInScale[noteOrder].getIsInScale();
    }
    
    @Override
    public String toString(){
        String str = "";
        int i = this.rootNote.getOrder();
        int j = 0;
        while (j < 8) {
            if (this.notesInScale[i].getIsInScale()) {
                str += this.notesInScale[i].getNoteName() + "  ";
                j++;
            }
            if (i < 11) {
                i++;
            } else {
                i = 0;
            }
        }
        return str;
    }
    
}
