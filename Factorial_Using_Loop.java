import java.util.Scanner;
public class Factorial_Using_Loop {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the no. you want factorial of: ");

        int n = sr.nextInt();
        int factorial = 1; 

        for(int i = 1; i<=n; i++){
            factorial *= i; // Same as factorial = factorial*i
        }
        System.out.println("The Factorial of your no. is: " + factorial);
        sr.close();
    }
}
