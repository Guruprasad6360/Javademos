package abstraction;

public class interfaces {
  public static void main(String[] args) {
	Honda h=new Honda();
	h.go();
	h.stop();
}
}
 interface car{
	 void go();
	 void stop();
 }
 class Honda implements car{

	@Override
	public void go() {
		System.out.println("Honda::::");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("inside honda");
		
	}
	 
 }