/**
 * Created by felixamoruwa on 5/23/15.
 */
public class ParkedCar {

    private static String make;
    private static String model;
    private static String color;
    private static String license;
    private static int NumOfParkedMins;

    //To know the car's make, model, color, license number and number of minutes the car has been parked. Create getter and setter methods for all the fields.

    public static String getMake() {
        return make;
    }

    public static void setMake(String make) {
        ParkedCar.make = make;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        ParkedCar.color = color;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        ParkedCar.model = model;
    }

    public static String getLicense() {
        return license;
    }

    public static void setLicense(String license) {
        ParkedCar.license = license;
    }

    public static int getNumOfParkedMins() {
        return NumOfParkedMins;
    }

    public static void setNumOfParkedMins(int NumOfParkedMins) {
        ParkedCar.NumOfParkedMins = NumOfParkedMins;
    }
}
