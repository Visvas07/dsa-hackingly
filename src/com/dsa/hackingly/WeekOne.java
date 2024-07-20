package com.dsa.hackingly;

public class WeekOne {
    public int findSecondLargest(int arr[]){
        int firstMax = 0,secondMax = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[firstMax]){
                firstMax = i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr[firstMax]){
                if(secondMax == -1){
                    secondMax = i;
                }
                else if(arr[i] > arr[secondMax]){
                    secondMax = i;
                }
            }
        }
        return secondMax;
    }
    public void moveZeroesToEnd(int arr[]){
        int n = arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0) j++;
        }

    }

}
