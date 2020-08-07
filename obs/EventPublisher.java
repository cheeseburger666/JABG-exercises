/**
 * 
 */
package edu.neu.csye6200.obs;

import java.util.Observable;

/**
 * @author mac
 *
 */
public class EventPublisher extends Observable {

	private int ctr = 0;
	private boolean done = false; //we are not done yet
	
	
	
	/**
	 * 
	 */
	public EventPublisher() {
		System.out.println("EventPublisher - constructor called");
	}

	public void doAction() {
		setChanged(); // something changed
		notifyObservers(new String("A message " +  ctr++));
	}
	
	
	public void run() {
		while(!done) {
			doAction();//broadcast action events
			if (ctr > 10)
				done = true;//Flag that we should stop
			
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventPublisher ep= new EventPublisher();
		
		EventSubscriber sub1 = new EventSubscriber();
		
		ep.addObserver(sub1);//make the subscription connection
		
		ep.run();
		

	}

}
