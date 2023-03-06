package Exceptional_handling;

import java.io.FileWriter;

public class write_handling {
  public static void main(String[] args) {
	String text="Computer Science Portal for Teksystems";
	String text1="hello hi hi ";
	try{
	FileWriter fw=new FileWriter("C:\\Users\\gbhagwat\\Documents\\check.txt");
	fw.write(text);
	fw.write(text1);
	System.out.println(text+text1);
	fw.close();
	System.out.println("FIle created:");
	}catch(Exception e) { System.out.println(e.getMessage());
}
}
}
