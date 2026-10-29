//1- A PhysicalProduct IS-A Product because- it is tangible.
//2- A shop system might have a payment class and would not pass this test because its a non physical item.
package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private Double weightKg;
    private String dimensions;

    public PhysicalProduct() {

    }

    public PhysicalProduct(Long id, String name, double price, Double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
