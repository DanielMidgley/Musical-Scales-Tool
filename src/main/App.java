package main;

import javax.swing.JFrame;

public class App {
    
    private static Scale currentlySelectedScale = new Scale();
    
    public static void main(String[] args) {
        final JFrame mainGUI = GUI.getMainGUI();
    }
    
    public static void setCurrentlySelectedScale(Scale scale) {
        App.currentlySelectedScale = scale;
    }
    
    public static Scale getCurrentlySelectedScale() {
        return App.currentlySelectedScale;
    }

}
