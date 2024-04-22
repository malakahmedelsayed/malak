/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication26;
public class Cart {
    private int customerid;
    private int nProducts;
   private  Product[] Products;

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        if(customerid>=0)
        this.customerid = customerid;
        else
            this.customerid=Math.abs(customerid);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }

    public Product[] getProducts() {
        return Products;
    }

    public void setProducts(Product[] Products) {
        this.Products =new  Product[this.nProducts];
    }

    public Cart(int customerid, int nProducts, Product[]Products) {
        this.customerid = customerid;
        this.nProducts = nProducts;
        this.Products=Products;
    }
    
    
    public void addProduct(Product product, int index){
    if (index>=0 && index< nProducts)
        Products[index]=product;
    else
            System.out.println("invalid");
    }
    public void removeProduct(int index){
        if(index >=0&&index<nProducts)
            Products[index]=null;
        else
            System.out.println("invalid");
    
    }
    public float calculatePrice(){
    float totalPrice=0;
    for(int i=0;i< nProducts;i++){
        if (Products[i]!=null)
            totalPrice=totalPrice +Products[i].getPrice();}
    return totalPrice;
}
    public void placeOrder(){
    Order order=new Order(customerid,1,Products,calculatePrice());
    order.printorderinfo();
    }
}

