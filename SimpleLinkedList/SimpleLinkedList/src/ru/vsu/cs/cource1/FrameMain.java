package ru.vsu.cs.cource1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

import static ru.vsu.cs.cource1.Task.*;

public class FrameMain extends JFrame{
    private JPanel panelMain;
    private JButton addDefault;
    private JButton extractDefault;
    private JButton sizeDefault;
    private JTextArea textDefault;
    private JTextArea queueDefault;
    private JButton maxDefault;
    private JButton minDefault;
    private JButton addOwn;
    private JButton extractOwn;
    private JButton sizeOwn;
    private JButton maxOwn;
    private JButton minOwn;
    private JTextArea textOwn;
    private JTextArea queueOwn;
    private Queue<Integer> queueDef = new LinkedList<>();
    private SimpleQueue<Integer> simpleQueue = new SimpleLinkedListQueue<>();
    public FrameMain() {
        this.setTitle("Очереди");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        addDefault.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                queueDef.add(Integer.valueOf(textDefault.getText()));
                queueDefault.setText(queueDef.toString());
                textDefault.setText("");
            }
        });

        sizeDefault.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textDefault.setText(String.valueOf(sizeQueue(queueDef)));
            }
        });
        maxDefault.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDefault.setText(String.valueOf(maxInQueue(queueDef)));
            }
        });
        minDefault.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDefault.setText(String.valueOf(minInQueue(queueDef)));
            }
        });
        addOwn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simpleQueue.add(Integer.valueOf(textOwn.getText()));
                queueOwn.setText(simpleQueue.toStr());
                textOwn.setText("");
            }
        });
        extractOwn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textOwn.setText(String.valueOf(simpleQueue.remove()));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                queueOwn.setText(simpleQueue.toStr());
            }
        });
        sizeOwn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textOwn.setText(String.valueOf(simpleQueue.count()));
            }
        });
        maxOwn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textOwn.setText(String.valueOf(simpleQueue.max()));
            }
        });
        minOwn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textOwn.setText(String.valueOf(simpleQueue.min()));
            }
        });
        extractDefault.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    textDefault.setText(queueDef.remove().toString());
                    queueDefault.setText(queueDef.toString());
                }
        });
    }
}
