package com.Xworkz.mobilwshop;

import com.Xworkz.mobilwshop.dao.MobileShopDao;
import com.Xworkz.mobilwshop.dto.MobileShopdto;

public class MobileAccessoryRunner {
    public static void main(String[] args) {
        MobileShopdto accessoryDto=new MobileShopdto();
        accessoryDto.setId(1);
        accessoryDto.setItemName("charger");
        accessoryDto.setPrice(125.00);
        accessoryDto.setQuantity(1);

        MobileShopDao mobileShopDao=new MobileShopDao();

        mobileShopDao.getAccessoriesDetails(accessoryDto);
    }
}
