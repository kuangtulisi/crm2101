package com.bjpowernode;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Calculate extends JFrame implements ActionListener{
    JTextField jtf1=new JTextField(10);
    JTextField jtf2=new JTextField(10);
    JLabel jl=new JLabel();
    JButton jb1=new JButton("+");
    JButton jb2=new JButton("*");
    Calculate(){
        setLayout(new FlowLayout());
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        add(jtf1);add(jtf2);add(jl);add(jb1);add(jb2);
        setResizable(false);
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==jb1){
            if(jtf1.getText().trim().equals("")){
                JOptionPane.showMessageDialog(this, "文本框不能为空");
                jtf1.requestFocus();
            }else if(jtf2.getText().trim().equals("")){
                JOptionPane.showMessageDialog(this, "文本框不能为空");
                jtf2.requestFocus();
            }else{
                int a=Integer.parseInt(jtf1.getText().trim());
                int b=Integer.parseInt(jtf2.getText().trim());
                jl.setText(String.valueOf(a+b));
            }
        }
        if(ae.getSource()==jb2){
            if(jtf1.getText().trim().equals("")){
                JOptionPane.showMessageDialog(this, "文本框不能为空");
                jtf1.requestFocus();
            }else if(jtf2.getText().trim().equals("")){
                JOptionPane.showMessageDialog(this, "文本框不能为空");
                jtf2.requestFocus();
            }else{
                int a=Integer.parseInt(jtf1.getText().trim());
                int b=Integer.parseInt(jtf2.getText().trim());
                jl.setText(String.valueOf(a*b));
            }
        }
    }
    public static void main(String[] args) {
        new Calculate();
    }
}