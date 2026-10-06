public class ConditionIfElse {
    public static void main(String[] args) {
        int num = 15;

        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }

        int marks = 65;
        if (marks >= 40) {
            System.out.println("You have passed the exam!");
        } else {
            System.out.println("You have failed the exam.");
        }

        int age = 17;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote yet");
        }
    }
}
