/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmybook;

import javax.swing.*;
import javax.swing.JFrame;
import java.io.File;
import java.awt.*;
import java.awt.event.*;      
public class About implements ActionListener{ 

    JLabel l,l1; 
    JButton back;
    JFrame f;
    
    About(){
    
     f=new JFrame("About");
    l=new JLabel("All Books are Here",Label.LEFT);
    l.setBounds(10,200,320,30);
    Font myFont=new Font("Serif", Font.BOLD, 30);
    l.setFont(myFont);
    l.setBackground(Color.white);
    l.setForeground(Color.black);
    f.add(l);
    
    
   back=new JButton("Go");
    back.setBounds(400,210,70,30);
    back.addActionListener(this);
    back.setBackground(Color.blue);
    back.setForeground(Color.white);
    Font my1=new Font("Serif", Font.BOLD, 20);
    back.setFont(my1);
    f.add(back);
    
    f.setSize(1369,700);    
    f.setLayout(null);    
    f.setVisible(true);
    
    
    }
    
    
    public void actionPerformed	(ActionEvent ae){
        
        
        if(ae.getSource()==back){
            f.dispose();
            Home p=new Home();
        }
        
    }
    
        public static void main(String[] args){
    
        About a=new About();
        
    }
    
    
    
}
