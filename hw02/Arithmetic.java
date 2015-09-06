//Henry Daly
//CSE 002
//HW2 - Arithmetic
//September 6
//Calculating price before tax, sales tax on each item, total salex tax, total price before taxes, and total price paid

//first we must start with a class as always
public class Arithmetic{
    
    //then we need to establish a main method in order to have our class actually do something
    public static void main(String[] args){
        
    //today at Walmart we are going to be buying three things: socks, cups, and envelope boxes
    int nSocks = 3; //this is the number of sock pairs we are buying
    double sockPrice$= 2.58; //this is the pre-tax cost of the socks
    
    int nCups = 6; //this is the number of cups we are buying
    double cupPrice$= 2.29; //this is the pre-tax price of the cups
    
    int nEnvelopes = 1; //this is the number of boxes we are buying
    double envelopePrice$ = 3.25; //this is the price of a box of envelopes
    
    double tax = 0.06; //Pennsylvania's state tax is 6%
    
    
    //now for the calculations of how much everything is going to cost pre-tax
    double ptSockPrice = nSocks * sockPrice$; //pre-tax money spent on socks
    double sockTax = ptSockPrice * tax; //tax on the socks
    double iSockTax = ((int) (100 * sockTax))/(100.0); //a cleaner, 2 decimal place sock tax
    
    double ptCupPrice = nCups * cupPrice$; //pre-tax money spent on cups
    double cupTax = ptCupPrice * tax; //tax on the cups
    double iCupTax = ((int) (100 * cupTax))/(100.0); //a cleaner, 2 decimal place cup tax
    
    double ptEnvelopePrice = nEnvelopes * envelopePrice$; //pre-tax money spent on envelope boxes
    double envelopeTax = ptEnvelopePrice * tax; //tax on the envelope boxes
    double iEnvelopeTax = ((int) (100 * envelopeTax))/(100.0); //a cleaner, 2 decimal place envelope tax
    
    System.out.println("Welcome to Walmart. Today you will be purchasing various items. These items include:");
    System.out.println("Socks. You are buying " +nSocks+ " pairs of socks with a price of " +sockPrice$+ " dollars per pair.");
    System.out.println("For your Socks, total pre-tax cost is " +ptSockPrice+ " dollars. Sales tax on that will be " +iSockTax+ " dollars.");
    System.out.println("Cups. You are buying " +nCups+ " cups with a price of " +cupPrice$+ " dollars per cup.");
    System.out.println("For your Cups, total pre-tax cost is " +ptCupPrice+ " dollars. Sales tax on that will be " +iCupTax+ " dollars.");
    System.out.println("Boxes of Envelopes. You are buying " +nEnvelopes+ " boxes of envelopes with a price of " +envelopePrice$+ " dollars per box.");
    System.out.println("For your Socks, total pre-tax cost is " +ptEnvelopePrice+ " dollars. Sales tax on that will be " +iEnvelopeTax+ " dollars.");
    
    double tPreTaxSpent = ptSockPrice + ptCupPrice + ptEnvelopePrice; //total money spent before taxes    
    double tTax = sockTax + cupTax + envelopeTax; //total tax on all purchases
    double iTotalTax = ((int) (100 * tTax))/(100.0); // a cleaner, 2 decimal total tax
    double damage = tPreTaxSpent + iTotalTax; //the damage is how much money we have to spend today to buy our socks, cups, envelopes, and pay taxes
    
    System.out.println("Total pre-tax cost of visiting Walmart today is " +tPreTaxSpent+ " dollars.");    
    System.out.println("Total tax for the Cups, Socks, and Envelopes today is " +iTotalTax+ " dolalrs.");    
    System.out.println("The total money you will spend today at Walmart is " +damage+ " dollars.");    
    }
    
}