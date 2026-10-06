public class SwitchCaseDemo {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Friday");
                break;
            case 2:
                System.out.println("Saturday");
                break;
            case 3:
                System.out.println("Sunday");
                break;
            case 4:
                System.out.println("Monday");
                break;
            case 5:
                System.out.println("Tuesday");
                break;
            case 6:
                System.out.println("Wednesday");
                break;
            case 7:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
        }

        int n1 = 10;
        int n2 = 5;
        char op = '+';

        switch (op) {
            case '+':
                System.out.println("Result: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Result: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Result: " + (n1 * n2));
                break;
            case '/':
                System.out.println("Result: " + (n1 / n2));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
