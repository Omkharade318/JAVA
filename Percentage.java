import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        byte subject1,subject2,subject3,subject4,subject5;
        float total, ratio;
        float outoff;
        float percentage;
         
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Marks of subject 1: ");
        subject1 = sc.nextByte();

        System.out.println("Enter the Marks of subject 2: ");
        subject2 = sc.nextByte();

        System.out.println("Enter the Marks of subject 3: ");
        subject3 = sc.nextByte();

        System.out.println("Enter the Marks of subject 4: ");
        subject4 = sc.nextByte();

        System.out.println("Enter the Marks of subject 5: ");
        subject5 = sc.nextByte();

        System.out.println("Enter the outoff marks of each subject: ");
        outoff = sc.nextFloat();
        outoff = outoff*5;

        total = subject1 + subject2 + subject3 + subject4 + subject5;
        ratio = total/outoff;
        percentage = ratio*100;

        System.out.println("Your percentage = "+ percentage +"%");
        sc.close();
    }
}
