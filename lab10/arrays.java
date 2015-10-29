//Henry Daly CSE2
//Lab 10 - Arrays - make a program that does al sorts of things with arrays
//Octiber 29

import java.util.Scanner;
public class arrays{
    public static void main(String[] args){
        Scanner mysc = new Scanner(System.in);
        System.out.print("How many numbers do you want in your array: ");
        int n = mysc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i< n; i++){
            array[i] = (int)(100*Math.random());
        }
        for(int j = 0; j < n; j++){
            int b = array[j];
            System.out.println(b);
        }
        double sum = 0;
        double avg=0;
        for(int k = 0; k<n;k++){
            sum = sum + array[k];
            if(k ==n-1){
                avg = sum/n;
                System.out.println("Average is " +avg);
            }
        }
        for(int l = 0; l<n;l++){
            int b = array[l];
            if(b >= avg){
                System.out.println("Numbers greater than average are: "+b);
            }
        }
    }
}