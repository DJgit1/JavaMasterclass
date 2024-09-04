package com.dj;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdAray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdAray));

        int[] fourthArray = Arrays.copyOf(thirdAray,thirdAray.length);
        System.out.println(Arrays.toString(fourthArray));


        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdAray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(thirdAray,5);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thirdAray,15);
        System.out.println(Arrays.toString(largeArray));

        String[] sArray = {"Able", "Jane","Mark","Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray,"Mark")>=0){
            System.out.println("Found Mark in the list");
        }

        int [] s1 = {1, 2, 3, 4, 5};
        int [] s2 = {1, 2, 3, 4, 5, 0};

        if (Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays are not equal");
        }
    }

    private static int [] getRandomArray (int len){
        Random random = new Random();
        int [] newInt = new int[len];   
        for (int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
 }
