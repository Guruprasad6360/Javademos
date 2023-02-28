package project_calculator;

import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
  int n1,n2,oper;
  System.out.println("1- Adding\n 2- Substraction\n 3- Division\n 4- Multiplication" );
  System.out.println("Choose Operator:");
  Scanner sc=new Scanner(System.in);
  oper=sc.nextInt();
  System.out.println("Enter first Number:");
  n1=sc.nextInt();
  System.out.println("Enter second Number:");
  n2=sc.nextInt();
  int result=0;
  switch(oper) {
       case 1: result=n1+n2;
    		   break;
       case 2: result=n1-n2;
               break;
       case 3: result=n1/n2;
               break;
       case 4: result=n1*n2;
               break;
       default : System.out.println("invalid operation");
  }
  System.out.println("RESULT:"+" "+result);
  
}
}
