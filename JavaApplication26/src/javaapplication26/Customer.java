/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication26;

/**
 *
 * @author Nour
 */
public class Customer {
    private int customerid;
    private String name ;
    private String address;

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        if(customerid>=0)
        this.customerid = customerid;
        else
            this.customerid=Math.abs(customerid);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(int customerid, String name, String address) {
        this.customerid = Math.abs(customerid);
        this.name = name;
        this.address = address;
    }
    
    
}
