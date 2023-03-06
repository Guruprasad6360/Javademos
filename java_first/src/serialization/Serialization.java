package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
  public static void main(String[] args) {
    
	  serialization_demo();
	  
	   
}



  private static void serialization() {
  private static void serialization_demo() {
  
try(FileOutputStream fos=new FileOutputStream("C:\\Users\\gbhagwat\\check.txt");
	   ObjectOutputStream os=new ObjectOutputStream(fos);){
	   employee emp1=new employee(1,"mark", 1500, "aa1001");
	   os.writeObject(emp1);
	   System.out.println("Object Serialized");
	  }catch(FileNotFoundException e) {
		  e.printStackTrace();
	  }catch(ClassNotFoundException e) {
		  e.printStackTrace();
	  }
  }
  }
class employee implements Serializable{
  int id;
  String name;
  double salary;
  String aadharno;
  employee(int id,String name,double salary, String aadharno){
	  this.id=id;
	  this.name=name;
	  this.salary=salary;
	  this.aadharno=aadharno;
  }

  //public String toString() {
  //return this.id + "  " + this.name + this.salary + this.aadharno);
   //}
}
}
