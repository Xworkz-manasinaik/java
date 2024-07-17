class TextilesRunner {
    public static void main(String[] args) {
        boolean isMaterialAdded = Textiles.addMaterial("Cotton");
        isMaterialAdded = Textiles.addMaterial("Wool");
        isMaterialAdded = Textiles.addMaterial("Silk");
        isMaterialAdded = Textiles.addMaterial("Linen");
        isMaterialAdded = Textiles.addMaterial("Polyester");
        isMaterialAdded = Textiles.addMaterial("Nylon");
        isMaterialAdded = Textiles.addMaterial("Rayon");
        isMaterialAdded = Textiles.addMaterial("Spandex");
        isMaterialAdded = Textiles.addMaterial("Cashmere");
        isMaterialAdded = Textiles.addMaterial("Denim");
        isMaterialAdded = Textiles.addMaterial("Velvet");
        isMaterialAdded = Textiles.addMaterial("Satin");
        isMaterialAdded = Textiles.addMaterial("Lace");
        isMaterialAdded = Textiles.addMaterial("Chiffon");

        if (isMaterialAdded) {
            Textiles.getAllMaterialInfo();
        }

        System.out.println("\n\n");
        System.out.println("Updated materials list \n\n");
        isMaterialAdded = Textiles.updateMaterial("Silk", "unknown Silk");
        if (isMaterialAdded) {
            Textiles.getAllMaterialInfo();
        }
         Textiles.deletMaterial("Cashmere");
		
		Textiles.getAllMaterialInfo();
    }
}
