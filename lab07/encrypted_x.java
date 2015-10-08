//Henry Daly CSE002
//Lab 06 - Print out an X based on user input
//October 8

import java.util.Scanner;//importing scanner class
public class encrypted_x{//beginning class
    public static void main(String[] args){//beginning main method
    Scanner mysc = new Scanner(System.in);//initializing Scanner
    System.out.println("Please enter a height: ");//prompt for height
    int height = mysc.nextInt();//saving height
    if (height > 100){//making sure height is not more than 100
        System.exit(-1);
    }
    else if (height < 0){//also making sure height is not less than 0
        System.exit(-1);
    }
    else{
        int i = 0;//this is our counter for how many lines to print
        int j = 0;//this is our counter for how many chars to print on each line
        int k = 0;//this is a special counter to help print the x
        for(i=0; i<height; i++){//prints out height value for lines
            for(j=0; j<height; j++){//prints out height value for chars on each line
                if(j == k){//condition for when to print first space
                    System.out.print(" ");
                }
                else if(j ==(height-k-1)){//condition for when to print second space
                    System.out.print(" ");
                }
                else{//condition for when to print star 
                    System.out.print("*");
                }
            }
            k++;//k value changes with each line
            System.out.println();//print a line
        }
    }
    }
}