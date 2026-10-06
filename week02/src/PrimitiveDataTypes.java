public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte b = 100;
        short s = 5000;
        int i = 100000;
        long l = 15000000000L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';
        boolean bool = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        int myInt = 9;
        double myDouble = myInt;
        System.out.println("int to double: " + myDouble);

        double price = 99.99;
        int roundPrice = (int) price;
        System.out.println("double to int: " + roundPrice);
    }
}
