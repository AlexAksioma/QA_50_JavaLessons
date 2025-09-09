package lesson13;

import java.util.Comparator;

public class ProductComparatorByQuantityReversePrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        int result = Double.compare(p2.getQuantity(), p1.getQuantity());
        if (result != 0)
            return result;
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}
