public class StringSplitDemo {
    public static void main(String[] args) {
        String text = "Java is an object oriented language";
        String[] words = text.split(" ");

        System.out.println("Sentence: " + text);
        System.out.println("Total words: " + words.length);
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + (i + 1) + ": " + words[i]);
        }

        String studentData = "Sneha,252-35-554,45_F1";
        String[] info = studentData.split(",");
        System.out.println("\nStudent info:");
        System.out.println("Name: " + info[0]);
        System.out.println("ID: " + info[1]);
        System.out.println("Section: " + info[2]);
    }
}
