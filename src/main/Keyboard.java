package main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import main.Scale;

public class Keyboard extends JPanel {

    private final int keySoundOctave = 3;
    
    private final Key keyC = new WhiteKey();
    private final Key keyCS = new BlackKey();
    private final Key keyD = new WhiteKey();
    private final Key keyDS = new BlackKey();
    private final Key keyE = new WhiteKey();
    private final Key keyF = new WhiteKey();
    private final Key keyFS = new BlackKey();
    private final Key keyG = new WhiteKey();
    private final Key keyGS = new BlackKey();
    private final Key keyA = new WhiteKey();
    private final Key keyAS = new BlackKey();
    private final Key keyB = new WhiteKey();
    
    public Keyboard() {
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        
        keyC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Audio.playNote("C", keySoundOctave);
            }
        });
        this.add(keyC);
        
        keyCS.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Audio.playNote("CS", keySoundOctave);
            }
        });
        this.add(keyCS);
        
        keyD.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Audio.playNote("D", keySoundOctave);
            }
        });
        this.add(keyD);
        
        keyDS.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Audio.playNote("DS", keySoundOctave);
            }
        });
        this.add(keyDS);
        
        keyE.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Audio.playNote("E", keySoundOctave);
            }
        });
        this.add(keyE);
        
        keyF.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Audio.playNote("F", keySoundOctave);
            }
        });
        this.add(keyF);
        
        keyFS.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Audio.playNote("FS", keySoundOctave);
            }
        });
        this.add(keyFS);
        
        keyG.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Audio.playNote("G", keySoundOctave);
            }
        });
        this.add(keyG);
        
        keyGS.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Audio.playNote("GS", keySoundOctave);
            }
        });
        this.add(keyGS);
        
        keyA.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Audio.playNote("A", keySoundOctave);
            }
        });
        this.add(keyA);
        
        keyAS.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Audio.playNote("AS", keySoundOctave);
            }
        });
        this.add(keyAS);
        
        keyB.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Audio.playNote("B", keySoundOctave);
            }
        });
        this.add(keyB);
        
    }
    
    public void incrementKeySoundOctave() {
        JOptionPane.showMessageDialog(null, "This feature is currently unavailable");
    }
    
    public void decrementKeySoundOctave() {
        JOptionPane.showMessageDialog(null, "This feature is currently unavailable");
    }
    
    public int getKeySoundOctave() {
        return this.keySoundOctave;
    }
    
    public void updateKeyboardScale(Scale scale) {
        this.keyC.setHighlighted(scale.isNoteInScale(0));
        this.keyCS.setHighlighted(scale.isNoteInScale(1));
        this.keyD.setHighlighted(scale.isNoteInScale(2));
        this.keyDS.setHighlighted(scale.isNoteInScale(3));
        this.keyE.setHighlighted(scale.isNoteInScale(4));
        this.keyF.setHighlighted(scale.isNoteInScale(5));
        this.keyFS.setHighlighted(scale.isNoteInScale(6));
        this.keyG.setHighlighted(scale.isNoteInScale(7));
        this.keyGS.setHighlighted(scale.isNoteInScale(8));
        this.keyA.setHighlighted(scale.isNoteInScale(9));
        this.keyAS.setHighlighted(scale.isNoteInScale(10));
        this.keyB.setHighlighted(scale.isNoteInScale(11));
    }
    
    public void clearKeyboardScale() {
        this.keyC.setHighlighted(false);
        this.keyCS.setHighlighted(false);
        this.keyD.setHighlighted(false);
        this.keyDS.setHighlighted(false);
        this.keyE.setHighlighted(false);
        this.keyF.setHighlighted(false);
        this.keyFS.setHighlighted(false);
        this.keyG.setHighlighted(false);
        this.keyGS.setHighlighted(false);
        this.keyA.setHighlighted(false);
        this.keyAS.setHighlighted(false);
        this.keyB.setHighlighted(false);
    }

}
