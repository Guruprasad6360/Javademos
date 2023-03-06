package ThreadDemo;

public class Challange_demo {
 public static void main(String[] args) {
	
}
}
class Ch{
	int count=1;
	public void printoddno() {
		Synchronized(this){
			while(count%2==0) {
				try {
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}System.out.println(count+" ");
			count++;
			notify();
		}
	}
}
	
