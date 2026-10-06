public class MethodExercises {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        int checkNum = 17;
        if (isPrime(checkNum)) {
            System.out.println(checkNum + " is a prime number");
        } else {
            System.out.println(checkNum + " is not a prime number");
        }

        int num = 5;
        System.out.println(num + "! = " + factorial(num));

        System.out.println("2^4 = " + power(2, 4));
    }
}
