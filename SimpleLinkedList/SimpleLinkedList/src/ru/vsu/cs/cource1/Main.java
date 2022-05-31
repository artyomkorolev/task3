package ru.vsu.cs.cource1;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
}
