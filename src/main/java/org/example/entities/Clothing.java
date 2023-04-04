package org.example.entities;

public class Clothing extends Product{

    private String brand;
    private Double size;

    private String clothesSpecification;

    public Clothing() {
        super();
    }
    public Clothing(String name, Double code, Double price, String brand, Double size, String clothesSpecification) {
        super(name, code, price);
        this.brand = brand;
        this.size = size;
        this.clothesSpecification = clothesSpecification;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getClothesSpecification() {
        return clothesSpecification;
    }

    public void setClothesSpecification(String clothesSpecification) {
        this.clothesSpecification = clothesSpecification;
    }

    @Override
    public Double productTax(Double price) {
        return price;
    }

    @Override
    public String viewProduct(String clothesSpecification) {
        return clothesSpecification;
    }
}
