/**
 * 
 */
package edu.neu.csye6200.obs;

import java.util.Observable;
import java.util.Observer;

/**
 * @author mac
 *
 */
public class EventSubscriber implements Observer {

	/**
	 * 
	 */
	public EventSubscriber() {
		
	}

	@Override
	public void update(Observable src, Object msg) {
		System.out.println("ES received an update from "+ src );
		System.out.println("                      message: "+ msg );

	}

}
