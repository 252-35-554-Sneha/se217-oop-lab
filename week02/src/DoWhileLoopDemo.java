public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= 3);

        int x = 20;
        do {
            System.out.println("x is " + x + " (executed even though x < 10 is false)");
        } while (x < 10);
    }
}
