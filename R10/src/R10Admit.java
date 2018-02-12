import java.util.Scanner;

// R10 Assignment
// Author: Russ Wakefield
// Date:   Jul 16, 2015
// Class:  CS160
// Email:  waker@cs.colostate.edu

public class R10Admit {

	public static void main(String[] args) {


		/*
		 * This program:
		 * 		1) Initializes the rooms
		 *     2) gathers the information that about a patient's need
		 *     3) checks to see what rooms fulfills the patient's needs
		 */
		String answer = "";
		boolean needsMonitor = false;
		boolean needsSingle = false;
		R10Interface room0 = new R10Room();
		R10Interface room1 = new R10Room();
		R10Interface room2 = new R10Room();
		room0.R10Init(0);
		room1.R10Init(1);
		room2.R10Init(2);


		//What are the patient's needs?
		Scanner kb = new Scanner(System.in);
		System.out.print ("Does the patient need a heart monitor ?");
		answer = kb.next().toLowerCase();
		if (answer.charAt(0) == 'y')
			needsMonitor = true;
		System.out.print ("Does the patient need a single room?" );
		answer = kb.next().toLowerCase();
		if (answer.charAt(0) == 'y')
			needsSingle = true;

		//Let's find a room
		if (room0.checkRoom(needsMonitor, needsSingle))
			System.out.println ("Room 0 fits the needs");
		else if (room1.checkRoom(needsMonitor, needsSingle))
			System.out.println ("Room 1 fits the needs");
		else if (room2.checkRoom(needsMonitor, needsSingle))
			System.out.println ("Room 2 fits the needs");
		else 
			System.out.println ("No rooms fit the needs");
		
		kb.close();
	}

}


