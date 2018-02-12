 CS 160, Summer 2015
Programming Assignment P7
Plotting Data: Arrays and Files

Programming due Monday, Aug. 3 at noon; late deadline Aug. 3 at 10 p.m.
This programming assignment has four objectives:

    Read data from a file into arrays
    Declare and use class variables
    Instantiate and call methods on an object
    Plot data using an external package 

Description
The purpose of the assignment is to write a Java class that:

    declares a set of class variables
    reads the contents of a file into those variables
    calls the Plotter object to make pretty graphs and charts. 

When complete, a pie chart, bar chart, and line graph will all be displayed simultaneously and in their own windows.
Instructions
Part One
Create a project and class called P7, with a main method. Below the main method, create two methods with the following signatures:

private static void readFile(String inputFile) {}

private static void displayCharts() {}

In the main method, call the readFile method with the first command line argument (args[0]), and call displayCharts with no argument. Use the Eclipse menu item for "Run Configurations" and setup the command line arguments as chart.txt. Create an input file in the main P7 project directory (not src or bin) and copy the contents from chart.txt. The file format is described below. Your program should now compile and run, but not do anything.
File Format
The file format is as follows:

Field Name 	Field Type 	Field Description
pieSize 	integer 	Number of data items in pie chart
barSize 	integer 	Number of data items in bar chart
lineSize 	integer 	Number of data items in line graph
pieLabel[0] 	String 	First label for pie chart
pieData[0] 	double 	First data value for pie chart
pieLabel[1] 	String 	Second label for pie chart
pieData[1] 	double 	Second data value for pie chart
...
pieLabel[pieSize-1] 	String 	Last label for pie chart
pieData[pieSize-1] 	double 	Last data value for pie chart
barData0 	double[barSize] 	First data sequence for bar chart
barData1 	double[barSize] 	Second data sequence for bar chart
lineData0 	double[lineSize] 	First data sequence for line graph
lineData1 	double[lineSize] 	Second data sequence for line graph
lineData2 	double[lineSize] 	Third data sequence for line graph


Used the supplied data file as an example, and ask questions in the lab if necessary! Above the main method, declare the following class (static) variables:

    Title of the pie chart (String) = "Pie Chart"
    Number of data elements for the pie chart (int)
    Array of data labels for the pie chart (String[])
    Array of data elements for the pie chart (double[])
    Title of the bar chart (String) = "Bar Chart"
    Number of data elements for the bar chart (int)
    First series of data elements for the bar chart (double[])
    Second series of data elements for the bar chart (double[])
    Title of the line graph (String) = "Line Graph"
    Number of data elements for the line graph (int)
    First series of data elements for the line graph (double[])
    Second series of data elements for the line graph (double[])
    Third series of data elements for the line graph (double[]) 

You can name your variables whatever you would like, but you should assign the title String using the exact value shown. No other variables should be initialized, and the arrays must be declared but not allocated.
Part Two
Implement the readFile method in P7.java to open the input file chart.txt, read in the input variables (except for the title) in the order shown in the File Format section of this document, and close the file. Your program should read the number of data elements from the input file, then dynamically allocate all label and data arrays for all the charts. These sizes must also be used for the loops that read labels or data elements from the file. You should check that the values are read correctly by using the Eclipse debugger or print statements. Exceptions caused by the file read should be handled as shown in class and in the previous recitation.
Part Three
Import the Plotter.java file from here. NOTE: Do not make any changes to Plotter.java or your warranty will be null and void! This file uses Java features that we do not discuss in CS 160. Also download the two Java archives called jcommon-1.0.17.jar and jfreechart-1.0.14.jar to your system. These must be imported to the Eclipse by right clicking the project, then following the "Build Path->Add External Archives" menu and browsing for the archive files, as shown during the recitation.
Part Four
For each chart type you must instantiate a Plotter and send it the chart data before calling the drawGraph method. The pie chart requires one call to pieChartData and another to pieChartLabels to send the labels. The drawGraph method is always called last, with a variable of eType that tells it which kind of chart to draw. Implement the displayCharts method by instantiating a Plotter for the pie chart. We have provided an example of instantiation call below. The parameter to the Plotter constructor is a Java String with the title of the chart. You must replace the parameter shown with the chart title defined in the instance variables.

// Instantiation example
Plotter pieChart = new Plotter("Chart Title");

Now add the code to setup and display the pie chart, by calling the following methods that are implemented in the Plotter class:

public void pieChartData(int count, double data[]);

public void pieChartLabels(int count, String labels[]);

// Enumeration
public enum eType {
    PIECHART, BARCHART, LINEGRAPH
}

public void drawGraph(eType type);

After sending labels and data, call the drawGraph method with Plotter.eType.PIECHART, as shown below:

pieChart.drawGraph(Plotter.eType.PIECHART);

At this point your program should display the pie chart with the data from chart.txt.
Part Five
Next, extend drawGraph to send data to the bar chart and display it. The method used to send data is as follows:

public void barChartData(int series, int count, double data[]);

The bar chart requires two calls to barChartData, with the series parameter set to 0 and 1 successively. Make sure that the data in each series corresponds to the data read from the file. Finally call the drawGraph method with Plotter.eType.BARCHART. At this point your program should display the bar chart with the data from chart.txt.
Part Six
Repeat the process for the line graph chart, using the following method to send the data for the line graph:

public void lineGraphData(int series, int count, double data[]);

The line graph requires three calls to lineGraphData, with the series parameter set to 0, 1, and 2. Finally call the drawGraph method with Plotter.eType.LINEGRAPH. At this point your program should display the line graph with the data from chart.txt.
Testing
NOTE: We will test your code with a different chart.txt file, so your methods should work on arbitrary input values, however the file format and number of data sequences will not change.

Please follow the usual rules for submitting Java programs.

    Work on your own.
    The name of the source code file must be exactly P7.java
    Comments at the top with your name, e-Name, date and course.
    Submit the P7.java source file, not the P67class file.
    We expect programming assignments to be implemented in Eclipse using Java 1.7.
    We will be testing the code on the machines in the CS computer lab, so make sure your code runs on those machines.
    We will be checking programs for plagiarism, so please don't copy from anyone else. 

Grading Criteria

    100 points for perfect submission.
    0 points for no submission, will not compile, submitted class file, etc.
    Preliminary Tests
        compileTest: checks that program compiles. (5 points)
        test1: checks that the pie chart name is correct. (5 points)
        test2: checks that the pie chart labels are correct. (5 points)
        test3: checks that the pie chart data is correct. (5 points)
        test4: checks that the pie chart is drawn correctly. (5 points)
        test5: checks that the bar chart name is correct. (5 points)
        test6: checks that the bar chart data is correct. (5 points)
        test7: checks that the bar chart is drawn correctly. (5 points)
        test8: checks that the line graph name is correct. (5 points)
        test9: checks that the line graph data is correct. (10 points)
        test10: checks that the line graph is drawn correctly. (5 points)
        Preliminary grading uses the supplied data file (chart.txt). 
    Final Tests
        Using a file of unspecified name and contents that we provide, test the following:
        test11: checks the pie chart data (10 points).
        test12: checks the bar chart data (10 points).
        test13: checks the line graph data (10 points).
        test14: checks that all data arrays are sized correctly! (10 points).
        Final grading includes the preliminary tests, and uses an unspecified data file. 

Submission
Submit your modified source file named P7.java to the the Checkin tab on the course web site. 
