package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;
public class game extends JFrame {
    JButton b1=new JButton("g1");
    JButton b2=new JButton("g2");
    JButton b3=new JButton("Result");
    JLabel l1,l2,l3;
    private int i=0,k=0;
    private String str="", win="";
    eHandler handler=new eHandler();
    public game(String s){
        super(s);
        setLayout(new FlowLayout());
        setSize(275,250);
        setLocationRelativeTo(null);
        add(b1);
        add(b2);
        add(b3);
        l1=new JLabel("Last "+str);
        l2=new JLabel("Win "+win);
        l3=new JLabel("Result "+i+"X"+k);
        add(l1);
        add(l2);
        add(l3);
        setResizable(false);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
    }
    public class eHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==b1){
                i++;
                str="g1";
            }
            if(e.getSource()==b2){
                k++;
                str="g2";
            }
            if(e.getSource()==b3){
                if(i>k)
                    win="win g1";
                else if(k>i)
                    win="win g2";
                else win="Draw";
            }
            l1.setText("Last "+str);
            l2.setText("Last "+win);
            l3.setText("Last "+i+"X"+k);
        }
    }
}
