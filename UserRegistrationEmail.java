package com.expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



interface UserEmail {                              
  void emailValidate();
}

public class UserRegistrationEmail {                        

  public static void main(String[] args ){            
      
      UserEmail userEmail = () -> {                   
          Scanner scanner = new Scanner(System.in);
         
          String regex = "^[a-zA-Z0-9+.]+@[a-zA-Z0-9.]+$";       
         
          System.out.println("Enter your Email");
          String email = scanner.next();

          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(email);
          if(matcher.matches()){
              System.out.println("Enter email is valid");
          }else{
              System.out.println("Enter email is not valid");
          }
      };
      userEmail.emailValidate();

  }
}


