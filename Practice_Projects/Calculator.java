package project_calculator;

import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
  int n1,n2,oper;
  System.out.println("1- Adding\n 2- Substraction\n 3- Multiplication\n 4- Division" );
  System.out.println("Choose Operator:")
  Scanner sc=new Scanner(System.in);
  oper=sc.nextInt();
  System.out.println("Enter first Number:");
  n1=sc.nextInt();
  System.out.println("Enter second Number:");
  n2=sc.nextInt();
  char ch=sc.next().charAt(0);
  switch(ch) {
       case '+': System.out.println(n1+n2);break;
       case '-': System.out.println(n1-n2);break;
       case '/': System.out.println(n1/n2);break;
       case '*': System.out.println(n1*n2);break;
       default : System.out.println("invalid operation");
  }
  
}
}
