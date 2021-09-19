package com.GoldenJava.LeetCode;

import java.util.List;

/*Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
        Return the linked list sorted as well.*/
public class RemoveDupsFromSortedLL_83 {
    public static void main(String[] args) {
        LinkedList.insert(10);
        LinkedList.insert(14);
        LinkedList.insert(14);
        LinkedList.insert(30);
        LinkedList.insert(30);
        LinkedList.insert(30);
        LinkedList.insert(30);
        LinkedList.insert(60);
        LinkedList.deleteDuplicates(LinkedList.head);
        LinkedList.display();
    }

}
 class ListNod {
      int val;
      ListNod next;
      ListNod() {}
      ListNod(int val) { this.val = val; }
      ListNod(int val, ListNod next) { this.val = val; this.next = next; }


 }
 class LinkedList {
     public static ListNod head;

     public static void insert(int n) {
         ListNod node = new ListNod(n);
         if (head == null) {
             head = node;
             return;
         }
         ListNod temp = head;
         while (temp.next != null) {
             temp = temp.next;
         }
         temp.next = node;
     }

     public static void display() {
         ListNod temp = head;
         while (temp != null) {
             System.out.println(temp.val);
             temp = temp.next;
         }
     }
     public static ListNod deleteDuplicates(ListNod head) {
         ListNod temp= LinkedList.head;
         int search;
         if(head==null){
             return null;
         }
         if(temp.next!=null){
             temp=temp.next;
         }else{
             return  head;
         }

         ListNod prev= LinkedList.head;
         while(temp!=null){
             search=prev.val;
             int flag=0;
             if(search==temp.val){
                 if(prev.val!=temp.next.val){
                     prev.next=temp.next;
                     prev=temp.next;
                     flag=1;
                 }else{
                     prev.next=temp.next;
                     temp=temp.next;
                 }
             }else {
                 prev=temp;
                 flag=1;
             }
             if(flag==1){
                 temp=prev.next;
             }

         }
         return head;
     }
 }
