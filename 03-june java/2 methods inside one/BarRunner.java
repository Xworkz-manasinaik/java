class BarRunner{
public static void main(String[] args){
Bar.addWineBrands("Grover La Reserve");
Bar.addWineBrands("Fratelli");
Bar.addWineBrands("York Arros");
Bar.addWineBrands("Chandon Brut NV");
Bar.addWineBrands("Chandon Brut Rose NV");
Bar.addWineBrands("Fratelli M/S Red");
Bar.addWineBrands("titan");


Bar.getAllBrands();
boolean nameUpdated = Bar.updateWineBrand("Fratelli"," Vallisto");
System.out.println("the name updated is" + nameUpdated);
Bar.getAllBrands();

boolean nameDeleted = Bar.deletebrandNames("titan");
System.out.println("deleted watch brand is " + nameDeleted);
Bar.getAllBrands();}


}