package org.example.entities;

public class Eletronics extends Product{

    private String brand;
    private String specifications;

    public Eletronics() {
        super();
    }
    public Eletronics(String name, Double code, Double price, String brand, String specifications) {
        super(name, code, price);
        this.brand = brand;
        this.specifications = specifications;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    @Override
    public Double productTax(Double price) {
        return price + 200.0;
    }

    @Override
    public String viewProduct(String synopsis) {
        return specifications;
    }
}
