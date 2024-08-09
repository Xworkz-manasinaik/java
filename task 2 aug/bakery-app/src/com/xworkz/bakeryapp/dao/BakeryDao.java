package com.xworkz.bakeryapp.dao;

import com.xworkz.bakeryapp.dto.BakeryItemDto;

public class BakeryDao {
    public void getBakeryItem(BakeryItemDto dto){
        System.out.println("id: "+dto.getId());
        System.out.println("item name: "+dto.getName());
        System.out.println("Type: "+dto.getType());
        System.out.println("Price: "+dto.getPrice());
        System.out.println("quantity: "+dto.getQuantity());
        System.out.println("description: "+dto.getDescription());
    }
}
