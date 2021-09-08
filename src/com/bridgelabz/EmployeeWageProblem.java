package com.bridgelabz;

public class EmployeeWageProblem {
    public static int isPresent(){
        return (int) (Math.floor(Math.random()*10)%2);
    }

    public static void main(String[] args) {
        System.out.println("Well come to employeewage problem ");
        int IS_FULL_TIME=1;

        if(IS_FULL_TIME == isPresent())
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");

    }
}
