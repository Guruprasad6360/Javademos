package maps;
import java.util.*;
public class Maps {
 public static void main(String[] args) {
	Map map=new HashMap();
	map.put(1, "Amit");
	map.put(2,"Rahul");
	map.put(3, "jai");
	map.put(4, "Amit");
	map.remove(1);
	map.remove(2);
	System.out.println(map);
    
}
}
