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
    public static int[] randIntArr(int count){
        int[] arr = new int[count];
        for(int i=0; i< arr.length; i++){
            arr[i]= (count)(Math.random()*1000);
        }
        return arr;
    }

    public static boolean isSorted(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i+1] > arr[i]){
                return true;
            }
            else{
                return false;
            }
        }
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
            int min = i;
            for (int j=0; j < arr.length; j++){
                if (arr[j] > arr[i]){
                    swap(arr, i, j)
                }
            }
        }
    }

}
