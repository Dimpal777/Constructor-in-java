
public class CallConstructor {
    private int value;

    // Constructor
    public CallConstructor(int value) {
        this.value = value;
    }

    // Copy constructor
    public CallConstructor(CallConstructor other) {
        this.value = other.value;
    }

    // Method to reset state
    public void reset(int newValue) {
        this.value = newValue;
    }

    // Getter method
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Creating an object
        CallConstructor obj1 = new CallConstructor(10);
        System.out.println("Initial value: " + obj1.getValue());

        // Resetting the state using the reset method
        obj1.reset(20);
        System.out.println("After resetting: " + obj1.getValue());

        // Creating a new object with the same state using the copy constructor
        CallConstructor obj2 = new CallConstructor(obj1);
        System.out.println("New object's value: " + obj2.getValue());
    }
}

