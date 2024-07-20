package com.dsa.hackingly;

import com.dsa.hackingly.WeekOne;

import java.util.HashSet;

public class Main {
        public static  class Node{
            int data;
            Node next;
            public Node(int data){this.data = data;}
        }

        public static void removeDuplicate(Node head){
            HashSet<Integer> hs = new HashSet<>();
            Node current = head;
            Node previous = null;
            while(current != null){
                int currentData = current.data;
                if(hs.contains(currentData)){
                    previous.next = current.next;
                }else{
                    hs.add(currentData);
                    previous = current;
                }
                current = current.next;
            }
        }
        public static void printList(Node head){
            while(head!=null){
                System.out.print(head.data+" ");
                head = head.next;
            }
        }

    public static void main(String[] args) {
	// write your code here
        int arr[] ={12, 35, 1, 10, 34, 1};
        int arr1[] = {1,2,0,4,3,0,5,0};
        Node node = new Node(3);
        node.next = new Node(5);
        node.next.next = new Node(3);
        node.next.next.next = new Node(7);
        node.next.next.next.next = new Node(8);
        node.next.next.next.next.next = new Node(5);
        node.next.next.next.next.next.next = new Node(10);
        printList(node);
        removeDuplicate(node);
        System.out.println();
        printList(node);
        WeekOne weekOne = new WeekOne();
        int secondMax = weekOne.findSecondLargest(arr);
        weekOne.moveZeroesToEnd(arr1);
        System.out.println();
        for(int i=0;i<arr1.length;i++)
            System.out.print(arr1[i]+" ");
        System.out.println();
        System.out.println(arr[secondMax]);
    }
}
