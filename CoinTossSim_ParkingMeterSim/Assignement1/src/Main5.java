/**
 * Created by felixamoruwa on 5/24/15.
 */
public class Main5 {
    public static void main(String[] args) {
        //Usecase #5:
        //A Blue Audi RS6 with license #: AudoBon
        //Car Parked for:   0 minutes
        //Owner Paid for:   0 minutes

        ParkedCar newCar5= new ParkedCar();
        newCar5.setColor("Blue");
        newCar5.setLicense("AudoBon");
        newCar5.setMake("Audi");
        newCar5.setModel("RS6");
        newCar5.setNumOfParkedMins(0);

        ParkingMeter newPM5 = new ParkingMeter();
        newPM5.setNumOfMinsPurchased(0);

        PoliceOfficer newPO = new PoliceOfficer();
        newPO.setBadge("0032");
        newPO.setName("Shaquille O'Neal");

        //System.out.println("Police Officer " + newPO.name + " wearing Badge # " + newPO.badge + " reporting for duty.");

        if (newPO.issueTicket(newCar5 , newPM5)) {

            System.out.println("Police Officer " + newPO.getName() + " wearing Badge #" + newPO.getBadge() + " has issued a parking ticket for the owner of a " + newCar5.getColor() + " " + newCar5.getMake() + " " + newCar5.getModel() + " with License # " + newCar5.getLicense() + " for a Total of $ " + newPO.fine + " due to the parking expiring " + Math.abs((newPM5.getTimePurchased() - newCar5.getNumOfParkedMins())) + " minutes ago.");
        } else {
            System.out.println("Police Officer " + newPO.getName() + " wearing Badge #" + newPO.getBadge() + " has checked the meter for the owner of a " + newCar5.getColor() + " " + newCar5.getMake() + " " + newCar5.getModel() + " with License #: " + "'" + newCar5.getLicense() + "'" + ", who has been parked legally for " + newCar5.getNumOfParkedMins() + " mins and has " + (newPM5.getTimePurchased() - newCar5.getNumOfParkedMins() + " mins remaining on the parking meter."));
        }
    }
    
}
