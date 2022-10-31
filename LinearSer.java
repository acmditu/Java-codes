package com.Aditya;

import java.util.Scanner;

public class LinearSer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {54,1,2,52,42,99,105,31,4};
        System.out.print("Enter Number You want to search in array ");
        int a= in.nextInt();
        System.out.println("The Number was found at index number:> "+LinearSearch(arr,a));
    }
    static int LinearSearch(int[] arr,int a){
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==a){
                return i;
            }
        }
        return -1;
    }

}
