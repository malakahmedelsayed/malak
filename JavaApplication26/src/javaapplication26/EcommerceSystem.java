package javaapplication26;
import java.util.Scanner;
public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        ElectronicProduct smartphone =new ElectronicProduct(1,"smartphone", (float) 599.9,"samsung",1);
        ClothingProduct tshirt= new ClothingProduct(2,"T-shirt",(float)19.99, "medium", "cotton");
        BookProduct oop= new BookProduct (3,"oop",(float)39.99,"O'Reilly","XPublications");
        System.out.println("Enter your id :");
        int customerId= input.nextInt();
        input.nextLine();
        System.out.println("Enter your name");
        String customerName= input.nextLine();
        System.out.println("Enter your address");
        String address= input.nextLine();
        Customer customer = new Customer(customerId,customerName,address);
        System.out.println("How many products do you want to order?");
        int numProduct =input.nextInt();
        Product[]Products=new Product[numProduct];
        Cart cart=new Cart(customerId,numProduct,Products);
        for(int i=0; i<numProduct;i++){
            System.out.println("Enter product type (1 for electronic , 2 for clothing , 3 for book)");
            int producttype=input.nextInt();
            switch(producttype){
                case 3:
                    cart.addProduct(oop, i);
                    break;
                case 2:
                    cart.addProduct(tshirt, i);
                    break;
                case 1:
                    cart.addProduct(smartphone, i);
                    break;
                default:
                            System.out.println("invalid");
                            break;}
        }
        System.out.println("do you want to place an order?(1 for yes , 2 for no)");
        int choice=input.nextInt();
        switch(choice){
            case 1:
                cart.placeOrder();
                break;
            case 2:
                System.out.println("the order is cancelled");
                break;
            default:
                System.out.println("invalid");
                break;
        
        }    
    }
    
}
