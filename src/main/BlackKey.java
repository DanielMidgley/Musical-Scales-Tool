package main;

import java.awt.Color;

public class BlackKey extends Key {
    
    public BlackKey() {
        this.setOpaque(true);
        this.setBackground(Color.BLACK);
    }
    
    public BlackKey(boolean highlighted) {
        this.setOpaque(true);
        if (highlighted) {
            this.setBackground(Color.RED);
        } else {
            this.setBackground(Color.BLACK);
        }
    }
    
    @Override
    public void setHighlighted(boolean highlighted) {
        if (highlighted) {
            this.setBackground(Color.RED);
        } else {
            this.setBackground(Color.BLACK);
        }
    }
    
}
