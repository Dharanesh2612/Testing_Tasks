package io.cal;

public class AmazonCreateAnAccount {

	
	   public String yourname(String Firstnm,String Lastnm) {
		   
		   return("Firstnm" + " Lastnm");
	   }
	   public String MobNoAndEmailID(String email,long mob) {
		   return ("Mobno"+ "EmailID");
		   
	   }
	   
	  public boolean checkPassword(String pass) {
		  return pass.length()== 6;
		  
	  }
	  boolean checkButton(String name, String email, String password) {
			
			if(name.trim() == "" || email.trim() == "" || password.trim() == "")
				return false;
			
			
			else 
			{ 
				return true;
				}
		}
}
