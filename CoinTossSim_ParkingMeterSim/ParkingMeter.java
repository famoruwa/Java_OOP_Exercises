/**
 * Created by felixamoruwa on 5/23/15.
 */
public class ParkingMeter {

    //This class should simulate a parking meter. This class's only responsibility is as follows: To know the number of minutes of parking time that has been purchased.
    public static int NumOfMinsPurchased;

    public static int getTimePurchased() {
        return NumOfMinsPurchased;
    }

    public static void setNumOfMinsPurchased(int numOfMinsPurchased) {
        NumOfMinsPurchased = numOfMinsPurchased;
    }


}
