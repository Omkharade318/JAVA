import java.util.Scanner;
class Fibonacci {
  public static void main(String[] args) {
     Scanner sr = new Scanner(System.in);

     System.out.println("Enter the upto which no. you want your fibonacci series: ");
     int n = sr.nextInt();

    int firstTerm = 0, secondTerm = 1;
        
    System.out.printf("Fibonacci Series Upto %d : \n",n);
    
    while (firstTerm <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
      
      sr.close();
    }
  }
}