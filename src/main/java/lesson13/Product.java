package lesson13;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private String name;
    private long code;
    private String unit;
    private double price;
    private double quantity;

    public Product() {
    }

    public Product(String name, long code, String unit,
                   double price, double quantity) {
        this.name = name;
        this.code = code;
        this.unit = unit;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return code == product.code && Objects.equals(name, product.name) && Objects.equals(unit, product.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, unit);
    }

    @Override //code --> name --> unit --> price --> quantity
    public int compareTo(Product p) {
        int result = Long.compare(code, p.code);
        if(result != 0)
            return result;
        result = name.compareToIgnoreCase(p.name);
        if(result != 0)
            return result;
        result = unit.compareTo(p.unit);
        if(result != 0)
            return result;
        result = Double.compare(price, p.price);
        if(result != 0)
            return result;
        return Double.compare(quantity, p.quantity);
    }
}
