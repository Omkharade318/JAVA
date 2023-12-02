public class Star_pattern2 {
     
        public static void main(String[] args) {
            int n = 6; 
            for(int i=0; i<=n; i++){
                for(int j=0; j<i; j++){
            System.out.print("*");  //Time Complexity is O(n^2)
          }
          System.out.print("\n");
        }
      }
    } 

