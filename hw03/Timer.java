//Henry Daly
//CSE2 - HW03 - Time Between Dinner And Now
//Sept. 10

//First it is necessary to import the Scanner
import java.util.Scanner;

//Then let us begin our class
public class Timer{
    
    //Next we begin with our main method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);//Declaring the instance of the Scanner
        System.out.print("You have made dinner plans tonight at some time this evening. Please type in your dinner time in military format (HHMM):");//prompting for dinner time
        int dindin = myScanner.nextInt();//recording user input for dinner time
        System.out.print("Now please tell me the current time in the same format.");//prompting for the current time
        int currentTime = myScanner.nextInt();//recording user input for the current time
        int timeDifH = (dindin - currentTime)/100;//calculating the time difference in hours
        //calculating the difference in minutes will require a number of operations
        int hrsnMins = (dindin - currentTime);//this will give us hour and minute difference as a number in the 100s 
        int justHrs = timeDifH * 100;//this will return only the hours and drop off the minutes
        int timeDifM = hrsnMins - justHrs;//this will subtract just the hours from the hours and minutes
        
        
        System.out.println("You have " +timeDifH+ " hours and " +timeDifM+ " minutes until dinner.");
        
    }
}