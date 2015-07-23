/**
 * Created by felixamoruwa on 5/24/15.
 */
public class Main2 {

        public static void main(String[] args) {
            //Usecase #2:
            //A Red Ferrari California with license #: 2SLOW
            //Car Parked for:   65 minutes
            //Owner Paid for:   75 minutes

            ParkedCar newCar2 = new ParkedCar();
            newCar2.setColor("Red");
            newCar2.setLicense("2SLOW");
            newCar2.setMake("Ferrari");
            newCar2.setModel("California");
            newCar2.setNumOfParkedMins(65);

            ParkingMeter newPM2 = new ParkingMeter();
            newPM2.setNumOfMinsPurchased(75);

            PoliceOfficer newPO = new PoliceOfficer();
            newPO.setBadge("0032");
            newPO.setName("Shaquille O'Neal");

            //System.out.println("Police Officer " + newPO.name + " wearing Badge # " + newPO.badge + " reporting for duty.");

            if (newPO.issueTicket(newCar2 , newPM2)) {

                System.out.println("Police Officer " + newPO.getName() + " wearing Badge #" + newPO.getBadge() + " has issued a parking ticket for the owner of a " + newCar2.getColor() + " " + newCar2.getMake() + " " + newCar2.getModel() + " with License # " + newCar2.getLicense() + " for a Total of $ " + newPO.fine + " due to the parking expiring " + Math.abs((newPM2.getTimePurchased() - newCar2.getNumOfParkedMins())) + " minutes ago.");
            } else {
                System.out.println("Police Officer " + newPO.getName() + " wearing Badge #" + newPO.getBadge() + " has checked the meter for the owner of a " + newCar2.getColor() + " " + newCar2.getMake() + " " + newCar2.getModel() + " with License #: " + "'" + newCar2.getLicense() + "'" + ", who has been parked legally for " + newCar2.getNumOfParkedMins() + " mins and has " + (newPM2.getTimePurchased() - newCar2.getNumOfParkedMins() + " mins remaining on the parking meter."));
            }


        }
}
