//Henry Daly
//CSE002
//Lab 02 - Cyclometer
// 9/3/15

//The purpose of this program is to calculate all sorts of things based on data
//given by a bike cyclometer; namely, the number of minutes for each trip, the 
//number of counts for each trip, the distance of each trip (in miles), and finally
//the distance for the two trips combined

//first, as always, we start with a class
public class Cyclometer{
    
    //then we need to establish the main method so that the program will work
    public static void main(String[] args){
        
        
        //creating variables
        int secsTrip1 = 480; //this integer represents the seconds elapsed during the first trip
        int secsTrip2 = 3220; //this int represents the seconds elapsed during the second trip
        int countsTrip1 = 1561; //this int represents the number of revolutions of the front wheel over the first trip
        int countsTrip2 = 9037; //this int represents the number of revolutions of the front wheel during the second trip
        
        //now for other useful information not given by the Cyclometer but necessary for the calculations
        double wheelDiameter = 27.0; //this double represents a precise measurement of the diameter of the bike wheel
        double pi = 3.141592; //this is just pi, but it is necessary for the calculations so we will define it
        double feetPerMile = 5280; // again, another constant that is necessary for the calulations
        double inchesPerFoot = 12; //these doubles are all essential to calculations
        double secondsPerMinute = 60; //very basic but useful conversion factors
        double distanceT1, distanceT2, totalDistance;// we will define these later in the calculations
    
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts");
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts");
        //these two previous lines will inform the user of the program the length of trips 1 and 2 as well as the revolutions of the front tire for both of the trips
        
        //Time for some calculation
        distanceT1 = countsTrip1*wheelDiameter*pi; //this gives us the distance of trip 1 in inches
        distanceT1/=inchesPerFoot*feetPerMile; //now we have the distance travelled in miles
        distanceT2 = countsTrip2*wheelDiameter*pi/inchesPerFoot/feetPerMile; //the two line process for distance 1 was shortened for distance 2
        totalDistance = distanceT1 + distanceT2; //this gives us the total distance
        
        System.out.println("Trip 1 was " + distanceT1 + " miles"); //tells program user distance travelled in Trip 1
        System.out.println("Trip 2 was " + distanceT2 + " miles"); //tell program user distance travelled in Trip 2
        System.out.println("The total distance travelled was " +totalDistance+ " miles"); //tells user total distance travelled
        
        
        
    }
    //end of main method
    
}
//end of class and program