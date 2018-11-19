import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
//        checkNum();
        wordGuess();
    }

//    #1 Написать программу, которая загадывает случайное число от 0 до 9, и пользователю
// дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить
// больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»
// (1 – повторить, 0 – нет).

    private static void checkNum() {
        boolean finish = false;
        int maxNum = 9;
        Scanner scanner = new Scanner(System.in);
        while (!finish) {
            int targetNum = (int)(Math.random() * maxNum);
            for (int i = 0; i < 3; i++) {
                System.out.println("Число загадано. Попробуй угадать.");
                int userGuess = scanner.nextInt();
                if (userGuess == targetNum) {
                    System.out.println("Ты угадал число!");
                    break;
                } else if (userGuess > targetNum) {
                    System.out.println("Загаданное число меньше.");
                } else {
                    System.out.println("Загаданное число больше.");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – повторить, 0 – нет");
            int userWantRepeat = scanner.nextInt();
            switch (userWantRepeat) {
                case 1: {
                    continue;
                }
                case 0: {
                    finish = true;
                    break;
                }
                default: {
                    System.out.println("Я тебя не понял, но думаю тебе стоит сыграть еще раз.");
                }
            }
        }
    }

//    #2 Задание 2
    private static void wordGuess() {
        String[] words = {
                "apple",
                "orange",
                "lemon",
                "banana",
                "apricot",
                "avocado",
                "broccoli",
                "carrot",
                "cherry",
                "garlic",
                "grape",
                "melon",
                "leak",
                "kiwi",
                "mango",
                "mushroom",
                "nut",
                "olive",
                "pea",
                "peanut",
                "pear",
                "pepper",
                "pineapple",
                "pumpkin",
                "potato"
        };
        String result = "***************";
        char[] resultCharArray = result.toCharArray();
        int arrayLength = words.length;
        int randomIndex = (int)(Math.random() * (arrayLength - 1));
        String targetWord = words[randomIndex];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Слово загадано. Попробуй угадать." + targetWord);
            String userGuessWord = scanner.nextLine();
            if (targetWord.equals(userGuessWord)) {
                System.out.println("Ты угадал! Было загадано слово " + targetWord);
                break;
            } else if (targetWord.length() >= userGuessWord.length()) {
                for (int i = 0; i < userGuessWord.length(); i++) {
                    if (userGuessWord.charAt(i) == targetWord.charAt(i)) {
                        resultCharArray[i] = targetWord.charAt(i);
                    }
                }
            } else if (targetWord.length() < userGuessWord.length()) {
                for (int i = 0; i < targetWord.length(); i++) {
                    if (userGuessWord.charAt(i) == targetWord.charAt(i)) {
                        resultCharArray[i] = targetWord.charAt(i);
                    }
                }
            }
            StringBuilder progress = new StringBuilder();
            for (char i: resultCharArray) {
                progress.append(i);
            }
            System.out.println("Попробуй еще раз.");
            System.out.println(progress);
        }
    }
}
