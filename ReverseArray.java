import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {arr[i] = sc.nextInt();}

        int i = 0;
        int ii =n-1; 

        while(i < ii){
            int temp = arr[i];
            arr[i] = arr[ii];
            arr[ii] = temp;

            i++;
            ii--;
        }
        sc.close();
        System.err.println("The reversed array is: ");
        for ( int iii = 0; iii<n; iii++){ {
            System.out.print(arr[iii]+ " ");
        }
    }
}
}