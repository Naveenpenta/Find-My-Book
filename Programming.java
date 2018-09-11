/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmybook;

/**
 *
 * @author RGUKT
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font.*;
import java.awt.Label.*;
import java.io.File;


public class Programming implements ActionListener{
	
	JFrame f;
	Label l0,l1,l2,l3,ll1,ll2,ll3;
        JLabel ll0;
	JButton b,b1,b2,b3,back;
	
	
	Programming(){
	 
		f=new JFrame("BOOKs");
		
		
		//l=new JLabel("")
		ll0 = new JLabel("Programming Books:",Label.LEFT);
		Font myFont=new Font("Serif", Font.BOLD, 40);
		ll0.setFont(myFont);
		ll0.setForeground(Color.red);
		ll0.setBackground(Color.white);
		ll0.setBounds(01,01,1360,100);
		f.add(ll0);
		
		l0 = new Label("C++");
		Font m1=new Font("Serif", Font.PLAIN,30);
		l0.setFont(m1);
		l0.setForeground(Color.black);
		l0.setBounds(150,130,100,30);
                
                
                l1 = new Label("C Programming");
		Font m2=new Font("Serif", Font.PLAIN,30);
		l1.setFont(m2);
		l1.setForeground(Color.black);
		l1.setBounds(400,130,200,30);
		
                
                l2 = new Label("JAVA");
		Font m3=new Font("Serif", Font.PLAIN,30);
		l2.setFont(m3);
		l2.setForeground(Color.black);
		l2.setBounds(800,130,100,30);
		
                
                l3 = new Label("PYTHON");
		Font m4=new Font("Serif", Font.PLAIN,30);
		l3.setFont(m4);
		l3.setForeground(Color.black);
		l3.setBounds(1100,130,150,30);
		f.add(l0);f.add(l1);f.add(l2);f.add(l3);
		
		b=new JButton(new ImageIcon("D:\\find\\Progamming\\CP1.png"));//ImageIcon("D:\\icon.png"));    
                b.setBounds(120,180,140,200);
                b.setBackground(Color.white);
                b.addActionListener(this);
                f.add(b);
                
                b1=new JButton(new ImageIcon("D:\\find\\Progamming\\CC1.png"));//ImageIcon("D:\\icon.png"));    
                b1.setBounds(430,180,140,200);
                b1.addActionListener(this);
                f.add(b1);
                
                b2=new JButton(new ImageIcon("D:\\find\\Progamming\\JJ1.png"));//ImageIcon("D:\\icon.png"));    
                b2.setBounds(770,180,140,200);
                b2.addActionListener(this);
                f.add(b2);
                
                b3=new JButton(new ImageIcon("D:\\find\\Progamming\\PP1.png"));//ImageIcon("D:\\icon.png"));    
                b3.setBounds(1100,180,140,200);
                b3.addActionListener(this);
                f.add(b3);
                
                back=new JButton("Back");
                back.setBounds(1200,10,90,30);
                back.addActionListener(this);
                back.setBackground(Color.LIGHT_GRAY);
                back.setForeground(Color.blue);
                Font my11=new Font("Serif", Font.BOLD, 20);
                back.setFont(my11);
		ll0.add(back);
		
		f.setBackground(Color.GRAY);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(1360,700);
		
		
		
		
	}
	
	public static void main(String[] args){
		
		Programming m=new Programming();
		
		
	}

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()==b){
             f.dispose();
             new Cp();
         }
         else if (e.getSource()==b1){
             f.dispose();
             new ButtonExample();
         }
         else if (e.getSource()==b2){
             f.dispose();
             new Java();
         }
         else if(e.getSource()==back){
            f.dispose();
            Middle m=new Middle();
        }
         if (e.getSource()==b3){
             f.dispose();
             new Python();
         }
         
    }
	
	
}


