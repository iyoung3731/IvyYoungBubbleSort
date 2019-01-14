package com.company;

public class BubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr){
        int x = 1;
        while (x !=0){
            x=0;
            for (int i=0; i<arr.length-1; i++){
                if (arr[i] > arr[i + 1]) {
                    swap(arr, arr[i], arr[i+1]);
                    x++;
                }
            }
        }
    }

    public static int[] randIntArr(int count){
        int[] arr = new int[count];
        for(int i=0; i< arr.length; i++){
            arr[i]= (int)(Math.random()*1000);
        }
        return arr;
    }

    public static boolean isSorted(int[] arr){
        boolean state = false;
        for (int i=0; i<arr.length; i++){
            if (arr[i+1] > arr[i]){
                state = true;
            }
            else{
                state = false;
            }
        }
        return state;
    }

    public static boolean checkSum(int[] before, int[] after){
        int beforeSum = 0;
        int afterSum =0;
        for (int i= 0; i < before.length; i++){
            beforeSum = beforeSum + before[i];
        }
        for (int i= 0; i < after.length; i++){
            afterSum = afterSum + after[i];
        }
        if (beforeSum == afterSum){
            return true; 
        }
        else{
            return false;
        }
    }

    public static void selectionSort(int[] arr){
        for (int i=0; i < arr.length; i++){
            for (int j=0; j < arr.length; j++){
                if (arr[j] > arr[i]){
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void insertionSort (int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i; j>0; j--) {
                if (arr[j-1]>arr[j]) {
                    swap(arr, j-1,j);
                }
            }
        }
    }

}
