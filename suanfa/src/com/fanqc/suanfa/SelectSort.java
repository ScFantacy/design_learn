package com.fanqc.suanfa;

//选择排序
public class SelectSort {
    public static void main(String[] args) {

    }

    void sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1;j < arr.length; j++){
//                arr[i] < arr[j]?arr
                minIndex = arr[j] < arr[minIndex]?j:minIndex;
            }
            swap(arr,i,minIndex);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
