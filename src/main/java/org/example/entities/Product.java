package org.example.entities;

public abstract class Product {
    private String name;
    private Double code;
    private Double price;

    public Product() {};
    public Product(String name, Double code, Double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCode() {
        return code;
    }

    public Double getPrice() {
        return price;
    }


    public abstract Double productTax(Double price);

    public abstract String viewProduct(String view);
}
