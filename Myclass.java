package test;
class MyClass {
    private int value;

    // Parameterized constructor
    public MyClass(int value) {
        this.value = value;
        System.out.println("Parameterized constructor called with value: " + value);
    }

    // Default constructor
    public MyClass() {
        this(10); // Calling the parameterized constructor with a default value
        System.out.println("Default constructor called");
    }

    public void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(); // Calls the default constructor
        obj1.displayValue(); // Displays the value set by the parameterized constructor

        MyClass obj2 = new MyClass(20); // Calls the parameterized constructor directly
        obj2.displayValue(); // Displays the value set by the parameterized constructor
    }
}