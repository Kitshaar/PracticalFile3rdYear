package org.Kitshaar;

import java.awt.*;

public class AwtLayoutManagers {
    /*
    17. What are the different layout managers available in AWT?
    Provide examples of when to use each.
     */
    public static void main(String[] args) {
        Frame frame = new Frame("Layout Manager Example");
        frame.setSize(500, 400);
        frame.setLayout(new GridLayout(2, 2));

        frame.add(createFlowLayoutPanel());
        frame.add(createBorderLayoutPanel());
        frame.add(createGridLayoutPanel());
        frame.add(createCardLayoutPanel());

        frame.setVisible(true);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                frame.dispose();
            }
        });
    }

    static Panel createFlowLayoutPanel() {
        Panel panel = new Panel(new FlowLayout());
        panel.add(new Button("Flow 1"));
        panel.add(new Button("Flow 2"));
        return panel;
    }

    static Panel createBorderLayoutPanel() {
        Panel panel = new Panel(new BorderLayout());
        panel.add(new Button("North"), BorderLayout.NORTH);
        panel.add(new Button("Center"), BorderLayout.CENTER);
        return panel;
    }

    static Panel createGridLayoutPanel() {
        Panel panel = new Panel(new GridLayout(2, 2));
        panel.add(new Button("Grid 1"));
        panel.add(new Button("Grid 2"));
        panel.add(new Button("Grid 3"));
        panel.add(new Button("Grid 4"));
        return panel;
    }

    static Panel createCardLayoutPanel() {
        Panel panel = new Panel(new CardLayout());
        panel.add(new Button("Card 1"), "1");
        panel.add(new Button("Card 2"), "2");
        return panel;
    }
}
