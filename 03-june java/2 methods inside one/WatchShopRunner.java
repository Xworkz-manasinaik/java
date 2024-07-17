class WatchShopRunner{
public static void main(String[] args){
WatchShop.addWatchBrandNames("Backes & Strauss");
WatchShop.addWatchBrandNames("Bell & Ross");
WatchShop.addWatchBrandNames("Armand Nicolet");
WatchShop.addWatchBrandNames("Certina");
WatchShop.addWatchBrandNames("Chanel");
WatchShop.addWatchBrandNames("Gucci");
WatchShop.addWatchBrandNames("titan");


WatchShop.getAllWatchBrands();
boolean nameUpdated = WatchShop.updateWatchBrands("Backes & Strauss","Cyrus");
System.out.println("the name updated is" + nameUpdated);
WatchShop.getAllWatchBrands();
}


}