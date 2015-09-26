//Henry Daly
//CSE002
//September 26th
//averageGrade - program  deals with input and ageraging within a loop

import java.util.Scanner;//importing Scanner class

public class averageGrade{//beginning class
    public static void main(String[] args){//beginning main method to begin instruction
        
        Scanner myScanner = new Scanner(System.in);//initializing the scanner
        
        double counter = 0.0;//the counter is to keep track of how many numbers were entered in order to calculate average
        double resp = 0;//our response is used outside the while statement so we initialize it here
        double gradeAvg;//grade average is initialized here
        double gradeT = 0;//grade total starts at 0 and increases with responses
        System.out.println("Welcome to the grade averaging program. Using this program you can average as many test grades as you need to.");
        System.out.println("To end entering grades and average the test grades entered, Enter 999. Don't enter a test grade lower than 0 or higher than 100.");//defining rules for the program to the user
        
        while (resp != 999){//allows while statement to exit if 999 is entered as resp
            System.out.print("Please enter a test grade:");//prompting for a new grade
            resp = myScanner.nextDouble();//storing grade
            if(resp >= 0 && resp <= 100){//defining when program will add grade to total
                gradeT = gradeT + resp;//calculating grade total
                counter++;//increasing counter once for every time correct input is inputted to make average calculation later
            }
            else if(resp != 999){//defining what to do if number < 0 or >100 is entered
                System.out.println("I said don't type in something less than zero or greater than 100. Try again.");
            }
        }
        gradeAvg = gradeT / counter;//calculating grade average
        System.out.println("Your grade average is " + gradeAvg);//displaying grade average
    }
}