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
public class Conc {
	private String name,fname,lname,user,passwd,confirm,addr,Email;
	int number;
	Conc (String name,String fname,String lname,String user,String passwd,String confirm,String addr,String Email){
		this.name=name;
		this.Email=Email;
		this.fname=fname;
		this.lname=lname;
		this.number=number;
		this.confirm=confirm;
		this.passwd=passwd;
		this.addr=addr;
		this.user=user;
	}
	Conc (String name,String user,String passwd){
		this.name=name;
		
		this.passwd=passwd;
		
		this.user=user;
	}
	public int Get(String pname){
		try{
				   Class.forName("com.mysql.jdbc.Driver");
			       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/findmybook","root","root");
			       Statement stmt3 =con.createStatement();
				if (pname.equalsIgnoreCase("LogIn")){
					
					ResultSet rs = stmt3.executeQuery("select * from LogIn where username='"+user+"' and passwd='"+passwd+"'");
				       while(rs.next()){
				    	   if (user.equals(rs.getString(1)) && passwd.equals(rs.getString(2))){
				    		   System.out.print(" Successfully Loged..... ");
				    		  break;
				    	   }
				       }
				       
					       if (!(user.equals(rs.getString(1)) && passwd.equals(rs.getString(2)))){
					    	   
					    	   System.out.print("Invalid  UserName and PassWord ..try again ");
					    	   return 1;
				    		  
				    	   }
					
				}
				else if (pname.equalsIgnoreCase("SignUp")){
					int c=0;
					do{
				    	  
					       if (passwd.equals(confirm)){
					    	   
					    	   PreparedStatement stmt=con.prepareStatement("insert into SignUp values(?,?,?,?,?,?)");
					    	   stmt.setString(1,fname);
					    	   stmt.setString(2,lname);
					    	   stmt.setString(3,user);
					    	   stmt.setString(4,passwd);
					    	   stmt.setString(6,addr);
					    	   //stmt.setInt(7,000);
					    	   stmt.setString(5,Email);
					    	   PreparedStatement stmt1=con.prepareStatement("insert into LogIn values(?,?)");
					    	   stmt1.setString(1,user);
					    	   stmt1.setString(2,passwd);
					    	   c=1;
					    	   int i=stmt.executeUpdate();
					    	   int i1=stmt1.executeUpdate();
					    	   System.out.println(i+" records affected  "+i1); 
					    	   System.out.println("\n\n			 Successfully Created Account :");
					    	   stmt3.execute("commit");
					       }
					       else{
					    	   System.out.println("\n\n			 Wrong Created Account :");
					    	   return 3;
					       }
					       
						}while(c!=1);
				}
		}catch(Exception e){
			return 2;
		}
		return 0;
	}
}

