package Exceptional_handling;
import java.io.*;
import java.util.Scanner;
public class File_handling {
    public static void main(String[] args) {
    try {
    	File myobj = new File("C:\\Users\\gbhagwat\\Documents\\check.txt");
    	Scanner myReader = new Scanner(myobj);
    	while(myReader.hasNextLine()) {
    		String data= myReader.nextLine();
    		System.out.println(data);
    		}
    	myReader.close();
    }catch(FileNotFoundException e){
    	System.out.println("An error occured");
    	
    }

}
}