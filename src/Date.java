/**
 * Created by Tauno on 19.10.2016.
 */
public class Date {
    public static void main(String[] args) {
        int date = 19;
        int year = 2016;
        String Month = "Oktoober";
        String day = "Kolmapäev";
        System.out.println("American format: ");
        System.out.println(day +", " + Month + " " +  date + ", " +  year);
        System.out.println("European format: ");
        System.out.print(day + " " + date +" " +  Month + " " + year);
    }
}
