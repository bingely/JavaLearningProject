package com.bingley.learning.algorithm;
// https://juejin.im/post/5c9442cb5188252da9013153
public class Test1 {
    public static void main(String[] args) {
        //
    }

    void bubbleSort(int[] array) {
        //3 1 5 8 2 9 4 6 7    n*(n-1)/2    n
        for (int i = array.length - 1; i > 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];

                }
            }
        }
    }

}
