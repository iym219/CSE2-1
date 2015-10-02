//Henry Daly-CSE002
//Homework 6 - makes a pyramid with height based on user input
//October 2

import java.util.Scanner;//importing scanner class
public class pyramid{//beginning class
    public static void main(String[] args){//beginning main method
        Scanner myScanner = new Scanner(System.in);//initializing scanner
        int counter = 0;//defining counter 
        System.out.print("What side pyramid? ");//prompting for pyramid size
        int resp = myScanner.nextInt();//saving pyramid height
        resp = resp-1;
        String l0 = "*";
        System.out.println(l0);
        for(counter = 0; counter<resp; counter++){
            l0 = l0 + "**";
            System.out.println(l0);
        }
    }
}
