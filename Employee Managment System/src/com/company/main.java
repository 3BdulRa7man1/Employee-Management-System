package com.company;
import com.company.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("How many employees?: ");
        int size = sc.nextInt();
        service ev = new service(size);

        for (int i = 0; i < size; i++) {
            ev.addEmployee(new employee());
        }
        System.out.println();
        System.out.println("average salary: " + ev.avgSalary());
        int n = ev.nElm-1;
        ev.deleteEmployee(ev.EV[n]);
        System.out.println("max salary: " + ev.maxSalary().salary+ " gained by: " +ev.maxSalary().name );




    }
}
