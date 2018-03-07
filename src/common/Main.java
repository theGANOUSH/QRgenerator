 /**
 * Name: Austin Lowe
 * Course: CNT 4714 Spring 2018
 * Assignment title: Project 2 – Synchronized, Cooperating Threads Under Locking
 * Due Date: February 11, 2018
 *
 * 
 */
package common;

import java.awt.EventQueue;
import views.IntialMenu;

/**
 * @author babag
 *
 */
public class Main {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntialMenu frame = new IntialMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
