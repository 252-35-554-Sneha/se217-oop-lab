public class MethodsDemo {
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java methods.");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int findMax(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        greetUser("Sneha");

        int sum1 = add(10, 20);
        double sum2 = add(5.5, 4.5);
        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);

        int max = findMax(45, 80);
        System.out.println("Max number: " + max);
    }
}
