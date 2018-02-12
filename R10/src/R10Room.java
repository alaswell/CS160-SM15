// R10 Assignment
// Author: alaswell
// Date: Jul 16, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

public class R10Room implements R10Interface {

	public static void main(String[] args) {		

	}

	private int numOfBeds;
	private boolean roomHasMonitor;

	@Override
	public void R10Init(int roomType) {

		switch(roomType)
		{
		case 0:
			numOfBeds = 1;
			roomHasMonitor = true;
			break;
		
		case 1:
			numOfBeds = 2;
			roomHasMonitor = true;
			break;
			
		case 2:
			numOfBeds = 1;
			roomHasMonitor = false;
			break;
		
		default:
			System.out.println("Not a valid option, please try again.");
		}
		
	}

	@Override
	public boolean checkRoom(boolean needsMonitor, boolean needsSingle) {
		 /* Postcondition - returns true if the necessary equipment is available.  
		 * 			Note, if the patient does not need a heart monitor, we want to save 
		 * 			it for someone that does need it - same with the single bed.  This
		 * 			means the requirements should directly match the room.
		 */
		int beds = this.getRoomBeds();
		boolean monitor = this.getRoomMonitor();
		boolean bedsMet = false;
		boolean monitorMet = false;
		
		if(needsSingle && beds < 2)
			bedsMet = true;
		else if(!needsSingle && beds == 2)
			bedsMet = true;
		
		if(needsMonitor == monitor)
			monitorMet = true;
		
		if(bedsMet && monitorMet)
			return true;
		else
			return false;
	}

	@Override
	public int getRoomBeds() {
		return numOfBeds;
	}

	@Override
	public void setRoomBeds(int numBeds) {
		numOfBeds = numBeds;
	}

	@Override
	public boolean getRoomMonitor() {
		return roomHasMonitor;
	}

	@Override
	public void setRoomMonitor(boolean hasMonitor) {
		roomHasMonitor = hasMonitor;
		
	}
}
