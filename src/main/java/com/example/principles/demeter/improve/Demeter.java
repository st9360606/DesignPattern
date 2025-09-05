package com.example.principles.demeter.improve;

import java.util.ArrayList;
import java.util.List;


public class Demeter {

    public static void main(String[] args) {
        System.out.println("~~~使用迪米特法則~~~");
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

class CollegeManager {
    //取得學院所有員工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) { //增加10個員工
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("學院員工id= " + i);
            list.add(emp);
        }
        return list;
    }
    public void printEmployee() {
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("------------學院員工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        //取得學校總部所有員工
        for (int i = 0; i < 5; i++) { //增加5個員工
            Employee emp = new Employee();
            emp.setId("學校總部員工id= " + i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollegeManager sub) {
        sub.printEmployee();

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------學校總部員工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }

}


