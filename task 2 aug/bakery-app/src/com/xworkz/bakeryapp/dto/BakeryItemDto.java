package com.xworkz.bakeryapp.dto;

public class BakeryItemDto {

    private int id;
    private String name;
    private String type;
    private double price;
    private int quantity;
    private String description;

    public void setiD(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
