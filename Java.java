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
public class Java implements ActionListener{    

JButton b,b1,b2,b3,b4,back;
JFrame f;
Java(){    
f=new JFrame("Java Programming Books");            
b=new JButton(new ImageIcon("D:\\find\\Progamming\\Java\\j1.png"));//ImageIcon("D:\\icon.png"));    
b.setBounds(120,60,120,180);    
b.addActionListener(this);

b1=new JButton(new ImageIcon("D:\\find\\Progamming\\Java\\j2.png"));//ImageIcon("D:\\icon.png"));    
b1.setBounds(370,60,120,180); 
b1.addActionListener(this);

b2=new JButton(new ImageIcon("D:\\find\\Progamming\\Java\\j3.png"));//ImageIcon("D:\\icon.png"));    
b2.setBounds(640,60,120,180); 
b2.addActionListener(this);

b3=new JButton(new ImageIcon("D:\\find\\Progamming\\Java\\j4.png"));//ImageIcon("D:\\icon.png"));    
b3.setBounds(900,60,120,180); 
b3.addActionListener(this);

b4=new JButton(new ImageIcon("D:\\find\\Progamming\\Java\\j5.png"));//ImageIcon("D:\\icon.png"));    
b4.setBounds(1140,60,120,180); 
b4.addActionListener(this);

back=new JButton("Back");
back.setBounds(1200,10,90,30);
back.addActionListener(this);
back.setBackground(Color.LIGHT_GRAY);
back.setForeground(Color.blue);
Font my1=new Font("Serif", Font.BOLD, 20);
back.setFont(my1);

f.add(b);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(back);


JLabel l=new JLabel("Java Programming Books:");
l.setBounds(10,0,360,30);
Font myFont=new Font("Serif", Font.BOLD, 30);
l.setFont(myFont);
l.setForeground(Color.black);

JLabel l1=new JLabel("Head First Java ");
l1.setBounds(140,260,250,30);

JLabel l2=new JLabel("Java 2");
l2.setBounds(410,260,250,30);

JLabel l3=new JLabel("Think Java: How to think like a computer");
l3.setBounds(580,260,250,30);

JLabel l4=new JLabel("Effective Java");
l4.setBounds(920,260,250,30);

JLabel l5=new JLabel("Thinking in Java");
l5.setBounds(1160,260,250,30);

f.add(l);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(l5);
    
f.setSize(1369,700);    
f.setLayout(null);    
f.setVisible(true);    
//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }   
public void actionPerformed	(ActionEvent ae){
	if (ae.getSource()==b){
		try {

		if ((new File("D:\\find\\Progamming\\Java\\J1.pdf")).exists()) {

			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler D:\\find\\Progamming\\Java\\J1.pdf");//(c:\\Java-Interview.pdf");
			p.waitFor();
				
		} else {

			System.out.println("File is not exists");

		}

		//System.out.println("Done");

  	  } catch (Exception ex) {
		ex.printStackTrace();
	  }
	}
	else if (ae.getSource()==b1){
		try {

		if ((new File("D:\\find\\Progamming\\Java\\J2.pdf")).exists()) {

			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler D:\\find\\Progamming\\Java\\J2.pdf");//(c:\\Java-Interview.pdf");
			p.waitFor();
				
		} else {

			System.out.println("File is not exists");

		}

		//System.out.println("Done");

  	  } catch (Exception ex) {
		ex.printStackTrace();
	  }
	}
	
	else if (ae.getSource()==b2){
		try {

		if ((new File("D:\\find\\Progamming\\Java\\J3.pdf")).exists()) {

			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler D:\\find\\Progamming\\Java\\J3.pdf");//(c:\\Java-Interview.pdf");
			p.waitFor();
				
		} else {

			System.out.println("File is not exists");

		}

		//System.out.println("Done");

  	  } catch (Exception ex) {
		ex.printStackTrace();
	  }
	}
	
	else if (ae.getSource()==b3){
		try {

		if ((new File("D:\\find\\Progamming\\Java\\J4.pdf")).exists()) {

			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler D:\\find\\Progamming\\Java\\J4.pdf");//(c:\\Java-Interview.pdf");
			p.waitFor();
				
		} else {

			System.out.println("File is not exists");

		}

		//System.out.println("Done");

  	  } catch (Exception ex) {
		ex.printStackTrace();
	  }
	}
	
	else if (ae.getSource()==b4){
		try {

		if ((new File("D:\\find\\Progamming\\Java\\J5.pdf")).exists()) {

			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler D:\\find\\Progamming\\Java\\J5.pdf");//(c:\\Java-Interview.pdf");
			p.waitFor();
				
		} else {

			System.out.println("File is not exists");

		}

		//System.out.println("Done");

  	  } catch (Exception ex) {
		ex.printStackTrace();
	  }
	}
        else if(ae.getSource()==back){
            f.dispose();
           Programming p=new Programming();
        }
        
}
public static void main(String[] args) {    
    new Java();    
}   
} 
