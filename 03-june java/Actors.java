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

public static void getAcotrsNames(){
for(String element:addMovieActors)
System.out.println(element);

}
}