/** ****************************************************************************
 * FleetInventory.java
 * Kevin Bell
 *
 * This program creates an array list to track MPG for a fleet of vehicles
 **************************************************************************** */
package fleetinventory;

import java.util.*; //scanner, arraylist

public class FleetInventory {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Car[] fleet = new Car[3]; //instantiate array with 3 car objects
        String answer, carSearch; //to hold user input
        System.out.println("Ch 10 Fleet Inventory by Kevin Bell\n");
        System.out.println("Car Fleet Inventory");
        fleet[0] = new Car("Honda Accord"); //create car object and add data
        fleet[0].addMPG(50, 2);
        fleet[0].addMPG(70, 3);
        fleet[0].addMPG(90, 4);
        fleet[0].addMPG(55, 2);
        fleet[0].addMPG(65, 3);
        fleet[0].addMPG(95, 4);
        fleet[1] = new Car("Ford Escape"); //create car object and add data
        fleet[1].addMPG(52, 2);
        fleet[1].addMPG(75, 3);
        fleet[1].addMPG(89, 4);
        fleet[2] = new Car("Dodge Charger"); //create car object and add data
        fleet[2].addMPG(60, 2);
        fleet[2].addMPG(78, 3);
        fleet[2].addMPG(88, 4);
        fleet[2].addMPG(91, 4);
        for (Car obj : fleet) //print fleet data
        {
            System.out.printf("Car: %s, %.2f MPG in %d trips\n",
                    obj.getName(), obj.getAverageMPG(), obj.getNumTrips());
        }
        System.out.print("Do you want to see the trips for a single car? (y/n) ");
        answer = stdIn.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            System.out.print("Which car? Type make or model: ");
            carSearch = stdIn.nextLine();
            for (Car obj : fleet) {
                if (obj.getName().contains(carSearch)) {
                    obj.displayTrips(); //print selected car data
                } //end if
            } //end for each
        } //end if
        System.out.println("Goodbye");
    } //end main
} //end class FleetInventory
