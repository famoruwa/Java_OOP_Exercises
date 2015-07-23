/**
 * Created by felixamoruwa on 5/24/15.
 */
public class Main3 {

        public static void main(String[] args) {
            //Usecase #3:
            //A White BMW M3 with license #: M AZING
            //Car Parked for:   50 minutes
            //Owner Paid for:   50 minutes

            ParkedCar newCar3 = new ParkedCar();
            newCar3.setColor("White");
            newCar3.setLicense("M AZING");
            newCar3.setMake("BMW");
            newCar3.setModel("M3");
            newCar3.setNumOfParkedMins(50);

            ParkingMeter newPM3 = new ParkingMeter();
            newPM3.setNumOfMinsPurchased(50);

            PoliceOfficer newPO = new PoliceOfficer();
            newPO.setBadge("0032");
            newPO.setName("Shaquille O'Neal");

            //System.out.println("Police Officer " + newPO.name + " wearing Badge # " + newPO.badge + " reporting for duty.");

            if (newPO.issueTicket(newCar3 , newPM3)) {

                System.out.println("Police Officer " + newPO.getName() + " wearing Badge #" + newPO.getBadge() + " has issued a parking ticket for the owner of a " + newCar3.getColor() + " " + newCar3.getMake() + " " + newCar3.getModel() + " with License # " + newCar3.getLicense() + " for a Total of $ " + newPO.fine + " due to the parking expiring " + Math.abs((newPM3.getTimePurchased() - newCar3.getNumOfParkedMins())) + " minutes ago.");
            } else {
                System.out.println("Police Officer " + newPO.getName() + " wearing Badge #" + newPO.getBadge() + " has checked the meter for the owner of a " + newCar3.getColor() + " " + newCar3.getMake() + " " + newCar3.getModel() + " with License #: " + "'" + newCar3.getLicense() + "'" + ", who has been parked legally for " + newCar3.getNumOfParkedMins() + " mins and has " + (newPM3.getTimePurchased() - newCar3.getNumOfParkedMins() + " mins remaining on the parking meter."));
            }
        }
}
