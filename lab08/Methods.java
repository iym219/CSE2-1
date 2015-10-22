//Henry Daly
//CSE 002 - Lab 08
//Methods - mean,median, print methods
//October 15

import java.util.Scanner;
public class Methods{
    public static void main(String[] args){
        Scanner mysc = new Scanner(System.in);
        int [] nums = new int [10];//initializing an array
        System.out.println("This program finds the mean and median of 10 integers.");
        for(int k = 0; k < nums.length; k++){
            System.out.println("Enter a number: ");//prompting for the array values
            nums [k] = mysc.nextInt();//saving array values
        }
        double mean = meancalc(nums);//calling mean method
        double median = mediancalc(nums);//calling median method
        print (mean,median);//calling print method
        
    }
    
    public static double meancalc(int[] nums){//this method calculates the mean
        int sum = 0;       
        for(int j = 0; j < nums.length; j++){
            sum = nums [j] + sum;//find sum of array
        }
        double value = sum/10.0;//divide by array length
        return value; 
    }
    
    public static double mediancalc(int[] nums){//this method calculates the median
        double med;
        int p1 = nums [4];
        int p2 = nums [5];
        med = (p1 + p2)/2.0;//find median
        return med;
    }
    
    public static void print(double mean, double median){//this method prints the mean and median values
        System.out.println("The mean is "+mean);
        System.out.println("The median is "+median);
    }
}