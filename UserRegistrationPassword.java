package com.expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



interface UserPassword {                              
  void passwordValidate();
}

public class UserRegistrationPassword {                        

  public static void main(String[] args ){            
      
      UserPassword userPassword = () -> {                    
          Scanner scanner = new Scanner(System.in);
         
          String regex = "^[a-z]{8,}$";        
         
          System.out.println("Enter your Password");
          String password = scanner.next();

          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(password);
          if(matcher.matches()){
              System.out.println("Enter password is valid");
          }else{
              System.out.println("Enter password is not valid");
          }
      };
      userPassword.passwordValidate();

  }
}


