public class StringBasics {
    public static void main(String[] args) {
        String str = "Hello Java";

        System.out.println("Original string: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(0, 5));

        String s1 = "java";
        String s2 = "Java";
        System.out.println("equals: " + s1.equals(s2));
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));

        System.out.println("Contains 'Java': " + str.contains("Java"));
    }
}
