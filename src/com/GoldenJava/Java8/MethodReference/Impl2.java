package com.GoldenJava.Java8.MethodReference;

public class Impl2 {
    public static void main(String[] args) {
        Impl2 test=new Impl2();
        interf i=test::sum;
        i.add(10,20);
    }
    public void sum(int x,int y){
        System.out.println("The sum : "+(x+y));
    }
}
interface interf{
    void add(int a,int b);
}
