package main;

import java.awt.Color;
import javax.swing.BorderFactory;

public class WhiteKey extends Key {
    
    public WhiteKey() {
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.gray));
    }
    
    public WhiteKey(boolean highlighted) {
        this.setOpaque(true);
        this.setBorder(BorderFactory.createLineBorder(Color.gray));
        if (highlighted) {
            this.setBackground(Color.RED);
        } else {
            this.setBackground(Color.WHITE);
        }
    }
    
    @Override
    public void setHighlighted(boolean highlighted) {
        if (highlighted) {
            this.setBackground(Color.RED);
        } else {
            this.setBackground(Color.WHITE);
        }
    }
    
}
