/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.*;
import java.awt.event.*;
import javax.swing.JPanel;

public class Game {

   
    public static void main(String[] args) {
        
        JFrame frame= new JFrame("we got some buttons");
     
        frame.pack();
       
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       //adding label
        JPanel panelQue=new JPanel();
        JLabel label1=new JLabel ("Choose if you like land or sea");
        frame.add(panelQue);
        panelQue.add(label1,BorderLayout.SOUTH);
        
        
        //adding panel
        JPanel panel1=new JPanel();
        frame.add(panel1);
       
        //adding buttons
        JButton b1=new JButton("Land");
        b1.setSize(100, 50);
        b1.setVisible(true);
        panel1.add(b1);
        
    }
    
}
