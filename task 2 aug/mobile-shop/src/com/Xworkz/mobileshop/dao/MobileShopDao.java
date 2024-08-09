package com.Xworkz.mobilwshop.dao;

import com.Xworkz.mobilwshop.dto.MobileShopdto;

public class MobileShopDao {

    public void getAccessoriesDetails(MobileShopdto dto){

        System.out.println("id: "+dto.getId());
        System.out.println("item name: "+dto.getItemName());
        System.out.println("price: "+dto.getPrice());
        System.out.println("quantity: "+dto.getQuantity());
    }
}
