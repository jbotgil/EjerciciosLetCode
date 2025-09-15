package palindromeNumber;

public class Main {
    /*
    Given an integer x, return true if x is a palindrome, and false otherwise.

    Example 1:

    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
    Example 2:

    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    Example 3:

    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
    */
    public boolean isPalindrome(int x) {
        String numeroBaseParsed = x+"";
        StringBuilder numeroDelReves = new StringBuilder();

        //Revertimos la cadena principal, en caso de que sea palindromo daria igual el orden, ya que siempre será el mismo.
        for (int i = numeroBaseParsed.length(); i > 0; i--) {
            numeroDelReves.append(numeroBaseParsed.charAt(i-1));
        }

        return numeroBaseParsed.contentEquals(numeroDelReves);
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isPalindrome(121));
    }
}
