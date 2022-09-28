package classeswithattributes;

public class ClassesWithAttributes {

    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", "Asus Laptop", 2, 3000, "siyah");

        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("siyah");

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        // productManager.Add2(5, "","" , 2, 200,"");
        System.out.println(product.getKod());
    }

}
