public class Method_Overloading {
    static int multiply(int a, int b){
        int prod = a*b;
        return prod;
    }
    static int multiply(int a, int b, int c){
        int prod = a*b*c;
        return prod;
    }
    public static void main(String[] args) {
        int prod1 = multiply(1, 2);
        int prod2 = multiply(1, 2, 3);

        System.out.println(prod1);
        System.out.println(prod2);
    }
}
