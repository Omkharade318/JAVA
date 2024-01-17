interface MyInterface {
    void myMethod();
}

public class AnonymousClass {
    public static void main(String[] args) {
        // Using an anonymous class that implements MyInterface
        MyInterface myObject = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Inside myMethod of the anonymous class");
            }
        };

        // Calling the method defined in the anonymous class
        myObject.myMethod();
    }
}
