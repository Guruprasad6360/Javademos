package innerclasses;

public class Anodemo {
  public static void main(String[] args) {
	PrintConnection con = PrinterDriver.getConnection();
	con.print();
}
}
class PrinterDriver{
	static PrintConnection getConnection() {
		PrintConnection con = new PrintConnection() {
			public void print() {
				System.out.println("printing...");
			}
		};
		return con;
}
}

interface PrintConnection{
	void print();
}
