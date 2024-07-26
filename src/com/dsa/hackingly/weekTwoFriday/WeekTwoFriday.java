package com.dsa.hackingly.weekTwoFriday;

import java.util.HashMap;
import java.util.Map;

public class WeekTwoFriday {
    public static void sumEvenOdd(int arr[]){
        int sumEven =0;
        int sumOdd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                sumEven+=arr[i];
            else
                sumOdd+=arr[i];
        }
        System.out.print(sumOdd+" "+sumEven);
    }

    public static void findMinMax(int arr[]){
        int min = arr[0];
        int max = arr[0];
        for(int i = 0;i< arr.length;i++){
            min = Math.min(min,arr[i]);
        }
        for(int i = 0; i< arr.length;i++){
            max = Math.max(max,arr[i]);
        }

        System.out.println(max+" "+min);
    }

    public static int findMostFreqElement(int arr[]){
        HashMap<Integer,Integer>  elementCount = new HashMap<>();
        int maxCount=0;
        int freqMaxElement = -1;
        for(int x:arr){
            if(elementCount.containsKey(x)){
                int freq = elementCount.get(x);
                freq++;
                elementCount.put(x,freq);
            }else{
                elementCount.put(x,1);
            }
        }
        for(Map.Entry<Integer,Integer> x : elementCount.entrySet()){
            if(maxCount < x.getValue()){
                maxCount = x.getValue();
                freqMaxElement = x.getKey();
            }
        }
        return freqMaxElement;
    }

    public static void main(String[] args) {
        int[] firstArray = {1,3,2,1,4,1};
        int[] secondArray = {1,2,3,4,5,6,7};
        int[] thirdArray = {3,1,4,6,2,7};
        findMinMax(thirdArray);
        int ele = findMostFreqElement(firstArray);
        System.out.println("The most frequent element is :"+ele);
        sumEvenOdd(secondArray);
    }
}
