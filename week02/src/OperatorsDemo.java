public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        int x = 5;
        System.out.println("Post-increment: " + (x++));
        System.out.println("After increment: " + x);
        System.out.println("Pre-increment: " + (++x));

        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        boolean cond1 = (a > 10);
        boolean cond2 = (b < 10);
        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("!cond1: " + (!cond1));

        int result = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result);
    }
}
