import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("Enter 1 for Rock, 2 for Scissors, 3 for Paper:");
        byte choice = sr.nextByte();
        System.out.println("You Choose: "+choice);

        int comp = rn.nextInt(1,4);
        System.out.println("COMP Choose: " +comp);

        if (choice==comp) {
           System.out.println("Its a Draw!"); 
        }
        else if (choice == 1 && comp == 2) {
            System.out.println("You won");
        }
        else if (choice == 2 && comp == 3) {
            System.out.println("You won");
        }
        else if (choice == 3 && comp == 1) {
            System.out.println("You won");
        } 
        else {
            System.out.println("You Lose");
        }
    } 
}

