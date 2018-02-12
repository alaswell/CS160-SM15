// P4 Assignment
// Author: alaswell
// Date: Jun 30, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu


public class P4 {

	public static void main(String[] args) {
		// Create maze
		String fileName = args[0];
		Maze maze = new Maze(fileName);
		System.out.println("Maze name: " + fileName);

		// Get dimensions
		int mazeWidth = maze.getWidth();
		int mazeHeight = maze.getHeight();
		System.out.println("Maze width: " + mazeWidth);
		System.out.println("Maze height: " + mazeHeight);

		int currRow = 0;
		boolean canMove;

		while(currRow < mazeHeight)
		{
			for(int i = 0; i < mazeWidth-1; i++)
			{
				if(currRow%2 == 0)
				{
					//We are in an even row
					if(!maze.isDone())
					{
						//if we are not at the end of the maze
						if(!maze.moveRight())
						{
							//we hit a wall, move around it
							maze.moveDown();
							maze.moveRight();
							maze.moveRight();
							maze.moveUp();
							++i; //i needs to match position
						}
					}
				}
				else
				{
					//otherwise we are in an odd row
					if(!maze.isDone())
					{
						//if we are not at the end of the maze
						if(!maze.moveLeft())
						{
							//we hit a wall, move around it
							maze.moveDown();
							maze.moveLeft();
							maze.moveLeft();
							maze.moveUp();
							++i; //i needs to match position
						}
					}
				}
			}
			if(!maze.isDone())
			{
				maze.moveDown();
				++currRow;
			}
		}
	}
}

