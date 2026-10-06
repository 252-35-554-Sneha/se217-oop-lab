public class WhileLoopDemo {
    public static void main(String[] args) {
        System.out.println("Even numbers up to 10:");
        int i = 2;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();

        int number = 554;
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }
        System.out.println("Sum of digits in " + number + " is: " + sum);

        int n = 1234;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
