/******************************************************************************
 * Car.java 
 * Kevin Bell
 *
 * This class contains an array of objects consisting of MPG objects for each 
 * car
 *****************************************************************************/
package fleetinventory;
import java.util.*;
public class Car 
{
    private String name; //car name
    ArrayList<MPG> MPGList = new ArrayList<>(); //MPG objects for each car object
    
    public Car(String nameIn)
    {
        name = nameIn;
    } //end Car constructor
   
    public void addMPG(int miles, int gallons)
    {
        MPGList.add(new MPG(miles, gallons));        
    } //end addMPG

    public String getName ()
    {
        return name;
    } //end getName
    
    public double getAverageMPG()
    {
        double averageMPG = 0;
        for (int i = 0; i < MPGList.size(); i++)
        {
            averageMPG += MPGList.get(i).getMilesPerGallon();
        }
        return averageMPG / MPGList.size();
    } //end getAverageMPG
    
    public int getNumTrips()
    {
        return MPGList.size();
    } //end getNumTrips
    
    public void displayTrips()
    {
        for (MPG obj : MPGList)
        {
            System.out.printf("This trip = %.2f MPG\n", 
                    obj.getMilesPerGallon());
        } //end for each   
    } //end displayTrips   
} //end class Car