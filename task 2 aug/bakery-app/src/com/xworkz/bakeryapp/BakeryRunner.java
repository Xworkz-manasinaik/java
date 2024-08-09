package com.xworkz.bakeryapp;

import com.xworkz.bakeryapp.dao.BakeryDao;
import com.xworkz.bakeryapp.dto.BakeryItemDto;

public class BakeryRunner {
    public static void main(String[] args) {
        BakeryItemDto bakeryItemDto=new BakeryItemDto();
        bakeryItemDto.setiD(1);
        bakeryItemDto.setName("chocolate cake");
        bakeryItemDto.setType("cake");
        bakeryItemDto.setPrice(150.00);
        bakeryItemDto.setQuantity(1);
        bakeryItemDto.setDescription("Delicious chocolate cake");

        BakeryDao bakeryDao=new BakeryDao();
        bakeryDao.getBakeryItem(bakeryItemDto);
    }
}
