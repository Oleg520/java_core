package lesson2;

import java.util.Arrays;

public class Main {

    private static int countEvenNums(int[] arr) {
        int counter = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    private static int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    private static int minMaxDifference(int[] arr) {
        if (arr.length < 2) {
            System.out.println("размер массива не превышает 2 элемента");
            return 0;
        }
        int min = getMinValue(arr);
        int max = getMaxValue(arr);

        return max - min;
    }

    private static boolean isTwoZerosInARow(int[] arr) {
        if (arr.length < 2) {
            System.out.println("размер массива не превышает 2 элемента");
            return false;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] == 0 && arr[j] == 0) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {

//        int[] myArray = {1, 2, 1, 0, -4, 5, -11, 2};
//        System.out.println(countEvenNums(myArray));
//        System.out.println("Разница = " + minMaxDifference(myArray));
//        System.out.println(isTwoZerosInARow(myArray));
    }


    private static int[] add(int[] arr, int el) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = el;
        return newArr;
    }

    private static int[] add(int[] arr, int index, int el) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = el;
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }

}
