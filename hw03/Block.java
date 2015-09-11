//Henry Daly
//CSE02 - HW3 - Calculating Block SA and V from User input
//Sept. 11

//If we are using user input, we need to import the scanner
import java.util.Scanner;

//then we may begin our own class
public class Block{
    
    //moving on to our main method, we begin the program
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); //declaring the instance of the scanner so we can actually use the code in the program
        System.out.println("We have found a block on the side of the street. Being the mathmeticians we are, we want to calculate the Surface Area and Volume.");
        System.out.print("You have a ruler and measure the length of the block. Enter the block's length:");//prompting for length
        double length = myScanner.nextDouble();//recording the user input
        System.out.print("Next you measure the width. It's width is:"); //prompting for block width
        double width = myScanner.nextDouble(); //recording users input as a double
        System.out.print("Finally you measure the height of the block. Please enter it here:"); //prompting for the height
        double height = myScanner.nextDouble(); //recording user input as height
        
        double volume = length*width*height; // calculating volume
        System.out.println("The Volume of a block with length "+length+" units, width "+width+" units, and height "+height+" units is "+volume+" units cubed.");//returning volume
        
        double lw = length * width;//area of one side
        double wh = width * height;//area of second side
        double lh = length * height;//area of the third side
        double surfaceArea = 2*lw + 2*wh + 2*lh; //calculating surface area
        System.out.println("The Surface Area of a block with length "+length+" units, width "+width+" units, and height "+height+" units is "+surfaceArea+" units squared");//returning surface area
        
    }
}