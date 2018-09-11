/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmybook; 
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font.*;
import java.awt.Label.*;
import java.io.File;


public class Middle implements ActionListener{
	
	JFrame f;
	Label l0,l1,l2,l3,l4,l5,l6,l7,ll1,ll2,ll3;
        JLabel ll0;
	JButton b,b1,b2,b3,b4,b5,b6,b7,back;
	
	
	Middle(){
	 
		f=new JFrame("BOOKs");
		
		
		//l=new JLabel("")
		ll0 = new JLabel("Books Categories :",Label.LEFT);
		Font myFont=new Font("Serif", Font.BOLD, 60);
		ll0.setFont(myFont);
		ll0.setForeground(Color.red);
		ll0.setBackground(Color.white);
		ll0.setBounds(01,01,1360,80);
		f.add(ll0);
		
		l0 = new Label("Novels");
		Font m1=new Font("Serif", Font.PLAIN,30);
		l0.setFont(m1);
		l0.setForeground(Color.black);
		l0.setBounds(80,100,100,30);
                
                
                l1 = new Label("Programming");
		Font m2=new Font("Serif", Font.PLAIN,30);
		l1.setFont(m2);
		l1.setForeground(Color.black);
		l1.setBounds(400,100,200,30);
		
                
                l2 = new Label("Philosophy");
		Font m3=new Font("Serif", Font.PLAIN,30);
		l2.setFont(m3);
		l2.setForeground(Color.black);
		l2.setBounds(770,100,140,30);
		
                l3 = new Label("Biography");
		Font m8=new Font("Serif", Font.PLAIN,30);
		l3.setFont(m8);
		l3.setForeground(Color.black);
                l3.setBounds(1100,100,150,30);
		
                
                
                l4 = new Label("Science Fiction");
		Font m5=new Font("Serif", Font.PLAIN,30);
		l4.setFont(m5);
		l4.setForeground(Color.black);
		l4.setBounds(40,390,200,30);
                
                
                l5 = new Label("Poetry");
		Font m6=new Font("Serif", Font.PLAIN,30);
		l5.setFont(m6);
		l5.setForeground(Color.black);
		l5.setBounds(430,390,200,30);
                
                l6 = new Label("Horror");
		Font m7=new Font("Serif", Font.PLAIN,30);
		l6.setFont(m7);
		l6.setForeground(Color.black);
		l6.setBounds(790,390,200,30);
                
               
                l7 = new Label("Comic");
		Font m4=new Font("Serif", Font.PLAIN,30);
		l7.setFont(m4);
		l7.setForeground(Color.black);
                l7.setBounds(1120,390,200,30);
		
                
                
		f.add(l0);f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);
		
		b=new JButton(new ImageIcon("D:\\find\\NN1.png"));//ImageIcon("D:\\icon.png"));    
                b.setBounds(60,155,140,200);
                b.addActionListener(this);
                f.add(b);
                
                b1=new JButton(new ImageIcon("D:\\find\\PR1.png"));//ImageIcon("D:\\icon.png"));    
                b1.setBounds(410,155,140,200);
                b1.setBackground(Color.white);
                b1.addActionListener(this);
                f.add(b1);
                
                b2=new JButton(new ImageIcon("D:\\find\\PH1.png"));//ImageIcon("D:\\icon.png"));    
                b2.setBounds(770,155,140,200);
                b2.setBackground(Color.white);
                b2.addActionListener(this);
                f.add(b2);
                
                b3=new JButton(new ImageIcon("D:\\find\\BO1.png"));//ImageIcon("D:\\icon.png"));    
                b3.setBounds(1100,155,140,200);
                b3.setBackground(Color.white);
                b3.addActionListener(this);
                f.add(b3);
		
                
                b4=new JButton(new ImageIcon("D:\\find\\SS1.png"));//ImageIcon("D:\\icon.png"));    
                b4.setBounds(60,440,140,200);
                b4.setBackground(Color.white);
                b4.addActionListener(this);
                f.add(b4);
                
                b5=new JButton(new ImageIcon("D:\\find\\PO1.png"));//ImageIcon("D:\\icon.png"));    
                b5.setBounds(410,440,140,200);
                b5.setBackground(Color.white);
                b5.addActionListener(this);
                f.add(b5);
                
                b6=new JButton(new ImageIcon("D:\\find\\HO1.png"));//ImageIcon("D:\\icon.png"));    
                b6.setBounds(770,440,140,200);
                b6.setBackground(Color.white);
                b6.addActionListener(this);
                f.add(b6);
                
                b7=new JButton(new ImageIcon("D:\\find\\CO1.png"));//ImageIcon("D:\\icon.png"));    
                b7.setBounds(1100,440,140,200);
                b7.setBackground(Color.white);
                b7.addActionListener(this);
                f.add(b7);
                
                back=new JButton("Back");
                back.setBounds(1200,10,90,30);
                back.addActionListener(this);
                back.setBackground(Color.LIGHT_GRAY);
                back.setForeground(Color.blue);
                Font my1=new Font("Serif", Font.BOLD, 20);
                back.setFont(my1);
                ll0.add(back);
                
		
		f.setBackground(Color.GRAY);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(1360,700);
		
		
		
		
	}
	
	public static void main(String[] args){
		
		Middle m=new Middle();
		
		
	}

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()==b){
             f.dispose();
             new Novels();
         }
         else if (e.getSource()==b1){
             f.dispose();
             new Programming();
         }
         else if (e.getSource()==b2){
             f.dispose();
             new Philosophy();
         }
         else if (e.getSource()==b3){
             f.dispose();
             new Biography();
         }
         
         else if (e.getSource()==b4){
             f.dispose();
             new Science();
         }
         else if (e.getSource()==b5){
             f.dispose();
             new Poetry();
         }
         else if (e.getSource()==b6){
             f.dispose();
             new Horror();
         }
         else if (e.getSource()==b7){
             f.dispose();
             new Comic();
         }
         
         if(e.getSource()==back){
            f.dispose();
        }
         
    }
	
	
}

