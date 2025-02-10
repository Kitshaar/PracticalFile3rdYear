package org.Kitshaar;

import java.awt.*;

public class SimpleWindowAwt {
    /*
    18. How do you create a simple window (frame) in AWT?
    Provide a simple code.
     */
    public static void main(String[] args) {
        Frame frame = new Frame("Simple AWT Window");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.add(new Label("Hello, AWT!"));

        frame.setVisible(true);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
