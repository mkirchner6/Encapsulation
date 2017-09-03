/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.*;

/**
 *
 * @author mattkirchner
 */
public class HrEmployee {
    private List<Employee> listOfEmployees;

    public HrEmployee() {
    }
    
    public void hireNewEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName,lastName,ssn);
        listOfEmployees.add(e);
        orientNewEmployee(e);
    }
    
    public void orientNewEmployee(Employee e) {
        e.doFirstTimeOrientation("A7");
    }
}
