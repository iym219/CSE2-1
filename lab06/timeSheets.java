//Henry Daly
//CSE002 - Lab 6 -Time Sheets
//This program is designed to figure out the total payroll for a variable number of employees based on user input

import java.util.Scanner; //importing scanner class

public class timeSheets{//defining class
    public static void main(String[] args){//defining main method
        Scanner myScanner = new Scanner(System.in);//initializing the scanner
        
        System.out.println("Welcome to the payroll program. Please enter a number(non-negative integer) of employees: ");//prompting for number of employees
        System.out.println("For each employee you entered, the program requires some data. Please enter data at the request of the prompt.");
        int numEmp = myScanner.nextInt();//saving number of employees
        double totalPay=0; //initializing some variables
        int counter=0;
        while (counter < numEmp){
            System.out.println("What is the employee's pay per hour (in cents please): ");//prompting for employee's pay
            double pay = myScanner.nextInt();//saving pay per hour
            System.out.println("How many hours did the employee work on Monday? ");//prompting for employee's hours worked on Monday
            int hrsM = myScanner.nextInt();//saving hours worked on this day
            System.out.println("How many hours did the employee work on Tuesday? ");//prompting for employee's hours worked on Tuesday
            int hrsT = myScanner.nextInt();//saving hours worked on this day
            System.out.println("How many hours did the employee work on Wednesday? ");//prompting for employee's hours worked on Wednesday
            int hrsW = myScanner.nextInt();//saving hours worked on this day
            System.out.println("How many hours did the employee work on Thursday? ");//prompting for employee's hours worked on Thursday
            int hrsR = myScanner.nextInt();//saving hours worked on this day
            System.out.println("How many hours did the employee work on Friday? ");//prompting for employee's hours worked on Friday
            int hrsF = myScanner.nextInt();//saving hours worked on this day
            int hrsTot = hrsM+hrsT+hrsW+hrsR+hrsF;//finding total hours worked
            double centsPerEmp = pay * hrsTot/100;//finding total pay in cents
            double payInDollars = ((int)(100* centsPerEmp))/(100.0);//finding even dollars and cents pay for employee
            totalPay = totalPay + payInDollars;
            counter++;
        }
        System.out.println("The total payroll for this week is $"+totalPay);//showing total payroll
    }
}