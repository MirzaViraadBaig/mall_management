/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Viraad
 */
public class employeeClass {
    String name;
    int id;
    String designation;
    String cnic;
    String email;
    double salary;

    public employeeClass(String name,String cnic,String designation,String email) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.cnic = cnic;
        this.email = email;
        this.salary = salary;
        setSalary();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        if("Manager".equals(designation)){
            this.salary = 421031.13;
        }
        if("Sales Executive".equals(designation)){
            this.salary = 60031.213;
        }
        if("Software Engineer".equals(designation)){
            this.salary = 60031.213;
        
        
    }
    
}
}
