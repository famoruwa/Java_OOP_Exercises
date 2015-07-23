/**
 * Created by felixamoruwa on 5/24/15.
 */
public class Main4 {
    public static void main(String[] args) {
        //Usecase #4:
        //A Silver Mercedes C63 AMG S with license #: AMGEEZ
        //Car Parked for:   20 minutes
        //Owner Paid for:   10 minutes

        ParkedCar newCar4= new ParkedCar();
        newCar4.setColor("Silver");
        newCar4.setLicense("AMGEEZ");
        newCar4.setMake("Mercedes");
        newCar4.setModel("C63 AMG S");
        newCar4.setNumOfParkedMins(20);

        ParkingMeter newPM4 = new ParkingMeter();
        newPM4.setNumOfMinsPurchased(10);

        PoliceOfficer newPO = new PoliceOfficer();
        newPO.setBadge("0032");
        newPO.setName("Shaquille O'Neal");

        //System.out.println("Police Officer " + newPO.name + " wearing Badge # " + newPO.badge + " reporting for duty.");

        if (newPO.issueTicket(newCar4 , newPM4)) {

            System.out.println("Police Officer " + newPO.getName() + " wearing Badge #" + newPO.getBadge() + " has issued a parking ticket for the owner of a " + newCar4.getColor() + " " + newCar4.getMake() + " " + newCar4.getModel() + " with License # " + newCar4.getLicense() + " for a Total of $ " + newPO.fine + " due to the parking expiring " + Math.abs((newPM4.getTimePurchased() - newCar4.getNumOfParkedMins())) + " minutes ago.");
        } else {
            System.out.println("Police Officer " + newPO.getName() + " wearing Badge #" + newPO.getBadge() + " has checked the meter for the owner of a " + newCar4.getColor() + " " + newCar4.getMake() + " " + newCar4.getModel() + " with License #: " + "'" + newCar4.getLicense() + "'" + ", who has been parked legally for " + newCar4.getNumOfParkedMins() + " mins and has " + (newPM4.getTimePurchased() - newCar4.getNumOfParkedMins() + " mins remaining on the parking meter."));
        }
    }
}
