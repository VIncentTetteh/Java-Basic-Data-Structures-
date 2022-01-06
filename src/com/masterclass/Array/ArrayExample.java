package com.masterclass.Array;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        int getIndex = searchArray(numbers,6);
        //numbers = deleteArrayElement(numbers,2);
        System.out.println(accessArrayElement(numbers,2));
        //System.out.println(getIndex);
        //numbers = insertArray(numbers,7,6);
        //numbers = insertArray(numbers,8,7);
        //System.out.println(Arrays.toString(numbers));
    }
    // inserting takes a linear time complexity O(n)
    public static int[] insertArray(int[] arr,int value,int size){
        int[] newArr = new int[size + 1];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        newArr[size] = value;
        return newArr;
    }
    // searching takes a linear time complexity O(n)
    public static int searchArray(int[] arr, int value){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                index = arr[i -1];
            }
        }
        return index;
    }
    // deleting takes a linear time complexity O(n)
    public static int[] deleteArrayElement(int[] arr,int element){
        int[] newArr = new int[arr.length - 1];
        for (int i = 0,k = 0; i < arr.length; i++) {
            if(i == element)
                continue;
            newArr[k++] = arr[i];
        }
        return newArr;
    }
    // accessing takes a constant time complexity O(1)
    public static int accessArrayElement(int[] arr,int index){
        return arr[index];
    }
}
