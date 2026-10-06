public class ArrayBasics {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 5, 80, 45};

        System.out.println("Array length: " + numbers.length);
        System.out.println("First element: " + numbers[0]);

        System.out.print("Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        double avg = (double) sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }
}
