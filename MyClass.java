public class MyClass {
    private int arg1;
    private int arg2;

    // Default constructor
    public MyClass() {
        this.arg1 = 0;
        this.arg2 = 0;
        System.out.println("Default Constructor called");
    }

    // One-argument constructor
    public MyClass(int arg1) {
        this.arg1 = arg1;
        this.arg2 = 0;
        System.out.println("One-argument Constructor called");
    }

    // Two-argument constructor
    public MyClass(int arg1, int arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        System.out.println("Two-argument Constructor called");
    }

    // Getter methods
    public int getArg1() {
        return arg1;
    }

    public int getArg2() {
        return arg2;
    }

    public static void main(String[] args) {
        // Instantiating the class to call all constructors
        MyClass obj1 = new MyClass();
        System.out.println("Arg1: " + obj1.getArg1() + ", Arg2: " + obj1.getArg2());

        MyClass obj2 = new MyClass(5);
        System.out.println("Arg1: " + obj2.getArg1() + ", Arg2: " + obj2.getArg2());

        MyClass obj3 = new MyClass(10, 20);
        System.out.println("Arg1: " + obj3.getArg1() + ", Arg2: " + obj3.getArg2());
    }
}
