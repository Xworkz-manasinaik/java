package com.Xworkz.mobilwshop.dto;

public class MobileShopdto {
    private int id;
    private String ItemName;
    private double price;
    private int quantity;



    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }
    public String getItemName() {
        return ItemName;
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

}
