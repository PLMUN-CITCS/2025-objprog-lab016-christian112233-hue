public class MethodOverloading {
    public static void main(String[] args) {
        display(10);          // Calls method with int parameter
        display(3.14);        // Calls method with double parameter
        display("Hello!");    // Calls method with String parameter
    }

    // Overloaded method for integer
    public static void display(int value) {
        System.out.println("Integer value: " + value);
    }

    // Overloaded method for double
    public static void display(double value) {
        System.out.println("Double value: " + value);
    }

    // Overloaded method for string
    public static void display(String value) {
        System.out.println("String value: " + value);
    }
}
