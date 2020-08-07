package edu.neu.csye6200.timer;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	
	
	
	private Timer timer;  //A timer to run  a periodic task
	private int ctr = 0 ;
	
	
    //constructor
	public TimerDemo() {
		timer = new Timer();
		//task, delay time (3 seconds),  periodic time(1 second)
		timer.schedule(new RemindTask(), 3000L, 1000L);
	}
    
	
	
	//My TimerTask implementation
	class RemindTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("Timer alert: " + ctr++);
			Toolkit.getDefaultToolkit().beep(); //Ring the bell
			if (ctr >= 5)
				timer.cancel();
		}
		
	}
	
	
	public static void main(String[] args) {
		new TimerDemo();
		System.out.println("We are done!");
		

	}

}
