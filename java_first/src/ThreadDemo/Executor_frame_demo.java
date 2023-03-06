package ThreadDemo;

import MultiTread.Utils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_frame_demo {
 private static ExecutorService newFixedThreadPool;

public static void main(String[] args) {
	    VideoTask[]  task = { new VideoTask("Bank"),
	    		    		 new VideoTask("School"),
	    					new VideoTask("Confernce")};
	    ExecutorService new1 = Executors.newFixedThreadPool(4);;
		for(VideoTask vp: task) {
	    	new1.submit(vp);
	    }
	    }
}

class VideoTask implements Runnable{
    String source;
    public VideoTask(String source) {
    	this.source=source;
    }
	@Override
	public void run() {
		Utils.printmessage("Processing video from" + source + "started" );
		try {
			Thread.sleep(300);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}Utils.printmessage("processing video"+ source + "ended");
	}
	
}