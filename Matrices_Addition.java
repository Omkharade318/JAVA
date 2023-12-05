public class Matrices_Addition {
    public static void main(String[] args) {
        int [][] mat1 = {{1,3,5},
                         {2,4,6}};

        int [][] mat2 = {{2,4,6},
                         {1,3,5}};
                         
        int [][] result = {{0,0,0},
                           {0,0,0}};
          
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                System.out.printf("setting value of i = %d and j = %d\n",i,j);
            }
        }   
        System.out.println();
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();                
        }
    }
}
