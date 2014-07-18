package com.dchen.domain;

/**
 * Created by dchen on 7/17/14.
 */
public class Employee {

    private String employeeID;
    private String employeeName;
    private double twExp;
    private double budegt;


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getTwExp() {
        return twExp;
    }

    public void setTwExp(double twExp) {
        this.twExp = twExp;
    }

    public double getBudegt() {
        return budegt;
    }

    public void setBudegt(double budegt) {
        this.budegt = budegt;
    }
}
