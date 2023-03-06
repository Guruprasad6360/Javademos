package project_calculator;

public class Access_Modifiers {
     public static void main(String[] args) {
	   A ob=new A();
	   ob.set_var(7, "Guru");
	   System.out.println(ob.getname());
	   System.out.println(ob.getvar());
	}
}
	class default1{
         //class gfg has default access modifier.                  
     	 void method_default() {
		 System.out.println("Default Modifiers");
	 }
 }

 //Private methods can be accessed through getter and setters methods 
  class m{
	 private int var;
	 private String name;
	 public int getvar() {
		 return var;
	 }
	 public String getname() {
		 return name;
	 }
	 public void set_var(int var,String name) {
		this.var=var;
		this.name=name;
		 
	 }
   private void print() {            // private method is visible only in class A 
		System.out.println(var+" "+ name);
	}
 }
 
 