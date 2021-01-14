package src;

// Java program to validate 
// the password using ReGex 
  
import java.util.regex.*;
import java.util.logging.Level; 
import java.util.logging.Logger; 
public class TestPass { 
    // Function to validate the password. 
    public static boolean isValidPassword(String password) 
    { 
  
        // Regex to check valid password. 
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$"; 
  
        // Compile the ReGex 
        Pattern p = Pattern.compile(regex); 
        // If the password is empty 
        // return false 
        if (password == null) { 
            return false; 
        } 
        // Pattern class contains matcher() method 
        // to find matching between given password 
        // and regular expression. 
        Matcher m = p.matcher(password); 

        // Return if the password 
        // matched the ReGex
        return m.matches();
    } 
  
    // Driver Code. 
    public static void main(String[] args)
    { 
        Logger logger 
            = Logger.getLogger( 
                TestPass.class.getName()); 
        
        // Test Case 1: 
        String str1 = "Thee@Ood2021";
        String result1 = String.valueOf("ผลของค่าที่ 1 : " + isValidPassword(str1));
        logger.log(Level.INFO, result1);
  
        // Test Case 2: 
        String str2 = "TheeraPong";
        String result2 = String.valueOf("ผลของค่าที่ 2 : " + isValidPassword(str2));
        logger.log(Level.INFO,result2); 
  
        // Test Case 3: 
        String str3 = "Thee@ pong2021"; 
        String result3 = String.valueOf("ผลของค่าที่ 3 : " + isValidPassword(str3));
        logger.log(Level.INFO, result3); 
  
        // Test Case 4: 
        String str4 = "1234"; 
        String result4 = String.valueOf("ผลของค่าที่ 4 : " + isValidPassword(str4));
        logger.log(Level.INFO, result4); 
  
        // Test Case 5: 
        String str5 = "Thg@20"; 
        String result5 = String.valueOf("ผลของค่าที่ 5 : " + isValidPassword(str5));
        logger.log(Level.INFO, result5); 
  

    } 
} 