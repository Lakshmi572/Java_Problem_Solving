package com.GoldenJava;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj ==null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Employee e= (Employee) obj;
        if(id != e.id){
            return false;
        }
        if(name==null){
            if(e.name!=null){
                return false;
            }
        }else if(!name.equals(e.name)){
            return false;
        }
        return true;

    }

//    @Override
//    public int hashCode() {
//        int init=7;
//        int result=1;
//        result=init*result +id;
//        result=init*result + ((name==null)? 0: name.hashCode());
//        return result;
//    }

    public void setName(String name) {
        this.name = name;
    }

}
