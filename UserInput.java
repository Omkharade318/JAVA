import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // System.out.println("Enter Your Name, Age, Salary: ");
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your name is : ");
        String name = sc.nextLine();

        System.out.println("Your age is : ");
        byte age = sc.nextByte();

         System.out.println("Your salary is : ");  
        double salary = sc.nextDouble();

        System.out.println("Your name is : " + name);
        System.out.println("Your age is : " + age);
        System.out.println("Your salary is : " + salary);  
        
        sc.close();
    }
}
