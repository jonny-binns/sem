package com.napier.sem;

public class Department {
    public String dept_no;
    public String dept_name;
    public Employee manager;
    public String toString(){
        return dept_name + " " + dept_no;
    }
}
