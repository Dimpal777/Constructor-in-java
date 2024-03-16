
public class IntStringValue {
    private int intValue;
    private String stringValue;

    // Private constructor to prevent direct instantiation
    private IntStringValue() {
    }

    // Factory method to create an instance and initialize it with an integer value
    public static IntStringValue createWithInt(int value) {
        IntStringValue obj = new IntStringValue();
        obj.intValue = value;
        return obj;
    }

    // Factory method to create an instance and initialize it with a string value
    public static IntStringValue createWithString(String value) {
        IntStringValue obj = new IntStringValue();
        obj.stringValue = value;
        return obj;
    }

    // Getter methods
    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public static void main(String[] args) {
        // Creating an instance using the factory method for int initialization
        IntStringValue obj1 = IntStringValue.createWithInt(42);
        System.out.println("Int value: " + obj1.getIntValue());

        // Creating an instance using the factory method for string initialization
        IntStringValue obj2 = IntStringValue.createWithString("Hello");
        System.out.println("String value: " + obj2.getStringValue());
    }
}

