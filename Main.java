import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrTask1 = {1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1};
        arrTask1 = task1(arrTask1);
        System.out.println(Arrays.toString(arrTask1));

        int[] arrTask2 = new int[8];
        task2(arrTask2);
        System.out.println(Arrays.toString(arrTask2));

        int[] arrTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task3(arrTask3);
        System.out.println(Arrays.toString(arrTask3));

        int[][] arrTask4 = new int[5][5];
        arrTask4 = task4(arrTask4);
        System.out.println(Arrays.deepToString(arrTask4));

        int[] arrTask5 = {23, 5436, -343, -13, 567, 111, 332, 8776};
        int min = task5min(arrTask5);
        int max = task5max(arrTask5);
        System.out.println("min - " + min + " max - " + max);

        int[] arrTask6 = {2, 2, 1, 1, 1, 1};
        System.out.println(task6(arrTask6));


    }

    public static int[] task1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int[] task2(int[] arr) {
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) arr[i] = arr[i - 1] + 3;
        return arr;
    }

    public static int[] task3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
        return arr;
    }

    public static int[][] task4(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                if (i == j) arr[i][j] = 1;
                else if ((i + j) == (arr.length - 1)) arr[i][j] = 1;
                else arr[i][j] = 0;
        }
        return arr;
    }

    public static int task5min(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static int task5max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static boolean task6(int[] arr) {
        int left = 0, right = 0;
        for (int i = 0; i < arr.length; i++) {
            left += arr[i];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            right = right + arr[i];
            left = left - arr[i];
            if (left == right)
                return true;
        }
    return false;
    }
}

