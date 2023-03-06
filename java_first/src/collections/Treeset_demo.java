package collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Treeset_demo {
 public static void main(String[] args) {
	 employeec c=new employeec();
	 
}
}
// change the natural ordring
class StringComp implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		int l1=str1.length();
		int l2=str2.length();
		 if(l1<l2) {
			 return -1;
		 }else if(l1>l2) {
			 return 1;
		 }else {
			  return str1.compareTo(str2);
		 }
		
	}
	
}
class employee implements Comparable<employee>{
	int id;
	String name;
	int salary;
	String aadhar;
	employee(int a,String b, int c, String d){
		id=a;
		name=b;
		salary=c;
		aadhar=d;
	}public String toString() {
		return this.id+ "|" + this.name + "|" + this.salary + "|" + this.aadhar;
	}


	public int compareTo(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	@Override
	public int compareTo(employee o) {
		return this.id<o.id ? -1 : this.id>o.id ? 1:0;
		
	}
	

}
class employeec implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

