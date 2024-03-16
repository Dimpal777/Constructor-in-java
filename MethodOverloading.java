public class MethodOverloading {
    // Method with one parameter
    public static void display(int num) {
        System.out.println("Method with one parameter: " + num);
    }

    // Method with two parameters
    public static void display(int num1, int num2) {
        System.out.println("Method with two parameters: " + num1 + ", " + num2);
    }

    public static void main(String[] args) {
        // Calling the method with one parameter
        display(10);

        // Calling the method with two parameters
        display(20, 30);
    }
}
