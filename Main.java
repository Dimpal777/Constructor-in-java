  class ParentClass {
    int arg1;
    int arg2;

    // Default constructor of the superclass
    ParentClass() {
        arg1 = 0;
        arg2 = 0;
        System.out.println("ParentClass default constructor called");
    }

    // Parameterized constructor of the superclass
    ParentClass(int arg1, int arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        System.out.println("ParentClass parameterized constructor called");
    }
}

class ChildClass extends ParentClass {
    // Default constructor of the subclass
    ChildClass() {
        super(); // Calling the default constructor of the superclass
        System.out.println("ChildClass default constructor called");
    }

    // Parameterized constructor of the subclass
    ChildClass(int arg1, int arg2) {
        super(arg1, arg2); // Calling the parameterized constructor of the superclass
        System.out.println("ChildClass parameterized constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the child class, which will call the default constructor of the superclass
        ChildClass child1 = new ChildClass();

        // Creating an object of the child class, which will call the parameterized constructor of the superclass
        ChildClass child2 = new ChildClass(10, 20);
    }
}


