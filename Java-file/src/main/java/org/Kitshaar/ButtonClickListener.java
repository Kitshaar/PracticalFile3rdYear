package org.Kitshaar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonClickListener extends Frame implements ActionListener {
    /*
    19. How can you implement a button click listener in AWT?
     */
    private final Button button;
    private final Label label;

    public ButtonClickListener() {
        setLayout(new FlowLayout());

        button = new Button("Click Me");
        label = new Label("Button not clicked yet");

        button.addActionListener(this);

        add(button);
        add(label);

        setSize(300, 200);
        setTitle("AWT Button Click Listener");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new ButtonClickListener();
    }
}
