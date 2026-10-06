public class ConditionElseIf {
    public static void main(String[] args) {
        int marks = 78;

        if (marks >= 80) {
            System.out.println("Grade: A+");
        } else if (marks >= 70) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        int a = 25;
        int b = 60;
        int c = 40;

        if (a >= b && a >= c) {
            System.out.println("Largest is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest is: " + b);
        } else {
            System.out.println("Largest is: " + c);
        }
    }
}
