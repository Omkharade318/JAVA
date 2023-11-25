import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        
        System.out.println("Enter 1 to get area of Rectangle");
        System.out.println("Enter 2 to get area of Square");
        System.out.println("Enter 3 to get area of Circle");
        System.out.println("Enter 4 to get area of Cylinder");
        System.out.println("Enter 5 to QUIT");

        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);

        byte x = sc.nextByte();

        switch (x) {
            case 1:
                System.out.print("Enter the Length of your Rectangle: ");
                float l = sc.nextFloat();

                System.out.print("Enter the Breadth of your Rectangle: ");
                float b = sc.nextFloat();

                System.out.printf("The area of your Rectangle is: %d", l*b);
                break;

            case 2:
                System.out.print("Enter the Side of your Square");    
                 float s = sc.nextFloat();

                System.out.printf("The area of your Square is: %d",s*s);
                 break;

            case 3:
                System.out.print("Enter the Radius of your circle: ");  
                float r = sc.nextFloat();

                System.out.printf("The area of your Circle is: %f",3.142*r*r);
                break;

            case 4:
                System.out.print("Enter the Height of your Cylinder: ");   
                float h = sc.nextFloat();
                
                System.out.print("Enter the Radius of your Cylinder");
                float r2 = sc.nextFloat();

                System.out.printf("The area of your Cylinder is: %d",((2*3.142*h) + (2*3.142*r2*r2)));
             break;
             
            case 5:
               System.out.println("Thanks for using this program"); 
               break;

            default:
               System.out.println("You have entered a wrong no.");
                break;
        }
    }
}
