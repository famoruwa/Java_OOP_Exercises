/**
 * Created by felixamoruwa on 5/20/15.
 */
public class Coin {

    public static String sideup;
    public static int headcount = 0;
    public static int tailcount = 0;

    public static void Toss() {

        Double rValue = Math.random();

        if (rValue < 0.5){
            sideup = "Heads";
            headcount++;
        }
        else {
            sideup = "Tails";
            tailcount++;
        }
    }

    public String getSideUp(){
        System.out.println(sideup);
        return sideup;
    }



}
