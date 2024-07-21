package com.dsa.hackingly.weekOneSaturday;

public class WeekOneSaturday {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static  void printList(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static class MergeList{
        Node sortedMerge(Node a,Node b){
            Node head = null;
            if(a.data<=b.data){
                head = a;
                a=a.next;
            }else{
                head = b;
                b = b.next;
            }
            Node tail = head;
            while(a!=null && b!=null){
                if(a.data<=b.data){
                    tail.next=a;
                    a=a.next;
                }else {
                    tail.next = b;
                    b = b.next;
                }
                tail = tail.next;
            }
            if(a == null) tail.next=b;
            if(b == null) tail.next =a;
            return head;
        }
    }

    public static void reverseNumber(int n){
        int rem=0, rev=0;
        System.out.println("Before reversing :"+n);
        while(n!=0){
            rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        System.out.println("After reversing: "+rev);
    }

    public static int countVowels(String s){
        int n = s.length(),count =0;
        char[] letters = s.toCharArray();
        for(int i=0;i<n;i++){
            if(letters[i] == 'a' ||letters[i] == 'e' ||letters[i] == 'i' ||letters[i] == 'o' || letters[i] == 'u' || letters[i] == 'A' || letters[i] == 'E' ||
                    letters[i] == 'I' ||letters[i] == 'O' ||letters[i] == 'U')
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Hi");
        reverseNumber(1998);
        int noOfVowels = countVowels("Hackingly");
        System.out.println("No of vowels: "+noOfVowels);
        Node aNode = new Node(3);
        Node bNode = new Node(1);
        aNode.next = new Node(4);
        aNode.next.next = new Node(8);
        aNode.next.next.next = new Node(12);
        bNode.next = new Node(6);
        bNode.next.next = new Node(15);
        bNode.next.next.next = new Node(19);
        Node resList = new MergeList().sortedMerge(aNode,bNode);
        printList(resList);

    }
}
