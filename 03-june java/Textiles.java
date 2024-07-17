import java.util.*;

class Textiles {
    static String materials[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    static int index;

    public static boolean addMaterial(String material) {
        boolean isMaterialAdded = false;

        if (index < materials.length) {
            if (material != null) {
                materials[index] = material;
                index++;
                isMaterialAdded = true;
            } else {
                System.out.println("Enter a valid Material");
            }
        } else {
            System.out.println("Materials list is full");
        }
        return isMaterialAdded;
    }

    public static void getAllMaterialInfo() {
        for (String material : materials) {
            System.out.println(material);
        }
    }

    public static boolean updateMaterial(String oldMaterial, String newMaterial) {
        boolean isMaterialUpdated = false;
        for (int i = 0; i < materials.length; i++) {
            if (oldMaterial.equals(materials[i])) {
                materials[i] = newMaterial;
                isMaterialUpdated = true;
            }
        }
        return isMaterialUpdated;
    }
	public static boolean deletMaterial(String oldMaterialName){
		System.out.println("delet method started");
		boolean isMaterialNameDeleted=false;
		int newIndex=0, oldIndex;
		
		for(oldIndex=0;oldIndex<materials.length;oldIndex++){
			
			if(oldMaterialName!=materials[oldIndex]){
			
				materials[newIndex]=materials[oldIndex];
				newIndex++;

			}			
		}
		materials= Arrays.copyOf(materials,newIndex);
		if(materials!=null){
			isMaterialNameDeleted=true;
		}
		if(isMaterialNameDeleted==false){
			System.out.println(isMaterialNameDeleted+"not found");
		}
		System.out.println("delet method ended");
		return isMaterialNameDeleted;
	}
	
	
	
	
	
	
	
}