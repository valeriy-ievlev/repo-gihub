package ValeriyIevlev.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        char[] closetArr = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};

        startNotification(words);

        String rightword = getWord(words);

        String userword = getUserWord();

        while (true) {
            if (rightword.equals(userword)) {
                System.out.println("Поздравляем вы угадали!");
                break;
            } else {
                System.out.println("Вы не угадали попробуйте ещё раз, вот вам подсказка ");
                int minLength = Math.min(rightword.length(), userword.length());
                for (int i = 0; i < minLength; i++) {
                    if (rightword.charAt(i) == userword.charAt(i)) {
                        closetArr[i] = userword.charAt(i);
                    }
                }
                System.out.println(closetArr);
                userword = scanner.nextLine();
            }
        }
        scanner.close();
    }

    private static void startNotification(String[] words) {
        System.out.println("Попробуйте угадать слово, загаданное компьютером, вот вам варианты - ");
        System.out.println(Arrays.toString(words));
    }

    private static String getWord(String[] words) {
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }

    private static String getUserWord() {
        System.out.print("Введите слово: ");
        return scanner.nextLine().toLowerCase();
    }
}
