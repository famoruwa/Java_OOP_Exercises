/**
 * Created by felixamoruwa on 5/23/15.
 */
public class PoliceOfficer {

    public static String name;
    public static String badge;
    public static double fine;
    public static double addHours;

    //To know the name and badge number
    //To examine a parked car and parking meter object and determine whether the car's time has expired.
    //To issue a parking ticket if the car time has expired


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        PoliceOfficer.name = name;
    }

    public static String getBadge() {
        return badge;
    }

    public static void setBadge(String badge) {
        PoliceOfficer.badge = badge;
    }

    public boolean issueTicket(ParkedCar pc, ParkingMeter pm){

        int diff = (pc.getNumOfParkedMins() - pm.getTimePurchased());

        //System.out.println("Diff = " + diff + "; Num of Parked Mins = " + pc.getNumOfParkedMins() + "; Time Purchased = " + pm.getTimePurchased());

        if (pc.getNumOfParkedMins() > pm.getTimePurchased()) {
            if (diff > 60){
                addHours = Math.floor(diff / 60);
                fine = 25 + (10 * (addHours));
            }
            else if (diff < 60 && diff > 0){
                fine = 25;
            }
            else if (pc.getNumOfParkedMins() == pm.getTimePurchased()){
                fine = 0;
            }
            //System.out.println("addHours = " + addHours + "; Fine = " + fine);
            return true;
        }

        ParkingTicket myPT = new ParkingTicket(pc.getMake(), pc.getModel(), pc.getLicense(), pc.getColor(), PoliceOfficer.getBadge(), PoliceOfficer.getName(), fine);

        return false;
    }

}
