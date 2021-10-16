package com.GoldenJava.Java8.Function;

import com.GoldenJava.Java8.Entities.Student;

import java.util.function.Function;

/*
Function is a pre-defined functional interface, which takes an argument and returns some generic type like obj,String,int etc.,
We have to specify the return type to the reference only

Function<T, R>
    R apply(T);
 */
public class FunctionPractice {
    public static void main(String[] args) {
        Function<Integer, Integer> f = i -> i * i;
        System.out.println(f.apply(6));

        Student[] students={
                new Student(101,"Lakshmi",56),
                new Student(134,"Prasad",67),
                new Student(176,"Jimmy",89),
                new Student(156,"Cheechu",90),
                new Student(145,"Madhu",34),
        };
        Function<Student,String> grade=s->{
            int marks=s.getMarks();
            String g="";
            if(marks>=85) g="Grade A";
            else if(marks>=70) g="Grade B";
            else if(marks>=65) g="Grade C";
            else if(marks>=50) g="Grade D";
            else g="Failed";
            return g;
        };
        for(Student student: students){
            System.out.println(student.getId()+" "+student.getName()+" "+grade.apply(student));
        }
    }
}
