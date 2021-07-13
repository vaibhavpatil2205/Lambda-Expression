package com.expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



interface FirstName {                              
  void firstNameValidate();
}

public class UserRegistration {                         

  public static void main(String[] args ){            
      
      FirstName firstname = () -> {                    
          Scanner scanner = new Scanner(System.in);
         
          String regex = "^[A-Z]{1}[a-z]{3,10}$";        
         
          System.out.println("Enter your name");
          String name = scanner.next();

          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(name);
          if(matcher.matches()){
              System.out.println("Enter name is valid");
          }else{
              System.out.println("Enter name is not valid");
          }
      };
      firstname.firstNameValidate();

  }
}
