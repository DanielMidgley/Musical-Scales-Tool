package main;

import java.awt.Color;
import javax.swing.JPanel;

public class Key extends JPanel {
    
    public Key() {
        
    }
    
    public void setHighlighted(boolean highlighted) {
        if (!highlighted && this instanceof WhiteKey) {
            this.setBackground(Color.WHITE);
        } else if (!highlighted && this instanceof BlackKey) {
            this.setBackground(Color.BLACK);
        } else {
            this.setBackground(Color.RED);
        }
    }
    
}
