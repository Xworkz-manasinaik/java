class AmazonPrime{
static String englishMovies[] = {"Run" , "the godfather" , "the dark night" , "the lord of rings" , "the matrix" , "fight club", "avatar" , "titanic" , "seven samurai" , "gladiator" , "sinister" , "the orphan" , "leo" , "the sea beast", "damsel" , "hit man" , "space man " , "atlas" , "the killer" , "maritian" , "the ritual" , "bird box", "extraction" , "thanksgiving" , "the perfect date"};
static String kannadaMovies[] = {"tatsama tadbhava" , "ondu sarala prema kathe" , "kgf Chapter 2" , "kabzaa" , "mane number 13" , "kranti", "yajamana" ,"birbal" , "adipurush" , "annathe" , "kantara" , "u turn" , "RRR" , "wild dog" , "govinda govinda", "kavacham" , "dsp" , "Bheeshma" , "sapta sagaradache ello" , "love mocktsil" , "love mocktsil 2" , "777 Charlie" , "yuva", "O2" , "yuvaratnaa" , "kgf"};
static String hindimoviesOrseries[] = {"maidaan" , "kaagaz 2" , "yodha" , "madgon express" , "bawaal" , "chhori" , "toofan", "dangal" , "sherni" , "heeramandi " , "crew" , "four more shots please " , "pari" , "gangubai" , "comicstaan", "the family man" , "mumbai dairies" , "flames" , "the remix" , "jee karda" , "aspirants" , "12th fail" , "imMATURE", "one mic stand" , "rasbhari" , "rainbow rishta"    };
static String koreanSeries[] = {"train to busan" , "the roundup" , "allinoid" , "i saw the devil" , "midnight" , "gagnam zombie", "hotell del luna" , "island" , "your honor " , "melting me softly" , "cheer up" , "the forbidden marriage" , "the killing vote" , "my man is cupid", "W" , "death's game" , "marry my husband " , "the willing" , "tunnel" , "hunt" , "a taxi driver" , "true beauty", "oldboy" , "seoul station"};

public static void main(String newCollection[]){
	     				   
	System.out.println("The Available english Movies are : ");
	//for loop
	for (int index = 0;index <englishMovies.length ; index++ ){
		System.out.println(englishMovies[index]);
	}
	System.out.println("The Available english Movies are : ");
	//for each loop
	for(String englishMovies:englishMovies){
		System.out.println(englishMovies);
	}
	
	
	System.out.println("The Available kannada Movies are : ");
	//for loop
	for (int index = 0;index <kannadaMovies.length ; index++ ){
		System.out.println(kannadaMovies[index]);
	}
	System.out.println("The Available kannada Movies are : ");
	//for each loop
	for(String kannadaMovies:kannadaMovies){
		System.out.println(kannadaMovies);
	}
	
	
	System.out.println("The Available hindi movies Or series are : ");
	//for loop
	for (int index = 0;index <hindimoviesOrseries.length ; index++ ){
		System.out.println(hindimoviesOrseries[index]);
	}
	System.out.println("The Available hindi movies Or series are : ");
	//for each loop
	for(String hindimoviesOrseries:hindimoviesOrseries){
		System.out.println(hindimoviesOrseries);
	}
	
	
	System.out.println("The Available korean Series are : ");
	//for loop
	for (int index = 0;index <koreanSeries.length ; index++ ){
		System.out.println(koreanSeries[index]);
	}
	System.out.println("The Available korean Series are : ");
	//for each loop
	for(String koreanSeries:koreanSeries){
		System.out.println(koreanSeries);
	}
}
}