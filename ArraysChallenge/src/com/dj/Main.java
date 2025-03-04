package com.dj;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = getArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = descendingArray(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] descendingArray(int[] array){

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp= sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    System.out.println("--------->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("---->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }

    public static int[] getArray(int len){

        Random random = new Random();
        int [] arrayOne = new int[len];
        for (int i = 0; i < len; i++){
            arrayOne[i] = random.nextInt(1000);
        }
        return arrayOne;
    }
}
