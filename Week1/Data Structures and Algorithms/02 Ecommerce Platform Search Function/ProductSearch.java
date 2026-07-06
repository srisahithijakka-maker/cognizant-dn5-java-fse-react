import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int productId) {

        for (Product product : products) {
            if (product.productId == productId) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int productId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (products[mid].productId == productId) {
                return products[mid];
            }

            if (products[mid].productId < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(105, "Mobile", "Electronics"),
                new Product(102, "Watch", "Accessories"),
                new Product(104, "Bag", "Fashion")
        };

        int searchId = 102;

        // Linear Search
        Product linearResult = linearSearch(products, searchId);

        System.out.println("Linear Search:");

        if (linearResult != null) {
            System.out.println(linearResult);
        } else {
            System.out.println("Product not found.");
        }

        // Sort array before Binary Search
        Arrays.sort(products, Comparator.comparingInt(product -> product.productId));

        // Binary Search
        Product binaryResult = binarySearch(products, searchId);

        System.out.println("\nBinary Search:");

        if (binaryResult != null) {
            System.out.println(binaryResult);
        } else {
            System.out.println("Product not found.");
        }
    }
}