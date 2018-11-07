import java.util.Calendar;

public class Main {

//    #2 Создать переменные всех пройденных типов данных, и инициализировать их значения
    static byte byteNum;
    static short shortNum;
    static int intNum;
    static long longNum;
    static float floatNum;
    static double doubleNum;
    static char charExample;
    static boolean booleanExample;

//    #1 Создать пустой проект в IntelliJ IDEA и прописать метод main()
    public static void main(String[] args) {
        byteNum = 3;
        shortNum = 20;
        intNum = 50;
        longNum = 1000L;
        floatNum = 5.9f;
        doubleNum = 4.25;
        charExample = 'd';
        booleanExample = true;

        System.out.println(doubleNum * doubleNum);
        System.out.println(count(2, 3, 4, 5));
        System.out.println(checkNum(5, 10));
        positiveCheck(3);
        negativeCheck(5);
        printName("Tom");
        leapYearCheck();
        oddCheck(1);
    }

//    #3 Написать метод вычисляющий выражение a * (b + (c / d))
    private static float count(int a, int b, int c, int d) {
        float result = a * (b + ((float) c / d));
        return result;
    }

//    #4 Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
//    от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    private static boolean checkNum(int num1, int num2) {
        boolean checkStatus = false;
        int sum = num1 + num2;
        if (sum >= 10 && sum <= 20) {
            checkStatus = true;
        }
        return checkStatus;
    }

//    #5 Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль положительное ли число передали, или отрицательное;
//    Замечание: ноль считаем положительным числом.
    private static void positiveCheck(int num) {
        if (num >= 0) {
            System.out.println("Это положительное число");
        } else {
            System.out.println("Это отрицательное число");
        }
    }

//    #6 Написать метод, которому в качестве параметра передается целое число,
//    метод должен вернуть true, если число отрицательное
    private static boolean negativeCheck(int num) {
        boolean negativeStatus = false;
        if (num < 0) {
            negativeStatus = true;
        }
        return negativeStatus;
    }

//    #7 Написать метод, которому в качестве параметра передается строка, обозначающая имя,
//    метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    private static void printName(String userName) {
        System.out.println("Привет, " + userName + "!");
    }

//    #8 Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
//    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    private static void leapYearCheck() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " - високосный год.");
            } else {
                System.out.println(year + " - невисокосный год.");
            }
        } else {
            System.out.println(year + " - невисокосный год.");
        }
    }

    private static void oddCheck(int num) {
        boolean result = ((num % 2) == 0);
        if (result) {
            System.out.println(num + " - четное число.");
        } else {
            System.out.println(num + " - нечетное число.");
        }
    }
}
