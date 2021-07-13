package com.expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@FunctionalInterface
interface LastName {                              //interface
  void lastNameValidate();
}

public class UserRegistrationlName {                          

  public static void main(String[] args ){            
      
      LastName lastName = () -> {                    
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
      lastName.lastNameValidate();

  }
}
