/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author mattkirchner
 */
public class Company {
    private HrEmployee hr;
    
    public Company() {
        hr = new HrEmployee();
    }
    
    public void hireNewEmployee(String firstName, String lastName, String ssn) {
        hr.hireNewEmployee(firstName, lastName, ssn);
    }
}
