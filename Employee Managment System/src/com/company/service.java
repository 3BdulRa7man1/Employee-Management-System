package com.company;

public class service {
    int nElm;
    private int size;
    employee[] EV;

    public service(int size) {
        this.nElm = 0;
        this.size = size;
        EV = new employee[size];
    }

    private boolean isfull(){
        return nElm == size;
    }
    private boolean isEmpty() {
        return nElm == 0;
    }

    public void addEmployee(employee e) { // adding employees to the array
        if (!search(e) & !isfull()){ // input validation
            EV[nElm] = e;
            nElm++;
        }
        else {
            System.out.println("Error: employee already exists");
        }
    }

    public void deleteEmployee(employee e) {//removes employee from the array(do not forget to shift the element after deletion)
        int i = 0;

        if (!search(e)) {
            System.out.println("Error: employee does not exist");
        } else {
            for (i = 0; i < nElm; i++) {
                if (EV[i].ID == e.ID) {
                    break;
                }
            }

            if (i == nElm) {
                System.out.println("Error: employee not found");
                return;
            }

            for (int j = i; j < nElm - 1; j++) {
                EV[j] = EV[j + 1];
            }

            EV[nElm - 1] = null;
            nElm--;
        }
    }

    public employee getEmployeeByID(int ID) {
        for (int i = 0; i < nElm; i++) {
            if (EV[i].ID == ID) {
                return EV[i];
            }
        }
        System.out.println("Error: employee does not exist");
        return null;
    }

    protected void sort() {
        for (int i = nElm - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (EV[j].salary > EV[j + 1].salary) { // Ascending order
                    employee temp = EV[j];
                    EV[j] = EV[j + 1];
                    EV[j + 1] = temp;
                }
            }
        }
    }
    boolean search(employee e){
        if(!isEmpty()){
            for (int i = 0; i < nElm; i++) {
                if (EV[i].ID == e.ID) {
                    return true;
                }
            }
        }
        return false;
    }
    public employee maxSalary(){
        if(isEmpty()){
            System.out.println("Error: no employees in the array");
            return null;
        }
        else {
            sort();
            return EV[nElm-1];
        }

    }
    public double avgSalary(){// calculates the average salary
        double avg = 0;
        if(isEmpty()){
            System.out.println("Error: no employees in the array");
            return 0;
        }
        else {

            for (int i = 0; i < nElm; i++) {
                avg += EV[i].salary;
            }
        }

        return avg/nElm;

    }

}
