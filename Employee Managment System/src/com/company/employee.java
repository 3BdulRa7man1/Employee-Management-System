package com.company;
import java.util.Scanner;

public class employee { // this is the class for each employee
    String name;
    int ID;
    double salary;

    public employee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the employee: ");
        this.name = sc.next() ;
        System.out.print("Enter the ID of the employee: ");
        this.ID = sc.nextInt();
        System.out.print("Enter the salary of the employee: ");
        this.salary = sc.nextDouble();
        System.out.println();
    }
    public employee (int id, String name, double salary) {
        this.ID = id;
        this.name = name;
        this.salary = salary;
    }

}
