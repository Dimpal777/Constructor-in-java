
public class ModifierToConstructor{
    // Public constructor
    public ModifierToConstructor() {
        System.out.println("Public constructor called");
    }

    // Private constructor
    private ModifierToConstructor(int arg) {
        System.out.println("Private constructor called with arg: " + arg);
    }

    // Protected constructor
    protected ModifierToConstructor(double arg) {
        System.out.println("Protected constructor called with arg: " + arg);
    }

    ModifierToConstructor(String arg) {
        System.out.println("Default constructor called with arg: " + arg);
    }
}

