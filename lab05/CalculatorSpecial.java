//Henry Daly
//CSE002
//Lab 5 - Looped Calculator
//September 24
//This program will co calculations between two variables based on input. The calculator will either multiply, divide, add, or subtract based on the users input.
//The program is now also looped

import java.util.Scanner;//import scanner class so input can be read

public class CalculatorSpecial{//beginning our class

    public static void main(String[] args){ //beginning of our main method, which actually executes our program
        Scanner myScanner = new Scanner(System.in);//declaring an instance of our scanner so that we can use the input
        
        char issue1 = 'N';
        char issue2 = 'n';
        char resp = 'Y';
        
        while (resp != issue1 && resp != issue2){
            System.out.print("This program is a calculator. You will input two numbers and an operator and the program will give you an answer. Now enter the first number: ");// Asking for the first number
            double a = myScanner.nextDouble();//allowing user to input first number
            System.out.print("Now enter the second number: ");//Asking user for the second number
            double b = myScanner.nextDouble();//allowing user to input second number
            System.out.print("Now enter an operation you want to do to the two variables(for divide, enter /, for multiply enter *, for add enter +, for subtract enter -: ");//asking for an operator
            char operator = myScanner.next().charAt(0);//allowing user input for an operator
        
            switch (operator){//switch case for what happens depending on user input
                case '+':
                    double ansAdd = (a + b);//if user inputs a plus sign, system will do an addition
                    System.out.println("The answer to " +a+" + "+b+" = "+ansAdd);
                    break;
                case '-':
                    double ansSub = (a - b);//if user inputs a minus sign, system will do a subtraction
                    System.out.println("The answer to "+a+" - "+b+" is "+ansSub);
                    break;
                case '*':
                    double ansMult = (a * b);//if user inputs a multiply sign, system will do a multiplication
                    System.out.println("The answer to "+a+" * "+b+" is "+ansMult);
                    break;
                case '/':
                    double ansDiv = (a / b);//if user inputs a divide sign, system will do a division
                    System.out.println("The answer to "+a+" / "+b+" is "+ansDiv);
                    break;
                default:
                    System.out.println("That was invalid operator, please try again.");
                }
            System.out.print("Do you wish to do another calculation? If not, type N or n. If so, type any other character.");
            resp = myScanner.next().charAt(0);
            
        }
    }
}