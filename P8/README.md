 CS 160, Summer 2015
Programming Assignment P8
Unscrambling 2D Images

Programming due Friday, Aug. 7 at noon; NO late period
Using 2D Arrays to Write an Image Editor
This lab has the goal of teaching you how to:

    Implement a set of methods that allow a GUI object to use your class.
    Instantiate and call a supplied class to read and write images.
    Declare and use 2D arrays to store images.
    Manipulate the data in 2D arrays to unscramble images. 

Description
The purpose of the assignment is to write a Java class that can be called by a user interface program to unscramble images in the Portable GreyMap (PGM) format. To do this you need to write a P8 object that instantiates and calls methods in Picture.java, and is in turn called from a graphical user interface (GUI) class called UserInterface.java. Both of these are supplied below.
Instructions
Part One
Create a project and class called P8, without a main method. following instance (non-static) variables:

    An object of type Picture, set to null.
    An integer to store the image width, set to 0.
    An integer to store the image height, set to 0.
    A 2-dimensional array of integers to store the image data, not allocated. 

You can name your variables whatever you like.
Part Two
Import Picture.java from here, and UserInterface.java from here into the P8 project. Create a constructor for the P8 class as shown below that instantiates an object of type Picture into the associated class instance variable.

public P8() {
    // Instantiate Picture
}

Part Three
Write the following public (non-static) methods, which will be described below in more detail:

public void readImage(String inFile) {}

public void writeImage(String outFile) { }

public int[][] imageData() { }

public void invert() { }

public void exchange() { }

public void shift() { }

public void swap() { }

The readImage method should call the readPGM method in the Picture object, passing the input file name, then it should call the getHeight, getWidth, and getData methods to fill in the class instance data defined above. The writeImage method should call the setData method in the Picture object with the image data, then call the writePGM method passing the output file name. The parameters and return types of the methods in Picture.java are not documented here, so you must look at the file to find them. The calls to readImage and writeImage should be wrapped in a try catch block as follows:

try {
	// Calls to readPGM or writePGM and associated code here
} catch (Exception e) {
	System.out.println(e.getMessage());
}

Implement imageData by simply returning a copy of the image array. The remaining methods manipulate the image data in some way or another to restore an image that has been scrambled.
Part Four
Make sure that all methods exist in your P8.java, even though some of the transformations may not do anything. You should now be able to run the main program in UserInterface.java to read and write PGM files. If you are having trouble integrating with the provided files, check that your method names and parameters match. We have provided a test file called Cam.pgm that you can download to the P8 project directory (not into the /src or /bin subdirectories).
Part Five
Implement the remaining methods as follows:

    Calling invert turns the image backwards right to left, i.e. it exchanges the first column for the last column, the second column for the second to last column, and so on until the entire image is reversed.
    Calling exchange swaps the image area defined by a rectangle with width 180 and height 130 starting at row index 50 and column index 60 for a rectangle of the same size starting at row index 50, and column index 260.
    Calling shift finds an image which is hidden in the image data, by saving bit 7, shifting bits 0-6 one position to the left, and setting bit 0 to the previously saved value of bit 7.
    Calling swap restores an image in which each pixel has been scrambled by exhanging the bottom 2 bits with the top 2 bits. To do this requires that your code do the same exchange to restore the image. 

NOTE: The maximum value of a pixel (Picture.MAXVAL) is 255, so only 8 bits are valid for each pixel. These are numbered bits 0-7, where bit 0 is equal to 1 and bit 7 is equal to 128. There are no negative values allowed.
Testing
The invert method can be tested with Invert.pgm. The exchange method can be tested with Exchange.pgm. The shift method can be tested with Shift.pgm. The swap method can be tested with Swap.pgm. In all cases, the restored image should be identical to Cam.pgm. After unscrambling an image you can write it to the disk, and compare it to Cam.pgm using the Linux diff command, thus all students can verify that their code is perfect before submission! NOTE: We may test your code with an image file that has a different size and contents than the provided test file, so do not hardcode anything.
Grading Criteria
Note: Do not modify the provided files in any way, or your program will not compile in our test system!

    100 points for perfect submission.
    0 points for no submission, will not compile, submitted class file, etc.
    We use only the files supplied to you for testing!
    Preliminary Tests
        compileTest: checks that program compiles. (0 points)
        test1: checks that your program can read and write image files (20 points)
        test2: checks that invert exactly restores the input image "Invert.pgm". (20 points)
        test3: checks that exchange exactly restores the input image "Exchange.pgm". (20 points)
        test4: checks that shift exactly restores the input image "Shift.pgm". (20 points) 
    Final Tests
        test5: checks that swap exactly restores the input image "Swap.pgm". (20 points)
        Final grading includes the preliminary tests. 

Please follow the usual rules for submitting Java programs.

    Work on your own.
    The name of the source code file must be exactly P8.java
    Comments at the top with your name, e-Name, date and course.
    Submit the P8.java source file, not the P8.class file.
    We expect programming assignments to be implemented in Eclipse using Java 1.7.
    We will be testing the code on the machines in the CS computer lab, so make sure your code runs on those machines.
    We will be checking programs for plagiarism, so please don't copy from anyone else. 

Submission
Submit your modified source file named P8.java to the the Checkin tab on the course web site. 
