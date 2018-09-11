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
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends Canvas implements ActionListener{
	
	//private static final long serialVersionUID = 1L;
	
	Frame f1;
	Frame LogIn,SignUp;
	Panel p,p1,p2;
	GridLayout g,g1,g2;
	Button Log,S_U,sub,ho,about;
	TextField user,pass,bookname ,author,title;
	Image i,i1,i2;
	Home (){
		g= new GridLayout(2,1);
		f1=new JFrame("Find My Book");
                Label labe = new Label("Find MY BOOK",Label.CENTER);
		Font myFont=new Font("Serif", Font.PLAIN, 80);
		labe.setFont(myFont);
		labe.setForeground(Color.white);
		labe.setBackground(Color.gray);
		labe.setBounds(01,01,1360,142);
		f1.add(labe);
                
                
                
                JLabel background=new JLabel(new ImageIcon("C:\\Users\\iiitbasar\\Desktop\\find\\Home.png"));
                background.setBounds(0,175,1340,580);
                background.setBackground(Color.white);
                background.setLayout(new FlowLayout());
                f1.add(background);
                
                ho=new Button("Home");
		ho.setBounds(30,142,110,35);
		ho.addActionListener(this);
		ho.setBackground(Color.LIGHT_GRAY);
		Font my111=new Font("Serif", Font.BOLD, 20);
		ho.setFont(my111);
                
                about=new Button("About");
		about.setBounds(200,142,110,35);
		about.addActionListener(this);
		about.setBackground(Color.LIGHT_GRAY);
		Font my122=new Font("Serif", Font.BOLD, 20);
		about.setFont(my122);
                
		Log=new Button("LogIn");
		Log.setBounds(1000,142,110,35);
		Log.addActionListener(this);
		Log.setBackground(Color.LIGHT_GRAY);
		Font my11=new Font("Serif", Font.BOLD, 20);
		Log.setFont(my11);
                
		S_U=new Button("SignUp");
		S_U.setBounds(1150,142,110,35);
		S_U.setBackground(Color.LIGHT_GRAY);
		Font my22=new Font("Serif", Font.BOLD, 20);
		S_U.setFont(my22);
		S_U.addActionListener(this);
                
		f1.add(Log);
		f1.add(S_U);
                f1.add(ho);
		f1.add(about);
		f1.setSize(1360,750);
		f1.setBackground(Color.white);
		
		f1.setLayout(null);
		f1.setVisible(true);
		f1.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we){
			f1.dispose();}
		});
		
		}
		public void actionPerformed(ActionEvent e){
		if (e.getSource()==Log){
			//f1.dispose();
                        
                        LogIn=new Frame("LogIn");
			Label u= new Label("UserName :");
			Font myFont=new Font("Serif", Font.BOLD, 20);
			u.setFont(myFont);
			u.setForeground(Color.black);
			LogIn.setBackground(Color.LIGHT_GRAY);
			u.setBounds(200,200,110,30);
			user =new TextField();
			user.setBounds(320,200,130,30);
			Label pa=new Label("PassWord  :");
			pa.setBounds(200,240,110,30);
			Font myFont1=new Font("Serif", Font.BOLD, 20);
			pa.setFont(myFont1);
			pa.setForeground(Color.black);
			pass =new TextField();
			pass.setBounds(320,240,130,30);
			sub=new Button("Submit");
			sub.setBounds(250,300,100,30);
			sub.addActionListener(this);
			Font myFont2=new Font("Serif", Font.BOLD, 20);
			sub.setFont(myFont2);
			sub.setForeground(Color.black);
			LogIn.add(u);LogIn.add(user);
			LogIn.add(pa);LogIn.add(pass);
			LogIn.add(sub);
			Dialog d=new Dialog(f1,"Error",true);
			d.setLayout(new FlowLayout());
			LogIn.setLayout(null);
			LogIn.setSize(600,500);
			LogIn.setVisible(true);
                        
			LogIn.addWindowListener(new WindowAdapter(){
                            
                            public void windowClosing(WindowEvent we){
                                	LogIn.dispose();}
			});
			
		}
		else if(e.getSource()==S_U){
			//f1.dispose();
			SignUp s=new SignUp();
			//SignUp.dispose();
			}
                else if(e.getSource()==about){
                
                        f1.dispose();
                        About a=new About();
                }
                
		else if (e.getSource()==sub){
			String user1=user.getText();
                        System.out.println(user1);
			String passwd=pass.getText();
                        System.out.println(passwd);
                        
                        if(user1==null || passwd==null){
                            Label l88=new Label("please enter username and password");
                            l88.setBounds(500,500,100,200);
                            LogIn.add(l88);
                        }
                        else {
			  try{
				//User u=new User();
				//u.set_Details(user1, passwd);
				Conc c=new Conc("LogIn",user1,passwd);
				int n=c.Get("LogIn");
				if (n==1){
					Label l8=new Label("ERROR:\n UserName Or PassWord: \nplease Retype....");
					l8.setBounds(500,500,100,200);
					LogIn.add(l8);
				}
				else if(n==0) {
					Label l8=new Label("Logged Successfully....");
					l8.setBounds(300,300,150,100);
					LogIn.add(l8);
					LogIn.dispose();
                                        Middle m=new Middle();
					//Show sh=new Show(user1,passwd);
					//sh.get();
				}
			}catch(Exception sq){
                            
			}
                        }	
			
			
		}
		}
		public static void main(String [] args){
		Home h=new Home();}
		
		/*public void paint(Graphics g){
			Toolkit t=Toolkit.getDefaultToolkit();
			i=t.getImage("home.png");
			g.drawImage(i,1000,1000,this);
			
		}*/
}

