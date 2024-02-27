import java.util.Scanner;

public class Prakt3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для проверки на палиндром:");
        String input = scanner.nextLine();

        String processedInput = processString(input);

        if (isPalindrome(processedInput)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом. Программа завершена.");
        }
        }
    public static String processString(String input) {
        return input.replaceAll("\\s", "").toLowerCase();
    }
    public static boolean isPalindrome(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    }




