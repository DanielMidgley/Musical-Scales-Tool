package main;

public class NoteInScale extends Note {
    
    private boolean isInScale;

    public NoteInScale(String noteName, int noteOrder, boolean isInScale) {
        super(noteName, noteOrder);
        this.isInScale = isInScale;
    }
    
    public boolean getIsInScale() {
        return this.isInScale;
    }
    
    public void setIsInScale(boolean isInScale) {
        this.isInScale = isInScale;
    }

}
