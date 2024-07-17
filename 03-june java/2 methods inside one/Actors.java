import java.util.*;
class Actors{

static String addMovieActors[]={null,null,null,null,null,null,null,null,null};
static int index;


public static boolean getNames(String name){
boolean isNameValid=false;
if(name !=null){
         addMovieActors[index]  =name;
		 index++;
		 isNameValid=true;
}
else System.out.println("provide valid name");
return isNameValid;
}

public static void getActorsNames(){
	System.out.println("The actors names are  :");
for(String element:addMovieActors){
System.out.println(element);
}
}
public static boolean updateActorsNames(String oldActorName,String newActorName){
		System.out.println("The updated actor names are:");
		boolean isActorsNamesUpdated = false;
		for (int index = 0; index <addMovieActors.length; index++ ){
		if(oldActorName == addMovieActors[index]){
			addMovieActors[index] = newActorName;
			isActorsNamesUpdated= true;
		}
	}
if (isActorsNamesUpdated==false){
	System.out.println(oldActorName + "not found");
}

return isActorsNamesUpdated;
}
/*public static boolean deleteActorsName(String actorsNameToBeDeleted){
	boolean isActorsNameDeleted =false;
	int oldindex,newindex;
	for(newindex = 0,oldindex= 0; oldindex<addMovieActors.length; oldindex++){
		if(addMovieActors[oldindex] !=actorsNameToBeDeleted)
		{
			addMovieActors[oldindex]=addMovieActors[newindex];
			newindex++;
}
	}
	addMovieActors = Arrays.copyOf(addMovieActors , newindex);
	if(addMovieActors !=null){
		isActorsNameDeleted = true;
	}
		if(isActorsNameDeleted == false){
			System.out.println(actorsNameToBeDeleted +"not found");
		}
		return isActorsNameDeleted;
}*/
	public static boolean deleteActorsName(String actorsNameToBeDeleted){
	boolean isActorsNameDeleted =false;
	int oldindex,newindex;
	for(newindex = 0,oldindex= 0; oldindex<addMovieActors.length; oldindex++){
		if(addMovieActors[oldindex] !=actorsNameToBeDeleted)
		{
			addMovieActors[newindex] =addMovieActors[oldindex] ;
			newindex++;
		}
	}
	addMovieActors = Arrays.copyOf(addMovieActors , newindex);
	if(addMovieActors !=null){
		isActorsNameDeleted = true;
	}
		if(isActorsNameDeleted == false){
			System.out.println(actorsNameToBeDeleted +"not found");
		}
		return isActorsNameDeleted;
}
	
}



