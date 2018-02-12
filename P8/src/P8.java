// P8 Assignment
// Author: alaswell
// Date: Aug 4, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu
import java.io.*;
import java.util.*;

public class P8 {

	Picture pic = new Picture();
	int width = 0;
	int height = 0;
	int[][]	imgData;

	public void readImage(String inFile) {

		try {
			// Calls to readPGM or writePGM and associated code here
			pic.readPGM(inFile);	
			width = pic.getWidth();
			height = pic.getHeight();
			imgData = pic.getData();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	} 

	public void writeImage(String outFile) { 

		try {
			// Calls to readPGM or writePGM and associated code here
			pic.setData(imgData);
			pic.writePGM(outFile);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	} 

	public int[][] imageData() {
		return imgData;
	} 

	public void invert() { 
		int[][] temp = new int[imgData.length][imgData.length];

		for(int i = 0; i < imgData.length; ++i)
		{
			int c = 0;
			for(int j = imgData.length; j > 0; --j, ++c)
				temp[i][c] = imgData[i][j];
		}
		imgData = temp;
	} 

	public void exchange() {	
		int w = 180;
		int h = 130;
		int rowIndex = 50;
		int colIndexA = 60;
		int colIndexB= 260;

		int[][] tempA = new int[height][width];
		int[][] tempB = new int[height][width];

		// Get the pixels into tempArrays first
		for(int i = 0; i < h; ++i)
		{
			for(int j = 0; j < w; ++j)
				tempA[i][j] = imgData[rowIndex + i][colIndexA + j];

			for(int j = 0; j < w; ++j)
				tempB[i][j] = imgData[rowIndex + i][colIndexB + j];
		}

		// Put them into the other location
		for(int i = 0; i < h; ++i)
		{
			for(int j = 0; j < w; ++j)
				imgData[rowIndex + i][colIndexA + j] = tempB[i][j];

			for(int j = 0; j < 0 + w; ++j)
				imgData[rowIndex + i][colIndexB + j] = tempA[i][j];
		}
	} 

	public void shift() {
		for (int row = 0; row < height; row++) 
			for (int col = 0; col < width; col++) 
			{
				int pixel = imgData[row][col];
				int temp = (pixel&(1<<8))>>8;
				pixel = (pixel & 0b111111111) << 1;
				if (temp==1) 
					pixel |= 0b000000001;
			}
	}

	public void swap() { } 

}