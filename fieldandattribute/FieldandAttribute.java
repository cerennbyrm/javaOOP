package fieldandattribute;

public class FieldandAttribute {

    public static void main(String[] args) {
      Product product=new Product(1, "Laptop", "Asus Laptop", 3000, 2, "siyah");
       //constructor bloğundan set ettik 
      
       product.setId(1);
       product.setName("Laptop");
       product.setDescription("Asus Laptop");
       product.setPrice(5000);
       product.setStockAmount(3);
       product.getKod();

       
       ProductManager productManager=new ProductManager();
       productManager.add(product);
        System.out.println(product.getKod());
    }

}
