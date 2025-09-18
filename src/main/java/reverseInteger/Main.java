package reverseInteger;

public class Main {
    /*
    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the
    signed 32-bit integer range [-231, 231 - 1], then return 0.
    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

    Example 1:
    Input: x = 123
    Output: 321

    Example 2:
    Input: x = -123
    Output: -321

    Example 3:
    Input: x = 120
    Output: 21
    */

    public int reverse(int x) {
        String cadena = String.valueOf(x);
        StringBuilder sb = new StringBuilder();

        boolean tieneSigno = (cadena.charAt(0) == '-' || cadena.charAt(0) == '+');
        if (tieneSigno) {
            sb.append(cadena.charAt(0)); // añade el signo al principio
        }

        // Recorremos de atrás hacia delante, sin tocar el signo
        for (int i = cadena.length() - 1; i >= (tieneSigno ? 1 : 0); i--) {
            sb.append(cadena.charAt(i));
        }

        // Convertimos a número y comprobamos límites
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.reverse(120));
    }
}
