//Henry Daly CSE002
//HW8 - Areas: multiple methods computing area based on user input
//Oct 23

import java.util.Scanner;
public class areas{
    public static void main(String[] args){
        Scanner mysc = new Scanner(System.in);
        System.out.println("Enter a shape of which you want to compute the area (circle, rectangle, or trapezoid): ");
        String shape = mysc.next();
        double value;
        
        if (shape.equals("circle")){
            System.out.println("What is the readius of your circle: ");
            int radius = mysc.nextInt();
            value = area(radius);
             System.out.println("Area = "+value);
        }
        else if (shape.equals("trapezoid")){
            System.out.println("Enter height, then base1, then base2 for the trapezoid: ");
            int height = mysc.nextInt();
            int base1 = mysc.nextInt();
            int base2 = mysc.nextInt();
            value = area(height, base1, base2);
             System.out.println("Area = "+value);
        }
        else if(shape.equals("rectangle")){
            System.out.println("Enter length and width of the rectangle: ");
            int length = mysc.nextInt();
            int width = mysc.nextInt();
            value = area(length, width);
             System.out.println("Area = "+value);
        }
        else{
            System.exit(-1);
        }
        
    }
    public static double area(int a){
        int radius = a;
        double area = radius * radius;
        area = area * 3.14159;
        area = (area * 100)/(100.0);
        return area;
    }
    public static double area(int a, int b, int c){
        int height = a;
        int base1 = b;
        int base2 = c;
        double  area = base1+base2;
        area /= 2.0;
        area = area*height;
        return area;
    }
    public static double area(int a, int b){
        int length = a;
        int width = b;
        double area = length*width;
        return area;
    }
}