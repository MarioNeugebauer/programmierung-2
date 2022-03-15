package org.htw.inf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class ScreenMemory extends JPanel {

    protected JTextArea textArea;
    private final static String newline = "\n";

    private int xMax;
    private int yMax;

    private char[][] screen;

    // Constructor
    public ScreenMemory(int xDimMax, int yDimMax, KeyListener listener) {
        super(new GridBagLayout());

        this.yMax = yDimMax;
        this.xMax = xDimMax;

        screen = new char[this.xMax][this.yMax];
        for(int x = 0; x<this.xMax; x++) {
            for(int y = 0; y<this.yMax; y++) {
                screen[x][y] = '.';
            }
        }
        createAndShowGUI();
        textArea.addKeyListener(listener);
    }

    public void printScreenToTextArea() {

        textArea.setText("");
        for(int y = 0; y<this.yMax; y++) {
            for(int x = 0; x<this.xMax; x++) {
                textArea.append(""+screen[x][y]);
            }
            textArea.append(newline);
        }
    }

    public void clear(boolean initAllChars) {
        screen = new char[this.xMax][this.yMax];
        if(!initAllChars) return;
        for(int x = 0; x<this.xMax; x++) {
            for(int y = 0; y<this.yMax; y++) {
                screen[x][y] = '.';
            }
        }
    }

    public void setPoint(int x, int y, char charToSet) {
        screen[x][y] = charToSet;
    }

    private void createAndShowGUI() {

        textArea = new JTextArea(this.yMax, this.xMax);
        Font font = new Font(Font.MONOSPACED, Font.BOLD, 20);
        textArea.setFont(font);
        textArea.setEditable(false);
        textArea.setText("Pacman goes here");
        JScrollPane scrollPane = new JScrollPane(textArea);

        //Add Components to this panel.
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(scrollPane, c);

        //Create and set up the window.
        JFrame frame = new JFrame("Pacman Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add contents to the window.
        frame.add(textArea);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

}
