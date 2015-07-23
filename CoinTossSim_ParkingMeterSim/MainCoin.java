/**
 * Created by felixamoruwa on 5/24/15.
 */
public class MainCoin {

    public static void main(String[] args) {
        Coin myCoin = new Coin();
        int headcount = 0;
        int tailcount = 0;
        for (int i=0; i < 20; i++){
            myCoin.Toss();
            if (myCoin.getSideUp().equals("Heads")) {
                headcount++;
            }
            else {
                tailcount++;
            }
        }
        System.out.println("Total Head Count: " + headcount + " ; Total Tail Count: " + tailcount);
    }

}
