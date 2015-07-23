public class Main {


    public static void main(String[] args) {
        //Usecase #1:
        //A Black Lamborghini Aventador LP 700-4 with license #: BLKBULL
        //Car Parked for:   175 minutes
        //Owner Paid for:     20 minutes

        ParkedCar newCar1 = new ParkedCar();
        newCar1.setColor("Black");
        newCar1.setLicense("BLKBULL");
        newCar1.setMake("Lamborghini");
        newCar1.setModel("Aventador LP 700-4");
        newCar1.setNumOfParkedMins(175);

        ParkingMeter newPM1 = new ParkingMeter();
        newPM1.setNumOfMinsPurchased(20);

        PoliceOfficer newPO = new PoliceOfficer();
        newPO.setBadge("0032");
        newPO.setName("Shaquille O'Neal");

        //System.out.println("Police Officer " + newPO.name + " wearing Badge # " + newPO.badge + " reporting for duty.");

        if (newPO.issueTicket(newCar1, newPM1)) {

            System.out.println("Police Officer " + newPO.getName() + " wearing Badge #" + newPO.getBadge() + " has issued a parking ticket for the owner of a " + newCar1.getColor() + " " + newCar1.getMake() + " " + newCar1.getModel() + " with License # " + newCar1.getLicense() + " for a Total of $ " + newPO.fine + " due to the parking expiring " + Math.abs((newPM1.getTimePurchased() - newCar1.getNumOfParkedMins())) + " minutes ago.");
        } else {
            System.out.println("Police Officer " + newPO.getName() + " wearing Badge #" + newPO.getBadge() + " has checked the meter for the owner of a " + newCar1.getColor() + " " + newCar1.getMake() + " " + newCar1.getModel() + " with License #: " + "'" + newCar1.getLicense() + "'" + ", who has been parked legally for " + newCar1.getNumOfParkedMins() + " mins and has " + (newPM1.getTimePurchased() - newCar1.getNumOfParkedMins() + " mins remaining on the parking meter."));
        }


    }
}
