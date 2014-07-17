package com.dchen.domain;

/**
 * Created by dchen on 7/17/14.
 */
public class Employee {

    private String EmployeeID;
    private String Name;
    private double Exp;

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public double getExp() {
        return Exp;
    }

    public void setExp(double exp) {
        Exp = exp;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
