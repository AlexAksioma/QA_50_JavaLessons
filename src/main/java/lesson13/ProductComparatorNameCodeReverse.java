package lesson13;

import java.util.Comparator;

public class ProductComparatorNameCodeReverse implements Comparator<Product> {
    @Override//unit --> name reverse --> code
    public int compare(Product p1, Product p2) {
        int result = p1.getUnit().compareTo(p2.getUnit());
        if(result != 0)
            return result;
        result = p2.getName().compareTo(p1.getName());
        if(result != 0)
            return result;
        return Long.compare(p1.getCode(), p2.getCode());
    }
}
