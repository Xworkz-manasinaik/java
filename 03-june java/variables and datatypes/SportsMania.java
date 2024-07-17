class SportsMania{
static String iplTeamNames[] = {"‎Royal Challengers Bengaluru" , "Chennai Super Kings" , "Delhi Capitals" , "Gujarat Titans" , "Kolkata Knight Riders" , "Lucknow Super Giants" , "Mumbai Indians" , "Punjab Kings" , "Rajasthan Royals"};
static String top10batsmen[]={"David Warner" , "Virat kohli" , "Shikar Dhawan" , "Rohit sharma" , "Suresh Raina" , "Chris Gayle" , "AB de Villiers" , "AB de Villiers" , "Robin Uttappa" , "Shane watson"};
static String top10bowlers[]={"Yuzvendra Chahal" , "Piyush Chawla" , "Dwayne Bravo" , "Suresh Raina" , "Bhuvneshwar Kumar" , "Sunil Narine" , "Jasprit Bumrah" , "Amit Mishra" , "Ravindra Jadeja" , "Harbhajan Singh"};
static String top10iccteams[]={"afganistan" , "australia" , "india" , "england" , "Bangladesh" , "New zealand" , "sri lanka" , "south africa" , "west indies" , "pakistan"};

public static void main(String newCollection[]){
	
	System.out.println("The Available ipl TeamNames are : ");
	//for loop
	for (int index = 0;index <iplTeamNames.length ; index++ ){
		System.out.println(iplTeamNames[index]);
	}
	System.out.println("The Available ipl TeamNames are : ");
	//for each loop
	for(String iplTeamNames:iplTeamNames){
		System.out.println(iplTeamNames);
	}
	
	System.out.println("The available top 10 batsmen  are :");
		//for loop
for(int index = 0 ; index<top10batsmen.length ; index++){
	System.out.println(top10batsmen[index]);
	}
	System.out.println("The Available top 10 batsmen are : ");
	//for each loop
	for(String top10batsmen:top10batsmen){
		System.out.println(top10batsmen);
	}
	
	System.out.println("The Available top 10 bowlers are : ");
	//for loop
	for (int index = 0;index <top10bowlers.length ; index++ ){
		System.out.println(top10bowlers[index]);
	}
	System.out.println("The Available top 10 bowlers are : ");
	//for each loop
	for(String top10bowlers:top10bowlers){
		System.out.println(top10bowlers);
	}
	
	System.out.println("The Available top 10 iccteams are : ");
	//for loop
	for (int index = 0;index <top10iccteams.length ; index++ ){
		System.out.println(top10iccteams[index]);
	}
	System.out.println("The Available top 10 iccteams are : ");
	//for each loop
	for(String top10iccteams:top10iccteams){
		System.out.println(top10iccteams);
	}
}
}