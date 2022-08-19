package bt_ArrayList;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(01, "Gà", 10000);
        Product p2 = new Product(03, "Vịt", 15000);
        Product p3 = new Product(04, "Mèo", 100000);
        Product p4 = new Product(02, "Chó", 40000);

        Manager productManager = new Manager();
        productManager.addProduct(p1);
        productManager.addProduct(p4);
        productManager.addProduct(p3);
        productManager.addProduct(p2);
        System.out.println("Array product:");
        productManager.display();
        productManager.removeProduct(4);
        System.out.println("Array product after remove:");
        productManager.display();
        productManager.changeProduct(1,"A10");
        productManager.changeProduct(2,20000);
        productManager.changeProduct(4,"A20",50000);
        System.out.println("Array product after change product: ");
        productManager.display();
        System.out.println("Product has name is: ");
        productManager.searchProduct("Chó");
        System.out.println("Array product after decrease: ");
        productManager.decreaseArray();
        productManager.display();
        System.out.println("Array product after increase: ");
        productManager.increaseArray();
        productManager.display();
    }
}
