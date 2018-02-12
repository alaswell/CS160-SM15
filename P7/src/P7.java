// P7 Assignment
// Author: alaswell
// Date: Aug 2, 2015
// Class: CS160
// Email: alaswell@cs.colostate.edu

import java.io.*;
import java.util.*;

public class P7 {
	public static String PIE = "Pie Chart";
	public static int pieSize;
	public static String[] pieLabel;
	public static double[] pieData;

	public static String BAR = "Bar Chart";
	public static int barSize;
	public static double[] barData0;
	public static double[] barData1;

	public static String LG = "Line Graph"; 
	public static int lineSize;
	public static double[] lineData0;
	public static double[] lineData1;
	public static double[] lineData2;


	public static void main(String[] args) {
		readFile(args[0]);
		displayCharts();

	}

	private static void readFile( String inputFile ){ 
		try {
			Scanner infile = new Scanner(new File(inputFile));

			// Get the size(s) of everything first
			pieSize = infile.nextInt();
			barSize = infile.nextInt();
			lineSize = infile.nextInt();

			// Set the array sizes
			pieLabel = new String[pieSize];
			pieData = new double[pieSize];

			barData0 = new double[barSize];
			barData1 = new double[barSize];

			lineData0 = new double[lineSize];
			lineData1 = new double[lineSize];
			lineData2 = new double[lineSize];

			// Pie chart label and elements
			for(int i = 0; i < pieSize; ++i)
			{
				pieLabel[i] = infile.next();
				pieData[i] = infile.nextDouble();
			}

			// Bar chart 0 label and elements
			for(int i = 0; i < barSize; ++i)
			{
				barData0[i] = infile.nextDouble();
			}

			// Bar chart 1 label and elements
			for(int i = 0; i < barSize; ++i)
			{
				barData1[i] = infile.nextDouble();
			}

			// Line Graph 0 label and elements
			for(int i = 0; i < lineSize; ++i)
			{
				lineData0[i] = infile.nextDouble();
			}

			// Line Graph 1 label and elements
			for(int i = 0; i < lineSize; ++i)
			{
				lineData1[i] = infile.nextDouble();
			}
			// Line Graph 2 label and elements
			for(int i = 0; i < lineSize; ++i)
			{
				lineData2[i] = infile.nextDouble();
			}

			infile.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("Could not find the input file: " + inputFile);
		}
	}

	private static void displayCharts() {
		// Instantiation
		Plotter pieChart = new Plotter(PIE);
		Plotter barChart = new Plotter(BAR);
		Plotter lineGraph = new Plotter(LG);
		
		// setup and display the pie chart
		pieChart.pieChartData(pieSize, pieData);
		pieChart.pieChartLabels(pieSize, pieLabel);
		pieChart.drawGraph(Plotter.eType.PIECHART);
		
		// setup and display the bar chart
		barChart.barChartData(0, barSize, barData0);
		barChart.barChartData(1, barSize, barData1);
		barChart.drawGraph(Plotter.eType.BARCHART);
		
		// ...Line Graph
		lineGraph.lineGraphData(0, lineSize, lineData0);
		lineGraph.lineGraphData(1, lineSize, lineData1);
		lineGraph.lineGraphData(2, lineSize, lineData2);
		lineGraph.drawGraph(Plotter.eType.LINEGRAPH);
	}

}
