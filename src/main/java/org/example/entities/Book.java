package org.example.entities;

public class Book extends Product{
    private String author;
    private String category;
    private String synopsis;

    public Book() {
        super();
    }

    public Book(String name, Double code, Double price, String author, String category, String synopsis) {
        super(name, code, price);
        this.author = author;
        this.category = category;
        this.synopsis = synopsis;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @Override
    public Double productTax(Double price){
        return price + 10.0;
    }

    @Override
    public String viewProduct(String synopsis) {
        return synopsis;
    }
}
