public class tasksheet_1_1_5 {

  public static void main(String[] args) {

    String inputString = "rotor";

    if (isPalindrome(inputString)) {
      System.out.println("The input string is a Palindrome");
    } else {
      System.out.println("The input is not a Palindrome");
    }
  }

  public static boolean isPalindrome(String str) {
    String reversedString = new StringBuilder(str.toLowerCase()).reverse().toString();
    return str.toLowerCase().equals(reversedString);
  }
}
