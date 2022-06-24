/** ****************************************************************************
 * MPG.java
 * Kevin Bell
 *
 * This class contains data consisting of miles, gallons, and miles per gallon
 **************************************************************************** */
package fleetinventory;

public class MPG {

    private int miles;
    private double gallons;
    private double milesPerGallon;

    public MPG(int milesIn, int gallonsIn) {
        miles = milesIn;
        gallons = gallonsIn;
        milesPerGallon = miles / gallons;
    } //end MPG constructor

    public int getMiles() {
        return miles;
    } //end getMiles

    public double getGallons() {
        return gallons;
    } //end getGallons

    public double getMilesPerGallon() {
        return milesPerGallon;
    } //end getMilesPerGallon   
} //end class MPG
