package innerclasses;

import innerclasses.device.Processor;

public class Innerclasses {
 public static void main(String[] args) {
	// device.poweron();
	// device.chip.currentflow();
	 //device.chip s=new device.chip();
	// s.specs();
   //  device lap=new device();
   //  lap.poweron();
   //  device.Processor p= lap.new Processor();
   //  p.getVoltage();
	 
    car c=new car("Blue");
    car.musicSystem m=c.new musicSystem(8);
    m.playSoundMusic();
    
      
	 
}
 
}
class device{
	static void poweron() {
		System.out.println("Device powered on....");
	}
	static class chip{
		static void currentflow() {
			System.out.println("Current flow..");
		}
		void specs() {
			System.out.println("Specification for this chip...");
		}
	}
	class Processor{
		void getVoltage() {
			System.out.println("display voltage on processor:");
		}
	}
} 

class car{
	private static String model = "Hyundai I20 Automatic";
	private String colour;
	car(String colour){
		this.colour=colour;
	}class musicSystem{
		private int numfo;
		musicSystem(int num){
			this.numfo=num;
		}
		void playSoundMusic() {
			System.out.println("Model of car "+ car.model);
			System.out.println("The colour of the car "+ car.this.colour);
			System.out.println("Number of channels MusicSystems: "+ this.numfo);
		}
	}
}