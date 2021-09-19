package com.GoldenJava.LeetCode;

public class MergeSortedList {
    public static void main(String[] args) {

        ListNode l1=new ListNode();
        ListNode l2=new ListNode();
        l1.insert(10);
        l2.insert(20);
        l1.insert(30);
        l2.insert(40);
        l1.insert(50);
        l2.insert(60);
        l1.insert(70);
        /*l1.insert(80);
        l1.insert(90);*/
        l1.display();

        MergeSortedList merge=new MergeSortedList();
        ListNode merging = merge.Merging(l1, l2);
        assert merging != null;
        merging.display();
    }

    private ListNode Merging(ListNode l1, ListNode l2) {
        ListNode fin=null;
        if(l1.val > l2.val){
            ListNode temp=new ListNode();
            temp.val=l1.val;
        }

        return null;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode node;
    public void insert(int val){
        ListNode l=new ListNode();
        l.val=val;
        l.next=null;
        if(node == null){
            node=l;
        }else{
            ListNode temp=node;
            while(node.next != null){
                System.out.println(node.val);
                node=node.next;
            }
            node.next=l;
        }
    }

    public void display(){
        ListNode temp=node;
        while(temp != null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
