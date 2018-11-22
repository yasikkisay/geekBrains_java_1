import java.text.MessageFormat;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    public static String[][] map;
    public static final int SIZE = 3;
    public static final int DOT_TO_WIN = 3;
    public static final String DOT_EMPTY = "*";
    public static final String DOT_X = "X";
    public static final String DOT_O = "O";

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            userTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            AITurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Выиграл компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена!");
    }

    public static void initMap() {
        map = new String[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void userTurn() {
        Scanner scanner = new Scanner(System.in);
        int row, column;
        do {
            System.out.println("Введите координаты. X и Y");
            row = scanner.nextInt() - 1;
            column = scanner.nextInt() - 1;
        } while (isCellNotValid(row, column));
        map[row][column] = DOT_X;
    }

    public static void AITurn() {
        Random random = new Random();
        int row, column;
        do {
            row = random.nextInt(SIZE);
            column = random.nextInt(SIZE);
        } while (isCellNotValid(row, column));
        System.out.println(
                MessageFormat.format("Компьютер сходил в точку {0} {1}",
                        row + 1, column + 1));
        map[row][column] = DOT_O;
    }

    public static boolean isCellNotValid(int row, int column) {
        if (row < 0 || row >= SIZE || column < 0 || column >= SIZE) {
            return true;
        }
        if (map[row][column].equals(DOT_EMPTY)) {
            return false;
        }
        return true;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j].equals(DOT_EMPTY)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(String symb) {
        boolean res = false;
        // line check
        boolean lineWin = false;
        boolean columnWin = false;
        boolean diagonalWin = false;
        for (int i = 0; i < SIZE; i++) {
            int stepsToWin = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j].equals(symb)) {
                    stepsToWin++;
                }
                if (stepsToWin == DOT_TO_WIN) {
                    lineWin = true;
                    break;
                }
            }
        }

        // column check
        for (int i = 0; i < SIZE; i++) {
            int stepsToWin = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i].equals(symb)) {
                    stepsToWin++;
                }
                if (stepsToWin == DOT_TO_WIN) {
                    columnWin = true;
                    break;
                }
            }
        }

        // diagonal check
        int stepsToWin1 = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j].equals(symb) && i == j) {
                    stepsToWin1++;
                }
                if (map[i][SIZE-j-1].equals(symb) && i != SIZE-j-1) {
                    stepsToWin1++;
                }
                if (stepsToWin1 == DOT_TO_WIN) {
                    diagonalWin = true;
                    break;
                }
            }
        }
        //final check
        if (lineWin || columnWin || diagonalWin) {
            res = true;
        }
        return res;
    }
}

/*
2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например,
 с использованием циклов.
3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
 Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
 */