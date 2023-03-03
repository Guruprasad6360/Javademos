package maps;

public class Strings_demo {
  public static void main(String[] args) {
   System.out.println("Methods of strings");
   String sl=new String("Hello World");
   System.out.println(sl.length());
   
   //substring
   String sub=new String("welcome");
   System.out.println(sub.substring(3));
   
   //string Comparison
   String s1="Hello";
   String s2="Helmo";
   System.out.println(s1.compareTo(s2));
   
   //isEmpty
   String s4="ws";
   System.out.println(s4.isEmpty());
   
   //toLowerCase
   String s5="Hello";
   System.out.println(s5.toLowerCase());
   
   //replace
   String s6="heldo";
   System.out.println(s6);
   String replace=s2.replace('d', 'l');
   System.out.println(replace);
   
   //equals
   String x="Welcome to fjava";
   String y="Welcome to java";
   System.out.println(x.equals(y));
   
   
   System.out.println("\n");
   System.out.println("creating string buffer");
   StringBuffer s= new StringBuffer("welcome to java!");
   s.append("Enjoy your learning");
   System.out.println(s);
   
   //insert method
   s.insert(0,'w');
   System.out.println(s);
   
   //replace method
   StringBuffer sb=new StringBuffer("Hello");
   sb.replace(0,2,"W");
   System.out.println(sb);
   
   //delete method 
   sb.delete(0, 1);
   System.out.println(sb);
   
   
   //StringBuilder
   System.out.println("\n");
   System.out.println("Cretaing StrinGbUILDER");
   StringBuilder sb1=new StringBuilder("happy");
   sb1.append("Learning");

   System.out.println(sb1);

   System.out.println("Cretaing StrinGbUILDER");

   System.out.println(sb1.delete(0,4));

   System.out.println(sb1.insert(0,"welcome"));
   

   System.out.println(sb1.reverse());
   
   //conversion

   System.out.println("Conversion");
   String str="hello";
   //concversion from string
   StringBuffer sbr=new StringBuffer(str);
   sbr.reverse();
   System.out.println("String_buffer");

   System.out.println(sbr);
   
   StringBuilder sbl=new StringBuilder(str);
   sbl.append("world");
   System.out.println("String to StringBuilder");
   System.out.println(sbl);
   
}
}
