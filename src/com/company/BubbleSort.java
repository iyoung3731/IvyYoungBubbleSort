package com.company;

public class BubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[j] = arr[i];
        arr[j] = temp;
    }
    public static void bubbleSort(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i] > arr[i+1]){
                swap(arr, arr[i], arr[i+1]);
            }
        }
    }
    public static int[] randIntArr(int count){}

    public static void isSorted(int[] arr){}

    public static void checkSum(int[] before, int[] after){}

}
