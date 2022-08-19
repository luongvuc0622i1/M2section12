package bt_LinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Manager {
    LinkedList<Product> arrayProduct = new LinkedList<>();

    public boolean addProduct(Product p) {
        if (arrayProduct.add(p)) {
            return true;
        } else {
            return false;
        }
    }

    public void removeProduct(int id) {
        arrayProduct.removeIf(product -> product.getId() == id);
    }

    public void searchProduct(String name) {
        boolean check = true;
        for (Product product : arrayProduct ) {
            if (product.getName() == name) {
                System.out.println(product);
                check = false;
            }
        }
        if (check) {
            System.out.println("Không có sản phẩm cần tìm kiếm");
        }
    }

    public void changeProduct(int id, String name) {
        for (Product product : arrayProduct) {
            if (product.getId() == id) {
                product.setName(name);
            }
        }
    }

    public void changeProduct(int id, int price) {
        for (Product product : arrayProduct) {
            if (product.getId() == id) {
                product.setPrice(price);
            }
        }
    }

    public void changeProduct(int id, String name, int price) {
        for (Product product : arrayProduct) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
            }
        }
    }

    public void display() {
        for (Product product : arrayProduct) {
            System.out.println("Product{" +
                    "id=" + product.getId() +
                    ", name='" + product.getName() + '\'' +
                    ", price=" + product.getPrice() +
                    '}'
            );
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "arrayProduct=" + arrayProduct +
                '}';
    }

    public void increaseArray() {
        Collections.sort(arrayProduct, getComparatorIn());
    }

    public void decreaseArray() {
        Collections.sort(arrayProduct, getComparatorDe());
    }

    private Comparator<Product> getComparatorIn() {
        return new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() > p2.getPrice()) {
                    return 1;
                } else {
                    if (p1.getPrice() == p2.getPrice()) {
                        return 0;
                    } else
                        return -1;
                }
            }
        };
    }

    private Comparator<Product> getComparatorDe() {
        return new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() < p2.getPrice()) {
                    return 1;
                } else {
                    if (p1.getPrice() == p2.getPrice()) {
                        return 0;
                    } else
                        return -1;
                }
            }
        };
    }
}
