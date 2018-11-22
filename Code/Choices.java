/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;


import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.JFrame;
import javax.*;
import java.awt.event.*;
import javax.swing.JPanel;
import java.applet.Applet;
import java.awt.FlowLayout;
public class Game extends Applet {

    public static void main(String[] args) {
        
        
        FlowLayout experimentLayout = new FlowLayout();
        JFrame frame= new JFrame("we got some buttons");
     
        frame.pack();
       
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       //adding label
        JPanel panelQue=new JPanel();
        JLabel label1=new JLabel ("Choose if you like land or sea");
        frame.add(panelQue,BorderLayout.NORTH);
        panelQue.add(label1);
        
        
        //adding panel for button
        JPanel panel1=new JPanel();
        frame.add(panel1, experimentLayout.CENTER);
       
        //adding buttons
        JButton b1=new JButton("Land");
        b1.setSize(100, 50);
        b1.setVisible(true);
        panel1.add(b1);
        
    }
    
}
       
       
    
    

