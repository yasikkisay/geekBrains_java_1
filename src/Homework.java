import java.util.Arrays;

public class Homework {

    static int[] list = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    static int[] list3 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    static int[] list6 = new int[] {1, 5, 2, 3, 1};

    public static void main(String[] args) {
//        changeNumbers();
//        System.out.println(Arrays.toString(returnArray()));
//        multipleNumbers();
//        makeTriple(5);
//        maxMin();
//        System.out.println(checkBalance(list6));
        changePosition(list6, 4);
    }

//    #1 Задать целочисленный массив, состоящий из элементов 0 и 1.
//    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0
    private static void changeNumbers() {
        for (int i = 0; i < 10; i++) {
            if (list[i] == 1) {
                list[i] = 0;
            } else {
                list[i] = 1;
            }
        }
        System.out.println(Arrays.toString(list));
    }

//    #2 Задать пустой целочисленный массив размером 8.
//    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
    private  static  int[] returnArray() {
        int[] list2 = new int[8];
        int a = 0;
        for (int i = 0; i < 8; i++) {
            list2[i] = a;
            a += 3;
        }
        return list2;
    }

//    #3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//    и числа меньшие 6 умножить на 2
    private static void multipleNumbers() {
        int l = list3.length;
        for (int i = 0; i < l; i++) {
            if (list3[i] < 6) {
                list3[i] = list3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(list3));
    }

//    #4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    private static int[][] makeTriple(int a) {
        int[][] list4 = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j || i == a-j-1) {
                    list4[i][j] = 1;
                    System.out.print(list4[i][j]);
                } else {
                    list4[i][j] = 0;
                    System.out.print(list4[i][j]);
                }
            }
            System.out.println();
        }
        return list4;
    }

//    #5 Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)
    private static void maxMin() {
        int[] list5 = new int[] {4, 5, 3, 2, 12, 4, 5, 2, 4, 8, 9, 8};
        Arrays.sort(list5);
        int min = list5[0];
        int max = list5[list5.length - 1];
        System.out.println("min: " + min + ", max: " + max);
    }

//    #6 Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
// checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят
    private static boolean checkBalance(int[] incomeList) {
        boolean result = false;
        int l = incomeList.length;
        int sumTotal = 0;
        int leftSum = 0;
        int rightSum;
        int j = 0;
        for (int t: incomeList) {
            sumTotal += t;
        }
        for (int i = 0; i < l; i++) {
            for (; j <= i; j++) {
                leftSum += incomeList[j];
                rightSum = sumTotal - leftSum;
                if (leftSum == rightSum) {
                    result = true;
                }
            }
        }
        return result;
    }

//    #7 Написать метод, которому на вход подается одномерный массив и число n
//    (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива
//    на n позиций. Вышедшие за границу элементы отбрасываются, пустые места заполнять нулями.
//    Нельзя пользоваться вспомогательными массивами
    private static void changePosition(int[] incomeList, int pusher) {
        int l = incomeList.length;

        if (Math.abs(pusher) <= l) {
            for (int i = 0; i <= l; i++) {
                if (pusher > 0 && l - i + pusher <= l - 1) {
                    incomeList[l - i + pusher] = incomeList[l - i];
                } else if (pusher < 0 && i + pusher >= 0 && i + pusher < l - 1 && i < l){
                    incomeList[i + pusher] = incomeList[i];
                }
                if (l - i <= pusher && pusher > 0 && l - i >= 0 && l - i < l) {
                    incomeList[l - i] = 0;
                }
            }
            if (pusher < 0) {
                for (int j = 0; j > pusher; j--) {
                    incomeList[l - 1 + j] = 0;
                }
            }
            System.out.println(Arrays.toString(incomeList));
        } else {
            for (int i = 0; i < l; i++) {
                incomeList[i] = 0;
            }
            System.out.println(Arrays.toString(incomeList));
        }
    }
}
