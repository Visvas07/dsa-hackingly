package com.dsa.hackingly.weekTwoFriday;

public class WeekTwoSaturday {
    public static String dreamPackage(int salary){
        return (salary > 500000) ? "DREAM" :"NOTDREAM" ;
    }

    public static boolean perfectNumber(int num){
        if(num == 1) return true;
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
                sum = sum+i;
        }
        if(sum == num) return true;
        return false;
    }
    public static String leapYearOrNot(int year){
        if(year % 400 == 0 || (year % 4 == 0)&& (year%100!=0))
            return "Leap Year";
        else
            return "Not leap year";
    }

    public static void main(String[] args) {
        System.out.println(leapYearOrNot(2020));
        System.out.println(leapYearOrNot(1990));
        System.out.println(perfectNumber(1));
        System.out.println(perfectNumber(96345));
        System.out.println(dreamPackage(100000));
        System.out.println(dreamPackage(1500000));
    }

}
