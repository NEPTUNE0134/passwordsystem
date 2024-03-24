package melih;

import java.util.Scanner;
import java.util.Objects;

public class test {

    public static void main(String[] args) {
        
    	try (Scanner scan = new Scanner(System.in)) 
    	{
        
    		System.out.print("Enter a username: ");
            
    		String username = scan.nextLine();
            
    		System.out.print("Enter a password: ");
            
    		String password = scan.nextLine();

            
    		int attemptCount = 0;

            while (attemptCount < 3) 
            {
            
            	System.out.print("Enter a username: ");
                
            	String usernamel = scan.nextLine().trim();

                
            	System.out.print("Enter a password: ");
                
            	String password1 = scan.nextLine().trim();

                if (username.equals(usernamel) && password.equals(password1)) 
                {
                
                	System.out.println("Login successful!");
                    
                	break;
                } 
                
                else 
                
                {
                    
                	System.out.println("Invalid username or password :( Please try again.");
                    
                	attemptCount++;
               
                }

                if (attemptCount == 3) 
                
                {
                 
                	System.out.println("Too many failed attempts >:(");
                    
                	System.exit(0);
                
                }
            }
        }
    }
}