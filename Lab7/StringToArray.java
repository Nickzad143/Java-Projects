public class StringToArray {

  public static char[] string2charArray(String text) {
    if (text == null) {
      throw new IllegalArgumentException("Input string cannot be null");
    }
    char[] charArray = new char[text.length()];
    for (int i = 0; i < text.length(); i++) {
      charArray[i] = text.charAt(i);
    }
    return charArray;
  }

  public static void main(String[] args) {
    String text = "Hello, Java!";
    char[] charArray = string2charArray(text);
    System.out.println(new String(charArray)); 
  }
}
