public class CharArrayToString {

  public static String charArray2string(char[] charArray) {
    if (charArray == null) {
      throw new IllegalArgumentException("Input char array cannot be null");
    }
    return new String(charArray); 
  }

  public static void main(String[] args) {
    char[] charArray = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
    String text = charArray2string(charArray);
    System.out.println(text); 
  }
}
