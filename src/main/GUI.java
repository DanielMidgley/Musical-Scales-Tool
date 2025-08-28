package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {

    private static final int[] SIZE = {400, 250};
    private static final Keyboard keyboard = new Keyboard();
    private static final JLabel scaleDisplayText = new JLabel("");

    public static JFrame getMainGUI() {
        // Main JFrame
        JFrame frmMain = new JFrame("Musical Scales Tool");
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.setSize(SIZE[0], SIZE[1]);

        // Main JPanel
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        frmMain.add(container);

        // Scale Selection Panel
        JPanel scaleSelectionPanel = new JPanel();

        JComboBox<String> cbRootNote = new JComboBox<>(Note.listAllNotes());
        scaleSelectionPanel.add(cbRootNote);

        JComboBox<String> cbScaleQuality = new JComboBox<>(ScaleQualities.listAllScaleQualities());
        scaleSelectionPanel.add(cbScaleQuality);

        JButton btnUpdate = new JButton("update");
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set App.currentlySelectedScale to the selected scale
                App.setCurrentlySelectedScale(new Scale(
                        Note.getNote((String) cbRootNote.getSelectedItem()), 
                        (String) cbScaleQuality.getSelectedItem()));
                
                // Update keyboard to display the scale
                GUI.keyboard.updateKeyboardScale(App.getCurrentlySelectedScale());
                
                // Update scaleDisplayText to display the scale as text
                GUI.scaleDisplayText.setText(App.getCurrentlySelectedScale().toString());
            }
        });
        scaleSelectionPanel.add(btnUpdate);
        
        JButton btnClear = new JButton("clear");
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                App.setCurrentlySelectedScale(new Scale());
                GUI.keyboard.clearKeyboardScale();
                GUI.scaleDisplayText.setText("");
            }
        });
        scaleSelectionPanel.add(btnClear);

        container.add(scaleSelectionPanel);

        // Scale Display Panel
        JPanel scaleDisplayPanel = new JPanel();
        scaleDisplayPanel.setLayout(new BoxLayout(scaleDisplayPanel, BoxLayout.Y_AXIS));
        scaleDisplayPanel.add(GUI.scaleDisplayText);
        scaleDisplayPanel.add(GUI.keyboard);
        container.add(scaleDisplayPanel);

        // Audio Panel
        JPanel audioPanel = new JPanel();

        JLabel lblOctaveLabel = new JLabel("Octave: ");
        JLabel lblOctave = new JLabel(keyboard.getKeySoundOctave() + "");
        
        JButton btnDecrementOctave = new JButton("-");
        JButton btnIncrementOctave = new JButton("+");
        
        btnDecrementOctave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyboard.decrementKeySoundOctave();
            }
        });
        
        btnIncrementOctave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyboard.incrementKeySoundOctave();
            }
        });

        audioPanel.add(lblOctaveLabel);
        audioPanel.add(btnDecrementOctave);
        audioPanel.add(lblOctave);
        audioPanel.add(btnIncrementOctave);

        container.add(audioPanel);

        // Display Main JFrame
        frmMain.setVisible(true);
        return frmMain;
    }

    public static int[] getGUISize() {
        return GUI.SIZE;
    }

}
