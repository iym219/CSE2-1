//Henry Daly
//CSE002 - Lab 3: Check Splitting
//Sept. 10 2015
//The purpose of this lab is to properly use user input and to also figure out check splitting techniques

//If we're going to use a scanner we need to import it first
import java.util.Scanner;

//now let us begin with our own class
public class Check{
    
    //then we move onto our main method
    public static void main(String[] args){
        
        //now we must declare an instance of the Scanner object as well as calling the constructor
        Scanner myScanner = new Scanner(System.in);
        
        //Now let us begin with the user interaction aprt of the program
        System.out.println("You have gone out to eat with some friends, and now you must pay the bill. This program will assist you in calculating how much each person will pay.");
        System.out.print("Please enter the cost of the bill in the form XX.XX:"); //this asks for the bill total
        double checkCost = myScanner.nextDouble();//this allows input for the bill total
        System.out.print("Now please decide what percentage tip you would like to add to the bill. Please write it in the form XX. So thirty percenty would be 30. Enter it now:");//this asks for percent tip
        double percentTip = myScanner.nextDouble();//this is the input for the percent tip
        double realTip = (percentTip/100);//this converts the tip into a decimal
        System.out.print("This is the most important now. How many people are splitting the bill?");//asks for number of people
        double peopleEating = myScanner.nextDouble();//input for number of people
        
        
        double billTotal = checkCost * (1+realTip);//figures out tht total bill cost
        double billPart = billTotal/peopleEating; //figures out how much each person is going to pay
        double billTotal2 = ((int) (billTotal*100))/(100.0);
        double billPart2 = ((int) (billPart*100))/(100.0);
        
        System.out.println ("Congratulations. Your bill total is "+billTotal2+" dollars and each person will pay "+billPart2+" dollars. Have a good day.");
    }
    
}