import java.util.Scanner;

public class Km_to_Miles {
    public static void main(String[] args) {

        double km, miles = 0.62137119;
        Scanner sr = new Scanner(System.in);

        System.out.println("Enter Km: ");
        km = sr.nextDouble();
        
        System.out.println("KM to Miles : " +km*miles + " miles");
        sr.close();
    }
}