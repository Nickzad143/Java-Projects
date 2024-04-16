import java.util.ArrayList;
import java.util.List;

public class SplitTheString {
    public static void main(String[] args) {
        String text = "FGHIHK, ABCDEF,HelloJava,23424234";

        String[] substrings = splitString(text);

        System.out.println("Original string: " + text);
        System.out.print("Substrings: ");
        for (int i = 0; i < substrings.length; i++) {
            System.out.print(substrings[i]);
            if (i < substrings.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static String[] splitString(String text) {
        List<String> substrings = new ArrayList<>();
        int start = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ',') {
                substrings.add(text.substring(start, i).trim());
                start = i + 1;
            }
        }
        substrings.add(text.substring(start).trim());

        return substrings.toArray(new String[substrings.size()]);
    }
}
