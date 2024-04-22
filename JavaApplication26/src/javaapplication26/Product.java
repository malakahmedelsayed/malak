/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication26;
public class Product {
    protected int productId;
    protected String name;
    protected float price;

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setProductId(int product) {
      if(productId>=0){
        this.productId = productId;}
      else
          this.productId=Math.abs(product);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        if(price>=0)
        this.price = price;
        else
            this.price=Math.abs(price);
    }

    public Product(int productId, String name, float price) {
        this.productId = Math.abs(productId);
        this.name = name;
        this.price = Math.abs(price);
    }
    
   
    
    
}
