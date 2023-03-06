package MultiTread;
import java.lang.Runnable;

public class Pgm1 {
 public static void main(String[] args) throws InterruptedException {
	Utils.printmessage("Begin main");
	image ip =new image();
	Thread t=new Thread(ip);
	t.start();
	Thread t1=new Thread(new Runnable() {

		@Override
		public void run() {
		  Utils.printmessage("DO some work,....");
			
		}
		
	});
    t1.start();
    t1.join();
    Utils.printmessage("end");
}
}
class image implements Runnable{
	public void run() {
		Utils.printmessage("processing an image");
	}
}