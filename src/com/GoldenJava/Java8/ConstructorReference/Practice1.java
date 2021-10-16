package com.GoldenJava.Java8.ConstructorReference;

import com.GoldenJava.Java8.Entities.Student;

public class Practice1 {
    public static void main(String[] args) {
//        Difference when creating object using lambda and constructor reference
        iStudent i=Student::new;
        iStudent i1=(id,name,marks)->new Student(id,name,marks);

        Student s1=i.getObject(10,"Lucky",57);
        System.out.println(s1);

        Student s2=i1.getObject(13,"Chinnu",87);
        System.out.println(s2);
    }
}
interface iStudent{
    Student getObject(int id,String name,int marks);
}
