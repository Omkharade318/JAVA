public class Star_Pattern1 {
    public static void main(String[] args) {
        int n = 6; 
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
        System.out.print("*");  //Time Complexity is O(n^2)
      }
      System.out.print("\n");
    }
  }
} 