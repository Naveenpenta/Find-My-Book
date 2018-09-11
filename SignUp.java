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

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.event.*;
public class SignUp implements ActionListener{
	Frame f1;
	Button sub1;
	TextField user,pass,fname,lname,Email,addr,con,mob;
	SignUp(){
		f1=new Frame("SignUp");
		f1.setBackground(Color.gray);
		
		sub1=new Button("Submit");
		sub1.setBounds(310,540,120,30);
		sub1.addActionListener(this);
		sub1.setBackground(Color.WHITE);
		Font my9=new Font("Serif", Font.BOLD, 20);
		sub1.setFont(my9);
		
		Label f=new Label("FirstName                :");
		f.setBounds(200,100,200,60);
		Font m1=new Font("Serif", Font.BOLD, 20);
		f.setFont(m1);
		f.setForeground(Color.black);
		
		Label l=new Label("LastName                :");
		l.setBounds(200,160,200,60);
		Font m2=new Font("Serif", Font.BOLD, 20);
		l.setFont(m2);
		l.setForeground(Color.black);
		
		Label u=new Label("UserName                :");
		u.setBounds(200,220,200,60);
		Font m3=new Font("Serif", Font.BOLD, 20);
		u.setFont(m3);
		u.setForeground(Color.black);
		
		Label p=new Label("PassWord                 :");
		p.setBounds(200,280,200,60);
		Font m4=new Font("Serif", Font.BOLD, 20);
		p.setFont(m4);
		p.setForeground(Color.black);
		
		Label cp=new Label("Confirm PassWord  :");
		cp.setBounds(200,340,200,60);
		Font m5=new Font("Serif", Font.BOLD, 20);
		cp.setFont(m5);
		cp.setForeground(Color.black);
		
		Label e=new Label("Email                        :");
		e.setBounds(200,400,200,60);
		Font m6=new Font("Serif", Font.BOLD, 20);
		e.setFont(m6);
		e.setForeground(Color.black);
		
		/*Label n=new Label("Mobile Number        :");
		n.setBounds(200,460,200,60);
		Font m7=new Font("Serif", Font.BOLD, 20);
		n.setFont(m7);
		n.setForeground(Color.black);*/
		
		Label a=new Label("Address                    :");
		a.setBounds(200,460,200,60);
		Font m8=new Font("Serif", Font.BOLD, 20);
		a.setFont(m8);
		a.setForeground(Color.black);
		
		fname =new TextField(50);
		fname.setBounds(400,110,150,30);
		
		lname =new TextField(50);
		lname.setBounds(400,170,150,30);
		
		user =new TextField(50);
		user.setBounds(400,230,150,30);
		
		pass =new TextField(50);
		pass.setBounds(400,290,150,30);
		
		con =new TextField(50);
		con.setBounds(400,350,150,30);
		
		Email =new TextField(50);
		Email.setBounds(400,410,150,30);
		
		/*mob =new TextField(50);
		mob.setBounds(400,470,150,30);*/
		
		addr =new TextField(50);
		addr.setBounds(400,470,150,30);
		
		
		
		f1.add(sub1);
		f1.add(a);//f1.add(n);
                f1.add(l);
		f1.add(e);f1.add(cp);f1.add(p);f1.add(u);f1.add(f);
		f1.add(Email);f1.add(addr);f1.add(con);f1.add(fname);
		f1.add(lname);f1.add(pass);//f1.add(mob);
                f1.add(user);
		f1.setBackground(Color.LIGHT_GRAY);
		f1.setSize(800,700);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.addWindowListener(new WindowAdapter(){
		    public void windowClosing(WindowEvent we){
				f1.dispose();}
			});
		
	}
	public void actionPerformed(ActionEvent ae) {
		try{
			
			//int b = Integer.parseInt(mob.getText());
			Conc c=new Conc("SignUp",fname.getText(),lname.getText(),user.getText(),pass.getText(),con.getText(),addr.getText(),Email.getText());
			int ch=c.Get("SignUp");
			 if (ch==3){
				 Label Er=new Label ("Not Matching PassWord ..Please Retype");
				 Er.setBounds(600,290,300,60);
				 f1.add(Er);
			 }
			 else if (ch==0){
				 Label Er=new Label ("Created Successfully....");
				 Er.setBounds(600,290,200,60);
				 f1.add(Er);
				 f1.dispose();
                                 Middle m=new Middle();
				 //Show sh=new Show(user.getText(),pass.getText());
			 }
			 else{
				 Label Er=new Label ("Number Format Wrong....");
				 Er.setBounds(600,460,200,60);
				 f1.add(Er);
			 }
		}
		catch(Exception ex){
			
		}
	}
	

}


