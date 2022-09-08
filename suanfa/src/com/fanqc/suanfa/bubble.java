package com.fanqc.suanfa;

// 冒泡排序
public class bubble {
    public static void main(String[] args) {
        int arr[] = {1,5,3,12,7,6,21,8,9};
        sort(arr);
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
    static void sort(int[] arr){
        for(int i = arr.length; i >0; i--){
            for (int j = 0;j < i - 1; j++){
                if (arr[j] > arr[j + 1]){swap(arr,j,j+1);}
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
