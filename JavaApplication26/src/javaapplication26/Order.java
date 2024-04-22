/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication26;
public class Order {
     private int customerId;
     private int orderId;
     private Product[] products;
     private float totalprice;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }
    public Order(int customerId, int orderId, Product[] products, float totalprice) {
        this.customerId = Math.abs(customerId);
        this.orderId = orderId;
        this.products = products;
        this.totalprice = totalprice;
    }
    public void printorderinfo(){
    System.out.println("order id:"+orderId);
        System.out.println("customer id:"+customerId);
        System.out.println("products:");
        for(Product product : products){
        System.out.println(product.getName()+"-$"+product.getPrice());
        }
        System.out.println("Total price:"+totalprice);
    }
}
