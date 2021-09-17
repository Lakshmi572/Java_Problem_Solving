package com.GoldenJava.LeetCode.Sortings;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr={8,3,9,6,2,7,1,4,5};
        MergeSort(arr,0,arr.length-1);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    private static void MergeSort(int[] arr, int l, int r) {
        int mid;
        if(l<r){
            mid=(l+r)/2;
//            System.out.println("mid :"+mid);
            MergeSort(arr,l,mid);
            MergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }

    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+i+1];
        }
        int i=0,j=0,k=l;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }else {
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
}
