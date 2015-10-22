//Henry Daly
//CSE002 - Lab 09
//coin flip program, method for counting heads and tails

import java.util.Scanner;//importing scanner
public class cointoss{//defining our class
    
    public static void main(String[] args){//beginning main method
        Scanner mysc = new Scanner(System.in);//defining our scanner
        System.out.println("Enter a number of coin flips(integer between 0 and 100): ");//prompting for number of coin flips
        int n = mysc.nextInt();
        if(n != 0 && n<=100){
            int h = 0;
            int t = 0;
            int result[] = flip(n,h,t);
            System.out.println("Heads: "+result[0]+", Tails: "+result[1]);
        }
        else if(n!=0 && n> 100){
            System.exit(-1);
        }
        else{
            flip();
        }
    }
    public static void flip (){
        int fli = (int)(10* Math.random());
        if(fli <= 4){
        	System.out.println("heads: 0, tails: 1");
        }
        else{
        	System.out.println("heads: 1, tails: 0");
        }
    }
    public static int[] flip(int n,int h, int t){
        int heads = h;
        int tails = t;
        for(int i =0; i<n; i++){
            int fli = (int)(10*Math.random());
            if(fli <= 4){
                tails++;
            }
            else{
        	    heads++;
            }
        }
        return new int[] {heads, tails};
    }
}